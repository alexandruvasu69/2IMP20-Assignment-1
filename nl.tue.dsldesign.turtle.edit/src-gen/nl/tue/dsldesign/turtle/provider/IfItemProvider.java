/**
 */
package nl.tue.dsldesign.turtle.provider;

import java.util.Collection;
import java.util.List;

import nl.tue.dsldesign.turtle.If;
import nl.tue.dsldesign.turtle.TurtleFactory;
import nl.tue.dsldesign.turtle.TurtlePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link nl.tue.dsldesign.turtle.If} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(TurtlePackage.Literals.IF__COND);
			childrenFeatures.add(TurtlePackage.Literals.IF__THEN);
			childrenFeatures.add(TurtlePackage.Literals.IF__ELSE);
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
	 * This returns If.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/If"));
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
		return getString("_UI_If_type");
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

		switch (notification.getFeatureID(If.class)) {
		case TurtlePackage.IF__COND:
		case TurtlePackage.IF__THEN:
		case TurtlePackage.IF__ELSE:
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
				.add(createChildParameter(TurtlePackage.Literals.IF__COND, TurtleFactory.eINSTANCE.createBinary()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.IF__COND, TurtleFactory.eINSTANCE.createSqr()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.IF__COND, TurtleFactory.eINSTANCE.createSqrt()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.IF__COND, TurtleFactory.eINSTANCE.createArctan()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.IF__COND, TurtleFactory.eINSTANCE.createAbs()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.IF__COND, TurtleFactory.eINSTANCE.createVarRef()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.IF__COND, TurtleFactory.eINSTANCE.createRealConst()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.IF__THEN, TurtleFactory.eINSTANCE.createMove()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.IF__THEN, TurtleFactory.eINSTANCE.createTurnLeft()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.IF__THEN, TurtleFactory.eINSTANCE.createTurnRight()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.IF__THEN, TurtleFactory.eINSTANCE.createTurnToZero()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.IF__THEN, TurtleFactory.eINSTANCE.createIf()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.IF__THEN, TurtleFactory.eINSTANCE.createAssignment()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.IF__ELSE, TurtleFactory.eINSTANCE.createMove()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.IF__ELSE, TurtleFactory.eINSTANCE.createTurnLeft()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.IF__ELSE, TurtleFactory.eINSTANCE.createTurnRight()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.IF__ELSE, TurtleFactory.eINSTANCE.createTurnToZero()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.IF__ELSE, TurtleFactory.eINSTANCE.createIf()));

		newChildDescriptors
				.add(createChildParameter(TurtlePackage.Literals.IF__ELSE, TurtleFactory.eINSTANCE.createAssignment()));
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

		boolean qualify = childFeature == TurtlePackage.Literals.IF__THEN
				|| childFeature == TurtlePackage.Literals.IF__ELSE;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
