/**
 */
package dataAnalyticsProjectDataCuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RSquare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.RSquare#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.RSquare#getValue <em>Value</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.RSquare#getAdjustedRSquare <em>Adjusted RSquare</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.RSquare#getCutOffForRSquare <em>Cut Off For RSquare</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.RSquare#getIsDataFitForRegression <em>Is Data Fit For Regression</em>}</li>
 * </ul>
 *
 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getRSquare()
 * @model
 * @generated
 */
public interface RSquare extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getRSquare_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.RSquare#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getRSquare_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.RSquare#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Adjusted RSquare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjusted RSquare</em>' attribute.
	 * @see #setAdjustedRSquare(double)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getRSquare_AdjustedRSquare()
	 * @model
	 * @generated
	 */
	double getAdjustedRSquare();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.RSquare#getAdjustedRSquare <em>Adjusted RSquare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjusted RSquare</em>' attribute.
	 * @see #getAdjustedRSquare()
	 * @generated
	 */
	void setAdjustedRSquare(double value);

	/**
	 * Returns the value of the '<em><b>Cut Off For RSquare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Off For RSquare</em>' attribute.
	 * @see #setCutOffForRSquare(double)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getRSquare_CutOffForRSquare()
	 * @model
	 * @generated
	 */
	double getCutOffForRSquare();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.RSquare#getCutOffForRSquare <em>Cut Off For RSquare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Off For RSquare</em>' attribute.
	 * @see #getCutOffForRSquare()
	 * @generated
	 */
	void setCutOffForRSquare(double value);

	/**
	 * Returns the value of the '<em><b>Is Data Fit For Regression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Data Fit For Regression</em>' attribute.
	 * @see #setIsDataFitForRegression(String)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getRSquare_IsDataFitForRegression()
	 * @model
	 * @generated
	 */
	String getIsDataFitForRegression();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.RSquare#getIsDataFitForRegression <em>Is Data Fit For Regression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Data Fit For Regression</em>' attribute.
	 * @see #getIsDataFitForRegression()
	 * @generated
	 */
	void setIsDataFitForRegression(String value);

} // RSquare
