/**
 */
package diagrama_concreta.tests;

import diagrama_concreta.Diagrama_concretaFactory;
import diagrama_concreta.TcdDependencia;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tcd Dependencia</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TcdDependenciaTest extends TcdRelacionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TcdDependenciaTest.class);
	}

	/**
	 * Constructs a new Tcd Dependencia test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcdDependenciaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tcd Dependencia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TcdDependencia getFixture() {
		return (TcdDependencia)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Diagrama_concretaFactory.eINSTANCE.createTcdDependencia());
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

} //TcdDependenciaTest
