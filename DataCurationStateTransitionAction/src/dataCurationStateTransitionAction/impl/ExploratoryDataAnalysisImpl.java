/**
 */
package dataCurationStateTransitionAction.impl;

import dataCurationStateTransitionAction.Action;
import dataCurationStateTransitionAction.BiVariateAnalysis;
import dataCurationStateTransitionAction.BiVariateVisualization;
import dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage;
import dataCurationStateTransitionAction.Event;
import dataCurationStateTransitionAction.ExploratoryDataAnalysis;
import dataCurationStateTransitionAction.NormalizationStandardization;
import dataCurationStateTransitionAction.PValueFSignificance;
import dataCurationStateTransitionAction.RSquare;
import dataCurationStateTransitionAction.State;
import dataCurationStateTransitionAction.Transition;
import dataCurationStateTransitionAction.UnitaryAnalysis;
import dataCurationStateTransitionAction.UnivariateVisualization;

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
 * An implementation of the model object '<em><b>Exploratory Data Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl#getRSquare <em>RSquare</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl#getPValueFSignificance <em>PValue FSignificance</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl#getUnitaryAnalysis <em>Unitary Analysis</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl#getBiVariateAnalysis <em>Bi Variate Analysis</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl#getUnivariateVisualization <em>Univariate Visualization</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl#getBiVariateVisualization <em>Bi Variate Visualization</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl#getNormalizationStandardization <em>Normalization Standardization</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl#getFinalState <em>Final State</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl#getStates <em>States</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl#getSource <em>Source</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl#getActionToTake <em>Action To Take</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.impl.ExploratoryDataAnalysisImpl#getEventToTake <em>Event To Take</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExploratoryDataAnalysisImpl extends MinimalEObjectImpl.Container implements ExploratoryDataAnalysis {
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
	 * The cached value of the '{@link #getRSquare() <em>RSquare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRSquare()
	 * @generated
	 * @ordered
	 */
	protected RSquare rSquare;

	/**
	 * The cached value of the '{@link #getPValueFSignificance() <em>PValue FSignificance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPValueFSignificance()
	 * @generated
	 * @ordered
	 */
	protected PValueFSignificance pValueFSignificance;

	/**
	 * The cached value of the '{@link #getUnitaryAnalysis() <em>Unitary Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitaryAnalysis()
	 * @generated
	 * @ordered
	 */
	protected UnitaryAnalysis unitaryAnalysis;

	/**
	 * The cached value of the '{@link #getBiVariateAnalysis() <em>Bi Variate Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiVariateAnalysis()
	 * @generated
	 * @ordered
	 */
	protected BiVariateAnalysis biVariateAnalysis;

	/**
	 * The cached value of the '{@link #getUnivariateVisualization() <em>Univariate Visualization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnivariateVisualization()
	 * @generated
	 * @ordered
	 */
	protected UnivariateVisualization univariateVisualization;

	/**
	 * The cached value of the '{@link #getBiVariateVisualization() <em>Bi Variate Visualization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiVariateVisualization()
	 * @generated
	 * @ordered
	 */
	protected BiVariateVisualization biVariateVisualization;

	/**
	 * The cached value of the '{@link #getNormalizationStandardization() <em>Normalization Standardization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalizationStandardization()
	 * @generated
	 * @ordered
	 */
	protected NormalizationStandardization normalizationStandardization;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

	/**
	 * The cached value of the '{@link #getFinalState() <em>Final State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> finalState;

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
	protected ExploratoryDataAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataCurationStateTransitionActionPackage.Literals.EXPLORATORY_DATA_ANALYSIS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSquare getRSquare() {
		return rSquare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRSquare(RSquare newRSquare, NotificationChain msgs) {
		RSquare oldRSquare = rSquare;
		rSquare = newRSquare;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__RSQUARE, oldRSquare, newRSquare);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRSquare(RSquare newRSquare) {
		if (newRSquare != rSquare) {
			NotificationChain msgs = null;
			if (rSquare != null)
				msgs = ((InternalEObject)rSquare).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__RSQUARE, null, msgs);
			if (newRSquare != null)
				msgs = ((InternalEObject)newRSquare).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__RSQUARE, null, msgs);
			msgs = basicSetRSquare(newRSquare, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__RSQUARE, newRSquare, newRSquare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PValueFSignificance getPValueFSignificance() {
		return pValueFSignificance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPValueFSignificance(PValueFSignificance newPValueFSignificance, NotificationChain msgs) {
		PValueFSignificance oldPValueFSignificance = pValueFSignificance;
		pValueFSignificance = newPValueFSignificance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE, oldPValueFSignificance, newPValueFSignificance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPValueFSignificance(PValueFSignificance newPValueFSignificance) {
		if (newPValueFSignificance != pValueFSignificance) {
			NotificationChain msgs = null;
			if (pValueFSignificance != null)
				msgs = ((InternalEObject)pValueFSignificance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE, null, msgs);
			if (newPValueFSignificance != null)
				msgs = ((InternalEObject)newPValueFSignificance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE, null, msgs);
			msgs = basicSetPValueFSignificance(newPValueFSignificance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE, newPValueFSignificance, newPValueFSignificance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitaryAnalysis getUnitaryAnalysis() {
		return unitaryAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitaryAnalysis(UnitaryAnalysis newUnitaryAnalysis, NotificationChain msgs) {
		UnitaryAnalysis oldUnitaryAnalysis = unitaryAnalysis;
		unitaryAnalysis = newUnitaryAnalysis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS, oldUnitaryAnalysis, newUnitaryAnalysis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitaryAnalysis(UnitaryAnalysis newUnitaryAnalysis) {
		if (newUnitaryAnalysis != unitaryAnalysis) {
			NotificationChain msgs = null;
			if (unitaryAnalysis != null)
				msgs = ((InternalEObject)unitaryAnalysis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS, null, msgs);
			if (newUnitaryAnalysis != null)
				msgs = ((InternalEObject)newUnitaryAnalysis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS, null, msgs);
			msgs = basicSetUnitaryAnalysis(newUnitaryAnalysis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS, newUnitaryAnalysis, newUnitaryAnalysis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiVariateAnalysis getBiVariateAnalysis() {
		return biVariateAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBiVariateAnalysis(BiVariateAnalysis newBiVariateAnalysis, NotificationChain msgs) {
		BiVariateAnalysis oldBiVariateAnalysis = biVariateAnalysis;
		biVariateAnalysis = newBiVariateAnalysis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS, oldBiVariateAnalysis, newBiVariateAnalysis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBiVariateAnalysis(BiVariateAnalysis newBiVariateAnalysis) {
		if (newBiVariateAnalysis != biVariateAnalysis) {
			NotificationChain msgs = null;
			if (biVariateAnalysis != null)
				msgs = ((InternalEObject)biVariateAnalysis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS, null, msgs);
			if (newBiVariateAnalysis != null)
				msgs = ((InternalEObject)newBiVariateAnalysis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS, null, msgs);
			msgs = basicSetBiVariateAnalysis(newBiVariateAnalysis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS, newBiVariateAnalysis, newBiVariateAnalysis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnivariateVisualization getUnivariateVisualization() {
		return univariateVisualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnivariateVisualization(UnivariateVisualization newUnivariateVisualization, NotificationChain msgs) {
		UnivariateVisualization oldUnivariateVisualization = univariateVisualization;
		univariateVisualization = newUnivariateVisualization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION, oldUnivariateVisualization, newUnivariateVisualization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnivariateVisualization(UnivariateVisualization newUnivariateVisualization) {
		if (newUnivariateVisualization != univariateVisualization) {
			NotificationChain msgs = null;
			if (univariateVisualization != null)
				msgs = ((InternalEObject)univariateVisualization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION, null, msgs);
			if (newUnivariateVisualization != null)
				msgs = ((InternalEObject)newUnivariateVisualization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION, null, msgs);
			msgs = basicSetUnivariateVisualization(newUnivariateVisualization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION, newUnivariateVisualization, newUnivariateVisualization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiVariateVisualization getBiVariateVisualization() {
		return biVariateVisualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBiVariateVisualization(BiVariateVisualization newBiVariateVisualization, NotificationChain msgs) {
		BiVariateVisualization oldBiVariateVisualization = biVariateVisualization;
		biVariateVisualization = newBiVariateVisualization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION, oldBiVariateVisualization, newBiVariateVisualization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBiVariateVisualization(BiVariateVisualization newBiVariateVisualization) {
		if (newBiVariateVisualization != biVariateVisualization) {
			NotificationChain msgs = null;
			if (biVariateVisualization != null)
				msgs = ((InternalEObject)biVariateVisualization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION, null, msgs);
			if (newBiVariateVisualization != null)
				msgs = ((InternalEObject)newBiVariateVisualization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION, null, msgs);
			msgs = basicSetBiVariateVisualization(newBiVariateVisualization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION, newBiVariateVisualization, newBiVariateVisualization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalizationStandardization getNormalizationStandardization() {
		return normalizationStandardization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNormalizationStandardization(NormalizationStandardization newNormalizationStandardization, NotificationChain msgs) {
		NormalizationStandardization oldNormalizationStandardization = normalizationStandardization;
		normalizationStandardization = newNormalizationStandardization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION, oldNormalizationStandardization, newNormalizationStandardization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalizationStandardization(NormalizationStandardization newNormalizationStandardization) {
		if (newNormalizationStandardization != normalizationStandardization) {
			NotificationChain msgs = null;
			if (normalizationStandardization != null)
				msgs = ((InternalEObject)normalizationStandardization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION, null, msgs);
			if (newNormalizationStandardization != null)
				msgs = ((InternalEObject)newNormalizationStandardization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION, null, msgs);
			msgs = basicSetNormalizationStandardization(newNormalizationStandardization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION, newNormalizationStandardization, newNormalizationStandardization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject)initialState;
			initialState = (State)eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getFinalState() {
		if (finalState == null) {
			finalState = new EObjectResolvingEList<State>(State.class, this, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__FINAL_STATE);
		}
		return finalState;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__STATES, oldStates, states));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__STATES, oldStates, states));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__TRANSITIONS, oldTransitions, transitions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__TRANSITIONS, oldTransitions, transitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<State>(State.class, this, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__SOURCE);
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
			target = new EObjectResolvingEList<State>(State.class, this, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__TARGET);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__ACTION_TO_TAKE, oldActionToTake, newActionToTake);
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
				msgs = ((InternalEObject)actionToTake).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__ACTION_TO_TAKE, null, msgs);
			if (newActionToTake != null)
				msgs = ((InternalEObject)newActionToTake).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__ACTION_TO_TAKE, null, msgs);
			msgs = basicSetActionToTake(newActionToTake, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__ACTION_TO_TAKE, newActionToTake, newActionToTake));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__EVENT_TO_TAKE, oldEventToTake, newEventToTake);
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
				msgs = ((InternalEObject)eventToTake).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__EVENT_TO_TAKE, null, msgs);
			if (newEventToTake != null)
				msgs = ((InternalEObject)newEventToTake).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__EVENT_TO_TAKE, null, msgs);
			msgs = basicSetEventToTake(newEventToTake, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__EVENT_TO_TAKE, newEventToTake, newEventToTake));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__RSQUARE:
				return basicSetRSquare(null, msgs);
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE:
				return basicSetPValueFSignificance(null, msgs);
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS:
				return basicSetUnitaryAnalysis(null, msgs);
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS:
				return basicSetBiVariateAnalysis(null, msgs);
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION:
				return basicSetUnivariateVisualization(null, msgs);
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION:
				return basicSetBiVariateVisualization(null, msgs);
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION:
				return basicSetNormalizationStandardization(null, msgs);
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__ACTION_TO_TAKE:
				return basicSetActionToTake(null, msgs);
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__LABEL:
				return getLabel();
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__RSQUARE:
				return getRSquare();
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE:
				return getPValueFSignificance();
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS:
				return getUnitaryAnalysis();
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS:
				return getBiVariateAnalysis();
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION:
				return getUnivariateVisualization();
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION:
				return getBiVariateVisualization();
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION:
				return getNormalizationStandardization();
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__FINAL_STATE:
				return getFinalState();
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__STATES:
				if (resolve) return getStates();
				return basicGetStates();
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__TRANSITIONS:
				if (resolve) return getTransitions();
				return basicGetTransitions();
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__SOURCE:
				return getSource();
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__TARGET:
				return getTarget();
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__ACTION_TO_TAKE:
				return getActionToTake();
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__LABEL:
				setLabel((String)newValue);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__RSQUARE:
				setRSquare((RSquare)newValue);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE:
				setPValueFSignificance((PValueFSignificance)newValue);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS:
				setUnitaryAnalysis((UnitaryAnalysis)newValue);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS:
				setBiVariateAnalysis((BiVariateAnalysis)newValue);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION:
				setUnivariateVisualization((UnivariateVisualization)newValue);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION:
				setBiVariateVisualization((BiVariateVisualization)newValue);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION:
				setNormalizationStandardization((NormalizationStandardization)newValue);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__INITIAL_STATE:
				setInitialState((State)newValue);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__FINAL_STATE:
				getFinalState().clear();
				getFinalState().addAll((Collection<? extends State>)newValue);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__STATES:
				setStates((State)newValue);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__TRANSITIONS:
				setTransitions((Transition)newValue);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends State>)newValue);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends State>)newValue);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__ACTION_TO_TAKE:
				setActionToTake((Action)newValue);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__RSQUARE:
				setRSquare((RSquare)null);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE:
				setPValueFSignificance((PValueFSignificance)null);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS:
				setUnitaryAnalysis((UnitaryAnalysis)null);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS:
				setBiVariateAnalysis((BiVariateAnalysis)null);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION:
				setUnivariateVisualization((UnivariateVisualization)null);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION:
				setBiVariateVisualization((BiVariateVisualization)null);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION:
				setNormalizationStandardization((NormalizationStandardization)null);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__INITIAL_STATE:
				setInitialState((State)null);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__FINAL_STATE:
				getFinalState().clear();
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__STATES:
				setStates((State)null);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__TRANSITIONS:
				setTransitions((Transition)null);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__SOURCE:
				getSource().clear();
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__TARGET:
				getTarget().clear();
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__ACTION_TO_TAKE:
				setActionToTake((Action)null);
				return;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__EVENT_TO_TAKE:
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
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__RSQUARE:
				return rSquare != null;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__PVALUE_FSIGNIFICANCE:
				return pValueFSignificance != null;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNITARY_ANALYSIS:
				return unitaryAnalysis != null;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_ANALYSIS:
				return biVariateAnalysis != null;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__UNIVARIATE_VISUALIZATION:
				return univariateVisualization != null;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__BI_VARIATE_VISUALIZATION:
				return biVariateVisualization != null;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__NORMALIZATION_STANDARDIZATION:
				return normalizationStandardization != null;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__INITIAL_STATE:
				return initialState != null;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__FINAL_STATE:
				return finalState != null && !finalState.isEmpty();
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__STATES:
				return states != null;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__TRANSITIONS:
				return transitions != null;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__SOURCE:
				return source != null && !source.isEmpty();
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__TARGET:
				return target != null && !target.isEmpty();
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__ACTION_TO_TAKE:
				return actionToTake != null;
			case DataCurationStateTransitionActionPackage.EXPLORATORY_DATA_ANALYSIS__EVENT_TO_TAKE:
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

} //ExploratoryDataAnalysisImpl
