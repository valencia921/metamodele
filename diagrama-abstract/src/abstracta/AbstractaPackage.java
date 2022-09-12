/**
 */
package abstracta;

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
 * @see abstracta.AbstractaFactory
 * @model kind="package"
 * @generated
 */
public interface AbstractaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstracta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "abstracta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abstracta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractaPackage eINSTANCE = abstracta.impl.AbstractaPackageImpl.init();

	/**
	 * The meta object id for the '{@link abstracta.impl.TcdPaqueteImpl <em>Tcd Paquete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TcdPaqueteImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTcdPaquete()
	 * @generated
	 */
	int TCD_PAQUETE = 0;

	/**
	 * The feature id for the '<em><b>Lista Clases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PAQUETE__LISTA_CLASES = 0;

	/**
	 * The feature id for the '<em><b>Listapaquetes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PAQUETE__LISTAPAQUETES = 1;

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
	 * The meta object id for the '{@link abstracta.impl.TcdClaseImpl <em>Tcd Clase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TcdClaseImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTcdClase()
	 * @generated
	 */
	int TCD_CLASE = 1;

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
	 * The feature id for the '<em><b>Lista Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__LISTA_RELACIONES = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__NOMBRE = 3;

	/**
	 * The feature id for the '<em><b>Estereotipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__ESTEREOTIPO = 4;

	/**
	 * The feature id for the '<em><b>Modificador Acceso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__MODIFICADOR_ACCESO = 5;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__IS_ABSTRACT = 6;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__DOCUMENTACION = 7;

	/**
	 * The number of structural features of the '<em>Tcd Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link abstracta.impl.TcdAtributoImpl <em>Tcd Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TcdAtributoImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTcdAtributo()
	 * @generated
	 */
	int TCD_ATRIBUTO = 2;

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
	 * The feature id for the '<em><b>Valor Defecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ATRIBUTO__VALOR_DEFECTO = 5;

	/**
	 * The number of structural features of the '<em>Tcd Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ATRIBUTO_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link abstracta.impl.TcdMetodoImpl <em>Tcd Metodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TcdMetodoImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTcdMetodo()
	 * @generated
	 */
	int TCD_METODO = 3;

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
	 * The meta object id for the '{@link abstracta.impl.TcdRelacionImpl <em>Tcd Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TcdRelacionImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTcdRelacion()
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
	 * The meta object id for the '{@link abstracta.impl.TcdAsociacionImpl <em>Tcd Asociacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TcdAsociacionImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTcdAsociacion()
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
	 * The meta object id for the '{@link abstracta.impl.TcdComposicionImpl <em>Tcd Composicion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TcdComposicionImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTcdComposicion()
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
	 * The meta object id for the '{@link abstracta.impl.TcdDependenciaImpl <em>Tcd Dependencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TcdDependenciaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTcdDependencia()
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
	 * The meta object id for the '{@link abstracta.impl.TcdHerenciaImpl <em>Tcd Herencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TcdHerenciaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTcdHerencia()
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
	 * The meta object id for the '{@link abstracta.impl.TcdAgregacionImpl <em>Tcd Agregacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TcdAgregacionImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTcdAgregacion()
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
	 * The meta object id for the '{@link abstracta.impl.TcdParametroImpl <em>Tcd Parametro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TcdParametroImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTcdParametro()
	 * @generated
	 */
	int TCD_PARAMETRO = 10;

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
	 * The meta object id for the '{@link abstracta.Visibilidad <em>Visibilidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.Visibilidad
	 * @see abstracta.impl.AbstractaPackageImpl#getVisibilidad()
	 * @generated
	 */
	int VISIBILIDAD = 11;

	/**
	 * The meta object id for the '{@link abstracta.TipoDato <em>Tipo Dato</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.TipoDato
	 * @see abstracta.impl.AbstractaPackageImpl#getTipoDato()
	 * @generated
	 */
	int TIPO_DATO = 12;

	/**
	 * The meta object id for the '{@link abstracta.Multiplicidad <em>Multiplicidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.Multiplicidad
	 * @see abstracta.impl.AbstractaPackageImpl#getMultiplicidad()
	 * @generated
	 */
	int MULTIPLICIDAD = 13;

	/**
	 * The meta object id for the '{@link abstracta.TipoRetorno <em>Tipo Retorno</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.TipoRetorno
	 * @see abstracta.impl.AbstractaPackageImpl#getTipoRetorno()
	 * @generated
	 */
	int TIPO_RETORNO = 14;


	/**
	 * Returns the meta object for class '{@link abstracta.TcdPaquete <em>Tcd Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Paquete</em>'.
	 * @see abstracta.TcdPaquete
	 * @generated
	 */
	EClass getTcdPaquete();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.TcdPaquete#getListaClases <em>Lista Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Clases</em>'.
	 * @see abstracta.TcdPaquete#getListaClases()
	 * @see #getTcdPaquete()
	 * @generated
	 */
	EReference getTcdPaquete_ListaClases();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.TcdPaquete#getListapaquetes <em>Listapaquetes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listapaquetes</em>'.
	 * @see abstracta.TcdPaquete#getListapaquetes()
	 * @see #getTcdPaquete()
	 * @generated
	 */
	EReference getTcdPaquete_Listapaquetes();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdPaquete#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.TcdPaquete#getNombre()
	 * @see #getTcdPaquete()
	 * @generated
	 */
	EAttribute getTcdPaquete_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdPaquete#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see abstracta.TcdPaquete#getRuta()
	 * @see #getTcdPaquete()
	 * @generated
	 */
	EAttribute getTcdPaquete_Ruta();

	/**
	 * Returns the meta object for class '{@link abstracta.TcdClase <em>Tcd Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Clase</em>'.
	 * @see abstracta.TcdClase
	 * @generated
	 */
	EClass getTcdClase();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.TcdClase#getListaAtributos <em>Lista Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Atributos</em>'.
	 * @see abstracta.TcdClase#getListaAtributos()
	 * @see #getTcdClase()
	 * @generated
	 */
	EReference getTcdClase_ListaAtributos();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.TcdClase#getListaMetodos <em>Lista Metodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Metodos</em>'.
	 * @see abstracta.TcdClase#getListaMetodos()
	 * @see #getTcdClase()
	 * @generated
	 */
	EReference getTcdClase_ListaMetodos();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.TcdClase#getListaRelaciones <em>Lista Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Relaciones</em>'.
	 * @see abstracta.TcdClase#getListaRelaciones()
	 * @see #getTcdClase()
	 * @generated
	 */
	EReference getTcdClase_ListaRelaciones();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdClase#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.TcdClase#getNombre()
	 * @see #getTcdClase()
	 * @generated
	 */
	EAttribute getTcdClase_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdClase#getEstereotipo <em>Estereotipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estereotipo</em>'.
	 * @see abstracta.TcdClase#getEstereotipo()
	 * @see #getTcdClase()
	 * @generated
	 */
	EAttribute getTcdClase_Estereotipo();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdClase#getModificadorAcceso <em>Modificador Acceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modificador Acceso</em>'.
	 * @see abstracta.TcdClase#getModificadorAcceso()
	 * @see #getTcdClase()
	 * @generated
	 */
	EAttribute getTcdClase_ModificadorAcceso();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdClase#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see abstracta.TcdClase#isIsAbstract()
	 * @see #getTcdClase()
	 * @generated
	 */
	EAttribute getTcdClase_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdClase#getDocumentacion <em>Documentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentacion</em>'.
	 * @see abstracta.TcdClase#getDocumentacion()
	 * @see #getTcdClase()
	 * @generated
	 */
	EAttribute getTcdClase_Documentacion();

	/**
	 * Returns the meta object for class '{@link abstracta.TcdAtributo <em>Tcd Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Atributo</em>'.
	 * @see abstracta.TcdAtributo
	 * @generated
	 */
	EClass getTcdAtributo();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdAtributo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.TcdAtributo#getNombre()
	 * @see #getTcdAtributo()
	 * @generated
	 */
	EAttribute getTcdAtributo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdAtributo#getTipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Dato</em>'.
	 * @see abstracta.TcdAtributo#getTipoDato()
	 * @see #getTcdAtributo()
	 * @generated
	 */
	EAttribute getTcdAtributo_TipoDato();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdAtributo#getVisibilidad <em>Visibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibilidad</em>'.
	 * @see abstracta.TcdAtributo#getVisibilidad()
	 * @see #getTcdAtributo()
	 * @generated
	 */
	EAttribute getTcdAtributo_Visibilidad();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdAtributo#isIsConstante <em>Is Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Constante</em>'.
	 * @see abstracta.TcdAtributo#isIsConstante()
	 * @see #getTcdAtributo()
	 * @generated
	 */
	EAttribute getTcdAtributo_IsConstante();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdAtributo#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see abstracta.TcdAtributo#isIsStatic()
	 * @see #getTcdAtributo()
	 * @generated
	 */
	EAttribute getTcdAtributo_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdAtributo#getValorDefecto <em>Valor Defecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Defecto</em>'.
	 * @see abstracta.TcdAtributo#getValorDefecto()
	 * @see #getTcdAtributo()
	 * @generated
	 */
	EAttribute getTcdAtributo_ValorDefecto();

	/**
	 * Returns the meta object for class '{@link abstracta.TcdMetodo <em>Tcd Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Metodo</em>'.
	 * @see abstracta.TcdMetodo
	 * @generated
	 */
	EClass getTcdMetodo();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.TcdMetodo#getListaParametros <em>Lista Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Parametros</em>'.
	 * @see abstracta.TcdMetodo#getListaParametros()
	 * @see #getTcdMetodo()
	 * @generated
	 */
	EReference getTcdMetodo_ListaParametros();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdMetodo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.TcdMetodo#getNombre()
	 * @see #getTcdMetodo()
	 * @generated
	 */
	EAttribute getTcdMetodo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdMetodo#getModificadorAcceso <em>Modificador Acceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modificador Acceso</em>'.
	 * @see abstracta.TcdMetodo#getModificadorAcceso()
	 * @see #getTcdMetodo()
	 * @generated
	 */
	EAttribute getTcdMetodo_ModificadorAcceso();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdMetodo#getTipoRetorno <em>Tipo Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Retorno</em>'.
	 * @see abstracta.TcdMetodo#getTipoRetorno()
	 * @see #getTcdMetodo()
	 * @generated
	 */
	EAttribute getTcdMetodo_TipoRetorno();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdMetodo#getSemantica <em>Semantica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantica</em>'.
	 * @see abstracta.TcdMetodo#getSemantica()
	 * @see #getTcdMetodo()
	 * @generated
	 */
	EAttribute getTcdMetodo_Semantica();

	/**
	 * Returns the meta object for class '{@link abstracta.TcdRelacion <em>Tcd Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Relacion</em>'.
	 * @see abstracta.TcdRelacion
	 * @generated
	 */
	EClass getTcdRelacion();

	/**
	 * Returns the meta object for the reference '{@link abstracta.TcdRelacion#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see abstracta.TcdRelacion#getSource()
	 * @see #getTcdRelacion()
	 * @generated
	 */
	EReference getTcdRelacion_Source();

	/**
	 * Returns the meta object for the reference '{@link abstracta.TcdRelacion#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see abstracta.TcdRelacion#getTarget()
	 * @see #getTcdRelacion()
	 * @generated
	 */
	EReference getTcdRelacion_Target();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdRelacion#getNavegavilidad <em>Navegavilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegavilidad</em>'.
	 * @see abstracta.TcdRelacion#getNavegavilidad()
	 * @see #getTcdRelacion()
	 * @generated
	 */
	EAttribute getTcdRelacion_Navegavilidad();

	/**
	 * Returns the meta object for class '{@link abstracta.TcdAsociacion <em>Tcd Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Asociacion</em>'.
	 * @see abstracta.TcdAsociacion
	 * @generated
	 */
	EClass getTcdAsociacion();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdAsociacion#getNombreOrigen <em>Nombre Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Origen</em>'.
	 * @see abstracta.TcdAsociacion#getNombreOrigen()
	 * @see #getTcdAsociacion()
	 * @generated
	 */
	EAttribute getTcdAsociacion_NombreOrigen();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdAsociacion#getNombreDestino <em>Nombre Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Destino</em>'.
	 * @see abstracta.TcdAsociacion#getNombreDestino()
	 * @see #getTcdAsociacion()
	 * @generated
	 */
	EAttribute getTcdAsociacion_NombreDestino();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdAsociacion#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Origen</em>'.
	 * @see abstracta.TcdAsociacion#getMultiplicidadOrigen()
	 * @see #getTcdAsociacion()
	 * @generated
	 */
	EAttribute getTcdAsociacion_MultiplicidadOrigen();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdAsociacion#getMultiplicidadDestino <em>Multiplicidad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Destino</em>'.
	 * @see abstracta.TcdAsociacion#getMultiplicidadDestino()
	 * @see #getTcdAsociacion()
	 * @generated
	 */
	EAttribute getTcdAsociacion_MultiplicidadDestino();

	/**
	 * Returns the meta object for class '{@link abstracta.TcdComposicion <em>Tcd Composicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Composicion</em>'.
	 * @see abstracta.TcdComposicion
	 * @generated
	 */
	EClass getTcdComposicion();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdComposicion#getNombreOrigen <em>Nombre Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Origen</em>'.
	 * @see abstracta.TcdComposicion#getNombreOrigen()
	 * @see #getTcdComposicion()
	 * @generated
	 */
	EAttribute getTcdComposicion_NombreOrigen();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdComposicion#getNombreDestino <em>Nombre Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Destino</em>'.
	 * @see abstracta.TcdComposicion#getNombreDestino()
	 * @see #getTcdComposicion()
	 * @generated
	 */
	EAttribute getTcdComposicion_NombreDestino();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdComposicion#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Origen</em>'.
	 * @see abstracta.TcdComposicion#getMultiplicidadOrigen()
	 * @see #getTcdComposicion()
	 * @generated
	 */
	EAttribute getTcdComposicion_MultiplicidadOrigen();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdComposicion#getMultiplicidadDestino <em>Multiplicidad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Destino</em>'.
	 * @see abstracta.TcdComposicion#getMultiplicidadDestino()
	 * @see #getTcdComposicion()
	 * @generated
	 */
	EAttribute getTcdComposicion_MultiplicidadDestino();

	/**
	 * Returns the meta object for class '{@link abstracta.TcdDependencia <em>Tcd Dependencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Dependencia</em>'.
	 * @see abstracta.TcdDependencia
	 * @generated
	 */
	EClass getTcdDependencia();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdDependencia#getNombreOrigen <em>Nombre Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Origen</em>'.
	 * @see abstracta.TcdDependencia#getNombreOrigen()
	 * @see #getTcdDependencia()
	 * @generated
	 */
	EAttribute getTcdDependencia_NombreOrigen();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdDependencia#getNombreDestino <em>Nombre Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Destino</em>'.
	 * @see abstracta.TcdDependencia#getNombreDestino()
	 * @see #getTcdDependencia()
	 * @generated
	 */
	EAttribute getTcdDependencia_NombreDestino();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdDependencia#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Origen</em>'.
	 * @see abstracta.TcdDependencia#getMultiplicidadOrigen()
	 * @see #getTcdDependencia()
	 * @generated
	 */
	EAttribute getTcdDependencia_MultiplicidadOrigen();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdDependencia#getMultiplicidadDestino <em>Multiplicidad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Destino</em>'.
	 * @see abstracta.TcdDependencia#getMultiplicidadDestino()
	 * @see #getTcdDependencia()
	 * @generated
	 */
	EAttribute getTcdDependencia_MultiplicidadDestino();

	/**
	 * Returns the meta object for class '{@link abstracta.TcdHerencia <em>Tcd Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Herencia</em>'.
	 * @see abstracta.TcdHerencia
	 * @generated
	 */
	EClass getTcdHerencia();

	/**
	 * Returns the meta object for class '{@link abstracta.TcdAgregacion <em>Tcd Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Agregacion</em>'.
	 * @see abstracta.TcdAgregacion
	 * @generated
	 */
	EClass getTcdAgregacion();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdAgregacion#getNombreOrigen <em>Nombre Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Origen</em>'.
	 * @see abstracta.TcdAgregacion#getNombreOrigen()
	 * @see #getTcdAgregacion()
	 * @generated
	 */
	EAttribute getTcdAgregacion_NombreOrigen();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdAgregacion#getNombreDestino <em>Nombre Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Destino</em>'.
	 * @see abstracta.TcdAgregacion#getNombreDestino()
	 * @see #getTcdAgregacion()
	 * @generated
	 */
	EAttribute getTcdAgregacion_NombreDestino();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdAgregacion#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Origen</em>'.
	 * @see abstracta.TcdAgregacion#getMultiplicidadOrigen()
	 * @see #getTcdAgregacion()
	 * @generated
	 */
	EAttribute getTcdAgregacion_MultiplicidadOrigen();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdAgregacion#getMultiplicidadDestino <em>Multiplicidad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Destino</em>'.
	 * @see abstracta.TcdAgregacion#getMultiplicidadDestino()
	 * @see #getTcdAgregacion()
	 * @generated
	 */
	EAttribute getTcdAgregacion_MultiplicidadDestino();

	/**
	 * Returns the meta object for class '{@link abstracta.TcdParametro <em>Tcd Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcd Parametro</em>'.
	 * @see abstracta.TcdParametro
	 * @generated
	 */
	EClass getTcdParametro();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdParametro#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.TcdParametro#getNombre()
	 * @see #getTcdParametro()
	 * @generated
	 */
	EAttribute getTcdParametro_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TcdParametro#getTipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Dato</em>'.
	 * @see abstracta.TcdParametro#getTipoDato()
	 * @see #getTcdParametro()
	 * @generated
	 */
	EAttribute getTcdParametro_TipoDato();

	/**
	 * Returns the meta object for enum '{@link abstracta.Visibilidad <em>Visibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibilidad</em>'.
	 * @see abstracta.Visibilidad
	 * @generated
	 */
	EEnum getVisibilidad();

	/**
	 * Returns the meta object for enum '{@link abstracta.TipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Dato</em>'.
	 * @see abstracta.TipoDato
	 * @generated
	 */
	EEnum getTipoDato();

	/**
	 * Returns the meta object for enum '{@link abstracta.Multiplicidad <em>Multiplicidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicidad</em>'.
	 * @see abstracta.Multiplicidad
	 * @generated
	 */
	EEnum getMultiplicidad();

	/**
	 * Returns the meta object for enum '{@link abstracta.TipoRetorno <em>Tipo Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Retorno</em>'.
	 * @see abstracta.TipoRetorno
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
	AbstractaFactory getAbstractaFactory();

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
		 * The meta object literal for the '{@link abstracta.impl.TcdPaqueteImpl <em>Tcd Paquete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TcdPaqueteImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTcdPaquete()
		 * @generated
		 */
		EClass TCD_PAQUETE = eINSTANCE.getTcdPaquete();

		/**
		 * The meta object literal for the '<em><b>Lista Clases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_PAQUETE__LISTA_CLASES = eINSTANCE.getTcdPaquete_ListaClases();

		/**
		 * The meta object literal for the '<em><b>Listapaquetes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_PAQUETE__LISTAPAQUETES = eINSTANCE.getTcdPaquete_Listapaquetes();

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
		 * The meta object literal for the '{@link abstracta.impl.TcdClaseImpl <em>Tcd Clase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TcdClaseImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTcdClase()
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
		 * The meta object literal for the '<em><b>Lista Relaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_CLASE__LISTA_RELACIONES = eINSTANCE.getTcdClase_ListaRelaciones();

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
		 * The meta object literal for the '{@link abstracta.impl.TcdAtributoImpl <em>Tcd Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TcdAtributoImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTcdAtributo()
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
		 * The meta object literal for the '<em><b>Valor Defecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ATRIBUTO__VALOR_DEFECTO = eINSTANCE.getTcdAtributo_ValorDefecto();

		/**
		 * The meta object literal for the '{@link abstracta.impl.TcdMetodoImpl <em>Tcd Metodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TcdMetodoImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTcdMetodo()
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
		 * The meta object literal for the '{@link abstracta.impl.TcdRelacionImpl <em>Tcd Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TcdRelacionImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTcdRelacion()
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
		 * The meta object literal for the '{@link abstracta.impl.TcdAsociacionImpl <em>Tcd Asociacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TcdAsociacionImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTcdAsociacion()
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
		 * The meta object literal for the '{@link abstracta.impl.TcdComposicionImpl <em>Tcd Composicion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TcdComposicionImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTcdComposicion()
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
		 * The meta object literal for the '{@link abstracta.impl.TcdDependenciaImpl <em>Tcd Dependencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TcdDependenciaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTcdDependencia()
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
		 * The meta object literal for the '{@link abstracta.impl.TcdHerenciaImpl <em>Tcd Herencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TcdHerenciaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTcdHerencia()
		 * @generated
		 */
		EClass TCD_HERENCIA = eINSTANCE.getTcdHerencia();

		/**
		 * The meta object literal for the '{@link abstracta.impl.TcdAgregacionImpl <em>Tcd Agregacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TcdAgregacionImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTcdAgregacion()
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
		 * The meta object literal for the '{@link abstracta.impl.TcdParametroImpl <em>Tcd Parametro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TcdParametroImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTcdParametro()
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
		 * The meta object literal for the '{@link abstracta.Visibilidad <em>Visibilidad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.Visibilidad
		 * @see abstracta.impl.AbstractaPackageImpl#getVisibilidad()
		 * @generated
		 */
		EEnum VISIBILIDAD = eINSTANCE.getVisibilidad();

		/**
		 * The meta object literal for the '{@link abstracta.TipoDato <em>Tipo Dato</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.TipoDato
		 * @see abstracta.impl.AbstractaPackageImpl#getTipoDato()
		 * @generated
		 */
		EEnum TIPO_DATO = eINSTANCE.getTipoDato();

		/**
		 * The meta object literal for the '{@link abstracta.Multiplicidad <em>Multiplicidad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.Multiplicidad
		 * @see abstracta.impl.AbstractaPackageImpl#getMultiplicidad()
		 * @generated
		 */
		EEnum MULTIPLICIDAD = eINSTANCE.getMultiplicidad();

		/**
		 * The meta object literal for the '{@link abstracta.TipoRetorno <em>Tipo Retorno</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.TipoRetorno
		 * @see abstracta.impl.AbstractaPackageImpl#getTipoRetorno()
		 * @generated
		 */
		EEnum TIPO_RETORNO = eINSTANCE.getTipoRetorno();

	}

} //AbstractaPackage
