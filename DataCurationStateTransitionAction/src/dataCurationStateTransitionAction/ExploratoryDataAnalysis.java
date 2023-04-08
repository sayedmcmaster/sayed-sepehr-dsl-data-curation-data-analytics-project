/**
 */
package dataCurationStateTransitionAction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exploratory Data Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getLabel <em>Label</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getRSquare <em>RSquare</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getPValueFSignificance <em>PValue FSignificance</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getUnitaryAnalysis <em>Unitary Analysis</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getBiVariateAnalysis <em>Bi Variate Analysis</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getUnivariateVisualization <em>Univariate Visualization</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getBiVariateVisualization <em>Bi Variate Visualization</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getNormalizationStandardization <em>Normalization Standardization</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getFinalState <em>Final State</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getStates <em>States</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getSource <em>Source</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getTarget <em>Target</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getActionToTake <em>Action To Take</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getEventToTake <em>Event To Take</em>}</li>
 * </ul>
 *
 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getExploratoryDataAnalysis()
 * @model
 * @generated
 */
public interface ExploratoryDataAnalysis extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getExploratoryDataAnalysis_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>RSquare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RSquare</em>' containment reference.
	 * @see #setRSquare(RSquare)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getExploratoryDataAnalysis_RSquare()
	 * @model containment="true"
	 * @generated
	 */
	RSquare getRSquare();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getRSquare <em>RSquare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RSquare</em>' containment reference.
	 * @see #getRSquare()
	 * @generated
	 */
	void setRSquare(RSquare value);

	/**
	 * Returns the value of the '<em><b>PValue FSignificance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PValue FSignificance</em>' containment reference.
	 * @see #setPValueFSignificance(PValueFSignificance)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getExploratoryDataAnalysis_PValueFSignificance()
	 * @model containment="true"
	 * @generated
	 */
	PValueFSignificance getPValueFSignificance();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getPValueFSignificance <em>PValue FSignificance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PValue FSignificance</em>' containment reference.
	 * @see #getPValueFSignificance()
	 * @generated
	 */
	void setPValueFSignificance(PValueFSignificance value);

	/**
	 * Returns the value of the '<em><b>Unitary Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unitary Analysis</em>' containment reference.
	 * @see #setUnitaryAnalysis(UnitaryAnalysis)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getExploratoryDataAnalysis_UnitaryAnalysis()
	 * @model containment="true"
	 * @generated
	 */
	UnitaryAnalysis getUnitaryAnalysis();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getUnitaryAnalysis <em>Unitary Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unitary Analysis</em>' containment reference.
	 * @see #getUnitaryAnalysis()
	 * @generated
	 */
	void setUnitaryAnalysis(UnitaryAnalysis value);

	/**
	 * Returns the value of the '<em><b>Bi Variate Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bi Variate Analysis</em>' containment reference.
	 * @see #setBiVariateAnalysis(BiVariateAnalysis)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getExploratoryDataAnalysis_BiVariateAnalysis()
	 * @model containment="true"
	 * @generated
	 */
	BiVariateAnalysis getBiVariateAnalysis();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getBiVariateAnalysis <em>Bi Variate Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bi Variate Analysis</em>' containment reference.
	 * @see #getBiVariateAnalysis()
	 * @generated
	 */
	void setBiVariateAnalysis(BiVariateAnalysis value);

	/**
	 * Returns the value of the '<em><b>Univariate Visualization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Univariate Visualization</em>' containment reference.
	 * @see #setUnivariateVisualization(UnivariateVisualization)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getExploratoryDataAnalysis_UnivariateVisualization()
	 * @model containment="true"
	 * @generated
	 */
	UnivariateVisualization getUnivariateVisualization();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getUnivariateVisualization <em>Univariate Visualization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Univariate Visualization</em>' containment reference.
	 * @see #getUnivariateVisualization()
	 * @generated
	 */
	void setUnivariateVisualization(UnivariateVisualization value);

	/**
	 * Returns the value of the '<em><b>Bi Variate Visualization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bi Variate Visualization</em>' containment reference.
	 * @see #setBiVariateVisualization(BiVariateVisualization)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getExploratoryDataAnalysis_BiVariateVisualization()
	 * @model containment="true"
	 * @generated
	 */
	BiVariateVisualization getBiVariateVisualization();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getBiVariateVisualization <em>Bi Variate Visualization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bi Variate Visualization</em>' containment reference.
	 * @see #getBiVariateVisualization()
	 * @generated
	 */
	void setBiVariateVisualization(BiVariateVisualization value);

	/**
	 * Returns the value of the '<em><b>Normalization Standardization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normalization Standardization</em>' containment reference.
	 * @see #setNormalizationStandardization(NormalizationStandardization)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getExploratoryDataAnalysis_NormalizationStandardization()
	 * @model containment="true"
	 * @generated
	 */
	NormalizationStandardization getNormalizationStandardization();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getNormalizationStandardization <em>Normalization Standardization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normalization Standardization</em>' containment reference.
	 * @see #getNormalizationStandardization()
	 * @generated
	 */
	void setNormalizationStandardization(NormalizationStandardization value);

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getExploratoryDataAnalysis_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Final State</b></em>' reference list.
	 * The list contents are of type {@link dataCurationStateTransitionAction.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final State</em>' reference list.
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getExploratoryDataAnalysis_FinalState()
	 * @model required="true"
	 * @generated
	 */
	EList<State> getFinalState();

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference.
	 * @see #setStates(State)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getExploratoryDataAnalysis_States()
	 * @model
	 * @generated
	 */
	State getStates();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getStates <em>States</em>}' reference.
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getExploratoryDataAnalysis_Transitions()
	 * @model
	 * @generated
	 */
	Transition getTransitions();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getTransitions <em>Transitions</em>}' reference.
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getExploratoryDataAnalysis_Source()
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getExploratoryDataAnalysis_Target()
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getExploratoryDataAnalysis_ActionToTake()
	 * @model containment="true"
	 * @generated
	 */
	Action getActionToTake();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getActionToTake <em>Action To Take</em>}' containment reference.
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getExploratoryDataAnalysis_EventToTake()
	 * @model containment="true"
	 * @generated
	 */
	Event getEventToTake();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.ExploratoryDataAnalysis#getEventToTake <em>Event To Take</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event To Take</em>' containment reference.
	 * @see #getEventToTake()
	 * @generated
	 */
	void setEventToTake(Event value);

} // ExploratoryDataAnalysis
