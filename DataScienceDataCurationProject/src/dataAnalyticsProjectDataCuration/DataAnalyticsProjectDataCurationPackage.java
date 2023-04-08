/**
 */
package dataAnalyticsProjectDataCuration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationFactory
 * @model kind="package"
 * @generated
 */
public interface DataAnalyticsProjectDataCurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataAnalyticsProjectDataCuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://DataAnalyticsProjectDataCuration.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DataAnalyticsProjectDataCuration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataAnalyticsProjectDataCurationPackage eINSTANCE = dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationImpl <em>Data Analytics Project Data Curation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationImpl
	 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getDataAnalyticsProjectDataCuration()
	 * @generated
	 */
	int DATA_ANALYTICS_PROJECT_DATA_CURATION = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYTICS_PROJECT_DATA_CURATION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYTICS_PROJECT_DATA_CURATION__DATA = 1;

	/**
	 * The feature id for the '<em><b>Ida</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYTICS_PROJECT_DATA_CURATION__IDA = 2;

	/**
	 * The feature id for the '<em><b>Eda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYTICS_PROJECT_DATA_CURATION__EDA = 3;

	/**
	 * The number of structural features of the '<em>Data Analytics Project Data Curation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYTICS_PROJECT_DATA_CURATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Analytics Project Data Curation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYTICS_PROJECT_DATA_CURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataAnalyticsProjectDataCuration.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataAnalyticsProjectDataCuration.impl.DataImpl
	 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getData()
	 * @generated
	 */
	int DATA = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Data Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATA_VALUES = 2;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataAnalyticsProjectDataCuration.impl.InitialDataAnalysisImpl <em>Initial Data Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataAnalyticsProjectDataCuration.impl.InitialDataAnalysisImpl
	 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getInitialDataAnalysis()
	 * @generated
	 */
	int INITIAL_DATA_ANALYSIS = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_DATA_ANALYSIS__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Null Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_DATA_ANALYSIS__NULL_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Missing Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_DATA_ANALYSIS__MISSING_VALUES = 2;

	/**
	 * The number of structural features of the '<em>Initial Data Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_DATA_ANALYSIS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Initial Data Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_DATA_ANALYSIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataAnalyticsProjectDataCuration.impl.ExploratoryDataAnalysisImpl <em>Exploratory Data Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataAnalyticsProjectDataCuration.impl.ExploratoryDataAnalysisImpl
	 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getExploratoryDataAnalysis()
	 * @generated
	 */
	int EXPLORATORY_DATA_ANALYSIS = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS__LABEL = 0;

	/**
	 * The feature id for the '<em><b>RSquare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS__RSQUARE = 1;

	/**
	 * The feature id for the '<em><b>PValue FSignificance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE = 2;

	/**
	 * The feature id for the '<em><b>Unitary Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS = 3;

	/**
	 * The feature id for the '<em><b>Bi Variate Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS = 4;

	/**
	 * The feature id for the '<em><b>Univariate Visualization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION = 5;

	/**
	 * The feature id for the '<em><b>Bi Variate Visualization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION = 6;

	/**
	 * The feature id for the '<em><b>Normalization Standardization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION = 7;

	/**
	 * The number of structural features of the '<em>Exploratory Data Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Exploratory Data Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataAnalyticsProjectDataCuration.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataAnalyticsProjectDataCuration.impl.AttributeImpl
	 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATA_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataAnalyticsProjectDataCuration.impl.DataValueImpl <em>Data Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataAnalyticsProjectDataCuration.impl.DataValueImpl
	 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getDataValue()
	 * @generated
	 */
	int DATA_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__ROW = 1;

	/**
	 * The number of structural features of the '<em>Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataAnalyticsProjectDataCuration.impl.NullValuesImpl <em>Null Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataAnalyticsProjectDataCuration.impl.NullValuesImpl
	 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getNullValues()
	 * @generated
	 */
	int NULL_VALUES = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Remove Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES__REMOVE_ROW = 1;

	/**
	 * The feature id for the '<em><b>Replacement Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES__REPLACEMENT_METHOD = 2;

	/**
	 * The number of structural features of the '<em>Null Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Null Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataAnalyticsProjectDataCuration.impl.MissingValuesImpl <em>Missing Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataAnalyticsProjectDataCuration.impl.MissingValuesImpl
	 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getMissingValues()
	 * @generated
	 */
	int MISSING_VALUES = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Remove Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES__REMOVE_ROWS = 1;

	/**
	 * The feature id for the '<em><b>Replacement Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES__REPLACEMENT_METHOD = 2;

	/**
	 * The number of structural features of the '<em>Missing Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Missing Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataAnalyticsProjectDataCuration.impl.RSquareImpl <em>RSquare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataAnalyticsProjectDataCuration.impl.RSquareImpl
	 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getRSquare()
	 * @generated
	 */
	int RSQUARE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSQUARE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSQUARE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Adjusted RSquare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSQUARE__ADJUSTED_RSQUARE = 2;

	/**
	 * The feature id for the '<em><b>Cut Off For RSquare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSQUARE__CUT_OFF_FOR_RSQUARE = 3;

	/**
	 * The feature id for the '<em><b>Is Data Fit For Regression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSQUARE__IS_DATA_FIT_FOR_REGRESSION = 4;

	/**
	 * The number of structural features of the '<em>RSquare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSQUARE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>RSquare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSQUARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataAnalyticsProjectDataCuration.impl.PValueFSignificanceImpl <em>PValue FSignificance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataAnalyticsProjectDataCuration.impl.PValueFSignificanceImpl
	 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getPValueFSignificance()
	 * @generated
	 */
	int PVALUE_FSIGNIFICANCE = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_FSIGNIFICANCE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Attribute List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_FSIGNIFICANCE__ATTRIBUTE_LIST = 1;

	/**
	 * The feature id for the '<em><b>Attribute PValues</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_FSIGNIFICANCE__ATTRIBUTE_PVALUES = 2;

	/**
	 * The number of structural features of the '<em>PValue FSignificance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_FSIGNIFICANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>PValue FSignificance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_FSIGNIFICANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataAnalyticsProjectDataCuration.impl.UnitaryAnalysisImpl <em>Unitary Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataAnalyticsProjectDataCuration.impl.UnitaryAnalysisImpl
	 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getUnitaryAnalysis()
	 * @generated
	 */
	int UNITARY_ANALYSIS = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITARY_ANALYSIS__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Allowed Methods</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITARY_ANALYSIS__ALLOWED_METHODS = 1;

	/**
	 * The feature id for the '<em><b>Selected Methods</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITARY_ANALYSIS__SELECTED_METHODS = 2;

	/**
	 * The number of structural features of the '<em>Unitary Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITARY_ANALYSIS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Unitary Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITARY_ANALYSIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataAnalyticsProjectDataCuration.impl.BiVariateAnalysisImpl <em>Bi Variate Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataAnalyticsProjectDataCuration.impl.BiVariateAnalysisImpl
	 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getBiVariateAnalysis()
	 * @generated
	 */
	int BI_VARIATE_ANALYSIS = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_ANALYSIS__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Allowed Methods</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_ANALYSIS__ALLOWED_METHODS = 1;

	/**
	 * The feature id for the '<em><b>Selected Methods</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_ANALYSIS__SELECTED_METHODS = 2;

	/**
	 * The number of structural features of the '<em>Bi Variate Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_ANALYSIS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bi Variate Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_ANALYSIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataAnalyticsProjectDataCuration.impl.UnivariateVisualizationImpl <em>Univariate Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataAnalyticsProjectDataCuration.impl.UnivariateVisualizationImpl
	 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getUnivariateVisualization()
	 * @generated
	 */
	int UNIVARIATE_VISUALIZATION = 12;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVARIATE_VISUALIZATION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVARIATE_VISUALIZATION__METHOD = 1;

	/**
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVARIATE_VISUALIZATION__SHOW_LEGEND = 2;

	/**
	 * The feature id for the '<em><b>Show Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVARIATE_VISUALIZATION__SHOW_TITLE = 3;

	/**
	 * The number of structural features of the '<em>Univariate Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVARIATE_VISUALIZATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Univariate Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVARIATE_VISUALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataAnalyticsProjectDataCuration.impl.BiVariateVisualizationImpl <em>Bi Variate Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataAnalyticsProjectDataCuration.impl.BiVariateVisualizationImpl
	 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getBiVariateVisualization()
	 * @generated
	 */
	int BI_VARIATE_VISUALIZATION = 13;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_VISUALIZATION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_VISUALIZATION__METHOD = 1;

	/**
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_VISUALIZATION__SHOW_LEGEND = 2;

	/**
	 * The feature id for the '<em><b>Show Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_VISUALIZATION__SHOW_TITLE = 3;

	/**
	 * The number of structural features of the '<em>Bi Variate Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_VISUALIZATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bi Variate Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_VISUALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataAnalyticsProjectDataCuration.impl.NormalizationStandardizationImpl <em>Normalization Standardization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataAnalyticsProjectDataCuration.impl.NormalizationStandardizationImpl
	 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getNormalizationStandardization()
	 * @generated
	 */
	int NORMALIZATION_STANDARDIZATION = 14;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION_STANDARDIZATION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Normalize From0 To1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION_STANDARDIZATION__NORMALIZE_FROM0_TO1 = 1;

	/**
	 * The feature id for the '<em><b>Standardize From Minus1 To1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION_STANDARDIZATION__STANDARDIZE_FROM_MINUS1_TO1 = 2;

	/**
	 * The number of structural features of the '<em>Normalization Standardization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION_STANDARDIZATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Normalization Standardization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION_STANDARDIZATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration <em>Data Analytics Project Data Curation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Analytics Project Data Curation</em>'.
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration
	 * @generated
	 */
	EClass getDataAnalyticsProjectDataCuration();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration#getLabel()
	 * @see #getDataAnalyticsProjectDataCuration()
	 * @generated
	 */
	EAttribute getDataAnalyticsProjectDataCuration_Label();

	/**
	 * Returns the meta object for the containment reference '{@link dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration#getData()
	 * @see #getDataAnalyticsProjectDataCuration()
	 * @generated
	 */
	EReference getDataAnalyticsProjectDataCuration_Data();

	/**
	 * Returns the meta object for the containment reference '{@link dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration#getIda <em>Ida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ida</em>'.
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration#getIda()
	 * @see #getDataAnalyticsProjectDataCuration()
	 * @generated
	 */
	EReference getDataAnalyticsProjectDataCuration_Ida();

	/**
	 * Returns the meta object for the containment reference '{@link dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration#getEda <em>Eda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eda</em>'.
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration#getEda()
	 * @see #getDataAnalyticsProjectDataCuration()
	 * @generated
	 */
	EReference getDataAnalyticsProjectDataCuration_Eda();

	/**
	 * Returns the meta object for class '{@link dataAnalyticsProjectDataCuration.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see dataAnalyticsProjectDataCuration.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.Data#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataAnalyticsProjectDataCuration.Data#getLabel()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Label();

	/**
	 * Returns the meta object for the containment reference '{@link dataAnalyticsProjectDataCuration.Data#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see dataAnalyticsProjectDataCuration.Data#getAttributes()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Attributes();

	/**
	 * Returns the meta object for the containment reference '{@link dataAnalyticsProjectDataCuration.Data#getDataValues <em>Data Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Values</em>'.
	 * @see dataAnalyticsProjectDataCuration.Data#getDataValues()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_DataValues();

	/**
	 * Returns the meta object for class '{@link dataAnalyticsProjectDataCuration.InitialDataAnalysis <em>Initial Data Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Data Analysis</em>'.
	 * @see dataAnalyticsProjectDataCuration.InitialDataAnalysis
	 * @generated
	 */
	EClass getInitialDataAnalysis();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.InitialDataAnalysis#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataAnalyticsProjectDataCuration.InitialDataAnalysis#getLabel()
	 * @see #getInitialDataAnalysis()
	 * @generated
	 */
	EAttribute getInitialDataAnalysis_Label();

	/**
	 * Returns the meta object for the containment reference '{@link dataAnalyticsProjectDataCuration.InitialDataAnalysis#getNullValues <em>Null Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Null Values</em>'.
	 * @see dataAnalyticsProjectDataCuration.InitialDataAnalysis#getNullValues()
	 * @see #getInitialDataAnalysis()
	 * @generated
	 */
	EReference getInitialDataAnalysis_NullValues();

	/**
	 * Returns the meta object for the containment reference '{@link dataAnalyticsProjectDataCuration.InitialDataAnalysis#getMissingValues <em>Missing Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Missing Values</em>'.
	 * @see dataAnalyticsProjectDataCuration.InitialDataAnalysis#getMissingValues()
	 * @see #getInitialDataAnalysis()
	 * @generated
	 */
	EReference getInitialDataAnalysis_MissingValues();

	/**
	 * Returns the meta object for class '{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis <em>Exploratory Data Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exploratory Data Analysis</em>'.
	 * @see dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis
	 * @generated
	 */
	EClass getExploratoryDataAnalysis();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getLabel()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EAttribute getExploratoryDataAnalysis_Label();

	/**
	 * Returns the meta object for the containment reference '{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getRSquare <em>RSquare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RSquare</em>'.
	 * @see dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getRSquare()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_RSquare();

	/**
	 * Returns the meta object for the containment reference '{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getPValueFSignificance <em>PValue FSignificance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PValue FSignificance</em>'.
	 * @see dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getPValueFSignificance()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_PValueFSignificance();

	/**
	 * Returns the meta object for the containment reference '{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getUnitaryAnalysis <em>Unitary Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unitary Analysis</em>'.
	 * @see dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getUnitaryAnalysis()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_UnitaryAnalysis();

	/**
	 * Returns the meta object for the containment reference '{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getBiVariateAnalysis <em>Bi Variate Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bi Variate Analysis</em>'.
	 * @see dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getBiVariateAnalysis()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_BiVariateAnalysis();

	/**
	 * Returns the meta object for the containment reference '{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getUnivariateVisualization <em>Univariate Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Univariate Visualization</em>'.
	 * @see dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getUnivariateVisualization()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_UnivariateVisualization();

	/**
	 * Returns the meta object for the containment reference '{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getBiVariateVisualization <em>Bi Variate Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bi Variate Visualization</em>'.
	 * @see dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getBiVariateVisualization()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_BiVariateVisualization();

	/**
	 * Returns the meta object for the containment reference '{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getNormalizationStandardization <em>Normalization Standardization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Normalization Standardization</em>'.
	 * @see dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis#getNormalizationStandardization()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_NormalizationStandardization();

	/**
	 * Returns the meta object for class '{@link dataAnalyticsProjectDataCuration.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see dataAnalyticsProjectDataCuration.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.Attribute#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataAnalyticsProjectDataCuration.Attribute#getLabel()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Label();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataAnalyticsProjectDataCuration.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.Attribute#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see dataAnalyticsProjectDataCuration.Attribute#getDataType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DataType();

	/**
	 * Returns the meta object for class '{@link dataAnalyticsProjectDataCuration.DataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Value</em>'.
	 * @see dataAnalyticsProjectDataCuration.DataValue
	 * @generated
	 */
	EClass getDataValue();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.DataValue#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataAnalyticsProjectDataCuration.DataValue#getLabel()
	 * @see #getDataValue()
	 * @generated
	 */
	EAttribute getDataValue_Label();

	/**
	 * Returns the meta object for the attribute list '{@link dataAnalyticsProjectDataCuration.DataValue#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Row</em>'.
	 * @see dataAnalyticsProjectDataCuration.DataValue#getRow()
	 * @see #getDataValue()
	 * @generated
	 */
	EAttribute getDataValue_Row();

	/**
	 * Returns the meta object for class '{@link dataAnalyticsProjectDataCuration.NullValues <em>Null Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Values</em>'.
	 * @see dataAnalyticsProjectDataCuration.NullValues
	 * @generated
	 */
	EClass getNullValues();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.NullValues#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataAnalyticsProjectDataCuration.NullValues#getLabel()
	 * @see #getNullValues()
	 * @generated
	 */
	EAttribute getNullValues_Label();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.NullValues#isRemoveRow <em>Remove Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Row</em>'.
	 * @see dataAnalyticsProjectDataCuration.NullValues#isRemoveRow()
	 * @see #getNullValues()
	 * @generated
	 */
	EAttribute getNullValues_RemoveRow();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.NullValues#getReplacementMethod <em>Replacement Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replacement Method</em>'.
	 * @see dataAnalyticsProjectDataCuration.NullValues#getReplacementMethod()
	 * @see #getNullValues()
	 * @generated
	 */
	EAttribute getNullValues_ReplacementMethod();

	/**
	 * Returns the meta object for class '{@link dataAnalyticsProjectDataCuration.MissingValues <em>Missing Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Missing Values</em>'.
	 * @see dataAnalyticsProjectDataCuration.MissingValues
	 * @generated
	 */
	EClass getMissingValues();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.MissingValues#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataAnalyticsProjectDataCuration.MissingValues#getLabel()
	 * @see #getMissingValues()
	 * @generated
	 */
	EAttribute getMissingValues_Label();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.MissingValues#isRemoveRows <em>Remove Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Rows</em>'.
	 * @see dataAnalyticsProjectDataCuration.MissingValues#isRemoveRows()
	 * @see #getMissingValues()
	 * @generated
	 */
	EAttribute getMissingValues_RemoveRows();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.MissingValues#getReplacementMethod <em>Replacement Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replacement Method</em>'.
	 * @see dataAnalyticsProjectDataCuration.MissingValues#getReplacementMethod()
	 * @see #getMissingValues()
	 * @generated
	 */
	EAttribute getMissingValues_ReplacementMethod();

	/**
	 * Returns the meta object for class '{@link dataAnalyticsProjectDataCuration.RSquare <em>RSquare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RSquare</em>'.
	 * @see dataAnalyticsProjectDataCuration.RSquare
	 * @generated
	 */
	EClass getRSquare();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.RSquare#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataAnalyticsProjectDataCuration.RSquare#getLabel()
	 * @see #getRSquare()
	 * @generated
	 */
	EAttribute getRSquare_Label();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.RSquare#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dataAnalyticsProjectDataCuration.RSquare#getValue()
	 * @see #getRSquare()
	 * @generated
	 */
	EAttribute getRSquare_Value();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.RSquare#getAdjustedRSquare <em>Adjusted RSquare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adjusted RSquare</em>'.
	 * @see dataAnalyticsProjectDataCuration.RSquare#getAdjustedRSquare()
	 * @see #getRSquare()
	 * @generated
	 */
	EAttribute getRSquare_AdjustedRSquare();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.RSquare#getCutOffForRSquare <em>Cut Off For RSquare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut Off For RSquare</em>'.
	 * @see dataAnalyticsProjectDataCuration.RSquare#getCutOffForRSquare()
	 * @see #getRSquare()
	 * @generated
	 */
	EAttribute getRSquare_CutOffForRSquare();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.RSquare#getIsDataFitForRegression <em>Is Data Fit For Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Data Fit For Regression</em>'.
	 * @see dataAnalyticsProjectDataCuration.RSquare#getIsDataFitForRegression()
	 * @see #getRSquare()
	 * @generated
	 */
	EAttribute getRSquare_IsDataFitForRegression();

	/**
	 * Returns the meta object for class '{@link dataAnalyticsProjectDataCuration.PValueFSignificance <em>PValue FSignificance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PValue FSignificance</em>'.
	 * @see dataAnalyticsProjectDataCuration.PValueFSignificance
	 * @generated
	 */
	EClass getPValueFSignificance();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.PValueFSignificance#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataAnalyticsProjectDataCuration.PValueFSignificance#getLabel()
	 * @see #getPValueFSignificance()
	 * @generated
	 */
	EAttribute getPValueFSignificance_Label();

	/**
	 * Returns the meta object for the attribute list '{@link dataAnalyticsProjectDataCuration.PValueFSignificance#getAttributeList <em>Attribute List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attribute List</em>'.
	 * @see dataAnalyticsProjectDataCuration.PValueFSignificance#getAttributeList()
	 * @see #getPValueFSignificance()
	 * @generated
	 */
	EAttribute getPValueFSignificance_AttributeList();

	/**
	 * Returns the meta object for the attribute list '{@link dataAnalyticsProjectDataCuration.PValueFSignificance#getAttributePValues <em>Attribute PValues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attribute PValues</em>'.
	 * @see dataAnalyticsProjectDataCuration.PValueFSignificance#getAttributePValues()
	 * @see #getPValueFSignificance()
	 * @generated
	 */
	EAttribute getPValueFSignificance_AttributePValues();

	/**
	 * Returns the meta object for class '{@link dataAnalyticsProjectDataCuration.UnitaryAnalysis <em>Unitary Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unitary Analysis</em>'.
	 * @see dataAnalyticsProjectDataCuration.UnitaryAnalysis
	 * @generated
	 */
	EClass getUnitaryAnalysis();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.UnitaryAnalysis#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataAnalyticsProjectDataCuration.UnitaryAnalysis#getLabel()
	 * @see #getUnitaryAnalysis()
	 * @generated
	 */
	EAttribute getUnitaryAnalysis_Label();

	/**
	 * Returns the meta object for the attribute list '{@link dataAnalyticsProjectDataCuration.UnitaryAnalysis#getAllowedMethods <em>Allowed Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Allowed Methods</em>'.
	 * @see dataAnalyticsProjectDataCuration.UnitaryAnalysis#getAllowedMethods()
	 * @see #getUnitaryAnalysis()
	 * @generated
	 */
	EAttribute getUnitaryAnalysis_AllowedMethods();

	/**
	 * Returns the meta object for the attribute list '{@link dataAnalyticsProjectDataCuration.UnitaryAnalysis#getSelectedMethods <em>Selected Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Selected Methods</em>'.
	 * @see dataAnalyticsProjectDataCuration.UnitaryAnalysis#getSelectedMethods()
	 * @see #getUnitaryAnalysis()
	 * @generated
	 */
	EAttribute getUnitaryAnalysis_SelectedMethods();

	/**
	 * Returns the meta object for class '{@link dataAnalyticsProjectDataCuration.BiVariateAnalysis <em>Bi Variate Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bi Variate Analysis</em>'.
	 * @see dataAnalyticsProjectDataCuration.BiVariateAnalysis
	 * @generated
	 */
	EClass getBiVariateAnalysis();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.BiVariateAnalysis#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataAnalyticsProjectDataCuration.BiVariateAnalysis#getLabel()
	 * @see #getBiVariateAnalysis()
	 * @generated
	 */
	EAttribute getBiVariateAnalysis_Label();

	/**
	 * Returns the meta object for the attribute list '{@link dataAnalyticsProjectDataCuration.BiVariateAnalysis#getAllowedMethods <em>Allowed Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Allowed Methods</em>'.
	 * @see dataAnalyticsProjectDataCuration.BiVariateAnalysis#getAllowedMethods()
	 * @see #getBiVariateAnalysis()
	 * @generated
	 */
	EAttribute getBiVariateAnalysis_AllowedMethods();

	/**
	 * Returns the meta object for the attribute list '{@link dataAnalyticsProjectDataCuration.BiVariateAnalysis#getSelectedMethods <em>Selected Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Selected Methods</em>'.
	 * @see dataAnalyticsProjectDataCuration.BiVariateAnalysis#getSelectedMethods()
	 * @see #getBiVariateAnalysis()
	 * @generated
	 */
	EAttribute getBiVariateAnalysis_SelectedMethods();

	/**
	 * Returns the meta object for class '{@link dataAnalyticsProjectDataCuration.UnivariateVisualization <em>Univariate Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Univariate Visualization</em>'.
	 * @see dataAnalyticsProjectDataCuration.UnivariateVisualization
	 * @generated
	 */
	EClass getUnivariateVisualization();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.UnivariateVisualization#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataAnalyticsProjectDataCuration.UnivariateVisualization#getLabel()
	 * @see #getUnivariateVisualization()
	 * @generated
	 */
	EAttribute getUnivariateVisualization_Label();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.UnivariateVisualization#isMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see dataAnalyticsProjectDataCuration.UnivariateVisualization#isMethod()
	 * @see #getUnivariateVisualization()
	 * @generated
	 */
	EAttribute getUnivariateVisualization_Method();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.UnivariateVisualization#isShowLegend <em>Show Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Legend</em>'.
	 * @see dataAnalyticsProjectDataCuration.UnivariateVisualization#isShowLegend()
	 * @see #getUnivariateVisualization()
	 * @generated
	 */
	EAttribute getUnivariateVisualization_ShowLegend();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.UnivariateVisualization#isShowTitle <em>Show Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Title</em>'.
	 * @see dataAnalyticsProjectDataCuration.UnivariateVisualization#isShowTitle()
	 * @see #getUnivariateVisualization()
	 * @generated
	 */
	EAttribute getUnivariateVisualization_ShowTitle();

	/**
	 * Returns the meta object for class '{@link dataAnalyticsProjectDataCuration.BiVariateVisualization <em>Bi Variate Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bi Variate Visualization</em>'.
	 * @see dataAnalyticsProjectDataCuration.BiVariateVisualization
	 * @generated
	 */
	EClass getBiVariateVisualization();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.BiVariateVisualization#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataAnalyticsProjectDataCuration.BiVariateVisualization#getLabel()
	 * @see #getBiVariateVisualization()
	 * @generated
	 */
	EAttribute getBiVariateVisualization_Label();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.BiVariateVisualization#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see dataAnalyticsProjectDataCuration.BiVariateVisualization#getMethod()
	 * @see #getBiVariateVisualization()
	 * @generated
	 */
	EAttribute getBiVariateVisualization_Method();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.BiVariateVisualization#isShowLegend <em>Show Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Legend</em>'.
	 * @see dataAnalyticsProjectDataCuration.BiVariateVisualization#isShowLegend()
	 * @see #getBiVariateVisualization()
	 * @generated
	 */
	EAttribute getBiVariateVisualization_ShowLegend();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.BiVariateVisualization#isShowTitle <em>Show Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Title</em>'.
	 * @see dataAnalyticsProjectDataCuration.BiVariateVisualization#isShowTitle()
	 * @see #getBiVariateVisualization()
	 * @generated
	 */
	EAttribute getBiVariateVisualization_ShowTitle();

	/**
	 * Returns the meta object for class '{@link dataAnalyticsProjectDataCuration.NormalizationStandardization <em>Normalization Standardization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normalization Standardization</em>'.
	 * @see dataAnalyticsProjectDataCuration.NormalizationStandardization
	 * @generated
	 */
	EClass getNormalizationStandardization();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.NormalizationStandardization#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataAnalyticsProjectDataCuration.NormalizationStandardization#getLabel()
	 * @see #getNormalizationStandardization()
	 * @generated
	 */
	EAttribute getNormalizationStandardization_Label();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.NormalizationStandardization#isNormalizeFrom0To1 <em>Normalize From0 To1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normalize From0 To1</em>'.
	 * @see dataAnalyticsProjectDataCuration.NormalizationStandardization#isNormalizeFrom0To1()
	 * @see #getNormalizationStandardization()
	 * @generated
	 */
	EAttribute getNormalizationStandardization_NormalizeFrom0To1();

	/**
	 * Returns the meta object for the attribute '{@link dataAnalyticsProjectDataCuration.NormalizationStandardization#isStandardizeFromMinus1To1 <em>Standardize From Minus1 To1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standardize From Minus1 To1</em>'.
	 * @see dataAnalyticsProjectDataCuration.NormalizationStandardization#isStandardizeFromMinus1To1()
	 * @see #getNormalizationStandardization()
	 * @generated
	 */
	EAttribute getNormalizationStandardization_StandardizeFromMinus1To1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataAnalyticsProjectDataCurationFactory getDataAnalyticsProjectDataCurationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationImpl <em>Data Analytics Project Data Curation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationImpl
		 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getDataAnalyticsProjectDataCuration()
		 * @generated
		 */
		EClass DATA_ANALYTICS_PROJECT_DATA_CURATION = eINSTANCE.getDataAnalyticsProjectDataCuration();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ANALYTICS_PROJECT_DATA_CURATION__LABEL = eINSTANCE.getDataAnalyticsProjectDataCuration_Label();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ANALYTICS_PROJECT_DATA_CURATION__DATA = eINSTANCE.getDataAnalyticsProjectDataCuration_Data();

		/**
		 * The meta object literal for the '<em><b>Ida</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ANALYTICS_PROJECT_DATA_CURATION__IDA = eINSTANCE.getDataAnalyticsProjectDataCuration_Ida();

		/**
		 * The meta object literal for the '<em><b>Eda</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ANALYTICS_PROJECT_DATA_CURATION__EDA = eINSTANCE.getDataAnalyticsProjectDataCuration_Eda();

		/**
		 * The meta object literal for the '{@link dataAnalyticsProjectDataCuration.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataAnalyticsProjectDataCuration.impl.DataImpl
		 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__LABEL = eINSTANCE.getData_Label();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__ATTRIBUTES = eINSTANCE.getData_Attributes();

		/**
		 * The meta object literal for the '<em><b>Data Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__DATA_VALUES = eINSTANCE.getData_DataValues();

		/**
		 * The meta object literal for the '{@link dataAnalyticsProjectDataCuration.impl.InitialDataAnalysisImpl <em>Initial Data Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataAnalyticsProjectDataCuration.impl.InitialDataAnalysisImpl
		 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getInitialDataAnalysis()
		 * @generated
		 */
		EClass INITIAL_DATA_ANALYSIS = eINSTANCE.getInitialDataAnalysis();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIAL_DATA_ANALYSIS__LABEL = eINSTANCE.getInitialDataAnalysis_Label();

		/**
		 * The meta object literal for the '<em><b>Null Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_DATA_ANALYSIS__NULL_VALUES = eINSTANCE.getInitialDataAnalysis_NullValues();

		/**
		 * The meta object literal for the '<em><b>Missing Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_DATA_ANALYSIS__MISSING_VALUES = eINSTANCE.getInitialDataAnalysis_MissingValues();

		/**
		 * The meta object literal for the '{@link dataAnalyticsProjectDataCuration.impl.ExploratoryDataAnalysisImpl <em>Exploratory Data Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataAnalyticsProjectDataCuration.impl.ExploratoryDataAnalysisImpl
		 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getExploratoryDataAnalysis()
		 * @generated
		 */
		EClass EXPLORATORY_DATA_ANALYSIS = eINSTANCE.getExploratoryDataAnalysis();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPLORATORY_DATA_ANALYSIS__LABEL = eINSTANCE.getExploratoryDataAnalysis_Label();

		/**
		 * The meta object literal for the '<em><b>RSquare</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLORATORY_DATA_ANALYSIS__RSQUARE = eINSTANCE.getExploratoryDataAnalysis_RSquare();

		/**
		 * The meta object literal for the '<em><b>PValue FSignificance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE = eINSTANCE.getExploratoryDataAnalysis_PValueFSignificance();

		/**
		 * The meta object literal for the '<em><b>Unitary Analysis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS = eINSTANCE.getExploratoryDataAnalysis_UnitaryAnalysis();

		/**
		 * The meta object literal for the '<em><b>Bi Variate Analysis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS = eINSTANCE.getExploratoryDataAnalysis_BiVariateAnalysis();

		/**
		 * The meta object literal for the '<em><b>Univariate Visualization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION = eINSTANCE.getExploratoryDataAnalysis_UnivariateVisualization();

		/**
		 * The meta object literal for the '<em><b>Bi Variate Visualization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION = eINSTANCE.getExploratoryDataAnalysis_BiVariateVisualization();

		/**
		 * The meta object literal for the '<em><b>Normalization Standardization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION = eINSTANCE.getExploratoryDataAnalysis_NormalizationStandardization();

		/**
		 * The meta object literal for the '{@link dataAnalyticsProjectDataCuration.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataAnalyticsProjectDataCuration.impl.AttributeImpl
		 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__LABEL = eINSTANCE.getAttribute_Label();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DATA_TYPE = eINSTANCE.getAttribute_DataType();

		/**
		 * The meta object literal for the '{@link dataAnalyticsProjectDataCuration.impl.DataValueImpl <em>Data Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataAnalyticsProjectDataCuration.impl.DataValueImpl
		 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getDataValue()
		 * @generated
		 */
		EClass DATA_VALUE = eINSTANCE.getDataValue();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_VALUE__LABEL = eINSTANCE.getDataValue_Label();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_VALUE__ROW = eINSTANCE.getDataValue_Row();

		/**
		 * The meta object literal for the '{@link dataAnalyticsProjectDataCuration.impl.NullValuesImpl <em>Null Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataAnalyticsProjectDataCuration.impl.NullValuesImpl
		 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getNullValues()
		 * @generated
		 */
		EClass NULL_VALUES = eINSTANCE.getNullValues();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NULL_VALUES__LABEL = eINSTANCE.getNullValues_Label();

		/**
		 * The meta object literal for the '<em><b>Remove Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NULL_VALUES__REMOVE_ROW = eINSTANCE.getNullValues_RemoveRow();

		/**
		 * The meta object literal for the '<em><b>Replacement Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NULL_VALUES__REPLACEMENT_METHOD = eINSTANCE.getNullValues_ReplacementMethod();

		/**
		 * The meta object literal for the '{@link dataAnalyticsProjectDataCuration.impl.MissingValuesImpl <em>Missing Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataAnalyticsProjectDataCuration.impl.MissingValuesImpl
		 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getMissingValues()
		 * @generated
		 */
		EClass MISSING_VALUES = eINSTANCE.getMissingValues();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSING_VALUES__LABEL = eINSTANCE.getMissingValues_Label();

		/**
		 * The meta object literal for the '<em><b>Remove Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSING_VALUES__REMOVE_ROWS = eINSTANCE.getMissingValues_RemoveRows();

		/**
		 * The meta object literal for the '<em><b>Replacement Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSING_VALUES__REPLACEMENT_METHOD = eINSTANCE.getMissingValues_ReplacementMethod();

		/**
		 * The meta object literal for the '{@link dataAnalyticsProjectDataCuration.impl.RSquareImpl <em>RSquare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataAnalyticsProjectDataCuration.impl.RSquareImpl
		 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getRSquare()
		 * @generated
		 */
		EClass RSQUARE = eINSTANCE.getRSquare();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSQUARE__LABEL = eINSTANCE.getRSquare_Label();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSQUARE__VALUE = eINSTANCE.getRSquare_Value();

		/**
		 * The meta object literal for the '<em><b>Adjusted RSquare</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSQUARE__ADJUSTED_RSQUARE = eINSTANCE.getRSquare_AdjustedRSquare();

		/**
		 * The meta object literal for the '<em><b>Cut Off For RSquare</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSQUARE__CUT_OFF_FOR_RSQUARE = eINSTANCE.getRSquare_CutOffForRSquare();

		/**
		 * The meta object literal for the '<em><b>Is Data Fit For Regression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSQUARE__IS_DATA_FIT_FOR_REGRESSION = eINSTANCE.getRSquare_IsDataFitForRegression();

		/**
		 * The meta object literal for the '{@link dataAnalyticsProjectDataCuration.impl.PValueFSignificanceImpl <em>PValue FSignificance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataAnalyticsProjectDataCuration.impl.PValueFSignificanceImpl
		 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getPValueFSignificance()
		 * @generated
		 */
		EClass PVALUE_FSIGNIFICANCE = eINSTANCE.getPValueFSignificance();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PVALUE_FSIGNIFICANCE__LABEL = eINSTANCE.getPValueFSignificance_Label();

		/**
		 * The meta object literal for the '<em><b>Attribute List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PVALUE_FSIGNIFICANCE__ATTRIBUTE_LIST = eINSTANCE.getPValueFSignificance_AttributeList();

		/**
		 * The meta object literal for the '<em><b>Attribute PValues</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PVALUE_FSIGNIFICANCE__ATTRIBUTE_PVALUES = eINSTANCE.getPValueFSignificance_AttributePValues();

		/**
		 * The meta object literal for the '{@link dataAnalyticsProjectDataCuration.impl.UnitaryAnalysisImpl <em>Unitary Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataAnalyticsProjectDataCuration.impl.UnitaryAnalysisImpl
		 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getUnitaryAnalysis()
		 * @generated
		 */
		EClass UNITARY_ANALYSIS = eINSTANCE.getUnitaryAnalysis();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNITARY_ANALYSIS__LABEL = eINSTANCE.getUnitaryAnalysis_Label();

		/**
		 * The meta object literal for the '<em><b>Allowed Methods</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNITARY_ANALYSIS__ALLOWED_METHODS = eINSTANCE.getUnitaryAnalysis_AllowedMethods();

		/**
		 * The meta object literal for the '<em><b>Selected Methods</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNITARY_ANALYSIS__SELECTED_METHODS = eINSTANCE.getUnitaryAnalysis_SelectedMethods();

		/**
		 * The meta object literal for the '{@link dataAnalyticsProjectDataCuration.impl.BiVariateAnalysisImpl <em>Bi Variate Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataAnalyticsProjectDataCuration.impl.BiVariateAnalysisImpl
		 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getBiVariateAnalysis()
		 * @generated
		 */
		EClass BI_VARIATE_ANALYSIS = eINSTANCE.getBiVariateAnalysis();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BI_VARIATE_ANALYSIS__LABEL = eINSTANCE.getBiVariateAnalysis_Label();

		/**
		 * The meta object literal for the '<em><b>Allowed Methods</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BI_VARIATE_ANALYSIS__ALLOWED_METHODS = eINSTANCE.getBiVariateAnalysis_AllowedMethods();

		/**
		 * The meta object literal for the '<em><b>Selected Methods</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BI_VARIATE_ANALYSIS__SELECTED_METHODS = eINSTANCE.getBiVariateAnalysis_SelectedMethods();

		/**
		 * The meta object literal for the '{@link dataAnalyticsProjectDataCuration.impl.UnivariateVisualizationImpl <em>Univariate Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataAnalyticsProjectDataCuration.impl.UnivariateVisualizationImpl
		 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getUnivariateVisualization()
		 * @generated
		 */
		EClass UNIVARIATE_VISUALIZATION = eINSTANCE.getUnivariateVisualization();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVARIATE_VISUALIZATION__LABEL = eINSTANCE.getUnivariateVisualization_Label();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVARIATE_VISUALIZATION__METHOD = eINSTANCE.getUnivariateVisualization_Method();

		/**
		 * The meta object literal for the '<em><b>Show Legend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVARIATE_VISUALIZATION__SHOW_LEGEND = eINSTANCE.getUnivariateVisualization_ShowLegend();

		/**
		 * The meta object literal for the '<em><b>Show Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVARIATE_VISUALIZATION__SHOW_TITLE = eINSTANCE.getUnivariateVisualization_ShowTitle();

		/**
		 * The meta object literal for the '{@link dataAnalyticsProjectDataCuration.impl.BiVariateVisualizationImpl <em>Bi Variate Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataAnalyticsProjectDataCuration.impl.BiVariateVisualizationImpl
		 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getBiVariateVisualization()
		 * @generated
		 */
		EClass BI_VARIATE_VISUALIZATION = eINSTANCE.getBiVariateVisualization();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BI_VARIATE_VISUALIZATION__LABEL = eINSTANCE.getBiVariateVisualization_Label();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BI_VARIATE_VISUALIZATION__METHOD = eINSTANCE.getBiVariateVisualization_Method();

		/**
		 * The meta object literal for the '<em><b>Show Legend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BI_VARIATE_VISUALIZATION__SHOW_LEGEND = eINSTANCE.getBiVariateVisualization_ShowLegend();

		/**
		 * The meta object literal for the '<em><b>Show Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BI_VARIATE_VISUALIZATION__SHOW_TITLE = eINSTANCE.getBiVariateVisualization_ShowTitle();

		/**
		 * The meta object literal for the '{@link dataAnalyticsProjectDataCuration.impl.NormalizationStandardizationImpl <em>Normalization Standardization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataAnalyticsProjectDataCuration.impl.NormalizationStandardizationImpl
		 * @see dataAnalyticsProjectDataCuration.impl.DataAnalyticsProjectDataCurationPackageImpl#getNormalizationStandardization()
		 * @generated
		 */
		EClass NORMALIZATION_STANDARDIZATION = eINSTANCE.getNormalizationStandardization();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMALIZATION_STANDARDIZATION__LABEL = eINSTANCE.getNormalizationStandardization_Label();

		/**
		 * The meta object literal for the '<em><b>Normalize From0 To1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMALIZATION_STANDARDIZATION__NORMALIZE_FROM0_TO1 = eINSTANCE.getNormalizationStandardization_NormalizeFrom0To1();

		/**
		 * The meta object literal for the '<em><b>Standardize From Minus1 To1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMALIZATION_STANDARDIZATION__STANDARDIZE_FROM_MINUS1_TO1 = eINSTANCE.getNormalizationStandardization_StandardizeFromMinus1To1();

	}

} //DataAnalyticsProjectDataCurationPackage
