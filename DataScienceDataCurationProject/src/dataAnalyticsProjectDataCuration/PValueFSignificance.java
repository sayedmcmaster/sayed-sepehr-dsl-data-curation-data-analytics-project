/**
 */
package dataAnalyticsProjectDataCuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PValue FSignificance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataAnalyticsProjectDataCuration.PValueFSignificance#getLabel <em>Label</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.PValueFSignificance#getAttributeList <em>Attribute List</em>}</li>
 *   <li>{@link dataAnalyticsProjectDataCuration.PValueFSignificance#getAttributePValues <em>Attribute PValues</em>}</li>
 * </ul>
 *
 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getPValueFSignificance()
 * @model
 * @generated
 */
public interface PValueFSignificance extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getPValueFSignificance_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dataAnalyticsProjectDataCuration.PValueFSignificance#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Attribute List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute List</em>' attribute list.
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getPValueFSignificance_AttributeList()
	 * @model derived="true"
	 * @generated
	 */
	EList<String> getAttributeList();

	/**
	 * Returns the value of the '<em><b>Attribute PValues</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute PValues</em>' attribute list.
	 * @see dataAnalyticsProjectDataCuration.DataAnalyticsProjectDataCurationPackage#getPValueFSignificance_AttributePValues()
	 * @model changeable="false"
	 * @generated
	 */
	EList<Double> getAttributePValues();

} // PValueFSignificance
