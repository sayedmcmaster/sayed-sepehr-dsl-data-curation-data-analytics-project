/**
 */
package dataAnalyticsProjectDataCuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unitary Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.UnitaryAnalysis#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.UnitaryAnalysis#getAllowedMethods <em>Allowed Methods</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.UnitaryAnalysis#getSelectedMethods <em>Selected Methods</em>}</li>
 * </ul>
 *
 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getUnitaryAnalysis()
 * @model
 * @generated
 */
public interface UnitaryAnalysis extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getUnitaryAnalysis_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.UnitaryAnalysis#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Allowed Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Methods</em>' attribute list.
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getUnitaryAnalysis_AllowedMethods()
	 * @model
	 * @generated
	 */
	EList<String> getAllowedMethods();

	/**
	 * Returns the value of the '<em><b>Selected Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Methods</em>' attribute list.
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getUnitaryAnalysis_SelectedMethods()
	 * @model
	 * @generated
	 */
	EList<String> getSelectedMethods();

} // UnitaryAnalysis
