/**
 */
package dataAnalyticsProjectDataCuration.impl;

import dataAnalyticsProjectDataCuration.*;

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
public class DataAnalyticsProjectDataCurationFactoryImpl extends EFactoryImpl implements DataAnalyticsProjectDataCurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataAnalyticsProjectDataCurationFactory init() {
		try {
			DataAnalyticsProjectDataCurationFactory theDataAnalyticsProjectDataCurationFactory = (DataAnalyticsProjectDataCurationFactory)EPackage.Registry.INSTANCE.getEFactory(DataAnalyticsProjectDataCurationPackage.eNS_URI);
			if (theDataAnalyticsProjectDataCurationFactory != null) {
				return theDataAnalyticsProjectDataCurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataAnalyticsProjectDataCurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAnalyticsProjectDataCurationFactoryImpl() {
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
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION: return createDataAnalyticsProjectDataCuration();
			case DataAnalyticsProjectDataCurationPackage.DATA: return createData();
			case DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS: return createInitialDataAnalysis();
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS: return createExploratoryDataAnalysis();
			case DataAnalyticsProjectDataCurationPackage.ATTRIBUTE: return createAttribute();
			case DataAnalyticsProjectDataCurationPackage.DATA_VALUE: return createDataValue();
			case DataAnalyticsProjectDataCurationPackage.NULL_VALUES: return createNullValues();
			case DataAnalyticsProjectDataCurationPackage.MISSING_VALUES: return createMissingValues();
			case DataAnalyticsProjectDataCurationPackage.RSQUARE: return createRSquare();
			case DataAnalyticsProjectDataCurationPackage.PVALUE_FSIGNIFICANCE: return createPValueFSignificance();
			case DataAnalyticsProjectDataCurationPackage.UNITARY_ANALYSIS: return createUnitaryAnalysis();
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_ANALYSIS: return createBiVariateAnalysis();
			case DataAnalyticsProjectDataCurationPackage.UNIVARIATE_VISUALIZATION: return createUnivariateVisualization();
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION: return createBiVariateVisualization();
			case DataAnalyticsProjectDataCurationPackage.NORMALIZATION_STANDARDIZATION: return createNormalizationStandardization();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAnalyticsProjectDataCuration createDataAnalyticsProjectDataCuration() {
		DataAnalyticsProjectDataCurationImpl dataAnalyticsProjectDataCuration = new DataAnalyticsProjectDataCurationImpl();
		return dataAnalyticsProjectDataCuration;
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
	public DataAnalyticsProjectDataCurationPackage getDataAnalyticsProjectDataCurationPackage() {
		return (DataAnalyticsProjectDataCurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataAnalyticsProjectDataCurationPackage getPackage() {
		return DataAnalyticsProjectDataCurationPackage.eINSTANCE;
	}

} //DataAnalyticsProjectDataCurationFactoryImpl
