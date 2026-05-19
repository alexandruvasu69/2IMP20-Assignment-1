/**
 */
package nl.tue.dsldesign.turtle.provider;

import java.util.Collection;
import java.util.List;

import nl.tue.dsldesign.turtle.Binary;
import nl.tue.dsldesign.turtle.Operation;
import nl.tue.dsldesign.turtle.TurtleFactory;
import nl.tue.dsldesign.turtle.TurtlePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link nl.tue.dsldesign.turtle.Binary} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryItemProvider extends ExprItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryItemProvider(AdapterFactory adapterFactory) {
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

			addOperationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Binary_operation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Binary_operation_feature",
								"_UI_Binary_type"),
						TurtlePackage.Literals.BINARY__OPERATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(TurtlePackage.Literals.BINARY__LEFT);
			childrenFeatures.add(TurtlePackage.Literals.BINARY__RIGHT);
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
	 * This returns Binary.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Binary"));
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
		Operation labelValue = ((Binary) object).getOperation();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_Binary_type")
				: getString("_UI_Binary_type") + " " + label;
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

		switch (notification.getFeatureID(Binary.class)) {
		case TurtlePackage.BINARY__OPERATION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TurtlePackage.BINARY__LEFT:
		case TurtlePackage.BINARY__RIGHT:
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

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.BINARY__LEFT, TurtleFactory.eINSTANCE.createBinary()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.BINARY__LEFT, TurtleFactory.eINSTANCE.createSqr()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.BINARY__LEFT, TurtleFactory.eINSTANCE.createSqrt()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.BINARY__LEFT, TurtleFactory.eINSTANCE.createArctan()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.BINARY__LEFT, TurtleFactory.eINSTANCE.createAbs()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.BINARY__LEFT, TurtleFactory.eINSTANCE.createVarRef()));

		newChildDescriptors.add(
				createChildParameter(TurtlePackage.Literals.BINARY__LEFT, TurtleFactory.eINSTANCE.createRealConst()));

		newChildDescriptors.add(
				createChildParameter(TurtlePackage.Literals.BINARY__RIGHT, TurtleFactory.eINSTANCE.createBinary()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.BINARY__RIGHT, TurtleFactory.eINSTANCE.createSqr()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.BINARY__RIGHT, TurtleFactory.eINSTANCE.createSqrt()));

		newChildDescriptors.add(
				createChildParameter(TurtlePackage.Literals.BINARY__RIGHT, TurtleFactory.eINSTANCE.createArctan()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.BINARY__RIGHT, TurtleFactory.eINSTANCE.createAbs()));

		newChildDescriptors.add(
				createChildParameter(TurtlePackage.Literals.BINARY__RIGHT, TurtleFactory.eINSTANCE.createVarRef()));

		newChildDescriptors.add(
				createChildParameter(TurtlePackage.Literals.BINARY__RIGHT, TurtleFactory.eINSTANCE.createRealConst()));
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

		boolean qualify = childFeature == TurtlePackage.Literals.BINARY__LEFT
				|| childFeature == TurtlePackage.Literals.BINARY__RIGHT;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
