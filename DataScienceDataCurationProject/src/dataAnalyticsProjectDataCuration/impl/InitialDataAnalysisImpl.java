/**
 */
package dataAnalyticsProjectDataCuration.impl;

import dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage;
import dataAnalyticsProjectDataCuration.InitialDataAnalysis;
import dataAnalyticsProjectDataCuration.MissingValues;
import dataAnalyticsProjectDataCuration.NullValues;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Data Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.InitialDataAnalysisImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.InitialDataAnalysisImpl#getNullValues <em>Null Values</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.InitialDataAnalysisImpl#getMissingValues <em>Missing Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialDataAnalysisImpl extends MinimalEObjectImpl.Container implements InitialDataAnalysis {
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
	 * The cached value of the '{@link #getNullValues() <em>Null Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullValues()
	 * @generated
	 * @ordered
	 */
	protected NullValues nullValues;

	/**
	 * The cached value of the '{@link #getMissingValues() <em>Missing Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingValues()
	 * @generated
	 * @ordered
	 */
	protected MissingValues missingValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialDataAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataAnalyticsProjectDataCurationPackage.Literals.INITIAL_DATA_ANALYSIS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullValues getNullValues() {
		return nullValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNullValues(NullValues newNullValues, NotificationChain msgs) {
		NullValues oldNullValues = nullValues;
		nullValues = newNullValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__NULL_VALUES, oldNullValues, newNullValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullValues(NullValues newNullValues) {
		if (newNullValues != nullValues) {
			NotificationChain msgs = null;
			if (nullValues != null)
				msgs = ((InternalEObject)nullValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__NULL_VALUES, null, msgs);
			if (newNullValues != null)
				msgs = ((InternalEObject)newNullValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__NULL_VALUES, null, msgs);
			msgs = basicSetNullValues(newNullValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__NULL_VALUES, newNullValues, newNullValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissingValues getMissingValues() {
		return missingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMissingValues(MissingValues newMissingValues, NotificationChain msgs) {
		MissingValues oldMissingValues = missingValues;
		missingValues = newMissingValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__MISSING_VALUES, oldMissingValues, newMissingValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissingValues(MissingValues newMissingValues) {
		if (newMissingValues != missingValues) {
			NotificationChain msgs = null;
			if (missingValues != null)
				msgs = ((InternalEObject)missingValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__MISSING_VALUES, null, msgs);
			if (newMissingValues != null)
				msgs = ((InternalEObject)newMissingValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__MISSING_VALUES, null, msgs);
			msgs = basicSetMissingValues(newMissingValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__MISSING_VALUES, newMissingValues, newMissingValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__NULL_VALUES:
				return basicSetNullValues(null, msgs);
			case DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__MISSING_VALUES:
				return basicSetMissingValues(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__LABEL:
				return getLabel();
			case DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__NULL_VALUES:
				return getNullValues();
			case DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__MISSING_VALUES:
				return getMissingValues();
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
			case DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__LABEL:
				setLabel((String)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__NULL_VALUES:
				setNullValues((NullValues)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__MISSING_VALUES:
				setMissingValues((MissingValues)newValue);
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
			case DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__NULL_VALUES:
				setNullValues((NullValues)null);
				return;
			case DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__MISSING_VALUES:
				setMissingValues((MissingValues)null);
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
			case DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__NULL_VALUES:
				return nullValues != null;
			case DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS__MISSING_VALUES:
				return missingValues != null;
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
		result.append(')');
		return result.toString();
	}

} //InitialDataAnalysisImpl
