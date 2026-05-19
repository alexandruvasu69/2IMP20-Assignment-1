/**
 */
package labour.labour;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see labour.labour.labourFactory
 * @model kind="package"
 * @generated
 */
public interface labourPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "labour";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/labour";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "labour";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	labourPackage eINSTANCE = labour.labour.impl.labourPackageImpl.init();

	/**
	 * The meta object id for the '{@link labour.labour.impl.BoulderingWallImpl <em>Bouldering Wall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labour.labour.impl.BoulderingWallImpl
	 * @see labour.labour.impl.labourPackageImpl#getBoulderingWall()
	 * @generated
	 */
	int BOULDERING_WALL = 0;

	/**
	 * The feature id for the '<em><b>Holds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_WALL__HOLDS = 0;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_WALL__ROUTES = 1;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_WALL__VOLUMES = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_WALL__ID = 3;

	/**
	 * The number of structural features of the '<em>Bouldering Wall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_WALL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bouldering Wall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_WALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link labour.labour.impl.HoldImpl <em>Hold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labour.labour.impl.HoldImpl
	 * @see labour.labour.impl.labourPackageImpl#getHold()
	 * @generated
	 */
	int HOLD = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__POS = 1;

	/**
	 * The feature id for the '<em><b>Shape identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__SHAPE_IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__ROTATION = 3;

	/**
	 * The feature id for the '<em><b>Colours</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__COLOURS = 4;

	/**
	 * The feature id for the '<em><b>Start hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__START_HOLD = 5;

	/**
	 * The feature id for the '<em><b>End hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__END_HOLD = 6;

	/**
	 * The number of structural features of the '<em>Hold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Hold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link labour.labour.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labour.labour.impl.RouteImpl
	 * @see labour.labour.impl.labourPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 2;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__GRADE = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Grid base point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__GRID_BASE_POINT = 2;

	/**
	 * The feature id for the '<em><b>Holds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__HOLDS = 3;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link labour.labour.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labour.labour.impl.VolumeImpl
	 * @see labour.labour.impl.labourPackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 3;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__DEPTH = 0;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__POS = 1;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link labour.labour.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labour.labour.impl.CircleImpl
	 * @see labour.labour.impl.labourPackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 4;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__DEPTH = VOLUME__DEPTH;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__POS = VOLUME__POS;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__RADIUS = VOLUME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Side holds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__SIDE_HOLDS = VOLUME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Front holds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__FRONT_HOLDS = VOLUME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = VOLUME_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_OPERATION_COUNT = VOLUME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link labour.labour.impl.TriangleImpl <em>Triangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labour.labour.impl.TriangleImpl
	 * @see labour.labour.impl.labourPackageImpl#getTriangle()
	 * @generated
	 */
	int TRIANGLE = 5;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__DEPTH = VOLUME__DEPTH;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__POS = VOLUME__POS;

	/**
	 * The feature id for the '<em><b>Corners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__CORNERS = VOLUME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extrusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__EXTRUSION = VOLUME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left holds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__LEFT_HOLDS = VOLUME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Right holds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__RIGHT_HOLDS = VOLUME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bottom holds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__BOTTOM_HOLDS = VOLUME_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_FEATURE_COUNT = VOLUME_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_OPERATION_COUNT = VOLUME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link labour.labour.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labour.labour.impl.PositionImpl
	 * @see labour.labour.impl.labourPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 6;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link labour.labour.impl.RouteStepImpl <em>Route Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labour.labour.impl.RouteStepImpl
	 * @see labour.labour.impl.labourPackageImpl#getRouteStep()
	 * @generated
	 */
	int ROUTE_STEP = 7;

	/**
	 * The number of structural features of the '<em>Route Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Route Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link labour.labour.impl.HoldStepImpl <em>Hold Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labour.labour.impl.HoldStepImpl
	 * @see labour.labour.impl.labourPackageImpl#getHoldStep()
	 * @generated
	 */
	int HOLD_STEP = 8;

	/**
	 * The feature id for the '<em><b>Hold</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_STEP__HOLD = ROUTE_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hold Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_STEP_FEATURE_COUNT = ROUTE_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hold Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_STEP_OPERATION_COUNT = ROUTE_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link labour.labour.impl.SplitStepImpl <em>Split Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labour.labour.impl.SplitStepImpl
	 * @see labour.labour.impl.labourPackageImpl#getSplitStep()
	 * @generated
	 */
	int SPLIT_STEP = 9;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_STEP__LEFT = ROUTE_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_STEP__RIGHT = ROUTE_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Split Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_STEP_FEATURE_COUNT = ROUTE_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Split Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_STEP_OPERATION_COUNT = ROUTE_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link labour.labour.impl.AngularPositionImpl <em>Angular Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labour.labour.impl.AngularPositionImpl
	 * @see labour.labour.impl.labourPackageImpl#getAngularPosition()
	 * @generated
	 */
	int ANGULAR_POSITION = 10;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_POSITION__ANGLE = POSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Angular Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_POSITION_FEATURE_COUNT = POSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Angular Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_POSITION_OPERATION_COUNT = POSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link labour.labour.impl.CartesianPositionImpl <em>Cartesian Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labour.labour.impl.CartesianPositionImpl
	 * @see labour.labour.impl.labourPackageImpl#getCartesianPosition()
	 * @generated
	 */
	int CARTESIAN_POSITION = 11;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION__X = POSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION__Y = POSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cartesian Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_FEATURE_COUNT = POSITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cartesian Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_POSITION_OPERATION_COUNT = POSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link labour.labour.Colour <em>Colour</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see labour.labour.Colour
	 * @see labour.labour.impl.labourPackageImpl#getColour()
	 * @generated
	 */
	int COLOUR = 12;

	/**
	 * Returns the meta object for class '{@link labour.labour.BoulderingWall <em>Bouldering Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bouldering Wall</em>'.
	 * @see labour.labour.BoulderingWall
	 * @generated
	 */
	EClass getBoulderingWall();

	/**
	 * Returns the meta object for the containment reference list '{@link labour.labour.BoulderingWall#getHolds <em>Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Holds</em>'.
	 * @see labour.labour.BoulderingWall#getHolds()
	 * @see #getBoulderingWall()
	 * @generated
	 */
	EReference getBoulderingWall_Holds();

	/**
	 * Returns the meta object for the containment reference list '{@link labour.labour.BoulderingWall#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routes</em>'.
	 * @see labour.labour.BoulderingWall#getRoutes()
	 * @see #getBoulderingWall()
	 * @generated
	 */
	EReference getBoulderingWall_Routes();

	/**
	 * Returns the meta object for the containment reference list '{@link labour.labour.BoulderingWall#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volumes</em>'.
	 * @see labour.labour.BoulderingWall#getVolumes()
	 * @see #getBoulderingWall()
	 * @generated
	 */
	EReference getBoulderingWall_Volumes();

	/**
	 * Returns the meta object for the attribute '{@link labour.labour.BoulderingWall#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see labour.labour.BoulderingWall#getID()
	 * @see #getBoulderingWall()
	 * @generated
	 */
	EAttribute getBoulderingWall_ID();

	/**
	 * Returns the meta object for class '{@link labour.labour.Hold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hold</em>'.
	 * @see labour.labour.Hold
	 * @generated
	 */
	EClass getHold();

	/**
	 * Returns the meta object for the attribute '{@link labour.labour.Hold#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see labour.labour.Hold#getIdentifier()
	 * @see #getHold()
	 * @generated
	 */
	EAttribute getHold_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link labour.labour.Hold#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pos</em>'.
	 * @see labour.labour.Hold#getPos()
	 * @see #getHold()
	 * @generated
	 */
	EReference getHold_Pos();

	/**
	 * Returns the meta object for the attribute '{@link labour.labour.Hold#getShape_identifier <em>Shape identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape identifier</em>'.
	 * @see labour.labour.Hold#getShape_identifier()
	 * @see #getHold()
	 * @generated
	 */
	EAttribute getHold_Shape_identifier();

	/**
	 * Returns the meta object for the attribute '{@link labour.labour.Hold#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see labour.labour.Hold#getRotation()
	 * @see #getHold()
	 * @generated
	 */
	EAttribute getHold_Rotation();

	/**
	 * Returns the meta object for the attribute list '{@link labour.labour.Hold#getColours <em>Colours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Colours</em>'.
	 * @see labour.labour.Hold#getColours()
	 * @see #getHold()
	 * @generated
	 */
	EAttribute getHold_Colours();

	/**
	 * Returns the meta object for the attribute '{@link labour.labour.Hold#getStart_hold <em>Start hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start hold</em>'.
	 * @see labour.labour.Hold#getStart_hold()
	 * @see #getHold()
	 * @generated
	 */
	EAttribute getHold_Start_hold();

	/**
	 * Returns the meta object for the attribute '{@link labour.labour.Hold#isEnd_hold <em>End hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End hold</em>'.
	 * @see labour.labour.Hold#isEnd_hold()
	 * @see #getHold()
	 * @generated
	 */
	EAttribute getHold_End_hold();

	/**
	 * Returns the meta object for class '{@link labour.labour.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see labour.labour.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the attribute '{@link labour.labour.Route#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see labour.labour.Route#getGrade()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Grade();

	/**
	 * Returns the meta object for the attribute '{@link labour.labour.Route#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see labour.labour.Route#getIdentifier()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link labour.labour.Route#getGrid_base_point <em>Grid base point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grid base point</em>'.
	 * @see labour.labour.Route#getGrid_base_point()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Grid_base_point();

	/**
	 * Returns the meta object for the containment reference list '{@link labour.labour.Route#getHolds <em>Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Holds</em>'.
	 * @see labour.labour.Route#getHolds()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Holds();

	/**
	 * Returns the meta object for class '{@link labour.labour.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see labour.labour.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for the attribute '{@link labour.labour.Volume#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see labour.labour.Volume#getDepth()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Depth();

	/**
	 * Returns the meta object for the containment reference '{@link labour.labour.Volume#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pos</em>'.
	 * @see labour.labour.Volume#getPos()
	 * @see #getVolume()
	 * @generated
	 */
	EReference getVolume_Pos();

	/**
	 * Returns the meta object for class '{@link labour.labour.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see labour.labour.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for the attribute '{@link labour.labour.Circle#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see labour.labour.Circle#getRadius()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Radius();

	/**
	 * Returns the meta object for the containment reference list '{@link labour.labour.Circle#getSide_holds <em>Side holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Side holds</em>'.
	 * @see labour.labour.Circle#getSide_holds()
	 * @see #getCircle()
	 * @generated
	 */
	EReference getCircle_Side_holds();

	/**
	 * Returns the meta object for the containment reference list '{@link labour.labour.Circle#getFront_holds <em>Front holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Front holds</em>'.
	 * @see labour.labour.Circle#getFront_holds()
	 * @see #getCircle()
	 * @generated
	 */
	EReference getCircle_Front_holds();

	/**
	 * Returns the meta object for class '{@link labour.labour.Triangle <em>Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangle</em>'.
	 * @see labour.labour.Triangle
	 * @generated
	 */
	EClass getTriangle();

	/**
	 * Returns the meta object for the containment reference list '{@link labour.labour.Triangle#getCorners <em>Corners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Corners</em>'.
	 * @see labour.labour.Triangle#getCorners()
	 * @see #getTriangle()
	 * @generated
	 */
	EReference getTriangle_Corners();

	/**
	 * Returns the meta object for the containment reference '{@link labour.labour.Triangle#getExtrusion <em>Extrusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extrusion</em>'.
	 * @see labour.labour.Triangle#getExtrusion()
	 * @see #getTriangle()
	 * @generated
	 */
	EReference getTriangle_Extrusion();

	/**
	 * Returns the meta object for the containment reference list '{@link labour.labour.Triangle#getLeft_holds <em>Left holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left holds</em>'.
	 * @see labour.labour.Triangle#getLeft_holds()
	 * @see #getTriangle()
	 * @generated
	 */
	EReference getTriangle_Left_holds();

	/**
	 * Returns the meta object for the containment reference list '{@link labour.labour.Triangle#getRight_holds <em>Right holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right holds</em>'.
	 * @see labour.labour.Triangle#getRight_holds()
	 * @see #getTriangle()
	 * @generated
	 */
	EReference getTriangle_Right_holds();

	/**
	 * Returns the meta object for the containment reference list '{@link labour.labour.Triangle#getBottom_holds <em>Bottom holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bottom holds</em>'.
	 * @see labour.labour.Triangle#getBottom_holds()
	 * @see #getTriangle()
	 * @generated
	 */
	EReference getTriangle_Bottom_holds();

	/**
	 * Returns the meta object for class '{@link labour.labour.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see labour.labour.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for class '{@link labour.labour.RouteStep <em>Route Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Step</em>'.
	 * @see labour.labour.RouteStep
	 * @generated
	 */
	EClass getRouteStep();

	/**
	 * Returns the meta object for class '{@link labour.labour.HoldStep <em>Hold Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hold Step</em>'.
	 * @see labour.labour.HoldStep
	 * @generated
	 */
	EClass getHoldStep();

	/**
	 * Returns the meta object for the reference '{@link labour.labour.HoldStep#getHold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hold</em>'.
	 * @see labour.labour.HoldStep#getHold()
	 * @see #getHoldStep()
	 * @generated
	 */
	EReference getHoldStep_Hold();

	/**
	 * Returns the meta object for class '{@link labour.labour.SplitStep <em>Split Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Step</em>'.
	 * @see labour.labour.SplitStep
	 * @generated
	 */
	EClass getSplitStep();

	/**
	 * Returns the meta object for the reference '{@link labour.labour.SplitStep#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see labour.labour.SplitStep#getLeft()
	 * @see #getSplitStep()
	 * @generated
	 */
	EReference getSplitStep_Left();

	/**
	 * Returns the meta object for the reference '{@link labour.labour.SplitStep#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see labour.labour.SplitStep#getRight()
	 * @see #getSplitStep()
	 * @generated
	 */
	EReference getSplitStep_Right();

	/**
	 * Returns the meta object for class '{@link labour.labour.AngularPosition <em>Angular Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angular Position</em>'.
	 * @see labour.labour.AngularPosition
	 * @generated
	 */
	EClass getAngularPosition();

	/**
	 * Returns the meta object for the attribute '{@link labour.labour.AngularPosition#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see labour.labour.AngularPosition#getAngle()
	 * @see #getAngularPosition()
	 * @generated
	 */
	EAttribute getAngularPosition_Angle();

	/**
	 * Returns the meta object for class '{@link labour.labour.CartesianPosition <em>Cartesian Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Position</em>'.
	 * @see labour.labour.CartesianPosition
	 * @generated
	 */
	EClass getCartesianPosition();

	/**
	 * Returns the meta object for the attribute '{@link labour.labour.CartesianPosition#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see labour.labour.CartesianPosition#getX()
	 * @see #getCartesianPosition()
	 * @generated
	 */
	EAttribute getCartesianPosition_X();

	/**
	 * Returns the meta object for the attribute '{@link labour.labour.CartesianPosition#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see labour.labour.CartesianPosition#getY()
	 * @see #getCartesianPosition()
	 * @generated
	 */
	EAttribute getCartesianPosition_Y();

	/**
	 * Returns the meta object for enum '{@link labour.labour.Colour <em>Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Colour</em>'.
	 * @see labour.labour.Colour
	 * @generated
	 */
	EEnum getColour();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	labourFactory getlabourFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link labour.labour.impl.BoulderingWallImpl <em>Bouldering Wall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labour.labour.impl.BoulderingWallImpl
		 * @see labour.labour.impl.labourPackageImpl#getBoulderingWall()
		 * @generated
		 */
		EClass BOULDERING_WALL = eINSTANCE.getBoulderingWall();

		/**
		 * The meta object literal for the '<em><b>Holds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOULDERING_WALL__HOLDS = eINSTANCE.getBoulderingWall_Holds();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOULDERING_WALL__ROUTES = eINSTANCE.getBoulderingWall_Routes();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOULDERING_WALL__VOLUMES = eINSTANCE.getBoulderingWall_Volumes();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOULDERING_WALL__ID = eINSTANCE.getBoulderingWall_ID();

		/**
		 * The meta object literal for the '{@link labour.labour.impl.HoldImpl <em>Hold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labour.labour.impl.HoldImpl
		 * @see labour.labour.impl.labourPackageImpl#getHold()
		 * @generated
		 */
		EClass HOLD = eINSTANCE.getHold();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLD__IDENTIFIER = eINSTANCE.getHold_Identifier();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOLD__POS = eINSTANCE.getHold_Pos();

		/**
		 * The meta object literal for the '<em><b>Shape identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLD__SHAPE_IDENTIFIER = eINSTANCE.getHold_Shape_identifier();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLD__ROTATION = eINSTANCE.getHold_Rotation();

		/**
		 * The meta object literal for the '<em><b>Colours</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLD__COLOURS = eINSTANCE.getHold_Colours();

		/**
		 * The meta object literal for the '<em><b>Start hold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLD__START_HOLD = eINSTANCE.getHold_Start_hold();

		/**
		 * The meta object literal for the '<em><b>End hold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLD__END_HOLD = eINSTANCE.getHold_End_hold();

		/**
		 * The meta object literal for the '{@link labour.labour.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labour.labour.impl.RouteImpl
		 * @see labour.labour.impl.labourPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__GRADE = eINSTANCE.getRoute_Grade();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__IDENTIFIER = eINSTANCE.getRoute_Identifier();

		/**
		 * The meta object literal for the '<em><b>Grid base point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__GRID_BASE_POINT = eINSTANCE.getRoute_Grid_base_point();

		/**
		 * The meta object literal for the '<em><b>Holds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__HOLDS = eINSTANCE.getRoute_Holds();

		/**
		 * The meta object literal for the '{@link labour.labour.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labour.labour.impl.VolumeImpl
		 * @see labour.labour.impl.labourPackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__DEPTH = eINSTANCE.getVolume_Depth();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME__POS = eINSTANCE.getVolume_Pos();

		/**
		 * The meta object literal for the '{@link labour.labour.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labour.labour.impl.CircleImpl
		 * @see labour.labour.impl.labourPackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__RADIUS = eINSTANCE.getCircle_Radius();

		/**
		 * The meta object literal for the '<em><b>Side holds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCLE__SIDE_HOLDS = eINSTANCE.getCircle_Side_holds();

		/**
		 * The meta object literal for the '<em><b>Front holds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCLE__FRONT_HOLDS = eINSTANCE.getCircle_Front_holds();

		/**
		 * The meta object literal for the '{@link labour.labour.impl.TriangleImpl <em>Triangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labour.labour.impl.TriangleImpl
		 * @see labour.labour.impl.labourPackageImpl#getTriangle()
		 * @generated
		 */
		EClass TRIANGLE = eINSTANCE.getTriangle();

		/**
		 * The meta object literal for the '<em><b>Corners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGLE__CORNERS = eINSTANCE.getTriangle_Corners();

		/**
		 * The meta object literal for the '<em><b>Extrusion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGLE__EXTRUSION = eINSTANCE.getTriangle_Extrusion();

		/**
		 * The meta object literal for the '<em><b>Left holds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGLE__LEFT_HOLDS = eINSTANCE.getTriangle_Left_holds();

		/**
		 * The meta object literal for the '<em><b>Right holds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGLE__RIGHT_HOLDS = eINSTANCE.getTriangle_Right_holds();

		/**
		 * The meta object literal for the '<em><b>Bottom holds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGLE__BOTTOM_HOLDS = eINSTANCE.getTriangle_Bottom_holds();

		/**
		 * The meta object literal for the '{@link labour.labour.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labour.labour.impl.PositionImpl
		 * @see labour.labour.impl.labourPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '{@link labour.labour.impl.RouteStepImpl <em>Route Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labour.labour.impl.RouteStepImpl
		 * @see labour.labour.impl.labourPackageImpl#getRouteStep()
		 * @generated
		 */
		EClass ROUTE_STEP = eINSTANCE.getRouteStep();

		/**
		 * The meta object literal for the '{@link labour.labour.impl.HoldStepImpl <em>Hold Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labour.labour.impl.HoldStepImpl
		 * @see labour.labour.impl.labourPackageImpl#getHoldStep()
		 * @generated
		 */
		EClass HOLD_STEP = eINSTANCE.getHoldStep();

		/**
		 * The meta object literal for the '<em><b>Hold</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOLD_STEP__HOLD = eINSTANCE.getHoldStep_Hold();

		/**
		 * The meta object literal for the '{@link labour.labour.impl.SplitStepImpl <em>Split Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labour.labour.impl.SplitStepImpl
		 * @see labour.labour.impl.labourPackageImpl#getSplitStep()
		 * @generated
		 */
		EClass SPLIT_STEP = eINSTANCE.getSplitStep();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_STEP__LEFT = eINSTANCE.getSplitStep_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_STEP__RIGHT = eINSTANCE.getSplitStep_Right();

		/**
		 * The meta object literal for the '{@link labour.labour.impl.AngularPositionImpl <em>Angular Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labour.labour.impl.AngularPositionImpl
		 * @see labour.labour.impl.labourPackageImpl#getAngularPosition()
		 * @generated
		 */
		EClass ANGULAR_POSITION = eINSTANCE.getAngularPosition();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGULAR_POSITION__ANGLE = eINSTANCE.getAngularPosition_Angle();

		/**
		 * The meta object literal for the '{@link labour.labour.impl.CartesianPositionImpl <em>Cartesian Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labour.labour.impl.CartesianPositionImpl
		 * @see labour.labour.impl.labourPackageImpl#getCartesianPosition()
		 * @generated
		 */
		EClass CARTESIAN_POSITION = eINSTANCE.getCartesianPosition();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_POSITION__X = eINSTANCE.getCartesianPosition_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_POSITION__Y = eINSTANCE.getCartesianPosition_Y();

		/**
		 * The meta object literal for the '{@link labour.labour.Colour <em>Colour</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see labour.labour.Colour
		 * @see labour.labour.impl.labourPackageImpl#getColour()
		 * @generated
		 */
		EEnum COLOUR = eINSTANCE.getColour();

	}

} //labourPackage
