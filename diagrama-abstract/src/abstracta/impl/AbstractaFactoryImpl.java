/**
 */
package abstracta.impl;

import abstracta.*;

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
public class AbstractaFactoryImpl extends EFactoryImpl implements AbstractaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractaFactory init() {
		try {
			AbstractaFactory theAbstractaFactory = (AbstractaFactory)EPackage.Registry.INSTANCE.getEFactory(AbstractaPackage.eNS_URI);
			if (theAbstractaFactory != null) {
				return theAbstractaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbstractaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractaFactoryImpl() {
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
			case AbstractaPackage.TCD_PAQUETE: return createTcdPaquete();
			case AbstractaPackage.TCD_CLASE: return createTcdClase();
			case AbstractaPackage.TCD_ATRIBUTO: return createTcdAtributo();
			case AbstractaPackage.TCD_METODO: return createTcdMetodo();
			case AbstractaPackage.TCD_ASOCIACION: return createTcdAsociacion();
			case AbstractaPackage.TCD_COMPOSICION: return createTcdComposicion();
			case AbstractaPackage.TCD_DEPENDENCIA: return createTcdDependencia();
			case AbstractaPackage.TCD_HERENCIA: return createTcdHerencia();
			case AbstractaPackage.TCD_AGREGACION: return createTcdAgregacion();
			case AbstractaPackage.TCD_PARAMETRO: return createTcdParametro();
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
			case AbstractaPackage.VISIBILIDAD:
				return createVisibilidadFromString(eDataType, initialValue);
			case AbstractaPackage.TIPO_DATO:
				return createTipoDatoFromString(eDataType, initialValue);
			case AbstractaPackage.MULTIPLICIDAD:
				return createMultiplicidadFromString(eDataType, initialValue);
			case AbstractaPackage.TIPO_RETORNO:
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
			case AbstractaPackage.VISIBILIDAD:
				return convertVisibilidadToString(eDataType, instanceValue);
			case AbstractaPackage.TIPO_DATO:
				return convertTipoDatoToString(eDataType, instanceValue);
			case AbstractaPackage.MULTIPLICIDAD:
				return convertMultiplicidadToString(eDataType, instanceValue);
			case AbstractaPackage.TIPO_RETORNO:
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
	public TcdParametro createTcdParametro() {
		TcdParametroImpl tcdParametro = new TcdParametroImpl();
		return tcdParametro;
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
	public AbstractaPackage getAbstractaPackage() {
		return (AbstractaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbstractaPackage getPackage() {
		return AbstractaPackage.eINSTANCE;
	}

} //AbstractaFactoryImpl
