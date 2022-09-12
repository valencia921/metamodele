/**
 */
package abstracta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see abstracta.AbstractaPackage
 * @generated
 */
public interface AbstractaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractaFactory eINSTANCE = abstracta.impl.AbstractaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tcd Paquete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tcd Paquete</em>'.
	 * @generated
	 */
	TcdPaquete createTcdPaquete();

	/**
	 * Returns a new object of class '<em>Tcd Clase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tcd Clase</em>'.
	 * @generated
	 */
	TcdClase createTcdClase();

	/**
	 * Returns a new object of class '<em>Tcd Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tcd Atributo</em>'.
	 * @generated
	 */
	TcdAtributo createTcdAtributo();

	/**
	 * Returns a new object of class '<em>Tcd Metodo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tcd Metodo</em>'.
	 * @generated
	 */
	TcdMetodo createTcdMetodo();

	/**
	 * Returns a new object of class '<em>Tcd Asociacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tcd Asociacion</em>'.
	 * @generated
	 */
	TcdAsociacion createTcdAsociacion();

	/**
	 * Returns a new object of class '<em>Tcd Composicion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tcd Composicion</em>'.
	 * @generated
	 */
	TcdComposicion createTcdComposicion();

	/**
	 * Returns a new object of class '<em>Tcd Dependencia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tcd Dependencia</em>'.
	 * @generated
	 */
	TcdDependencia createTcdDependencia();

	/**
	 * Returns a new object of class '<em>Tcd Herencia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tcd Herencia</em>'.
	 * @generated
	 */
	TcdHerencia createTcdHerencia();

	/**
	 * Returns a new object of class '<em>Tcd Agregacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tcd Agregacion</em>'.
	 * @generated
	 */
	TcdAgregacion createTcdAgregacion();

	/**
	 * Returns a new object of class '<em>Tcd Parametro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tcd Parametro</em>'.
	 * @generated
	 */
	TcdParametro createTcdParametro();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AbstractaPackage getAbstractaPackage();

} //AbstractaFactory
