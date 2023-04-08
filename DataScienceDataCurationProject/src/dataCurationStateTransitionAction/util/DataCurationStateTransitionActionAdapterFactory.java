/**
 */
package dataCurationStateTransitionAction.util;

import dataCurationStateTransitionAction.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage
 * @generated
 */
public class DataCurationStateTransitionActionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataCurationStateTransitionActionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCurationStateTransitionActionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DataCurationStateTransitionActionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCurationStateTransitionActionSwitch<Adapter> modelSwitch =
		new DataCurationStateTransitionActionSwitch<Adapter>() {
			@Override
			public Adapter caseDataCurationStateTransitionAction(DataCurationStateTransitionAction object) {
				return createDataCurationStateTransitionActionAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseInitialDataAnalysis(InitialDataAnalysis object) {
				return createInitialDataAnalysisAdapter();
			}
			@Override
			public Adapter caseExploratoryDataAnalysis(ExploratoryDataAnalysis object) {
				return createExploratoryDataAnalysisAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseDataValue(DataValue object) {
				return createDataValueAdapter();
			}
			@Override
			public Adapter caseNullValues(NullValues object) {
				return createNullValuesAdapter();
			}
			@Override
			public Adapter caseMissingValues(MissingValues object) {
				return createMissingValuesAdapter();
			}
			@Override
			public Adapter caseRSquare(RSquare object) {
				return createRSquareAdapter();
			}
			@Override
			public Adapter casePValueFSignificance(PValueFSignificance object) {
				return createPValueFSignificanceAdapter();
			}
			@Override
			public Adapter caseUnitaryAnalysis(UnitaryAnalysis object) {
				return createUnitaryAnalysisAdapter();
			}
			@Override
			public Adapter caseBiVariateAnalysis(BiVariateAnalysis object) {
				return createBiVariateAnalysisAdapter();
			}
			@Override
			public Adapter caseUnivariateVisualization(UnivariateVisualization object) {
				return createUnivariateVisualizationAdapter();
			}
			@Override
			public Adapter caseBiVariateVisualization(BiVariateVisualization object) {
				return createBiVariateVisualizationAdapter();
			}
			@Override
			public Adapter caseNormalizationStandardization(NormalizationStandardization object) {
				return createNormalizationStandardizationAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction <em>Data Curation State Transition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionAction
	 * @generated
	 */
	public Adapter createDataCurationStateTransitionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataCurationStateTransitionAction.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataCurationStateTransitionAction.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataCurationStateTransitionAction.InitialDataAnalysis <em>Initial Data Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataCurationStateTransitionAction.InitialDataAnalysis
	 * @generated
	 */
	public Adapter createInitialDataAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis <em>Exploratory Data Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataCurationStateTransitionAction.ExploratoryDataAnalysis
	 * @generated
	 */
	public Adapter createExploratoryDataAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataCurationStateTransitionAction.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataCurationStateTransitionAction.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataCurationStateTransitionAction.DataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataCurationStateTransitionAction.DataValue
	 * @generated
	 */
	public Adapter createDataValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataCurationStateTransitionAction.NullValues <em>Null Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataCurationStateTransitionAction.NullValues
	 * @generated
	 */
	public Adapter createNullValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataCurationStateTransitionAction.MissingValues <em>Missing Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataCurationStateTransitionAction.MissingValues
	 * @generated
	 */
	public Adapter createMissingValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataCurationStateTransitionAction.RSquare <em>RSquare</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataCurationStateTransitionAction.RSquare
	 * @generated
	 */
	public Adapter createRSquareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataCurationStateTransitionAction.PValueFSignificance <em>PValue FSignificance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataCurationStateTransitionAction.PValueFSignificance
	 * @generated
	 */
	public Adapter createPValueFSignificanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataCurationStateTransitionAction.UnitaryAnalysis <em>Unitary Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataCurationStateTransitionAction.UnitaryAnalysis
	 * @generated
	 */
	public Adapter createUnitaryAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataCurationStateTransitionAction.BiVariateAnalysis <em>Bi Variate Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataCurationStateTransitionAction.BiVariateAnalysis
	 * @generated
	 */
	public Adapter createBiVariateAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataCurationStateTransitionAction.UnivariateVisualization <em>Univariate Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataCurationStateTransitionAction.UnivariateVisualization
	 * @generated
	 */
	public Adapter createUnivariateVisualizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataCurationStateTransitionAction.BiVariateVisualization <em>Bi Variate Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataCurationStateTransitionAction.BiVariateVisualization
	 * @generated
	 */
	public Adapter createBiVariateVisualizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataCurationStateTransitionAction.NormalizationStandardization <em>Normalization Standardization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataCurationStateTransitionAction.NormalizationStandardization
	 * @generated
	 */
	public Adapter createNormalizationStandardizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataCurationStateTransitionAction.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataCurationStateTransitionAction.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataCurationStateTransitionAction.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataCurationStateTransitionAction.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataCurationStateTransitionAction.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataCurationStateTransitionAction.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataCurationStateTransitionAction.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataCurationStateTransitionAction.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DataCurationStateTransitionActionAdapterFactory
