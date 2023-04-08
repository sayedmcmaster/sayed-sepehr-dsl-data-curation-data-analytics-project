/**
 */
package dataAnalyticsProjectDataCuration.impl;

import dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage;
import dataAnalyticsProjectDataCuration.PValueFSignificance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PValue FSignificance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.PValueFSignificanceImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.PValueFSignificanceImpl#getAttributeList <em>Attribute List</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.PValueFSignificanceImpl#getAttributePValues <em>Attribute PValues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PValueFSignificanceImpl extends MinimalEObjectImpl.Container implements PValueFSignificance {
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
	 * The cached value of the '{@link #getAttributeList() <em>Attribute List</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeList()
	 * @generated
	 * @ordered
	 */
	protected EList<String> attributeList;

	/**
	 * The cached value of the '{@link #getAttributePValues() <em>Attribute PValues</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributePValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> attributePValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PValueFSignificanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataAnalyticsProjectDataCurationPackage.Literals.PVALUE_FSIGNIFICANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.PVALUE_FSIGNIFICANCE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAttributeList() {
		if (attributeList == null) {
			attributeList = new EDataTypeUniqueEList<String>(String.class, this, DataAnalyticsProjectDataCurationPackage.PVALUE_FSIGNIFICANCE__ATTRIBUTE_LIST);
		}
		return attributeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getAttributePValues() {
		if (attributePValues == null) {
			attributePValues = new EDataTypeUniqueEList<Double>(Double.class, this, DataAnalyticsProjectDataCurationPackage.PVALUE_FSIGNIFICANCE__ATTRIBUTE_PVALUES);
		}
		return attributePValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataAnalyticsProjectDataCurationPackage.PVALUE_FSIGNIFICANCE__LABEL:
				return getLabel();
			case DataAnalyticsProjectDataCurationPackage.PVALUE_FSIGNIFICANCE__ATTRIBUTE_LIST:
				return getAttributeList();
			case DataAnalyticsProjectDataCurationPackage.PVALUE_FSIGNIFICANCE__ATTRIBUTE_PVALUES:
				return getAttributePValues();
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
			case DataAnalyticsProjectDataCurationPackage.PVALUE_FSIGNIFICANCE__LABEL:
				setLabel((String)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.PVALUE_FSIGNIFICANCE__ATTRIBUTE_LIST:
				getAttributeList().clear();
				getAttributeList().addAll((Collection<? extends String>)newValue);
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
			case DataAnalyticsProjectDataCurationPackage.PVALUE_FSIGNIFICANCE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DataAnalyticsProjectDataCurationPackage.PVALUE_FSIGNIFICANCE__ATTRIBUTE_LIST:
				getAttributeList().clear();
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
			case DataAnalyticsProjectDataCurationPackage.PVALUE_FSIGNIFICANCE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DataAnalyticsProjectDataCurationPackage.PVALUE_FSIGNIFICANCE__ATTRIBUTE_LIST:
				return attributeList != null && !attributeList.isEmpty();
			case DataAnalyticsProjectDataCurationPackage.PVALUE_FSIGNIFICANCE__ATTRIBUTE_PVALUES:
				return attributePValues != null && !attributePValues.isEmpty();
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
		result.append(", attributeList: ");
		result.append(attributeList);
		result.append(", attributePValues: ");
		result.append(attributePValues);
		result.append(')');
		return result.toString();
	}

} //PValueFSignificanceImpl
