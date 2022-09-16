/**
 */
package diagrama_concreta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see diagrama_concreta.Diagrama_concretaPackage
 * @generated
 */
public interface Diagrama_concretaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Diagrama_concretaFactory eINSTANCE = diagrama_concreta.impl.Diagrama_concretaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TCD Diagrama Clases</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCD Diagrama Clases</em>'.
	 * @generated
	 */
	TCDDiagramaClases createTCDDiagramaClases();

	/**
	 * Returns a new object of class '<em>Model Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Factory</em>'.
	 * @generated
	 */
	ModelFactory createModelFactory();

	/**
	 * Returns a new object of class '<em>TCD Paquete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCD Paquete</em>'.
	 * @generated
	 */
	TCDPaquete createTCDPaquete();

	/**
	 * Returns a new object of class '<em>TCD Clase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCD Clase</em>'.
	 * @generated
	 */
	TCDClase createTCDClase();

	/**
	 * Returns a new object of class '<em>TCD Agregacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCD Agregacion</em>'.
	 * @generated
	 */
	TCDAgregacion createTCDAgregacion();

	/**
	 * Returns a new object of class '<em>TCD Asociacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCD Asociacion</em>'.
	 * @generated
	 */
	TCDAsociacion createTCDAsociacion();

	/**
	 * Returns a new object of class '<em>TCD Composicion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCD Composicion</em>'.
	 * @generated
	 */
	TCDComposicion createTCDComposicion();

	/**
	 * Returns a new object of class '<em>TCD Dependencia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCD Dependencia</em>'.
	 * @generated
	 */
	TCDDependencia createTCDDependencia();

	/**
	 * Returns a new object of class '<em>TCD Herencia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCD Herencia</em>'.
	 * @generated
	 */
	TCDHerencia createTCDHerencia();

	/**
	 * Returns a new object of class '<em>TCD Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCD Atributo</em>'.
	 * @generated
	 */
	TCDAtributo createTCDAtributo();

	/**
	 * Returns a new object of class '<em>TCD Metodo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCD Metodo</em>'.
	 * @generated
	 */
	TCDMetodo createTCDMetodo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Diagrama_concretaPackage getDiagrama_concretaPackage();

} //Diagrama_concretaFactory
