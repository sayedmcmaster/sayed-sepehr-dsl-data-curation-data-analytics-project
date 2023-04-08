/**
 */
package dataCurationStateTransitionAction.impl;

import dataCurationStateTransitionAction.Action;
import dataCurationStateTransitionAction.Attribute;
import dataCurationStateTransitionAction.BiVariateAnalysis;
import dataCurationStateTransitionAction.BiVariateVisualization;
import dataCurationStateTransitionAction.Data;
import dataCurationStateTransitionAction.DataCurationStateTransitionAction;
import dataCurationStateTransitionAction.DataCurationStateTransitionActionFactory;
import dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage;
import dataCurationStateTransitionAction.DataValue;
import dataCurationStateTransitionAction.Event;
import dataCurationStateTransitionAction.ExploratoryDataAnalysis;
import dataCurationStateTransitionAction.InitialDataAnalysis;
import dataCurationStateTransitionAction.MissingValues;
import dataCurationStateTransitionAction.NormalizationStandardization;
import dataCurationStateTransitionAction.NullValues;
import dataCurationStateTransitionAction.PValueFSignificance;
import dataCurationStateTransitionAction.RSquare;
import dataCurationStateTransitionAction.State;
import dataCurationStateTransitionAction.Transition;
import dataCurationStateTransitionAction.UnitaryAnalysis;
import dataCurationStateTransitionAction.UnivariateVisualization;

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
public class DataCurationStateTransitionActionPackageImpl extends EPackageImpl implements DataCurationStateTransitionActionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCurationStateTransitionActionEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataCurationStateTransitionActionPackageImpl() {
		super(eNS_URI, DataCurationStateTransitionActionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataCurationStateTransitionActionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataCurationStateTransitionActionPackage init() {
		if (isInited) return (DataCurationStateTransitionActionPackage)EPackage.Registry.INSTANCE.getEPackage(DataCurationStateTransitionActionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataCurationStateTransitionActionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataCurationStateTransitionActionPackageImpl theDataCurationStateTransitionActionPackage = registeredDataCurationStateTransitionActionPackage instanceof DataCurationStateTransitionActionPackageImpl ? (DataCurationStateTransitionActionPackageImpl)registeredDataCurationStateTransitionActionPackage : new DataCurationStateTransitionActionPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDataCurationStateTransitionActionPackage.createPackageContents();

		// Initialize created meta-data
		theDataCurationStateTransitionActionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataCurationStateTransitionActionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataCurationStateTransitionActionPackage.eNS_URI, theDataCurationStateTransitionActionPackage);
		return theDataCurationStateTransitionActionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataCurationStateTransitionAction() {
		return dataCurationStateTransitionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCurationStateTransitionAction_Label() {
		return (EAttribute)dataCurationStateTransitionActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCurationStateTransitionAction_Name() {
		return (EAttribute)dataCurationStateTransitionActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCurationStateTransitionAction_Data() {
		return (EReference)dataCurationStateTransitionActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCurationStateTransitionAction_Ida() {
		return (EReference)dataCurationStateTransitionActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCurationStateTransitionAction_Eda() {
		return (EReference)dataCurationStateTransitionActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCurationStateTransitionAction_States() {
		return (EReference)dataCurationStateTransitionActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCurationStateTransitionAction_Transitions() {
		return (EReference)dataCurationStateTransitionActionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCurationStateTransitionAction_ActionToTake() {
		return (EReference)dataCurationStateTransitionActionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCurationStateTransitionAction_EventToTake() {
		return (EReference)dataCurationStateTransitionActionEClass.getEStructuralFeatures().get(8);
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
	public EReference getData_States() {
		return (EReference)dataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Transitions() {
		return (EReference)dataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Source() {
		return (EReference)dataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Target() {
		return (EReference)dataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_ActionToTake() {
		return (EReference)dataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_EventToTake() {
		return (EReference)dataEClass.getEStructuralFeatures().get(8);
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
	public EReference getInitialDataAnalysis_States() {
		return (EReference)initialDataAnalysisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialDataAnalysis_Transitions() {
		return (EReference)initialDataAnalysisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialDataAnalysis_Source() {
		return (EReference)initialDataAnalysisEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialDataAnalysis_Target() {
		return (EReference)initialDataAnalysisEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialDataAnalysis_ActionToTake() {
		return (EReference)initialDataAnalysisEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialDataAnalysis_EventToTake() {
		return (EReference)initialDataAnalysisEClass.getEStructuralFeatures().get(8);
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
	public EReference getExploratoryDataAnalysis_InitialState() {
		return (EReference)exploratoryDataAnalysisEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExploratoryDataAnalysis_FinalState() {
		return (EReference)exploratoryDataAnalysisEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExploratoryDataAnalysis_States() {
		return (EReference)exploratoryDataAnalysisEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExploratoryDataAnalysis_Transitions() {
		return (EReference)exploratoryDataAnalysisEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExploratoryDataAnalysis_Source() {
		return (EReference)exploratoryDataAnalysisEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExploratoryDataAnalysis_Target() {
		return (EReference)exploratoryDataAnalysisEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExploratoryDataAnalysis_ActionToTake() {
		return (EReference)exploratoryDataAnalysisEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExploratoryDataAnalysis_EventToTake() {
		return (EReference)exploratoryDataAnalysisEClass.getEStructuralFeatures().get(15);
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
	public EReference getNullValues_States() {
		return (EReference)nullValuesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNullValues_Transitions() {
		return (EReference)nullValuesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNullValues_Source() {
		return (EReference)nullValuesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNullValues_Target() {
		return (EReference)nullValuesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNullValues_ActionToTake() {
		return (EReference)nullValuesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNullValues_EventToTake() {
		return (EReference)nullValuesEClass.getEStructuralFeatures().get(8);
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
	public EReference getMissingValues_States() {
		return (EReference)missingValuesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMissingValues_Transitions() {
		return (EReference)missingValuesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMissingValues_Source() {
		return (EReference)missingValuesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMissingValues_Target() {
		return (EReference)missingValuesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMissingValues_ActionToTake() {
		return (EReference)missingValuesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMissingValues_EventToTake() {
		return (EReference)missingValuesEClass.getEStructuralFeatures().get(8);
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
	public EReference getRSquare_States() {
		return (EReference)rSquareEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSquare_Transitions() {
		return (EReference)rSquareEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSquare_Source() {
		return (EReference)rSquareEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSquare_Target() {
		return (EReference)rSquareEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSquare_ActionToTake() {
		return (EReference)rSquareEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRSquare_EventToTake() {
		return (EReference)rSquareEClass.getEStructuralFeatures().get(10);
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
	public EReference getPValueFSignificance_States() {
		return (EReference)pValueFSignificanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPValueFSignificance_Transitions() {
		return (EReference)pValueFSignificanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPValueFSignificance_Source() {
		return (EReference)pValueFSignificanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPValueFSignificance_Target() {
		return (EReference)pValueFSignificanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPValueFSignificance_ActionToTake() {
		return (EReference)pValueFSignificanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPValueFSignificance_EventToTake() {
		return (EReference)pValueFSignificanceEClass.getEStructuralFeatures().get(8);
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
	public EReference getUnitaryAnalysis_States() {
		return (EReference)unitaryAnalysisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitaryAnalysis_Transitions() {
		return (EReference)unitaryAnalysisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitaryAnalysis_Source() {
		return (EReference)unitaryAnalysisEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitaryAnalysis_Target() {
		return (EReference)unitaryAnalysisEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitaryAnalysis_ActionToTake() {
		return (EReference)unitaryAnalysisEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitaryAnalysis_EventToTake() {
		return (EReference)unitaryAnalysisEClass.getEStructuralFeatures().get(8);
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
	public EReference getBiVariateAnalysis_States() {
		return (EReference)biVariateAnalysisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBiVariateAnalysis_Transitions() {
		return (EReference)biVariateAnalysisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBiVariateAnalysis_Source() {
		return (EReference)biVariateAnalysisEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBiVariateAnalysis_Target() {
		return (EReference)biVariateAnalysisEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBiVariateAnalysis_ActionToTake() {
		return (EReference)biVariateAnalysisEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBiVariateAnalysis_EventToTake() {
		return (EReference)biVariateAnalysisEClass.getEStructuralFeatures().get(8);
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
	public EReference getUnivariateVisualization_States() {
		return (EReference)univariateVisualizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnivariateVisualization_Transitions() {
		return (EReference)univariateVisualizationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnivariateVisualization_Source() {
		return (EReference)univariateVisualizationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnivariateVisualization_Target() {
		return (EReference)univariateVisualizationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnivariateVisualization_ActionToTake() {
		return (EReference)univariateVisualizationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnivariateVisualization_EventToTake() {
		return (EReference)univariateVisualizationEClass.getEStructuralFeatures().get(9);
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
	public EReference getBiVariateVisualization_States() {
		return (EReference)biVariateVisualizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBiVariateVisualization_Transitions() {
		return (EReference)biVariateVisualizationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBiVariateVisualization_Source() {
		return (EReference)biVariateVisualizationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBiVariateVisualization_Target() {
		return (EReference)biVariateVisualizationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBiVariateVisualization_ActionToTake() {
		return (EReference)biVariateVisualizationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBiVariateVisualization_EventToTake() {
		return (EReference)biVariateVisualizationEClass.getEStructuralFeatures().get(9);
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
	public EReference getNormalizationStandardization_States() {
		return (EReference)normalizationStandardizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormalizationStandardization_Transitions() {
		return (EReference)normalizationStandardizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormalizationStandardization_Source() {
		return (EReference)normalizationStandardizationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormalizationStandardization_Target() {
		return (EReference)normalizationStandardizationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormalizationStandardization_ActionToTake() {
		return (EReference)normalizationStandardizationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormalizationStandardization_EventToTake() {
		return (EReference)normalizationStandardizationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Label() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Name() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsInitial() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsFinal() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_OutgoingTransitions() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_IncomingTransitions() {
		return (EReference)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_States() {
		return (EReference)stateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Transitions() {
		return (EReference)stateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActionToTake() {
		return (EReference)stateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_EventToTake() {
		return (EReference)stateEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Label() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Name() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Input() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Output() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Event() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_States() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Transitions() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_ActionToTake() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_EventToTake() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Label() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Name() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Source() {
		return (EReference)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Target() {
		return (EReference)actionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Label() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Name() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Source() {
		return (EReference)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Target() {
		return (EReference)eventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCurationStateTransitionActionFactory getDataCurationStateTransitionActionFactory() {
		return (DataCurationStateTransitionActionFactory)getEFactoryInstance();
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
		dataCurationStateTransitionActionEClass = createEClass(DATA_CURATION_STATE_TRANSITION_ACTION);
		createEAttribute(dataCurationStateTransitionActionEClass, DATA_CURATION_STATE_TRANSITION_ACTION__LABEL);
		createEAttribute(dataCurationStateTransitionActionEClass, DATA_CURATION_STATE_TRANSITION_ACTION__NAME);
		createEReference(dataCurationStateTransitionActionEClass, DATA_CURATION_STATE_TRANSITION_ACTION__DATA);
		createEReference(dataCurationStateTransitionActionEClass, DATA_CURATION_STATE_TRANSITION_ACTION__IDA);
		createEReference(dataCurationStateTransitionActionEClass, DATA_CURATION_STATE_TRANSITION_ACTION__EDA);
		createEReference(dataCurationStateTransitionActionEClass, DATA_CURATION_STATE_TRANSITION_ACTION__STATES);
		createEReference(dataCurationStateTransitionActionEClass, DATA_CURATION_STATE_TRANSITION_ACTION__TRANSITIONS);
		createEReference(dataCurationStateTransitionActionEClass, DATA_CURATION_STATE_TRANSITION_ACTION__ACTION_TO_TAKE);
		createEReference(dataCurationStateTransitionActionEClass, DATA_CURATION_STATE_TRANSITION_ACTION__EVENT_TO_TAKE);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__LABEL);
		createEReference(dataEClass, DATA__ATTRIBUTES);
		createEReference(dataEClass, DATA__DATA_VALUES);
		createEReference(dataEClass, DATA__STATES);
		createEReference(dataEClass, DATA__TRANSITIONS);
		createEReference(dataEClass, DATA__SOURCE);
		createEReference(dataEClass, DATA__TARGET);
		createEReference(dataEClass, DATA__ACTION_TO_TAKE);
		createEReference(dataEClass, DATA__EVENT_TO_TAKE);

		initialDataAnalysisEClass = createEClass(INITIAL_DATA_ANALYSIS);
		createEAttribute(initialDataAnalysisEClass, INITIAL_DATA_ANALYSIS__LABEL);
		createEReference(initialDataAnalysisEClass, INITIAL_DATA_ANALYSIS__NULL_VALUES);
		createEReference(initialDataAnalysisEClass, INITIAL_DATA_ANALYSIS__MISSING_VALUES);
		createEReference(initialDataAnalysisEClass, INITIAL_DATA_ANALYSIS__STATES);
		createEReference(initialDataAnalysisEClass, INITIAL_DATA_ANALYSIS__TRANSITIONS);
		createEReference(initialDataAnalysisEClass, INITIAL_DATA_ANALYSIS__SOURCE);
		createEReference(initialDataAnalysisEClass, INITIAL_DATA_ANALYSIS__TARGET);
		createEReference(initialDataAnalysisEClass, INITIAL_DATA_ANALYSIS__ACTION_TO_TAKE);
		createEReference(initialDataAnalysisEClass, INITIAL_DATA_ANALYSIS__EVENT_TO_TAKE);

		exploratoryDataAnalysisEClass = createEClass(EXPLORATORY_DATA_ANALYSIS);
		createEAttribute(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__LABEL);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__RSQUARE);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__INITIAL_STATE);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__FINAL_STATE);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__STATES);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__TRANSITIONS);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__SOURCE);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__TARGET);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__ACTION_TO_TAKE);
		createEReference(exploratoryDataAnalysisEClass, EXPLORATORY_DATA_ANALYSIS__EVENT_TO_TAKE);

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
		createEReference(nullValuesEClass, NULL_VALUES__STATES);
		createEReference(nullValuesEClass, NULL_VALUES__TRANSITIONS);
		createEReference(nullValuesEClass, NULL_VALUES__SOURCE);
		createEReference(nullValuesEClass, NULL_VALUES__TARGET);
		createEReference(nullValuesEClass, NULL_VALUES__ACTION_TO_TAKE);
		createEReference(nullValuesEClass, NULL_VALUES__EVENT_TO_TAKE);

		missingValuesEClass = createEClass(MISSING_VALUES);
		createEAttribute(missingValuesEClass, MISSING_VALUES__LABEL);
		createEAttribute(missingValuesEClass, MISSING_VALUES__REMOVE_ROWS);
		createEAttribute(missingValuesEClass, MISSING_VALUES__REPLACEMENT_METHOD);
		createEReference(missingValuesEClass, MISSING_VALUES__STATES);
		createEReference(missingValuesEClass, MISSING_VALUES__TRANSITIONS);
		createEReference(missingValuesEClass, MISSING_VALUES__SOURCE);
		createEReference(missingValuesEClass, MISSING_VALUES__TARGET);
		createEReference(missingValuesEClass, MISSING_VALUES__ACTION_TO_TAKE);
		createEReference(missingValuesEClass, MISSING_VALUES__EVENT_TO_TAKE);

		rSquareEClass = createEClass(RSQUARE);
		createEAttribute(rSquareEClass, RSQUARE__LABEL);
		createEAttribute(rSquareEClass, RSQUARE__VALUE);
		createEAttribute(rSquareEClass, RSQUARE__ADJUSTED_RSQUARE);
		createEAttribute(rSquareEClass, RSQUARE__CUT_OFF_FOR_RSQUARE);
		createEAttribute(rSquareEClass, RSQUARE__IS_DATA_FIT_FOR_REGRESSION);
		createEReference(rSquareEClass, RSQUARE__STATES);
		createEReference(rSquareEClass, RSQUARE__TRANSITIONS);
		createEReference(rSquareEClass, RSQUARE__SOURCE);
		createEReference(rSquareEClass, RSQUARE__TARGET);
		createEReference(rSquareEClass, RSQUARE__ACTION_TO_TAKE);
		createEReference(rSquareEClass, RSQUARE__EVENT_TO_TAKE);

		pValueFSignificanceEClass = createEClass(PVALUE_FSIGNIFICANCE);
		createEAttribute(pValueFSignificanceEClass, PVALUE_FSIGNIFICANCE__LABEL);
		createEAttribute(pValueFSignificanceEClass, PVALUE_FSIGNIFICANCE__ATTRIBUTE_LIST);
		createEAttribute(pValueFSignificanceEClass, PVALUE_FSIGNIFICANCE__ATTRIBUTE_PVALUES);
		createEReference(pValueFSignificanceEClass, PVALUE_FSIGNIFICANCE__STATES);
		createEReference(pValueFSignificanceEClass, PVALUE_FSIGNIFICANCE__TRANSITIONS);
		createEReference(pValueFSignificanceEClass, PVALUE_FSIGNIFICANCE__SOURCE);
		createEReference(pValueFSignificanceEClass, PVALUE_FSIGNIFICANCE__TARGET);
		createEReference(pValueFSignificanceEClass, PVALUE_FSIGNIFICANCE__ACTION_TO_TAKE);
		createEReference(pValueFSignificanceEClass, PVALUE_FSIGNIFICANCE__EVENT_TO_TAKE);

		unitaryAnalysisEClass = createEClass(UNITARY_ANALYSIS);
		createEAttribute(unitaryAnalysisEClass, UNITARY_ANALYSIS__LABEL);
		createEAttribute(unitaryAnalysisEClass, UNITARY_ANALYSIS__ALLOWED_METHODS);
		createEAttribute(unitaryAnalysisEClass, UNITARY_ANALYSIS__SELECTED_METHODS);
		createEReference(unitaryAnalysisEClass, UNITARY_ANALYSIS__STATES);
		createEReference(unitaryAnalysisEClass, UNITARY_ANALYSIS__TRANSITIONS);
		createEReference(unitaryAnalysisEClass, UNITARY_ANALYSIS__SOURCE);
		createEReference(unitaryAnalysisEClass, UNITARY_ANALYSIS__TARGET);
		createEReference(unitaryAnalysisEClass, UNITARY_ANALYSIS__ACTION_TO_TAKE);
		createEReference(unitaryAnalysisEClass, UNITARY_ANALYSIS__EVENT_TO_TAKE);

		biVariateAnalysisEClass = createEClass(BI_VARIATE_ANALYSIS);
		createEAttribute(biVariateAnalysisEClass, BI_VARIATE_ANALYSIS__LABEL);
		createEAttribute(biVariateAnalysisEClass, BI_VARIATE_ANALYSIS__ALLOWED_METHODS);
		createEAttribute(biVariateAnalysisEClass, BI_VARIATE_ANALYSIS__SELECTED_METHODS);
		createEReference(biVariateAnalysisEClass, BI_VARIATE_ANALYSIS__STATES);
		createEReference(biVariateAnalysisEClass, BI_VARIATE_ANALYSIS__TRANSITIONS);
		createEReference(biVariateAnalysisEClass, BI_VARIATE_ANALYSIS__SOURCE);
		createEReference(biVariateAnalysisEClass, BI_VARIATE_ANALYSIS__TARGET);
		createEReference(biVariateAnalysisEClass, BI_VARIATE_ANALYSIS__ACTION_TO_TAKE);
		createEReference(biVariateAnalysisEClass, BI_VARIATE_ANALYSIS__EVENT_TO_TAKE);

		univariateVisualizationEClass = createEClass(UNIVARIATE_VISUALIZATION);
		createEAttribute(univariateVisualizationEClass, UNIVARIATE_VISUALIZATION__LABEL);
		createEAttribute(univariateVisualizationEClass, UNIVARIATE_VISUALIZATION__METHOD);
		createEAttribute(univariateVisualizationEClass, UNIVARIATE_VISUALIZATION__SHOW_LEGEND);
		createEAttribute(univariateVisualizationEClass, UNIVARIATE_VISUALIZATION__SHOW_TITLE);
		createEReference(univariateVisualizationEClass, UNIVARIATE_VISUALIZATION__STATES);
		createEReference(univariateVisualizationEClass, UNIVARIATE_VISUALIZATION__TRANSITIONS);
		createEReference(univariateVisualizationEClass, UNIVARIATE_VISUALIZATION__SOURCE);
		createEReference(univariateVisualizationEClass, UNIVARIATE_VISUALIZATION__TARGET);
		createEReference(univariateVisualizationEClass, UNIVARIATE_VISUALIZATION__ACTION_TO_TAKE);
		createEReference(univariateVisualizationEClass, UNIVARIATE_VISUALIZATION__EVENT_TO_TAKE);

		biVariateVisualizationEClass = createEClass(BI_VARIATE_VISUALIZATION);
		createEAttribute(biVariateVisualizationEClass, BI_VARIATE_VISUALIZATION__LABEL);
		createEAttribute(biVariateVisualizationEClass, BI_VARIATE_VISUALIZATION__METHOD);
		createEAttribute(biVariateVisualizationEClass, BI_VARIATE_VISUALIZATION__SHOW_LEGEND);
		createEAttribute(biVariateVisualizationEClass, BI_VARIATE_VISUALIZATION__SHOW_TITLE);
		createEReference(biVariateVisualizationEClass, BI_VARIATE_VISUALIZATION__STATES);
		createEReference(biVariateVisualizationEClass, BI_VARIATE_VISUALIZATION__TRANSITIONS);
		createEReference(biVariateVisualizationEClass, BI_VARIATE_VISUALIZATION__SOURCE);
		createEReference(biVariateVisualizationEClass, BI_VARIATE_VISUALIZATION__TARGET);
		createEReference(biVariateVisualizationEClass, BI_VARIATE_VISUALIZATION__ACTION_TO_TAKE);
		createEReference(biVariateVisualizationEClass, BI_VARIATE_VISUALIZATION__EVENT_TO_TAKE);

		normalizationStandardizationEClass = createEClass(NORMALIZATION_STANDARDIZATION);
		createEAttribute(normalizationStandardizationEClass, NORMALIZATION_STANDARDIZATION__LABEL);
		createEAttribute(normalizationStandardizationEClass, NORMALIZATION_STANDARDIZATION__NORMALIZE_FROM0_TO1);
		createEAttribute(normalizationStandardizationEClass, NORMALIZATION_STANDARDIZATION__STANDARDIZE_FROM_MINUS1_TO1);
		createEReference(normalizationStandardizationEClass, NORMALIZATION_STANDARDIZATION__STATES);
		createEReference(normalizationStandardizationEClass, NORMALIZATION_STANDARDIZATION__TRANSITIONS);
		createEReference(normalizationStandardizationEClass, NORMALIZATION_STANDARDIZATION__SOURCE);
		createEReference(normalizationStandardizationEClass, NORMALIZATION_STANDARDIZATION__TARGET);
		createEReference(normalizationStandardizationEClass, NORMALIZATION_STANDARDIZATION__ACTION_TO_TAKE);
		createEReference(normalizationStandardizationEClass, NORMALIZATION_STANDARDIZATION__EVENT_TO_TAKE);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEAttribute(stateEClass, STATE__NAME);
		createEAttribute(stateEClass, STATE__IS_INITIAL);
		createEAttribute(stateEClass, STATE__IS_FINAL);
		createEReference(stateEClass, STATE__OUTGOING_TRANSITIONS);
		createEReference(stateEClass, STATE__INCOMING_TRANSITIONS);
		createEReference(stateEClass, STATE__STATES);
		createEReference(stateEClass, STATE__TRANSITIONS);
		createEReference(stateEClass, STATE__ACTION_TO_TAKE);
		createEReference(stateEClass, STATE__EVENT_TO_TAKE);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEAttribute(transitionEClass, TRANSITION__NAME);
		createEAttribute(transitionEClass, TRANSITION__INPUT);
		createEAttribute(transitionEClass, TRANSITION__OUTPUT);
		createEAttribute(transitionEClass, TRANSITION__EVENT);
		createEReference(transitionEClass, TRANSITION__STATES);
		createEReference(transitionEClass, TRANSITION__TRANSITIONS);
		createEReference(transitionEClass, TRANSITION__ACTION_TO_TAKE);
		createEReference(transitionEClass, TRANSITION__EVENT_TO_TAKE);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__LABEL);
		createEAttribute(actionEClass, ACTION__NAME);
		createEReference(actionEClass, ACTION__SOURCE);
		createEReference(actionEClass, ACTION__TARGET);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__LABEL);
		createEAttribute(eventEClass, EVENT__NAME);
		createEReference(eventEClass, EVENT__SOURCE);
		createEReference(eventEClass, EVENT__TARGET);
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
		initEClass(dataCurationStateTransitionActionEClass, DataCurationStateTransitionAction.class, "DataCurationStateTransitionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataCurationStateTransitionAction_Label(), ecorePackage.getEString(), "Label", null, 0, 1, DataCurationStateTransitionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataCurationStateTransitionAction_Name(), ecorePackage.getEString(), "Name", null, 0, 1, DataCurationStateTransitionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataCurationStateTransitionAction_Data(), this.getData(), null, "data", null, 0, 1, DataCurationStateTransitionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataCurationStateTransitionAction_Ida(), this.getInitialDataAnalysis(), null, "ida", null, 0, 1, DataCurationStateTransitionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataCurationStateTransitionAction_Eda(), this.getExploratoryDataAnalysis(), null, "eda", null, 0, 1, DataCurationStateTransitionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataCurationStateTransitionAction_States(), this.getState(), null, "states", null, 0, -1, DataCurationStateTransitionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataCurationStateTransitionAction_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, DataCurationStateTransitionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataCurationStateTransitionAction_ActionToTake(), this.getAction(), null, "actionToTake", null, 0, 1, DataCurationStateTransitionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataCurationStateTransitionAction_EventToTake(), this.getEvent(), null, "eventToTake", null, 0, 1, DataCurationStateTransitionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Label(), ecorePackage.getEString(), "Label", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Attributes(), this.getAttribute(), null, "attributes", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_DataValues(), this.getDataValue(), null, "dataValues", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_States(), this.getState(), null, "states", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Transitions(), this.getTransition(), null, "transitions", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Source(), this.getState(), null, "source", null, 0, -1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Target(), this.getState(), null, "target", null, 0, -1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_ActionToTake(), this.getAction(), null, "actionToTake", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_EventToTake(), this.getEvent(), null, "eventToTake", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialDataAnalysisEClass, InitialDataAnalysis.class, "InitialDataAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInitialDataAnalysis_Label(), ecorePackage.getEString(), "Label", null, 0, 1, InitialDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialDataAnalysis_NullValues(), this.getNullValues(), null, "nullValues", null, 0, 1, InitialDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialDataAnalysis_MissingValues(), this.getMissingValues(), null, "missingValues", null, 0, 1, InitialDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialDataAnalysis_States(), this.getState(), null, "states", null, 0, 1, InitialDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialDataAnalysis_Transitions(), this.getTransition(), null, "transitions", null, 0, 1, InitialDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialDataAnalysis_Source(), this.getState(), null, "source", null, 0, -1, InitialDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialDataAnalysis_Target(), this.getState(), null, "target", null, 0, -1, InitialDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialDataAnalysis_ActionToTake(), this.getAction(), null, "actionToTake", null, 0, 1, InitialDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialDataAnalysis_EventToTake(), this.getEvent(), null, "eventToTake", null, 0, 1, InitialDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exploratoryDataAnalysisEClass, ExploratoryDataAnalysis.class, "ExploratoryDataAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExploratoryDataAnalysis_Label(), ecorePackage.getEString(), "Label", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_RSquare(), this.getRSquare(), null, "rSquare", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_PValueFSignificance(), this.getPValueFSignificance(), null, "pValueFSignificance", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_UnitaryAnalysis(), this.getUnitaryAnalysis(), null, "unitaryAnalysis", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_BiVariateAnalysis(), this.getBiVariateAnalysis(), null, "biVariateAnalysis", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_UnivariateVisualization(), this.getUnivariateVisualization(), null, "univariateVisualization", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_BiVariateVisualization(), this.getBiVariateVisualization(), null, "biVariateVisualization", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_NormalizationStandardization(), this.getNormalizationStandardization(), null, "normalizationStandardization", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_InitialState(), this.getState(), null, "initialState", null, 1, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_FinalState(), this.getState(), null, "finalState", null, 1, -1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_States(), this.getState(), null, "states", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_Transitions(), this.getTransition(), null, "transitions", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_Source(), this.getState(), null, "source", null, 0, -1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_Target(), this.getState(), null, "target", null, 0, -1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_ActionToTake(), this.getAction(), null, "actionToTake", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExploratoryDataAnalysis_EventToTake(), this.getEvent(), null, "eventToTake", null, 0, 1, ExploratoryDataAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getNullValues_States(), this.getState(), null, "states", null, 0, 1, NullValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNullValues_Transitions(), this.getTransition(), null, "transitions", null, 0, 1, NullValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNullValues_Source(), this.getState(), null, "source", null, 0, -1, NullValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNullValues_Target(), this.getState(), null, "target", null, 0, -1, NullValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNullValues_ActionToTake(), this.getAction(), null, "actionToTake", null, 0, 1, NullValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNullValues_EventToTake(), this.getEvent(), null, "eventToTake", null, 0, 1, NullValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(missingValuesEClass, MissingValues.class, "MissingValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMissingValues_Label(), ecorePackage.getEString(), "Label", null, 0, 1, MissingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMissingValues_RemoveRows(), ecorePackage.getEBoolean(), "removeRows", null, 0, 1, MissingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMissingValues_ReplacementMethod(), ecorePackage.getEString(), "replacementMethod", null, 0, 1, MissingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMissingValues_States(), this.getState(), null, "states", null, 0, 1, MissingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMissingValues_Transitions(), this.getTransition(), null, "transitions", null, 0, 1, MissingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMissingValues_Source(), this.getState(), null, "source", null, 0, -1, MissingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMissingValues_Target(), this.getState(), null, "target", null, 0, -1, MissingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMissingValues_ActionToTake(), this.getAction(), null, "actionToTake", null, 0, 1, MissingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMissingValues_EventToTake(), this.getEvent(), null, "eventToTake", null, 0, 1, MissingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rSquareEClass, RSquare.class, "RSquare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRSquare_Label(), ecorePackage.getEString(), "Label", null, 0, 1, RSquare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRSquare_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, RSquare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRSquare_AdjustedRSquare(), ecorePackage.getEDouble(), "adjustedRSquare", null, 0, 1, RSquare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRSquare_CutOffForRSquare(), ecorePackage.getEDouble(), "cutOffForRSquare", null, 0, 1, RSquare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRSquare_IsDataFitForRegression(), ecorePackage.getEString(), "isDataFitForRegression", null, 0, 1, RSquare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSquare_States(), this.getState(), null, "states", null, 0, 1, RSquare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSquare_Transitions(), this.getTransition(), null, "transitions", null, 0, 1, RSquare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSquare_Source(), this.getState(), null, "source", null, 0, -1, RSquare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSquare_Target(), this.getState(), null, "target", null, 0, -1, RSquare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSquare_ActionToTake(), this.getAction(), null, "actionToTake", null, 0, 1, RSquare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRSquare_EventToTake(), this.getEvent(), null, "eventToTake", null, 0, 1, RSquare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pValueFSignificanceEClass, PValueFSignificance.class, "PValueFSignificance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPValueFSignificance_Label(), ecorePackage.getEString(), "Label", null, 0, 1, PValueFSignificance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPValueFSignificance_AttributeList(), ecorePackage.getEString(), "attributeList", null, 0, -1, PValueFSignificance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPValueFSignificance_AttributePValues(), ecorePackage.getEDouble(), "attributePValues", null, 0, -1, PValueFSignificance.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPValueFSignificance_States(), this.getState(), null, "states", null, 0, 1, PValueFSignificance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPValueFSignificance_Transitions(), this.getTransition(), null, "transitions", null, 0, 1, PValueFSignificance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPValueFSignificance_Source(), this.getState(), null, "source", null, 0, -1, PValueFSignificance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPValueFSignificance_Target(), this.getState(), null, "target", null, 0, -1, PValueFSignificance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPValueFSignificance_ActionToTake(), this.getAction(), null, "actionToTake", null, 0, 1, PValueFSignificance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPValueFSignificance_EventToTake(), this.getEvent(), null, "eventToTake", null, 0, 1, PValueFSignificance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitaryAnalysisEClass, UnitaryAnalysis.class, "UnitaryAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitaryAnalysis_Label(), ecorePackage.getEString(), "Label", null, 0, 1, UnitaryAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitaryAnalysis_AllowedMethods(), ecorePackage.getEString(), "allowedMethods", null, 0, -1, UnitaryAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitaryAnalysis_SelectedMethods(), ecorePackage.getEString(), "selectedMethods", null, 0, -1, UnitaryAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitaryAnalysis_States(), this.getState(), null, "states", null, 0, 1, UnitaryAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitaryAnalysis_Transitions(), this.getTransition(), null, "transitions", null, 0, 1, UnitaryAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitaryAnalysis_Source(), this.getState(), null, "source", null, 0, -1, UnitaryAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitaryAnalysis_Target(), this.getState(), null, "target", null, 0, -1, UnitaryAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitaryAnalysis_ActionToTake(), this.getAction(), null, "actionToTake", null, 0, 1, UnitaryAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitaryAnalysis_EventToTake(), this.getEvent(), null, "eventToTake", null, 0, 1, UnitaryAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(biVariateAnalysisEClass, BiVariateAnalysis.class, "BiVariateAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBiVariateAnalysis_Label(), ecorePackage.getEString(), "Label", null, 0, 1, BiVariateAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiVariateAnalysis_AllowedMethods(), ecorePackage.getEString(), "allowedMethods", null, 0, -1, BiVariateAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiVariateAnalysis_SelectedMethods(), ecorePackage.getEString(), "selectedMethods", null, 0, -1, BiVariateAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBiVariateAnalysis_States(), this.getState(), null, "states", null, 0, 1, BiVariateAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBiVariateAnalysis_Transitions(), this.getTransition(), null, "transitions", null, 0, 1, BiVariateAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBiVariateAnalysis_Source(), this.getState(), null, "source", null, 0, -1, BiVariateAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBiVariateAnalysis_Target(), this.getState(), null, "target", null, 0, -1, BiVariateAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBiVariateAnalysis_ActionToTake(), this.getAction(), null, "actionToTake", null, 0, 1, BiVariateAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBiVariateAnalysis_EventToTake(), this.getEvent(), null, "eventToTake", null, 0, 1, BiVariateAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(univariateVisualizationEClass, UnivariateVisualization.class, "UnivariateVisualization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnivariateVisualization_Label(), ecorePackage.getEString(), "Label", null, 0, 1, UnivariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnivariateVisualization_Method(), ecorePackage.getEBoolean(), "method", null, 0, 1, UnivariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnivariateVisualization_ShowLegend(), ecorePackage.getEBoolean(), "showLegend", null, 0, 1, UnivariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnivariateVisualization_ShowTitle(), ecorePackage.getEBoolean(), "showTitle", null, 0, 1, UnivariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnivariateVisualization_States(), this.getState(), null, "states", null, 0, 1, UnivariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnivariateVisualization_Transitions(), this.getTransition(), null, "transitions", null, 0, 1, UnivariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnivariateVisualization_Source(), this.getState(), null, "source", null, 0, -1, UnivariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnivariateVisualization_Target(), this.getState(), null, "target", null, 0, -1, UnivariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnivariateVisualization_ActionToTake(), this.getAction(), null, "actionToTake", null, 0, 1, UnivariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnivariateVisualization_EventToTake(), this.getEvent(), null, "eventToTake", null, 0, 1, UnivariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(biVariateVisualizationEClass, BiVariateVisualization.class, "BiVariateVisualization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBiVariateVisualization_Label(), ecorePackage.getEString(), "Label", null, 0, 1, BiVariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiVariateVisualization_Method(), ecorePackage.getEString(), "method", null, 0, 1, BiVariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiVariateVisualization_ShowLegend(), ecorePackage.getEBoolean(), "showLegend", null, 0, 1, BiVariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiVariateVisualization_ShowTitle(), ecorePackage.getEBoolean(), "showTitle", null, 0, 1, BiVariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBiVariateVisualization_States(), this.getState(), null, "states", null, 0, 1, BiVariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBiVariateVisualization_Transitions(), this.getTransition(), null, "transitions", null, 0, 1, BiVariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBiVariateVisualization_Source(), this.getState(), null, "source", null, 0, -1, BiVariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBiVariateVisualization_Target(), this.getState(), null, "target", null, 0, -1, BiVariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBiVariateVisualization_ActionToTake(), this.getAction(), null, "actionToTake", null, 0, 1, BiVariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBiVariateVisualization_EventToTake(), this.getEvent(), null, "eventToTake", null, 0, 1, BiVariateVisualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalizationStandardizationEClass, NormalizationStandardization.class, "NormalizationStandardization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNormalizationStandardization_Label(), ecorePackage.getEString(), "Label", null, 0, 1, NormalizationStandardization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNormalizationStandardization_NormalizeFrom0To1(), ecorePackage.getEBoolean(), "normalizeFrom0To1", null, 0, 1, NormalizationStandardization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNormalizationStandardization_StandardizeFromMinus1To1(), ecorePackage.getEBoolean(), "standardizeFromMinus1To1", null, 0, 1, NormalizationStandardization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNormalizationStandardization_States(), this.getState(), null, "states", null, 0, 1, NormalizationStandardization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNormalizationStandardization_Transitions(), this.getTransition(), null, "transitions", null, 0, 1, NormalizationStandardization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNormalizationStandardization_Source(), this.getState(), null, "source", null, 0, -1, NormalizationStandardization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNormalizationStandardization_Target(), this.getState(), null, "target", null, 0, -1, NormalizationStandardization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNormalizationStandardization_ActionToTake(), this.getAction(), null, "actionToTake", null, 0, 1, NormalizationStandardization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNormalizationStandardization_EventToTake(), this.getEvent(), null, "eventToTake", null, 0, 1, NormalizationStandardization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "Label", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_IsInitial(), ecorePackage.getEBoolean(), "isInitial", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_IsFinal(), ecorePackage.getEBoolean(), "isFinal", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_OutgoingTransitions(), this.getTransition(), null, "outgoingTransitions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_IncomingTransitions(), this.getTransition(), null, "incomingTransitions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_States(), this.getState(), null, "states", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Transitions(), this.getTransition(), null, "transitions", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_ActionToTake(), this.getAction(), null, "actionToTake", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_EventToTake(), this.getEvent(), null, "eventToTake", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "Label", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Input(), ecorePackage.getEString(), "input", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Output(), ecorePackage.getEString(), "output", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Event(), ecorePackage.getEString(), "event", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_States(), this.getState(), null, "states", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Transitions(), this.getTransition(), null, "transitions", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_ActionToTake(), this.getAction(), null, "actionToTake", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_EventToTake(), this.getEvent(), null, "eventToTake", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Label(), ecorePackage.getEString(), "Label", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Source(), this.getState(), null, "source", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Target(), this.getState(), null, "target", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Label(), ecorePackage.getEString(), "Label", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Source(), this.getState(), null, "source", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Target(), this.getState(), null, "target", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DataCurationStateTransitionActionPackageImpl
