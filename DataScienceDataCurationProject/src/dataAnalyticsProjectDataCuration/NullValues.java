/**
 */
package dataAnalyticsProjectDataCuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Null Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.NullValues#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.NullValues#isRemoveRow <em>Remove Row</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.NullValues#getReplacementMethod <em>Replacement Method</em>}</li>
 * </ul>
 *
 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getNullValues()
 * @model
 * @generated
 */
public interface NullValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getNullValues_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.NullValues#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Remove Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Row</em>' attribute.
	 * @see #setRemoveRow(boolean)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getNullValues_RemoveRow()
	 * @model
	 * @generated
	 */
	boolean isRemoveRow();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.NullValues#isRemoveRow <em>Remove Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Row</em>' attribute.
	 * @see #isRemoveRow()
	 * @generated
	 */
	void setRemoveRow(boolean value);

	/**
	 * Returns the value of the '<em><b>Replacement Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacement Method</em>' attribute.
	 * @see #setReplacementMethod(String)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getNullValues_ReplacementMethod()
	 * @model
	 * @generated
	 */
	String getReplacementMethod();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.NullValues#getReplacementMethod <em>Replacement Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement Method</em>' attribute.
	 * @see #getReplacementMethod()
	 * @generated
	 */
	void setReplacementMethod(String value);

} // NullValues
