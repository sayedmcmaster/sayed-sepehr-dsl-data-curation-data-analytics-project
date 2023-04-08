/**
 */
package dataCurationStateTransitionAction.provider;


import dataCurationStateTransitionAction.DataCurationStateTransitionActionFactory;
import dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage;
import dataCurationStateTransitionAction.ExploratoryDataAnalysis;

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
 * This is the item provider adapter for a {@link dataCurationStateTransitionAction.ExploratoryDataAnalysis} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExploratoryDataAnalysisItemProvider 
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
	public ExploratoryDataAnalysisItemProvider(AdapterFactory adapterFactory) {
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
			addInitialStatePropertyDescriptor(object);
			addFinalStatePropertyDescriptor(object);
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
				 getString("_UI_ExploratoryDataAnalysis_Label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExploratoryDataAnalysis_Label_feature", "_UI_ExploratoryDataAnalysis_type"),
				 DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initial State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExploratoryDataAnalysis_initialState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExploratoryDataAnalysis_initialState_feature", "_UI_ExploratoryDataAnalysis_type"),
				 DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__INITIAL_STATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Final State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinalStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExploratoryDataAnalysis_finalState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExploratoryDataAnalysis_finalState_feature", "_UI_ExploratoryDataAnalysis_type"),
				 DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__FINAL_STATE,
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_ExploratoryDataAnalysis_states_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExploratoryDataAnalysis_states_feature", "_UI_ExploratoryDataAnalysis_type"),
				 DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__STATES,
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
				 getString("_UI_ExploratoryDataAnalysis_transitions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExploratoryDataAnalysis_transitions_feature", "_UI_ExploratoryDataAnalysis_type"),
				 DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__TRANSITIONS,
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
				 getString("_UI_ExploratoryDataAnalysis_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExploratoryDataAnalysis_source_feature", "_UI_ExploratoryDataAnalysis_type"),
				 DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__SOURCE,
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
				 getString("_UI_ExploratoryDataAnalysis_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExploratoryDataAnalysis_target_feature", "_UI_ExploratoryDataAnalysis_type"),
				 DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__TARGET,
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
			childrenFeatures.add(DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__RSQUARE);
			childrenFeatures.add(DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE);
			childrenFeatures.add(DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS);
			childrenFeatures.add(DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS);
			childrenFeatures.add(DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION);
			childrenFeatures.add(DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION);
			childrenFeatures.add(DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION);
			childrenFeatures.add(DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__ACTION_TO_TAKE);
			childrenFeatures.add(DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__EVENT_TO_TAKE);
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
	 * This returns ExploratoryDataAnalysis.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExploratoryDataAnalysis"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ExploratoryDataAnalysis)object).getLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_ExploratoryDataAnalysis_type") :
			getString("_UI_ExploratoryDataAnalysis_type") + " " + label;
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

		switch (notification.getFeatureID(ExploratoryDataAnalysis.class)) {
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__LABEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__RSQUARE:
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE:
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS:
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS:
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION:
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION:
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION:
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__ACTION_TO_TAKE:
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__EVENT_TO_TAKE:
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
				(DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__RSQUARE,
				 DataCurationStateTransitionActionFactory.eINSTANCE.createRSquare()));

		newChildDescriptors.add
			(createChildParameter
				(DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE,
				 DataCurationStateTransitionActionFactory.eINSTANCE.createPValueFSignificance()));

		newChildDescriptors.add
			(createChildParameter
				(DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS,
				 DataCurationStateTransitionActionFactory.eINSTANCE.createUnitaryAnalysis()));

		newChildDescriptors.add
			(createChildParameter
				(DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS,
				 DataCurationStateTransitionActionFactory.eINSTANCE.createBiVariateAnalysis()));

		newChildDescriptors.add
			(createChildParameter
				(DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION,
				 DataCurationStateTransitionActionFactory.eINSTANCE.createUnivariateVisualization()));

		newChildDescriptors.add
			(createChildParameter
				(DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION,
				 DataCurationStateTransitionActionFactory.eINSTANCE.createBiVariateVisualization()));

		newChildDescriptors.add
			(createChildParameter
				(DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION,
				 DataCurationStateTransitionActionFactory.eINSTANCE.createNormalizationStandardization()));

		newChildDescriptors.add
			(createChildParameter
				(DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__ACTION_TO_TAKE,
				 DataCurationStateTransitionActionFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS__EVENT_TO_TAKE,
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
