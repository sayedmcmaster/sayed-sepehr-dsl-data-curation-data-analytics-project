/**
 */
package dataCurationStateTransitionAction;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link dataCurationStateTransitionAction.NormalizationStandardization#getLabel <em>Label</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.NormalizationStandardization#isNormalizeFrom0To1 <em>Normalize From0 To1</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.NormalizationStandardization#isStandardizeFromMinus1To1 <em>Standardize From Minus1 To1</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.NormalizationStandardization#getStates <em>States</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.NormalizationStandardization#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.NormalizationStandardization#getSource <em>Source</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.NormalizationStandardization#getTarget <em>Target</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.NormalizationStandardization#getActionToTake <em>Action To Take</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.NormalizationStandardization#getEventToTake <em>Event To Take</em>}</li>
 * </ul>
 *
 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNormalizationStandardization()
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNormalizationStandardization_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.NormalizationStandardization#getLabel <em>Label</em>}' attribute.
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNormalizationStandardization_NormalizeFrom0To1()
	 * @model
	 * @generated
	 */
	boolean isNormalizeFrom0To1();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.NormalizationStandardization#isNormalizeFrom0To1 <em>Normalize From0 To1</em>}' attribute.
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNormalizationStandardization_StandardizeFromMinus1To1()
	 * @model
	 * @generated
	 */
	boolean isStandardizeFromMinus1To1();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.NormalizationStandardization#isStandardizeFromMinus1To1 <em>Standardize From Minus1 To1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standardize From Minus1 To1</em>' attribute.
	 * @see #isStandardizeFromMinus1To1()
	 * @generated
	 */
	void setStandardizeFromMinus1To1(boolean value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference.
	 * @see #setStates(State)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNormalizationStandardization_States()
	 * @model
	 * @generated
	 */
	State getStates();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.NormalizationStandardization#getStates <em>States</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>States</em>' reference.
	 * @see #getStates()
	 * @generated
	 */
	void setStates(State value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' reference.
	 * @see #setTransitions(Transition)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNormalizationStandardization_Transitions()
	 * @model
	 * @generated
	 */
	Transition getTransitions();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.NormalizationStandardization#getTransitions <em>Transitions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitions</em>' reference.
	 * @see #getTransitions()
	 * @generated
	 */
	void setTransitions(Transition value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link dataCurationStateTransitionAction.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNormalizationStandardization_Source()
	 * @model
	 * @generated
	 */
	EList<State> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link dataCurationStateTransitionAction.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNormalizationStandardization_Target()
	 * @model
	 * @generated
	 */
	EList<State> getTarget();

	/**
	 * Returns the value of the '<em><b>Action To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action To Take</em>' containment reference.
	 * @see #setActionToTake(Action)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNormalizationStandardization_ActionToTake()
	 * @model containment="true"
	 * @generated
	 */
	Action getActionToTake();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.NormalizationStandardization#getActionToTake <em>Action To Take</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action To Take</em>' containment reference.
	 * @see #getActionToTake()
	 * @generated
	 */
	void setActionToTake(Action value);

	/**
	 * Returns the value of the '<em><b>Event To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event To Take</em>' containment reference.
	 * @see #setEventToTake(Event)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNormalizationStandardization_EventToTake()
	 * @model containment="true"
	 * @generated
	 */
	Event getEventToTake();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.NormalizationStandardization#getEventToTake <em>Event To Take</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event To Take</em>' containment reference.
	 * @see #getEventToTake()
	 * @generated
	 */
	void setEventToTake(Event value);

} // NormalizationStandardization
