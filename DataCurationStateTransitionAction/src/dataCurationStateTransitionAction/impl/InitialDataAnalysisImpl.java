/**
 */
package dataCurationStateTransitionAction.impl;

import dataCurationStateTransitionAction.Action;
import dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage;
import dataCurationStateTransitionAction.Event;
import dataCurationStateTransitionAction.InitialDataAnalysis;
import dataCurationStateTransitionAction.MissingValues;
import dataCurationStateTransitionAction.NullValues;
import dataCurationStateTransitionAction.State;
import dataCurationStateTransitionAction.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Data Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataCurationStateTransitionAction.impl.InitialDataAnalysisImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.InitialDataAnalysisImpl#getNullValues <em>Null Values</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.InitialDataAnalysisImpl#getMissingValues <em>Missing Values</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.InitialDataAnalysisImpl#getStates <em>States</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.InitialDataAnalysisImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.InitialDataAnalysisImpl#getSource <em>Source</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.InitialDataAnalysisImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.InitialDataAnalysisImpl#getActionToTake <em>Action To Take</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.InitialDataAnalysisImpl#getEventToTake <em>Event To Take</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialDataAnalysisImpl extends MinimalEObjectImpl.Container implements InitialDataAnalysis {
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
	 * The cached value of the '{@link #getNullValues() <em>Null Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullValues()
	 * @generated
	 * @ordered
	 */
	protected NullValues nullValues;

	/**
	 * The cached value of the '{@link #getMissingValues() <em>Missing Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingValues()
	 * @generated
	 * @ordered
	 */
	protected MissingValues missingValues;

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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<State> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<State> target;

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
	protected InitialDataAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataCurationStateTransitionActionPackage.Literals.INITIAL_DATA_ANALYSIS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullValues getNullValues() {
		return nullValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNullValues(NullValues newNullValues, NotificationChain msgs) {
		NullValues oldNullValues = nullValues;
		nullValues = newNullValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__NULL_VALUES, oldNullValues, newNullValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullValues(NullValues newNullValues) {
		if (newNullValues != nullValues) {
			NotificationChain msgs = null;
			if (nullValues != null)
				msgs = ((InternalEObject)nullValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__NULL_VALUES, null, msgs);
			if (newNullValues != null)
				msgs = ((InternalEObject)newNullValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__NULL_VALUES, null, msgs);
			msgs = basicSetNullValues(newNullValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__NULL_VALUES, newNullValues, newNullValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissingValues getMissingValues() {
		return missingValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMissingValues(MissingValues newMissingValues, NotificationChain msgs) {
		MissingValues oldMissingValues = missingValues;
		missingValues = newMissingValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__MISSING_VALUES, oldMissingValues, newMissingValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissingValues(MissingValues newMissingValues) {
		if (newMissingValues != missingValues) {
			NotificationChain msgs = null;
			if (missingValues != null)
				msgs = ((InternalEObject)missingValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__MISSING_VALUES, null, msgs);
			if (newMissingValues != null)
				msgs = ((InternalEObject)newMissingValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__MISSING_VALUES, null, msgs);
			msgs = basicSetMissingValues(newMissingValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__MISSING_VALUES, newMissingValues, newMissingValues));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__STATES, oldStates, states));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__STATES, oldStates, states));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__TRANSITIONS, oldTransitions, transitions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__TRANSITIONS, oldTransitions, transitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<State>(State.class, this, DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<State>(State.class, this, DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__TARGET);
		}
		return target;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__ACTION_TO_TAKE, oldActionToTake, newActionToTake);
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
				msgs = ((InternalEObject)actionToTake).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__ACTION_TO_TAKE, null, msgs);
			if (newActionToTake != null)
				msgs = ((InternalEObject)newActionToTake).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__ACTION_TO_TAKE, null, msgs);
			msgs = basicSetActionToTake(newActionToTake, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__ACTION_TO_TAKE, newActionToTake, newActionToTake));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__EVENT_TO_TAKE, oldEventToTake, newEventToTake);
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
				msgs = ((InternalEObject)eventToTake).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__EVENT_TO_TAKE, null, msgs);
			if (newEventToTake != null)
				msgs = ((InternalEObject)newEventToTake).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__EVENT_TO_TAKE, null, msgs);
			msgs = basicSetEventToTake(newEventToTake, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__EVENT_TO_TAKE, newEventToTake, newEventToTake));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__NULL_VALUES:
				return basicSetNullValues(null, msgs);
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__MISSING_VALUES:
				return basicSetMissingValues(null, msgs);
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__ACTION_TO_TAKE:
				return basicSetActionToTake(null, msgs);
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__LABEL:
				return getLabel();
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__NULL_VALUES:
				return getNullValues();
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__MISSING_VALUES:
				return getMissingValues();
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__STATES:
				if (resolve) return getStates();
				return basicGetStates();
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__TRANSITIONS:
				if (resolve) return getTransitions();
				return basicGetTransitions();
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__SOURCE:
				return getSource();
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__TARGET:
				return getTarget();
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__ACTION_TO_TAKE:
				return getActionToTake();
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__EVENT_TO_TAKE:
				return getEventToTake();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__LABEL:
				setLabel((String)newValue);
				return;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__NULL_VALUES:
				setNullValues((NullValues)newValue);
				return;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__MISSING_VALUES:
				setMissingValues((MissingValues)newValue);
				return;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__STATES:
				setStates((State)newValue);
				return;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__TRANSITIONS:
				setTransitions((Transition)newValue);
				return;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends State>)newValue);
				return;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends State>)newValue);
				return;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__ACTION_TO_TAKE:
				setActionToTake((Action)newValue);
				return;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__NULL_VALUES:
				setNullValues((NullValues)null);
				return;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__MISSING_VALUES:
				setMissingValues((MissingValues)null);
				return;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__STATES:
				setStates((State)null);
				return;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__TRANSITIONS:
				setTransitions((Transition)null);
				return;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__SOURCE:
				getSource().clear();
				return;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__TARGET:
				getTarget().clear();
				return;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__ACTION_TO_TAKE:
				setActionToTake((Action)null);
				return;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__NULL_VALUES:
				return nullValues != null;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__MISSING_VALUES:
				return missingValues != null;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__STATES:
				return states != null;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__TRANSITIONS:
				return transitions != null;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__SOURCE:
				return source != null && !source.isEmpty();
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__TARGET:
				return target != null && !target.isEmpty();
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__ACTION_TO_TAKE:
				return actionToTake != null;
			case DataCurationStateTransitionActionPackage.INITIAL_DATA_ANALYSIS__EVENT_TO_TAKE:
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
		result.append(')');
		return result.toString();
	}

} //InitialDataAnalysisImpl
