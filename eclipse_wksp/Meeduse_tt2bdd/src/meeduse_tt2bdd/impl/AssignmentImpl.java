/**
 */
package meeduse_tt2bdd.impl;

import meeduse_tt2bdd.Assignment;
import meeduse_tt2bdd.BddOutput;
import meeduse_tt2bdd.Leaf;
import meeduse_tt2bdd.Meeduse_tt2bddPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link meeduse_tt2bdd.impl.AssignmentImpl#isValue <em>Value</em>}</li>
 *   <li>{@link meeduse_tt2bdd.impl.AssignmentImpl#getPort <em>Port</em>}</li>
 *   <li>{@link meeduse_tt2bdd.impl.AssignmentImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends ElementImpl implements Assignment {
	/**
	 * The default value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected boolean value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected BddOutput port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Meeduse_tt2bddPackage.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(boolean newValue) {
		boolean oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Meeduse_tt2bddPackage.ASSIGNMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BddOutput getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject)port;
			port = (BddOutput)eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Meeduse_tt2bddPackage.ASSIGNMENT__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BddOutput basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort(BddOutput newPort, NotificationChain msgs) {
		BddOutput oldPort = port;
		port = newPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Meeduse_tt2bddPackage.ASSIGNMENT__PORT, oldPort, newPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(BddOutput newPort) {
		if (newPort != port) {
			NotificationChain msgs = null;
			if (port != null)
				msgs = ((InternalEObject)port).eInverseRemove(this, Meeduse_tt2bddPackage.BDD_OUTPUT__ASSIGNMENTS, BddOutput.class, msgs);
			if (newPort != null)
				msgs = ((InternalEObject)newPort).eInverseAdd(this, Meeduse_tt2bddPackage.BDD_OUTPUT__ASSIGNMENTS, BddOutput.class, msgs);
			msgs = basicSetPort(newPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Meeduse_tt2bddPackage.ASSIGNMENT__PORT, newPort, newPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leaf getOwner() {
		if (eContainerFeatureID() != Meeduse_tt2bddPackage.ASSIGNMENT__OWNER) return null;
		return (Leaf)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Leaf newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, Meeduse_tt2bddPackage.ASSIGNMENT__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Leaf newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != Meeduse_tt2bddPackage.ASSIGNMENT__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, Meeduse_tt2bddPackage.LEAF__ASSIGNMENTS, Leaf.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Meeduse_tt2bddPackage.ASSIGNMENT__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Meeduse_tt2bddPackage.ASSIGNMENT__PORT:
				if (port != null)
					msgs = ((InternalEObject)port).eInverseRemove(this, Meeduse_tt2bddPackage.BDD_OUTPUT__ASSIGNMENTS, BddOutput.class, msgs);
				return basicSetPort((BddOutput)otherEnd, msgs);
			case Meeduse_tt2bddPackage.ASSIGNMENT__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Leaf)otherEnd, msgs);
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
			case Meeduse_tt2bddPackage.ASSIGNMENT__PORT:
				return basicSetPort(null, msgs);
			case Meeduse_tt2bddPackage.ASSIGNMENT__OWNER:
				return basicSetOwner(null, msgs);
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
			case Meeduse_tt2bddPackage.ASSIGNMENT__OWNER:
				return eInternalContainer().eInverseRemove(this, Meeduse_tt2bddPackage.LEAF__ASSIGNMENTS, Leaf.class, msgs);
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
			case Meeduse_tt2bddPackage.ASSIGNMENT__VALUE:
				return isValue();
			case Meeduse_tt2bddPackage.ASSIGNMENT__PORT:
				if (resolve) return getPort();
				return basicGetPort();
			case Meeduse_tt2bddPackage.ASSIGNMENT__OWNER:
				return getOwner();
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
			case Meeduse_tt2bddPackage.ASSIGNMENT__VALUE:
				setValue((Boolean)newValue);
				return;
			case Meeduse_tt2bddPackage.ASSIGNMENT__PORT:
				setPort((BddOutput)newValue);
				return;
			case Meeduse_tt2bddPackage.ASSIGNMENT__OWNER:
				setOwner((Leaf)newValue);
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
			case Meeduse_tt2bddPackage.ASSIGNMENT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case Meeduse_tt2bddPackage.ASSIGNMENT__PORT:
				setPort((BddOutput)null);
				return;
			case Meeduse_tt2bddPackage.ASSIGNMENT__OWNER:
				setOwner((Leaf)null);
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
			case Meeduse_tt2bddPackage.ASSIGNMENT__VALUE:
				return value != VALUE_EDEFAULT;
			case Meeduse_tt2bddPackage.ASSIGNMENT__PORT:
				return port != null;
			case Meeduse_tt2bddPackage.ASSIGNMENT__OWNER:
				return getOwner() != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //AssignmentImpl
