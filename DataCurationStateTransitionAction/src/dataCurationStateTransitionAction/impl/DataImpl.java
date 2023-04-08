/**
 */
package dataCurationStateTransitionAction.impl;

import dataCurationStateTransitionAction.Action;
import dataCurationStateTransitionAction.Attribute;
import dataCurationStateTransitionAction.Data;
import dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage;
import dataCurationStateTransitionAction.DataValue;
import dataCurationStateTransitionAction.Event;
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
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataCurationStateTransitionAction.impl.DataImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.DataImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.DataImpl#getDataValues <em>Data Values</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.DataImpl#getStates <em>States</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.DataImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.DataImpl#getSource <em>Source</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.DataImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.DataImpl#getActionToTake <em>Action To Take</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.DataImpl#getEventToTake <em>Event To Take</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataImpl extends MinimalEObjectImpl.Container implements Data {
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
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected Attribute attributes;

	/**
	 * The cached value of the '{@link #getDataValues() <em>Data Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataValues()
	 * @generated
	 * @ordered
	 */
	protected DataValue dataValues;

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
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataCurationStateTransitionActionPackage.Literals.DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(Attribute newAttributes, NotificationChain msgs) {
		Attribute oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(Attribute newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.DATA__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.DATA__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA__ATTRIBUTES, newAttributes, newAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue getDataValues() {
		return dataValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataValues(DataValue newDataValues, NotificationChain msgs) {
		DataValue oldDataValues = dataValues;
		dataValues = newDataValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA__DATA_VALUES, oldDataValues, newDataValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataValues(DataValue newDataValues) {
		if (newDataValues != dataValues) {
			NotificationChain msgs = null;
			if (dataValues != null)
				msgs = ((InternalEObject)dataValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.DATA__DATA_VALUES, null, msgs);
			if (newDataValues != null)
				msgs = ((InternalEObject)newDataValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.DATA__DATA_VALUES, null, msgs);
			msgs = basicSetDataValues(newDataValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA__DATA_VALUES, newDataValues, newDataValues));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataCurationStateTransitionActionPackage.DATA__STATES, oldStates, states));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA__STATES, oldStates, states));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataCurationStateTransitionActionPackage.DATA__TRANSITIONS, oldTransitions, transitions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA__TRANSITIONS, oldTransitions, transitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<State>(State.class, this, DataCurationStateTransitionActionPackage.DATA__SOURCE);
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
			target = new EObjectResolvingEList<State>(State.class, this, DataCurationStateTransitionActionPackage.DATA__TARGET);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA__ACTION_TO_TAKE, oldActionToTake, newActionToTake);
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
				msgs = ((InternalEObject)actionToTake).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.DATA__ACTION_TO_TAKE, null, msgs);
			if (newActionToTake != null)
				msgs = ((InternalEObject)newActionToTake).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.DATA__ACTION_TO_TAKE, null, msgs);
			msgs = basicSetActionToTake(newActionToTake, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA__ACTION_TO_TAKE, newActionToTake, newActionToTake));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA__EVENT_TO_TAKE, oldEventToTake, newEventToTake);
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
				msgs = ((InternalEObject)eventToTake).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.DATA__EVENT_TO_TAKE, null, msgs);
			if (newEventToTake != null)
				msgs = ((InternalEObject)newEventToTake).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.DATA__EVENT_TO_TAKE, null, msgs);
			msgs = basicSetEventToTake(newEventToTake, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA__EVENT_TO_TAKE, newEventToTake, newEventToTake));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataCurationStateTransitionActionPackage.DATA__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
			case DataCurationStateTransitionActionPackage.DATA__DATA_VALUES:
				return basicSetDataValues(null, msgs);
			case DataCurationStateTransitionActionPackage.DATA__ACTION_TO_TAKE:
				return basicSetActionToTake(null, msgs);
			case DataCurationStateTransitionActionPackage.DATA__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.DATA__LABEL:
				return getLabel();
			case DataCurationStateTransitionActionPackage.DATA__ATTRIBUTES:
				return getAttributes();
			case DataCurationStateTransitionActionPackage.DATA__DATA_VALUES:
				return getDataValues();
			case DataCurationStateTransitionActionPackage.DATA__STATES:
				if (resolve) return getStates();
				return basicGetStates();
			case DataCurationStateTransitionActionPackage.DATA__TRANSITIONS:
				if (resolve) return getTransitions();
				return basicGetTransitions();
			case DataCurationStateTransitionActionPackage.DATA__SOURCE:
				return getSource();
			case DataCurationStateTransitionActionPackage.DATA__TARGET:
				return getTarget();
			case DataCurationStateTransitionActionPackage.DATA__ACTION_TO_TAKE:
				return getActionToTake();
			case DataCurationStateTransitionActionPackage.DATA__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.DATA__LABEL:
				setLabel((String)newValue);
				return;
			case DataCurationStateTransitionActionPackage.DATA__ATTRIBUTES:
				setAttributes((Attribute)newValue);
				return;
			case DataCurationStateTransitionActionPackage.DATA__DATA_VALUES:
				setDataValues((DataValue)newValue);
				return;
			case DataCurationStateTransitionActionPackage.DATA__STATES:
				setStates((State)newValue);
				return;
			case DataCurationStateTransitionActionPackage.DATA__TRANSITIONS:
				setTransitions((Transition)newValue);
				return;
			case DataCurationStateTransitionActionPackage.DATA__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends State>)newValue);
				return;
			case DataCurationStateTransitionActionPackage.DATA__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends State>)newValue);
				return;
			case DataCurationStateTransitionActionPackage.DATA__ACTION_TO_TAKE:
				setActionToTake((Action)newValue);
				return;
			case DataCurationStateTransitionActionPackage.DATA__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.DATA__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.DATA__ATTRIBUTES:
				setAttributes((Attribute)null);
				return;
			case DataCurationStateTransitionActionPackage.DATA__DATA_VALUES:
				setDataValues((DataValue)null);
				return;
			case DataCurationStateTransitionActionPackage.DATA__STATES:
				setStates((State)null);
				return;
			case DataCurationStateTransitionActionPackage.DATA__TRANSITIONS:
				setTransitions((Transition)null);
				return;
			case DataCurationStateTransitionActionPackage.DATA__SOURCE:
				getSource().clear();
				return;
			case DataCurationStateTransitionActionPackage.DATA__TARGET:
				getTarget().clear();
				return;
			case DataCurationStateTransitionActionPackage.DATA__ACTION_TO_TAKE:
				setActionToTake((Action)null);
				return;
			case DataCurationStateTransitionActionPackage.DATA__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.DATA__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DataCurationStateTransitionActionPackage.DATA__ATTRIBUTES:
				return attributes != null;
			case DataCurationStateTransitionActionPackage.DATA__DATA_VALUES:
				return dataValues != null;
			case DataCurationStateTransitionActionPackage.DATA__STATES:
				return states != null;
			case DataCurationStateTransitionActionPackage.DATA__TRANSITIONS:
				return transitions != null;
			case DataCurationStateTransitionActionPackage.DATA__SOURCE:
				return source != null && !source.isEmpty();
			case DataCurationStateTransitionActionPackage.DATA__TARGET:
				return target != null && !target.isEmpty();
			case DataCurationStateTransitionActionPackage.DATA__ACTION_TO_TAKE:
				return actionToTake != null;
			case DataCurationStateTransitionActionPackage.DATA__EVENT_TO_TAKE:
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

} //DataImpl
