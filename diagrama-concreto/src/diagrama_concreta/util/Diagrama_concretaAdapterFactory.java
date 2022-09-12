/**
 */
package diagrama_concreta.util;

import diagrama_concreta.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see diagrama_concreta.Diagrama_concretaPackage
 * @generated
 */
public class Diagrama_concretaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Diagrama_concretaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagrama_concretaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Diagrama_concretaPackage.eINSTANCE;
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
	protected Diagrama_concretaSwitch<Adapter> modelSwitch =
		new Diagrama_concretaSwitch<Adapter>() {
			@Override
			public Adapter caseTcdDiagramaClases(TcdDiagramaClases object) {
				return createTcdDiagramaClasesAdapter();
			}
			@Override
			public Adapter caseModelFactory(ModelFactory object) {
				return createModelFactoryAdapter();
			}
			@Override
			public Adapter caseTcdPaquete(TcdPaquete object) {
				return createTcdPaqueteAdapter();
			}
			@Override
			public Adapter caseTcdClase(TcdClase object) {
				return createTcdClaseAdapter();
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
			public Adapter caseTcdAtributo(TcdAtributo object) {
				return createTcdAtributoAdapter();
			}
			@Override
			public Adapter caseTcdMetodo(TcdMetodo object) {
				return createTcdMetodoAdapter();
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
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TcdDiagramaClases <em>Tcd Diagrama Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TcdDiagramaClases
	 * @generated
	 */
	public Adapter createTcdDiagramaClasesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.ModelFactory
	 * @generated
	 */
	public Adapter createModelFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TcdPaquete <em>Tcd Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TcdPaquete
	 * @generated
	 */
	public Adapter createTcdPaqueteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TcdClase <em>Tcd Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TcdClase
	 * @generated
	 */
	public Adapter createTcdClaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TcdRelacion <em>Tcd Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TcdRelacion
	 * @generated
	 */
	public Adapter createTcdRelacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TcdAsociacion <em>Tcd Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TcdAsociacion
	 * @generated
	 */
	public Adapter createTcdAsociacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TcdComposicion <em>Tcd Composicion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TcdComposicion
	 * @generated
	 */
	public Adapter createTcdComposicionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TcdDependencia <em>Tcd Dependencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TcdDependencia
	 * @generated
	 */
	public Adapter createTcdDependenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TcdHerencia <em>Tcd Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TcdHerencia
	 * @generated
	 */
	public Adapter createTcdHerenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TcdAgregacion <em>Tcd Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TcdAgregacion
	 * @generated
	 */
	public Adapter createTcdAgregacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TcdAtributo <em>Tcd Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TcdAtributo
	 * @generated
	 */
	public Adapter createTcdAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TcdMetodo <em>Tcd Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TcdMetodo
	 * @generated
	 */
	public Adapter createTcdMetodoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TcdParametro <em>Tcd Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TcdParametro
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

} //Diagrama_concretaAdapterFactory
