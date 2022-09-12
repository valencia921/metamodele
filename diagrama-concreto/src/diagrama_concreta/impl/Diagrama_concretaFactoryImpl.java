/**
 */
package diagrama_concreta.impl;

import diagrama_concreta.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Diagrama_concretaFactoryImpl extends EFactoryImpl implements Diagrama_concretaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Diagrama_concretaFactory init() {
		try {
			Diagrama_concretaFactory theDiagrama_concretaFactory = (Diagrama_concretaFactory)EPackage.Registry.INSTANCE.getEFactory(Diagrama_concretaPackage.eNS_URI);
			if (theDiagrama_concretaFactory != null) {
				return theDiagrama_concretaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Diagrama_concretaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagrama_concretaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Diagrama_concretaPackage.TCD_DIAGRAMA_CLASES: return createTcdDiagramaClases();
			case Diagrama_concretaPackage.MODEL_FACTORY: return createModelFactory();
			case Diagrama_concretaPackage.TCD_PAQUETE: return createTcdPaquete();
			case Diagrama_concretaPackage.TCD_CLASE: return createTcdClase();
			case Diagrama_concretaPackage.TCD_ASOCIACION: return createTcdAsociacion();
			case Diagrama_concretaPackage.TCD_COMPOSICION: return createTcdComposicion();
			case Diagrama_concretaPackage.TCD_DEPENDENCIA: return createTcdDependencia();
			case Diagrama_concretaPackage.TCD_HERENCIA: return createTcdHerencia();
			case Diagrama_concretaPackage.TCD_AGREGACION: return createTcdAgregacion();
			case Diagrama_concretaPackage.TCD_ATRIBUTO: return createTcdAtributo();
			case Diagrama_concretaPackage.TCD_METODO: return createTcdMetodo();
			case Diagrama_concretaPackage.TCD_PARAMETRO: return createTcdParametro();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Diagrama_concretaPackage.MULTIPLICIDAD:
				return createMultiplicidadFromString(eDataType, initialValue);
			case Diagrama_concretaPackage.TIPO_DATO:
				return createTipoDatoFromString(eDataType, initialValue);
			case Diagrama_concretaPackage.VISIBILIDAD:
				return createVisibilidadFromString(eDataType, initialValue);
			case Diagrama_concretaPackage.TIPO_RETORNO:
				return createTipoRetornoFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Diagrama_concretaPackage.MULTIPLICIDAD:
				return convertMultiplicidadToString(eDataType, instanceValue);
			case Diagrama_concretaPackage.TIPO_DATO:
				return convertTipoDatoToString(eDataType, instanceValue);
			case Diagrama_concretaPackage.VISIBILIDAD:
				return convertVisibilidadToString(eDataType, instanceValue);
			case Diagrama_concretaPackage.TIPO_RETORNO:
				return convertTipoRetornoToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcdDiagramaClases createTcdDiagramaClases() {
		TcdDiagramaClasesImpl tcdDiagramaClases = new TcdDiagramaClasesImpl();
		return tcdDiagramaClases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory createModelFactory() {
		ModelFactoryImpl modelFactory = new ModelFactoryImpl();
		return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcdPaquete createTcdPaquete() {
		TcdPaqueteImpl tcdPaquete = new TcdPaqueteImpl();
		return tcdPaquete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcdClase createTcdClase() {
		TcdClaseImpl tcdClase = new TcdClaseImpl();
		return tcdClase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcdAsociacion createTcdAsociacion() {
		TcdAsociacionImpl tcdAsociacion = new TcdAsociacionImpl();
		return tcdAsociacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcdComposicion createTcdComposicion() {
		TcdComposicionImpl tcdComposicion = new TcdComposicionImpl();
		return tcdComposicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcdDependencia createTcdDependencia() {
		TcdDependenciaImpl tcdDependencia = new TcdDependenciaImpl();
		return tcdDependencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcdHerencia createTcdHerencia() {
		TcdHerenciaImpl tcdHerencia = new TcdHerenciaImpl();
		return tcdHerencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcdAgregacion createTcdAgregacion() {
		TcdAgregacionImpl tcdAgregacion = new TcdAgregacionImpl();
		return tcdAgregacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcdAtributo createTcdAtributo() {
		TcdAtributoImpl tcdAtributo = new TcdAtributoImpl();
		return tcdAtributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcdMetodo createTcdMetodo() {
		TcdMetodoImpl tcdMetodo = new TcdMetodoImpl();
		return tcdMetodo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcdParametro createTcdParametro() {
		TcdParametroImpl tcdParametro = new TcdParametroImpl();
		return tcdParametro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicidad createMultiplicidadFromString(EDataType eDataType, String initialValue) {
		Multiplicidad result = Multiplicidad.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicidadToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato createTipoDatoFromString(EDataType eDataType, String initialValue) {
		TipoDato result = TipoDato.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoDatoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibilidad createVisibilidadFromString(EDataType eDataType, String initialValue) {
		Visibilidad result = Visibilidad.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilidadToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoRetorno createTipoRetornoFromString(EDataType eDataType, String initialValue) {
		TipoRetorno result = TipoRetorno.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoRetornoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagrama_concretaPackage getDiagrama_concretaPackage() {
		return (Diagrama_concretaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Diagrama_concretaPackage getPackage() {
		return Diagrama_concretaPackage.eINSTANCE;
	}

} //Diagrama_concretaFactoryImpl
