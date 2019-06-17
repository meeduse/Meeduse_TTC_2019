/**
 */
package meeduse_tt2bdd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bdd Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link meeduse_tt2bdd.BddOutput#getAssignments <em>Assignments</em>}</li>
 * </ul>
 *
 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getBddOutput()
 * @model
 * @generated
 */
public interface BddOutput extends BdP {
	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' reference list.
	 * The list contents are of type {@link meeduse_tt2bdd.Assignment}.
	 * It is bidirectional and its opposite is '{@link meeduse_tt2bdd.Assignment#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' reference list.
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getBddOutput_Assignments()
	 * @see meeduse_tt2bdd.Assignment#getPort
	 * @model opposite="port" ordered="false"
	 * @generated
	 */
	EList<Assignment> getAssignments();

} // BddOutput
