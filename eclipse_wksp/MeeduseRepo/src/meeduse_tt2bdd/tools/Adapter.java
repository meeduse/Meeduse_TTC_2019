package meeduse_tt2bdd.tools;

import java.io.File;
import java.io.IOException;

import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import meeduse.Translator;
import meeduse_tt2bdd.Meeduse_tt2bddPackage;
import ttc2019.metamodels.bdd.BDDPackage;
import ttc2019.metamodels.tt.TTPackage;

public abstract class Adapter {
	
	public static class TTImporter extends Translator<TTPackage, Meeduse_tt2bddPackage> {


		public TTImporter() {
			super(TTPackage.eINSTANCE, Meeduse_tt2bddPackage.eINSTANCE,mappings());
		}


		protected void init(ResourceSet resources) {
			resources.getPackageRegistry().put(TTPackage.eINSTANCE.getNsURI(), TTPackage.eINSTANCE);
			resources.getPackageRegistry().put(Meeduse_tt2bddPackage.eINSTANCE.getNsURI(), Meeduse_tt2bddPackage.eINSTANCE);
			
			resources.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ttmodel", new XMIResourceFactoryImpl());
			resources.getResourceFactoryRegistry().getExtensionToFactoryMap().put("meeduse_tt2bdd", new XMIResourceFactoryImpl());
		}

		@Override
		protected void translate(Resource source, Resource target) {
			super.translate(source, target);
			fixNames(target);
		}

		private static void fixNames(Resource target) {
			for (EObject content : target.getContents()) {
				fixNames(content,new LinkedList<>());
			}
		}

		private static void fixNames(EObject target, Deque<Integer> id) {
			
			EAttribute nameAttribute = (EAttribute) target.eClass().getEStructuralFeature("name");
			if (! target.eIsSet(nameAttribute)) {
				target.eSet(nameAttribute, name(target,newName(id)));
			}
			
			startNamespace(id);
			for (EObject child : target.eContents()) {
				fixNames(child,id);
			}
			endNamespace(id);
		}
		
		private static String name(EObject object, Deque<Integer> id) {
			StringBuilder name = new StringBuilder();
			
			name.append(object.eClass().getName().toLowerCase().charAt(0));
			
			for (Iterator<Integer> segments = id.descendingIterator(); segments.hasNext();) {
				name.append("_");
				name.append(segments.next());
			}

			return name.toString();
		}
		
		private static Deque<Integer> startNamespace(Deque<Integer> id) {
			id.push(0);
			return id;
		}

		private static Deque<Integer> newName(Deque<Integer> id) {
			id.push(id.isEmpty() ? 1 : id.pop()+1);
			return id;
		}

		private static Deque<Integer> endNamespace(Deque<Integer> id) {
			id.pop();
			return id;
		}

		public static void main(String[] args) throws IOException {
			
			URI ttURI 		= URI.createFileURI(new File(args[0]).getAbsolutePath()); 
			URI meeduseURI 	= URI.createFileURI(new File(args[1]).getAbsolutePath());
			
			new TTImporter().translate(ttURI, meeduseURI);
		}

		public static class Command extends Handler {

			@Override
			public Object execute(ExecutionEvent event) throws ExecutionException {
				this.event = event;
				
				IFile selection = getSelection(IFile.class,true);
				
				URI ttURI 		= URI.createPlatformResourceURI(selection.getFullPath().toString(),true); 
				URI meeduseURI 	= ttURI.trimFileExtension().appendFileExtension("meeduse_tt2bdd");
				
				try {
					new TTImporter().translate(ttURI, meeduseURI);
				} catch (Throwable error) {
					MessageDialog.openError(null, "Error in TT model transformation", error.getLocalizedMessage());
				}
				

				return null;
			}
			
		}

		
	}
	
	public static class BDDExporter extends Translator<Meeduse_tt2bddPackage,BDDPackage> {


		public BDDExporter() {
			super(Meeduse_tt2bddPackage.eINSTANCE, BDDPackage.eINSTANCE, mappings(
				map("BdP","Port"),
				map("BddInput","InputPort"),
				map("BddOutput","OutputPort")
			));
		}

		protected void init(ResourceSet resources) {

			resources.getPackageRegistry().put(BDDPackage.eINSTANCE.getNsURI(), BDDPackage.eINSTANCE);
			resources.getPackageRegistry().put(Meeduse_tt2bddPackage.eINSTANCE.getNsURI(), Meeduse_tt2bddPackage.eINSTANCE);
			
			resources.getResourceFactoryRegistry().getExtensionToFactoryMap().put("	", new XMIResourceFactoryImpl());
			resources.getResourceFactoryRegistry().getExtensionToFactoryMap().put("bddmodel", new XMIResourceFactoryImpl());
		}

		public static void main(String[] args) throws IOException {
			
			URI meeduseURI 	= URI.createFileURI(new File(args[0]).getAbsolutePath());
			URI bddURI 		= URI.createFileURI(new File(args[1]).getAbsolutePath()); 
			
			new BDDExporter().translate(meeduseURI,bddURI);

		}

		public static class Command extends Handler {

			@Override
			public Object execute(ExecutionEvent event) throws ExecutionException {
				this.event = event;
				
				IFile selection = getSelection(IFile.class,true);
				
				URI meeduseURI	= URI.createPlatformResourceURI(selection.getFullPath().toString(),true); 
				URI bddURI 		= meeduseURI.trimFileExtension().appendFileExtension("bddmodel");
				
				try {
					new BDDExporter().translate(meeduseURI,bddURI);
				} catch (Throwable error) {
					MessageDialog.openError(null, "Error in BDD model transformation", error.getLocalizedMessage());
				}
				

				return null;
			}
			
		}

	}

	public abstract static class Handler extends AbstractHandler {

		protected ExecutionEvent event;
		
		protected ISelection getSelection() {
			return HandlerUtil.getCurrentSelection(event);
		}

		/**
		 * Get a single selected object that can be adapted to the specified class.
		 * 
		 * if several objects are selected and <code>any</code> is specified an arbitrary one
		 * will be returned, otherwise <code>null</code> is returned. 
		 * 
		 */
		protected <S> S getSelection(Class<S> clazz, boolean any) {
			
			ISelection selection = getSelection();
			if (selection == null || selection.isEmpty() || !(selection instanceof IStructuredSelection))
				return null;
			
			S adaptedSelection = null;
			
			for (Object selected : ((IStructuredSelection) selection).toList()) {
				
				S adpated = adapt(selected,clazz);

				if (adpated == null) {
					continue;
				}
				
				if (any)
					return adpated;
				
				if (adaptedSelection != null)
					return null;

				adaptedSelection = adpated;
				
			}

			return adaptedSelection;
		}
		
		protected static <T> T adapt(Object object, Class<T> clazz) {

			T adapted = Platform.getAdapterManager().getAdapter(object,clazz);

			if (adapted == null && object instanceof IAdaptable) {
				adapted = ((IAdaptable) object).getAdapter(clazz);
			}

			return adapted;
		}

	}

	private static <K,V> Tuple<K, V> map(K key, V value) {
		return new Tuple<>(key,value);
	}

	@SafeVarargs
	private static <K,V> Map<K,V> mappings(Tuple<K,V>... tuples) {
		Map<K,V> mappings = new HashMap<K, V>();
		for (Tuple<K, V> tuple : tuples) {
			mappings.put(tuple.key, tuple.value);
		}
		return mappings;
	}

	private static class Tuple <K,V> {

		public final K key;
		public final V value;
		
		public Tuple(K key, V value) {
			this.key 	= key;
			this.value 	= value;
		}
	}

}
