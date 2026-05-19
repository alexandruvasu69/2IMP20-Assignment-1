/**
 */
package labour.labour.impl;

import java.util.Collection;

import labour.labour.Circle;
import labour.labour.Hold;
import labour.labour.labourPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link labour.labour.impl.CircleImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link labour.labour.impl.CircleImpl#getSide_holds <em>Side holds</em>}</li>
 *   <li>{@link labour.labour.impl.CircleImpl#getFront_holds <em>Front holds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CircleImpl extends VolumeImpl implements Circle {
	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final int RADIUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected int radius = RADIUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSide_holds() <em>Side holds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide_holds()
	 * @generated
	 * @ordered
	 */
	protected EList<Hold> side_holds;

	/**
	 * The cached value of the '{@link #getFront_holds() <em>Front holds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFront_holds()
	 * @generated
	 * @ordered
	 */
	protected EList<Hold> front_holds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return labourPackage.Literals.CIRCLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRadius(int newRadius) {
		int oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, labourPackage.CIRCLE__RADIUS, oldRadius, radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hold> getSide_holds() {
		if (side_holds == null) {
			side_holds = new EObjectContainmentEList<Hold>(Hold.class, this, labourPackage.CIRCLE__SIDE_HOLDS);
		}
		return side_holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hold> getFront_holds() {
		if (front_holds == null) {
			front_holds = new EObjectContainmentEList<Hold>(Hold.class, this, labourPackage.CIRCLE__FRONT_HOLDS);
		}
		return front_holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case labourPackage.CIRCLE__SIDE_HOLDS:
			return ((InternalEList<?>) getSide_holds()).basicRemove(otherEnd, msgs);
		case labourPackage.CIRCLE__FRONT_HOLDS:
			return ((InternalEList<?>) getFront_holds()).basicRemove(otherEnd, msgs);
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
		case labourPackage.CIRCLE__RADIUS:
			return getRadius();
		case labourPackage.CIRCLE__SIDE_HOLDS:
			return getSide_holds();
		case labourPackage.CIRCLE__FRONT_HOLDS:
			return getFront_holds();
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
		case labourPackage.CIRCLE__RADIUS:
			setRadius((Integer) newValue);
			return;
		case labourPackage.CIRCLE__SIDE_HOLDS:
			getSide_holds().clear();
			getSide_holds().addAll((Collection<? extends Hold>) newValue);
			return;
		case labourPackage.CIRCLE__FRONT_HOLDS:
			getFront_holds().clear();
			getFront_holds().addAll((Collection<? extends Hold>) newValue);
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
		case labourPackage.CIRCLE__RADIUS:
			setRadius(RADIUS_EDEFAULT);
			return;
		case labourPackage.CIRCLE__SIDE_HOLDS:
			getSide_holds().clear();
			return;
		case labourPackage.CIRCLE__FRONT_HOLDS:
			getFront_holds().clear();
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
		case labourPackage.CIRCLE__RADIUS:
			return radius != RADIUS_EDEFAULT;
		case labourPackage.CIRCLE__SIDE_HOLDS:
			return side_holds != null && !side_holds.isEmpty();
		case labourPackage.CIRCLE__FRONT_HOLDS:
			return front_holds != null && !front_holds.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (radius: ");
		result.append(radius);
		result.append(')');
		return result.toString();
	}

} //CircleImpl
