/**
 */
package dataAnalyticsProjectDataCuration.impl;

import dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage;
import dataAnalyticsProjectDataCuration.RSquare;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RSquare</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.RSquareImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.RSquareImpl#getValue <em>Value</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.RSquareImpl#getAdjustedRSquare <em>Adjusted RSquare</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.RSquareImpl#getCutOffForRSquare <em>Cut Off For RSquare</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.RSquareImpl#getIsDataFitForRegression <em>Is Data Fit For Regression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RSquareImpl extends MinimalEObjectImpl.Container implements RSquare {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdjustedRSquare() <em>Adjusted RSquare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustedRSquare()
	 * @generated
	 * @ordered
	 */
	protected static final double ADJUSTED_RSQUARE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAdjustedRSquare() <em>Adjusted RSquare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustedRSquare()
	 * @generated
	 * @ordered
	 */
	protected double adjustedRSquare = ADJUSTED_RSQUARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCutOffForRSquare() <em>Cut Off For RSquare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOffForRSquare()
	 * @generated
	 * @ordered
	 */
	protected static final double CUT_OFF_FOR_RSQUARE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCutOffForRSquare() <em>Cut Off For RSquare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOffForRSquare()
	 * @generated
	 * @ordered
	 */
	protected double cutOffForRSquare = CUT_OFF_FOR_RSQUARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDataFitForRegression() <em>Is Data Fit For Regression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDataFitForRegression()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_DATA_FIT_FOR_REGRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDataFitForRegression() <em>Is Data Fit For Regression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDataFitForRegression()
	 * @generated
	 * @ordered
	 */
	protected String isDataFitForRegression = IS_DATA_FIT_FOR_REGRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RSquareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataAnalyticsProjectDataCurationPackage.Literals.RSQUARE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.RSQUARE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.RSQUARE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAdjustedRSquare() {
		return adjustedRSquare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdjustedRSquare(double newAdjustedRSquare) {
		double oldAdjustedRSquare = adjustedRSquare;
		adjustedRSquare = newAdjustedRSquare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.RSQUARE__ADJUSTED_RSQUARE, oldAdjustedRSquare, adjustedRSquare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCutOffForRSquare() {
		return cutOffForRSquare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCutOffForRSquare(double newCutOffForRSquare) {
		double oldCutOffForRSquare = cutOffForRSquare;
		cutOffForRSquare = newCutOffForRSquare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.RSQUARE__CUT_OFF_FOR_RSQUARE, oldCutOffForRSquare, cutOffForRSquare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsDataFitForRegression() {
		return isDataFitForRegression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDataFitForRegression(String newIsDataFitForRegression) {
		String oldIsDataFitForRegression = isDataFitForRegression;
		isDataFitForRegression = newIsDataFitForRegression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.RSQUARE__IS_DATA_FIT_FOR_REGRESSION, oldIsDataFitForRegression, isDataFitForRegression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__LABEL:
				return getLabel();
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__VALUE:
				return getValue();
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__ADJUSTED_RSQUARE:
				return getAdjustedRSquare();
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__CUT_OFF_FOR_RSQUARE:
				return getCutOffForRSquare();
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__IS_DATA_FIT_FOR_REGRESSION:
				return getIsDataFitForRegression();
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
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__LABEL:
				setLabel((String)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__VALUE:
				setValue((Double)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__ADJUSTED_RSQUARE:
				setAdjustedRSquare((Double)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__CUT_OFF_FOR_RSQUARE:
				setCutOffForRSquare((Double)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__IS_DATA_FIT_FOR_REGRESSION:
				setIsDataFitForRegression((String)newValue);
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
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__ADJUSTED_RSQUARE:
				setAdjustedRSquare(ADJUSTED_RSQUARE_EDEFAULT);
				return;
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__CUT_OFF_FOR_RSQUARE:
				setCutOffForRSquare(CUT_OFF_FOR_RSQUARE_EDEFAULT);
				return;
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__IS_DATA_FIT_FOR_REGRESSION:
				setIsDataFitForRegression(IS_DATA_FIT_FOR_REGRESSION_EDEFAULT);
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
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__VALUE:
				return value != VALUE_EDEFAULT;
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__ADJUSTED_RSQUARE:
				return adjustedRSquare != ADJUSTED_RSQUARE_EDEFAULT;
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__CUT_OFF_FOR_RSQUARE:
				return cutOffForRSquare != CUT_OFF_FOR_RSQUARE_EDEFAULT;
			case DataAnalyticsProjectDataCurationPackage.RSQUARE__IS_DATA_FIT_FOR_REGRESSION:
				return IS_DATA_FIT_FOR_REGRESSION_EDEFAULT == null ? isDataFitForRegression != null : !IS_DATA_FIT_FOR_REGRESSION_EDEFAULT.equals(isDataFitForRegression);
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
		result.append(", value: ");
		result.append(value);
		result.append(", adjustedRSquare: ");
		result.append(adjustedRSquare);
		result.append(", cutOffForRSquare: ");
		result.append(cutOffForRSquare);
		result.append(", isDataFitForRegression: ");
		result.append(isDataFitForRegression);
		result.append(')');
		return result.toString();
	}

} //RSquareImpl
