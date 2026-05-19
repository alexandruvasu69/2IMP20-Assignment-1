/**
 */
package labour.labour;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labour.labour.Volume#getDepth <em>Depth</em>}</li>
 *   <li>{@link labour.labour.Volume#getPos <em>Pos</em>}</li>
 * </ul>
 *
 * @see labour.labour.labourPackage#getVolume()
 * @model abstract="true"
 * @generated
 */
public interface Volume extends EObject {
	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(int)
	 * @see labour.labour.labourPackage#getVolume_Depth()
	 * @model required="true"
	 * @generated
	 */
	int getDepth();

	/**
	 * Sets the value of the '{@link labour.labour.Volume#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(int value);

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' containment reference.
	 * @see #setPos(Position)
	 * @see labour.labour.labourPackage#getVolume_Pos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Position getPos();

	/**
	 * Sets the value of the '{@link labour.labour.Volume#getPos <em>Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' containment reference.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(Position value);

} // Volume
