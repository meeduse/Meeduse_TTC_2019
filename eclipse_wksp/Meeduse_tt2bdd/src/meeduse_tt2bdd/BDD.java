/**
 */
package meeduse_tt2bdd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BDD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link meeduse_tt2bdd.BDD#getPorts <em>Ports</em>}</li>
 *   <li>{@link meeduse_tt2bdd.BDD#getTree <em>Tree</em>}</li>
 * </ul>
 *
 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getBDD()
 * @model
 * @generated
 */
public interface BDD extends Element {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link meeduse_tt2bdd.BdP}.
	 * It is bidirectional and its opposite is '{@link meeduse_tt2bdd.BdP#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getBDD_Ports()
	 * @see meeduse_tt2bdd.BdP#getOwner
	 * @model opposite="owner" containment="true" ordered="false"
	 * @generated
	 */
	EList<BdP> getPorts();

	/**
	 * Returns the value of the '<em><b>Tree</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link meeduse_tt2bdd.Tree#getOwnerBDD <em>Owner BDD</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree</em>' containment reference.
	 * @see #setTree(Tree)
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getBDD_Tree()
	 * @see meeduse_tt2bdd.Tree#getOwnerBDD
	 * @model opposite="ownerBDD" containment="true" ordered="false"
	 * @generated
	 */
	Tree getTree();

	/**
	 * Sets the value of the '{@link meeduse_tt2bdd.BDD#getTree <em>Tree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree</em>' containment reference.
	 * @see #getTree()
	 * @generated
	 */
	void setTree(Tree value);

} // BDD
