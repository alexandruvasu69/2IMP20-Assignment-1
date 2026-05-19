/**
 */
package labour.labour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labour.labour.Circle#getRadius <em>Radius</em>}</li>
 *   <li>{@link labour.labour.Circle#getSide_holds <em>Side holds</em>}</li>
 *   <li>{@link labour.labour.Circle#getFront_holds <em>Front holds</em>}</li>
 * </ul>
 *
 * @see labour.labour.labourPackage#getCircle()
 * @model
 * @generated
 */
public interface Circle extends Volume {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(int)
	 * @see labour.labour.labourPackage#getCircle_Radius()
	 * @model required="true"
	 * @generated
	 */
	int getRadius();

	/**
	 * Sets the value of the '{@link labour.labour.Circle#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(int value);

	/**
	 * Returns the value of the '<em><b>Side holds</b></em>' containment reference list.
	 * The list contents are of type {@link labour.labour.Hold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side holds</em>' containment reference list.
	 * @see labour.labour.labourPackage#getCircle_Side_holds()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hold> getSide_holds();

	/**
	 * Returns the value of the '<em><b>Front holds</b></em>' containment reference list.
	 * The list contents are of type {@link labour.labour.Hold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Front holds</em>' containment reference list.
	 * @see labour.labour.labourPackage#getCircle_Front_holds()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hold> getFront_holds();

} // Circle
