/**
 */
package labour.labour.util;

import labour.labour.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see labour.labour.labourPackage
 * @generated
 */
public class labourAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static labourPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public labourAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = labourPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected labourSwitch<Adapter> modelSwitch = new labourSwitch<Adapter>() {
		@Override
		public Adapter caseBoulderingWall(BoulderingWall object) {
			return createBoulderingWallAdapter();
		}

		@Override
		public Adapter caseHold(Hold object) {
			return createHoldAdapter();
		}

		@Override
		public Adapter caseRoute(Route object) {
			return createRouteAdapter();
		}

		@Override
		public Adapter caseVolume(Volume object) {
			return createVolumeAdapter();
		}

		@Override
		public Adapter caseCircle(Circle object) {
			return createCircleAdapter();
		}

		@Override
		public Adapter caseTriangle(Triangle object) {
			return createTriangleAdapter();
		}

		@Override
		public Adapter casePosition(Position object) {
			return createPositionAdapter();
		}

		@Override
		public Adapter caseRouteStep(RouteStep object) {
			return createRouteStepAdapter();
		}

		@Override
		public Adapter caseHoldStep(HoldStep object) {
			return createHoldStepAdapter();
		}

		@Override
		public Adapter caseSplitStep(SplitStep object) {
			return createSplitStepAdapter();
		}

		@Override
		public Adapter caseAngularPosition(AngularPosition object) {
			return createAngularPositionAdapter();
		}

		@Override
		public Adapter caseCartesianPosition(CartesianPosition object) {
			return createCartesianPositionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link labour.labour.BoulderingWall <em>Bouldering Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labour.labour.BoulderingWall
	 * @generated
	 */
	public Adapter createBoulderingWallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labour.labour.Hold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labour.labour.Hold
	 * @generated
	 */
	public Adapter createHoldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labour.labour.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labour.labour.Route
	 * @generated
	 */
	public Adapter createRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labour.labour.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labour.labour.Volume
	 * @generated
	 */
	public Adapter createVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labour.labour.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labour.labour.Circle
	 * @generated
	 */
	public Adapter createCircleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labour.labour.Triangle <em>Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labour.labour.Triangle
	 * @generated
	 */
	public Adapter createTriangleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labour.labour.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labour.labour.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labour.labour.RouteStep <em>Route Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labour.labour.RouteStep
	 * @generated
	 */
	public Adapter createRouteStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labour.labour.HoldStep <em>Hold Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labour.labour.HoldStep
	 * @generated
	 */
	public Adapter createHoldStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labour.labour.SplitStep <em>Split Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labour.labour.SplitStep
	 * @generated
	 */
	public Adapter createSplitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labour.labour.AngularPosition <em>Angular Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labour.labour.AngularPosition
	 * @generated
	 */
	public Adapter createAngularPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link labour.labour.CartesianPosition <em>Cartesian Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see labour.labour.CartesianPosition
	 * @generated
	 */
	public Adapter createCartesianPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //labourAdapterFactory
