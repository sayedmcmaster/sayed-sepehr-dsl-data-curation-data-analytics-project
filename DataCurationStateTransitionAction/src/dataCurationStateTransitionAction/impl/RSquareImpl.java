/**
 */
package dataCurationStateTransitionAction.impl;

import dataCurationStateTransitionAction.Action;
import dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage;
import dataCurationStateTransitionAction.Event;
import dataCurationStateTransitionAction.RSquare;
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
 * An implementation of the model object '<em><b>RSquare</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataCurationStateTransitionAction.impl.RSquareImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.RSquareImpl#getValue <em>Value</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.RSquareImpl#getAdjustedRSquare <em>Adjusted RSquare</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.RSquareImpl#getCutOffForRSquare <em>Cut Off For RSquare</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.RSquareImpl#getIsDataFitForRegression <em>Is Data Fit For Regression</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.RSquareImpl#getStates <em>States</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.RSquareImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.RSquareImpl#getSource <em>Source</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.RSquareImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.RSquareImpl#getActionToTake <em>Action To Take</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.RSquareImpl#getEventToTake <em>Event To Take</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RSquareImpl extends MinimalEObjectImpl.Container implements RSquare {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdjustedRSquare() <em>Adjusted RSquare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustedRSquare()
	 * @generated
	 * @ordered
	 */
	protected static final double ADJUSTED_RSQUARE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAdjustedRSquare() <em>Adjusted RSquare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustedRSquare()
	 * @generated
	 * @ordered
	 */
	protected double adjustedRSquare = ADJUSTED_RSQUARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCutOffForRSquare() <em>Cut Off For RSquare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOffForRSquare()
	 * @generated
	 * @ordered
	 */
	protected static final double CUT_OFF_FOR_RSQUARE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCutOffForRSquare() <em>Cut Off For RSquare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOffForRSquare()
	 * @generated
	 * @ordered
	 */
	protected double cutOffForRSquare = CUT_OFF_FOR_RSQUARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDataFitForRegression() <em>Is Data Fit For Regression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDataFitForRegression()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_DATA_FIT_FOR_REGRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDataFitForRegression() <em>Is Data Fit For Regression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDataFitForRegression()
	 * @generated
	 * @ordered
	 */
	protected String isDataFitForRegression = IS_DATA_FIT_FOR_REGRESSION_EDEFAULT;

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
	protected RSquareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataCurationStateTransitionActionPackage.Literals.RSQUARE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.RSQUARE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.RSQUARE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAdjustedRSquare() {
		return adjustedRSquare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdjustedRSquare(double newAdjustedRSquare) {
		double oldAdjustedRSquare = adjustedRSquare;
		adjustedRSquare = newAdjustedRSquare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.RSQUARE__ADJUSTED_RSQUARE, oldAdjustedRSquare, adjustedRSquare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCutOffForRSquare() {
		return cutOffForRSquare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCutOffForRSquare(double newCutOffForRSquare) {
		double oldCutOffForRSquare = cutOffForRSquare;
		cutOffForRSquare = newCutOffForRSquare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.RSQUARE__CUT_OFF_FOR_RSQUARE, oldCutOffForRSquare, cutOffForRSquare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsDataFitForRegression() {
		return isDataFitForRegression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDataFitForRegression(String newIsDataFitForRegression) {
		String oldIsDataFitForRegression = isDataFitForRegression;
		isDataFitForRegression = newIsDataFitForRegression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.RSQUARE__IS_DATA_FIT_FOR_REGRESSION, oldIsDataFitForRegression, isDataFitForRegression));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataCurationStateTransitionActionPackage.RSQUARE__STATES, oldStates, states));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.RSQUARE__STATES, oldStates, states));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataCurationStateTransitionActionPackage.RSQUARE__TRANSITIONS, oldTransitions, transitions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.RSQUARE__TRANSITIONS, oldTransitions, transitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<State>(State.class, this, DataCurationStateTransitionActionPackage.RSQUARE__SOURCE);
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
			target = new EObjectResolvingEList<State>(State.class, this, DataCurationStateTransitionActionPackage.RSQUARE__TARGET);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.RSQUARE__ACTION_TO_TAKE, oldActionToTake, newActionToTake);
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
				msgs = ((InternalEObject)actionToTake).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.RSQUARE__ACTION_TO_TAKE, null, msgs);
			if (newActionToTake != null)
				msgs = ((InternalEObject)newActionToTake).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.RSQUARE__ACTION_TO_TAKE, null, msgs);
			msgs = basicSetActionToTake(newActionToTake, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.RSQUARE__ACTION_TO_TAKE, newActionToTake, newActionToTake));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.RSQUARE__EVENT_TO_TAKE, oldEventToTake, newEventToTake);
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
				msgs = ((InternalEObject)eventToTake).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.RSQUARE__EVENT_TO_TAKE, null, msgs);
			if (newEventToTake != null)
				msgs = ((InternalEObject)newEventToTake).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.RSQUARE__EVENT_TO_TAKE, null, msgs);
			msgs = basicSetEventToTake(newEventToTake, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.RSQUARE__EVENT_TO_TAKE, newEventToTake, newEventToTake));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataCurationStateTransitionActionPackage.RSQUARE__ACTION_TO_TAKE:
				return basicSetActionToTake(null, msgs);
			case DataCurationStateTransitionActionPackage.RSQUARE__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.RSQUARE__LABEL:
				return getLabel();
			case DataCurationStateTransitionActionPackage.RSQUARE__VALUE:
				return getValue();
			case DataCurationStateTransitionActionPackage.RSQUARE__ADJUSTED_RSQUARE:
				return getAdjustedRSquare();
			case DataCurationStateTransitionActionPackage.RSQUARE__CUT_OFF_FOR_RSQUARE:
				return getCutOffForRSquare();
			case DataCurationStateTransitionActionPackage.RSQUARE__IS_DATA_FIT_FOR_REGRESSION:
				return getIsDataFitForRegression();
			case DataCurationStateTransitionActionPackage.RSQUARE__STATES:
				if (resolve) return getStates();
				return basicGetStates();
			case DataCurationStateTransitionActionPackage.RSQUARE__TRANSITIONS:
				if (resolve) return getTransitions();
				return basicGetTransitions();
			case DataCurationStateTransitionActionPackage.RSQUARE__SOURCE:
				return getSource();
			case DataCurationStateTransitionActionPackage.RSQUARE__TARGET:
				return getTarget();
			case DataCurationStateTransitionActionPackage.RSQUARE__ACTION_TO_TAKE:
				return getActionToTake();
			case DataCurationStateTransitionActionPackage.RSQUARE__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.RSQUARE__LABEL:
				setLabel((String)newValue);
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__VALUE:
				setValue((Double)newValue);
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__ADJUSTED_RSQUARE:
				setAdjustedRSquare((Double)newValue);
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__CUT_OFF_FOR_RSQUARE:
				setCutOffForRSquare((Double)newValue);
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__IS_DATA_FIT_FOR_REGRESSION:
				setIsDataFitForRegression((String)newValue);
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__STATES:
				setStates((State)newValue);
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__TRANSITIONS:
				setTransitions((Transition)newValue);
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends State>)newValue);
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends State>)newValue);
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__ACTION_TO_TAKE:
				setActionToTake((Action)newValue);
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.RSQUARE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__ADJUSTED_RSQUARE:
				setAdjustedRSquare(ADJUSTED_RSQUARE_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__CUT_OFF_FOR_RSQUARE:
				setCutOffForRSquare(CUT_OFF_FOR_RSQUARE_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__IS_DATA_FIT_FOR_REGRESSION:
				setIsDataFitForRegression(IS_DATA_FIT_FOR_REGRESSION_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__STATES:
				setStates((State)null);
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__TRANSITIONS:
				setTransitions((Transition)null);
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__SOURCE:
				getSource().clear();
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__TARGET:
				getTarget().clear();
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__ACTION_TO_TAKE:
				setActionToTake((Action)null);
				return;
			case DataCurationStateTransitionActionPackage.RSQUARE__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.RSQUARE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DataCurationStateTransitionActionPackage.RSQUARE__VALUE:
				return value != VALUE_EDEFAULT;
			case DataCurationStateTransitionActionPackage.RSQUARE__ADJUSTED_RSQUARE:
				return adjustedRSquare != ADJUSTED_RSQUARE_EDEFAULT;
			case DataCurationStateTransitionActionPackage.RSQUARE__CUT_OFF_FOR_RSQUARE:
				return cutOffForRSquare != CUT_OFF_FOR_RSQUARE_EDEFAULT;
			case DataCurationStateTransitionActionPackage.RSQUARE__IS_DATA_FIT_FOR_REGRESSION:
				return IS_DATA_FIT_FOR_REGRESSION_EDEFAULT == null ? isDataFitForRegression != null : !IS_DATA_FIT_FOR_REGRESSION_EDEFAULT.equals(isDataFitForRegression);
			case DataCurationStateTransitionActionPackage.RSQUARE__STATES:
				return states != null;
			case DataCurationStateTransitionActionPackage.RSQUARE__TRANSITIONS:
				return transitions != null;
			case DataCurationStateTransitionActionPackage.RSQUARE__SOURCE:
				return source != null && !source.isEmpty();
			case DataCurationStateTransitionActionPackage.RSQUARE__TARGET:
				return target != null && !target.isEmpty();
			case DataCurationStateTransitionActionPackage.RSQUARE__ACTION_TO_TAKE:
				return actionToTake != null;
			case DataCurationStateTransitionActionPackage.RSQUARE__EVENT_TO_TAKE:
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
		result.append(", value: ");
		result.append(value);
		result.append(", adjustedRSquare: ");
		result.append(adjustedRSquare);
		result.append(", cutOffForRSquare: ");
		result.append(cutOffForRSquare);
		result.append(", isDataFitForRegression: ");
		result.append(isDataFitForRegression);
		result.append(')');
		return result.toString();
	}

} //RSquareImpl
