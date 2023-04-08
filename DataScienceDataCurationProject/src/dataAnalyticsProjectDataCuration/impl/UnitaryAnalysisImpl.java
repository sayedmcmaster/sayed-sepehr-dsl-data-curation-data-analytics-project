/**
 */
package dataAnalyticsProjectDataCuration.impl;

import dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage;
import dataAnalyticsProjectDataCuration.UnitaryAnalysis;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unitary Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.UnitaryAnalysisImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.UnitaryAnalysisImpl#getAllowedMethods <em>Allowed Methods</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.UnitaryAnalysisImpl#getSelectedMethods <em>Selected Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitaryAnalysisImpl extends MinimalEObjectImpl.Container implements UnitaryAnalysis {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllowedMethods() <em>Allowed Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<String> allowedMethods;

	/**
	 * The cached value of the '{@link #getSelectedMethods() <em>Selected Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<String> selectedMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitaryAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataAnalyticsProjectDataCurationPackage.Literals.UNITARY_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.UNITARY_ANALYSIS__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllowedMethods() {
		if (allowedMethods == null) {
			allowedMethods = new EDataTypeUniqueEList<String>(String.class, this, DataAnalyticsProjectDataCurationPackage.UNITARY_ANALYSIS__ALLOWED_METHODS);
		}
		return allowedMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSelectedMethods() {
		if (selectedMethods == null) {
			selectedMethods = new EDataTypeUniqueEList<String>(String.class, this, DataAnalyticsProjectDataCurationPackage.UNITARY_ANALYSIS__SELECTED_METHODS);
		}
		return selectedMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataAnalyticsProjectDataCurationPackage.UNITARY_ANALYSIS__LABEL:
				return getLabel();
			case DataAnalyticsProjectDataCurationPackage.UNITARY_ANALYSIS__ALLOWED_METHODS:
				return getAllowedMethods();
			case DataAnalyticsProjectDataCurationPackage.UNITARY_ANALYSIS__SELECTED_METHODS:
				return getSelectedMethods();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataAnalyticsProjectDataCurationPackage.UNITARY_ANALYSIS__LABEL:
				setLabel((String)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.UNITARY_ANALYSIS__ALLOWED_METHODS:
				getAllowedMethods().clear();
				getAllowedMethods().addAll((Collection<? extends String>)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.UNITARY_ANALYSIS__SELECTED_METHODS:
				getSelectedMethods().clear();
				getSelectedMethods().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataAnalyticsProjectDataCurationPackage.UNITARY_ANALYSIS__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DataAnalyticsProjectDataCurationPackage.UNITARY_ANALYSIS__ALLOWED_METHODS:
				getAllowedMethods().clear();
				return;
			case DataAnalyticsProjectDataCurationPackage.UNITARY_ANALYSIS__SELECTED_METHODS:
				getSelectedMethods().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataAnalyticsProjectDataCurationPackage.UNITARY_ANALYSIS__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DataAnalyticsProjectDataCurationPackage.UNITARY_ANALYSIS__ALLOWED_METHODS:
				return allowedMethods != null && !allowedMethods.isEmpty();
			case DataAnalyticsProjectDataCurationPackage.UNITARY_ANALYSIS__SELECTED_METHODS:
				return selectedMethods != null && !selectedMethods.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Label: ");
		result.append(label);
		result.append(", allowedMethods: ");
		result.append(allowedMethods);
		result.append(", selectedMethods: ");
		result.append(selectedMethods);
		result.append(')');
		return result.toString();
	}

} //UnitaryAnalysisImpl
