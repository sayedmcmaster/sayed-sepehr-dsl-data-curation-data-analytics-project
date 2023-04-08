/**
 */
package dataAnalyticsProjectDataCuration.impl;

import dataAnalyticsProjectDataCuration.Attribute;
import dataAnalyticsProjectDataCuration.BiVariateAnalysis;
import dataAnalyticsProjectDataCuration.BiVariateVisualization;
import dataAnalyticsProjectDataCuration.Data;
import dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration;
import dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationFactory;
import dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage;
import dataAnalyticsProjectDataCuration.DataValue;
import dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis;
import dataAnalyticsProjectDataCuration.InitialDataAnalysis;
import dataAnalyticsProjectDataCuration.MissingValues;
import dataAnalyticsProjectDataCuration.NormalizationStandardization;
import dataAnalyticsProjectDataCuration.NullValues;
import dataAnalyticsProjectDataCuration.PValueFSignificance;
import dataAnalyticsProjectDataCuration.RSquare;
import dataAnalyticsProjectDataCuration.UnitaryAnalysis;
import dataAnalyticsProjectDataCuration.UnivariateVisualization;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataAnalyticsProjectDataCurationPackageImpl extends EPackageImpl implements DataAnalyticsProjectDataCurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAnalyticsProjectDataCurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialDataAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exploratoryDataAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missingValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rSquareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pValueFSignificanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitaryAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass biVariateAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass univariateVisualizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass biVariateVisualizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalizationStandardizationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataAnalyticsProjectDataCurationPackageImpl() {
		super(eNS_URI, DataAnalyticsProjectDataCurationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DataAnalyticsProjectDataCurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataAnalyticsProjectDataCurationPackage init() {
		if (isInited) return (DataAnalyticsProjectDataCurationPackage)EPackage.Registry.INSTANCE.getEPackage(DataAnalyticsProjectDataCurationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataAnalyticsProjectDataCurationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataAnalyticsProjectDataCurationPackageImpl theDataAnalyticsProjectDataCurationPackage = registeredDataAnalyticsProjectDataCurationPackage instanceof DataAnalyticsProjectDataCurationPackageImpl ? (DataAnalyticsProjectDataCurationPackageImpl)registeredDataAnalyticsProjectDataCurationPackage : new DataAnalyticsProjectDataCurationPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDataAnalyticsProjectDataCurationPackage.createPackageContents();

		// Initialize created meta-data
		theDataAnalyticsProjectDataCurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataAnalyticsProjectDataCurationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataAnalyticsProjectDataCurationPackage.eNS_URI, theDataAnalyticsProjectDataCurationPackage);
		return theDataAnalyticsProjectDataCurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAnalyticsProjectDataCuration() {
		return dataAnalyticsProjectDataCurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAnalyticsProjectDataCuration_Label() {
		return (EAttribute)dataAnalyticsProjectDataCurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAnalyticsProjectDataCuration_Data() {
		return (EReference)dataAnalyticsProjectDataCurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAnalyticsProjectDataCuration_Ida() {
		return (EReference)dataAnalyticsProjectDataCurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAnalyticsProjectDataCuration_Eda() {
		return (EReference)dataAnalyticsProjectDataCurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Label() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Attributes() {
		return (EReference)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_DataValues() {
		return (EReference)dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialDataAnalysis() {
		return initialDataAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitialDataAnalysis_Label() {
		return (EAttribute)initialDataAnalysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialDataAnalysis_NullValues() {
		return (EReference)initialDataAnalysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialDataAnalysis_MissingValues() {
		return (EReference)initialDataAnalysisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExploratoryDataAnalysis() {
		return exploratoryDataAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExploratoryDataAnalysis_Label() {
		return (EAttribute)exploratoryDataAnalysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExploratoryDataAnalysis_RSquare() {
		return (EReference)exploratoryDataAnalysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExploratoryDataAnalysis_PValueFSignificance() {
		return (EReference)exploratoryDataAnalysisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExploratoryDataAnalysis_UnitaryAnalysis() {
		return (EReference)exploratoryDataAnalysisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExploratoryDataAnalysis_BiVariateAnalysis() {
		return (EReference)exploratoryDataAnalysisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExploratoryDataAnalysis_UnivariateVisualization() {
		return (EReference)exploratoryDataAnalysisEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExploratoryDataAnalysis_BiVariateVisualization() {
		return (EReference)exploratoryDataAnalysisEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExploratoryDataAnalysis_NormalizationStandardization() {
		return (EReference)exploratoryDataAnalysisEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Label() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_DataType() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataValue() {
		return dataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataValue_Label() {
		return (EAttribute)dataValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataValue_Row() {
		return (EAttribute)dataValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullValues() {
		return nullValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNullValues_Label() {
		return (EAttribute)nullValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNullValues_RemoveRow() {
		return (EAttribute)nullValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNullValues_ReplacementMethod() {
		return (EAttribute)nullValuesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMissingValues() {
		return missingValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMissingValues_Label() {
		return (EAttribute)missingValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMissingValues_RemoveRows() {
		return (EAttribute)missingValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMissingValues_ReplacementMethod() {
		return (EAttribute)missingValuesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRSquare() {
		return rSquareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRSquare_Label() {
		return (EAttribute)rSquareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRSquare_Value() {
		return (EAttribute)rSquareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRSquare_AdjustedRSquare() {
		return (EAttribute)rSquareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRSquare_CutOffForRSquare() {
		return (EAttribute)rSquareEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRSquare_IsDataFitForRegression() {
		return (EAttribute)rSquareEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPValueFSignificance() {
		return pValueFSignificanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPValueFSignificance_Label() {
		return (EAttribute)pValueFSignificanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPValueFSignificance_AttributeList() {
		return (EAttribute)pValueFSignificanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPValueFSignificance_AttributePValues() {
		return (EAttribute)pValueFSignificanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitaryAnalysis() {
		return unitaryAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitaryAnalysis_Label() {
		return (EAttribute)unitaryAnalysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitaryAnalysis_AllowedMethods() {
		return (EAttribute)unitaryAnalysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitaryAnalysis_SelectedMethods() {
		return (EAttribute)unitaryAnalysisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBiVariateAnalysis() {
		return biVariateAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiVariateAnalysis_Label() {
		return (EAttribute)biVariateAnalysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiVariateAnalysis_AllowedMethods() {
		return (EAttribute)biVariateAnalysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiVariateAnalysis_SelectedMethods() {
		return (EAttribute)biVariateAnalysisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnivariateVisualization() {
		return univariateVisualizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnivariateVisualization_Label() {
		return (EAttribute)univariateVisualizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnivariateVisualization_Method() {
		return (EAttribute)univariateVisualizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnivariateVisualization_ShowLegend() {
		return (EAttribute)univariateVisualizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnivariateVisualization_ShowTitle() {
		return (EAttribute)univariateVisualizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBiVariateVisualization() {
		return biVariateVisualizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiVariateVisualization_Label() {
		return (EAttribute)biVariateVisualizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiVariateVisualization_Method() {
		return (EAttribute)biVariateVisualizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiVariateVisualization_ShowLegend() {
		return (EAttribute)biVariateVisualizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiVariateVisualization_ShowTitle() {
		return (EAttribute)biVariateVisualizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalizationStandardization() {
		return normalizationStandardizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizationStandardization_Label() {
		return (EAttribute)normalizationStandardizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizationStandardization_NormalizeFrom0To1() {
		return (EAttribute)normalizationStandardizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizationStandardization_StandardizeFromMinus1To1() {
		return (EAttribute)normalizationStandardizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAnalyticsProjectDataCurationFactory getDataAnalyticsProjectDataCurationFactory() {
		return (DataAnalyticsProjectDataCurationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dataAnalyticsProjectDataCurationEClass = createEClass(DATA_ANALYTICS_PROJECT_DATA_CURATION);
		createEAttribute(dataAnalyticsProjectDataCurationEClass, DATA_ANALYTICS_PROJECT_DATA_CURATION__LABEL);
		createEReference(dataAnalyticsProjectDataCurationEClass, DATA_ANALYTICS_PROJECT_DATA_CURATION__DATA);
		createEReference(dataAnalyticsProjectDataCurationEClass, DATA_ANALYTICS_PROJECT_DATA_CURATION__IDA);
		createEReference(dataAnalyticsProjectDataCurationEClass, DATA_ANALYTICS_PROJECT_DATA_CURATION__EDA);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__LABEL);
		createEReference(dataEClass, DATA__ATTRIBUTES);
		createEReference(dataEClass, DATA__DATA_VALUES);

		initialDataAnalysisEClass = createEClass(INITIAL_DATA_ANALYSIS);
		createEAttribute(initialDataAnalysisEClass, INITIAL_DATA_ANALYSIS__LABEL);
		createEReference(initialDataAnalysisEClass, INITIAL_DATA_ANALYSIS__NULL_VALUES);
		createEReference(initialDataAnalysisEClass, INITIAL_DATA_ANALYSIS__MISSING_VALUES);

		exploratoryDataAnalysisEClass = createEClass(EXPLORATORY_DATA_ANALYSIS);
		createEAttribute(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__LABEL);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__RSQUARE);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__LABEL);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__DATA_TYPE);

		dataValueEClass = createEClass(DATA_VALUE);
		createEAttribute(dataValueEClass, DATA_VALUE__LABEL);
		createEAttribute(dataValueEClass, DATA_VALUE__ROW);

		nullValuesEClass = createEClass(NULL_VALUES);
		createEAttribute(nullValuesEClass, NULL_VALUES__LABEL);
		createEAttribute(nullValuesEClass, NULL_VALUES__REMOVE_ROW);
		createEAttribute(nullValuesEClass, NULL_VALUES__REPLACEMENT_METHOD);

		missingValuesEClass = createEClass(MISSING_VALUES);
		createEAttribute(missingValuesEClass, MISSING_VALUES__LABEL);
		createEAttribute(missingValuesEClass, MISSING_VALUES__REMOVE_ROWS);
		createEAttribute(missingValuesEClass, MISSING_VALUES__REPLACEMENT_METHOD);

		rSquareEClass = createEClass(RSQUARE);
		createEAttribute(rSquareEClass, RSQUARE__LABEL);
		createEAttribute(rSquareEClass, RSQUARE__VALUE);
		createEAttribute(rSquareEClass, RSQUARE__ADJUSTED_RSQUARE);
		createEAttribute(rSquareEClass, RSQUARE__CUT_OFF_FOR_RSQUARE);
		createEAttribute(rSquareEClass, RSQUARE__IS_DATA_FIT_FOR_REGRESSION);

		pValueFSignificanceEClass = createEClass(PVALUE_FSIGNIFICANCE);
		createEAttribute(pValueFSignificanceEClass, PVALUE_FSIGNIFICANCE__LABEL);
		createEAttribute(pValueFSignificanceEClass, PVALUE_FSIGNIFICANCE__ATTRIBUTE_LIST);
		createEAttribute(pValueFSignificanceEClass, PVALUE_FSIGNIFICANCE__ATTRIBUTE_PVALUES);

		unitaryAnalysisEClass = createEClass(UNITARY_ANALYSIS);
		createEAttribute(unitaryAnalysisEClass, UNITARY_ANALYSIS__LABEL);
		createEAttribute(unitaryAnalysisEClass, UNITARY_ANALYSIS__ALLOWED_METHODS);
		createEAttribute(unitaryAnalysisEClass, UNITARY_ANALYSIS__SELECTED_METHODS);

		biVariateAnalysisEClass = createEClass(BI_VARIATE_ANALYSIS);
		createEAttribute(biVariateAnalysisEClass, BI_VARIATE_ANALYSIS__LABEL);
		createEAttribute(biVariateAnalysisEClass, BI_VARIATE_ANALYSIS__ALLOWED_METHODS);
		createEAttribute(biVariateAnalysisEClass, BI_VARIATE_ANALYSIS__SELECTED_METHODS);

		univariateVisualizationEClass = createEClass(UNIVARIATE_VISUALIZATION);
		createEAttribute(univariateVisualizationEClass, UNIVARIATE_VISUALIZATION__LABEL);
		createEAttribute(univariateVisualizationEClass, UNIVARIATE_VISUALIZATION__METHOD);
		createEAttribute(univariateVisualizationEClass, UNIVARIATE_VISUALIZATION__SHOW_LEGEND);
		createEAttribute(univariateVisualizationEClass, UNIVARIATE_VISUALIZATION__SHOW_TITLE);

		biVariateVisualizationEClass = createEClass(BI_VARIATE_VISUALIZATION);
		createEAttribute(biVariateVisualizationEClass, BI_VARIATE_VISUALIZATION__LABEL);
		createEAttribute(biVariateVisualizationEClass, BI_VARIATE_VISUALIZATION__METHOD);
		createEAttribute(biVariateVisualizationEClass, BI_VARIATE_VISUALIZATION__SHOW_LEGEND);
		createEAttribute(biVariateVisualizationEClass, BI_VARIATE_VISUALIZATION__SHOW_TITLE);

		normalizationStandardizationEClass = createEClass(NORMALIZATION_STANDARDIZATION);
		createEAttribute(normalizationStandardizationEClass, NORMALIZATION_STANDARDIZATION__LABEL);
		createEAttribute(normalizationStandardizationEClass, NORMALIZATION_STANDARDIZATION__NORMALIZE_FROM0_TO1);
		createEAttribute(normalizationStandardizationEClass, NORMALIZATION_STANDARDIZATION__STANDARDIZE_FROM_MINUS1_TO1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(dataAnalyticsProjectDataCurationEClass, DataAnalyticsProjectDataCuration.class, "DataAnalyticsProjectDataCuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataAnalyticsProjectDataCuration_Label(), ecorePackage.getEString(), "Label", null, 0, 1, DataAnalyticsProjectDataCuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAnalyticsProjectDataCuration_Data(), this.getData(), null, "data", null, 0, 1, DataAnalyticsProjectDataCuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAnalyticsProjectDataCuration_Ida(), this.getInitialDataAnalysis(), null, "ida", null, 0, 1, DataAnalyticsProjectDataCuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAnalyticsProjectDataCuration_Eda(), this.getExploratoryDataAnalysis(), null, "eda", null, 0, 1, DataAnalyticsProjectDataCuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Label(), ecorePackage.getEString(), "Label", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Attributes(), this.getAttribute(), null, "attributes", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_DataValues(), this.getDataValue(), null, "dataValues", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialDataAnalysisEClass, InitialDataAnalysis.class, "InitialDataAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInitialDataAnalysis_Label(), ecorePackage.getEString(), "Label", null, 0, 1, InitialDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialDataAnalysis_NullValues(), this.getNullValues(), null, "nullValues", null, 0, 1, InitialDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialDataAnalysis_MissingValues(), this.getMissingValues(), null, "missingValues", null, 0, 1, InitialDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exploratoryDataAnalysisEClass, ExploratoryDataAnalysis.class, "ExploratoryDataAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExploratoryDataAnalysis_Label(), ecorePackage.getEString(), "Label", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_RSquare(), this.getRSquare(), null, "rSquare", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_PValueFSignificance(), this.getPValueFSignificance(), null, "pValueFSignificance", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_UnitaryAnalysis(), this.getUnitaryAnalysis(), null, "unitaryAnalysis", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_BiVariateAnalysis(), this.getBiVariateAnalysis(), null, "biVariateAnalysis", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_UnivariateVisualization(), this.getUnivariateVisualization(), null, "univariateVisualization", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_BiVariateVisualization(), this.getBiVariateVisualization(), null, "biVariateVisualization", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_NormalizationStandardization(), this.getNormalizationStandardization(), null, "normalizationStandardization", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Label(), ecorePackage.getEString(), "Label", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_DataType(), ecorePackage.getEString(), "DataType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataValueEClass, DataValue.class, "DataValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataValue_Label(), ecorePackage.getEString(), "Label", null, 0, 1, DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataValue_Row(), ecorePackage.getEInt(), "row", null, 0, -1, DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullValuesEClass, NullValues.class, "NullValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNullValues_Label(), ecorePackage.getEString(), "Label", null, 0, 1, NullValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNullValues_RemoveRow(), ecorePackage.getEBoolean(), "removeRow", null, 0, 1, NullValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNullValues_ReplacementMethod(), ecorePackage.getEString(), "replacementMethod", null, 0, 1, NullValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(missingValuesEClass, MissingValues.class, "MissingValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMissingValues_Label(), ecorePackage.getEString(), "Label", null, 0, 1, MissingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMissingValues_RemoveRows(), ecorePackage.getEBoolean(), "removeRows", null, 0, 1, MissingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMissingValues_ReplacementMethod(), ecorePackage.getEString(), "replacementMethod", null, 0, 1, MissingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rSquareEClass, RSquare.class, "RSquare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRSquare_Label(), ecorePackage.getEString(), "Label", null, 0, 1, RSquare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRSquare_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, RSquare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRSquare_AdjustedRSquare(), ecorePackage.getEDouble(), "adjustedRSquare", null, 0, 1, RSquare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRSquare_CutOffForRSquare(), ecorePackage.getEDouble(), "cutOffForRSquare", null, 0, 1, RSquare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRSquare_IsDataFitForRegression(), ecorePackage.getEString(), "isDataFitForRegression", null, 0, 1, RSquare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pValueFSignificanceEClass, PValueFSignificance.class, "PValueFSignificance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPValueFSignificance_Label(), ecorePackage.getEString(), "Label", null, 0, 1, PValueFSignificance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPValueFSignificance_AttributeList(), ecorePackage.getEString(), "attributeList", null, 0, -1, PValueFSignificance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPValueFSignificance_AttributePValues(), ecorePackage.getEDouble(), "attributePValues", null, 0, -1, PValueFSignificance.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitaryAnalysisEClass, UnitaryAnalysis.class, "UnitaryAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitaryAnalysis_Label(), ecorePackage.getEString(), "Label", null, 0, 1, UnitaryAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitaryAnalysis_AllowedMethods(), ecorePackage.getEString(), "allowedMethods", null, 0, -1, UnitaryAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitaryAnalysis_SelectedMethods(), ecorePackage.getEString(), "selectedMethods", null, 0, -1, UnitaryAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(biVariateAnalysisEClass, BiVariateAnalysis.class, "BiVariateAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBiVariateAnalysis_Label(), ecorePackage.getEString(), "Label", null, 0, 1, BiVariateAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiVariateAnalysis_AllowedMethods(), ecorePackage.getEString(), "allowedMethods", null, 0, -1, BiVariateAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiVariateAnalysis_SelectedMethods(), ecorePackage.getEString(), "selectedMethods", null, 0, -1, BiVariateAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(univariateVisualizationEClass, UnivariateVisualization.class, "UnivariateVisualization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnivariateVisualization_Label(), ecorePackage.getEString(), "Label", null, 0, 1, UnivariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnivariateVisualization_Method(), ecorePackage.getEBoolean(), "method", null, 0, 1, UnivariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnivariateVisualization_ShowLegend(), ecorePackage.getEBoolean(), "showLegend", null, 0, 1, UnivariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnivariateVisualization_ShowTitle(), ecorePackage.getEBoolean(), "showTitle", null, 0, 1, UnivariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(biVariateVisualizationEClass, BiVariateVisualization.class, "BiVariateVisualization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBiVariateVisualization_Label(), ecorePackage.getEString(), "Label", null, 0, 1, BiVariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiVariateVisualization_Method(), ecorePackage.getEString(), "method", null, 0, 1, BiVariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiVariateVisualization_ShowLegend(), ecorePackage.getEBoolean(), "showLegend", null, 0, 1, BiVariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiVariateVisualization_ShowTitle(), ecorePackage.getEBoolean(), "showTitle", null, 0, 1, BiVariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalizationStandardizationEClass, NormalizationStandardization.class, "NormalizationStandardization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNormalizationStandardization_Label(), ecorePackage.getEString(), "Label", null, 0, 1, NormalizationStandardization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNormalizationStandardization_NormalizeFrom0To1(), ecorePackage.getEBoolean(), "normalizeFrom0To1", null, 0, 1, NormalizationStandardization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNormalizationStandardization_StandardizeFromMinus1To1(), ecorePackage.getEBoolean(), "standardizeFromMinus1To1", null, 0, 1, NormalizationStandardization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (dataAnalyticsProjectDataCurationEClass,
		   source,
		   new String[] {
		   });
	}

} //DataAnalyticsProjectDataCurationPackageImpl
