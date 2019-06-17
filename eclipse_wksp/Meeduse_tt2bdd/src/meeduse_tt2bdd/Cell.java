/**
 */
package meeduse_tt2bdd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link meeduse_tt2bdd.Cell#isValue <em>Value</em>}</li>
 *   <li>{@link meeduse_tt2bdd.Cell#getOwner <em>Owner</em>}</li>
 *   <li>{@link meeduse_tt2bdd.Cell#getPort <em>Port</em>}</li>
 *   <li>{@link meeduse_tt2bdd.Cell#isDone <em>Done</em>}</li>
 *   <li>{@link meeduse_tt2bdd.Cell#isSelected <em>Selected</em>}</li>
 * </ul>
 *
 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getCell()
 * @model
 * @generated
 */
public interface Cell extends Element {
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
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getCell_Value()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link meeduse_tt2bdd.Cell#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link meeduse_tt2bdd.Row#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Row)
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getCell_Owner()
	 * @see meeduse_tt2bdd.Row#getCells
	 * @model opposite="cells" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Row getOwner();

	/**
	 * Sets the value of the '{@link meeduse_tt2bdd.Cell#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Row value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link meeduse_tt2bdd.Port#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getCell_Port()
	 * @see meeduse_tt2bdd.Port#getCells
	 * @model opposite="cells" required="true" ordered="false"
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link meeduse_tt2bdd.Cell#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	/**
	 * Returns the value of the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Done</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Done</em>' attribute.
	 * @see #setDone(boolean)
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getCell_Done()
	 * @model
	 * @generated
	 */
	boolean isDone();

	/**
	 * Sets the value of the '{@link meeduse_tt2bdd.Cell#isDone <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Done</em>' attribute.
	 * @see #isDone()
	 * @generated
	 */
	void setDone(boolean value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getCell_Selected()
	 * @model
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link meeduse_tt2bdd.Cell#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

} // Cell
