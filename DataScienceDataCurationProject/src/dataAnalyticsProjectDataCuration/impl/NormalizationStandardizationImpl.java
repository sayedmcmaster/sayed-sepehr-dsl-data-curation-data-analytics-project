/**
 */
package dataAnalyticsProjectDataCuration.impl;

import dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage;
import dataAnalyticsProjectDataCuration.NormalizationStandardization;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normalization Standardization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.NormalizationStandardizationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.NormalizationStandardizationImpl#isNormalizeFrom0To1 <em>Normalize From0 To1</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.NormalizationStandardizationImpl#isStandardizeFromMinus1To1 <em>Standardize From Minus1 To1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalizationStandardizationImpl extends MinimalEObjectImpl.Container implements NormalizationStandardization {
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
	 * The default value of the '{@link #isNormalizeFrom0To1() <em>Normalize From0 To1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormalizeFrom0To1()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NORMALIZE_FROM0_TO1_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNormalizeFrom0To1() <em>Normalize From0 To1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormalizeFrom0To1()
	 * @generated
	 * @ordered
	 */
	protected boolean normalizeFrom0To1 = NORMALIZE_FROM0_TO1_EDEFAULT;

	/**
	 * The default value of the '{@link #isStandardizeFromMinus1To1() <em>Standardize From Minus1 To1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStandardizeFromMinus1To1()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STANDARDIZE_FROM_MINUS1_TO1_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStandardizeFromMinus1To1() <em>Standardize From Minus1 To1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStandardizeFromMinus1To1()
	 * @generated
	 * @ordered
	 */
	protected boolean standardizeFromMinus1To1 = STANDARDIZE_FROM_MINUS1_TO1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalizationStandardizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataAnalyticsProjectDataCurationPackage.Literals.NORMALIZATION_STANDARDIZATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.NORMALIZATION_STANDARDIZATION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNormalizeFrom0To1() {
		return normalizeFrom0To1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalizeFrom0To1(boolean newNormalizeFrom0To1) {
		boolean oldNormalizeFrom0To1 = normalizeFrom0To1;
		normalizeFrom0To1 = newNormalizeFrom0To1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.NORMALIZATION_STANDARDIZATION__NORMALIZE_FROM0_TO1, oldNormalizeFrom0To1, normalizeFrom0To1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStandardizeFromMinus1To1() {
		return standardizeFromMinus1To1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardizeFromMinus1To1(boolean newStandardizeFromMinus1To1) {
		boolean oldStandardizeFromMinus1To1 = standardizeFromMinus1To1;
		standardizeFromMinus1To1 = newStandardizeFromMinus1To1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.NORMALIZATION_STANDARDIZATION__STANDARDIZE_FROM_MINUS1_TO1, oldStandardizeFromMinus1To1, standardizeFromMinus1To1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataAnalyticsProjectDataCurationPackage.NORMALIZATION_STANDARDIZATION__LABEL:
				return getLabel();
			case DataAnalyticsProjectDataCurationPackage.NORMALIZATION_STANDARDIZATION__NORMALIZE_FROM0_TO1:
				return isNormalizeFrom0To1();
			case DataAnalyticsProjectDataCurationPackage.NORMALIZATION_STANDARDIZATION__STANDARDIZE_FROM_MINUS1_TO1:
				return isStandardizeFromMinus1To1();
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
			case DataAnalyticsProjectDataCurationPackage.NORMALIZATION_STANDARDIZATION__LABEL:
				setLabel((String)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.NORMALIZATION_STANDARDIZATION__NORMALIZE_FROM0_TO1:
				setNormalizeFrom0To1((Boolean)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.NORMALIZATION_STANDARDIZATION__STANDARDIZE_FROM_MINUS1_TO1:
				setStandardizeFromMinus1To1((Boolean)newValue);
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
			case DataAnalyticsProjectDataCurationPackage.NORMALIZATION_STANDARDIZATION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DataAnalyticsProjectDataCurationPackage.NORMALIZATION_STANDARDIZATION__NORMALIZE_FROM0_TO1:
				setNormalizeFrom0To1(NORMALIZE_FROM0_TO1_EDEFAULT);
				return;
			case DataAnalyticsProjectDataCurationPackage.NORMALIZATION_STANDARDIZATION__STANDARDIZE_FROM_MINUS1_TO1:
				setStandardizeFromMinus1To1(STANDARDIZE_FROM_MINUS1_TO1_EDEFAULT);
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
			case DataAnalyticsProjectDataCurationPackage.NORMALIZATION_STANDARDIZATION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DataAnalyticsProjectDataCurationPackage.NORMALIZATION_STANDARDIZATION__NORMALIZE_FROM0_TO1:
				return normalizeFrom0To1 != NORMALIZE_FROM0_TO1_EDEFAULT;
			case DataAnalyticsProjectDataCurationPackage.NORMALIZATION_STANDARDIZATION__STANDARDIZE_FROM_MINUS1_TO1:
				return standardizeFromMinus1To1 != STANDARDIZE_FROM_MINUS1_TO1_EDEFAULT;
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
		result.append(", normalizeFrom0To1: ");
		result.append(normalizeFrom0To1);
		result.append(", standardizeFromMinus1To1: ");
		result.append(standardizeFromMinus1To1);
		result.append(')');
		return result.toString();
	}

} //NormalizationStandardizationImpl
