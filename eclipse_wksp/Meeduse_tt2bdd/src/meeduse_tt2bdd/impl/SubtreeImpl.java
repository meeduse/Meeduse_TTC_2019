/**
 */
package meeduse_tt2bdd.impl;

import meeduse_tt2bdd.BddInput;
import meeduse_tt2bdd.Meeduse_tt2bddPackage;
import meeduse_tt2bdd.Subtree;
import meeduse_tt2bdd.Tree;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link meeduse_tt2bdd.impl.SubtreeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link meeduse_tt2bdd.impl.SubtreeImpl#getTreeForZero <em>Tree For Zero</em>}</li>
 *   <li>{@link meeduse_tt2bdd.impl.SubtreeImpl#getTreeForOne <em>Tree For One</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubtreeImpl extends TreeImpl implements Subtree {
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected BddInput port;

	/**
	 * The cached value of the '{@link #getTreeForZero() <em>Tree For Zero</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeForZero()
	 * @generated
	 * @ordered
	 */
	protected Tree treeForZero;

	/**
	 * The cached value of the '{@link #getTreeForOne() <em>Tree For One</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeForOne()
	 * @generated
	 * @ordered
	 */
	protected Tree treeForOne;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubtreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Meeduse_tt2bddPackage.Literals.SUBTREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BddInput getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject)port;
			port = (BddInput)eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Meeduse_tt2bddPackage.SUBTREE__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BddInput basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort(BddInput newPort, NotificationChain msgs) {
		BddInput oldPort = port;
		port = newPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Meeduse_tt2bddPackage.SUBTREE__PORT, oldPort, newPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(BddInput newPort) {
		if (newPort != port) {
			NotificationChain msgs = null;
			if (port != null)
				msgs = ((InternalEObject)port).eInverseRemove(this, Meeduse_tt2bddPackage.BDD_INPUT__SUBTREES, BddInput.class, msgs);
			if (newPort != null)
				msgs = ((InternalEObject)newPort).eInverseAdd(this, Meeduse_tt2bddPackage.BDD_INPUT__SUBTREES, BddInput.class, msgs);
			msgs = basicSetPort(newPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Meeduse_tt2bddPackage.SUBTREE__PORT, newPort, newPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tree getTreeForZero() {
		return treeForZero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTreeForZero(Tree newTreeForZero, NotificationChain msgs) {
		Tree oldTreeForZero = treeForZero;
		treeForZero = newTreeForZero;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ZERO, oldTreeForZero, newTreeForZero);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreeForZero(Tree newTreeForZero) {
		if (newTreeForZero != treeForZero) {
			NotificationChain msgs = null;
			if (treeForZero != null)
				msgs = ((InternalEObject)treeForZero).eInverseRemove(this, Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ZERO, Tree.class, msgs);
			if (newTreeForZero != null)
				msgs = ((InternalEObject)newTreeForZero).eInverseAdd(this, Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ZERO, Tree.class, msgs);
			msgs = basicSetTreeForZero(newTreeForZero, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ZERO, newTreeForZero, newTreeForZero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tree getTreeForOne() {
		return treeForOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTreeForOne(Tree newTreeForOne, NotificationChain msgs) {
		Tree oldTreeForOne = treeForOne;
		treeForOne = newTreeForOne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ONE, oldTreeForOne, newTreeForOne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreeForOne(Tree newTreeForOne) {
		if (newTreeForOne != treeForOne) {
			NotificationChain msgs = null;
			if (treeForOne != null)
				msgs = ((InternalEObject)treeForOne).eInverseRemove(this, Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ONE, Tree.class, msgs);
			if (newTreeForOne != null)
				msgs = ((InternalEObject)newTreeForOne).eInverseAdd(this, Meeduse_tt2bddPackage.TREE__OWNER_SUBTREE_FOR_ONE, Tree.class, msgs);
			msgs = basicSetTreeForOne(newTreeForOne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ONE, newTreeForOne, newTreeForOne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Meeduse_tt2bddPackage.SUBTREE__PORT:
				if (port != null)
					msgs = ((InternalEObject)port).eInverseRemove(this, Meeduse_tt2bddPackage.BDD_INPUT__SUBTREES, BddInput.class, msgs);
				return basicSetPort((BddInput)otherEnd, msgs);
			case Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ZERO:
				if (treeForZero != null)
					msgs = ((InternalEObject)treeForZero).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ZERO, null, msgs);
				return basicSetTreeForZero((Tree)otherEnd, msgs);
			case Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ONE:
				if (treeForOne != null)
					msgs = ((InternalEObject)treeForOne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ONE, null, msgs);
				return basicSetTreeForOne((Tree)otherEnd, msgs);
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
			case Meeduse_tt2bddPackage.SUBTREE__PORT:
				return basicSetPort(null, msgs);
			case Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ZERO:
				return basicSetTreeForZero(null, msgs);
			case Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ONE:
				return basicSetTreeForOne(null, msgs);
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
			case Meeduse_tt2bddPackage.SUBTREE__PORT:
				if (resolve) return getPort();
				return basicGetPort();
			case Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ZERO:
				return getTreeForZero();
			case Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ONE:
				return getTreeForOne();
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
			case Meeduse_tt2bddPackage.SUBTREE__PORT:
				setPort((BddInput)newValue);
				return;
			case Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ZERO:
				setTreeForZero((Tree)newValue);
				return;
			case Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ONE:
				setTreeForOne((Tree)newValue);
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
			case Meeduse_tt2bddPackage.SUBTREE__PORT:
				setPort((BddInput)null);
				return;
			case Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ZERO:
				setTreeForZero((Tree)null);
				return;
			case Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ONE:
				setTreeForOne((Tree)null);
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
			case Meeduse_tt2bddPackage.SUBTREE__PORT:
				return port != null;
			case Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ZERO:
				return treeForZero != null;
			case Meeduse_tt2bddPackage.SUBTREE__TREE_FOR_ONE:
				return treeForOne != null;
		}
		return super.eIsSet(featureID);
	}

} //SubtreeImpl
