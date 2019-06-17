/**
 */
package meeduse_tt2bdd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bdd Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link meeduse_tt2bdd.BddInput#getSubtrees <em>Subtrees</em>}</li>
 * </ul>
 *
 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getBddInput()
 * @model
 * @generated
 */
public interface BddInput extends BdP {
	/**
	 * Returns the value of the '<em><b>Subtrees</b></em>' reference list.
	 * The list contents are of type {@link meeduse_tt2bdd.Subtree}.
	 * It is bidirectional and its opposite is '{@link meeduse_tt2bdd.Subtree#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtrees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtrees</em>' reference list.
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getBddInput_Subtrees()
	 * @see meeduse_tt2bdd.Subtree#getPort
	 * @model opposite="port" ordered="false"
	 * @generated
	 */
	EList<Subtree> getSubtrees();

} // BddInput
