/**
 */
package labour.labour;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bouldering Wall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labour.labour.BoulderingWall#getHolds <em>Holds</em>}</li>
 *   <li>{@link labour.labour.BoulderingWall#getRoutes <em>Routes</em>}</li>
 *   <li>{@link labour.labour.BoulderingWall#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link labour.labour.BoulderingWall#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see labour.labour.labourPackage#getBoulderingWall()
 * @model
 * @generated
 */
public interface BoulderingWall extends EObject {
	/**
	 * Returns the value of the '<em><b>Holds</b></em>' containment reference list.
	 * The list contents are of type {@link labour.labour.Hold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holds</em>' containment reference list.
	 * @see labour.labour.labourPackage#getBoulderingWall_Holds()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hold> getHolds();

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link labour.labour.Route}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see labour.labour.labourPackage#getBoulderingWall_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getRoutes();

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' containment reference list.
	 * The list contents are of type {@link labour.labour.Volume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' containment reference list.
	 * @see labour.labour.labourPackage#getBoulderingWall_Volumes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Volume> getVolumes();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see labour.labour.labourPackage#getBoulderingWall_ID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link labour.labour.BoulderingWall#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // BoulderingWall
