/**
 */
package labour.labour.impl;

import java.util.Collection;

import labour.labour.Hold;
import labour.labour.Position;
import labour.labour.Triangle;
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
 * An implementation of the model object '<em><b>Triangle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link labour.labour.impl.TriangleImpl#getCorners <em>Corners</em>}</li>
 *   <li>{@link labour.labour.impl.TriangleImpl#getExtrusion <em>Extrusion</em>}</li>
 *   <li>{@link labour.labour.impl.TriangleImpl#getLeft_holds <em>Left holds</em>}</li>
 *   <li>{@link labour.labour.impl.TriangleImpl#getRight_holds <em>Right holds</em>}</li>
 *   <li>{@link labour.labour.impl.TriangleImpl#getBottom_holds <em>Bottom holds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriangleImpl extends VolumeImpl implements Triangle {
	/**
	 * The cached value of the '{@link #getCorners() <em>Corners</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorners()
	 * @generated
	 * @ordered
	 */
	protected EList<Position> corners;

	/**
	 * The cached value of the '{@link #getExtrusion() <em>Extrusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusion()
	 * @generated
	 * @ordered
	 */
	protected Position extrusion;

	/**
	 * The cached value of the '{@link #getLeft_holds() <em>Left holds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft_holds()
	 * @generated
	 * @ordered
	 */
	protected EList<Hold> left_holds;

	/**
	 * The cached value of the '{@link #getRight_holds() <em>Right holds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight_holds()
	 * @generated
	 * @ordered
	 */
	protected EList<Hold> right_holds;

	/**
	 * The cached value of the '{@link #getBottom_holds() <em>Bottom holds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom_holds()
	 * @generated
	 * @ordered
	 */
	protected EList<Hold> bottom_holds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriangleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return labourPackage.Literals.TRIANGLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Position> getCorners() {
		if (corners == null) {
			corners = new EObjectContainmentEList<Position>(Position.class, this, labourPackage.TRIANGLE__CORNERS);
		}
		return corners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position getExtrusion() {
		return extrusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtrusion(Position newExtrusion, NotificationChain msgs) {
		Position oldExtrusion = extrusion;
		extrusion = newExtrusion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					labourPackage.TRIANGLE__EXTRUSION, oldExtrusion, newExtrusion);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtrusion(Position newExtrusion) {
		if (newExtrusion != extrusion) {
			NotificationChain msgs = null;
			if (extrusion != null)
				msgs = ((InternalEObject) extrusion).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - labourPackage.TRIANGLE__EXTRUSION, null, msgs);
			if (newExtrusion != null)
				msgs = ((InternalEObject) newExtrusion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - labourPackage.TRIANGLE__EXTRUSION, null, msgs);
			msgs = basicSetExtrusion(newExtrusion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, labourPackage.TRIANGLE__EXTRUSION, newExtrusion,
					newExtrusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hold> getLeft_holds() {
		if (left_holds == null) {
			left_holds = new EObjectContainmentEList<Hold>(Hold.class, this, labourPackage.TRIANGLE__LEFT_HOLDS);
		}
		return left_holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hold> getRight_holds() {
		if (right_holds == null) {
			right_holds = new EObjectContainmentEList<Hold>(Hold.class, this, labourPackage.TRIANGLE__RIGHT_HOLDS);
		}
		return right_holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hold> getBottom_holds() {
		if (bottom_holds == null) {
			bottom_holds = new EObjectContainmentEList<Hold>(Hold.class, this, labourPackage.TRIANGLE__BOTTOM_HOLDS);
		}
		return bottom_holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case labourPackage.TRIANGLE__CORNERS:
			return ((InternalEList<?>) getCorners()).basicRemove(otherEnd, msgs);
		case labourPackage.TRIANGLE__EXTRUSION:
			return basicSetExtrusion(null, msgs);
		case labourPackage.TRIANGLE__LEFT_HOLDS:
			return ((InternalEList<?>) getLeft_holds()).basicRemove(otherEnd, msgs);
		case labourPackage.TRIANGLE__RIGHT_HOLDS:
			return ((InternalEList<?>) getRight_holds()).basicRemove(otherEnd, msgs);
		case labourPackage.TRIANGLE__BOTTOM_HOLDS:
			return ((InternalEList<?>) getBottom_holds()).basicRemove(otherEnd, msgs);
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
		case labourPackage.TRIANGLE__CORNERS:
			return getCorners();
		case labourPackage.TRIANGLE__EXTRUSION:
			return getExtrusion();
		case labourPackage.TRIANGLE__LEFT_HOLDS:
			return getLeft_holds();
		case labourPackage.TRIANGLE__RIGHT_HOLDS:
			return getRight_holds();
		case labourPackage.TRIANGLE__BOTTOM_HOLDS:
			return getBottom_holds();
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
		case labourPackage.TRIANGLE__CORNERS:
			getCorners().clear();
			getCorners().addAll((Collection<? extends Position>) newValue);
			return;
		case labourPackage.TRIANGLE__EXTRUSION:
			setExtrusion((Position) newValue);
			return;
		case labourPackage.TRIANGLE__LEFT_HOLDS:
			getLeft_holds().clear();
			getLeft_holds().addAll((Collection<? extends Hold>) newValue);
			return;
		case labourPackage.TRIANGLE__RIGHT_HOLDS:
			getRight_holds().clear();
			getRight_holds().addAll((Collection<? extends Hold>) newValue);
			return;
		case labourPackage.TRIANGLE__BOTTOM_HOLDS:
			getBottom_holds().clear();
			getBottom_holds().addAll((Collection<? extends Hold>) newValue);
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
		case labourPackage.TRIANGLE__CORNERS:
			getCorners().clear();
			return;
		case labourPackage.TRIANGLE__EXTRUSION:
			setExtrusion((Position) null);
			return;
		case labourPackage.TRIANGLE__LEFT_HOLDS:
			getLeft_holds().clear();
			return;
		case labourPackage.TRIANGLE__RIGHT_HOLDS:
			getRight_holds().clear();
			return;
		case labourPackage.TRIANGLE__BOTTOM_HOLDS:
			getBottom_holds().clear();
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
		case labourPackage.TRIANGLE__CORNERS:
			return corners != null && !corners.isEmpty();
		case labourPackage.TRIANGLE__EXTRUSION:
			return extrusion != null;
		case labourPackage.TRIANGLE__LEFT_HOLDS:
			return left_holds != null && !left_holds.isEmpty();
		case labourPackage.TRIANGLE__RIGHT_HOLDS:
			return right_holds != null && !right_holds.isEmpty();
		case labourPackage.TRIANGLE__BOTTOM_HOLDS:
			return bottom_holds != null && !bottom_holds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TriangleImpl
