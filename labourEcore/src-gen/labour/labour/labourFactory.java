/**
 */
package labour.labour;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see labour.labour.labourPackage
 * @generated
 */
public interface labourFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	labourFactory eINSTANCE = labour.labour.impl.labourFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bouldering Wall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bouldering Wall</em>'.
	 * @generated
	 */
	BoulderingWall createBoulderingWall();

	/**
	 * Returns a new object of class '<em>Hold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hold</em>'.
	 * @generated
	 */
	Hold createHold();

	/**
	 * Returns a new object of class '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route</em>'.
	 * @generated
	 */
	Route createRoute();

	/**
	 * Returns a new object of class '<em>Circle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circle</em>'.
	 * @generated
	 */
	Circle createCircle();

	/**
	 * Returns a new object of class '<em>Triangle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Triangle</em>'.
	 * @generated
	 */
	Triangle createTriangle();

	/**
	 * Returns a new object of class '<em>Hold Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hold Step</em>'.
	 * @generated
	 */
	HoldStep createHoldStep();

	/**
	 * Returns a new object of class '<em>Split Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Split Step</em>'.
	 * @generated
	 */
	SplitStep createSplitStep();

	/**
	 * Returns a new object of class '<em>Angular Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angular Position</em>'.
	 * @generated
	 */
	AngularPosition createAngularPosition();

	/**
	 * Returns a new object of class '<em>Cartesian Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Position</em>'.
	 * @generated
	 */
	CartesianPosition createCartesianPosition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	labourPackage getlabourPackage();

} //labourFactory
