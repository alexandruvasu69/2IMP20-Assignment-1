/**
 */
package labour.labour.provider;

import java.util.Collection;
import java.util.List;

import labour.labour.Triangle;
import labour.labour.labourFactory;
import labour.labour.labourPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link labour.labour.Triangle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TriangleItemProvider extends VolumeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriangleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCornersPropertyDescriptor(object);
			addExtrusionPropertyDescriptor(object);
			addLeft_holdsPropertyDescriptor(object);
			addRight_holdsPropertyDescriptor(object);
			addBottom_holdsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Corners feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCornersPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Triangle_corners_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Triangle_corners_feature",
								"_UI_Triangle_type"),
						labourPackage.Literals.TRIANGLE__CORNERS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Extrusion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtrusionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Triangle_extrusion_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Triangle_extrusion_feature",
								"_UI_Triangle_type"),
						labourPackage.Literals.TRIANGLE__EXTRUSION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Left holds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeft_holdsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Triangle_left_holds_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Triangle_left_holds_feature",
								"_UI_Triangle_type"),
						labourPackage.Literals.TRIANGLE__LEFT_HOLDS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Right holds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRight_holdsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Triangle_right_holds_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Triangle_right_holds_feature",
								"_UI_Triangle_type"),
						labourPackage.Literals.TRIANGLE__RIGHT_HOLDS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Bottom holds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBottom_holdsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Triangle_bottom_holds_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Triangle_bottom_holds_feature",
								"_UI_Triangle_type"),
						labourPackage.Literals.TRIANGLE__BOTTOM_HOLDS, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(labourPackage.Literals.TRIANGLE__CORNERS);
			childrenFeatures.add(labourPackage.Literals.TRIANGLE__EXTRUSION);
			childrenFeatures.add(labourPackage.Literals.TRIANGLE__LEFT_HOLDS);
			childrenFeatures.add(labourPackage.Literals.TRIANGLE__RIGHT_HOLDS);
			childrenFeatures.add(labourPackage.Literals.TRIANGLE__BOTTOM_HOLDS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Triangle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Triangle"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Triangle triangle = (Triangle) object;
		return getString("_UI_Triangle_type") + " " + triangle.getDepth();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Triangle.class)) {
		case labourPackage.TRIANGLE__CORNERS:
		case labourPackage.TRIANGLE__EXTRUSION:
		case labourPackage.TRIANGLE__LEFT_HOLDS:
		case labourPackage.TRIANGLE__RIGHT_HOLDS:
		case labourPackage.TRIANGLE__BOTTOM_HOLDS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(labourPackage.Literals.TRIANGLE__CORNERS,
				labourFactory.eINSTANCE.createAngularPosition()));

		newChildDescriptors.add(createChildParameter(labourPackage.Literals.TRIANGLE__CORNERS,
				labourFactory.eINSTANCE.createCartesianPosition()));

		newChildDescriptors.add(createChildParameter(labourPackage.Literals.TRIANGLE__EXTRUSION,
				labourFactory.eINSTANCE.createAngularPosition()));

		newChildDescriptors.add(createChildParameter(labourPackage.Literals.TRIANGLE__EXTRUSION,
				labourFactory.eINSTANCE.createCartesianPosition()));

		newChildDescriptors.add(createChildParameter(labourPackage.Literals.TRIANGLE__LEFT_HOLDS,
				labourFactory.eINSTANCE.createHold()));

		newChildDescriptors.add(createChildParameter(labourPackage.Literals.TRIANGLE__RIGHT_HOLDS,
				labourFactory.eINSTANCE.createHold()));

		newChildDescriptors.add(createChildParameter(labourPackage.Literals.TRIANGLE__BOTTOM_HOLDS,
				labourFactory.eINSTANCE.createHold()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == labourPackage.Literals.VOLUME__POS
				|| childFeature == labourPackage.Literals.TRIANGLE__CORNERS
				|| childFeature == labourPackage.Literals.TRIANGLE__EXTRUSION
				|| childFeature == labourPackage.Literals.TRIANGLE__LEFT_HOLDS
				|| childFeature == labourPackage.Literals.TRIANGLE__RIGHT_HOLDS
				|| childFeature == labourPackage.Literals.TRIANGLE__BOTTOM_HOLDS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
