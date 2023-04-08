/**
 */
package dataAnalyticsProjectDataCuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Missing Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.MissingValues#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.MissingValues#isRemoveRows <em>Remove Rows</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.MissingValues#getReplacementMethod <em>Replacement Method</em>}</li>
 * </ul>
 *
 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getMissingValues()
 * @model
 * @generated
 */
public interface MissingValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getMissingValues_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.MissingValues#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Remove Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Rows</em>' attribute.
	 * @see #setRemoveRows(boolean)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getMissingValues_RemoveRows()
	 * @model
	 * @generated
	 */
	boolean isRemoveRows();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.MissingValues#isRemoveRows <em>Remove Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Rows</em>' attribute.
	 * @see #isRemoveRows()
	 * @generated
	 */
	void setRemoveRows(boolean value);

	/**
	 * Returns the value of the '<em><b>Replacement Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacement Method</em>' attribute.
	 * @see #setReplacementMethod(String)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getMissingValues_ReplacementMethod()
	 * @model
	 * @generated
	 */
	String getReplacementMethod();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.MissingValues#getReplacementMethod <em>Replacement Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement Method</em>' attribute.
	 * @see #getReplacementMethod()
	 * @generated
	 */
	void setReplacementMethod(String value);

} // MissingValues
