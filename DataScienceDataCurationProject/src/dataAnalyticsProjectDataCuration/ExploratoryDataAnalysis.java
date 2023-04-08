/**
 */
package dataAnalyticsProjectDataCuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exploratory Data Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getRSquare <em>RSquare</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getPValueFSignificance <em>PValue FSignificance</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getUnitaryAnalysis <em>Unitary Analysis</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getBiVariateAnalysis <em>Bi Variate Analysis</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getUnivariateVisualization <em>Univariate Visualization</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getBiVariateVisualization <em>Bi Variate Visualization</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getNormalizationStandardization <em>Normalization Standardization</em>}</li>
 * </ul>
 *
 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getExploratoryDataAnalysis()
 * @model
 * @generated
 */
public interface ExploratoryDataAnalysis extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getExploratoryDataAnalysis_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>RSquare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RSquare</em>' containment reference.
	 * @see #setRSquare(RSquare)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getExploratoryDataAnalysis_RSquare()
	 * @model containment="true"
	 * @generated
	 */
	RSquare getRSquare();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getRSquare <em>RSquare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RSquare</em>' containment reference.
	 * @see #getRSquare()
	 * @generated
	 */
	void setRSquare(RSquare value);

	/**
	 * Returns the value of the '<em><b>PValue FSignificance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PValue FSignificance</em>' containment reference.
	 * @see #setPValueFSignificance(PValueFSignificance)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getExploratoryDataAnalysis_PValueFSignificance()
	 * @model containment="true"
	 * @generated
	 */
	PValueFSignificance getPValueFSignificance();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getPValueFSignificance <em>PValue FSignificance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PValue FSignificance</em>' containment reference.
	 * @see #getPValueFSignificance()
	 * @generated
	 */
	void setPValueFSignificance(PValueFSignificance value);

	/**
	 * Returns the value of the '<em><b>Unitary Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unitary Analysis</em>' containment reference.
	 * @see #setUnitaryAnalysis(UnitaryAnalysis)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getExploratoryDataAnalysis_UnitaryAnalysis()
	 * @model containment="true"
	 * @generated
	 */
	UnitaryAnalysis getUnitaryAnalysis();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getUnitaryAnalysis <em>Unitary Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unitary Analysis</em>' containment reference.
	 * @see #getUnitaryAnalysis()
	 * @generated
	 */
	void setUnitaryAnalysis(UnitaryAnalysis value);

	/**
	 * Returns the value of the '<em><b>Bi Variate Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bi Variate Analysis</em>' containment reference.
	 * @see #setBiVariateAnalysis(BiVariateAnalysis)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getExploratoryDataAnalysis_BiVariateAnalysis()
	 * @model containment="true"
	 * @generated
	 */
	BiVariateAnalysis getBiVariateAnalysis();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getBiVariateAnalysis <em>Bi Variate Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bi Variate Analysis</em>' containment reference.
	 * @see #getBiVariateAnalysis()
	 * @generated
	 */
	void setBiVariateAnalysis(BiVariateAnalysis value);

	/**
	 * Returns the value of the '<em><b>Univariate Visualization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Univariate Visualization</em>' containment reference.
	 * @see #setUnivariateVisualization(UnivariateVisualization)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getExploratoryDataAnalysis_UnivariateVisualization()
	 * @model containment="true"
	 * @generated
	 */
	UnivariateVisualization getUnivariateVisualization();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getUnivariateVisualization <em>Univariate Visualization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Univariate Visualization</em>' containment reference.
	 * @see #getUnivariateVisualization()
	 * @generated
	 */
	void setUnivariateVisualization(UnivariateVisualization value);

	/**
	 * Returns the value of the '<em><b>Bi Variate Visualization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bi Variate Visualization</em>' containment reference.
	 * @see #setBiVariateVisualization(BiVariateVisualization)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getExploratoryDataAnalysis_BiVariateVisualization()
	 * @model containment="true"
	 * @generated
	 */
	BiVariateVisualization getBiVariateVisualization();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getBiVariateVisualization <em>Bi Variate Visualization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bi Variate Visualization</em>' containment reference.
	 * @see #getBiVariateVisualization()
	 * @generated
	 */
	void setBiVariateVisualization(BiVariateVisualization value);

	/**
	 * Returns the value of the '<em><b>Normalization Standardization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normalization Standardization</em>' containment reference.
	 * @see #setNormalizationStandardization(NormalizationStandardization)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getExploratoryDataAnalysis_NormalizationStandardization()
	 * @model containment="true"
	 * @generated
	 */
	NormalizationStandardization getNormalizationStandardization();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getNormalizationStandardization <em>Normalization Standardization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normalization Standardization</em>' containment reference.
	 * @see #getNormalizationStandardization()
	 * @generated
	 */
	void setNormalizationStandardization(NormalizationStandardization value);

} // ExploratoryDataAnalysis
