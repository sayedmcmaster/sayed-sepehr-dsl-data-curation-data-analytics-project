/**
 */
package dataCurationStateTransitionAction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RSquare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataCurationStateTransitionAction.RSquare#getLabel <em>Label</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.RSquare#getValue <em>Value</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.RSquare#getAdjustedRSquare <em>Adjusted RSquare</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.RSquare#getCutOffForRSquare <em>Cut Off For RSquare</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.RSquare#getIsDataFitForRegression <em>Is Data Fit For Regression</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.RSquare#getStates <em>States</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.RSquare#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.RSquare#getSource <em>Source</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.RSquare#getTarget <em>Target</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.RSquare#getActionToTake <em>Action To Take</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.RSquare#getEventToTake <em>Event To Take</em>}</li>
 * </ul>
 *
 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getRSquare()
 * @model
 * @generated
 */
public interface RSquare extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getRSquare_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.RSquare#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getRSquare_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.RSquare#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Adjusted RSquare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjusted RSquare</em>' attribute.
	 * @see #setAdjustedRSquare(double)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getRSquare_AdjustedRSquare()
	 * @model
	 * @generated
	 */
	double getAdjustedRSquare();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.RSquare#getAdjustedRSquare <em>Adjusted RSquare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjusted RSquare</em>' attribute.
	 * @see #getAdjustedRSquare()
	 * @generated
	 */
	void setAdjustedRSquare(double value);

	/**
	 * Returns the value of the '<em><b>Cut Off For RSquare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Off For RSquare</em>' attribute.
	 * @see #setCutOffForRSquare(double)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getRSquare_CutOffForRSquare()
	 * @model
	 * @generated
	 */
	double getCutOffForRSquare();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.RSquare#getCutOffForRSquare <em>Cut Off For RSquare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Off For RSquare</em>' attribute.
	 * @see #getCutOffForRSquare()
	 * @generated
	 */
	void setCutOffForRSquare(double value);

	/**
	 * Returns the value of the '<em><b>Is Data Fit For Regression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Data Fit For Regression</em>' attribute.
	 * @see #setIsDataFitForRegression(String)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getRSquare_IsDataFitForRegression()
	 * @model
	 * @generated
	 */
	String getIsDataFitForRegression();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.RSquare#getIsDataFitForRegression <em>Is Data Fit For Regression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Data Fit For Regression</em>' attribute.
	 * @see #getIsDataFitForRegression()
	 * @generated
	 */
	void setIsDataFitForRegression(String value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference.
	 * @see #setStates(State)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getRSquare_States()
	 * @model
	 * @generated
	 */
	State getStates();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.RSquare#getStates <em>States</em>}' reference.
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getRSquare_Transitions()
	 * @model
	 * @generated
	 */
	Transition getTransitions();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.RSquare#getTransitions <em>Transitions</em>}' reference.
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getRSquare_Source()
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getRSquare_Target()
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getRSquare_ActionToTake()
	 * @model containment="true"
	 * @generated
	 */
	Action getActionToTake();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.RSquare#getActionToTake <em>Action To Take</em>}' containment reference.
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getRSquare_EventToTake()
	 * @model containment="true"
	 * @generated
	 */
	Event getEventToTake();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.RSquare#getEventToTake <em>Event To Take</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event To Take</em>' containment reference.
	 * @see #getEventToTake()
	 * @generated
	 */
	void setEventToTake(Event value);

} // RSquare
