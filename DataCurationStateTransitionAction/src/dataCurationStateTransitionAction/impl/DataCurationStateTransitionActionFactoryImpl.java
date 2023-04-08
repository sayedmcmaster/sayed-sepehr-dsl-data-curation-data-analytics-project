/**
 */
package dataCurationStateTransitionAction.impl;

import dataCurationStateTransitionAction.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataCurationStateTransitionActionFactoryImpl extends EFactoryImpl implements DataCurationStateTransitionActionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataCurationStateTransitionActionFactory init() {
		try {
			DataCurationStateTransitionActionFactory theDataCurationStateTransitionActionFactory = (DataCurationStateTransitionActionFactory)EPackage.Registry.INSTANCE.getEFactory(DataCurationStateTransitionActionPackage.eNS_URI);
			if (theDataCurationStateTransitionActionFactory != null) {
				return theDataCurationStateTransitionActionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataCurationStateTransitionActionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCurationStateTransitionActionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION: return createDataCurationStateTransitionAction();
			case DataCurationStateTransitionActionPackage.DATA: return createData();
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS: return createInitialDataAnalysis();
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS: return createExploratoryDataAnalysis();
			case DataCurationStateTransitionActionPackage.ATTRIBUTE: return createAttribute();
			case DataCurationStateTransitionActionPackage.DATA_VALUE: return createDataValue();
			case DataCurationStateTransitionActionPackage.NULL_VALUES: return createNullValues();
			case DataCurationStateTransitionActionPackage.MISSING_VALUES: return createMissingValues();
			case DataCurationStateTransitionActionPackage.RSQUARE: return createRSquare();
			case DataCurationStateTransitionActionPackage.PVALUE_FSIGNIFICANCE: return createPValueFSignificance();
			case DataCurationStateTransitionActionPackage.UNITARY_ANALYSIS: return createUnitaryAnalysis();
			case DataCurationStateTransitionActionPackage.BI_VARIATE_ANALYSIS: return createBiVariateAnalysis();
			case DataCurationStateTransitionActionPackage.UNIVARIATE_VISUALIZATION: return createUnivariateVisualization();
			case DataCurationStateTransitionActionPackage.BI_VARIATE_VISUALIZATION: return createBiVariateVisualization();
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION: return createNormalizationStandardization();
			case DataCurationStateTransitionActionPackage.STATE: return createState();
			case DataCurationStateTransitionActionPackage.TRANSITION: return createTransition();
			case DataCurationStateTransitionActionPackage.ACTION: return createAction();
			case DataCurationStateTransitionActionPackage.EVENT: return createEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCurationStateTransitionAction createDataCurationStateTransitionAction() {
		DataCurationStateTransitionActionImpl dataCurationStateTransitionAction = new DataCurationStateTransitionActionImpl();
		return dataCurationStateTransitionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialDataAnalysis createInitialDataAnalysis() {
		InitialDataAnalysisImpl initialDataAnalysis = new InitialDataAnalysisImpl();
		return initialDataAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExploratoryDataAnalysis createExploratoryDataAnalysis() {
		ExploratoryDataAnalysisImpl exploratoryDataAnalysis = new ExploratoryDataAnalysisImpl();
		return exploratoryDataAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue createDataValue() {
		DataValueImpl dataValue = new DataValueImpl();
		return dataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullValues createNullValues() {
		NullValuesImpl nullValues = new NullValuesImpl();
		return nullValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissingValues createMissingValues() {
		MissingValuesImpl missingValues = new MissingValuesImpl();
		return missingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSquare createRSquare() {
		RSquareImpl rSquare = new RSquareImpl();
		return rSquare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PValueFSignificance createPValueFSignificance() {
		PValueFSignificanceImpl pValueFSignificance = new PValueFSignificanceImpl();
		return pValueFSignificance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitaryAnalysis createUnitaryAnalysis() {
		UnitaryAnalysisImpl unitaryAnalysis = new UnitaryAnalysisImpl();
		return unitaryAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiVariateAnalysis createBiVariateAnalysis() {
		BiVariateAnalysisImpl biVariateAnalysis = new BiVariateAnalysisImpl();
		return biVariateAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnivariateVisualization createUnivariateVisualization() {
		UnivariateVisualizationImpl univariateVisualization = new UnivariateVisualizationImpl();
		return univariateVisualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiVariateVisualization createBiVariateVisualization() {
		BiVariateVisualizationImpl biVariateVisualization = new BiVariateVisualizationImpl();
		return biVariateVisualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalizationStandardization createNormalizationStandardization() {
		NormalizationStandardizationImpl normalizationStandardization = new NormalizationStandardizationImpl();
		return normalizationStandardization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCurationStateTransitionActionPackage getDataCurationStateTransitionActionPackage() {
		return (DataCurationStateTransitionActionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataCurationStateTransitionActionPackage getPackage() {
		return DataCurationStateTransitionActionPackage.eINSTANCE;
	}

} //DataCurationStateTransitionActionFactoryImpl
