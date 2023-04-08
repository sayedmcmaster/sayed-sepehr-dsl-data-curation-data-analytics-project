/**
 */
package dataAnalyticsProjectDataCuration.impl;

import dataAnalyticsProjectDataCuration.BiVariateVisualization;
import dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bi Variate Visualization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.BiVariateVisualizationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.BiVariateVisualizationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.BiVariateVisualizationImpl#isShowLegend <em>Show Legend</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.impl.BiVariateVisualizationImpl#isShowTitle <em>Show Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BiVariateVisualizationImpl extends MinimalEObjectImpl.Container implements BiVariateVisualization {
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
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowLegend() <em>Show Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowLegend()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_LEGEND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowLegend() <em>Show Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowLegend()
	 * @generated
	 * @ordered
	 */
	protected boolean showLegend = SHOW_LEGEND_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowTitle() <em>Show Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowTitle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_TITLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowTitle() <em>Show Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowTitle()
	 * @generated
	 * @ordered
	 */
	protected boolean showTitle = SHOW_TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiVariateVisualizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataAnalyticsProjectDataCurationPackage.Literals.BI_VARIATE_VISUALIZATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowLegend() {
		return showLegend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowLegend(boolean newShowLegend) {
		boolean oldShowLegend = showLegend;
		showLegend = newShowLegend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__SHOW_LEGEND, oldShowLegend, showLegend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowTitle() {
		return showTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowTitle(boolean newShowTitle) {
		boolean oldShowTitle = showTitle;
		showTitle = newShowTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__SHOW_TITLE, oldShowTitle, showTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__LABEL:
				return getLabel();
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__METHOD:
				return getMethod();
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__SHOW_LEGEND:
				return isShowLegend();
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__SHOW_TITLE:
				return isShowTitle();
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
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__LABEL:
				setLabel((String)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__METHOD:
				setMethod((String)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__SHOW_LEGEND:
				setShowLegend((Boolean)newValue);
				return;
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__SHOW_TITLE:
				setShowTitle((Boolean)newValue);
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
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__SHOW_LEGEND:
				setShowLegend(SHOW_LEGEND_EDEFAULT);
				return;
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__SHOW_TITLE:
				setShowTitle(SHOW_TITLE_EDEFAULT);
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
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__METHOD:
				return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__SHOW_LEGEND:
				return showLegend != SHOW_LEGEND_EDEFAULT;
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION__SHOW_TITLE:
				return showTitle != SHOW_TITLE_EDEFAULT;
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
		result.append(", method: ");
		result.append(method);
		result.append(", showLegend: ");
		result.append(showLegend);
		result.append(", showTitle: ");
		result.append(showTitle);
		result.append(')');
		return result.toString();
	}

} //BiVariateVisualizationImpl
