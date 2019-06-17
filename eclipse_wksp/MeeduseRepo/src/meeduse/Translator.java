package meeduse;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public abstract class Translator<S extends EPackage, T extends EPackage> {

	protected final S sourcePackage;
	protected final T targetPackage;
	protected final Map<String,String> mappings;

	public Translator(S sourcePackage, T targetPackage, Map<String,String> mappings) {
		this.sourcePackage 	= sourcePackage;
		this.targetPackage	= targetPackage;
		this.mappings		= mappings;
	}

	protected EClassifier map(EClassifier source) {
		EClassifier target = targetPackage.getEClassifier(source.getName());
		
		if (target == null && mappings.get(source.getName()) != null) {
			target = targetPackage.getEClassifier( mappings.get(source.getName()));
			
		}
		
		return target;
	}

	private Object map(EDataType sourceType, EDataType targetType, Object value) {
		
		if (sourceType.equals(targetType)) {
			return value;
		}
		
		String serialization = EcoreUtil.convertToString(sourceType, value);
		return EcoreUtil.createFromString(targetType, serialization);
		
	}

	protected void map(EObject source, EObject target, EAttribute attribute) {
		EAttribute targetAttribute = (EAttribute) target.eClass().getEStructuralFeature(attribute.getName());
		if (targetAttribute != null && source.eIsSet(attribute)) {
			target.eSet(targetAttribute, map(attribute.getEAttributeType(), targetAttribute.getEAttributeType(), source.eGet(attribute)));
		}
	}
	
	protected void map(EObject source, EObject target, EReference reference, Function<EObject,EObject> mapping) {

		if (source.eGet(reference) == null) {
			return;
		}

		EReference targetReference = (EReference) target.eClass().getEStructuralFeature(reference.getName());
		
		if (!reference.isMany()) {
			target.eSet(targetReference, mapping.apply((EObject)source.eGet(reference)));
		}
		else {
			@SuppressWarnings("unchecked") List<? extends EObject> sourceReferenced  	= (EList<? extends EObject>) source.eGet(reference);
			@SuppressWarnings("unchecked") List<? super EObject> targetReferenced 		= (EList<? super EObject>) target.eGet(targetReference);
			
			for (EObject referenced : sourceReferenced) {
				targetReferenced.add(mapping.apply(referenced));
			}
		}

	}

	protected EObject map(EObject source) {
		
		EClassifier targetClass = map(source.eClass());
		EObject		target		= targetPackage.getEFactoryInstance().create((EClass)targetClass);
		
		source.eAdapters().add(new Mapping(target));

		for (EAttribute	attribute : source.eClass().getEAllAttributes()) {
			map(source,target,attribute);
		}

		for (EReference containment : source.eClass().getEAllContainments()) {
			map(source,target,containment,this::map);
		}

		return target;
	}

	protected EObject mapping(EObject source) {
		return ((Mapping) EcoreUtil.getRegisteredAdapter(source, Mapping.class)).to();
	}

	protected void link(EObject source) {
		
		EObject	target = mapping(source);
		
		for (EReference reference : source.eClass().getEAllReferences()) {
			
			if (reference.isContainment()) {
				continue;
			}

			map(source,target,reference,this::mapping);
		}
		
		for (EObject child : source.eContents()) {
			link(child);
		}
	}

	protected void clear(EObject source) {
		
		Mapping mapping = ((Mapping) EcoreUtil.getRegisteredAdapter(source, Mapping.class));
		source.eAdapters().remove(mapping);
		
		for (EObject child : source.eContents()) {
			clear(child);
		}
	}

	protected EObject translate(EObject source) {
		
		EObject target = map(source);

		link(source);
		clear(source);
		
		return target;
	}
	
	protected void translate(Resource source, Resource target) {
		for (EObject content : source.getContents()) {

			EClassifier sourceClass = content.eClass();
			EClassifier targetClass = map(sourceClass);
			
			if (sourceClass.getEPackage().equals(sourcePackage) && targetClass != null) {
				target.getContents().add(translate(content));
			}
		}
	}

	protected abstract void init(ResourceSet resources);

	protected void translate(URI sourceURI, URI targetURI) throws IOException {
		
		ResourceSet resources = new ResourceSetImpl();
		init(resources);
		
		Resource source = resources.getResource(sourceURI,true);
		Resource target	= resources.createResource(targetURI);
		
		translate(source, target);

		target.save(null);
		
		source.unload();
		target.unload();
		
	}


	private static class Mapping extends AdapterImpl {

		private final EObject mapping;
		
		public Mapping(EObject mapping) {
			this.mapping = mapping;
		}
		
		public EObject to() {
			return mapping;
		}
		
		@Override
		public boolean isAdapterForType(Object type) {
			return type == Mapping.class;
		}
		
	}


}
