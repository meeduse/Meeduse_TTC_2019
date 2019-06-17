/**
 */
package meeduse_tt2bdd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link meeduse_tt2bdd.Row#getOwner <em>Owner</em>}</li>
 *   <li>{@link meeduse_tt2bdd.Row#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getRow()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='MomentInterval'"
 * @generated
 */
public interface Row extends Element {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link meeduse_tt2bdd.TruthTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(TruthTable)
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getRow_Owner()
	 * @see meeduse_tt2bdd.TruthTable#getRows
	 * @model opposite="rows" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TruthTable getOwner();

	/**
	 * Sets the value of the '{@link meeduse_tt2bdd.Row#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(TruthTable value);

	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link meeduse_tt2bdd.Cell}.
	 * It is bidirectional and its opposite is '{@link meeduse_tt2bdd.Cell#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getRow_Cells()
	 * @see meeduse_tt2bdd.Cell#getOwner
	 * @model opposite="owner" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Cell> getCells();

} // Row
