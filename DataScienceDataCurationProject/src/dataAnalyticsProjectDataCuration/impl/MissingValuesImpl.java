/**
 */
package dataAnalyticsProjectDataCuration.impl;

import dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage;
import dataAnalyticsProjectDataCuration.MissingValues;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Missing Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.MissingValuesImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.MissingValuesImpl#isRemoveRows <em>Remove Rows</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.MissingValuesImpl#getReplacementMethod <em>Replacement Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissingValuesImpl extends MinimalEObjectImpl.Container implements MissingValues {
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
	 * The default value of the '{@link #isRemoveRows() <em>Remove Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveRows()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_ROWS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoveRows() <em>Remove Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveRows()
	 * @generated
	 * @ordered
	 */
	protected boolean removeRows = REMOVE_ROWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplacementMethod() <em>Replacement Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLACEMENT_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplacementMethod() <em>Replacement Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementMethod()
	 * @generated
	 * @ordered
	 */
	protected String replacementMethod = REPLACEMENT_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissingValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataAnalyticsProjectDataCurationPackage.Literals.MISSING_VALUES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.MISSING_VALUES__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemoveRows() {
		return removeRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveRows(boolean newRemoveRows) {
		boolean oldRemoveRows = removeRows;
		removeRows = newRemoveRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.MISSING_VALUES__REMOVE_ROWS, oldRemoveRows, removeRows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReplacementMethod() {
		return replacementMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacementMethod(String newReplacementMethod) {
		String oldReplacementMethod = replacementMethod;
		replacementMethod = newReplacementMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.MISSING_VALUES__REPLACEMENT_METHOD, oldReplacementMethod, replacementMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataAnalyticsProjectDataCurationPackage.MISSING_VALUES__LABEL:
				return getLabel();
			case DataAnalyticsProjectDataCurationPackage.MISSING_VALUES__REMOVE_ROWS:
				return isRemoveRows();
			case DataAnalyticsProjectDataCurationPackage.MISSING_VALUES__REPLACEMENT_METHOD:
				return getReplacementMethod();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataAnalyticsProjectDataCurationPackage.MISSING_VALUES__LABEL:
				setLabel((String)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.MISSING_VALUES__REMOVE_ROWS:
				setRemoveRows((Boolean)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.MISSING_VALUES__REPLACEMENT_METHOD:
				setReplacementMethod((String)newValue);
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
			case DataAnalyticsProjectDataCurationPackage.MISSING_VALUES__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DataAnalyticsProjectDataCurationPackage.MISSING_VALUES__REMOVE_ROWS:
				setRemoveRows(REMOVE_ROWS_EDEFAULT);
				return;
			case DataAnalyticsProjectDataCurationPackage.MISSING_VALUES__REPLACEMENT_METHOD:
				setReplacementMethod(REPLACEMENT_METHOD_EDEFAULT);
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
			case DataAnalyticsProjectDataCurationPackage.MISSING_VALUES__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DataAnalyticsProjectDataCurationPackage.MISSING_VALUES__REMOVE_ROWS:
				return removeRows != REMOVE_ROWS_EDEFAULT;
			case DataAnalyticsProjectDataCurationPackage.MISSING_VALUES__REPLACEMENT_METHOD:
				return REPLACEMENT_METHOD_EDEFAULT == null ? replacementMethod != null : !REPLACEMENT_METHOD_EDEFAULT.equals(replacementMethod);
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
		result.append(", removeRows: ");
		result.append(removeRows);
		result.append(", replacementMethod: ");
		result.append(replacementMethod);
		result.append(')');
		return result.toString();
	}

} //MissingValuesImpl
