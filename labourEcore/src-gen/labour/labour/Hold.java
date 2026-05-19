/**
 */
package labour.labour;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labour.labour.Hold#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link labour.labour.Hold#getPos <em>Pos</em>}</li>
 *   <li>{@link labour.labour.Hold#getShape_identifier <em>Shape identifier</em>}</li>
 *   <li>{@link labour.labour.Hold#getRotation <em>Rotation</em>}</li>
 *   <li>{@link labour.labour.Hold#getColours <em>Colours</em>}</li>
 *   <li>{@link labour.labour.Hold#getStart_hold <em>Start hold</em>}</li>
 *   <li>{@link labour.labour.Hold#isEnd_hold <em>End hold</em>}</li>
 * </ul>
 *
 * @see labour.labour.labourPackage#getHold()
 * @model
 * @generated
 */
public interface Hold extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see labour.labour.labourPackage#getHold_Identifier()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link labour.labour.Hold#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' containment reference.
	 * @see #setPos(Position)
	 * @see labour.labour.labourPackage#getHold_Pos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Position getPos();

	/**
	 * Sets the value of the '{@link labour.labour.Hold#getPos <em>Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' containment reference.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(Position value);

	/**
	 * Returns the value of the '<em><b>Shape identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape identifier</em>' attribute.
	 * @see #setShape_identifier(String)
	 * @see labour.labour.labourPackage#getHold_Shape_identifier()
	 * @model required="true"
	 * @generated
	 */
	String getShape_identifier();

	/**
	 * Sets the value of the '{@link labour.labour.Hold#getShape_identifier <em>Shape identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape identifier</em>' attribute.
	 * @see #getShape_identifier()
	 * @generated
	 */
	void setShape_identifier(String value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(int)
	 * @see labour.labour.labourPackage#getHold_Rotation()
	 * @model
	 * @generated
	 */
	int getRotation();

	/**
	 * Sets the value of the '{@link labour.labour.Hold#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(int value);

	/**
	 * Returns the value of the '<em><b>Colours</b></em>' attribute list.
	 * The list contents are of type {@link labour.labour.Colour}.
	 * The literals are from the enumeration {@link labour.labour.Colour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colours</em>' attribute list.
	 * @see labour.labour.Colour
	 * @see labour.labour.labourPackage#getHold_Colours()
	 * @model required="true"
	 * @generated
	 */
	EList<Colour> getColours();

	/**
	 * Returns the value of the '<em><b>Start hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start hold</em>' attribute.
	 * @see #setStart_hold(int)
	 * @see labour.labour.labourPackage#getHold_Start_hold()
	 * @model
	 * @generated
	 */
	int getStart_hold();

	/**
	 * Sets the value of the '{@link labour.labour.Hold#getStart_hold <em>Start hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start hold</em>' attribute.
	 * @see #getStart_hold()
	 * @generated
	 */
	void setStart_hold(int value);

	/**
	 * Returns the value of the '<em><b>End hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End hold</em>' attribute.
	 * @see #setEnd_hold(boolean)
	 * @see labour.labour.labourPackage#getHold_End_hold()
	 * @model
	 * @generated
	 */
	boolean isEnd_hold();

	/**
	 * Sets the value of the '{@link labour.labour.Hold#isEnd_hold <em>End hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End hold</em>' attribute.
	 * @see #isEnd_hold()
	 * @generated
	 */
	void setEnd_hold(boolean value);

} // Hold
