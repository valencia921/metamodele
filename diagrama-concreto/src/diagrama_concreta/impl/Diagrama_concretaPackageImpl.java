/**
 */
package diagrama_concreta.impl;

import diagrama_concreta.Diagrama_concretaFactory;
import diagrama_concreta.Diagrama_concretaPackage;
import diagrama_concreta.ModelFactory;
import diagrama_concreta.Multiplicidad;
import diagrama_concreta.TcdAgregacion;
import diagrama_concreta.TcdAsociacion;
import diagrama_concreta.TcdAtributo;
import diagrama_concreta.TcdClase;
import diagrama_concreta.TcdComposicion;
import diagrama_concreta.TcdDependencia;
import diagrama_concreta.TcdDiagramaClases;
import diagrama_concreta.TcdHerencia;
import diagrama_concreta.TcdMetodo;
import diagrama_concreta.TcdPaquete;
import diagrama_concreta.TcdParametro;
import diagrama_concreta.TcdRelacion;
import diagrama_concreta.TipoDato;
import diagrama_concreta.TipoRetorno;
import diagrama_concreta.Visibilidad;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Diagrama_concretaPackageImpl extends EPackageImpl implements Diagrama_concretaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdDiagramaClasesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdPaqueteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdClaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdRelacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdAsociacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdComposicionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdDependenciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdHerenciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdAgregacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdAtributoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdMetodoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdParametroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicidadEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoDatoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilidadEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoRetornoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see diagrama_concreta.Diagrama_concretaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Diagrama_concretaPackageImpl() {
		super(eNS_URI, Diagrama_concretaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Diagrama_concretaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Diagrama_concretaPackage init() {
		if (isInited) return (Diagrama_concretaPackage)EPackage.Registry.INSTANCE.getEPackage(Diagrama_concretaPackage.eNS_URI);

		// Obtain or create and register package
		Diagrama_concretaPackageImpl theDiagrama_concretaPackage = (Diagrama_concretaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Diagrama_concretaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Diagrama_concretaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDiagrama_concretaPackage.createPackageContents();

		// Initialize created meta-data
		theDiagrama_concretaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiagrama_concretaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Diagrama_concretaPackage.eNS_URI, theDiagrama_concretaPackage);
		return theDiagrama_concretaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcdDiagramaClases() {
		return tcdDiagramaClasesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTcdDiagramaClases_ListaClases() {
		return (EReference)tcdDiagramaClasesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTcdDiagramaClases_ListaRelaciones() {
		return (EReference)tcdDiagramaClasesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdDiagramaClases_Nombre() {
		return (EAttribute)tcdDiagramaClasesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactory() {
		return modelFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelFactory_Nombre() {
		return (EAttribute)modelFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelFactory_Ruta() {
		return (EAttribute)modelFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactory_ListaDiagramas() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcdPaquete() {
		return tcdPaqueteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTcdPaquete_ListaPaquetes() {
		return (EReference)tcdPaqueteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTcdPaquete_ListaClases() {
		return (EReference)tcdPaqueteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdPaquete_Nombre() {
		return (EAttribute)tcdPaqueteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdPaquete_Ruta() {
		return (EAttribute)tcdPaqueteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcdClase() {
		return tcdClaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTcdClase_ListaAtributos() {
		return (EReference)tcdClaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTcdClase_ListaMetodos() {
		return (EReference)tcdClaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdClase_Nombre() {
		return (EAttribute)tcdClaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdClase_Estereotipo() {
		return (EAttribute)tcdClaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdClase_ModificadorAcceso() {
		return (EAttribute)tcdClaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdClase_IsAbstract() {
		return (EAttribute)tcdClaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdClase_Documentacion() {
		return (EAttribute)tcdClaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcdRelacion() {
		return tcdRelacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTcdRelacion_Source() {
		return (EReference)tcdRelacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTcdRelacion_Target() {
		return (EReference)tcdRelacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdRelacion_Navegavilidad() {
		return (EAttribute)tcdRelacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcdAsociacion() {
		return tcdAsociacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdAsociacion_NombreOrigen() {
		return (EAttribute)tcdAsociacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdAsociacion_NombreDestino() {
		return (EAttribute)tcdAsociacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdAsociacion_MultiplicidadOrigen() {
		return (EAttribute)tcdAsociacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdAsociacion_MultiplicidadDestino() {
		return (EAttribute)tcdAsociacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcdComposicion() {
		return tcdComposicionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdComposicion_NombreOrigen() {
		return (EAttribute)tcdComposicionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdComposicion_NombreDestino() {
		return (EAttribute)tcdComposicionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdComposicion_MultiplicidadOrigen() {
		return (EAttribute)tcdComposicionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdComposicion_MultiplicidadDestino() {
		return (EAttribute)tcdComposicionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcdDependencia() {
		return tcdDependenciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdDependencia_NombreOrigen() {
		return (EAttribute)tcdDependenciaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdDependencia_NombreDestino() {
		return (EAttribute)tcdDependenciaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdDependencia_MultiplicidadOrigen() {
		return (EAttribute)tcdDependenciaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdDependencia_MultiplicidadDestino() {
		return (EAttribute)tcdDependenciaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcdHerencia() {
		return tcdHerenciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcdAgregacion() {
		return tcdAgregacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdAgregacion_NombreOrigen() {
		return (EAttribute)tcdAgregacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdAgregacion_NombreDestino() {
		return (EAttribute)tcdAgregacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdAgregacion_MultiplicidadOrigen() {
		return (EAttribute)tcdAgregacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdAgregacion_MultiplicidadDestino() {
		return (EAttribute)tcdAgregacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcdAtributo() {
		return tcdAtributoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdAtributo_Nombre() {
		return (EAttribute)tcdAtributoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdAtributo_TipoDato() {
		return (EAttribute)tcdAtributoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdAtributo_Visibilidad() {
		return (EAttribute)tcdAtributoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdAtributo_IsConstante() {
		return (EAttribute)tcdAtributoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdAtributo_IsStatic() {
		return (EAttribute)tcdAtributoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcdMetodo() {
		return tcdMetodoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTcdMetodo_ListaParametros() {
		return (EReference)tcdMetodoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdMetodo_Nombre() {
		return (EAttribute)tcdMetodoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdMetodo_ModificadorAcceso() {
		return (EAttribute)tcdMetodoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdMetodo_TipoRetorno() {
		return (EAttribute)tcdMetodoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdMetodo_Semantica() {
		return (EAttribute)tcdMetodoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcdParametro() {
		return tcdParametroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdParametro_Nombre() {
		return (EAttribute)tcdParametroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcdParametro_TipoDato() {
		return (EAttribute)tcdParametroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiplicidad() {
		return multiplicidadEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoDato() {
		return tipoDatoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilidad() {
		return visibilidadEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoRetorno() {
		return tipoRetornoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagrama_concretaFactory getDiagrama_concretaFactory() {
		return (Diagrama_concretaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tcdDiagramaClasesEClass = createEClass(TCD_DIAGRAMA_CLASES);
		createEReference(tcdDiagramaClasesEClass, TCD_DIAGRAMA_CLASES__LISTA_CLASES);
		createEReference(tcdDiagramaClasesEClass, TCD_DIAGRAMA_CLASES__LISTA_RELACIONES);
		createEAttribute(tcdDiagramaClasesEClass, TCD_DIAGRAMA_CLASES__NOMBRE);

		modelFactoryEClass = createEClass(MODEL_FACTORY);
		createEAttribute(modelFactoryEClass, MODEL_FACTORY__NOMBRE);
		createEAttribute(modelFactoryEClass, MODEL_FACTORY__RUTA);
		createEReference(modelFactoryEClass, MODEL_FACTORY__LISTA_DIAGRAMAS);

		tcdPaqueteEClass = createEClass(TCD_PAQUETE);
		createEReference(tcdPaqueteEClass, TCD_PAQUETE__LISTA_PAQUETES);
		createEReference(tcdPaqueteEClass, TCD_PAQUETE__LISTA_CLASES);
		createEAttribute(tcdPaqueteEClass, TCD_PAQUETE__NOMBRE);
		createEAttribute(tcdPaqueteEClass, TCD_PAQUETE__RUTA);

		tcdClaseEClass = createEClass(TCD_CLASE);
		createEReference(tcdClaseEClass, TCD_CLASE__LISTA_ATRIBUTOS);
		createEReference(tcdClaseEClass, TCD_CLASE__LISTA_METODOS);
		createEAttribute(tcdClaseEClass, TCD_CLASE__NOMBRE);
		createEAttribute(tcdClaseEClass, TCD_CLASE__ESTEREOTIPO);
		createEAttribute(tcdClaseEClass, TCD_CLASE__MODIFICADOR_ACCESO);
		createEAttribute(tcdClaseEClass, TCD_CLASE__IS_ABSTRACT);
		createEAttribute(tcdClaseEClass, TCD_CLASE__DOCUMENTACION);

		tcdRelacionEClass = createEClass(TCD_RELACION);
		createEReference(tcdRelacionEClass, TCD_RELACION__SOURCE);
		createEReference(tcdRelacionEClass, TCD_RELACION__TARGET);
		createEAttribute(tcdRelacionEClass, TCD_RELACION__NAVEGAVILIDAD);

		tcdAsociacionEClass = createEClass(TCD_ASOCIACION);
		createEAttribute(tcdAsociacionEClass, TCD_ASOCIACION__NOMBRE_ORIGEN);
		createEAttribute(tcdAsociacionEClass, TCD_ASOCIACION__NOMBRE_DESTINO);
		createEAttribute(tcdAsociacionEClass, TCD_ASOCIACION__MULTIPLICIDAD_ORIGEN);
		createEAttribute(tcdAsociacionEClass, TCD_ASOCIACION__MULTIPLICIDAD_DESTINO);

		tcdComposicionEClass = createEClass(TCD_COMPOSICION);
		createEAttribute(tcdComposicionEClass, TCD_COMPOSICION__NOMBRE_ORIGEN);
		createEAttribute(tcdComposicionEClass, TCD_COMPOSICION__NOMBRE_DESTINO);
		createEAttribute(tcdComposicionEClass, TCD_COMPOSICION__MULTIPLICIDAD_ORIGEN);
		createEAttribute(tcdComposicionEClass, TCD_COMPOSICION__MULTIPLICIDAD_DESTINO);

		tcdDependenciaEClass = createEClass(TCD_DEPENDENCIA);
		createEAttribute(tcdDependenciaEClass, TCD_DEPENDENCIA__NOMBRE_ORIGEN);
		createEAttribute(tcdDependenciaEClass, TCD_DEPENDENCIA__NOMBRE_DESTINO);
		createEAttribute(tcdDependenciaEClass, TCD_DEPENDENCIA__MULTIPLICIDAD_ORIGEN);
		createEAttribute(tcdDependenciaEClass, TCD_DEPENDENCIA__MULTIPLICIDAD_DESTINO);

		tcdHerenciaEClass = createEClass(TCD_HERENCIA);

		tcdAgregacionEClass = createEClass(TCD_AGREGACION);
		createEAttribute(tcdAgregacionEClass, TCD_AGREGACION__NOMBRE_ORIGEN);
		createEAttribute(tcdAgregacionEClass, TCD_AGREGACION__NOMBRE_DESTINO);
		createEAttribute(tcdAgregacionEClass, TCD_AGREGACION__MULTIPLICIDAD_ORIGEN);
		createEAttribute(tcdAgregacionEClass, TCD_AGREGACION__MULTIPLICIDAD_DESTINO);

		tcdAtributoEClass = createEClass(TCD_ATRIBUTO);
		createEAttribute(tcdAtributoEClass, TCD_ATRIBUTO__NOMBRE);
		createEAttribute(tcdAtributoEClass, TCD_ATRIBUTO__TIPO_DATO);
		createEAttribute(tcdAtributoEClass, TCD_ATRIBUTO__VISIBILIDAD);
		createEAttribute(tcdAtributoEClass, TCD_ATRIBUTO__IS_CONSTANTE);
		createEAttribute(tcdAtributoEClass, TCD_ATRIBUTO__IS_STATIC);

		tcdMetodoEClass = createEClass(TCD_METODO);
		createEReference(tcdMetodoEClass, TCD_METODO__LISTA_PARAMETROS);
		createEAttribute(tcdMetodoEClass, TCD_METODO__NOMBRE);
		createEAttribute(tcdMetodoEClass, TCD_METODO__MODIFICADOR_ACCESO);
		createEAttribute(tcdMetodoEClass, TCD_METODO__TIPO_RETORNO);
		createEAttribute(tcdMetodoEClass, TCD_METODO__SEMANTICA);

		tcdParametroEClass = createEClass(TCD_PARAMETRO);
		createEAttribute(tcdParametroEClass, TCD_PARAMETRO__NOMBRE);
		createEAttribute(tcdParametroEClass, TCD_PARAMETRO__TIPO_DATO);

		// Create enums
		multiplicidadEEnum = createEEnum(MULTIPLICIDAD);
		tipoDatoEEnum = createEEnum(TIPO_DATO);
		visibilidadEEnum = createEEnum(VISIBILIDAD);
		tipoRetornoEEnum = createEEnum(TIPO_RETORNO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tcdAsociacionEClass.getESuperTypes().add(this.getTcdRelacion());
		tcdComposicionEClass.getESuperTypes().add(this.getTcdRelacion());
		tcdDependenciaEClass.getESuperTypes().add(this.getTcdRelacion());
		tcdHerenciaEClass.getESuperTypes().add(this.getTcdRelacion());
		tcdAgregacionEClass.getESuperTypes().add(this.getTcdRelacion());

		// Initialize classes and features; add operations and parameters
		initEClass(tcdDiagramaClasesEClass, TcdDiagramaClases.class, "TcdDiagramaClases", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTcdDiagramaClases_ListaClases(), this.getTcdClase(), null, "listaClases", null, 0, -1, TcdDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTcdDiagramaClases_ListaRelaciones(), this.getTcdRelacion(), null, "listaRelaciones", null, 0, -1, TcdDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdDiagramaClases_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TcdDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelFactoryEClass, ModelFactory.class, "ModelFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelFactory_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelFactory_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactory_ListaDiagramas(), this.getTcdDiagramaClases(), null, "listaDiagramas", null, 0, -1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdPaqueteEClass, TcdPaquete.class, "TcdPaquete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTcdPaquete_ListaPaquetes(), this.getTcdPaquete(), null, "listaPaquetes", null, 0, -1, TcdPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTcdPaquete_ListaClases(), this.getTcdClase(), null, "listaClases", null, 0, -1, TcdPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdPaquete_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TcdPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdPaquete_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, TcdPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdClaseEClass, TcdClase.class, "TcdClase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTcdClase_ListaAtributos(), this.getTcdAtributo(), null, "listaAtributos", null, 0, -1, TcdClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTcdClase_ListaMetodos(), this.getTcdMetodo(), null, "listaMetodos", null, 0, -1, TcdClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdClase_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TcdClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdClase_Estereotipo(), ecorePackage.getEString(), "estereotipo", null, 0, 1, TcdClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdClase_ModificadorAcceso(), this.getVisibilidad(), "modificadorAcceso", null, 0, 1, TcdClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdClase_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, TcdClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdClase_Documentacion(), ecorePackage.getEString(), "documentacion", null, 0, 1, TcdClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdRelacionEClass, TcdRelacion.class, "TcdRelacion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTcdRelacion_Source(), this.getTcdClase(), null, "source", null, 0, 1, TcdRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTcdRelacion_Target(), this.getTcdClase(), null, "target", null, 0, 1, TcdRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdRelacion_Navegavilidad(), ecorePackage.getEString(), "navegavilidad", null, 0, 1, TcdRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdAsociacionEClass, TcdAsociacion.class, "TcdAsociacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTcdAsociacion_NombreOrigen(), ecorePackage.getEString(), "nombreOrigen", null, 0, 1, TcdAsociacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdAsociacion_NombreDestino(), ecorePackage.getEString(), "nombreDestino", null, 0, 1, TcdAsociacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdAsociacion_MultiplicidadOrigen(), this.getMultiplicidad(), "multiplicidadOrigen", null, 0, 1, TcdAsociacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdAsociacion_MultiplicidadDestino(), this.getMultiplicidad(), "multiplicidadDestino", null, 0, 1, TcdAsociacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdComposicionEClass, TcdComposicion.class, "TcdComposicion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTcdComposicion_NombreOrigen(), ecorePackage.getEString(), "nombreOrigen", null, 0, 1, TcdComposicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdComposicion_NombreDestino(), ecorePackage.getEString(), "nombreDestino", null, 0, 1, TcdComposicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdComposicion_MultiplicidadOrigen(), this.getMultiplicidad(), "multiplicidadOrigen", null, 0, 1, TcdComposicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdComposicion_MultiplicidadDestino(), this.getMultiplicidad(), "multiplicidadDestino", null, 0, 1, TcdComposicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdDependenciaEClass, TcdDependencia.class, "TcdDependencia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTcdDependencia_NombreOrigen(), ecorePackage.getEString(), "nombreOrigen", null, 0, 1, TcdDependencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdDependencia_NombreDestino(), ecorePackage.getEString(), "nombreDestino", null, 0, 1, TcdDependencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdDependencia_MultiplicidadOrigen(), this.getMultiplicidad(), "multiplicidadOrigen", null, 0, 1, TcdDependencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdDependencia_MultiplicidadDestino(), this.getMultiplicidad(), "multiplicidadDestino", null, 0, 1, TcdDependencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdHerenciaEClass, TcdHerencia.class, "TcdHerencia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tcdAgregacionEClass, TcdAgregacion.class, "TcdAgregacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTcdAgregacion_NombreOrigen(), ecorePackage.getEString(), "nombreOrigen", null, 0, 1, TcdAgregacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdAgregacion_NombreDestino(), ecorePackage.getEString(), "nombreDestino", null, 0, 1, TcdAgregacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdAgregacion_MultiplicidadOrigen(), this.getMultiplicidad(), "multiplicidadOrigen", null, 0, 1, TcdAgregacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdAgregacion_MultiplicidadDestino(), this.getMultiplicidad(), "multiplicidadDestino", null, 0, 1, TcdAgregacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdAtributoEClass, TcdAtributo.class, "TcdAtributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTcdAtributo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TcdAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdAtributo_TipoDato(), this.getTipoDato(), "tipoDato", null, 0, 1, TcdAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdAtributo_Visibilidad(), this.getVisibilidad(), "visibilidad", null, 0, 1, TcdAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdAtributo_IsConstante(), ecorePackage.getEBoolean(), "isConstante", null, 0, 1, TcdAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdAtributo_IsStatic(), ecorePackage.getEBoolean(), "isStatic", null, 0, 1, TcdAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdMetodoEClass, TcdMetodo.class, "TcdMetodo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTcdMetodo_ListaParametros(), this.getTcdParametro(), null, "listaParametros", null, 0, -1, TcdMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdMetodo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TcdMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdMetodo_ModificadorAcceso(), this.getVisibilidad(), "modificadorAcceso", null, 0, 1, TcdMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdMetodo_TipoRetorno(), this.getTipoRetorno(), "tipoRetorno", null, 0, 1, TcdMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdMetodo_Semantica(), ecorePackage.getEString(), "semantica", null, 0, 1, TcdMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdParametroEClass, TcdParametro.class, "TcdParametro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTcdParametro_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TcdParametro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcdParametro_TipoDato(), this.getTipoDato(), "tipoDato", null, 0, 1, TcdParametro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(multiplicidadEEnum, Multiplicidad.class, "Multiplicidad");
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad.UNO);
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad.UNO_CERO);
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad.CERO_VARIOS);
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad.UNO_VARIOS);

		initEEnum(tipoDatoEEnum, TipoDato.class, "TipoDato");
		addEEnumLiteral(tipoDatoEEnum, TipoDato.STRING);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.NUMBER);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.BOOLEAN);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.UNDEFINED);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.NULL);

		initEEnum(visibilidadEEnum, Visibilidad.class, "Visibilidad");
		addEEnumLiteral(visibilidadEEnum, Visibilidad.PUBLIC);
		addEEnumLiteral(visibilidadEEnum, Visibilidad.PRIVATE);
		addEEnumLiteral(visibilidadEEnum, Visibilidad.PROTECTED);

		initEEnum(tipoRetornoEEnum, TipoRetorno.class, "TipoRetorno");
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.STRING);
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.NUMBER);
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.BOOLEAN);
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.UNDEFINED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (tcdDiagramaClasesEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (tcdPaqueteEClass, 
		   source, 
		   new String[] {
			 "label", "nombre"
		   });	
		addAnnotation
		  (tcdClaseEClass, 
		   source, 
		   new String[] {
			 "label", "nombre"
		   });	
		addAnnotation
		  (tcdAtributoEClass, 
		   source, 
		   new String[] {
			 "label", "nombre"
		   });	
		addAnnotation
		  (tcdMetodoEClass, 
		   source, 
		   new String[] {
			 "label", "nombre"
		   });	
		addAnnotation
		  (tcdParametroEClass, 
		   source, 
		   new String[] {
			 "label", "nombre"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getTcdClase_ListaAtributos(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTcdClase_ListaMetodos(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (tcdRelacionEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "2"
		   });	
		addAnnotation
		  (tcdAsociacionEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "dot",
			 "width", "2"
		   });
	}

} //Diagrama_concretaPackageImpl
