/**
 */
package dataCurationStateTransitionAction.impl;

import dataCurationStateTransitionAction.Action;
import dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage;
import dataCurationStateTransitionAction.Event;
import dataCurationStateTransitionAction.State;
import dataCurationStateTransitionAction.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataCurationStateTransitionAction.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.TransitionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.TransitionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.TransitionImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.TransitionImpl#getStates <em>States</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.TransitionImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.TransitionImpl#getActionToTake <em>Action To Take</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.TransitionImpl#getEventToTake <em>Event To Take</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected String input = INPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected String output = OUTPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected String event = EVENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected State states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected Transition transitions;

	/**
	 * The cached value of the '{@link #getActionToTake() <em>Action To Take</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionToTake()
	 * @generated
	 * @ordered
	 */
	protected Action actionToTake;

	/**
	 * The cached value of the '{@link #getEventToTake() <em>Event To Take</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventToTake()
	 * @generated
	 * @ordered
	 */
	protected Event eventToTake;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataCurationStateTransitionActionPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(String newInput) {
		String oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.TRANSITION__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(String newOutput) {
		String oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.TRANSITION__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(String newEvent) {
		String oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.TRANSITION__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStates() {
		if (states != null && states.eIsProxy()) {
			InternalEObject oldStates = (InternalEObject)states;
			states = (State)eResolveProxy(oldStates);
			if (states != oldStates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataCurationStateTransitionActionPackage.TRANSITION__STATES, oldStates, states));
			}
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetStates() {
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStates(State newStates) {
		State oldStates = states;
		states = newStates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.TRANSITION__STATES, oldStates, states));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTransitions() {
		if (transitions != null && transitions.eIsProxy()) {
			InternalEObject oldTransitions = (InternalEObject)transitions;
			transitions = (Transition)eResolveProxy(oldTransitions);
			if (transitions != oldTransitions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataCurationStateTransitionActionPackage.TRANSITION__TRANSITIONS, oldTransitions, transitions));
			}
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTransitions() {
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitions(Transition newTransitions) {
		Transition oldTransitions = transitions;
		transitions = newTransitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.TRANSITION__TRANSITIONS, oldTransitions, transitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getActionToTake() {
		return actionToTake;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionToTake(Action newActionToTake, NotificationChain msgs) {
		Action oldActionToTake = actionToTake;
		actionToTake = newActionToTake;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.TRANSITION__ACTION_TO_TAKE, oldActionToTake, newActionToTake);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionToTake(Action newActionToTake) {
		if (newActionToTake != actionToTake) {
			NotificationChain msgs = null;
			if (actionToTake != null)
				msgs = ((InternalEObject)actionToTake).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.TRANSITION__ACTION_TO_TAKE, null, msgs);
			if (newActionToTake != null)
				msgs = ((InternalEObject)newActionToTake).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.TRANSITION__ACTION_TO_TAKE, null, msgs);
			msgs = basicSetActionToTake(newActionToTake, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.TRANSITION__ACTION_TO_TAKE, newActionToTake, newActionToTake));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getEventToTake() {
		return eventToTake;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventToTake(Event newEventToTake, NotificationChain msgs) {
		Event oldEventToTake = eventToTake;
		eventToTake = newEventToTake;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.TRANSITION__EVENT_TO_TAKE, oldEventToTake, newEventToTake);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventToTake(Event newEventToTake) {
		if (newEventToTake != eventToTake) {
			NotificationChain msgs = null;
			if (eventToTake != null)
				msgs = ((InternalEObject)eventToTake).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.TRANSITION__EVENT_TO_TAKE, null, msgs);
			if (newEventToTake != null)
				msgs = ((InternalEObject)newEventToTake).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.TRANSITION__EVENT_TO_TAKE, null, msgs);
			msgs = basicSetEventToTake(newEventToTake, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.TRANSITION__EVENT_TO_TAKE, newEventToTake, newEventToTake));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataCurationStateTransitionActionPackage.TRANSITION__ACTION_TO_TAKE:
				return basicSetActionToTake(null, msgs);
			case DataCurationStateTransitionActionPackage.TRANSITION__EVENT_TO_TAKE:
				return basicSetEventToTake(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataCurationStateTransitionActionPackage.TRANSITION__LABEL:
				return getLabel();
			case DataCurationStateTransitionActionPackage.TRANSITION__NAME:
				return getName();
			case DataCurationStateTransitionActionPackage.TRANSITION__INPUT:
				return getInput();
			case DataCurationStateTransitionActionPackage.TRANSITION__OUTPUT:
				return getOutput();
			case DataCurationStateTransitionActionPackage.TRANSITION__EVENT:
				return getEvent();
			case DataCurationStateTransitionActionPackage.TRANSITION__STATES:
				if (resolve) return getStates();
				return basicGetStates();
			case DataCurationStateTransitionActionPackage.TRANSITION__TRANSITIONS:
				if (resolve) return getTransitions();
				return basicGetTransitions();
			case DataCurationStateTransitionActionPackage.TRANSITION__ACTION_TO_TAKE:
				return getActionToTake();
			case DataCurationStateTransitionActionPackage.TRANSITION__EVENT_TO_TAKE:
				return getEventToTake();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataCurationStateTransitionActionPackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case DataCurationStateTransitionActionPackage.TRANSITION__NAME:
				setName((String)newValue);
				return;
			case DataCurationStateTransitionActionPackage.TRANSITION__INPUT:
				setInput((String)newValue);
				return;
			case DataCurationStateTransitionActionPackage.TRANSITION__OUTPUT:
				setOutput((String)newValue);
				return;
			case DataCurationStateTransitionActionPackage.TRANSITION__EVENT:
				setEvent((String)newValue);
				return;
			case DataCurationStateTransitionActionPackage.TRANSITION__STATES:
				setStates((State)newValue);
				return;
			case DataCurationStateTransitionActionPackage.TRANSITION__TRANSITIONS:
				setTransitions((Transition)newValue);
				return;
			case DataCurationStateTransitionActionPackage.TRANSITION__ACTION_TO_TAKE:
				setActionToTake((Action)newValue);
				return;
			case DataCurationStateTransitionActionPackage.TRANSITION__EVENT_TO_TAKE:
				setEventToTake((Event)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataCurationStateTransitionActionPackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.TRANSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.TRANSITION__INPUT:
				setInput(INPUT_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.TRANSITION__OUTPUT:
				setOutput(OUTPUT_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.TRANSITION__EVENT:
				setEvent(EVENT_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.TRANSITION__STATES:
				setStates((State)null);
				return;
			case DataCurationStateTransitionActionPackage.TRANSITION__TRANSITIONS:
				setTransitions((Transition)null);
				return;
			case DataCurationStateTransitionActionPackage.TRANSITION__ACTION_TO_TAKE:
				setActionToTake((Action)null);
				return;
			case DataCurationStateTransitionActionPackage.TRANSITION__EVENT_TO_TAKE:
				setEventToTake((Event)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataCurationStateTransitionActionPackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DataCurationStateTransitionActionPackage.TRANSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataCurationStateTransitionActionPackage.TRANSITION__INPUT:
				return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
			case DataCurationStateTransitionActionPackage.TRANSITION__OUTPUT:
				return OUTPUT_EDEFAULT == null ? output != null : !OUTPUT_EDEFAULT.equals(output);
			case DataCurationStateTransitionActionPackage.TRANSITION__EVENT:
				return EVENT_EDEFAULT == null ? event != null : !EVENT_EDEFAULT.equals(event);
			case DataCurationStateTransitionActionPackage.TRANSITION__STATES:
				return states != null;
			case DataCurationStateTransitionActionPackage.TRANSITION__TRANSITIONS:
				return transitions != null;
			case DataCurationStateTransitionActionPackage.TRANSITION__ACTION_TO_TAKE:
				return actionToTake != null;
			case DataCurationStateTransitionActionPackage.TRANSITION__EVENT_TO_TAKE:
				return eventToTake != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Label: ");
		result.append(label);
		result.append(", Name: ");
		result.append(name);
		result.append(", input: ");
		result.append(input);
		result.append(", output: ");
		result.append(output);
		result.append(", event: ");
		result.append(event);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
