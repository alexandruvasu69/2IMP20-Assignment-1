/**
 */
package labour.labour.impl;

import java.util.Collection;

import labour.labour.BoulderingWall;
import labour.labour.Hold;
import labour.labour.Route;
import labour.labour.Volume;
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
 * An implementation of the model object '<em><b>Bouldering Wall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link labour.labour.impl.BoulderingWallImpl#getHolds <em>Holds</em>}</li>
 *   <li>{@link labour.labour.impl.BoulderingWallImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link labour.labour.impl.BoulderingWallImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link labour.labour.impl.BoulderingWallImpl#getID <em>ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoulderingWallImpl extends MinimalEObjectImpl.Container implements BoulderingWall {
	/**
	 * The cached value of the '{@link #getHolds() <em>Holds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolds()
	 * @generated
	 * @ordered
	 */
	protected EList<Hold> holds;

	/**
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> routes;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected EList<Volume> volumes;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoulderingWallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return labourPackage.Literals.BOULDERING_WALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hold> getHolds() {
		if (holds == null) {
			holds = new EObjectContainmentEList<Hold>(Hold.class, this, labourPackage.BOULDERING_WALL__HOLDS);
		}
		return holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Route> getRoutes() {
		if (routes == null) {
			routes = new EObjectContainmentEList<Route>(Route.class, this, labourPackage.BOULDERING_WALL__ROUTES);
		}
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Volume> getVolumes() {
		if (volumes == null) {
			volumes = new EObjectContainmentEList<Volume>(Volume.class, this, labourPackage.BOULDERING_WALL__VOLUMES);
		}
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, labourPackage.BOULDERING_WALL__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case labourPackage.BOULDERING_WALL__HOLDS:
			return ((InternalEList<?>) getHolds()).basicRemove(otherEnd, msgs);
		case labourPackage.BOULDERING_WALL__ROUTES:
			return ((InternalEList<?>) getRoutes()).basicRemove(otherEnd, msgs);
		case labourPackage.BOULDERING_WALL__VOLUMES:
			return ((InternalEList<?>) getVolumes()).basicRemove(otherEnd, msgs);
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
		case labourPackage.BOULDERING_WALL__HOLDS:
			return getHolds();
		case labourPackage.BOULDERING_WALL__ROUTES:
			return getRoutes();
		case labourPackage.BOULDERING_WALL__VOLUMES:
			return getVolumes();
		case labourPackage.BOULDERING_WALL__ID:
			return getID();
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
		case labourPackage.BOULDERING_WALL__HOLDS:
			getHolds().clear();
			getHolds().addAll((Collection<? extends Hold>) newValue);
			return;
		case labourPackage.BOULDERING_WALL__ROUTES:
			getRoutes().clear();
			getRoutes().addAll((Collection<? extends Route>) newValue);
			return;
		case labourPackage.BOULDERING_WALL__VOLUMES:
			getVolumes().clear();
			getVolumes().addAll((Collection<? extends Volume>) newValue);
			return;
		case labourPackage.BOULDERING_WALL__ID:
			setID((String) newValue);
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
		case labourPackage.BOULDERING_WALL__HOLDS:
			getHolds().clear();
			return;
		case labourPackage.BOULDERING_WALL__ROUTES:
			getRoutes().clear();
			return;
		case labourPackage.BOULDERING_WALL__VOLUMES:
			getVolumes().clear();
			return;
		case labourPackage.BOULDERING_WALL__ID:
			setID(ID_EDEFAULT);
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
		case labourPackage.BOULDERING_WALL__HOLDS:
			return holds != null && !holds.isEmpty();
		case labourPackage.BOULDERING_WALL__ROUTES:
			return routes != null && !routes.isEmpty();
		case labourPackage.BOULDERING_WALL__VOLUMES:
			return volumes != null && !volumes.isEmpty();
		case labourPackage.BOULDERING_WALL__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //BoulderingWallImpl
