/**
 */
package meeduse_tt2bdd.impl;

import java.util.Collection;

import meeduse_tt2bdd.Cell;
import meeduse_tt2bdd.Meeduse_tt2bddPackage;
import meeduse_tt2bdd.Port;
import meeduse_tt2bdd.TruthTable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link meeduse_tt2bdd.impl.PortImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link meeduse_tt2bdd.impl.PortImpl#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PortImpl extends ElementImpl implements Port {
	/**
	 * The cached value of the '{@link #getCells() <em>Cells</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCells()
	 * @generated
	 * @ordered
	 */
	protected EList<Cell> cells;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Meeduse_tt2bddPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TruthTable getOwner() {
		if (eContainerFeatureID() != Meeduse_tt2bddPackage.PORT__OWNER) return null;
		return (TruthTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(TruthTable newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, Meeduse_tt2bddPackage.PORT__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(TruthTable newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != Meeduse_tt2bddPackage.PORT__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, Meeduse_tt2bddPackage.TRUTH_TABLE__PORTS, TruthTable.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Meeduse_tt2bddPackage.PORT__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cell> getCells() {
		if (cells == null) {
			cells = new EObjectWithInverseResolvingEList<Cell>(Cell.class, this, Meeduse_tt2bddPackage.PORT__CELLS, Meeduse_tt2bddPackage.CELL__PORT);
		}
		return cells;
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
			case Meeduse_tt2bddPackage.PORT__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((TruthTable)otherEnd, msgs);
			case Meeduse_tt2bddPackage.PORT__CELLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCells()).basicAdd(otherEnd, msgs);
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
			case Meeduse_tt2bddPackage.PORT__OWNER:
				return basicSetOwner(null, msgs);
			case Meeduse_tt2bddPackage.PORT__CELLS:
				return ((InternalEList<?>)getCells()).basicRemove(otherEnd, msgs);
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
			case Meeduse_tt2bddPackage.PORT__OWNER:
				return eInternalContainer().eInverseRemove(this, Meeduse_tt2bddPackage.TRUTH_TABLE__PORTS, TruthTable.class, msgs);
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
			case Meeduse_tt2bddPackage.PORT__OWNER:
				return getOwner();
			case Meeduse_tt2bddPackage.PORT__CELLS:
				return getCells();
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
			case Meeduse_tt2bddPackage.PORT__OWNER:
				setOwner((TruthTable)newValue);
				return;
			case Meeduse_tt2bddPackage.PORT__CELLS:
				getCells().clear();
				getCells().addAll((Collection<? extends Cell>)newValue);
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
			case Meeduse_tt2bddPackage.PORT__OWNER:
				setOwner((TruthTable)null);
				return;
			case Meeduse_tt2bddPackage.PORT__CELLS:
				getCells().clear();
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
			case Meeduse_tt2bddPackage.PORT__OWNER:
				return getOwner() != null;
			case Meeduse_tt2bddPackage.PORT__CELLS:
				return cells != null && !cells.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PortImpl
