/**
 */
package meeduse_tt2bdd.impl;

import java.util.Collection;

import meeduse_tt2bdd.BddInput;
import meeduse_tt2bdd.Meeduse_tt2bddPackage;
import meeduse_tt2bdd.Subtree;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bdd Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link meeduse_tt2bdd.impl.BddInputImpl#getSubtrees <em>Subtrees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BddInputImpl extends BdPImpl implements BddInput {
	/**
	 * The cached value of the '{@link #getSubtrees() <em>Subtrees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtrees()
	 * @generated
	 * @ordered
	 */
	protected EList<Subtree> subtrees;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BddInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Meeduse_tt2bddPackage.Literals.BDD_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subtree> getSubtrees() {
		if (subtrees == null) {
			subtrees = new EObjectWithInverseResolvingEList<Subtree>(Subtree.class, this, Meeduse_tt2bddPackage.BDD_INPUT__SUBTREES, Meeduse_tt2bddPackage.SUBTREE__PORT);
		}
		return subtrees;
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
			case Meeduse_tt2bddPackage.BDD_INPUT__SUBTREES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubtrees()).basicAdd(otherEnd, msgs);
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
			case Meeduse_tt2bddPackage.BDD_INPUT__SUBTREES:
				return ((InternalEList<?>)getSubtrees()).basicRemove(otherEnd, msgs);
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
			case Meeduse_tt2bddPackage.BDD_INPUT__SUBTREES:
				return getSubtrees();
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
			case Meeduse_tt2bddPackage.BDD_INPUT__SUBTREES:
				getSubtrees().clear();
				getSubtrees().addAll((Collection<? extends Subtree>)newValue);
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
			case Meeduse_tt2bddPackage.BDD_INPUT__SUBTREES:
				getSubtrees().clear();
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
			case Meeduse_tt2bddPackage.BDD_INPUT__SUBTREES:
				return subtrees != null && !subtrees.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BddInputImpl
