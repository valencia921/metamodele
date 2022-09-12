/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.TcdAtributo;
import abstracta.TcdClase;
import abstracta.TcdMetodo;
import abstracta.TcdRelacion;
import abstracta.Visibilidad;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tcd Clase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.TcdClaseImpl#getListaAtributos <em>Lista Atributos</em>}</li>
 *   <li>{@link abstracta.impl.TcdClaseImpl#getListaMetodos <em>Lista Metodos</em>}</li>
 *   <li>{@link abstracta.impl.TcdClaseImpl#getListaRelaciones <em>Lista Relaciones</em>}</li>
 *   <li>{@link abstracta.impl.TcdClaseImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.impl.TcdClaseImpl#getEstereotipo <em>Estereotipo</em>}</li>
 *   <li>{@link abstracta.impl.TcdClaseImpl#getModificadorAcceso <em>Modificador Acceso</em>}</li>
 *   <li>{@link abstracta.impl.TcdClaseImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link abstracta.impl.TcdClaseImpl#getDocumentacion <em>Documentacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TcdClaseImpl extends EObjectImpl implements TcdClase {
	/**
	 * The cached value of the '{@link #getListaAtributos() <em>Lista Atributos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaAtributos()
	 * @generated
	 * @ordered
	 */
	protected EList<TcdAtributo> listaAtributos;

	/**
	 * The cached value of the '{@link #getListaMetodos() <em>Lista Metodos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaMetodos()
	 * @generated
	 * @ordered
	 */
	protected EList<TcdMetodo> listaMetodos;

	/**
	 * The cached value of the '{@link #getListaRelaciones() <em>Lista Relaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaRelaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<TcdRelacion> listaRelaciones;

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
	 * The default value of the '{@link #getEstereotipo() <em>Estereotipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstereotipo()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTEREOTIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstereotipo() <em>Estereotipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstereotipo()
	 * @generated
	 * @ordered
	 */
	protected String estereotipo = ESTEREOTIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getModificadorAcceso() <em>Modificador Acceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificadorAcceso()
	 * @generated
	 * @ordered
	 */
	protected static final Visibilidad MODIFICADOR_ACCESO_EDEFAULT = Visibilidad.PUBLIC;

	/**
	 * The cached value of the '{@link #getModificadorAcceso() <em>Modificador Acceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificadorAcceso()
	 * @generated
	 * @ordered
	 */
	protected Visibilidad modificadorAcceso = MODIFICADOR_ACCESO_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentacion() <em>Documentacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentacion()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentacion() <em>Documentacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentacion()
	 * @generated
	 * @ordered
	 */
	protected String documentacion = DOCUMENTACION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TcdClaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.TCD_CLASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TcdAtributo> getListaAtributos() {
		if (listaAtributos == null) {
			listaAtributos = new EObjectContainmentEList<TcdAtributo>(TcdAtributo.class, this, AbstractaPackage.TCD_CLASE__LISTA_ATRIBUTOS);
		}
		return listaAtributos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TcdMetodo> getListaMetodos() {
		if (listaMetodos == null) {
			listaMetodos = new EObjectContainmentEList<TcdMetodo>(TcdMetodo.class, this, AbstractaPackage.TCD_CLASE__LISTA_METODOS);
		}
		return listaMetodos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TcdRelacion> getListaRelaciones() {
		if (listaRelaciones == null) {
			listaRelaciones = new EObjectContainmentEList<TcdRelacion>(TcdRelacion.class, this, AbstractaPackage.TCD_CLASE__LISTA_RELACIONES);
		}
		return listaRelaciones;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_CLASE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstereotipo() {
		return estereotipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstereotipo(String newEstereotipo) {
		String oldEstereotipo = estereotipo;
		estereotipo = newEstereotipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_CLASE__ESTEREOTIPO, oldEstereotipo, estereotipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibilidad getModificadorAcceso() {
		return modificadorAcceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificadorAcceso(Visibilidad newModificadorAcceso) {
		Visibilidad oldModificadorAcceso = modificadorAcceso;
		modificadorAcceso = newModificadorAcceso == null ? MODIFICADOR_ACCESO_EDEFAULT : newModificadorAcceso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_CLASE__MODIFICADOR_ACCESO, oldModificadorAcceso, modificadorAcceso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_CLASE__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentacion() {
		return documentacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentacion(String newDocumentacion) {
		String oldDocumentacion = documentacion;
		documentacion = newDocumentacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_CLASE__DOCUMENTACION, oldDocumentacion, documentacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractaPackage.TCD_CLASE__LISTA_ATRIBUTOS:
				return ((InternalEList<?>)getListaAtributos()).basicRemove(otherEnd, msgs);
			case AbstractaPackage.TCD_CLASE__LISTA_METODOS:
				return ((InternalEList<?>)getListaMetodos()).basicRemove(otherEnd, msgs);
			case AbstractaPackage.TCD_CLASE__LISTA_RELACIONES:
				return ((InternalEList<?>)getListaRelaciones()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractaPackage.TCD_CLASE__LISTA_ATRIBUTOS:
				return getListaAtributos();
			case AbstractaPackage.TCD_CLASE__LISTA_METODOS:
				return getListaMetodos();
			case AbstractaPackage.TCD_CLASE__LISTA_RELACIONES:
				return getListaRelaciones();
			case AbstractaPackage.TCD_CLASE__NOMBRE:
				return getNombre();
			case AbstractaPackage.TCD_CLASE__ESTEREOTIPO:
				return getEstereotipo();
			case AbstractaPackage.TCD_CLASE__MODIFICADOR_ACCESO:
				return getModificadorAcceso();
			case AbstractaPackage.TCD_CLASE__IS_ABSTRACT:
				return isIsAbstract();
			case AbstractaPackage.TCD_CLASE__DOCUMENTACION:
				return getDocumentacion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AbstractaPackage.TCD_CLASE__LISTA_ATRIBUTOS:
				getListaAtributos().clear();
				getListaAtributos().addAll((Collection<? extends TcdAtributo>)newValue);
				return;
			case AbstractaPackage.TCD_CLASE__LISTA_METODOS:
				getListaMetodos().clear();
				getListaMetodos().addAll((Collection<? extends TcdMetodo>)newValue);
				return;
			case AbstractaPackage.TCD_CLASE__LISTA_RELACIONES:
				getListaRelaciones().clear();
				getListaRelaciones().addAll((Collection<? extends TcdRelacion>)newValue);
				return;
			case AbstractaPackage.TCD_CLASE__NOMBRE:
				setNombre((String)newValue);
				return;
			case AbstractaPackage.TCD_CLASE__ESTEREOTIPO:
				setEstereotipo((String)newValue);
				return;
			case AbstractaPackage.TCD_CLASE__MODIFICADOR_ACCESO:
				setModificadorAcceso((Visibilidad)newValue);
				return;
			case AbstractaPackage.TCD_CLASE__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case AbstractaPackage.TCD_CLASE__DOCUMENTACION:
				setDocumentacion((String)newValue);
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
			case AbstractaPackage.TCD_CLASE__LISTA_ATRIBUTOS:
				getListaAtributos().clear();
				return;
			case AbstractaPackage.TCD_CLASE__LISTA_METODOS:
				getListaMetodos().clear();
				return;
			case AbstractaPackage.TCD_CLASE__LISTA_RELACIONES:
				getListaRelaciones().clear();
				return;
			case AbstractaPackage.TCD_CLASE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case AbstractaPackage.TCD_CLASE__ESTEREOTIPO:
				setEstereotipo(ESTEREOTIPO_EDEFAULT);
				return;
			case AbstractaPackage.TCD_CLASE__MODIFICADOR_ACCESO:
				setModificadorAcceso(MODIFICADOR_ACCESO_EDEFAULT);
				return;
			case AbstractaPackage.TCD_CLASE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case AbstractaPackage.TCD_CLASE__DOCUMENTACION:
				setDocumentacion(DOCUMENTACION_EDEFAULT);
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
			case AbstractaPackage.TCD_CLASE__LISTA_ATRIBUTOS:
				return listaAtributos != null && !listaAtributos.isEmpty();
			case AbstractaPackage.TCD_CLASE__LISTA_METODOS:
				return listaMetodos != null && !listaMetodos.isEmpty();
			case AbstractaPackage.TCD_CLASE__LISTA_RELACIONES:
				return listaRelaciones != null && !listaRelaciones.isEmpty();
			case AbstractaPackage.TCD_CLASE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case AbstractaPackage.TCD_CLASE__ESTEREOTIPO:
				return ESTEREOTIPO_EDEFAULT == null ? estereotipo != null : !ESTEREOTIPO_EDEFAULT.equals(estereotipo);
			case AbstractaPackage.TCD_CLASE__MODIFICADOR_ACCESO:
				return modificadorAcceso != MODIFICADOR_ACCESO_EDEFAULT;
			case AbstractaPackage.TCD_CLASE__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case AbstractaPackage.TCD_CLASE__DOCUMENTACION:
				return DOCUMENTACION_EDEFAULT == null ? documentacion != null : !DOCUMENTACION_EDEFAULT.equals(documentacion);
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
		result.append(", estereotipo: ");
		result.append(estereotipo);
		result.append(", modificadorAcceso: ");
		result.append(modificadorAcceso);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", documentacion: ");
		result.append(documentacion);
		result.append(')');
		return result.toString();
	}

} //TcdClaseImpl
