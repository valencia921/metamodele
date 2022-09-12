/**
 */
package diagrama_concreta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see diagrama_concreta.Diagrama_concretaFactory
 * @model kind="package"
 * @generated
 */
public interface Diagrama_concretaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diagrama_concreta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "diagrama_concreta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diagrama_concreta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Diagrama_concretaPackage eINSTANCE = diagrama_concreta.impl.Diagrama_concretaPackageImpl.init();

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.TcdDiagramaClasesImpl <em>Tcd Diagrama Clases</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TcdDiagramaClasesImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdDiagramaClases()
	 * @generated
	 */
	int TCD_DIAGRAMA_CLASES = 0;

	/**
	 * The feature id for the '<em><b>Lista Clases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DIAGRAMA_CLASES__LISTA_CLASES = 0;

	/**
	 * The feature id for the '<em><b>Lista Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DIAGRAMA_CLASES__LISTA_RELACIONES = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DIAGRAMA_CLASES__NOMBRE = 2;

	/**
	 * The number of structural features of the '<em>Tcd Diagrama Clases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DIAGRAMA_CLASES_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.ModelFactoryImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__RUTA = 1;

	/**
	 * The feature id for the '<em><b>Lista Diagramas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LISTA_DIAGRAMAS = 2;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.TcdPaqueteImpl <em>Tcd Paquete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TcdPaqueteImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdPaquete()
	 * @generated
	 */
	int TCD_PAQUETE = 2;

	/**
	 * The feature id for the '<em><b>Lista Paquetes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PAQUETE__LISTA_PAQUETES = 0;

	/**
	 * The feature id for the '<em><b>Lista Clases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PAQUETE__LISTA_CLASES = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PAQUETE__NOMBRE = 2;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PAQUETE__RUTA = 3;

	/**
	 * The number of structural features of the '<em>Tcd Paquete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PAQUETE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.TcdClaseImpl <em>Tcd Clase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TcdClaseImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdClase()
	 * @generated
	 */
	int TCD_CLASE = 3;

	/**
	 * The feature id for the '<em><b>Lista Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__LISTA_ATRIBUTOS = 0;

	/**
	 * The feature id for the '<em><b>Lista Metodos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__LISTA_METODOS = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__NOMBRE = 2;

	/**
	 * The feature id for the '<em><b>Estereotipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__ESTEREOTIPO = 3;

	/**
	 * The feature id for the '<em><b>Modificador Acceso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__MODIFICADOR_ACCESO = 4;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__IS_ABSTRACT = 5;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__DOCUMENTACION = 6;

	/**
	 * The number of structural features of the '<em>Tcd Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.TcdRelacionImpl <em>Tcd Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TcdRelacionImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdRelacion()
	 * @generated
	 */
	int TCD_RELACION = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_RELACION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_RELACION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Navegavilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_RELACION__NAVEGAVILIDAD = 2;

	/**
	 * The number of structural features of the '<em>Tcd Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_RELACION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.TcdAsociacionImpl <em>Tcd Asociacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TcdAsociacionImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdAsociacion()
	 * @generated
	 */
	int TCD_ASOCIACION = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ASOCIACION__SOURCE = TCD_RELACION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ASOCIACION__TARGET = TCD_RELACION__TARGET;

	/**
	 * The feature id for the '<em><b>Navegavilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ASOCIACION__NAVEGAVILIDAD = TCD_RELACION__NAVEGAVILIDAD;

	/**
	 * The feature id for the '<em><b>Nombre Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ASOCIACION__NOMBRE_ORIGEN = TCD_RELACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ASOCIACION__NOMBRE_DESTINO = TCD_RELACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicidad Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ASOCIACION__MULTIPLICIDAD_ORIGEN = TCD_RELACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multiplicidad Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ASOCIACION__MULTIPLICIDAD_DESTINO = TCD_RELACION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tcd Asociacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ASOCIACION_FEATURE_COUNT = TCD_RELACION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.TcdComposicionImpl <em>Tcd Composicion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TcdComposicionImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdComposicion()
	 * @generated
	 */
	int TCD_COMPOSICION = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_COMPOSICION__SOURCE = TCD_RELACION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_COMPOSICION__TARGET = TCD_RELACION__TARGET;

	/**
	 * The feature id for the '<em><b>Navegavilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_COMPOSICION__NAVEGAVILIDAD = TCD_RELACION__NAVEGAVILIDAD;

	/**
	 * The feature id for the '<em><b>Nombre Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_COMPOSICION__NOMBRE_ORIGEN = TCD_RELACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_COMPOSICION__NOMBRE_DESTINO = TCD_RELACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicidad Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_COMPOSICION__MULTIPLICIDAD_ORIGEN = TCD_RELACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multiplicidad Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_COMPOSICION__MULTIPLICIDAD_DESTINO = TCD_RELACION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tcd Composicion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_COMPOSICION_FEATURE_COUNT = TCD_RELACION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.TcdDependenciaImpl <em>Tcd Dependencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TcdDependenciaImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdDependencia()
	 * @generated
	 */
	int TCD_DEPENDENCIA = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DEPENDENCIA__SOURCE = TCD_RELACION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DEPENDENCIA__TARGET = TCD_RELACION__TARGET;

	/**
	 * The feature id for the '<em><b>Navegavilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DEPENDENCIA__NAVEGAVILIDAD = TCD_RELACION__NAVEGAVILIDAD;

	/**
	 * The feature id for the '<em><b>Nombre Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DEPENDENCIA__NOMBRE_ORIGEN = TCD_RELACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DEPENDENCIA__NOMBRE_DESTINO = TCD_RELACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicidad Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DEPENDENCIA__MULTIPLICIDAD_ORIGEN = TCD_RELACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multiplicidad Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DEPENDENCIA__MULTIPLICIDAD_DESTINO = TCD_RELACION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tcd Dependencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DEPENDENCIA_FEATURE_COUNT = TCD_RELACION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.TcdHerenciaImpl <em>Tcd Herencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TcdHerenciaImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdHerencia()
	 * @generated
	 */
	int TCD_HERENCIA = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_HERENCIA__SOURCE = TCD_RELACION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_HERENCIA__TARGET = TCD_RELACION__TARGET;

	/**
	 * The feature id for the '<em><b>Navegavilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_HERENCIA__NAVEGAVILIDAD = TCD_RELACION__NAVEGAVILIDAD;

	/**
	 * The number of structural features of the '<em>Tcd Herencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_HERENCIA_FEATURE_COUNT = TCD_RELACION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.TcdAgregacionImpl <em>Tcd Agregacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TcdAgregacionImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdAgregacion()
	 * @generated
	 */
	int TCD_AGREGACION = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_AGREGACION__SOURCE = TCD_RELACION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_AGREGACION__TARGET = TCD_RELACION__TARGET;

	/**
	 * The feature id for the '<em><b>Navegavilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_AGREGACION__NAVEGAVILIDAD = TCD_RELACION__NAVEGAVILIDAD;

	/**
	 * The feature id for the '<em><b>Nombre Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_AGREGACION__NOMBRE_ORIGEN = TCD_RELACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_AGREGACION__NOMBRE_DESTINO = TCD_RELACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicidad Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_AGREGACION__MULTIPLICIDAD_ORIGEN = TCD_RELACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multiplicidad Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_AGREGACION__MULTIPLICIDAD_DESTINO = TCD_RELACION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tcd Agregacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_AGREGACION_FEATURE_COUNT = TCD_RELACION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.TcdAtributoImpl <em>Tcd Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TcdAtributoImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdAtributo()
	 * @generated
	 */
	int TCD_ATRIBUTO = 10;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ATRIBUTO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ATRIBUTO__TIPO_DATO = 1;

	/**
	 * The feature id for the '<em><b>Visibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ATRIBUTO__VISIBILIDAD = 2;

	/**
	 * The feature id for the '<em><b>Is Constante</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ATRIBUTO__IS_CONSTANTE = 3;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ATRIBUTO__IS_STATIC = 4;

	/**
	 * The number of structural features of the '<em>Tcd Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ATRIBUTO_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.TcdMetodoImpl <em>Tcd Metodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TcdMetodoImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdMetodo()
	 * @generated
	 */
	int TCD_METODO = 11;

	/**
	 * The feature id for the '<em><b>Lista Parametros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_METODO__LISTA_PARAMETROS = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_METODO__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Modificador Acceso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_METODO__MODIFICADOR_ACCESO = 2;

	/**
	 * The feature id for the '<em><b>Tipo Retorno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_METODO__TIPO_RETORNO = 3;

	/**
	 * The feature id for the '<em><b>Semantica</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_METODO__SEMANTICA = 4;

	/**
	 * The number of structural features of the '<em>Tcd Metodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_METODO_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.TcdParametroImpl <em>Tcd Parametro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TcdParametroImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdParametro()
	 * @generated
	 */
	int TCD_PARAMETRO = 12;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PARAMETRO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PARAMETRO__TIPO_DATO = 1;

	/**
	 * The number of structural features of the '<em>Tcd Parametro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PARAMETRO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link diagrama_concreta.Multiplicidad <em>Multiplicidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.Multiplicidad
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getMultiplicidad()
	 * @generated
	 */
	int MULTIPLICIDAD = 13;

	/**
	 * The meta object id for the '{@link diagrama_concreta.TipoDato <em>Tipo Dato</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.TipoDato
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTipoDato()
	 * @generated
	 */
	int TIPO_DATO = 14;

	/**
	 * The meta object id for the '{@link diagrama_concreta.Visibilidad <em>Visibilidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.Visibilidad
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getVisibilidad()
	 * @generated
	 */
	int VISIBILIDAD = 15;

	/**
	 * The meta object id for the '{@link diagrama_concreta.TipoRetorno <em>Tipo Retorno</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.TipoRetorno
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTipoRetorno()
	 * @generated
	 */
	int TIPO_RETORNO = 16;


	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TcdDiagramaClases <em>Tcd Diagrama Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Diagrama Clases</em>'.
	 * @see diagrama_concreta.TcdDiagramaClases
	 * @generated
	 */
	EClass getTcdDiagramaClases();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama_concreta.TcdDiagramaClases#getListaClases <em>Lista Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Clases</em>'.
	 * @see diagrama_concreta.TcdDiagramaClases#getListaClases()
	 * @see #getTcdDiagramaClases()
	 * @generated
	 */
	EReference getTcdDiagramaClases_ListaClases();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama_concreta.TcdDiagramaClases#getListaRelaciones <em>Lista Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Relaciones</em>'.
	 * @see diagrama_concreta.TcdDiagramaClases#getListaRelaciones()
	 * @see #getTcdDiagramaClases()
	 * @generated
	 */
	EReference getTcdDiagramaClases_ListaRelaciones();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdDiagramaClases#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagrama_concreta.TcdDiagramaClases#getNombre()
	 * @see #getTcdDiagramaClases()
	 * @generated
	 */
	EAttribute getTcdDiagramaClases_Nombre();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see diagrama_concreta.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.ModelFactory#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagrama_concreta.ModelFactory#getNombre()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.ModelFactory#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see diagrama_concreta.ModelFactory#getRuta()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Ruta();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama_concreta.ModelFactory#getListaDiagramas <em>Lista Diagramas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Diagramas</em>'.
	 * @see diagrama_concreta.ModelFactory#getListaDiagramas()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListaDiagramas();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TcdPaquete <em>Tcd Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Paquete</em>'.
	 * @see diagrama_concreta.TcdPaquete
	 * @generated
	 */
	EClass getTcdPaquete();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama_concreta.TcdPaquete#getListaPaquetes <em>Lista Paquetes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Paquetes</em>'.
	 * @see diagrama_concreta.TcdPaquete#getListaPaquetes()
	 * @see #getTcdPaquete()
	 * @generated
	 */
	EReference getTcdPaquete_ListaPaquetes();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama_concreta.TcdPaquete#getListaClases <em>Lista Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Clases</em>'.
	 * @see diagrama_concreta.TcdPaquete#getListaClases()
	 * @see #getTcdPaquete()
	 * @generated
	 */
	EReference getTcdPaquete_ListaClases();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdPaquete#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagrama_concreta.TcdPaquete#getNombre()
	 * @see #getTcdPaquete()
	 * @generated
	 */
	EAttribute getTcdPaquete_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdPaquete#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see diagrama_concreta.TcdPaquete#getRuta()
	 * @see #getTcdPaquete()
	 * @generated
	 */
	EAttribute getTcdPaquete_Ruta();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TcdClase <em>Tcd Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Clase</em>'.
	 * @see diagrama_concreta.TcdClase
	 * @generated
	 */
	EClass getTcdClase();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama_concreta.TcdClase#getListaAtributos <em>Lista Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Atributos</em>'.
	 * @see diagrama_concreta.TcdClase#getListaAtributos()
	 * @see #getTcdClase()
	 * @generated
	 */
	EReference getTcdClase_ListaAtributos();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama_concreta.TcdClase#getListaMetodos <em>Lista Metodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Metodos</em>'.
	 * @see diagrama_concreta.TcdClase#getListaMetodos()
	 * @see #getTcdClase()
	 * @generated
	 */
	EReference getTcdClase_ListaMetodos();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdClase#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagrama_concreta.TcdClase#getNombre()
	 * @see #getTcdClase()
	 * @generated
	 */
	EAttribute getTcdClase_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdClase#getEstereotipo <em>Estereotipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estereotipo</em>'.
	 * @see diagrama_concreta.TcdClase#getEstereotipo()
	 * @see #getTcdClase()
	 * @generated
	 */
	EAttribute getTcdClase_Estereotipo();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdClase#getModificadorAcceso <em>Modificador Acceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modificador Acceso</em>'.
	 * @see diagrama_concreta.TcdClase#getModificadorAcceso()
	 * @see #getTcdClase()
	 * @generated
	 */
	EAttribute getTcdClase_ModificadorAcceso();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdClase#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see diagrama_concreta.TcdClase#isIsAbstract()
	 * @see #getTcdClase()
	 * @generated
	 */
	EAttribute getTcdClase_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdClase#getDocumentacion <em>Documentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentacion</em>'.
	 * @see diagrama_concreta.TcdClase#getDocumentacion()
	 * @see #getTcdClase()
	 * @generated
	 */
	EAttribute getTcdClase_Documentacion();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TcdRelacion <em>Tcd Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Relacion</em>'.
	 * @see diagrama_concreta.TcdRelacion
	 * @generated
	 */
	EClass getTcdRelacion();

	/**
	 * Returns the meta object for the reference '{@link diagrama_concreta.TcdRelacion#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see diagrama_concreta.TcdRelacion#getSource()
	 * @see #getTcdRelacion()
	 * @generated
	 */
	EReference getTcdRelacion_Source();

	/**
	 * Returns the meta object for the reference '{@link diagrama_concreta.TcdRelacion#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see diagrama_concreta.TcdRelacion#getTarget()
	 * @see #getTcdRelacion()
	 * @generated
	 */
	EReference getTcdRelacion_Target();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdRelacion#getNavegavilidad <em>Navegavilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegavilidad</em>'.
	 * @see diagrama_concreta.TcdRelacion#getNavegavilidad()
	 * @see #getTcdRelacion()
	 * @generated
	 */
	EAttribute getTcdRelacion_Navegavilidad();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TcdAsociacion <em>Tcd Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Asociacion</em>'.
	 * @see diagrama_concreta.TcdAsociacion
	 * @generated
	 */
	EClass getTcdAsociacion();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdAsociacion#getNombreOrigen <em>Nombre Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Origen</em>'.
	 * @see diagrama_concreta.TcdAsociacion#getNombreOrigen()
	 * @see #getTcdAsociacion()
	 * @generated
	 */
	EAttribute getTcdAsociacion_NombreOrigen();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdAsociacion#getNombreDestino <em>Nombre Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Destino</em>'.
	 * @see diagrama_concreta.TcdAsociacion#getNombreDestino()
	 * @see #getTcdAsociacion()
	 * @generated
	 */
	EAttribute getTcdAsociacion_NombreDestino();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdAsociacion#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Origen</em>'.
	 * @see diagrama_concreta.TcdAsociacion#getMultiplicidadOrigen()
	 * @see #getTcdAsociacion()
	 * @generated
	 */
	EAttribute getTcdAsociacion_MultiplicidadOrigen();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdAsociacion#getMultiplicidadDestino <em>Multiplicidad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Destino</em>'.
	 * @see diagrama_concreta.TcdAsociacion#getMultiplicidadDestino()
	 * @see #getTcdAsociacion()
	 * @generated
	 */
	EAttribute getTcdAsociacion_MultiplicidadDestino();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TcdComposicion <em>Tcd Composicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Composicion</em>'.
	 * @see diagrama_concreta.TcdComposicion
	 * @generated
	 */
	EClass getTcdComposicion();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdComposicion#getNombreOrigen <em>Nombre Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Origen</em>'.
	 * @see diagrama_concreta.TcdComposicion#getNombreOrigen()
	 * @see #getTcdComposicion()
	 * @generated
	 */
	EAttribute getTcdComposicion_NombreOrigen();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdComposicion#getNombreDestino <em>Nombre Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Destino</em>'.
	 * @see diagrama_concreta.TcdComposicion#getNombreDestino()
	 * @see #getTcdComposicion()
	 * @generated
	 */
	EAttribute getTcdComposicion_NombreDestino();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdComposicion#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Origen</em>'.
	 * @see diagrama_concreta.TcdComposicion#getMultiplicidadOrigen()
	 * @see #getTcdComposicion()
	 * @generated
	 */
	EAttribute getTcdComposicion_MultiplicidadOrigen();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdComposicion#getMultiplicidadDestino <em>Multiplicidad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Destino</em>'.
	 * @see diagrama_concreta.TcdComposicion#getMultiplicidadDestino()
	 * @see #getTcdComposicion()
	 * @generated
	 */
	EAttribute getTcdComposicion_MultiplicidadDestino();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TcdDependencia <em>Tcd Dependencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Dependencia</em>'.
	 * @see diagrama_concreta.TcdDependencia
	 * @generated
	 */
	EClass getTcdDependencia();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdDependencia#getNombreOrigen <em>Nombre Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Origen</em>'.
	 * @see diagrama_concreta.TcdDependencia#getNombreOrigen()
	 * @see #getTcdDependencia()
	 * @generated
	 */
	EAttribute getTcdDependencia_NombreOrigen();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdDependencia#getNombreDestino <em>Nombre Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Destino</em>'.
	 * @see diagrama_concreta.TcdDependencia#getNombreDestino()
	 * @see #getTcdDependencia()
	 * @generated
	 */
	EAttribute getTcdDependencia_NombreDestino();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdDependencia#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Origen</em>'.
	 * @see diagrama_concreta.TcdDependencia#getMultiplicidadOrigen()
	 * @see #getTcdDependencia()
	 * @generated
	 */
	EAttribute getTcdDependencia_MultiplicidadOrigen();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdDependencia#getMultiplicidadDestino <em>Multiplicidad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Destino</em>'.
	 * @see diagrama_concreta.TcdDependencia#getMultiplicidadDestino()
	 * @see #getTcdDependencia()
	 * @generated
	 */
	EAttribute getTcdDependencia_MultiplicidadDestino();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TcdHerencia <em>Tcd Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Herencia</em>'.
	 * @see diagrama_concreta.TcdHerencia
	 * @generated
	 */
	EClass getTcdHerencia();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TcdAgregacion <em>Tcd Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Agregacion</em>'.
	 * @see diagrama_concreta.TcdAgregacion
	 * @generated
	 */
	EClass getTcdAgregacion();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdAgregacion#getNombreOrigen <em>Nombre Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Origen</em>'.
	 * @see diagrama_concreta.TcdAgregacion#getNombreOrigen()
	 * @see #getTcdAgregacion()
	 * @generated
	 */
	EAttribute getTcdAgregacion_NombreOrigen();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdAgregacion#getNombreDestino <em>Nombre Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Destino</em>'.
	 * @see diagrama_concreta.TcdAgregacion#getNombreDestino()
	 * @see #getTcdAgregacion()
	 * @generated
	 */
	EAttribute getTcdAgregacion_NombreDestino();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdAgregacion#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Origen</em>'.
	 * @see diagrama_concreta.TcdAgregacion#getMultiplicidadOrigen()
	 * @see #getTcdAgregacion()
	 * @generated
	 */
	EAttribute getTcdAgregacion_MultiplicidadOrigen();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdAgregacion#getMultiplicidadDestino <em>Multiplicidad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Destino</em>'.
	 * @see diagrama_concreta.TcdAgregacion#getMultiplicidadDestino()
	 * @see #getTcdAgregacion()
	 * @generated
	 */
	EAttribute getTcdAgregacion_MultiplicidadDestino();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TcdAtributo <em>Tcd Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Atributo</em>'.
	 * @see diagrama_concreta.TcdAtributo
	 * @generated
	 */
	EClass getTcdAtributo();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdAtributo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagrama_concreta.TcdAtributo#getNombre()
	 * @see #getTcdAtributo()
	 * @generated
	 */
	EAttribute getTcdAtributo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdAtributo#getTipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Dato</em>'.
	 * @see diagrama_concreta.TcdAtributo#getTipoDato()
	 * @see #getTcdAtributo()
	 * @generated
	 */
	EAttribute getTcdAtributo_TipoDato();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdAtributo#getVisibilidad <em>Visibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibilidad</em>'.
	 * @see diagrama_concreta.TcdAtributo#getVisibilidad()
	 * @see #getTcdAtributo()
	 * @generated
	 */
	EAttribute getTcdAtributo_Visibilidad();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdAtributo#isIsConstante <em>Is Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Constante</em>'.
	 * @see diagrama_concreta.TcdAtributo#isIsConstante()
	 * @see #getTcdAtributo()
	 * @generated
	 */
	EAttribute getTcdAtributo_IsConstante();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdAtributo#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see diagrama_concreta.TcdAtributo#isIsStatic()
	 * @see #getTcdAtributo()
	 * @generated
	 */
	EAttribute getTcdAtributo_IsStatic();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TcdMetodo <em>Tcd Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Metodo</em>'.
	 * @see diagrama_concreta.TcdMetodo
	 * @generated
	 */
	EClass getTcdMetodo();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama_concreta.TcdMetodo#getListaParametros <em>Lista Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Parametros</em>'.
	 * @see diagrama_concreta.TcdMetodo#getListaParametros()
	 * @see #getTcdMetodo()
	 * @generated
	 */
	EReference getTcdMetodo_ListaParametros();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdMetodo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagrama_concreta.TcdMetodo#getNombre()
	 * @see #getTcdMetodo()
	 * @generated
	 */
	EAttribute getTcdMetodo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdMetodo#getModificadorAcceso <em>Modificador Acceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modificador Acceso</em>'.
	 * @see diagrama_concreta.TcdMetodo#getModificadorAcceso()
	 * @see #getTcdMetodo()
	 * @generated
	 */
	EAttribute getTcdMetodo_ModificadorAcceso();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdMetodo#getTipoRetorno <em>Tipo Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Retorno</em>'.
	 * @see diagrama_concreta.TcdMetodo#getTipoRetorno()
	 * @see #getTcdMetodo()
	 * @generated
	 */
	EAttribute getTcdMetodo_TipoRetorno();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdMetodo#getSemantica <em>Semantica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantica</em>'.
	 * @see diagrama_concreta.TcdMetodo#getSemantica()
	 * @see #getTcdMetodo()
	 * @generated
	 */
	EAttribute getTcdMetodo_Semantica();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TcdParametro <em>Tcd Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Parametro</em>'.
	 * @see diagrama_concreta.TcdParametro
	 * @generated
	 */
	EClass getTcdParametro();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdParametro#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagrama_concreta.TcdParametro#getNombre()
	 * @see #getTcdParametro()
	 * @generated
	 */
	EAttribute getTcdParametro_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TcdParametro#getTipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Dato</em>'.
	 * @see diagrama_concreta.TcdParametro#getTipoDato()
	 * @see #getTcdParametro()
	 * @generated
	 */
	EAttribute getTcdParametro_TipoDato();

	/**
	 * Returns the meta object for enum '{@link diagrama_concreta.Multiplicidad <em>Multiplicidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicidad</em>'.
	 * @see diagrama_concreta.Multiplicidad
	 * @generated
	 */
	EEnum getMultiplicidad();

	/**
	 * Returns the meta object for enum '{@link diagrama_concreta.TipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Dato</em>'.
	 * @see diagrama_concreta.TipoDato
	 * @generated
	 */
	EEnum getTipoDato();

	/**
	 * Returns the meta object for enum '{@link diagrama_concreta.Visibilidad <em>Visibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibilidad</em>'.
	 * @see diagrama_concreta.Visibilidad
	 * @generated
	 */
	EEnum getVisibilidad();

	/**
	 * Returns the meta object for enum '{@link diagrama_concreta.TipoRetorno <em>Tipo Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Retorno</em>'.
	 * @see diagrama_concreta.TipoRetorno
	 * @generated
	 */
	EEnum getTipoRetorno();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Diagrama_concretaFactory getDiagrama_concretaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link diagrama_concreta.impl.TcdDiagramaClasesImpl <em>Tcd Diagrama Clases</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TcdDiagramaClasesImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdDiagramaClases()
		 * @generated
		 */
		EClass TCD_DIAGRAMA_CLASES = eINSTANCE.getTcdDiagramaClases();

		/**
		 * The meta object literal for the '<em><b>Lista Clases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_DIAGRAMA_CLASES__LISTA_CLASES = eINSTANCE.getTcdDiagramaClases_ListaClases();

		/**
		 * The meta object literal for the '<em><b>Lista Relaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_DIAGRAMA_CLASES__LISTA_RELACIONES = eINSTANCE.getTcdDiagramaClases_ListaRelaciones();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_DIAGRAMA_CLASES__NOMBRE = eINSTANCE.getTcdDiagramaClases_Nombre();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.ModelFactoryImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY__NOMBRE = eINSTANCE.getModelFactory_Nombre();

		/**
		 * The meta object literal for the '<em><b>Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY__RUTA = eINSTANCE.getModelFactory_Ruta();

		/**
		 * The meta object literal for the '<em><b>Lista Diagramas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LISTA_DIAGRAMAS = eINSTANCE.getModelFactory_ListaDiagramas();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.impl.TcdPaqueteImpl <em>Tcd Paquete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TcdPaqueteImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdPaquete()
		 * @generated
		 */
		EClass TCD_PAQUETE = eINSTANCE.getTcdPaquete();

		/**
		 * The meta object literal for the '<em><b>Lista Paquetes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_PAQUETE__LISTA_PAQUETES = eINSTANCE.getTcdPaquete_ListaPaquetes();

		/**
		 * The meta object literal for the '<em><b>Lista Clases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_PAQUETE__LISTA_CLASES = eINSTANCE.getTcdPaquete_ListaClases();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_PAQUETE__NOMBRE = eINSTANCE.getTcdPaquete_Nombre();

		/**
		 * The meta object literal for the '<em><b>Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_PAQUETE__RUTA = eINSTANCE.getTcdPaquete_Ruta();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.impl.TcdClaseImpl <em>Tcd Clase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TcdClaseImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdClase()
		 * @generated
		 */
		EClass TCD_CLASE = eINSTANCE.getTcdClase();

		/**
		 * The meta object literal for the '<em><b>Lista Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_CLASE__LISTA_ATRIBUTOS = eINSTANCE.getTcdClase_ListaAtributos();

		/**
		 * The meta object literal for the '<em><b>Lista Metodos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_CLASE__LISTA_METODOS = eINSTANCE.getTcdClase_ListaMetodos();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_CLASE__NOMBRE = eINSTANCE.getTcdClase_Nombre();

		/**
		 * The meta object literal for the '<em><b>Estereotipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_CLASE__ESTEREOTIPO = eINSTANCE.getTcdClase_Estereotipo();

		/**
		 * The meta object literal for the '<em><b>Modificador Acceso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_CLASE__MODIFICADOR_ACCESO = eINSTANCE.getTcdClase_ModificadorAcceso();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_CLASE__IS_ABSTRACT = eINSTANCE.getTcdClase_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Documentacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_CLASE__DOCUMENTACION = eINSTANCE.getTcdClase_Documentacion();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.impl.TcdRelacionImpl <em>Tcd Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TcdRelacionImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdRelacion()
		 * @generated
		 */
		EClass TCD_RELACION = eINSTANCE.getTcdRelacion();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_RELACION__SOURCE = eINSTANCE.getTcdRelacion_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_RELACION__TARGET = eINSTANCE.getTcdRelacion_Target();

		/**
		 * The meta object literal for the '<em><b>Navegavilidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_RELACION__NAVEGAVILIDAD = eINSTANCE.getTcdRelacion_Navegavilidad();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.impl.TcdAsociacionImpl <em>Tcd Asociacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TcdAsociacionImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdAsociacion()
		 * @generated
		 */
		EClass TCD_ASOCIACION = eINSTANCE.getTcdAsociacion();

		/**
		 * The meta object literal for the '<em><b>Nombre Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ASOCIACION__NOMBRE_ORIGEN = eINSTANCE.getTcdAsociacion_NombreOrigen();

		/**
		 * The meta object literal for the '<em><b>Nombre Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ASOCIACION__NOMBRE_DESTINO = eINSTANCE.getTcdAsociacion_NombreDestino();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ASOCIACION__MULTIPLICIDAD_ORIGEN = eINSTANCE.getTcdAsociacion_MultiplicidadOrigen();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ASOCIACION__MULTIPLICIDAD_DESTINO = eINSTANCE.getTcdAsociacion_MultiplicidadDestino();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.impl.TcdComposicionImpl <em>Tcd Composicion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TcdComposicionImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdComposicion()
		 * @generated
		 */
		EClass TCD_COMPOSICION = eINSTANCE.getTcdComposicion();

		/**
		 * The meta object literal for the '<em><b>Nombre Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_COMPOSICION__NOMBRE_ORIGEN = eINSTANCE.getTcdComposicion_NombreOrigen();

		/**
		 * The meta object literal for the '<em><b>Nombre Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_COMPOSICION__NOMBRE_DESTINO = eINSTANCE.getTcdComposicion_NombreDestino();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_COMPOSICION__MULTIPLICIDAD_ORIGEN = eINSTANCE.getTcdComposicion_MultiplicidadOrigen();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_COMPOSICION__MULTIPLICIDAD_DESTINO = eINSTANCE.getTcdComposicion_MultiplicidadDestino();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.impl.TcdDependenciaImpl <em>Tcd Dependencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TcdDependenciaImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdDependencia()
		 * @generated
		 */
		EClass TCD_DEPENDENCIA = eINSTANCE.getTcdDependencia();

		/**
		 * The meta object literal for the '<em><b>Nombre Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_DEPENDENCIA__NOMBRE_ORIGEN = eINSTANCE.getTcdDependencia_NombreOrigen();

		/**
		 * The meta object literal for the '<em><b>Nombre Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_DEPENDENCIA__NOMBRE_DESTINO = eINSTANCE.getTcdDependencia_NombreDestino();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_DEPENDENCIA__MULTIPLICIDAD_ORIGEN = eINSTANCE.getTcdDependencia_MultiplicidadOrigen();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_DEPENDENCIA__MULTIPLICIDAD_DESTINO = eINSTANCE.getTcdDependencia_MultiplicidadDestino();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.impl.TcdHerenciaImpl <em>Tcd Herencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TcdHerenciaImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdHerencia()
		 * @generated
		 */
		EClass TCD_HERENCIA = eINSTANCE.getTcdHerencia();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.impl.TcdAgregacionImpl <em>Tcd Agregacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TcdAgregacionImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdAgregacion()
		 * @generated
		 */
		EClass TCD_AGREGACION = eINSTANCE.getTcdAgregacion();

		/**
		 * The meta object literal for the '<em><b>Nombre Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_AGREGACION__NOMBRE_ORIGEN = eINSTANCE.getTcdAgregacion_NombreOrigen();

		/**
		 * The meta object literal for the '<em><b>Nombre Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_AGREGACION__NOMBRE_DESTINO = eINSTANCE.getTcdAgregacion_NombreDestino();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_AGREGACION__MULTIPLICIDAD_ORIGEN = eINSTANCE.getTcdAgregacion_MultiplicidadOrigen();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_AGREGACION__MULTIPLICIDAD_DESTINO = eINSTANCE.getTcdAgregacion_MultiplicidadDestino();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.impl.TcdAtributoImpl <em>Tcd Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TcdAtributoImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdAtributo()
		 * @generated
		 */
		EClass TCD_ATRIBUTO = eINSTANCE.getTcdAtributo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ATRIBUTO__NOMBRE = eINSTANCE.getTcdAtributo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo Dato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ATRIBUTO__TIPO_DATO = eINSTANCE.getTcdAtributo_TipoDato();

		/**
		 * The meta object literal for the '<em><b>Visibilidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ATRIBUTO__VISIBILIDAD = eINSTANCE.getTcdAtributo_Visibilidad();

		/**
		 * The meta object literal for the '<em><b>Is Constante</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ATRIBUTO__IS_CONSTANTE = eINSTANCE.getTcdAtributo_IsConstante();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ATRIBUTO__IS_STATIC = eINSTANCE.getTcdAtributo_IsStatic();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.impl.TcdMetodoImpl <em>Tcd Metodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TcdMetodoImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdMetodo()
		 * @generated
		 */
		EClass TCD_METODO = eINSTANCE.getTcdMetodo();

		/**
		 * The meta object literal for the '<em><b>Lista Parametros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_METODO__LISTA_PARAMETROS = eINSTANCE.getTcdMetodo_ListaParametros();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_METODO__NOMBRE = eINSTANCE.getTcdMetodo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Modificador Acceso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_METODO__MODIFICADOR_ACCESO = eINSTANCE.getTcdMetodo_ModificadorAcceso();

		/**
		 * The meta object literal for the '<em><b>Tipo Retorno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_METODO__TIPO_RETORNO = eINSTANCE.getTcdMetodo_TipoRetorno();

		/**
		 * The meta object literal for the '<em><b>Semantica</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_METODO__SEMANTICA = eINSTANCE.getTcdMetodo_Semantica();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.impl.TcdParametroImpl <em>Tcd Parametro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TcdParametroImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTcdParametro()
		 * @generated
		 */
		EClass TCD_PARAMETRO = eINSTANCE.getTcdParametro();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_PARAMETRO__NOMBRE = eINSTANCE.getTcdParametro_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo Dato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_PARAMETRO__TIPO_DATO = eINSTANCE.getTcdParametro_TipoDato();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.Multiplicidad <em>Multiplicidad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.Multiplicidad
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getMultiplicidad()
		 * @generated
		 */
		EEnum MULTIPLICIDAD = eINSTANCE.getMultiplicidad();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.TipoDato <em>Tipo Dato</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.TipoDato
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTipoDato()
		 * @generated
		 */
		EEnum TIPO_DATO = eINSTANCE.getTipoDato();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.Visibilidad <em>Visibilidad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.Visibilidad
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getVisibilidad()
		 * @generated
		 */
		EEnum VISIBILIDAD = eINSTANCE.getVisibilidad();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.TipoRetorno <em>Tipo Retorno</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.TipoRetorno
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTipoRetorno()
		 * @generated
		 */
		EEnum TIPO_RETORNO = eINSTANCE.getTipoRetorno();

	}

} //Diagrama_concretaPackage
