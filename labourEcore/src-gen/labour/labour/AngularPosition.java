/**
 */
package labour.labour;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angular Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labour.labour.AngularPosition#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see labour.labour.labourPackage#getAngularPosition()
 * @model
 * @generated
 */
public interface AngularPosition extends Position {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(int)
	 * @see labour.labour.labourPackage#getAngularPosition_Angle()
	 * @model required="true"
	 * @generated
	 */
	int getAngle();

	/**
	 * Sets the value of the '{@link labour.labour.AngularPosition#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(int value);

} // AngularPosition
