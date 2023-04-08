/**
 */
package dataCurationStateTransitionAction.impl;

import dataCurationStateTransitionAction.Action;
import dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage;
import dataCurationStateTransitionAction.Event;
import dataCurationStateTransitionAction.NormalizationStandardization;
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
 * An implementation of the model object '<em><b>Normalization Standardization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataCurationStateTransitionAction.impl.NormalizationStandardizationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.NormalizationStandardizationImpl#isNormalizeFrom0To1 <em>Normalize From0 To1</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.NormalizationStandardizationImpl#isStandardizeFromMinus1To1 <em>Standardize From Minus1 To1</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.NormalizationStandardizationImpl#getStates <em>States</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.NormalizationStandardizationImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.NormalizationStandardizationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.NormalizationStandardizationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.NormalizationStandardizationImpl#getActionToTake <em>Action To Take</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.NormalizationStandardizationImpl#getEventToTake <em>Event To Take</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalizationStandardizationImpl extends MinimalEObjectImpl.Container implements NormalizationStandardization {
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
	 * The default value of the '{@link #isNormalizeFrom0To1() <em>Normalize From0 To1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormalizeFrom0To1()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NORMALIZE_FROM0_TO1_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNormalizeFrom0To1() <em>Normalize From0 To1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormalizeFrom0To1()
	 * @generated
	 * @ordered
	 */
	protected boolean normalizeFrom0To1 = NORMALIZE_FROM0_TO1_EDEFAULT;

	/**
	 * The default value of the '{@link #isStandardizeFromMinus1To1() <em>Standardize From Minus1 To1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStandardizeFromMinus1To1()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STANDARDIZE_FROM_MINUS1_TO1_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStandardizeFromMinus1To1() <em>Standardize From Minus1 To1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStandardizeFromMinus1To1()
	 * @generated
	 * @ordered
	 */
	protected boolean standardizeFromMinus1To1 = STANDARDIZE_FROM_MINUS1_TO1_EDEFAULT;

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
	protected NormalizationStandardizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataCurationStateTransitionActionPackage.Literals.NORMALIZATION_STANDARDIZATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNormalizeFrom0To1() {
		return normalizeFrom0To1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalizeFrom0To1(boolean newNormalizeFrom0To1) {
		boolean oldNormalizeFrom0To1 = normalizeFrom0To1;
		normalizeFrom0To1 = newNormalizeFrom0To1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__NORMALIZE_FROM0_TO1, oldNormalizeFrom0To1, normalizeFrom0To1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStandardizeFromMinus1To1() {
		return standardizeFromMinus1To1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardizeFromMinus1To1(boolean newStandardizeFromMinus1To1) {
		boolean oldStandardizeFromMinus1To1 = standardizeFromMinus1To1;
		standardizeFromMinus1To1 = newStandardizeFromMinus1To1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__STANDARDIZE_FROM_MINUS1_TO1, oldStandardizeFromMinus1To1, standardizeFromMinus1To1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__STATES, oldStates, states));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__STATES, oldStates, states));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__TRANSITIONS, oldTransitions, transitions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__TRANSITIONS, oldTransitions, transitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<State>(State.class, this, DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__SOURCE);
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
			target = new EObjectResolvingEList<State>(State.class, this, DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__TARGET);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__ACTION_TO_TAKE, oldActionToTake, newActionToTake);
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
				msgs = ((InternalEObject)actionToTake).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__ACTION_TO_TAKE, null, msgs);
			if (newActionToTake != null)
				msgs = ((InternalEObject)newActionToTake).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__ACTION_TO_TAKE, null, msgs);
			msgs = basicSetActionToTake(newActionToTake, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__ACTION_TO_TAKE, newActionToTake, newActionToTake));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__EVENT_TO_TAKE, oldEventToTake, newEventToTake);
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
				msgs = ((InternalEObject)eventToTake).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__EVENT_TO_TAKE, null, msgs);
			if (newEventToTake != null)
				msgs = ((InternalEObject)newEventToTake).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__EVENT_TO_TAKE, null, msgs);
			msgs = basicSetEventToTake(newEventToTake, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__EVENT_TO_TAKE, newEventToTake, newEventToTake));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__ACTION_TO_TAKE:
				return basicSetActionToTake(null, msgs);
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__LABEL:
				return getLabel();
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__NORMALIZE_FROM0_TO1:
				return isNormalizeFrom0To1();
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__STANDARDIZE_FROM_MINUS1_TO1:
				return isStandardizeFromMinus1To1();
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__STATES:
				if (resolve) return getStates();
				return basicGetStates();
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__TRANSITIONS:
				if (resolve) return getTransitions();
				return basicGetTransitions();
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__SOURCE:
				return getSource();
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__TARGET:
				return getTarget();
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__ACTION_TO_TAKE:
				return getActionToTake();
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__LABEL:
				setLabel((String)newValue);
				return;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__NORMALIZE_FROM0_TO1:
				setNormalizeFrom0To1((Boolean)newValue);
				return;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__STANDARDIZE_FROM_MINUS1_TO1:
				setStandardizeFromMinus1To1((Boolean)newValue);
				return;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__STATES:
				setStates((State)newValue);
				return;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__TRANSITIONS:
				setTransitions((Transition)newValue);
				return;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends State>)newValue);
				return;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends State>)newValue);
				return;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__ACTION_TO_TAKE:
				setActionToTake((Action)newValue);
				return;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__NORMALIZE_FROM0_TO1:
				setNormalizeFrom0To1(NORMALIZE_FROM0_TO1_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__STANDARDIZE_FROM_MINUS1_TO1:
				setStandardizeFromMinus1To1(STANDARDIZE_FROM_MINUS1_TO1_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__STATES:
				setStates((State)null);
				return;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__TRANSITIONS:
				setTransitions((Transition)null);
				return;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__SOURCE:
				getSource().clear();
				return;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__TARGET:
				getTarget().clear();
				return;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__ACTION_TO_TAKE:
				setActionToTake((Action)null);
				return;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__NORMALIZE_FROM0_TO1:
				return normalizeFrom0To1 != NORMALIZE_FROM0_TO1_EDEFAULT;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__STANDARDIZE_FROM_MINUS1_TO1:
				return standardizeFromMinus1To1 != STANDARDIZE_FROM_MINUS1_TO1_EDEFAULT;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__STATES:
				return states != null;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__TRANSITIONS:
				return transitions != null;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__SOURCE:
				return source != null && !source.isEmpty();
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__TARGET:
				return target != null && !target.isEmpty();
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__ACTION_TO_TAKE:
				return actionToTake != null;
			case DataCurationStateTransitionActionPackage.NORMALIZATION_STANDARDIZATION__EVENT_TO_TAKE:
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
		result.append(", normalizeFrom0To1: ");
		result.append(normalizeFrom0To1);
		result.append(", standardizeFromMinus1To1: ");
		result.append(standardizeFromMinus1To1);
		result.append(')');
		return result.toString();
	}

} //NormalizationStandardizationImpl
