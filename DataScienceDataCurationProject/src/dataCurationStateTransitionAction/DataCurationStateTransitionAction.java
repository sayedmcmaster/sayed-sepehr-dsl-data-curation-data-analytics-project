/**
 */
package dataCurationStateTransitionAction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Curation State Transition Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getLabel <em>Label</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getName <em>Name</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getData <em>Data</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getIda <em>Ida</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getEda <em>Eda</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getStates <em>States</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getActionToTake <em>Action To Take</em>}</li>
 *   <li>{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getEventToTake <em>Event To Take</em>}</li>
 * </ul>
 *
 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getDataCurationStateTransitionAction()
 * @model
 * @generated
 */
public interface DataCurationStateTransitionAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getDataCurationStateTransitionAction_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getDataCurationStateTransitionAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(Data)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getDataCurationStateTransitionAction_Data()
	 * @model containment="true"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

	/**
	 * Returns the value of the '<em><b>Ida</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ida</em>' containment reference.
	 * @see #setIda(InitialDataAnalysis)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getDataCurationStateTransitionAction_Ida()
	 * @model containment="true"
	 * @generated
	 */
	InitialDataAnalysis getIda();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getIda <em>Ida</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ida</em>' containment reference.
	 * @see #getIda()
	 * @generated
	 */
	void setIda(InitialDataAnalysis value);

	/**
	 * Returns the value of the '<em><b>Eda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eda</em>' containment reference.
	 * @see #setEda(ExploratoryDataAnalysis)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getDataCurationStateTransitionAction_Eda()
	 * @model containment="true"
	 * @generated
	 */
	ExploratoryDataAnalysis getEda();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getEda <em>Eda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eda</em>' containment reference.
	 * @see #getEda()
	 * @generated
	 */
	void setEda(ExploratoryDataAnalysis value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link dataCurationStateTransitionAction.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getDataCurationStateTransitionAction_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link dataCurationStateTransitionAction.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getDataCurationStateTransitionAction_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Action To Take</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action To Take</em>' containment reference.
	 * @see #setActionToTake(Action)
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getDataCurationStateTransitionAction_ActionToTake()
	 * @model containment="true"
	 * @generated
	 */
	Action getActionToTake();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getActionToTake <em>Action To Take</em>}' containment reference.
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
	 * @see dataCurationStateTransitionAction.DataCurationStateTransitionActionPackage#getDataCurationStateTransitionAction_EventToTake()
	 * @model containment="true"
	 * @generated
	 */
	Event getEventToTake();

	/**
	 * Sets the value of the '{@link dataCurationStateTransitionAction.DataCurationStateTransitionAction#getEventToTake <em>Event To Take</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event To Take</em>' containment reference.
	 * @see #getEventToTake()
	 * @generated
	 */
	void setEventToTake(Event value);

} // DataCurationStateTransitionAction
