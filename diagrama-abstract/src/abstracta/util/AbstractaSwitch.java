/**
 */
package abstracta.util;

import abstracta.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see abstracta.AbstractaPackage
 * @generated
 */
public class AbstractaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstractaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractaSwitch() {
		if (modelPackage == null) {
			modelPackage = AbstractaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AbstractaPackage.TCD_PAQUETE: {
				TcdPaquete tcdPaquete = (TcdPaquete)theEObject;
				T result = caseTcdPaquete(tcdPaquete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_CLASE: {
				TcdClase tcdClase = (TcdClase)theEObject;
				T result = caseTcdClase(tcdClase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_ATRIBUTO: {
				TcdAtributo tcdAtributo = (TcdAtributo)theEObject;
				T result = caseTcdAtributo(tcdAtributo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_METODO: {
				TcdMetodo tcdMetodo = (TcdMetodo)theEObject;
				T result = caseTcdMetodo(tcdMetodo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_RELACION: {
				TcdRelacion tcdRelacion = (TcdRelacion)theEObject;
				T result = caseTcdRelacion(tcdRelacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_ASOCIACION: {
				TcdAsociacion tcdAsociacion = (TcdAsociacion)theEObject;
				T result = caseTcdAsociacion(tcdAsociacion);
				if (result == null) result = caseTcdRelacion(tcdAsociacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_COMPOSICION: {
				TcdComposicion tcdComposicion = (TcdComposicion)theEObject;
				T result = caseTcdComposicion(tcdComposicion);
				if (result == null) result = caseTcdRelacion(tcdComposicion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_DEPENDENCIA: {
				TcdDependencia tcdDependencia = (TcdDependencia)theEObject;
				T result = caseTcdDependencia(tcdDependencia);
				if (result == null) result = caseTcdRelacion(tcdDependencia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_HERENCIA: {
				TcdHerencia tcdHerencia = (TcdHerencia)theEObject;
				T result = caseTcdHerencia(tcdHerencia);
				if (result == null) result = caseTcdRelacion(tcdHerencia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_AGREGACION: {
				TcdAgregacion tcdAgregacion = (TcdAgregacion)theEObject;
				T result = caseTcdAgregacion(tcdAgregacion);
				if (result == null) result = caseTcdRelacion(tcdAgregacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_PARAMETRO: {
				TcdParametro tcdParametro = (TcdParametro)theEObject;
				T result = caseTcdParametro(tcdParametro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tcd Paquete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tcd Paquete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTcdPaquete(TcdPaquete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tcd Clase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tcd Clase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTcdClase(TcdClase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tcd Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tcd Atributo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTcdAtributo(TcdAtributo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tcd Metodo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tcd Metodo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTcdMetodo(TcdMetodo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tcd Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tcd Relacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTcdRelacion(TcdRelacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tcd Asociacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tcd Asociacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTcdAsociacion(TcdAsociacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tcd Composicion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tcd Composicion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTcdComposicion(TcdComposicion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tcd Dependencia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tcd Dependencia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTcdDependencia(TcdDependencia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tcd Herencia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tcd Herencia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTcdHerencia(TcdHerencia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tcd Agregacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tcd Agregacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTcdAgregacion(TcdAgregacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tcd Parametro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tcd Parametro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTcdParametro(TcdParametro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AbstractaSwitch
