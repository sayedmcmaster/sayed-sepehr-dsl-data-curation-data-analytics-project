/**
 */
package dataAnalyticsProjectDataCuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Analytics Project Data Curation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration#getData <em>Data</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration#getIda <em>Ida</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration#getEda <em>Eda</em>}</li>
 * </ul>
 *
 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getDataAnalyticsProjectDataCuration()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface DataAnalyticsProjectDataCuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getDataAnalyticsProjectDataCuration_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(Data)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getDataAnalyticsProjectDataCuration_Data()
	 * @model containment="true"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

	/**
	 * Returns the value of the '<em><b>Ida</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ida</em>' containment reference.
	 * @see #setIda(InitialDataAnalysis)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getDataAnalyticsProjectDataCuration_Ida()
	 * @model containment="true"
	 * @generated
	 */
	InitialDataAnalysis getIda();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration#getIda <em>Ida</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ida</em>' containment reference.
	 * @see #getIda()
	 * @generated
	 */
	void setIda(InitialDataAnalysis value);

	/**
	 * Returns the value of the '<em><b>Eda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eda</em>' containment reference.
	 * @see #setEda(ExploratoryDataAnalysis)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getDataAnalyticsProjectDataCuration_Eda()
	 * @model containment="true"
	 * @generated
	 */
	ExploratoryDataAnalysis getEda();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration#getEda <em>Eda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eda</em>' containment reference.
	 * @see #getEda()
	 * @generated
	 */
	void setEda(ExploratoryDataAnalysis value);

} // DataAnalyticsProjectDataCuration
