/**
 */
package labour.labour;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link labour.labour.Route#getGrade <em>Grade</em>}</li>
 *   <li>{@link labour.labour.Route#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link labour.labour.Route#getGrid_base_point <em>Grid base point</em>}</li>
 *   <li>{@link labour.labour.Route#getHolds <em>Holds</em>}</li>
 * </ul>
 *
 * @see labour.labour.labourPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see #setGrade(String)
	 * @see labour.labour.labourPackage#getRoute_Grade()
	 * @model required="true"
	 * @generated
	 */
	String getGrade();

	/**
	 * Sets the value of the '{@link labour.labour.Route#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see labour.labour.labourPackage#getRoute_Identifier()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link labour.labour.Route#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Grid base point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid base point</em>' containment reference.
	 * @see #setGrid_base_point(Position)
	 * @see labour.labour.labourPackage#getRoute_Grid_base_point()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Position getGrid_base_point();

	/**
	 * Sets the value of the '{@link labour.labour.Route#getGrid_base_point <em>Grid base point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid base point</em>' containment reference.
	 * @see #getGrid_base_point()
	 * @generated
	 */
	void setGrid_base_point(Position value);

	/**
	 * Returns the value of the '<em><b>Holds</b></em>' containment reference list.
	 * The list contents are of type {@link labour.labour.RouteStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holds</em>' containment reference list.
	 * @see labour.labour.labourPackage#getRoute_Holds()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<RouteStep> getHolds();

} // Route
