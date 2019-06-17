/**
 */
package meeduse_tt2bdd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link meeduse_tt2bdd.Assignment#isValue <em>Value</em>}</li>
 *   <li>{@link meeduse_tt2bdd.Assignment#getPort <em>Port</em>}</li>
 *   <li>{@link meeduse_tt2bdd.Assignment#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getAssignment_Value()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link meeduse_tt2bdd.Assignment#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link meeduse_tt2bdd.BddOutput#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(BddOutput)
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getAssignment_Port()
	 * @see meeduse_tt2bdd.BddOutput#getAssignments
	 * @model opposite="assignments" required="true" ordered="false"
	 * @generated
	 */
	BddOutput getPort();

	/**
	 * Sets the value of the '{@link meeduse_tt2bdd.Assignment#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(BddOutput value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link meeduse_tt2bdd.Leaf#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Leaf)
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getAssignment_Owner()
	 * @see meeduse_tt2bdd.Leaf#getAssignments
	 * @model opposite="assignments" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Leaf getOwner();

	/**
	 * Sets the value of the '{@link meeduse_tt2bdd.Assignment#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Leaf value);

} // Assignment
