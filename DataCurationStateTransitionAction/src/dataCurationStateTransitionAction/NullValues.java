/**
 */
package dataCurationStateTransitionAction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Null Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataCurationStateTransitionAction.NullValues#getLabel <em>Label</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.NullValues#isRemoveRow <em>Remove Row</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.NullValues#getReplacementMethod <em>Replacement Method</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.NullValues#getStates <em>States</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.NullValues#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.NullValues#getSource <em>Source</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.NullValues#getTarget <em>Target</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.NullValues#getActionToTake <em>Action To Take</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.NullValues#getEventToTake <em>Event To Take</em>}</li>
 * </ul>
 *
 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNullValues()
 * @model
 * @generated
 */
public interface NullValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNullValues_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.NullValues#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Remove Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Row</em>' attribute.
	 * @see #setRemoveRow(boolean)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNullValues_RemoveRow()
	 * @model
	 * @generated
	 */
	boolean isRemoveRow();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.NullValues#isRemoveRow <em>Remove Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Row</em>' attribute.
	 * @see #isRemoveRow()
	 * @generated
	 */
	void setRemoveRow(boolean value);

	/**
	 * Returns the value of the '<em><b>Replacement Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacement Method</em>' attribute.
	 * @see #setReplacementMethod(String)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNullValues_ReplacementMethod()
	 * @model
	 * @generated
	 */
	String getReplacementMethod();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.NullValues#getReplacementMethod <em>Replacement Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement Method</em>' attribute.
	 * @see #getReplacementMethod()
	 * @generated
	 */
	void setReplacementMethod(String value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference.
	 * @see #setStates(State)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNullValues_States()
	 * @model
	 * @generated
	 */
	State getStates();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.NullValues#getStates <em>States</em>}' reference.
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNullValues_Transitions()
	 * @model
	 * @generated
	 */
	Transition getTransitions();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.NullValues#getTransitions <em>Transitions</em>}' reference.
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNullValues_Source()
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNullValues_Target()
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNullValues_ActionToTake()
	 * @model containment="true"
	 * @generated
	 */
	Action getActionToTake();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.NullValues#getActionToTake <em>Action To Take</em>}' containment reference.
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getNullValues_EventToTake()
	 * @model containment="true"
	 * @generated
	 */
	Event getEventToTake();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.NullValues#getEventToTake <em>Event To Take</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event To Take</em>' containment reference.
	 * @see #getEventToTake()
	 * @generated
	 */
	void setEventToTake(Event value);

} // NullValues
