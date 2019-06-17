/**
 */
package meeduse_tt2bdd.impl;

import java.util.Collection;

import meeduse_tt2bdd.BDD;
import meeduse_tt2bdd.BdP;
import meeduse_tt2bdd.Meeduse_tt2bddPackage;
import meeduse_tt2bdd.Tree;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BDD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link meeduse_tt2bdd.impl.BDDImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link meeduse_tt2bdd.impl.BDDImpl#getTree <em>Tree</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BDDImpl extends ElementImpl implements BDD {
	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<BdP> ports;

	/**
	 * The cached value of the '{@link #getTree() <em>Tree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTree()
	 * @generated
	 * @ordered
	 */
	protected Tree tree;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BDDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Meeduse_tt2bddPackage.Literals.BDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BdP> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentWithInverseEList<BdP>(BdP.class, this, Meeduse_tt2bddPackage.BDD__PORTS, Meeduse_tt2bddPackage.BD_P__OWNER);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tree getTree() {
		return tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTree(Tree newTree, NotificationChain msgs) {
		Tree oldTree = tree;
		tree = newTree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Meeduse_tt2bddPackage.BDD__TREE, oldTree, newTree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTree(Tree newTree) {
		if (newTree != tree) {
			NotificationChain msgs = null;
			if (tree != null)
				msgs = ((InternalEObject)tree).eInverseRemove(this, Meeduse_tt2bddPackage.TREE__OWNER_BDD, Tree.class, msgs);
			if (newTree != null)
				msgs = ((InternalEObject)newTree).eInverseAdd(this, Meeduse_tt2bddPackage.TREE__OWNER_BDD, Tree.class, msgs);
			msgs = basicSetTree(newTree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Meeduse_tt2bddPackage.BDD__TREE, newTree, newTree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Meeduse_tt2bddPackage.BDD__PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPorts()).basicAdd(otherEnd, msgs);
			case Meeduse_tt2bddPackage.BDD__TREE:
				if (tree != null)
					msgs = ((InternalEObject)tree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Meeduse_tt2bddPackage.BDD__TREE, null, msgs);
				return basicSetTree((Tree)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Meeduse_tt2bddPackage.BDD__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case Meeduse_tt2bddPackage.BDD__TREE:
				return basicSetTree(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Meeduse_tt2bddPackage.BDD__PORTS:
				return getPorts();
			case Meeduse_tt2bddPackage.BDD__TREE:
				return getTree();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Meeduse_tt2bddPackage.BDD__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends BdP>)newValue);
				return;
			case Meeduse_tt2bddPackage.BDD__TREE:
				setTree((Tree)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Meeduse_tt2bddPackage.BDD__PORTS:
				getPorts().clear();
				return;
			case Meeduse_tt2bddPackage.BDD__TREE:
				setTree((Tree)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Meeduse_tt2bddPackage.BDD__PORTS:
				return ports != null && !ports.isEmpty();
			case Meeduse_tt2bddPackage.BDD__TREE:
				return tree != null;
		}
		return super.eIsSet(featureID);
	}

} //BDDImpl
