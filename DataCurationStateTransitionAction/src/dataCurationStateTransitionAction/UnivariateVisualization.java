/**
 */
package dataCurationStateTransitionAction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Univariate Visualization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataCurationStateTransitionAction.UnivariateVisualization#getLabel <em>Label</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.UnivariateVisualization#isMethod <em>Method</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.UnivariateVisualization#isShowLegend <em>Show Legend</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.UnivariateVisualization#isShowTitle <em>Show Title</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.UnivariateVisualization#getStates <em>States</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.UnivariateVisualization#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.UnivariateVisualization#getSource <em>Source</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.UnivariateVisualization#getTarget <em>Target</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.UnivariateVisualization#getActionToTake <em>Action To Take</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.UnivariateVisualization#getEventToTake <em>Event To Take</em>}</li>
 * </ul>
 *
 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getUnivariateVisualization()
 * @model
 * @generated
 */
public interface UnivariateVisualization extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getUnivariateVisualization_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.UnivariateVisualization#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(boolean)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getUnivariateVisualization_Method()
	 * @model
	 * @generated
	 */
	boolean isMethod();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.UnivariateVisualization#isMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #isMethod()
	 * @generated
	 */
	void setMethod(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Legend</em>' attribute.
	 * @see #setShowLegend(boolean)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getUnivariateVisualization_ShowLegend()
	 * @model
	 * @generated
	 */
	boolean isShowLegend();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.UnivariateVisualization#isShowLegend <em>Show Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Legend</em>' attribute.
	 * @see #isShowLegend()
	 * @generated
	 */
	void setShowLegend(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Title</em>' attribute.
	 * @see #setShowTitle(boolean)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getUnivariateVisualization_ShowTitle()
	 * @model
	 * @generated
	 */
	boolean isShowTitle();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.UnivariateVisualization#isShowTitle <em>Show Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Title</em>' attribute.
	 * @see #isShowTitle()
	 * @generated
	 */
	void setShowTitle(boolean value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference.
	 * @see #setStates(State)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getUnivariateVisualization_States()
	 * @model
	 * @generated
	 */
	State getStates();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.UnivariateVisualization#getStates <em>States</em>}' reference.
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getUnivariateVisualization_Transitions()
	 * @model
	 * @generated
	 */
	Transition getTransitions();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.UnivariateVisualization#getTransitions <em>Transitions</em>}' reference.
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getUnivariateVisualization_Source()
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getUnivariateVisualization_Target()
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getUnivariateVisualization_ActionToTake()
	 * @model containment="true"
	 * @generated
	 */
	Action getActionToTake();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.UnivariateVisualization#getActionToTake <em>Action To Take</em>}' containment reference.
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getUnivariateVisualization_EventToTake()
	 * @model containment="true"
	 * @generated
	 */
	Event getEventToTake();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.UnivariateVisualization#getEventToTake <em>Event To Take</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event To Take</em>' containment reference.
	 * @see #getEventToTake()
	 * @generated
	 */
	void setEventToTake(Event value);

} // UnivariateVisualization
