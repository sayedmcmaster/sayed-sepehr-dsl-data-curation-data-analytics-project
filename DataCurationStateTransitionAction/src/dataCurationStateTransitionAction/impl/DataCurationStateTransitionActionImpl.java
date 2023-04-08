/**
 */
package dataCurationStateTransitionAction.impl;

import dataCurationStateTransitionAction.Action;
import dataCurationStateTransitionAction.Data;
import dataCurationStateTransitionAction.DataCurationStateTransitionAction;
import dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage;
import dataCurationStateTransitionAction.Event;
import dataCurationStateTransitionAction.ExploratoryDataAnalysis;
import dataCurationStateTransitionAction.InitialDataAnalysis;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Curation State Transition Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionImpl#getData <em>Data</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionImpl#getIda <em>Ida</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionImpl#getEda <em>Eda</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionImpl#getStates <em>States</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionImpl#getActionToTake <em>Action To Take</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.DataCurationStateTransitionActionImpl#getEventToTake <em>Event To Take</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataCurationStateTransitionActionImpl extends MinimalEObjectImpl.Container implements DataCurationStateTransitionAction {
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
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Data data;

	/**
	 * The cached value of the '{@link #getIda() <em>Ida</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIda()
	 * @generated
	 * @ordered
	 */
	protected InitialDataAnalysis ida;

	/**
	 * The cached value of the '{@link #getEda() <em>Eda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEda()
	 * @generated
	 * @ordered
	 */
	protected ExploratoryDataAnalysis eda;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

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
	protected DataCurationStateTransitionActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataCurationStateTransitionActionPackage.Literals.DATA_CURATION_STATE_TRANSITION_ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(Data newData, NotificationChain msgs) {
		Data oldData = data;
		data = newData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__DATA, oldData, newData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Data newData) {
		if (newData != data) {
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__DATA, null, msgs);
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__DATA, null, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialDataAnalysis getIda() {
		return ida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIda(InitialDataAnalysis newIda, NotificationChain msgs) {
		InitialDataAnalysis oldIda = ida;
		ida = newIda;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__IDA, oldIda, newIda);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIda(InitialDataAnalysis newIda) {
		if (newIda != ida) {
			NotificationChain msgs = null;
			if (ida != null)
				msgs = ((InternalEObject)ida).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__IDA, null, msgs);
			if (newIda != null)
				msgs = ((InternalEObject)newIda).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__IDA, null, msgs);
			msgs = basicSetIda(newIda, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__IDA, newIda, newIda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExploratoryDataAnalysis getEda() {
		return eda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEda(ExploratoryDataAnalysis newEda, NotificationChain msgs) {
		ExploratoryDataAnalysis oldEda = eda;
		eda = newEda;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__EDA, oldEda, newEda);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEda(ExploratoryDataAnalysis newEda) {
		if (newEda != eda) {
			NotificationChain msgs = null;
			if (eda != null)
				msgs = ((InternalEObject)eda).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__EDA, null, msgs);
			if (newEda != null)
				msgs = ((InternalEObject)newEda).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__EDA, null, msgs);
			msgs = basicSetEda(newEda, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__EDA, newEda, newEda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__TRANSITIONS);
		}
		return transitions;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__ACTION_TO_TAKE, oldActionToTake, newActionToTake);
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
				msgs = ((InternalEObject)actionToTake).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__ACTION_TO_TAKE, null, msgs);
			if (newActionToTake != null)
				msgs = ((InternalEObject)newActionToTake).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__ACTION_TO_TAKE, null, msgs);
			msgs = basicSetActionToTake(newActionToTake, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__ACTION_TO_TAKE, newActionToTake, newActionToTake));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__EVENT_TO_TAKE, oldEventToTake, newEventToTake);
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
				msgs = ((InternalEObject)eventToTake).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__EVENT_TO_TAKE, null, msgs);
			if (newEventToTake != null)
				msgs = ((InternalEObject)newEventToTake).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__EVENT_TO_TAKE, null, msgs);
			msgs = basicSetEventToTake(newEventToTake, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__EVENT_TO_TAKE, newEventToTake, newEventToTake));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__DATA:
				return basicSetData(null, msgs);
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__IDA:
				return basicSetIda(null, msgs);
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__EDA:
				return basicSetEda(null, msgs);
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__ACTION_TO_TAKE:
				return basicSetActionToTake(null, msgs);
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__LABEL:
				return getLabel();
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__NAME:
				return getName();
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__DATA:
				return getData();
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__IDA:
				return getIda();
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__EDA:
				return getEda();
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__STATES:
				return getStates();
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__TRANSITIONS:
				return getTransitions();
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__ACTION_TO_TAKE:
				return getActionToTake();
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__LABEL:
				setLabel((String)newValue);
				return;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__NAME:
				setName((String)newValue);
				return;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__DATA:
				setData((Data)newValue);
				return;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__IDA:
				setIda((InitialDataAnalysis)newValue);
				return;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__EDA:
				setEda((ExploratoryDataAnalysis)newValue);
				return;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__ACTION_TO_TAKE:
				setActionToTake((Action)newValue);
				return;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__DATA:
				setData((Data)null);
				return;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__IDA:
				setIda((InitialDataAnalysis)null);
				return;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__EDA:
				setEda((ExploratoryDataAnalysis)null);
				return;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__STATES:
				getStates().clear();
				return;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__TRANSITIONS:
				getTransitions().clear();
				return;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__ACTION_TO_TAKE:
				setActionToTake((Action)null);
				return;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__DATA:
				return data != null;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__IDA:
				return ida != null;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__EDA:
				return eda != null;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__STATES:
				return states != null && !states.isEmpty();
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__ACTION_TO_TAKE:
				return actionToTake != null;
			case DataCurationStateTransitionActionPackage.DATA_CURATION_STATE_TRANSITION_ACTION__EVENT_TO_TAKE:
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
		result.append(')');
		return result.toString();
	}

} //DataCurationStateTransitionActionImpl
