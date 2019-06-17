/**
 */
package meeduse_tt2bdd.impl;

import meeduse_tt2bdd.BDD;
import meeduse_tt2bdd.Meeduse_tt2bddPackage;
import meeduse_tt2bdd.Subtree;
import meeduse_tt2bdd.Tree;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link meeduse_tt2bdd.impl.TreeImpl#getOwnerBDD <em>Owner BDD</em>}</li>
 *   <li>{@link meeduse_tt2bdd.impl.TreeImpl#getOwnerSubtreeForZero <em>Owner Subtree For Zero</em>}</li>
 *   <li>{@link meeduse_tt2bdd.impl.TreeImpl#getOwnerSubtreeForOne <em>Owner Subtree For One</em>}</li>
 *   <li>{@link meeduse_tt2bdd.impl.TreeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TreeImpl extends MinimalEObjectImpl.Container implements Tree {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Meeduse_tt2bddPackage.Literals.TREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDD getOwnerBDD() {
		if (eContainerFeatureID() != Meeduse_tt2bddPackage.TREE__OWNER_BDD) return null;
		return (BDD)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerBDD(BDD newOwnerBDD, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerBDD, Meeduse_tt2bddPackage.TREE__OWNER_BDD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerBDD(BDD newOwnerBDD) {
		if (newOwnerBDD != eInternalContainer() || (eContainerFeatureID() != Meeduse_tt2bddPackage.TREE__OWNER_BDD && newOwnerBDD != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerBDD))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerBDD != null)
				msgs = ((InternalEObject)newOwnerBDD).eInverseAdd(this, Meeduse_tt2bddPackage.BDD__TREE, BDD.class, msgs);
			msgs = basicSetOwnerBDD(newOwnerBDD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Meeduse_tt2bddPackage.TREE__OWNER_BDD, newOwnerBDD, newOwnerBDD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtree getOwnerSubtreeForZero() {
		if (eContainerFeatureID() != Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ZERO) return null;
		return (Subtree)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerSubtreeForZero(Subtree newOwnerSubtreeForZero, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerSubtreeForZero, Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ZERO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerSubtreeForZero(Subtree newOwnerSubtreeForZero) {
		if (newOwnerSubtreeForZero != eInternalContainer() || (eContainerFeatureID() != Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ZERO && newOwnerSubtreeForZero != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerSubtreeForZero))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerSubtreeForZero != null)
				msgs = ((InternalEObject)newOwnerSubtreeForZero).eInverseAdd(this, Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ZERO, Subtree.class, msgs);
			msgs = basicSetOwnerSubtreeForZero(newOwnerSubtreeForZero, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ZERO, newOwnerSubtreeForZero, newOwnerSubtreeForZero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtree getOwnerSubtreeForOne() {
		if (eContainerFeatureID() != Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ONE) return null;
		return (Subtree)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerSubtreeForOne(Subtree newOwnerSubtreeForOne, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerSubtreeForOne, Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ONE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerSubtreeForOne(Subtree newOwnerSubtreeForOne) {
		if (newOwnerSubtreeForOne != eInternalContainer() || (eContainerFeatureID() != Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ONE && newOwnerSubtreeForOne != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerSubtreeForOne))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerSubtreeForOne != null)
				msgs = ((InternalEObject)newOwnerSubtreeForOne).eInverseAdd(this, Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ONE, Subtree.class, msgs);
			msgs = basicSetOwnerSubtreeForOne(newOwnerSubtreeForOne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ONE, newOwnerSubtreeForOne, newOwnerSubtreeForOne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Meeduse_tt2bddPackage.TREE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Meeduse_tt2bddPackage.TREE__OWNER_BDD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerBDD((BDD)otherEnd, msgs);
			case Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ZERO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerSubtreeForZero((Subtree)otherEnd, msgs);
			case Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ONE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerSubtreeForOne((Subtree)otherEnd, msgs);
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
			case Meeduse_tt2bddPackage.TREE__OWNER_BDD:
				return basicSetOwnerBDD(null, msgs);
			case Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ZERO:
				return basicSetOwnerSubtreeForZero(null, msgs);
			case Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ONE:
				return basicSetOwnerSubtreeForOne(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Meeduse_tt2bddPackage.TREE__OWNER_BDD:
				return eInternalContainer().eInverseRemove(this, Meeduse_tt2bddPackage.BDD__TREE, BDD.class, msgs);
			case Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ZERO:
				return eInternalContainer().eInverseRemove(this, Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ZERO, Subtree.class, msgs);
			case Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ONE:
				return eInternalContainer().eInverseRemove(this, Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ONE, Subtree.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Meeduse_tt2bddPackage.TREE__OWNER_BDD:
				return getOwnerBDD();
			case Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ZERO:
				return getOwnerSubtreeForZero();
			case Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ONE:
				return getOwnerSubtreeForOne();
			case Meeduse_tt2bddPackage.TREE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Meeduse_tt2bddPackage.TREE__OWNER_BDD:
				setOwnerBDD((BDD)newValue);
				return;
			case Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ZERO:
				setOwnerSubtreeForZero((Subtree)newValue);
				return;
			case Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ONE:
				setOwnerSubtreeForOne((Subtree)newValue);
				return;
			case Meeduse_tt2bddPackage.TREE__NAME:
				setName((String)newValue);
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
			case Meeduse_tt2bddPackage.TREE__OWNER_BDD:
				setOwnerBDD((BDD)null);
				return;
			case Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ZERO:
				setOwnerSubtreeForZero((Subtree)null);
				return;
			case Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ONE:
				setOwnerSubtreeForOne((Subtree)null);
				return;
			case Meeduse_tt2bddPackage.TREE__NAME:
				setName(NAME_EDEFAULT);
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
			case Meeduse_tt2bddPackage.TREE__OWNER_BDD:
				return getOwnerBDD() != null;
			case Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ZERO:
				return getOwnerSubtreeForZero() != null;
			case Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ONE:
				return getOwnerSubtreeForOne() != null;
			case Meeduse_tt2bddPackage.TREE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TreeImpl
