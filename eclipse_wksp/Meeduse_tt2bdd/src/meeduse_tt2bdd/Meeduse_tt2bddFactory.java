/**
 */
package meeduse_tt2bdd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage
 * @generated
 */
public interface Meeduse_tt2bddFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Meeduse_tt2bddFactory eINSTANCE = meeduse_tt2bdd.impl.Meeduse_tt2bddFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Port</em>'.
	 * @generated
	 */
	InputPort createInputPort();

	/**
	 * Returns a new object of class '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cell</em>'.
	 * @generated
	 */
	Cell createCell();

	/**
	 * Returns a new object of class '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Row</em>'.
	 * @generated
	 */
	Row createRow();

	/**
	 * Returns a new object of class '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Port</em>'.
	 * @generated
	 */
	OutputPort createOutputPort();

	/**
	 * Returns a new object of class '<em>Truth Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Truth Table</em>'.
	 * @generated
	 */
	TruthTable createTruthTable();

	/**
	 * Returns a new object of class '<em>Subtree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtree</em>'.
	 * @generated
	 */
	Subtree createSubtree();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	Assignment createAssignment();

	/**
	 * Returns a new object of class '<em>Bdd Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bdd Output</em>'.
	 * @generated
	 */
	BddOutput createBddOutput();

	/**
	 * Returns a new object of class '<em>Leaf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaf</em>'.
	 * @generated
	 */
	Leaf createLeaf();

	/**
	 * Returns a new object of class '<em>BDD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BDD</em>'.
	 * @generated
	 */
	BDD createBDD();

	/**
	 * Returns a new object of class '<em>Bdd Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bdd Input</em>'.
	 * @generated
	 */
	BddInput createBddInput();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Meeduse_tt2bddPackage getMeeduse_tt2bddPackage();

} //Meeduse_tt2bddFactory
