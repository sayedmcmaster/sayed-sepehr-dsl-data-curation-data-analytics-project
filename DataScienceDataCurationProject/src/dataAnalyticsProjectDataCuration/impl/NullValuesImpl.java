/**
 */
package dataAnalyticsProjectDataCuration.impl;

import dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage;
import dataAnalyticsProjectDataCuration.NullValues;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Null Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.NullValuesImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.NullValuesImpl#isRemoveRow <em>Remove Row</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.NullValuesImpl#getReplacementMethod <em>Replacement Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NullValuesImpl extends MinimalEObjectImpl.Container implements NullValues {
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
	 * The default value of the '{@link #isRemoveRow() <em>Remove Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveRow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_ROW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoveRow() <em>Remove Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveRow()
	 * @generated
	 * @ordered
	 */
	protected boolean removeRow = REMOVE_ROW_EDEFAULT;

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
	protected NullValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataAnalyticsProjectDataCurationPackage.Literals.NULL_VALUES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.NULL_VALUES__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemoveRow() {
		return removeRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveRow(boolean newRemoveRow) {
		boolean oldRemoveRow = removeRow;
		removeRow = newRemoveRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.NULL_VALUES__REMOVE_ROW, oldRemoveRow, removeRow));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.NULL_VALUES__REPLACEMENT_METHOD, oldReplacementMethod, replacementMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataAnalyticsProjectDataCurationPackage.NULL_VALUES__LABEL:
				return getLabel();
			case DataAnalyticsProjectDataCurationPackage.NULL_VALUES__REMOVE_ROW:
				return isRemoveRow();
			case DataAnalyticsProjectDataCurationPackage.NULL_VALUES__REPLACEMENT_METHOD:
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
			case DataAnalyticsProjectDataCurationPackage.NULL_VALUES__LABEL:
				setLabel((String)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.NULL_VALUES__REMOVE_ROW:
				setRemoveRow((Boolean)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.NULL_VALUES__REPLACEMENT_METHOD:
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
			case DataAnalyticsProjectDataCurationPackage.NULL_VALUES__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DataAnalyticsProjectDataCurationPackage.NULL_VALUES__REMOVE_ROW:
				setRemoveRow(REMOVE_ROW_EDEFAULT);
				return;
			case DataAnalyticsProjectDataCurationPackage.NULL_VALUES__REPLACEMENT_METHOD:
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
			case DataAnalyticsProjectDataCurationPackage.NULL_VALUES__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DataAnalyticsProjectDataCurationPackage.NULL_VALUES__REMOVE_ROW:
				return removeRow != REMOVE_ROW_EDEFAULT;
			case DataAnalyticsProjectDataCurationPackage.NULL_VALUES__REPLACEMENT_METHOD:
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
		result.append(", removeRow: ");
		result.append(removeRow);
		result.append(", replacementMethod: ");
		result.append(replacementMethod);
		result.append(')');
		return result.toString();
	}

} //NullValuesImpl
