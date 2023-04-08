/**
 */
package dataCurationStateTransitionAction;

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
 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionFactory
 * @model kind="package"
 * @generated
 */
public interface DataCurationStateTransitionActionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataCurationStateTransitionAction";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://DataCurationStateTransitionAction.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DataCurationStateTransitionAction";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataCurationStateTransitionActionPackage eINSTANCE = dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl.init();

	/**
	 * The meta object id for the '{@link dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionImpl <em>Data Curation State Transition Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionImpl
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getDataCurationStateTransitionAction()
	 * @generated
	 */
	int DATA_CURATION_STATE_TRANSITION_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CURATION_STATE_TRANSITION_ACTION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CURATION_STATE_TRANSITION_ACTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CURATION_STATE_TRANSITION_ACTION__DATA = 2;

	/**
	 * The feature id for the '<em><b>Ida</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CURATION_STATE_TRANSITION_ACTION__IDA = 3;

	/**
	 * The feature id for the '<em><b>Eda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CURATION_STATE_TRANSITION_ACTION__EDA = 4;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CURATION_STATE_TRANSITION_ACTION__STATES = 5;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CURATION_STATE_TRANSITION_ACTION__TRANSITIONS = 6;

	/**
	 * The feature id for the '<em><b>Action To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CURATION_STATE_TRANSITION_ACTION__ACTION_TO_TAKE = 7;

	/**
	 * The feature id for the '<em><b>Event To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CURATION_STATE_TRANSITION_ACTION__EVENT_TO_TAKE = 8;

	/**
	 * The number of structural features of the '<em>Data Curation State Transition Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CURATION_STATE_TRANSITION_ACTION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Data Curation State Transition Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CURATION_STATE_TRANSITION_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataCurationStateTransitionAction.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataCurationStateTransitionAction.impl.DataImpl
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getData()
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
	 * The feature id for the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__STATES = 3;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TRANSITIONS = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TARGET = 6;

	/**
	 * The feature id for the '<em><b>Action To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ACTION_TO_TAKE = 7;

	/**
	 * The feature id for the '<em><b>Event To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__EVENT_TO_TAKE = 8;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataCurationStateTransitionAction.impl.InitialDataAnalysisImpl <em>Initial Data Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataCurationStateTransitionAction.impl.InitialDataAnalysisImpl
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getInitialDataAnalysis()
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
	 * The feature id for the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_DATA_ANALYSIS__STATES = 3;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_DATA_ANALYSIS__TRANSITIONS = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_DATA_ANALYSIS__SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_DATA_ANALYSIS__TARGET = 6;

	/**
	 * The feature id for the '<em><b>Action To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_DATA_ANALYSIS__ACTION_TO_TAKE = 7;

	/**
	 * The feature id for the '<em><b>Event To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_DATA_ANALYSIS__EVENT_TO_TAKE = 8;

	/**
	 * The number of structural features of the '<em>Initial Data Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_DATA_ANALYSIS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Initial Data Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_DATA_ANALYSIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl <em>Exploratory Data Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getExploratoryDataAnalysis()
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
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS__INITIAL_STATE = 8;

	/**
	 * The feature id for the '<em><b>Final State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS__FINAL_STATE = 9;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS__STATES = 10;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS__TRANSITIONS = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS__SOURCE = 12;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS__TARGET = 13;

	/**
	 * The feature id for the '<em><b>Action To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS__ACTION_TO_TAKE = 14;

	/**
	 * The feature id for the '<em><b>Event To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS__EVENT_TO_TAKE = 15;

	/**
	 * The number of structural features of the '<em>Exploratory Data Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Exploratory Data Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORATORY_DATA_ANALYSIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataCurationStateTransitionAction.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataCurationStateTransitionAction.impl.AttributeImpl
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getAttribute()
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
	 * The meta object id for the '{@link dataCurationStateTransitionAction.impl.DataValueImpl <em>Data Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataCurationStateTransitionAction.impl.DataValueImpl
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getDataValue()
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
	 * The meta object id for the '{@link dataCurationStateTransitionAction.impl.NullValuesImpl <em>Null Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataCurationStateTransitionAction.impl.NullValuesImpl
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getNullValues()
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
	 * The feature id for the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES__STATES = 3;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES__TRANSITIONS = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES__SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES__TARGET = 6;

	/**
	 * The feature id for the '<em><b>Action To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES__ACTION_TO_TAKE = 7;

	/**
	 * The feature id for the '<em><b>Event To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES__EVENT_TO_TAKE = 8;

	/**
	 * The number of structural features of the '<em>Null Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Null Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataCurationStateTransitionAction.impl.MissingValuesImpl <em>Missing Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataCurationStateTransitionAction.impl.MissingValuesImpl
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getMissingValues()
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
	 * The feature id for the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES__STATES = 3;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES__TRANSITIONS = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES__SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES__TARGET = 6;

	/**
	 * The feature id for the '<em><b>Action To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES__ACTION_TO_TAKE = 7;

	/**
	 * The feature id for the '<em><b>Event To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES__EVENT_TO_TAKE = 8;

	/**
	 * The number of structural features of the '<em>Missing Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Missing Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataCurationStateTransitionAction.impl.RSquareImpl <em>RSquare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataCurationStateTransitionAction.impl.RSquareImpl
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getRSquare()
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
	 * The feature id for the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSQUARE__STATES = 5;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSQUARE__TRANSITIONS = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSQUARE__SOURCE = 7;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSQUARE__TARGET = 8;

	/**
	 * The feature id for the '<em><b>Action To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSQUARE__ACTION_TO_TAKE = 9;

	/**
	 * The feature id for the '<em><b>Event To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSQUARE__EVENT_TO_TAKE = 10;

	/**
	 * The number of structural features of the '<em>RSquare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSQUARE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>RSquare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSQUARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataCurationStateTransitionAction.impl.PValueFSignificanceImpl <em>PValue FSignificance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataCurationStateTransitionAction.impl.PValueFSignificanceImpl
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getPValueFSignificance()
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
	 * The feature id for the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_FSIGNIFICANCE__STATES = 3;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_FSIGNIFICANCE__TRANSITIONS = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_FSIGNIFICANCE__SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_FSIGNIFICANCE__TARGET = 6;

	/**
	 * The feature id for the '<em><b>Action To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_FSIGNIFICANCE__ACTION_TO_TAKE = 7;

	/**
	 * The feature id for the '<em><b>Event To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_FSIGNIFICANCE__EVENT_TO_TAKE = 8;

	/**
	 * The number of structural features of the '<em>PValue FSignificance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_FSIGNIFICANCE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>PValue FSignificance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVALUE_FSIGNIFICANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataCurationStateTransitionAction.impl.UnitaryAnalysisImpl <em>Unitary Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataCurationStateTransitionAction.impl.UnitaryAnalysisImpl
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getUnitaryAnalysis()
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
	 * The feature id for the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITARY_ANALYSIS__STATES = 3;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITARY_ANALYSIS__TRANSITIONS = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITARY_ANALYSIS__SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITARY_ANALYSIS__TARGET = 6;

	/**
	 * The feature id for the '<em><b>Action To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITARY_ANALYSIS__ACTION_TO_TAKE = 7;

	/**
	 * The feature id for the '<em><b>Event To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITARY_ANALYSIS__EVENT_TO_TAKE = 8;

	/**
	 * The number of structural features of the '<em>Unitary Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITARY_ANALYSIS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Unitary Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITARY_ANALYSIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataCurationStateTransitionAction.impl.BiVariateAnalysisImpl <em>Bi Variate Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataCurationStateTransitionAction.impl.BiVariateAnalysisImpl
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getBiVariateAnalysis()
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
	 * The feature id for the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_ANALYSIS__STATES = 3;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_ANALYSIS__TRANSITIONS = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_ANALYSIS__SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_ANALYSIS__TARGET = 6;

	/**
	 * The feature id for the '<em><b>Action To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_ANALYSIS__ACTION_TO_TAKE = 7;

	/**
	 * The feature id for the '<em><b>Event To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_ANALYSIS__EVENT_TO_TAKE = 8;

	/**
	 * The number of structural features of the '<em>Bi Variate Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_ANALYSIS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Bi Variate Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_ANALYSIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataCurationStateTransitionAction.impl.UnivariateVisualizationImpl <em>Univariate Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataCurationStateTransitionAction.impl.UnivariateVisualizationImpl
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getUnivariateVisualization()
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
	 * The feature id for the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVARIATE_VISUALIZATION__STATES = 4;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVARIATE_VISUALIZATION__TRANSITIONS = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVARIATE_VISUALIZATION__SOURCE = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVARIATE_VISUALIZATION__TARGET = 7;

	/**
	 * The feature id for the '<em><b>Action To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVARIATE_VISUALIZATION__ACTION_TO_TAKE = 8;

	/**
	 * The feature id for the '<em><b>Event To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVARIATE_VISUALIZATION__EVENT_TO_TAKE = 9;

	/**
	 * The number of structural features of the '<em>Univariate Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVARIATE_VISUALIZATION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Univariate Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVARIATE_VISUALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataCurationStateTransitionAction.impl.BiVariateVisualizationImpl <em>Bi Variate Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataCurationStateTransitionAction.impl.BiVariateVisualizationImpl
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getBiVariateVisualization()
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
	 * The feature id for the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_VISUALIZATION__STATES = 4;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_VISUALIZATION__TRANSITIONS = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_VISUALIZATION__SOURCE = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_VISUALIZATION__TARGET = 7;

	/**
	 * The feature id for the '<em><b>Action To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_VISUALIZATION__ACTION_TO_TAKE = 8;

	/**
	 * The feature id for the '<em><b>Event To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_VISUALIZATION__EVENT_TO_TAKE = 9;

	/**
	 * The number of structural features of the '<em>Bi Variate Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_VISUALIZATION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Bi Variate Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_VARIATE_VISUALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataCurationStateTransitionAction.impl.NormalizationStandardizationImpl <em>Normalization Standardization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataCurationStateTransitionAction.impl.NormalizationStandardizationImpl
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getNormalizationStandardization()
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
	 * The feature id for the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION_STANDARDIZATION__STATES = 3;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION_STANDARDIZATION__TRANSITIONS = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION_STANDARDIZATION__SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION_STANDARDIZATION__TARGET = 6;

	/**
	 * The feature id for the '<em><b>Action To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION_STANDARDIZATION__ACTION_TO_TAKE = 7;

	/**
	 * The feature id for the '<em><b>Event To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION_STANDARDIZATION__EVENT_TO_TAKE = 8;

	/**
	 * The number of structural features of the '<em>Normalization Standardization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION_STANDARDIZATION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Normalization Standardization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION_STANDARDIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataCurationStateTransitionAction.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataCurationStateTransitionAction.impl.StateImpl
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getState()
	 * @generated
	 */
	int STATE = 15;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_INITIAL = 2;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_FINAL = 3;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITIONS = 4;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITIONS = 5;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATES = 6;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITIONS = 7;

	/**
	 * The feature id for the '<em><b>Action To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTION_TO_TAKE = 8;

	/**
	 * The feature id for the '<em><b>Event To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EVENT_TO_TAKE = 9;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataCurationStateTransitionAction.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataCurationStateTransitionAction.impl.TransitionImpl
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 16;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INPUT = 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT = 4;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__STATES = 5;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRANSITIONS = 6;

	/**
	 * The feature id for the '<em><b>Action To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTION_TO_TAKE = 7;

	/**
	 * The feature id for the '<em><b>Event To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT_TO_TAKE = 8;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataCurationStateTransitionAction.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataCurationStateTransitionAction.impl.ActionImpl
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 17;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TARGET = 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dataCurationStateTransitionAction.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dataCurationStateTransitionAction.impl.EventImpl
	 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 18;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TARGET = 3;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction <em>Data Curation State Transition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Curation State Transition Action</em>'.
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionAction
	 * @generated
	 */
	EClass getDataCurationStateTransitionAction();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionAction#getLabel()
	 * @see #getDataCurationStateTransitionAction()
	 * @generated
	 */
	EAttribute getDataCurationStateTransitionAction_Label();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionAction#getName()
	 * @see #getDataCurationStateTransitionAction()
	 * @generated
	 */
	EAttribute getDataCurationStateTransitionAction_Name();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionAction#getData()
	 * @see #getDataCurationStateTransitionAction()
	 * @generated
	 */
	EReference getDataCurationStateTransitionAction_Data();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getIda <em>Ida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ida</em>'.
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionAction#getIda()
	 * @see #getDataCurationStateTransitionAction()
	 * @generated
	 */
	EReference getDataCurationStateTransitionAction_Ida();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getEda <em>Eda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eda</em>'.
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionAction#getEda()
	 * @see #getDataCurationStateTransitionAction()
	 * @generated
	 */
	EReference getDataCurationStateTransitionAction_Eda();

	/**
	 * Returns the meta object for the containment reference list '{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionAction#getStates()
	 * @see #getDataCurationStateTransitionAction()
	 * @generated
	 */
	EReference getDataCurationStateTransitionAction_States();

	/**
	 * Returns the meta object for the containment reference list '{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionAction#getTransitions()
	 * @see #getDataCurationStateTransitionAction()
	 * @generated
	 */
	EReference getDataCurationStateTransitionAction_Transitions();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getActionToTake <em>Action To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action To Take</em>'.
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionAction#getActionToTake()
	 * @see #getDataCurationStateTransitionAction()
	 * @generated
	 */
	EReference getDataCurationStateTransitionAction_ActionToTake();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getEventToTake <em>Event To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event To Take</em>'.
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionAction#getEventToTake()
	 * @see #getDataCurationStateTransitionAction()
	 * @generated
	 */
	EReference getDataCurationStateTransitionAction_EventToTake();

	/**
	 * Returns the meta object for class '{@link dataCurationStateTransitionAction.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see dataCurationStateTransitionAction.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.Data#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataCurationStateTransitionAction.Data#getLabel()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Label();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.Data#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see dataCurationStateTransitionAction.Data#getAttributes()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Attributes();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.Data#getDataValues <em>Data Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Values</em>'.
	 * @see dataCurationStateTransitionAction.Data#getDataValues()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_DataValues();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.Data#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>States</em>'.
	 * @see dataCurationStateTransitionAction.Data#getStates()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_States();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.Data#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transitions</em>'.
	 * @see dataCurationStateTransitionAction.Data#getTransitions()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Transitions();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.Data#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see dataCurationStateTransitionAction.Data#getSource()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Source();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.Data#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see dataCurationStateTransitionAction.Data#getTarget()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Target();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.Data#getActionToTake <em>Action To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action To Take</em>'.
	 * @see dataCurationStateTransitionAction.Data#getActionToTake()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_ActionToTake();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.Data#getEventToTake <em>Event To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event To Take</em>'.
	 * @see dataCurationStateTransitionAction.Data#getEventToTake()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_EventToTake();

	/**
	 * Returns the meta object for class '{@link dataCurationStateTransitionAction.InitialDataAnalysis <em>Initial Data Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Data Analysis</em>'.
	 * @see dataCurationStateTransitionAction.InitialDataAnalysis
	 * @generated
	 */
	EClass getInitialDataAnalysis();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.InitialDataAnalysis#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataCurationStateTransitionAction.InitialDataAnalysis#getLabel()
	 * @see #getInitialDataAnalysis()
	 * @generated
	 */
	EAttribute getInitialDataAnalysis_Label();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.InitialDataAnalysis#getNullValues <em>Null Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Null Values</em>'.
	 * @see dataCurationStateTransitionAction.InitialDataAnalysis#getNullValues()
	 * @see #getInitialDataAnalysis()
	 * @generated
	 */
	EReference getInitialDataAnalysis_NullValues();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.InitialDataAnalysis#getMissingValues <em>Missing Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Missing Values</em>'.
	 * @see dataCurationStateTransitionAction.InitialDataAnalysis#getMissingValues()
	 * @see #getInitialDataAnalysis()
	 * @generated
	 */
	EReference getInitialDataAnalysis_MissingValues();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.InitialDataAnalysis#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>States</em>'.
	 * @see dataCurationStateTransitionAction.InitialDataAnalysis#getStates()
	 * @see #getInitialDataAnalysis()
	 * @generated
	 */
	EReference getInitialDataAnalysis_States();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.InitialDataAnalysis#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transitions</em>'.
	 * @see dataCurationStateTransitionAction.InitialDataAnalysis#getTransitions()
	 * @see #getInitialDataAnalysis()
	 * @generated
	 */
	EReference getInitialDataAnalysis_Transitions();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.InitialDataAnalysis#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see dataCurationStateTransitionAction.InitialDataAnalysis#getSource()
	 * @see #getInitialDataAnalysis()
	 * @generated
	 */
	EReference getInitialDataAnalysis_Source();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.InitialDataAnalysis#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see dataCurationStateTransitionAction.InitialDataAnalysis#getTarget()
	 * @see #getInitialDataAnalysis()
	 * @generated
	 */
	EReference getInitialDataAnalysis_Target();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.InitialDataAnalysis#getActionToTake <em>Action To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action To Take</em>'.
	 * @see dataCurationStateTransitionAction.InitialDataAnalysis#getActionToTake()
	 * @see #getInitialDataAnalysis()
	 * @generated
	 */
	EReference getInitialDataAnalysis_ActionToTake();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.InitialDataAnalysis#getEventToTake <em>Event To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event To Take</em>'.
	 * @see dataCurationStateTransitionAction.InitialDataAnalysis#getEventToTake()
	 * @see #getInitialDataAnalysis()
	 * @generated
	 */
	EReference getInitialDataAnalysis_EventToTake();

	/**
	 * Returns the meta object for class '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis <em>Exploratory Data Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exploratory Data Analysis</em>'.
	 * @see dataCurationStateTransitionAction.ExploratoryDataAnalysis
	 * @generated
	 */
	EClass getExploratoryDataAnalysis();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataCurationStateTransitionAction.ExploratoryDataAnalysis#getLabel()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EAttribute getExploratoryDataAnalysis_Label();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getRSquare <em>RSquare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RSquare</em>'.
	 * @see dataCurationStateTransitionAction.ExploratoryDataAnalysis#getRSquare()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_RSquare();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getPValueFSignificance <em>PValue FSignificance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PValue FSignificance</em>'.
	 * @see dataCurationStateTransitionAction.ExploratoryDataAnalysis#getPValueFSignificance()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_PValueFSignificance();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getUnitaryAnalysis <em>Unitary Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unitary Analysis</em>'.
	 * @see dataCurationStateTransitionAction.ExploratoryDataAnalysis#getUnitaryAnalysis()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_UnitaryAnalysis();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getBiVariateAnalysis <em>Bi Variate Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bi Variate Analysis</em>'.
	 * @see dataCurationStateTransitionAction.ExploratoryDataAnalysis#getBiVariateAnalysis()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_BiVariateAnalysis();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getUnivariateVisualization <em>Univariate Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Univariate Visualization</em>'.
	 * @see dataCurationStateTransitionAction.ExploratoryDataAnalysis#getUnivariateVisualization()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_UnivariateVisualization();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getBiVariateVisualization <em>Bi Variate Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bi Variate Visualization</em>'.
	 * @see dataCurationStateTransitionAction.ExploratoryDataAnalysis#getBiVariateVisualization()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_BiVariateVisualization();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getNormalizationStandardization <em>Normalization Standardization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Normalization Standardization</em>'.
	 * @see dataCurationStateTransitionAction.ExploratoryDataAnalysis#getNormalizationStandardization()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_NormalizationStandardization();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see dataCurationStateTransitionAction.ExploratoryDataAnalysis#getInitialState()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_InitialState();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getFinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Final State</em>'.
	 * @see dataCurationStateTransitionAction.ExploratoryDataAnalysis#getFinalState()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_FinalState();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>States</em>'.
	 * @see dataCurationStateTransitionAction.ExploratoryDataAnalysis#getStates()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_States();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transitions</em>'.
	 * @see dataCurationStateTransitionAction.ExploratoryDataAnalysis#getTransitions()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_Transitions();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see dataCurationStateTransitionAction.ExploratoryDataAnalysis#getSource()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_Source();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see dataCurationStateTransitionAction.ExploratoryDataAnalysis#getTarget()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_Target();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getActionToTake <em>Action To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action To Take</em>'.
	 * @see dataCurationStateTransitionAction.ExploratoryDataAnalysis#getActionToTake()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_ActionToTake();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getEventToTake <em>Event To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event To Take</em>'.
	 * @see dataCurationStateTransitionAction.ExploratoryDataAnalysis#getEventToTake()
	 * @see #getExploratoryDataAnalysis()
	 * @generated
	 */
	EReference getExploratoryDataAnalysis_EventToTake();

	/**
	 * Returns the meta object for class '{@link dataCurationStateTransitionAction.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see dataCurationStateTransitionAction.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.Attribute#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataCurationStateTransitionAction.Attribute#getLabel()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Label();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataCurationStateTransitionAction.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.Attribute#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see dataCurationStateTransitionAction.Attribute#getDataType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DataType();

	/**
	 * Returns the meta object for class '{@link dataCurationStateTransitionAction.DataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Value</em>'.
	 * @see dataCurationStateTransitionAction.DataValue
	 * @generated
	 */
	EClass getDataValue();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.DataValue#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataCurationStateTransitionAction.DataValue#getLabel()
	 * @see #getDataValue()
	 * @generated
	 */
	EAttribute getDataValue_Label();

	/**
	 * Returns the meta object for the attribute list '{@link dataCurationStateTransitionAction.DataValue#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Row</em>'.
	 * @see dataCurationStateTransitionAction.DataValue#getRow()
	 * @see #getDataValue()
	 * @generated
	 */
	EAttribute getDataValue_Row();

	/**
	 * Returns the meta object for class '{@link dataCurationStateTransitionAction.NullValues <em>Null Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Values</em>'.
	 * @see dataCurationStateTransitionAction.NullValues
	 * @generated
	 */
	EClass getNullValues();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.NullValues#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataCurationStateTransitionAction.NullValues#getLabel()
	 * @see #getNullValues()
	 * @generated
	 */
	EAttribute getNullValues_Label();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.NullValues#isRemoveRow <em>Remove Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Row</em>'.
	 * @see dataCurationStateTransitionAction.NullValues#isRemoveRow()
	 * @see #getNullValues()
	 * @generated
	 */
	EAttribute getNullValues_RemoveRow();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.NullValues#getReplacementMethod <em>Replacement Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replacement Method</em>'.
	 * @see dataCurationStateTransitionAction.NullValues#getReplacementMethod()
	 * @see #getNullValues()
	 * @generated
	 */
	EAttribute getNullValues_ReplacementMethod();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.NullValues#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>States</em>'.
	 * @see dataCurationStateTransitionAction.NullValues#getStates()
	 * @see #getNullValues()
	 * @generated
	 */
	EReference getNullValues_States();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.NullValues#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transitions</em>'.
	 * @see dataCurationStateTransitionAction.NullValues#getTransitions()
	 * @see #getNullValues()
	 * @generated
	 */
	EReference getNullValues_Transitions();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.NullValues#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see dataCurationStateTransitionAction.NullValues#getSource()
	 * @see #getNullValues()
	 * @generated
	 */
	EReference getNullValues_Source();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.NullValues#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see dataCurationStateTransitionAction.NullValues#getTarget()
	 * @see #getNullValues()
	 * @generated
	 */
	EReference getNullValues_Target();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.NullValues#getActionToTake <em>Action To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action To Take</em>'.
	 * @see dataCurationStateTransitionAction.NullValues#getActionToTake()
	 * @see #getNullValues()
	 * @generated
	 */
	EReference getNullValues_ActionToTake();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.NullValues#getEventToTake <em>Event To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event To Take</em>'.
	 * @see dataCurationStateTransitionAction.NullValues#getEventToTake()
	 * @see #getNullValues()
	 * @generated
	 */
	EReference getNullValues_EventToTake();

	/**
	 * Returns the meta object for class '{@link dataCurationStateTransitionAction.MissingValues <em>Missing Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Missing Values</em>'.
	 * @see dataCurationStateTransitionAction.MissingValues
	 * @generated
	 */
	EClass getMissingValues();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.MissingValues#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataCurationStateTransitionAction.MissingValues#getLabel()
	 * @see #getMissingValues()
	 * @generated
	 */
	EAttribute getMissingValues_Label();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.MissingValues#isRemoveRows <em>Remove Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Rows</em>'.
	 * @see dataCurationStateTransitionAction.MissingValues#isRemoveRows()
	 * @see #getMissingValues()
	 * @generated
	 */
	EAttribute getMissingValues_RemoveRows();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.MissingValues#getReplacementMethod <em>Replacement Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replacement Method</em>'.
	 * @see dataCurationStateTransitionAction.MissingValues#getReplacementMethod()
	 * @see #getMissingValues()
	 * @generated
	 */
	EAttribute getMissingValues_ReplacementMethod();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.MissingValues#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>States</em>'.
	 * @see dataCurationStateTransitionAction.MissingValues#getStates()
	 * @see #getMissingValues()
	 * @generated
	 */
	EReference getMissingValues_States();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.MissingValues#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transitions</em>'.
	 * @see dataCurationStateTransitionAction.MissingValues#getTransitions()
	 * @see #getMissingValues()
	 * @generated
	 */
	EReference getMissingValues_Transitions();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.MissingValues#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see dataCurationStateTransitionAction.MissingValues#getSource()
	 * @see #getMissingValues()
	 * @generated
	 */
	EReference getMissingValues_Source();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.MissingValues#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see dataCurationStateTransitionAction.MissingValues#getTarget()
	 * @see #getMissingValues()
	 * @generated
	 */
	EReference getMissingValues_Target();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.MissingValues#getActionToTake <em>Action To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action To Take</em>'.
	 * @see dataCurationStateTransitionAction.MissingValues#getActionToTake()
	 * @see #getMissingValues()
	 * @generated
	 */
	EReference getMissingValues_ActionToTake();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.MissingValues#getEventToTake <em>Event To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event To Take</em>'.
	 * @see dataCurationStateTransitionAction.MissingValues#getEventToTake()
	 * @see #getMissingValues()
	 * @generated
	 */
	EReference getMissingValues_EventToTake();

	/**
	 * Returns the meta object for class '{@link dataCurationStateTransitionAction.RSquare <em>RSquare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RSquare</em>'.
	 * @see dataCurationStateTransitionAction.RSquare
	 * @generated
	 */
	EClass getRSquare();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.RSquare#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataCurationStateTransitionAction.RSquare#getLabel()
	 * @see #getRSquare()
	 * @generated
	 */
	EAttribute getRSquare_Label();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.RSquare#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dataCurationStateTransitionAction.RSquare#getValue()
	 * @see #getRSquare()
	 * @generated
	 */
	EAttribute getRSquare_Value();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.RSquare#getAdjustedRSquare <em>Adjusted RSquare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adjusted RSquare</em>'.
	 * @see dataCurationStateTransitionAction.RSquare#getAdjustedRSquare()
	 * @see #getRSquare()
	 * @generated
	 */
	EAttribute getRSquare_AdjustedRSquare();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.RSquare#getCutOffForRSquare <em>Cut Off For RSquare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut Off For RSquare</em>'.
	 * @see dataCurationStateTransitionAction.RSquare#getCutOffForRSquare()
	 * @see #getRSquare()
	 * @generated
	 */
	EAttribute getRSquare_CutOffForRSquare();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.RSquare#getIsDataFitForRegression <em>Is Data Fit For Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Data Fit For Regression</em>'.
	 * @see dataCurationStateTransitionAction.RSquare#getIsDataFitForRegression()
	 * @see #getRSquare()
	 * @generated
	 */
	EAttribute getRSquare_IsDataFitForRegression();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.RSquare#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>States</em>'.
	 * @see dataCurationStateTransitionAction.RSquare#getStates()
	 * @see #getRSquare()
	 * @generated
	 */
	EReference getRSquare_States();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.RSquare#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transitions</em>'.
	 * @see dataCurationStateTransitionAction.RSquare#getTransitions()
	 * @see #getRSquare()
	 * @generated
	 */
	EReference getRSquare_Transitions();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.RSquare#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see dataCurationStateTransitionAction.RSquare#getSource()
	 * @see #getRSquare()
	 * @generated
	 */
	EReference getRSquare_Source();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.RSquare#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see dataCurationStateTransitionAction.RSquare#getTarget()
	 * @see #getRSquare()
	 * @generated
	 */
	EReference getRSquare_Target();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.RSquare#getActionToTake <em>Action To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action To Take</em>'.
	 * @see dataCurationStateTransitionAction.RSquare#getActionToTake()
	 * @see #getRSquare()
	 * @generated
	 */
	EReference getRSquare_ActionToTake();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.RSquare#getEventToTake <em>Event To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event To Take</em>'.
	 * @see dataCurationStateTransitionAction.RSquare#getEventToTake()
	 * @see #getRSquare()
	 * @generated
	 */
	EReference getRSquare_EventToTake();

	/**
	 * Returns the meta object for class '{@link dataCurationStateTransitionAction.PValueFSignificance <em>PValue FSignificance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PValue FSignificance</em>'.
	 * @see dataCurationStateTransitionAction.PValueFSignificance
	 * @generated
	 */
	EClass getPValueFSignificance();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.PValueFSignificance#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataCurationStateTransitionAction.PValueFSignificance#getLabel()
	 * @see #getPValueFSignificance()
	 * @generated
	 */
	EAttribute getPValueFSignificance_Label();

	/**
	 * Returns the meta object for the attribute list '{@link dataCurationStateTransitionAction.PValueFSignificance#getAttributeList <em>Attribute List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attribute List</em>'.
	 * @see dataCurationStateTransitionAction.PValueFSignificance#getAttributeList()
	 * @see #getPValueFSignificance()
	 * @generated
	 */
	EAttribute getPValueFSignificance_AttributeList();

	/**
	 * Returns the meta object for the attribute list '{@link dataCurationStateTransitionAction.PValueFSignificance#getAttributePValues <em>Attribute PValues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attribute PValues</em>'.
	 * @see dataCurationStateTransitionAction.PValueFSignificance#getAttributePValues()
	 * @see #getPValueFSignificance()
	 * @generated
	 */
	EAttribute getPValueFSignificance_AttributePValues();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.PValueFSignificance#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>States</em>'.
	 * @see dataCurationStateTransitionAction.PValueFSignificance#getStates()
	 * @see #getPValueFSignificance()
	 * @generated
	 */
	EReference getPValueFSignificance_States();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.PValueFSignificance#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transitions</em>'.
	 * @see dataCurationStateTransitionAction.PValueFSignificance#getTransitions()
	 * @see #getPValueFSignificance()
	 * @generated
	 */
	EReference getPValueFSignificance_Transitions();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.PValueFSignificance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see dataCurationStateTransitionAction.PValueFSignificance#getSource()
	 * @see #getPValueFSignificance()
	 * @generated
	 */
	EReference getPValueFSignificance_Source();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.PValueFSignificance#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see dataCurationStateTransitionAction.PValueFSignificance#getTarget()
	 * @see #getPValueFSignificance()
	 * @generated
	 */
	EReference getPValueFSignificance_Target();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.PValueFSignificance#getActionToTake <em>Action To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action To Take</em>'.
	 * @see dataCurationStateTransitionAction.PValueFSignificance#getActionToTake()
	 * @see #getPValueFSignificance()
	 * @generated
	 */
	EReference getPValueFSignificance_ActionToTake();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.PValueFSignificance#getEventToTake <em>Event To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event To Take</em>'.
	 * @see dataCurationStateTransitionAction.PValueFSignificance#getEventToTake()
	 * @see #getPValueFSignificance()
	 * @generated
	 */
	EReference getPValueFSignificance_EventToTake();

	/**
	 * Returns the meta object for class '{@link dataCurationStateTransitionAction.UnitaryAnalysis <em>Unitary Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unitary Analysis</em>'.
	 * @see dataCurationStateTransitionAction.UnitaryAnalysis
	 * @generated
	 */
	EClass getUnitaryAnalysis();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.UnitaryAnalysis#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataCurationStateTransitionAction.UnitaryAnalysis#getLabel()
	 * @see #getUnitaryAnalysis()
	 * @generated
	 */
	EAttribute getUnitaryAnalysis_Label();

	/**
	 * Returns the meta object for the attribute list '{@link dataCurationStateTransitionAction.UnitaryAnalysis#getAllowedMethods <em>Allowed Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Allowed Methods</em>'.
	 * @see dataCurationStateTransitionAction.UnitaryAnalysis#getAllowedMethods()
	 * @see #getUnitaryAnalysis()
	 * @generated
	 */
	EAttribute getUnitaryAnalysis_AllowedMethods();

	/**
	 * Returns the meta object for the attribute list '{@link dataCurationStateTransitionAction.UnitaryAnalysis#getSelectedMethods <em>Selected Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Selected Methods</em>'.
	 * @see dataCurationStateTransitionAction.UnitaryAnalysis#getSelectedMethods()
	 * @see #getUnitaryAnalysis()
	 * @generated
	 */
	EAttribute getUnitaryAnalysis_SelectedMethods();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.UnitaryAnalysis#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>States</em>'.
	 * @see dataCurationStateTransitionAction.UnitaryAnalysis#getStates()
	 * @see #getUnitaryAnalysis()
	 * @generated
	 */
	EReference getUnitaryAnalysis_States();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.UnitaryAnalysis#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transitions</em>'.
	 * @see dataCurationStateTransitionAction.UnitaryAnalysis#getTransitions()
	 * @see #getUnitaryAnalysis()
	 * @generated
	 */
	EReference getUnitaryAnalysis_Transitions();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.UnitaryAnalysis#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see dataCurationStateTransitionAction.UnitaryAnalysis#getSource()
	 * @see #getUnitaryAnalysis()
	 * @generated
	 */
	EReference getUnitaryAnalysis_Source();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.UnitaryAnalysis#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see dataCurationStateTransitionAction.UnitaryAnalysis#getTarget()
	 * @see #getUnitaryAnalysis()
	 * @generated
	 */
	EReference getUnitaryAnalysis_Target();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.UnitaryAnalysis#getActionToTake <em>Action To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action To Take</em>'.
	 * @see dataCurationStateTransitionAction.UnitaryAnalysis#getActionToTake()
	 * @see #getUnitaryAnalysis()
	 * @generated
	 */
	EReference getUnitaryAnalysis_ActionToTake();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.UnitaryAnalysis#getEventToTake <em>Event To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event To Take</em>'.
	 * @see dataCurationStateTransitionAction.UnitaryAnalysis#getEventToTake()
	 * @see #getUnitaryAnalysis()
	 * @generated
	 */
	EReference getUnitaryAnalysis_EventToTake();

	/**
	 * Returns the meta object for class '{@link dataCurationStateTransitionAction.BiVariateAnalysis <em>Bi Variate Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bi Variate Analysis</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateAnalysis
	 * @generated
	 */
	EClass getBiVariateAnalysis();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.BiVariateAnalysis#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateAnalysis#getLabel()
	 * @see #getBiVariateAnalysis()
	 * @generated
	 */
	EAttribute getBiVariateAnalysis_Label();

	/**
	 * Returns the meta object for the attribute list '{@link dataCurationStateTransitionAction.BiVariateAnalysis#getAllowedMethods <em>Allowed Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Allowed Methods</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateAnalysis#getAllowedMethods()
	 * @see #getBiVariateAnalysis()
	 * @generated
	 */
	EAttribute getBiVariateAnalysis_AllowedMethods();

	/**
	 * Returns the meta object for the attribute list '{@link dataCurationStateTransitionAction.BiVariateAnalysis#getSelectedMethods <em>Selected Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Selected Methods</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateAnalysis#getSelectedMethods()
	 * @see #getBiVariateAnalysis()
	 * @generated
	 */
	EAttribute getBiVariateAnalysis_SelectedMethods();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.BiVariateAnalysis#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>States</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateAnalysis#getStates()
	 * @see #getBiVariateAnalysis()
	 * @generated
	 */
	EReference getBiVariateAnalysis_States();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.BiVariateAnalysis#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transitions</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateAnalysis#getTransitions()
	 * @see #getBiVariateAnalysis()
	 * @generated
	 */
	EReference getBiVariateAnalysis_Transitions();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.BiVariateAnalysis#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateAnalysis#getSource()
	 * @see #getBiVariateAnalysis()
	 * @generated
	 */
	EReference getBiVariateAnalysis_Source();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.BiVariateAnalysis#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateAnalysis#getTarget()
	 * @see #getBiVariateAnalysis()
	 * @generated
	 */
	EReference getBiVariateAnalysis_Target();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.BiVariateAnalysis#getActionToTake <em>Action To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action To Take</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateAnalysis#getActionToTake()
	 * @see #getBiVariateAnalysis()
	 * @generated
	 */
	EReference getBiVariateAnalysis_ActionToTake();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.BiVariateAnalysis#getEventToTake <em>Event To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event To Take</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateAnalysis#getEventToTake()
	 * @see #getBiVariateAnalysis()
	 * @generated
	 */
	EReference getBiVariateAnalysis_EventToTake();

	/**
	 * Returns the meta object for class '{@link dataCurationStateTransitionAction.UnivariateVisualization <em>Univariate Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Univariate Visualization</em>'.
	 * @see dataCurationStateTransitionAction.UnivariateVisualization
	 * @generated
	 */
	EClass getUnivariateVisualization();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.UnivariateVisualization#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataCurationStateTransitionAction.UnivariateVisualization#getLabel()
	 * @see #getUnivariateVisualization()
	 * @generated
	 */
	EAttribute getUnivariateVisualization_Label();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.UnivariateVisualization#isMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see dataCurationStateTransitionAction.UnivariateVisualization#isMethod()
	 * @see #getUnivariateVisualization()
	 * @generated
	 */
	EAttribute getUnivariateVisualization_Method();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.UnivariateVisualization#isShowLegend <em>Show Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Legend</em>'.
	 * @see dataCurationStateTransitionAction.UnivariateVisualization#isShowLegend()
	 * @see #getUnivariateVisualization()
	 * @generated
	 */
	EAttribute getUnivariateVisualization_ShowLegend();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.UnivariateVisualization#isShowTitle <em>Show Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Title</em>'.
	 * @see dataCurationStateTransitionAction.UnivariateVisualization#isShowTitle()
	 * @see #getUnivariateVisualization()
	 * @generated
	 */
	EAttribute getUnivariateVisualization_ShowTitle();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.UnivariateVisualization#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>States</em>'.
	 * @see dataCurationStateTransitionAction.UnivariateVisualization#getStates()
	 * @see #getUnivariateVisualization()
	 * @generated
	 */
	EReference getUnivariateVisualization_States();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.UnivariateVisualization#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transitions</em>'.
	 * @see dataCurationStateTransitionAction.UnivariateVisualization#getTransitions()
	 * @see #getUnivariateVisualization()
	 * @generated
	 */
	EReference getUnivariateVisualization_Transitions();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.UnivariateVisualization#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see dataCurationStateTransitionAction.UnivariateVisualization#getSource()
	 * @see #getUnivariateVisualization()
	 * @generated
	 */
	EReference getUnivariateVisualization_Source();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.UnivariateVisualization#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see dataCurationStateTransitionAction.UnivariateVisualization#getTarget()
	 * @see #getUnivariateVisualization()
	 * @generated
	 */
	EReference getUnivariateVisualization_Target();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.UnivariateVisualization#getActionToTake <em>Action To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action To Take</em>'.
	 * @see dataCurationStateTransitionAction.UnivariateVisualization#getActionToTake()
	 * @see #getUnivariateVisualization()
	 * @generated
	 */
	EReference getUnivariateVisualization_ActionToTake();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.UnivariateVisualization#getEventToTake <em>Event To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event To Take</em>'.
	 * @see dataCurationStateTransitionAction.UnivariateVisualization#getEventToTake()
	 * @see #getUnivariateVisualization()
	 * @generated
	 */
	EReference getUnivariateVisualization_EventToTake();

	/**
	 * Returns the meta object for class '{@link dataCurationStateTransitionAction.BiVariateVisualization <em>Bi Variate Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bi Variate Visualization</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateVisualization
	 * @generated
	 */
	EClass getBiVariateVisualization();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.BiVariateVisualization#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateVisualization#getLabel()
	 * @see #getBiVariateVisualization()
	 * @generated
	 */
	EAttribute getBiVariateVisualization_Label();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.BiVariateVisualization#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateVisualization#getMethod()
	 * @see #getBiVariateVisualization()
	 * @generated
	 */
	EAttribute getBiVariateVisualization_Method();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.BiVariateVisualization#isShowLegend <em>Show Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Legend</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateVisualization#isShowLegend()
	 * @see #getBiVariateVisualization()
	 * @generated
	 */
	EAttribute getBiVariateVisualization_ShowLegend();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.BiVariateVisualization#isShowTitle <em>Show Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Title</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateVisualization#isShowTitle()
	 * @see #getBiVariateVisualization()
	 * @generated
	 */
	EAttribute getBiVariateVisualization_ShowTitle();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.BiVariateVisualization#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>States</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateVisualization#getStates()
	 * @see #getBiVariateVisualization()
	 * @generated
	 */
	EReference getBiVariateVisualization_States();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.BiVariateVisualization#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transitions</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateVisualization#getTransitions()
	 * @see #getBiVariateVisualization()
	 * @generated
	 */
	EReference getBiVariateVisualization_Transitions();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.BiVariateVisualization#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateVisualization#getSource()
	 * @see #getBiVariateVisualization()
	 * @generated
	 */
	EReference getBiVariateVisualization_Source();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.BiVariateVisualization#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateVisualization#getTarget()
	 * @see #getBiVariateVisualization()
	 * @generated
	 */
	EReference getBiVariateVisualization_Target();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.BiVariateVisualization#getActionToTake <em>Action To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action To Take</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateVisualization#getActionToTake()
	 * @see #getBiVariateVisualization()
	 * @generated
	 */
	EReference getBiVariateVisualization_ActionToTake();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.BiVariateVisualization#getEventToTake <em>Event To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event To Take</em>'.
	 * @see dataCurationStateTransitionAction.BiVariateVisualization#getEventToTake()
	 * @see #getBiVariateVisualization()
	 * @generated
	 */
	EReference getBiVariateVisualization_EventToTake();

	/**
	 * Returns the meta object for class '{@link dataCurationStateTransitionAction.NormalizationStandardization <em>Normalization Standardization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normalization Standardization</em>'.
	 * @see dataCurationStateTransitionAction.NormalizationStandardization
	 * @generated
	 */
	EClass getNormalizationStandardization();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.NormalizationStandardization#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataCurationStateTransitionAction.NormalizationStandardization#getLabel()
	 * @see #getNormalizationStandardization()
	 * @generated
	 */
	EAttribute getNormalizationStandardization_Label();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.NormalizationStandardization#isNormalizeFrom0To1 <em>Normalize From0 To1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normalize From0 To1</em>'.
	 * @see dataCurationStateTransitionAction.NormalizationStandardization#isNormalizeFrom0To1()
	 * @see #getNormalizationStandardization()
	 * @generated
	 */
	EAttribute getNormalizationStandardization_NormalizeFrom0To1();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.NormalizationStandardization#isStandardizeFromMinus1To1 <em>Standardize From Minus1 To1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standardize From Minus1 To1</em>'.
	 * @see dataCurationStateTransitionAction.NormalizationStandardization#isStandardizeFromMinus1To1()
	 * @see #getNormalizationStandardization()
	 * @generated
	 */
	EAttribute getNormalizationStandardization_StandardizeFromMinus1To1();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.NormalizationStandardization#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>States</em>'.
	 * @see dataCurationStateTransitionAction.NormalizationStandardization#getStates()
	 * @see #getNormalizationStandardization()
	 * @generated
	 */
	EReference getNormalizationStandardization_States();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.NormalizationStandardization#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transitions</em>'.
	 * @see dataCurationStateTransitionAction.NormalizationStandardization#getTransitions()
	 * @see #getNormalizationStandardization()
	 * @generated
	 */
	EReference getNormalizationStandardization_Transitions();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.NormalizationStandardization#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see dataCurationStateTransitionAction.NormalizationStandardization#getSource()
	 * @see #getNormalizationStandardization()
	 * @generated
	 */
	EReference getNormalizationStandardization_Source();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.NormalizationStandardization#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see dataCurationStateTransitionAction.NormalizationStandardization#getTarget()
	 * @see #getNormalizationStandardization()
	 * @generated
	 */
	EReference getNormalizationStandardization_Target();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.NormalizationStandardization#getActionToTake <em>Action To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action To Take</em>'.
	 * @see dataCurationStateTransitionAction.NormalizationStandardization#getActionToTake()
	 * @see #getNormalizationStandardization()
	 * @generated
	 */
	EReference getNormalizationStandardization_ActionToTake();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.NormalizationStandardization#getEventToTake <em>Event To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event To Take</em>'.
	 * @see dataCurationStateTransitionAction.NormalizationStandardization#getEventToTake()
	 * @see #getNormalizationStandardization()
	 * @generated
	 */
	EReference getNormalizationStandardization_EventToTake();

	/**
	 * Returns the meta object for class '{@link dataCurationStateTransitionAction.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see dataCurationStateTransitionAction.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataCurationStateTransitionAction.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Label();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataCurationStateTransitionAction.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.State#isIsInitial <em>Is Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial</em>'.
	 * @see dataCurationStateTransitionAction.State#isIsInitial()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsInitial();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.State#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see dataCurationStateTransitionAction.State#isIsFinal()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsFinal();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see dataCurationStateTransitionAction.State#getOutgoingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutgoingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link dataCurationStateTransitionAction.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see dataCurationStateTransitionAction.State#getIncomingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IncomingTransitions();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.State#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>States</em>'.
	 * @see dataCurationStateTransitionAction.State#getStates()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_States();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.State#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transitions</em>'.
	 * @see dataCurationStateTransitionAction.State#getTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transitions();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.State#getActionToTake <em>Action To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action To Take</em>'.
	 * @see dataCurationStateTransitionAction.State#getActionToTake()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ActionToTake();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.State#getEventToTake <em>Event To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event To Take</em>'.
	 * @see dataCurationStateTransitionAction.State#getEventToTake()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EventToTake();

	/**
	 * Returns the meta object for class '{@link dataCurationStateTransitionAction.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see dataCurationStateTransitionAction.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataCurationStateTransitionAction.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Label();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataCurationStateTransitionAction.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.Transition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see dataCurationStateTransitionAction.Transition#getInput()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Input();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.Transition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see dataCurationStateTransitionAction.Transition#getOutput()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Output();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.Transition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see dataCurationStateTransitionAction.Transition#getEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Event();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.Transition#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>States</em>'.
	 * @see dataCurationStateTransitionAction.Transition#getStates()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_States();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.Transition#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transitions</em>'.
	 * @see dataCurationStateTransitionAction.Transition#getTransitions()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Transitions();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.Transition#getActionToTake <em>Action To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action To Take</em>'.
	 * @see dataCurationStateTransitionAction.Transition#getActionToTake()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ActionToTake();

	/**
	 * Returns the meta object for the containment reference '{@link dataCurationStateTransitionAction.Transition#getEventToTake <em>Event To Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event To Take</em>'.
	 * @see dataCurationStateTransitionAction.Transition#getEventToTake()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_EventToTake();

	/**
	 * Returns the meta object for class '{@link dataCurationStateTransitionAction.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see dataCurationStateTransitionAction.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.Action#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataCurationStateTransitionAction.Action#getLabel()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Label();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataCurationStateTransitionAction.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.Action#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see dataCurationStateTransitionAction.Action#getSource()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Source();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.Action#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see dataCurationStateTransitionAction.Action#getTarget()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Target();

	/**
	 * Returns the meta object for class '{@link dataCurationStateTransitionAction.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see dataCurationStateTransitionAction.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.Event#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dataCurationStateTransitionAction.Event#getLabel()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Label();

	/**
	 * Returns the meta object for the attribute '{@link dataCurationStateTransitionAction.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dataCurationStateTransitionAction.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.Event#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see dataCurationStateTransitionAction.Event#getSource()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Source();

	/**
	 * Returns the meta object for the reference '{@link dataCurationStateTransitionAction.Event#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see dataCurationStateTransitionAction.Event#getTarget()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataCurationStateTransitionActionFactory getDataCurationStateTransitionActionFactory();

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
		 * The meta object literal for the '{@link dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionImpl <em>Data Curation State Transition Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionImpl
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getDataCurationStateTransitionAction()
		 * @generated
		 */
		EClass DATA_CURATION_STATE_TRANSITION_ACTION = eINSTANCE.getDataCurationStateTransitionAction();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CURATION_STATE_TRANSITION_ACTION__LABEL = eINSTANCE.getDataCurationStateTransitionAction_Label();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CURATION_STATE_TRANSITION_ACTION__NAME = eINSTANCE.getDataCurationStateTransitionAction_Name();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CURATION_STATE_TRANSITION_ACTION__DATA = eINSTANCE.getDataCurationStateTransitionAction_Data();

		/**
		 * The meta object literal for the '<em><b>Ida</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CURATION_STATE_TRANSITION_ACTION__IDA = eINSTANCE.getDataCurationStateTransitionAction_Ida();

		/**
		 * The meta object literal for the '<em><b>Eda</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CURATION_STATE_TRANSITION_ACTION__EDA = eINSTANCE.getDataCurationStateTransitionAction_Eda();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CURATION_STATE_TRANSITION_ACTION__STATES = eINSTANCE.getDataCurationStateTransitionAction_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CURATION_STATE_TRANSITION_ACTION__TRANSITIONS = eINSTANCE.getDataCurationStateTransitionAction_Transitions();

		/**
		 * The meta object literal for the '<em><b>Action To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CURATION_STATE_TRANSITION_ACTION__ACTION_TO_TAKE = eINSTANCE.getDataCurationStateTransitionAction_ActionToTake();

		/**
		 * The meta object literal for the '<em><b>Event To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CURATION_STATE_TRANSITION_ACTION__EVENT_TO_TAKE = eINSTANCE.getDataCurationStateTransitionAction_EventToTake();

		/**
		 * The meta object literal for the '{@link dataCurationStateTransitionAction.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataCurationStateTransitionAction.impl.DataImpl
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getData()
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
		 * The meta object literal for the '<em><b>States</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__STATES = eINSTANCE.getData_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__TRANSITIONS = eINSTANCE.getData_Transitions();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__SOURCE = eINSTANCE.getData_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__TARGET = eINSTANCE.getData_Target();

		/**
		 * The meta object literal for the '<em><b>Action To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__ACTION_TO_TAKE = eINSTANCE.getData_ActionToTake();

		/**
		 * The meta object literal for the '<em><b>Event To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__EVENT_TO_TAKE = eINSTANCE.getData_EventToTake();

		/**
		 * The meta object literal for the '{@link dataCurationStateTransitionAction.impl.InitialDataAnalysisImpl <em>Initial Data Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataCurationStateTransitionAction.impl.InitialDataAnalysisImpl
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getInitialDataAnalysis()
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
		 * The meta object literal for the '<em><b>States</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_DATA_ANALYSIS__STATES = eINSTANCE.getInitialDataAnalysis_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_DATA_ANALYSIS__TRANSITIONS = eINSTANCE.getInitialDataAnalysis_Transitions();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_DATA_ANALYSIS__SOURCE = eINSTANCE.getInitialDataAnalysis_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_DATA_ANALYSIS__TARGET = eINSTANCE.getInitialDataAnalysis_Target();

		/**
		 * The meta object literal for the '<em><b>Action To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_DATA_ANALYSIS__ACTION_TO_TAKE = eINSTANCE.getInitialDataAnalysis_ActionToTake();

		/**
		 * The meta object literal for the '<em><b>Event To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_DATA_ANALYSIS__EVENT_TO_TAKE = eINSTANCE.getInitialDataAnalysis_EventToTake();

		/**
		 * The meta object literal for the '{@link dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl <em>Exploratory Data Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getExploratoryDataAnalysis()
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
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLORATORY_DATA_ANALYSIS__INITIAL_STATE = eINSTANCE.getExploratoryDataAnalysis_InitialState();

		/**
		 * The meta object literal for the '<em><b>Final State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLORATORY_DATA_ANALYSIS__FINAL_STATE = eINSTANCE.getExploratoryDataAnalysis_FinalState();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLORATORY_DATA_ANALYSIS__STATES = eINSTANCE.getExploratoryDataAnalysis_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLORATORY_DATA_ANALYSIS__TRANSITIONS = eINSTANCE.getExploratoryDataAnalysis_Transitions();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLORATORY_DATA_ANALYSIS__SOURCE = eINSTANCE.getExploratoryDataAnalysis_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLORATORY_DATA_ANALYSIS__TARGET = eINSTANCE.getExploratoryDataAnalysis_Target();

		/**
		 * The meta object literal for the '<em><b>Action To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLORATORY_DATA_ANALYSIS__ACTION_TO_TAKE = eINSTANCE.getExploratoryDataAnalysis_ActionToTake();

		/**
		 * The meta object literal for the '<em><b>Event To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLORATORY_DATA_ANALYSIS__EVENT_TO_TAKE = eINSTANCE.getExploratoryDataAnalysis_EventToTake();

		/**
		 * The meta object literal for the '{@link dataCurationStateTransitionAction.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataCurationStateTransitionAction.impl.AttributeImpl
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getAttribute()
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
		 * The meta object literal for the '{@link dataCurationStateTransitionAction.impl.DataValueImpl <em>Data Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataCurationStateTransitionAction.impl.DataValueImpl
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getDataValue()
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
		 * The meta object literal for the '{@link dataCurationStateTransitionAction.impl.NullValuesImpl <em>Null Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataCurationStateTransitionAction.impl.NullValuesImpl
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getNullValues()
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
		 * The meta object literal for the '<em><b>States</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NULL_VALUES__STATES = eINSTANCE.getNullValues_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NULL_VALUES__TRANSITIONS = eINSTANCE.getNullValues_Transitions();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NULL_VALUES__SOURCE = eINSTANCE.getNullValues_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NULL_VALUES__TARGET = eINSTANCE.getNullValues_Target();

		/**
		 * The meta object literal for the '<em><b>Action To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NULL_VALUES__ACTION_TO_TAKE = eINSTANCE.getNullValues_ActionToTake();

		/**
		 * The meta object literal for the '<em><b>Event To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NULL_VALUES__EVENT_TO_TAKE = eINSTANCE.getNullValues_EventToTake();

		/**
		 * The meta object literal for the '{@link dataCurationStateTransitionAction.impl.MissingValuesImpl <em>Missing Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataCurationStateTransitionAction.impl.MissingValuesImpl
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getMissingValues()
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
		 * The meta object literal for the '<em><b>States</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSING_VALUES__STATES = eINSTANCE.getMissingValues_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSING_VALUES__TRANSITIONS = eINSTANCE.getMissingValues_Transitions();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSING_VALUES__SOURCE = eINSTANCE.getMissingValues_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSING_VALUES__TARGET = eINSTANCE.getMissingValues_Target();

		/**
		 * The meta object literal for the '<em><b>Action To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSING_VALUES__ACTION_TO_TAKE = eINSTANCE.getMissingValues_ActionToTake();

		/**
		 * The meta object literal for the '<em><b>Event To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSING_VALUES__EVENT_TO_TAKE = eINSTANCE.getMissingValues_EventToTake();

		/**
		 * The meta object literal for the '{@link dataCurationStateTransitionAction.impl.RSquareImpl <em>RSquare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataCurationStateTransitionAction.impl.RSquareImpl
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getRSquare()
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
		 * The meta object literal for the '<em><b>States</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSQUARE__STATES = eINSTANCE.getRSquare_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSQUARE__TRANSITIONS = eINSTANCE.getRSquare_Transitions();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSQUARE__SOURCE = eINSTANCE.getRSquare_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSQUARE__TARGET = eINSTANCE.getRSquare_Target();

		/**
		 * The meta object literal for the '<em><b>Action To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSQUARE__ACTION_TO_TAKE = eINSTANCE.getRSquare_ActionToTake();

		/**
		 * The meta object literal for the '<em><b>Event To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSQUARE__EVENT_TO_TAKE = eINSTANCE.getRSquare_EventToTake();

		/**
		 * The meta object literal for the '{@link dataCurationStateTransitionAction.impl.PValueFSignificanceImpl <em>PValue FSignificance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataCurationStateTransitionAction.impl.PValueFSignificanceImpl
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getPValueFSignificance()
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
		 * The meta object literal for the '<em><b>States</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVALUE_FSIGNIFICANCE__STATES = eINSTANCE.getPValueFSignificance_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVALUE_FSIGNIFICANCE__TRANSITIONS = eINSTANCE.getPValueFSignificance_Transitions();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVALUE_FSIGNIFICANCE__SOURCE = eINSTANCE.getPValueFSignificance_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVALUE_FSIGNIFICANCE__TARGET = eINSTANCE.getPValueFSignificance_Target();

		/**
		 * The meta object literal for the '<em><b>Action To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVALUE_FSIGNIFICANCE__ACTION_TO_TAKE = eINSTANCE.getPValueFSignificance_ActionToTake();

		/**
		 * The meta object literal for the '<em><b>Event To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVALUE_FSIGNIFICANCE__EVENT_TO_TAKE = eINSTANCE.getPValueFSignificance_EventToTake();

		/**
		 * The meta object literal for the '{@link dataCurationStateTransitionAction.impl.UnitaryAnalysisImpl <em>Unitary Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataCurationStateTransitionAction.impl.UnitaryAnalysisImpl
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getUnitaryAnalysis()
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
		 * The meta object literal for the '<em><b>States</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNITARY_ANALYSIS__STATES = eINSTANCE.getUnitaryAnalysis_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNITARY_ANALYSIS__TRANSITIONS = eINSTANCE.getUnitaryAnalysis_Transitions();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNITARY_ANALYSIS__SOURCE = eINSTANCE.getUnitaryAnalysis_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNITARY_ANALYSIS__TARGET = eINSTANCE.getUnitaryAnalysis_Target();

		/**
		 * The meta object literal for the '<em><b>Action To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNITARY_ANALYSIS__ACTION_TO_TAKE = eINSTANCE.getUnitaryAnalysis_ActionToTake();

		/**
		 * The meta object literal for the '<em><b>Event To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNITARY_ANALYSIS__EVENT_TO_TAKE = eINSTANCE.getUnitaryAnalysis_EventToTake();

		/**
		 * The meta object literal for the '{@link dataCurationStateTransitionAction.impl.BiVariateAnalysisImpl <em>Bi Variate Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataCurationStateTransitionAction.impl.BiVariateAnalysisImpl
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getBiVariateAnalysis()
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
		 * The meta object literal for the '<em><b>States</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BI_VARIATE_ANALYSIS__STATES = eINSTANCE.getBiVariateAnalysis_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BI_VARIATE_ANALYSIS__TRANSITIONS = eINSTANCE.getBiVariateAnalysis_Transitions();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BI_VARIATE_ANALYSIS__SOURCE = eINSTANCE.getBiVariateAnalysis_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BI_VARIATE_ANALYSIS__TARGET = eINSTANCE.getBiVariateAnalysis_Target();

		/**
		 * The meta object literal for the '<em><b>Action To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BI_VARIATE_ANALYSIS__ACTION_TO_TAKE = eINSTANCE.getBiVariateAnalysis_ActionToTake();

		/**
		 * The meta object literal for the '<em><b>Event To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BI_VARIATE_ANALYSIS__EVENT_TO_TAKE = eINSTANCE.getBiVariateAnalysis_EventToTake();

		/**
		 * The meta object literal for the '{@link dataCurationStateTransitionAction.impl.UnivariateVisualizationImpl <em>Univariate Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataCurationStateTransitionAction.impl.UnivariateVisualizationImpl
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getUnivariateVisualization()
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
		 * The meta object literal for the '<em><b>States</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVARIATE_VISUALIZATION__STATES = eINSTANCE.getUnivariateVisualization_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVARIATE_VISUALIZATION__TRANSITIONS = eINSTANCE.getUnivariateVisualization_Transitions();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVARIATE_VISUALIZATION__SOURCE = eINSTANCE.getUnivariateVisualization_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVARIATE_VISUALIZATION__TARGET = eINSTANCE.getUnivariateVisualization_Target();

		/**
		 * The meta object literal for the '<em><b>Action To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVARIATE_VISUALIZATION__ACTION_TO_TAKE = eINSTANCE.getUnivariateVisualization_ActionToTake();

		/**
		 * The meta object literal for the '<em><b>Event To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVARIATE_VISUALIZATION__EVENT_TO_TAKE = eINSTANCE.getUnivariateVisualization_EventToTake();

		/**
		 * The meta object literal for the '{@link dataCurationStateTransitionAction.impl.BiVariateVisualizationImpl <em>Bi Variate Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataCurationStateTransitionAction.impl.BiVariateVisualizationImpl
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getBiVariateVisualization()
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
		 * The meta object literal for the '<em><b>States</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BI_VARIATE_VISUALIZATION__STATES = eINSTANCE.getBiVariateVisualization_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BI_VARIATE_VISUALIZATION__TRANSITIONS = eINSTANCE.getBiVariateVisualization_Transitions();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BI_VARIATE_VISUALIZATION__SOURCE = eINSTANCE.getBiVariateVisualization_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BI_VARIATE_VISUALIZATION__TARGET = eINSTANCE.getBiVariateVisualization_Target();

		/**
		 * The meta object literal for the '<em><b>Action To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BI_VARIATE_VISUALIZATION__ACTION_TO_TAKE = eINSTANCE.getBiVariateVisualization_ActionToTake();

		/**
		 * The meta object literal for the '<em><b>Event To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BI_VARIATE_VISUALIZATION__EVENT_TO_TAKE = eINSTANCE.getBiVariateVisualization_EventToTake();

		/**
		 * The meta object literal for the '{@link dataCurationStateTransitionAction.impl.NormalizationStandardizationImpl <em>Normalization Standardization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataCurationStateTransitionAction.impl.NormalizationStandardizationImpl
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getNormalizationStandardization()
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

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMALIZATION_STANDARDIZATION__STATES = eINSTANCE.getNormalizationStandardization_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMALIZATION_STANDARDIZATION__TRANSITIONS = eINSTANCE.getNormalizationStandardization_Transitions();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMALIZATION_STANDARDIZATION__SOURCE = eINSTANCE.getNormalizationStandardization_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMALIZATION_STANDARDIZATION__TARGET = eINSTANCE.getNormalizationStandardization_Target();

		/**
		 * The meta object literal for the '<em><b>Action To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMALIZATION_STANDARDIZATION__ACTION_TO_TAKE = eINSTANCE.getNormalizationStandardization_ActionToTake();

		/**
		 * The meta object literal for the '<em><b>Event To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMALIZATION_STANDARDIZATION__EVENT_TO_TAKE = eINSTANCE.getNormalizationStandardization_EventToTake();

		/**
		 * The meta object literal for the '{@link dataCurationStateTransitionAction.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataCurationStateTransitionAction.impl.StateImpl
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_INITIAL = eINSTANCE.getState_IsInitial();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_FINAL = eINSTANCE.getState_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING_TRANSITIONS = eINSTANCE.getState_OutgoingTransitions();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING_TRANSITIONS = eINSTANCE.getState_IncomingTransitions();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STATES = eINSTANCE.getState_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

		/**
		 * The meta object literal for the '<em><b>Action To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTION_TO_TAKE = eINSTANCE.getState_ActionToTake();

		/**
		 * The meta object literal for the '<em><b>Event To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EVENT_TO_TAKE = eINSTANCE.getState_EventToTake();

		/**
		 * The meta object literal for the '{@link dataCurationStateTransitionAction.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataCurationStateTransitionAction.impl.TransitionImpl
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__INPUT = eINSTANCE.getTransition_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__OUTPUT = eINSTANCE.getTransition_Output();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__EVENT = eINSTANCE.getTransition_Event();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__STATES = eINSTANCE.getTransition_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRANSITIONS = eINSTANCE.getTransition_Transitions();

		/**
		 * The meta object literal for the '<em><b>Action To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ACTION_TO_TAKE = eINSTANCE.getTransition_ActionToTake();

		/**
		 * The meta object literal for the '<em><b>Event To Take</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EVENT_TO_TAKE = eINSTANCE.getTransition_EventToTake();

		/**
		 * The meta object literal for the '{@link dataCurationStateTransitionAction.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataCurationStateTransitionAction.impl.ActionImpl
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__LABEL = eINSTANCE.getAction_Label();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__SOURCE = eINSTANCE.getAction_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__TARGET = eINSTANCE.getAction_Target();

		/**
		 * The meta object literal for the '{@link dataCurationStateTransitionAction.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dataCurationStateTransitionAction.impl.EventImpl
		 * @see dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__LABEL = eINSTANCE.getEvent_Label();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__SOURCE = eINSTANCE.getEvent_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__TARGET = eINSTANCE.getEvent_Target();

	}

} //DataCurationStateTransitionActionPackage
