/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.TcdAtributo;
import abstracta.TipoDato;
import abstracta.Visibilidad;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tcd Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.TcdAtributoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.impl.TcdAtributoImpl#getTipoDato <em>Tipo Dato</em>}</li>
 *   <li>{@link abstracta.impl.TcdAtributoImpl#getVisibilidad <em>Visibilidad</em>}</li>
 *   <li>{@link abstracta.impl.TcdAtributoImpl#isIsConstante <em>Is Constante</em>}</li>
 *   <li>{@link abstracta.impl.TcdAtributoImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link abstracta.impl.TcdAtributoImpl#getValorDefecto <em>Valor Defecto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TcdAtributoImpl extends EObjectImpl implements TcdAtributo {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoDato() <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDato()
	 * @generated
	 * @ordered
	 */
	protected static final TipoDato TIPO_DATO_EDEFAULT = TipoDato.STRING;

	/**
	 * The cached value of the '{@link #getTipoDato() <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDato()
	 * @generated
	 * @ordered
	 */
	protected TipoDato tipoDato = TIPO_DATO_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibilidad() <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilidad()
	 * @generated
	 * @ordered
	 */
	protected static final Visibilidad VISIBILIDAD_EDEFAULT = Visibilidad.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibilidad() <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilidad()
	 * @generated
	 * @ordered
	 */
	protected Visibilidad visibilidad = VISIBILIDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsConstante() <em>Is Constante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConstante()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONSTANTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConstante() <em>Is Constante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConstante()
	 * @generated
	 * @ordered
	 */
	protected boolean isConstante = IS_CONSTANTE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getValorDefecto() <em>Valor Defecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorDefecto()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_DEFECTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValorDefecto() <em>Valor Defecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorDefecto()
	 * @generated
	 * @ordered
	 */
	protected String valorDefecto = VALOR_DEFECTO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TcdAtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.TCD_ATRIBUTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_ATRIBUTO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato getTipoDato() {
		return tipoDato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoDato(TipoDato newTipoDato) {
		TipoDato oldTipoDato = tipoDato;
		tipoDato = newTipoDato == null ? TIPO_DATO_EDEFAULT : newTipoDato;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_ATRIBUTO__TIPO_DATO, oldTipoDato, tipoDato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibilidad getVisibilidad() {
		return visibilidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibilidad(Visibilidad newVisibilidad) {
		Visibilidad oldVisibilidad = visibilidad;
		visibilidad = newVisibilidad == null ? VISIBILIDAD_EDEFAULT : newVisibilidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_ATRIBUTO__VISIBILIDAD, oldVisibilidad, visibilidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConstante() {
		return isConstante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConstante(boolean newIsConstante) {
		boolean oldIsConstante = isConstante;
		isConstante = newIsConstante;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_ATRIBUTO__IS_CONSTANTE, oldIsConstante, isConstante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_ATRIBUTO__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValorDefecto() {
		return valorDefecto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorDefecto(String newValorDefecto) {
		String oldValorDefecto = valorDefecto;
		valorDefecto = newValorDefecto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_ATRIBUTO__VALOR_DEFECTO, oldValorDefecto, valorDefecto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractaPackage.TCD_ATRIBUTO__NOMBRE:
				return getNombre();
			case AbstractaPackage.TCD_ATRIBUTO__TIPO_DATO:
				return getTipoDato();
			case AbstractaPackage.TCD_ATRIBUTO__VISIBILIDAD:
				return getVisibilidad();
			case AbstractaPackage.TCD_ATRIBUTO__IS_CONSTANTE:
				return isIsConstante();
			case AbstractaPackage.TCD_ATRIBUTO__IS_STATIC:
				return isIsStatic();
			case AbstractaPackage.TCD_ATRIBUTO__VALOR_DEFECTO:
				return getValorDefecto();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AbstractaPackage.TCD_ATRIBUTO__NOMBRE:
				setNombre((String)newValue);
				return;
			case AbstractaPackage.TCD_ATRIBUTO__TIPO_DATO:
				setTipoDato((TipoDato)newValue);
				return;
			case AbstractaPackage.TCD_ATRIBUTO__VISIBILIDAD:
				setVisibilidad((Visibilidad)newValue);
				return;
			case AbstractaPackage.TCD_ATRIBUTO__IS_CONSTANTE:
				setIsConstante((Boolean)newValue);
				return;
			case AbstractaPackage.TCD_ATRIBUTO__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case AbstractaPackage.TCD_ATRIBUTO__VALOR_DEFECTO:
				setValorDefecto((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AbstractaPackage.TCD_ATRIBUTO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case AbstractaPackage.TCD_ATRIBUTO__TIPO_DATO:
				setTipoDato(TIPO_DATO_EDEFAULT);
				return;
			case AbstractaPackage.TCD_ATRIBUTO__VISIBILIDAD:
				setVisibilidad(VISIBILIDAD_EDEFAULT);
				return;
			case AbstractaPackage.TCD_ATRIBUTO__IS_CONSTANTE:
				setIsConstante(IS_CONSTANTE_EDEFAULT);
				return;
			case AbstractaPackage.TCD_ATRIBUTO__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case AbstractaPackage.TCD_ATRIBUTO__VALOR_DEFECTO:
				setValorDefecto(VALOR_DEFECTO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AbstractaPackage.TCD_ATRIBUTO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case AbstractaPackage.TCD_ATRIBUTO__TIPO_DATO:
				return tipoDato != TIPO_DATO_EDEFAULT;
			case AbstractaPackage.TCD_ATRIBUTO__VISIBILIDAD:
				return visibilidad != VISIBILIDAD_EDEFAULT;
			case AbstractaPackage.TCD_ATRIBUTO__IS_CONSTANTE:
				return isConstante != IS_CONSTANTE_EDEFAULT;
			case AbstractaPackage.TCD_ATRIBUTO__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case AbstractaPackage.TCD_ATRIBUTO__VALOR_DEFECTO:
				return VALOR_DEFECTO_EDEFAULT == null ? valorDefecto != null : !VALOR_DEFECTO_EDEFAULT.equals(valorDefecto);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", tipoDato: ");
		result.append(tipoDato);
		result.append(", visibilidad: ");
		result.append(visibilidad);
		result.append(", isConstante: ");
		result.append(isConstante);
		result.append(", isStatic: ");
		result.append(isStatic);
		result.append(", valorDefecto: ");
		result.append(valorDefecto);
		result.append(')');
		return result.toString();
	}

} //TcdAtributoImpl
