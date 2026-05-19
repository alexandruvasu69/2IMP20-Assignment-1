/**
 */
package labour.labour;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hold Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labour.labour.HoldStep#getHold <em>Hold</em>}</li>
 * </ul>
 *
 * @see labour.labour.labourPackage#getHoldStep()
 * @model
 * @generated
 */
public interface HoldStep extends RouteStep {
	/**
	 * Returns the value of the '<em><b>Hold</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hold</em>' reference.
	 * @see #setHold(Hold)
	 * @see labour.labour.labourPackage#getHoldStep_Hold()
	 * @model required="true"
	 * @generated
	 */
	Hold getHold();

	/**
	 * Sets the value of the '{@link labour.labour.HoldStep#getHold <em>Hold</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold</em>' reference.
	 * @see #getHold()
	 * @generated
	 */
	void setHold(Hold value);

} // HoldStep
