/**
 */
package dataCurationStateTransitionAction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataCurationStateTransitionAction.State#getLabel <em>Label</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.State#getName <em>Name</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.State#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.State#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.State#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.State#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.State#getStates <em>States</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.State#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.State#getActionToTake <em>Action To Take</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.State#getEventToTake <em>Event To Take</em>}</li>
 * </ul>
 *
 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getState_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial</em>' attribute.
	 * @see #setIsInitial(boolean)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getState_IsInitial()
	 * @model
	 * @generated
	 */
	boolean isIsInitial();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.State#isIsInitial <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial</em>' attribute.
	 * @see #isIsInitial()
	 * @generated
	 */
	void setIsInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(boolean)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getState_IsFinal()
	 * @model
	 * @generated
	 */
	boolean isIsFinal();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.State#isIsFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isIsFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link dataCurationStateTransitionAction.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getState_OutgoingTransitions()
	 * @model
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link dataCurationStateTransitionAction.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getState_IncomingTransitions()
	 * @model
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference.
	 * @see #setStates(State)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getState_States()
	 * @model
	 * @generated
	 */
	State getStates();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.State#getStates <em>States</em>}' reference.
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getState_Transitions()
	 * @model
	 * @generated
	 */
	Transition getTransitions();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.State#getTransitions <em>Transitions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitions</em>' reference.
	 * @see #getTransitions()
	 * @generated
	 */
	void setTransitions(Transition value);

	/**
	 * Returns the value of the '<em><b>Action To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action To Take</em>' containment reference.
	 * @see #setActionToTake(Action)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getState_ActionToTake()
	 * @model containment="true"
	 * @generated
	 */
	Action getActionToTake();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.State#getActionToTake <em>Action To Take</em>}' containment reference.
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getState_EventToTake()
	 * @model containment="true"
	 * @generated
	 */
	Event getEventToTake();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.State#getEventToTake <em>Event To Take</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event To Take</em>' containment reference.
	 * @see #getEventToTake()
	 * @generated
	 */
	void setEventToTake(Event value);

} // State
