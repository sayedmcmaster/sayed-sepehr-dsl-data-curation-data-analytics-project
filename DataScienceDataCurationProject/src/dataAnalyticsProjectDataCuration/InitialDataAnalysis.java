/**
 */
package dataAnalyticsProjectDataCuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial Data Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.InitialDataAnalysis#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.InitialDataAnalysis#getNullValues <em>Null Values</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.InitialDataAnalysis#getMissingValues <em>Missing Values</em>}</li>
 * </ul>
 *
 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getInitialDataAnalysis()
 * @model
 * @generated
 */
public interface InitialDataAnalysis extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getInitialDataAnalysis_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.InitialDataAnalysis#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Null Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Values</em>' containment reference.
	 * @see #setNullValues(NullValues)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getInitialDataAnalysis_NullValues()
	 * @model containment="true"
	 * @generated
	 */
	NullValues getNullValues();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.InitialDataAnalysis#getNullValues <em>Null Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Values</em>' containment reference.
	 * @see #getNullValues()
	 * @generated
	 */
	void setNullValues(NullValues value);

	/**
	 * Returns the value of the '<em><b>Missing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing Values</em>' containment reference.
	 * @see #setMissingValues(MissingValues)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getInitialDataAnalysis_MissingValues()
	 * @model containment="true"
	 * @generated
	 */
	MissingValues getMissingValues();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.InitialDataAnalysis#getMissingValues <em>Missing Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing Values</em>' containment reference.
	 * @see #getMissingValues()
	 * @generated
	 */
	void setMissingValues(MissingValues value);

} // InitialDataAnalysis
