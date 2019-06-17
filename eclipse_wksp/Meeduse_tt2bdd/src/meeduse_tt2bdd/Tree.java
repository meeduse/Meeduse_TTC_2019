/**
 */
package meeduse_tt2bdd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link meeduse_tt2bdd.Tree#getOwnerBDD <em>Owner BDD</em>}</li>
 *   <li>{@link meeduse_tt2bdd.Tree#getOwnerSubtreeForZero <em>Owner Subtree For Zero</em>}</li>
 *   <li>{@link meeduse_tt2bdd.Tree#getOwnerSubtreeForOne <em>Owner Subtree For One</em>}</li>
 *   <li>{@link meeduse_tt2bdd.Tree#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getTree()
 * @model abstract="true"
 * @generated
 */
public interface Tree extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner BDD</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link meeduse_tt2bdd.BDD#getTree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner BDD</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner BDD</em>' container reference.
	 * @see #setOwnerBDD(BDD)
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getTree_OwnerBDD()
	 * @see meeduse_tt2bdd.BDD#getTree
	 * @model opposite="tree" transient="false" ordered="false"
	 * @generated
	 */
	BDD getOwnerBDD();

	/**
	 * Sets the value of the '{@link meeduse_tt2bdd.Tree#getOwnerBDD <em>Owner BDD</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner BDD</em>' container reference.
	 * @see #getOwnerBDD()
	 * @generated
	 */
	void setOwnerBDD(BDD value);

	/**
	 * Returns the value of the '<em><b>Owner Subtree For Zero</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link meeduse_tt2bdd.Subtree#getTreeForZero <em>Tree For Zero</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Subtree For Zero</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Subtree For Zero</em>' container reference.
	 * @see #setOwnerSubtreeForZero(Subtree)
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getTree_OwnerSubtreeForZero()
	 * @see meeduse_tt2bdd.Subtree#getTreeForZero
	 * @model opposite="treeForZero" transient="false" ordered="false"
	 * @generated
	 */
	Subtree getOwnerSubtreeForZero();

	/**
	 * Sets the value of the '{@link meeduse_tt2bdd.Tree#getOwnerSubtreeForZero <em>Owner Subtree For Zero</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Subtree For Zero</em>' container reference.
	 * @see #getOwnerSubtreeForZero()
	 * @generated
	 */
	void setOwnerSubtreeForZero(Subtree value);

	/**
	 * Returns the value of the '<em><b>Owner Subtree For One</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link meeduse_tt2bdd.Subtree#getTreeForOne <em>Tree For One</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Subtree For One</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Subtree For One</em>' container reference.
	 * @see #setOwnerSubtreeForOne(Subtree)
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getTree_OwnerSubtreeForOne()
	 * @see meeduse_tt2bdd.Subtree#getTreeForOne
	 * @model opposite="treeForOne" transient="false" ordered="false"
	 * @generated
	 */
	Subtree getOwnerSubtreeForOne();

	/**
	 * Sets the value of the '{@link meeduse_tt2bdd.Tree#getOwnerSubtreeForOne <em>Owner Subtree For One</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Subtree For One</em>' container reference.
	 * @see #getOwnerSubtreeForOne()
	 * @generated
	 */
	void setOwnerSubtreeForOne(Subtree value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see meeduse_tt2bdd.Meeduse_tt2bddPackage#getTree_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link meeduse_tt2bdd.Tree#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Tree
