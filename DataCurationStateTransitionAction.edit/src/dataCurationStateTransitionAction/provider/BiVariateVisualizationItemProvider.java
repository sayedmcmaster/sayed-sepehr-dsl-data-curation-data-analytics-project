/**
 */
package dataCurationStateTransitionAction.provider;


import dataCurationStateTransitionAction.BiVariateVisualization;
import dataCurationStateTransitionAction.DataCurationStateTransitionActionFactory;
import dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dataCurationStateTransitionAction.BiVariateVisualization} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BiVariateVisualizationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiVariateVisualizationItemProvider(AdapterFactory adapterFactory) {
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

			addLabelPropertyDescriptor(object);
			addMethodPropertyDescriptor(object);
			addShowLegendPropertyDescriptor(object);
			addShowTitlePropertyDescriptor(object);
			addStatesPropertyDescriptor(object);
			addTransitionsPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BiVariateVisualization_Label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BiVariateVisualization_Label_feature", "_UI_BiVariateVisualization_type"),
				 DataCurationStateTransitionActionPackage.Literals.BI_VARIATE_VISUALIZATION__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BiVariateVisualization_method_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BiVariateVisualization_method_feature", "_UI_BiVariateVisualization_type"),
				 DataCurationStateTransitionActionPackage.Literals.BI_VARIATE_VISUALIZATION__METHOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Legend feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowLegendPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BiVariateVisualization_showLegend_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BiVariateVisualization_showLegend_feature", "_UI_BiVariateVisualization_type"),
				 DataCurationStateTransitionActionPackage.Literals.BI_VARIATE_VISUALIZATION__SHOW_LEGEND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BiVariateVisualization_showTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BiVariateVisualization_showTitle_feature", "_UI_BiVariateVisualization_type"),
				 DataCurationStateTransitionActionPackage.Literals.BI_VARIATE_VISUALIZATION__SHOW_TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the States feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BiVariateVisualization_states_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BiVariateVisualization_states_feature", "_UI_BiVariateVisualization_type"),
				 DataCurationStateTransitionActionPackage.Literals.BI_VARIATE_VISUALIZATION__STATES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BiVariateVisualization_transitions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BiVariateVisualization_transitions_feature", "_UI_BiVariateVisualization_type"),
				 DataCurationStateTransitionActionPackage.Literals.BI_VARIATE_VISUALIZATION__TRANSITIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BiVariateVisualization_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BiVariateVisualization_source_feature", "_UI_BiVariateVisualization_type"),
				 DataCurationStateTransitionActionPackage.Literals.BI_VARIATE_VISUALIZATION__SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BiVariateVisualization_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BiVariateVisualization_target_feature", "_UI_BiVariateVisualization_type"),
				 DataCurationStateTransitionActionPackage.Literals.BI_VARIATE_VISUALIZATION__TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(DataCurationStateTransitionActionPackage.Literals.BI_VARIATE_VISUALIZATION__ACTION_TO_TAKE);
			childrenFeatures.add(DataCurationStateTransitionActionPackage.Literals.BI_VARIATE_VISUALIZATION__EVENT_TO_TAKE);
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
	 * This returns BiVariateVisualization.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BiVariateVisualization"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BiVariateVisualization)object).getLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_BiVariateVisualization_type") :
			getString("_UI_BiVariateVisualization_type") + " " + label;
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

		switch (notification.getFeatureID(BiVariateVisualization.class)) {
			case DataCurationStateTransitionActionPackage.BI_VARIATE_VISUALIZATION__LABEL:
			case DataCurationStateTransitionActionPackage.BI_VARIATE_VISUALIZATION__METHOD:
			case DataCurationStateTransitionActionPackage.BI_VARIATE_VISUALIZATION__SHOW_LEGEND:
			case DataCurationStateTransitionActionPackage.BI_VARIATE_VISUALIZATION__SHOW_TITLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DataCurationStateTransitionActionPackage.BI_VARIATE_VISUALIZATION__ACTION_TO_TAKE:
			case DataCurationStateTransitionActionPackage.BI_VARIATE_VISUALIZATION__EVENT_TO_TAKE:
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

		newChildDescriptors.add
			(createChildParameter
				(DataCurationStateTransitionActionPackage.Literals.BI_VARIATE_VISUALIZATION__ACTION_TO_TAKE,
				 DataCurationStateTransitionActionFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(DataCurationStateTransitionActionPackage.Literals.BI_VARIATE_VISUALIZATION__EVENT_TO_TAKE,
				 DataCurationStateTransitionActionFactory.eINSTANCE.createEvent()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DataCurationStateTransitionActionEditPlugin.INSTANCE;
	}

}
