/**
 */
package dataAnalyticsProjectDataCuration.util;

import dataAnalyticsProjectDataCuration.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage
 * @generated
 */
public class DataAnalyticsProjectDataCurationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataAnalyticsProjectDataCurationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAnalyticsProjectDataCurationSwitch() {
		if (modelPackage == null) {
			modelPackage = DataAnalyticsProjectDataCurationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DataAnalyticsProjectDataCurationPackage.DATA_ANALYTICS_PROJECT_DATA_CURATION: {
				DataAnalyticsProjectDataCuration dataAnalyticsProjectDataCuration = (DataAnalyticsProjectDataCuration)theEObject;
				T result = caseDataAnalyticsProjectDataCuration(dataAnalyticsProjectDataCuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataAnalyticsProjectDataCurationPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataAnalyticsProjectDataCurationPackage.INITIAL_DATA_ANALYSIS: {
				InitialDataAnalysis initialDataAnalysis = (InitialDataAnalysis)theEObject;
				T result = caseInitialDataAnalysis(initialDataAnalysis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataAnalyticsProjectDataCurationPackage.EXPLORATORY_DATA_ANALYSIS: {
				ExploratoryDataAnalysis exploratoryDataAnalysis = (ExploratoryDataAnalysis)theEObject;
				T result = caseExploratoryDataAnalysis(exploratoryDataAnalysis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataAnalyticsProjectDataCurationPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataAnalyticsProjectDataCurationPackage.DATA_VALUE: {
				DataValue dataValue = (DataValue)theEObject;
				T result = caseDataValue(dataValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataAnalyticsProjectDataCurationPackage.NULL_VALUES: {
				NullValues nullValues = (NullValues)theEObject;
				T result = caseNullValues(nullValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataAnalyticsProjectDataCurationPackage.MISSING_VALUES: {
				MissingValues missingValues = (MissingValues)theEObject;
				T result = caseMissingValues(missingValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataAnalyticsProjectDataCurationPackage.RSQUARE: {
				RSquare rSquare = (RSquare)theEObject;
				T result = caseRSquare(rSquare);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataAnalyticsProjectDataCurationPackage.PVALUE_FSIGNIFICANCE: {
				PValueFSignificance pValueFSignificance = (PValueFSignificance)theEObject;
				T result = casePValueFSignificance(pValueFSignificance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataAnalyticsProjectDataCurationPackage.UNITARY_ANALYSIS: {
				UnitaryAnalysis unitaryAnalysis = (UnitaryAnalysis)theEObject;
				T result = caseUnitaryAnalysis(unitaryAnalysis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_ANALYSIS: {
				BiVariateAnalysis biVariateAnalysis = (BiVariateAnalysis)theEObject;
				T result = caseBiVariateAnalysis(biVariateAnalysis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataAnalyticsProjectDataCurationPackage.UNIVARIATE_VISUALIZATION: {
				UnivariateVisualization univariateVisualization = (UnivariateVisualization)theEObject;
				T result = caseUnivariateVisualization(univariateVisualization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataAnalyticsProjectDataCurationPackage.BI_VARIATE_VISUALIZATION: {
				BiVariateVisualization biVariateVisualization = (BiVariateVisualization)theEObject;
				T result = caseBiVariateVisualization(biVariateVisualization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataAnalyticsProjectDataCurationPackage.NORMALIZATION_STANDARDIZATION: {
				NormalizationStandardization normalizationStandardization = (NormalizationStandardization)theEObject;
				T result = caseNormalizationStandardization(normalizationStandardization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Analytics Project Data Curation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Analytics Project Data Curation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAnalyticsProjectDataCuration(DataAnalyticsProjectDataCuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Data Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Data Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialDataAnalysis(InitialDataAnalysis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exploratory Data Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exploratory Data Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExploratoryDataAnalysis(ExploratoryDataAnalysis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataValue(DataValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullValues(NullValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Missing Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Missing Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissingValues(MissingValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RSquare</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RSquare</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRSquare(RSquare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PValue FSignificance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PValue FSignificance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePValueFSignificance(PValueFSignificance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unitary Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unitary Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitaryAnalysis(UnitaryAnalysis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bi Variate Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bi Variate Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiVariateAnalysis(BiVariateAnalysis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Univariate Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Univariate Visualization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnivariateVisualization(UnivariateVisualization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bi Variate Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bi Variate Visualization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiVariateVisualization(BiVariateVisualization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normalization Standardization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normalization Standardization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalizationStandardization(NormalizationStandardization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DataAnalyticsProjectDataCurationSwitch
