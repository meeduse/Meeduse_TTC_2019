/**
 */
package meeduse_tt2bdd.util;

import meeduse_tt2bdd.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage
 * @generated
 */
public class Meeduse_tt2bddSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Meeduse_tt2bddPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meeduse_tt2bddSwitch() {
		if (modelPackage == null) {
			modelPackage = Meeduse_tt2bddPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Meeduse_tt2bddPackage.INPUT_PORT: {
				InputPort inputPort = (InputPort)theEObject;
				T result = caseInputPort(inputPort);
				if (result == null) result = casePort(inputPort);
				if (result == null) result = caseElement(inputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Meeduse_tt2bddPackage.CELL: {
				Cell cell = (Cell)theEObject;
				T result = caseCell(cell);
				if (result == null) result = caseElement(cell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Meeduse_tt2bddPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseElement(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Meeduse_tt2bddPackage.ROW: {
				Row row = (Row)theEObject;
				T result = caseRow(row);
				if (result == null) result = caseElement(row);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Meeduse_tt2bddPackage.OUTPUT_PORT: {
				OutputPort outputPort = (OutputPort)theEObject;
				T result = caseOutputPort(outputPort);
				if (result == null) result = casePort(outputPort);
				if (result == null) result = caseElement(outputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Meeduse_tt2bddPackage.TRUTH_TABLE: {
				TruthTable truthTable = (TruthTable)theEObject;
				T result = caseTruthTable(truthTable);
				if (result == null) result = caseElement(truthTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Meeduse_tt2bddPackage.SUBTREE: {
				Subtree subtree = (Subtree)theEObject;
				T result = caseSubtree(subtree);
				if (result == null) result = caseTree(subtree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Meeduse_tt2bddPackage.ASSIGNMENT: {
				Assignment assignment = (Assignment)theEObject;
				T result = caseAssignment(assignment);
				if (result == null) result = caseElement(assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Meeduse_tt2bddPackage.BDD_OUTPUT: {
				BddOutput bddOutput = (BddOutput)theEObject;
				T result = caseBddOutput(bddOutput);
				if (result == null) result = caseBdP(bddOutput);
				if (result == null) result = caseElement(bddOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Meeduse_tt2bddPackage.LEAF: {
				Leaf leaf = (Leaf)theEObject;
				T result = caseLeaf(leaf);
				if (result == null) result = caseTree(leaf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Meeduse_tt2bddPackage.TREE: {
				Tree tree = (Tree)theEObject;
				T result = caseTree(tree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Meeduse_tt2bddPackage.BDD: {
				BDD bdd = (BDD)theEObject;
				T result = caseBDD(bdd);
				if (result == null) result = caseElement(bdd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Meeduse_tt2bddPackage.BD_P: {
				BdP bdP = (BdP)theEObject;
				T result = caseBdP(bdP);
				if (result == null) result = caseElement(bdP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Meeduse_tt2bddPackage.BDD_INPUT: {
				BddInput bddInput = (BddInput)theEObject;
				T result = caseBddInput(bddInput);
				if (result == null) result = caseBdP(bddInput);
				if (result == null) result = caseElement(bddInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Meeduse_tt2bddPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPort(InputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCell(Cell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRow(Row object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPort(OutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Truth Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Truth Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTruthTable(TruthTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtree(Subtree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bdd Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bdd Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBddOutput(BddOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeaf(Leaf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTree(Tree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BDD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BDD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBDD(BDD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bd P</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bd P</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBdP(BdP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bdd Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bdd Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBddInput(BddInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Meeduse_tt2bddSwitch
