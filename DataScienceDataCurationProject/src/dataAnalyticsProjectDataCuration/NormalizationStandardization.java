/**
 */
package dataAnalyticsProjectDataCuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normalization Standardization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.NormalizationStandardization#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.NormalizationStandardization#isNormalizeFrom0To1 <em>Normalize From0 To1</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.NormalizationStandardization#isStandardizeFromMinus1To1 <em>Standardize From Minus1 To1</em>}</li>
 * </ul>
 *
 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getNormalizationStandardization()
 * @model
 * @generated
 */
public interface NormalizationStandardization extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getNormalizationStandardization_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.NormalizationStandardization#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Normalize From0 To1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normalize From0 To1</em>' attribute.
	 * @see #setNormalizeFrom0To1(boolean)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getNormalizationStandardization_NormalizeFrom0To1()
	 * @model
	 * @generated
	 */
	boolean isNormalizeFrom0To1();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.NormalizationStandardization#isNormalizeFrom0To1 <em>Normalize From0 To1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normalize From0 To1</em>' attribute.
	 * @see #isNormalizeFrom0To1()
	 * @generated
	 */
	void setNormalizeFrom0To1(boolean value);

	/**
	 * Returns the value of the '<em><b>Standardize From Minus1 To1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standardize From Minus1 To1</em>' attribute.
	 * @see #setStandardizeFromMinus1To1(boolean)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getNormalizationStandardization_StandardizeFromMinus1To1()
	 * @model
	 * @generated
	 */
	boolean isStandardizeFromMinus1To1();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.NormalizationStandardization#isStandardizeFromMinus1To1 <em>Standardize From Minus1 To1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standardize From Minus1 To1</em>' attribute.
	 * @see #isStandardizeFromMinus1To1()
	 * @generated
	 */
	void setStandardizeFromMinus1To1(boolean value);

} // NormalizationStandardization
