/**
 */
package meeduse_tt2bdd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link meeduse_tt2bdd.Port#getOwner <em>Owner</em>}</li>
 *   <li>{@link meeduse_tt2bdd.Port#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends Element {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link meeduse_tt2bdd.TruthTable#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(TruthTable)
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getPort_Owner()
	 * @see meeduse_tt2bdd.TruthTable#getPorts
	 * @model opposite="ports" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TruthTable getOwner();

	/**
	 * Sets the value of the '{@link meeduse_tt2bdd.Port#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(TruthTable value);

	/**
	 * Returns the value of the '<em><b>Cells</b></em>' reference list.
	 * The list contents are of type {@link meeduse_tt2bdd.Cell}.
	 * It is bidirectional and its opposite is '{@link meeduse_tt2bdd.Cell#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' reference list.
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getPort_Cells()
	 * @see meeduse_tt2bdd.Cell#getPort
	 * @model opposite="port" ordered="false"
	 * @generated
	 */
	EList<Cell> getCells();

} // Port
