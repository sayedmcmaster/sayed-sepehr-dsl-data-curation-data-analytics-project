/**
 */
package dataAnalyticsProjectDataCuration.util;

import dataAnalyticsProjectDataCuration.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage
 * @generated
 */
public class DataAnalyticsProjectDataCurationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataAnalyticsProjectDataCurationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAnalyticsProjectDataCurationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DataAnalyticsProjectDataCurationPackage.eINSTANCE;
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
	protected DataAnalyticsProjectDataCurationSwitch<Adapter> modelSwitch =
		new DataAnalyticsProjectDataCurationSwitch<Adapter>() {
			@Override
			public Adapter caseDataAnalyticsProjectDataCuration(DataAnalyticsProjectDataCuration object) {
				return createDataAnalyticsProjectDataCurationAdapter();
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
	 * Creates a new adapter for an object of class '{@link dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration <em>Data Analytics Project Data Curation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCuration
	 * @generated
	 */
	public Adapter createDataAnalyticsProjectDataCurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataAnalyticsProjectDataCuration.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataAnalyticsProjectDataCuration.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataAnalyticsProjectDataCuration.InitialDataAnalysis <em>Initial Data Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataAnalyticsProjectDataCuration.InitialDataAnalysis
	 * @generated
	 */
	public Adapter createInitialDataAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis <em>Exploratory Data Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataAnalyticsProjectDataCuration.ExploratoryDataAnalysis
	 * @generated
	 */
	public Adapter createExploratoryDataAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataAnalyticsProjectDataCuration.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataAnalyticsProjectDataCuration.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataAnalyticsProjectDataCuration.DataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataAnalyticsProjectDataCuration.DataValue
	 * @generated
	 */
	public Adapter createDataValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataAnalyticsProjectDataCuration.NullValues <em>Null Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataAnalyticsProjectDataCuration.NullValues
	 * @generated
	 */
	public Adapter createNullValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataAnalyticsProjectDataCuration.MissingValues <em>Missing Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataAnalyticsProjectDataCuration.MissingValues
	 * @generated
	 */
	public Adapter createMissingValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataAnalyticsProjectDataCuration.RSquare <em>RSquare</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataAnalyticsProjectDataCuration.RSquare
	 * @generated
	 */
	public Adapter createRSquareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataAnalyticsProjectDataCuration.PValueFSignificance <em>PValue FSignificance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataAnalyticsProjectDataCuration.PValueFSignificance
	 * @generated
	 */
	public Adapter createPValueFSignificanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataAnalyticsProjectDataCuration.UnitaryAnalysis <em>Unitary Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataAnalyticsProjectDataCuration.UnitaryAnalysis
	 * @generated
	 */
	public Adapter createUnitaryAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataAnalyticsProjectDataCuration.BiVariateAnalysis <em>Bi Variate Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataAnalyticsProjectDataCuration.BiVariateAnalysis
	 * @generated
	 */
	public Adapter createBiVariateAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataAnalyticsProjectDataCuration.UnivariateVisualization <em>Univariate Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataAnalyticsProjectDataCuration.UnivariateVisualization
	 * @generated
	 */
	public Adapter createUnivariateVisualizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataAnalyticsProjectDataCuration.BiVariateVisualization <em>Bi Variate Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataAnalyticsProjectDataCuration.BiVariateVisualization
	 * @generated
	 */
	public Adapter createBiVariateVisualizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dataAnalyticsProjectDataCuration.NormalizationStandardization <em>Normalization Standardization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dataAnalyticsProjectDataCuration.NormalizationStandardization
	 * @generated
	 */
	public Adapter createNormalizationStandardizationAdapter() {
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

} //DataAnalyticsProjectDataCurationAdapterFactory
