/**
 */
package labour.labour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labour.labour.Triangle#getCorners <em>Corners</em>}</li>
 *   <li>{@link labour.labour.Triangle#getExtrusion <em>Extrusion</em>}</li>
 *   <li>{@link labour.labour.Triangle#getLeft_holds <em>Left holds</em>}</li>
 *   <li>{@link labour.labour.Triangle#getRight_holds <em>Right holds</em>}</li>
 *   <li>{@link labour.labour.Triangle#getBottom_holds <em>Bottom holds</em>}</li>
 * </ul>
 *
 * @see labour.labour.labourPackage#getTriangle()
 * @model
 * @generated
 */
public interface Triangle extends Volume {
	/**
	 * Returns the value of the '<em><b>Corners</b></em>' containment reference list.
	 * The list contents are of type {@link labour.labour.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corners</em>' containment reference list.
	 * @see labour.labour.labourPackage#getTriangle_Corners()
	 * @model containment="true" lower="3" upper="3"
	 * @generated
	 */
	EList<Position> getCorners();

	/**
	 * Returns the value of the '<em><b>Extrusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion</em>' containment reference.
	 * @see #setExtrusion(Position)
	 * @see labour.labour.labourPackage#getTriangle_Extrusion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Position getExtrusion();

	/**
	 * Sets the value of the '{@link labour.labour.Triangle#getExtrusion <em>Extrusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion</em>' containment reference.
	 * @see #getExtrusion()
	 * @generated
	 */
	void setExtrusion(Position value);

	/**
	 * Returns the value of the '<em><b>Left holds</b></em>' containment reference list.
	 * The list contents are of type {@link labour.labour.Hold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left holds</em>' containment reference list.
	 * @see labour.labour.labourPackage#getTriangle_Left_holds()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hold> getLeft_holds();

	/**
	 * Returns the value of the '<em><b>Right holds</b></em>' containment reference list.
	 * The list contents are of type {@link labour.labour.Hold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right holds</em>' containment reference list.
	 * @see labour.labour.labourPackage#getTriangle_Right_holds()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hold> getRight_holds();

	/**
	 * Returns the value of the '<em><b>Bottom holds</b></em>' containment reference list.
	 * The list contents are of type {@link labour.labour.Hold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom holds</em>' containment reference list.
	 * @see labour.labour.labourPackage#getTriangle_Bottom_holds()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hold> getBottom_holds();

} // Triangle
