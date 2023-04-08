/**
 */
package dataAnalyticsProjectDataCuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.DataValue#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.DataValue#getRow <em>Row</em>}</li>
 * </ul>
 *
 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getDataValue()
 * @model
 * @generated
 */
public interface DataValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getDataValue_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.DataValue#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' attribute list.
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getDataValue_Row()
	 * @model
	 * @generated
	 */
	EList<Integer> getRow();

} // DataValue
