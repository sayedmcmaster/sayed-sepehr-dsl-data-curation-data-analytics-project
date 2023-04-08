/**
 */
package dataAnalyticsProjectDataCuration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage
 * @generated
 */
public interface DataAnalyticsProjectDataCurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataAnalyticsProjectDataCurationFactory eINSTANCE = dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Analytics Project Data Curation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Analytics Project Data Curation</em>'.
	 * @generated
	 */
	DataAnalyticsProjectDataCuration createDataAnalyticsProjectDataCuration();

	/**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
	Data createData();

	/**
	 * Returns a new object of class '<em>Initial Data Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Data Analysis</em>'.
	 * @generated
	 */
	InitialDataAnalysis createInitialDataAnalysis();

	/**
	 * Returns a new object of class '<em>Exploratory Data Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exploratory Data Analysis</em>'.
	 * @generated
	 */
	ExploratoryDataAnalysis createExploratoryDataAnalysis();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Value</em>'.
	 * @generated
	 */
	DataValue createDataValue();

	/**
	 * Returns a new object of class '<em>Null Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Values</em>'.
	 * @generated
	 */
	NullValues createNullValues();

	/**
	 * Returns a new object of class '<em>Missing Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Missing Values</em>'.
	 * @generated
	 */
	MissingValues createMissingValues();

	/**
	 * Returns a new object of class '<em>RSquare</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RSquare</em>'.
	 * @generated
	 */
	RSquare createRSquare();

	/**
	 * Returns a new object of class '<em>PValue FSignificance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PValue FSignificance</em>'.
	 * @generated
	 */
	PValueFSignificance createPValueFSignificance();

	/**
	 * Returns a new object of class '<em>Unitary Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unitary Analysis</em>'.
	 * @generated
	 */
	UnitaryAnalysis createUnitaryAnalysis();

	/**
	 * Returns a new object of class '<em>Bi Variate Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bi Variate Analysis</em>'.
	 * @generated
	 */
	BiVariateAnalysis createBiVariateAnalysis();

	/**
	 * Returns a new object of class '<em>Univariate Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Univariate Visualization</em>'.
	 * @generated
	 */
	UnivariateVisualization createUnivariateVisualization();

	/**
	 * Returns a new object of class '<em>Bi Variate Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bi Variate Visualization</em>'.
	 * @generated
	 */
	BiVariateVisualization createBiVariateVisualization();

	/**
	 * Returns a new object of class '<em>Normalization Standardization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normalization Standardization</em>'.
	 * @generated
	 */
	NormalizationStandardization createNormalizationStandardization();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataAnalyticsProjectDataCurationPackage getDataAnalyticsProjectDataCurationPackage();

} //DataAnalyticsProjectDataCurationFactory
