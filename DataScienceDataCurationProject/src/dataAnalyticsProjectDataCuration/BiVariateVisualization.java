/**
 */
package dataAnalyticsProjectDataCuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bi Variate Visualization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.BiVariateVisualization#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.BiVariateVisualization#getMethod <em>Method</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.BiVariateVisualization#isShowLegend <em>Show Legend</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.BiVariateVisualization#isShowTitle <em>Show Title</em>}</li>
 * </ul>
 *
 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getBiVariateVisualization()
 * @model
 * @generated
 */
public interface BiVariateVisualization extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getBiVariateVisualization_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.BiVariateVisualization#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getBiVariateVisualization_Method()
	 * @model
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.BiVariateVisualization#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

	/**
	 * Returns the value of the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Legend</em>' attribute.
	 * @see #setShowLegend(boolean)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getBiVariateVisualization_ShowLegend()
	 * @model
	 * @generated
	 */
	boolean isShowLegend();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.BiVariateVisualization#isShowLegend <em>Show Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Legend</em>' attribute.
	 * @see #isShowLegend()
	 * @generated
	 */
	void setShowLegend(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Title</em>' attribute.
	 * @see #setShowTitle(boolean)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getBiVariateVisualization_ShowTitle()
	 * @model
	 * @generated
	 */
	boolean isShowTitle();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.BiVariateVisualization#isShowTitle <em>Show Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Title</em>' attribute.
	 * @see #isShowTitle()
	 * @generated
	 */
	void setShowTitle(boolean value);

} // BiVariateVisualization
