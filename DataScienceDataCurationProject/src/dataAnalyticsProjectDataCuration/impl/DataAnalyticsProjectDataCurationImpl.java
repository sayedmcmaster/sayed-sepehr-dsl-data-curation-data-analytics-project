/**
 */
package dataAnalyticsProjectDataCuration.impl;

import dataAnalyticsProjectDataCuration.Data;
import dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration;
import dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage;
import dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis;
import dataAnalyticsProjectDataCuration.InitialDataAnalysis;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Analytics Project Data Curation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationImpl#getData <em>Data</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationImpl#getIda <em>Ida</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationImpl#getEda <em>Eda</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAnalyticsProjectDataCurationImpl extends MinimalEObjectImpl.Container implements DataAnalyticsProjectDataCuration {
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
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Data data;

	/**
	 * The cached value of the '{@link #getIda() <em>Ida</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIda()
	 * @generated
	 * @ordered
	 */
	protected InitialDataAnalysis ida;

	/**
	 * The cached value of the '{@link #getEda() <em>Eda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEda()
	 * @generated
	 * @ordered
	 */
	protected ExploratoryDataAnalysis eda;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAnalyticsProjectDataCurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataAnalyticsProjectDataCurationPackage.Literals.DATA_ANALYTICS_PROJECT_DATA_CURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(Data newData, NotificationChain msgs) {
		Data oldData = data;
		data = newData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__DATA, oldData, newData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Data newData) {
		if (newData != data) {
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__DATA, null, msgs);
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__DATA, null, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialDataAnalysis getIda() {
		return ida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIda(InitialDataAnalysis newIda, NotificationChain msgs) {
		InitialDataAnalysis oldIda = ida;
		ida = newIda;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__IDA, oldIda, newIda);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIda(InitialDataAnalysis newIda) {
		if (newIda != ida) {
			NotificationChain msgs = null;
			if (ida != null)
				msgs = ((InternalEObject)ida).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__IDA, null, msgs);
			if (newIda != null)
				msgs = ((InternalEObject)newIda).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__IDA, null, msgs);
			msgs = basicSetIda(newIda, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__IDA, newIda, newIda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExploratoryDataAnalysis getEda() {
		return eda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEda(ExploratoryDataAnalysis newEda, NotificationChain msgs) {
		ExploratoryDataAnalysis oldEda = eda;
		eda = newEda;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__EDA, oldEda, newEda);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEda(ExploratoryDataAnalysis newEda) {
		if (newEda != eda) {
			NotificationChain msgs = null;
			if (eda != null)
				msgs = ((InternalEObject)eda).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__EDA, null, msgs);
			if (newEda != null)
				msgs = ((InternalEObject)newEda).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__EDA, null, msgs);
			msgs = basicSetEda(newEda, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__EDA, newEda, newEda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__DATA:
				return basicSetData(null, msgs);
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__IDA:
				return basicSetIda(null, msgs);
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__EDA:
				return basicSetEda(null, msgs);
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
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__LABEL:
				return getLabel();
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__DATA:
				return getData();
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__IDA:
				return getIda();
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__EDA:
				return getEda();
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
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__LABEL:
				setLabel((String)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__DATA:
				setData((Data)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__IDA:
				setIda((InitialDataAnalysis)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__EDA:
				setEda((ExploratoryDataAnalysis)newValue);
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
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__DATA:
				setData((Data)null);
				return;
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__IDA:
				setIda((InitialDataAnalysis)null);
				return;
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__EDA:
				setEda((ExploratoryDataAnalysis)null);
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
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__DATA:
				return data != null;
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__IDA:
				return ida != null;
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION__EDA:
				return eda != null;
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

} //DataAnalyticsProjectDataCurationImpl
