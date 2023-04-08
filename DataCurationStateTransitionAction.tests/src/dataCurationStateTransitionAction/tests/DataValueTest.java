/**
 */
package dataCurationStateTransitionAction.tests;

import dataCurationStateTransitionAction.DataCurationStateTransitionActionFactory;
import dataCurationStateTransitionAction.DataValue;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataValueTest extends TestCase {

	/**
	 * The fixture for this Data Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataValue fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataValueTest.class);
	}

	/**
	 * Constructs a new Data Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValueTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Data Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DataValue fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Data Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataValue getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataCurationStateTransitionActionFactory.eINSTANCE.createDataValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DataValueTest
