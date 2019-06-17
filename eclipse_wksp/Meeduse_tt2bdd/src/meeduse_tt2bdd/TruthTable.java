/**
 */
package meeduse_tt2bdd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Truth Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link meeduse_tt2bdd.TruthTable#getPorts <em>Ports</em>}</li>
 *   <li>{@link meeduse_tt2bdd.TruthTable#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getTruthTable()
 * @model
 * @generated
 */
public interface TruthTable extends Element {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link meeduse_tt2bdd.Port}.
	 * It is bidirectional and its opposite is '{@link meeduse_tt2bdd.Port#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getTruthTable_Ports()
	 * @see meeduse_tt2bdd.Port#getOwner
	 * @model opposite="owner" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link meeduse_tt2bdd.Row}.
	 * It is bidirectional and its opposite is '{@link meeduse_tt2bdd.Row#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getTruthTable_Rows()
	 * @see meeduse_tt2bdd.Row#getOwner
	 * @model opposite="owner" containment="true" lower="2" ordered="false"
	 * @generated
	 */
	EList<Row> getRows();

} // TruthTable
