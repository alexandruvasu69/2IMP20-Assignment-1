/**
 */
package labour.labour.impl;

import java.util.Collection;

import labour.labour.Colour;
import labour.labour.Hold;
import labour.labour.Position;
import labour.labour.labourPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hold</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link labour.labour.impl.HoldImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link labour.labour.impl.HoldImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link labour.labour.impl.HoldImpl#getShape_identifier <em>Shape identifier</em>}</li>
 *   <li>{@link labour.labour.impl.HoldImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link labour.labour.impl.HoldImpl#getColours <em>Colours</em>}</li>
 *   <li>{@link labour.labour.impl.HoldImpl#getStart_hold <em>Start hold</em>}</li>
 *   <li>{@link labour.labour.impl.HoldImpl#isEnd_hold <em>End hold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HoldImpl extends MinimalEObjectImpl.Container implements Hold {
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
	 * The cached value of the '{@link #getPos() <em>Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected Position pos;

	/**
	 * The default value of the '{@link #getShape_identifier() <em>Shape identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape_identifier()
	 * @generated
	 * @ordered
	 */
	protected static final String SHAPE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShape_identifier() <em>Shape identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape_identifier()
	 * @generated
	 * @ordered
	 */
	protected String shape_identifier = SHAPE_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final int ROTATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected int rotation = ROTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColours() <em>Colours</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColours()
	 * @generated
	 * @ordered
	 */
	protected EList<Colour> colours;

	/**
	 * The default value of the '{@link #getStart_hold() <em>Start hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_hold()
	 * @generated
	 * @ordered
	 */
	protected static final int START_HOLD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStart_hold() <em>Start hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_hold()
	 * @generated
	 * @ordered
	 */
	protected int start_hold = START_HOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnd_hold() <em>End hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnd_hold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean END_HOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnd_hold() <em>End hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnd_hold()
	 * @generated
	 * @ordered
	 */
	protected boolean end_hold = END_HOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HoldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return labourPackage.Literals.HOLD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, labourPackage.HOLD__IDENTIFIER, oldIdentifier,
					identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position getPos() {
		return pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPos(Position newPos, NotificationChain msgs) {
		Position oldPos = pos;
		pos = newPos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, labourPackage.HOLD__POS,
					oldPos, newPos);
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
	public void setPos(Position newPos) {
		if (newPos != pos) {
			NotificationChain msgs = null;
			if (pos != null)
				msgs = ((InternalEObject) pos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - labourPackage.HOLD__POS,
						null, msgs);
			if (newPos != null)
				msgs = ((InternalEObject) newPos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - labourPackage.HOLD__POS,
						null, msgs);
			msgs = basicSetPos(newPos, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, labourPackage.HOLD__POS, newPos, newPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShape_identifier() {
		return shape_identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShape_identifier(String newShape_identifier) {
		String oldShape_identifier = shape_identifier;
		shape_identifier = newShape_identifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, labourPackage.HOLD__SHAPE_IDENTIFIER,
					oldShape_identifier, shape_identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRotation(int newRotation) {
		int oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, labourPackage.HOLD__ROTATION, oldRotation, rotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Colour> getColours() {
		if (colours == null) {
			colours = new EDataTypeUniqueEList<Colour>(Colour.class, this, labourPackage.HOLD__COLOURS);
		}
		return colours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStart_hold() {
		return start_hold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart_hold(int newStart_hold) {
		int oldStart_hold = start_hold;
		start_hold = newStart_hold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, labourPackage.HOLD__START_HOLD, oldStart_hold,
					start_hold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnd_hold() {
		return end_hold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd_hold(boolean newEnd_hold) {
		boolean oldEnd_hold = end_hold;
		end_hold = newEnd_hold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, labourPackage.HOLD__END_HOLD, oldEnd_hold, end_hold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case labourPackage.HOLD__POS:
			return basicSetPos(null, msgs);
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
		case labourPackage.HOLD__IDENTIFIER:
			return getIdentifier();
		case labourPackage.HOLD__POS:
			return getPos();
		case labourPackage.HOLD__SHAPE_IDENTIFIER:
			return getShape_identifier();
		case labourPackage.HOLD__ROTATION:
			return getRotation();
		case labourPackage.HOLD__COLOURS:
			return getColours();
		case labourPackage.HOLD__START_HOLD:
			return getStart_hold();
		case labourPackage.HOLD__END_HOLD:
			return isEnd_hold();
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
		case labourPackage.HOLD__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case labourPackage.HOLD__POS:
			setPos((Position) newValue);
			return;
		case labourPackage.HOLD__SHAPE_IDENTIFIER:
			setShape_identifier((String) newValue);
			return;
		case labourPackage.HOLD__ROTATION:
			setRotation((Integer) newValue);
			return;
		case labourPackage.HOLD__COLOURS:
			getColours().clear();
			getColours().addAll((Collection<? extends Colour>) newValue);
			return;
		case labourPackage.HOLD__START_HOLD:
			setStart_hold((Integer) newValue);
			return;
		case labourPackage.HOLD__END_HOLD:
			setEnd_hold((Boolean) newValue);
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
		case labourPackage.HOLD__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case labourPackage.HOLD__POS:
			setPos((Position) null);
			return;
		case labourPackage.HOLD__SHAPE_IDENTIFIER:
			setShape_identifier(SHAPE_IDENTIFIER_EDEFAULT);
			return;
		case labourPackage.HOLD__ROTATION:
			setRotation(ROTATION_EDEFAULT);
			return;
		case labourPackage.HOLD__COLOURS:
			getColours().clear();
			return;
		case labourPackage.HOLD__START_HOLD:
			setStart_hold(START_HOLD_EDEFAULT);
			return;
		case labourPackage.HOLD__END_HOLD:
			setEnd_hold(END_HOLD_EDEFAULT);
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
		case labourPackage.HOLD__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case labourPackage.HOLD__POS:
			return pos != null;
		case labourPackage.HOLD__SHAPE_IDENTIFIER:
			return SHAPE_IDENTIFIER_EDEFAULT == null ? shape_identifier != null
					: !SHAPE_IDENTIFIER_EDEFAULT.equals(shape_identifier);
		case labourPackage.HOLD__ROTATION:
			return rotation != ROTATION_EDEFAULT;
		case labourPackage.HOLD__COLOURS:
			return colours != null && !colours.isEmpty();
		case labourPackage.HOLD__START_HOLD:
			return start_hold != START_HOLD_EDEFAULT;
		case labourPackage.HOLD__END_HOLD:
			return end_hold != END_HOLD_EDEFAULT;
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", shape_identifier: ");
		result.append(shape_identifier);
		result.append(", rotation: ");
		result.append(rotation);
		result.append(", colours: ");
		result.append(colours);
		result.append(", start_hold: ");
		result.append(start_hold);
		result.append(", end_hold: ");
		result.append(end_hold);
		result.append(')');
		return result.toString();
	}

} //HoldImpl
