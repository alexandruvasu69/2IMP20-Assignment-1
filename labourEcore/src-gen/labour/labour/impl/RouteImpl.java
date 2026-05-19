/**
 */
package labour.labour.impl;

import java.util.Collection;

import labour.labour.Position;
import labour.labour.Route;
import labour.labour.RouteStep;
import labour.labour.labourPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link labour.labour.impl.RouteImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link labour.labour.impl.RouteImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link labour.labour.impl.RouteImpl#getGrid_base_point <em>Grid base point</em>}</li>
 *   <li>{@link labour.labour.impl.RouteImpl#getHolds <em>Holds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteImpl extends MinimalEObjectImpl.Container implements Route {
	/**
	 * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected static final String GRADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected String grade = GRADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGrid_base_point() <em>Grid base point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid_base_point()
	 * @generated
	 * @ordered
	 */
	protected Position grid_base_point;

	/**
	 * The cached value of the '{@link #getHolds() <em>Holds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolds()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteStep> holds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return labourPackage.Literals.ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGrade() {
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrade(String newGrade) {
		String oldGrade = grade;
		grade = newGrade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, labourPackage.ROUTE__GRADE, oldGrade, grade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, labourPackage.ROUTE__IDENTIFIER, oldIdentifier,
					identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position getGrid_base_point() {
		return grid_base_point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrid_base_point(Position newGrid_base_point, NotificationChain msgs) {
		Position oldGrid_base_point = grid_base_point;
		grid_base_point = newGrid_base_point;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					labourPackage.ROUTE__GRID_BASE_POINT, oldGrid_base_point, newGrid_base_point);
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
	public void setGrid_base_point(Position newGrid_base_point) {
		if (newGrid_base_point != grid_base_point) {
			NotificationChain msgs = null;
			if (grid_base_point != null)
				msgs = ((InternalEObject) grid_base_point).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - labourPackage.ROUTE__GRID_BASE_POINT, null, msgs);
			if (newGrid_base_point != null)
				msgs = ((InternalEObject) newGrid_base_point).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - labourPackage.ROUTE__GRID_BASE_POINT, null, msgs);
			msgs = basicSetGrid_base_point(newGrid_base_point, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, labourPackage.ROUTE__GRID_BASE_POINT,
					newGrid_base_point, newGrid_base_point));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteStep> getHolds() {
		if (holds == null) {
			holds = new EObjectContainmentEList<RouteStep>(RouteStep.class, this, labourPackage.ROUTE__HOLDS);
		}
		return holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case labourPackage.ROUTE__GRID_BASE_POINT:
			return basicSetGrid_base_point(null, msgs);
		case labourPackage.ROUTE__HOLDS:
			return ((InternalEList<?>) getHolds()).basicRemove(otherEnd, msgs);
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
		case labourPackage.ROUTE__GRADE:
			return getGrade();
		case labourPackage.ROUTE__IDENTIFIER:
			return getIdentifier();
		case labourPackage.ROUTE__GRID_BASE_POINT:
			return getGrid_base_point();
		case labourPackage.ROUTE__HOLDS:
			return getHolds();
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
		case labourPackage.ROUTE__GRADE:
			setGrade((String) newValue);
			return;
		case labourPackage.ROUTE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case labourPackage.ROUTE__GRID_BASE_POINT:
			setGrid_base_point((Position) newValue);
			return;
		case labourPackage.ROUTE__HOLDS:
			getHolds().clear();
			getHolds().addAll((Collection<? extends RouteStep>) newValue);
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
		case labourPackage.ROUTE__GRADE:
			setGrade(GRADE_EDEFAULT);
			return;
		case labourPackage.ROUTE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case labourPackage.ROUTE__GRID_BASE_POINT:
			setGrid_base_point((Position) null);
			return;
		case labourPackage.ROUTE__HOLDS:
			getHolds().clear();
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
		case labourPackage.ROUTE__GRADE:
			return GRADE_EDEFAULT == null ? grade != null : !GRADE_EDEFAULT.equals(grade);
		case labourPackage.ROUTE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case labourPackage.ROUTE__GRID_BASE_POINT:
			return grid_base_point != null;
		case labourPackage.ROUTE__HOLDS:
			return holds != null && !holds.isEmpty();
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
		result.append(" (grade: ");
		result.append(grade);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(')');
		return result.toString();
	}

} //RouteImpl
