/**
 */
package meeduse_tt2bdd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bd P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link meeduse_tt2bdd.BdP#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getBdP()
 * @model abstract="true"
 * @generated
 */
public interface BdP extends Element {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link meeduse_tt2bdd.BDD#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(BDD)
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getBdP_Owner()
	 * @see meeduse_tt2bdd.BDD#getPorts
	 * @model opposite="ports" transient="false" ordered="false"
	 * @generated
	 */
	BDD getOwner();

	/**
	 * Sets the value of the '{@link meeduse_tt2bdd.BdP#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(BDD value);

} // BdP
