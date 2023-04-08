/**
 */
package dataCurationStateTransitionAction.impl;

import dataCurationStateTransitionAction.Action;
import dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage;
import dataCurationStateTransitionAction.Event;
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
 * An implementation of the model object '<em><b>Null Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataCurationStateTransitionAction.impl.NullValuesImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.NullValuesImpl#isRemoveRow <em>Remove Row</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.NullValuesImpl#getReplacementMethod <em>Replacement Method</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.NullValuesImpl#getStates <em>States</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.NullValuesImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.NullValuesImpl#getSource <em>Source</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.NullValuesImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.NullValuesImpl#getActionToTake <em>Action To Take</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.NullValuesImpl#getEventToTake <em>Event To Take</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NullValuesImpl extends MinimalEObjectImpl.Container implements NullValues {
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
	 * The default value of the '{@link #isRemoveRow() <em>Remove Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveRow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_ROW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoveRow() <em>Remove Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveRow()
	 * @generated
	 * @ordered
	 */
	protected boolean removeRow = REMOVE_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplacementMethod() <em>Replacement Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLACEMENT_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplacementMethod() <em>Replacement Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementMethod()
	 * @generated
	 * @ordered
	 */
	protected String replacementMethod = REPLACEMENT_METHOD_EDEFAULT;

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
	protected NullValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataCurationStateTransitionActionPackage.Literals.NULL_VALUES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.NULL_VALUES__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemoveRow() {
		return removeRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveRow(boolean newRemoveRow) {
		boolean oldRemoveRow = removeRow;
		removeRow = newRemoveRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.NULL_VALUES__REMOVE_ROW, oldRemoveRow, removeRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReplacementMethod() {
		return replacementMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacementMethod(String newReplacementMethod) {
		String oldReplacementMethod = replacementMethod;
		replacementMethod = newReplacementMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.NULL_VALUES__REPLACEMENT_METHOD, oldReplacementMethod, replacementMethod));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataCurationStateTransitionActionPackage.NULL_VALUES__STATES, oldStates, states));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.NULL_VALUES__STATES, oldStates, states));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataCurationStateTransitionActionPackage.NULL_VALUES__TRANSITIONS, oldTransitions, transitions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.NULL_VALUES__TRANSITIONS, oldTransitions, transitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<State>(State.class, this, DataCurationStateTransitionActionPackage.NULL_VALUES__SOURCE);
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
			target = new EObjectResolvingEList<State>(State.class, this, DataCurationStateTransitionActionPackage.NULL_VALUES__TARGET);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.NULL_VALUES__ACTION_TO_TAKE, oldActionToTake, newActionToTake);
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
				msgs = ((InternalEObject)actionToTake).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.NULL_VALUES__ACTION_TO_TAKE, null, msgs);
			if (newActionToTake != null)
				msgs = ((InternalEObject)newActionToTake).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.NULL_VALUES__ACTION_TO_TAKE, null, msgs);
			msgs = basicSetActionToTake(newActionToTake, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.NULL_VALUES__ACTION_TO_TAKE, newActionToTake, newActionToTake));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.NULL_VALUES__EVENT_TO_TAKE, oldEventToTake, newEventToTake);
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
				msgs = ((InternalEObject)eventToTake).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.NULL_VALUES__EVENT_TO_TAKE, null, msgs);
			if (newEventToTake != null)
				msgs = ((InternalEObject)newEventToTake).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.NULL_VALUES__EVENT_TO_TAKE, null, msgs);
			msgs = basicSetEventToTake(newEventToTake, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.NULL_VALUES__EVENT_TO_TAKE, newEventToTake, newEventToTake));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataCurationStateTransitionActionPackage.NULL_VALUES__ACTION_TO_TAKE:
				return basicSetActionToTake(null, msgs);
			case DataCurationStateTransitionActionPackage.NULL_VALUES__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.NULL_VALUES__LABEL:
				return getLabel();
			case DataCurationStateTransitionActionPackage.NULL_VALUES__REMOVE_ROW:
				return isRemoveRow();
			case DataCurationStateTransitionActionPackage.NULL_VALUES__REPLACEMENT_METHOD:
				return getReplacementMethod();
			case DataCurationStateTransitionActionPackage.NULL_VALUES__STATES:
				if (resolve) return getStates();
				return basicGetStates();
			case DataCurationStateTransitionActionPackage.NULL_VALUES__TRANSITIONS:
				if (resolve) return getTransitions();
				return basicGetTransitions();
			case DataCurationStateTransitionActionPackage.NULL_VALUES__SOURCE:
				return getSource();
			case DataCurationStateTransitionActionPackage.NULL_VALUES__TARGET:
				return getTarget();
			case DataCurationStateTransitionActionPackage.NULL_VALUES__ACTION_TO_TAKE:
				return getActionToTake();
			case DataCurationStateTransitionActionPackage.NULL_VALUES__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.NULL_VALUES__LABEL:
				setLabel((String)newValue);
				return;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__REMOVE_ROW:
				setRemoveRow((Boolean)newValue);
				return;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__REPLACEMENT_METHOD:
				setReplacementMethod((String)newValue);
				return;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__STATES:
				setStates((State)newValue);
				return;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__TRANSITIONS:
				setTransitions((Transition)newValue);
				return;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends State>)newValue);
				return;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends State>)newValue);
				return;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__ACTION_TO_TAKE:
				setActionToTake((Action)newValue);
				return;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.NULL_VALUES__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__REMOVE_ROW:
				setRemoveRow(REMOVE_ROW_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__REPLACEMENT_METHOD:
				setReplacementMethod(REPLACEMENT_METHOD_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__STATES:
				setStates((State)null);
				return;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__TRANSITIONS:
				setTransitions((Transition)null);
				return;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__SOURCE:
				getSource().clear();
				return;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__TARGET:
				getTarget().clear();
				return;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__ACTION_TO_TAKE:
				setActionToTake((Action)null);
				return;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.NULL_VALUES__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DataCurationStateTransitionActionPackage.NULL_VALUES__REMOVE_ROW:
				return removeRow != REMOVE_ROW_EDEFAULT;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__REPLACEMENT_METHOD:
				return REPLACEMENT_METHOD_EDEFAULT == null ? replacementMethod != null : !REPLACEMENT_METHOD_EDEFAULT.equals(replacementMethod);
			case DataCurationStateTransitionActionPackage.NULL_VALUES__STATES:
				return states != null;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__TRANSITIONS:
				return transitions != null;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__SOURCE:
				return source != null && !source.isEmpty();
			case DataCurationStateTransitionActionPackage.NULL_VALUES__TARGET:
				return target != null && !target.isEmpty();
			case DataCurationStateTransitionActionPackage.NULL_VALUES__ACTION_TO_TAKE:
				return actionToTake != null;
			case DataCurationStateTransitionActionPackage.NULL_VALUES__EVENT_TO_TAKE:
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
		result.append(", removeRow: ");
		result.append(removeRow);
		result.append(", replacementMethod: ");
		result.append(replacementMethod);
		result.append(')');
		return result.toString();
	}

} //NullValuesImpl
