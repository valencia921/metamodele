/**
 */
package abstracta.tests;

import abstracta.AbstractaFactory;
import abstracta.TcdComposicion;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tcd Composicion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TcdComposicionTest extends TcdRelacionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TcdComposicionTest.class);
	}

	/**
	 * Constructs a new Tcd Composicion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcdComposicionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tcd Composicion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TcdComposicion getFixture() {
		return (TcdComposicion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AbstractaFactory.eINSTANCE.createTcdComposicion());
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

} //TcdComposicionTest
