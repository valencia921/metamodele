/**
 */
package abstracta.util;

import abstracta.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see abstracta.AbstractaPackage
 * @generated
 */
public class AbstractaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstractaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AbstractaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractaSwitch<Adapter> modelSwitch =
		new AbstractaSwitch<Adapter>() {
			@Override
			public Adapter caseTcdPaquete(TcdPaquete object) {
				return createTcdPaqueteAdapter();
			}
			@Override
			public Adapter caseTcdClase(TcdClase object) {
				return createTcdClaseAdapter();
			}
			@Override
			public Adapter caseTcdAtributo(TcdAtributo object) {
				return createTcdAtributoAdapter();
			}
			@Override
			public Adapter caseTcdMetodo(TcdMetodo object) {
				return createTcdMetodoAdapter();
			}
			@Override
			public Adapter caseTcdRelacion(TcdRelacion object) {
				return createTcdRelacionAdapter();
			}
			@Override
			public Adapter caseTcdAsociacion(TcdAsociacion object) {
				return createTcdAsociacionAdapter();
			}
			@Override
			public Adapter caseTcdComposicion(TcdComposicion object) {
				return createTcdComposicionAdapter();
			}
			@Override
			public Adapter caseTcdDependencia(TcdDependencia object) {
				return createTcdDependenciaAdapter();
			}
			@Override
			public Adapter caseTcdHerencia(TcdHerencia object) {
				return createTcdHerenciaAdapter();
			}
			@Override
			public Adapter caseTcdAgregacion(TcdAgregacion object) {
				return createTcdAgregacionAdapter();
			}
			@Override
			public Adapter caseTcdParametro(TcdParametro object) {
				return createTcdParametroAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TcdPaquete <em>Tcd Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TcdPaquete
	 * @generated
	 */
	public Adapter createTcdPaqueteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TcdClase <em>Tcd Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TcdClase
	 * @generated
	 */
	public Adapter createTcdClaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TcdAtributo <em>Tcd Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TcdAtributo
	 * @generated
	 */
	public Adapter createTcdAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TcdMetodo <em>Tcd Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TcdMetodo
	 * @generated
	 */
	public Adapter createTcdMetodoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TcdRelacion <em>Tcd Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TcdRelacion
	 * @generated
	 */
	public Adapter createTcdRelacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TcdAsociacion <em>Tcd Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TcdAsociacion
	 * @generated
	 */
	public Adapter createTcdAsociacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TcdComposicion <em>Tcd Composicion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TcdComposicion
	 * @generated
	 */
	public Adapter createTcdComposicionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TcdDependencia <em>Tcd Dependencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TcdDependencia
	 * @generated
	 */
	public Adapter createTcdDependenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TcdHerencia <em>Tcd Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TcdHerencia
	 * @generated
	 */
	public Adapter createTcdHerenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TcdAgregacion <em>Tcd Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TcdAgregacion
	 * @generated
	 */
	public Adapter createTcdAgregacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TcdParametro <em>Tcd Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TcdParametro
	 * @generated
	 */
	public Adapter createTcdParametroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AbstractaAdapterFactory
