/**
 */
package meeduse_tt2bdd.util;

import meeduse_tt2bdd.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage
 * @generated
 */
public class Meeduse_tt2bddAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Meeduse_tt2bddPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meeduse_tt2bddAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Meeduse_tt2bddPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Meeduse_tt2bddSwitch<Adapter> modelSwitch =
		new Meeduse_tt2bddSwitch<Adapter>() {
			@Override
			public Adapter caseInputPort(InputPort object) {
				return createInputPortAdapter();
			}
			@Override
			public Adapter caseCell(Cell object) {
				return createCellAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseRow(Row object) {
				return createRowAdapter();
			}
			@Override
			public Adapter caseOutputPort(OutputPort object) {
				return createOutputPortAdapter();
			}
			@Override
			public Adapter caseTruthTable(TruthTable object) {
				return createTruthTableAdapter();
			}
			@Override
			public Adapter caseSubtree(Subtree object) {
				return createSubtreeAdapter();
			}
			@Override
			public Adapter caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			@Override
			public Adapter caseBddOutput(BddOutput object) {
				return createBddOutputAdapter();
			}
			@Override
			public Adapter caseLeaf(Leaf object) {
				return createLeafAdapter();
			}
			@Override
			public Adapter caseTree(Tree object) {
				return createTreeAdapter();
			}
			@Override
			public Adapter caseBDD(BDD object) {
				return createBDDAdapter();
			}
			@Override
			public Adapter caseBdP(BdP object) {
				return createBdPAdapter();
			}
			@Override
			public Adapter caseBddInput(BddInput object) {
				return createBddInputAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link meeduse_tt2bdd.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see meeduse_tt2bdd.InputPort
	 * @generated
	 */
	public Adapter createInputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link meeduse_tt2bdd.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see meeduse_tt2bdd.Cell
	 * @generated
	 */
	public Adapter createCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link meeduse_tt2bdd.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see meeduse_tt2bdd.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link meeduse_tt2bdd.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see meeduse_tt2bdd.Row
	 * @generated
	 */
	public Adapter createRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link meeduse_tt2bdd.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see meeduse_tt2bdd.OutputPort
	 * @generated
	 */
	public Adapter createOutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link meeduse_tt2bdd.TruthTable <em>Truth Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see meeduse_tt2bdd.TruthTable
	 * @generated
	 */
	public Adapter createTruthTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link meeduse_tt2bdd.Subtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see meeduse_tt2bdd.Subtree
	 * @generated
	 */
	public Adapter createSubtreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link meeduse_tt2bdd.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see meeduse_tt2bdd.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link meeduse_tt2bdd.BddOutput <em>Bdd Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see meeduse_tt2bdd.BddOutput
	 * @generated
	 */
	public Adapter createBddOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link meeduse_tt2bdd.Leaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see meeduse_tt2bdd.Leaf
	 * @generated
	 */
	public Adapter createLeafAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link meeduse_tt2bdd.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see meeduse_tt2bdd.Tree
	 * @generated
	 */
	public Adapter createTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link meeduse_tt2bdd.BDD <em>BDD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see meeduse_tt2bdd.BDD
	 * @generated
	 */
	public Adapter createBDDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link meeduse_tt2bdd.BdP <em>Bd P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see meeduse_tt2bdd.BdP
	 * @generated
	 */
	public Adapter createBdPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link meeduse_tt2bdd.BddInput <em>Bdd Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see meeduse_tt2bdd.BddInput
	 * @generated
	 */
	public Adapter createBddInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link meeduse_tt2bdd.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see meeduse_tt2bdd.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Meeduse_tt2bddAdapterFactory
