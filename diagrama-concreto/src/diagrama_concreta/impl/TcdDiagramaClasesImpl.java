/**
 */
package diagrama_concreta.impl;

import diagrama_concreta.Diagrama_concretaPackage;
import diagrama_concreta.TcdClase;
import diagrama_concreta.TcdDiagramaClases;
import diagrama_concreta.TcdRelacion;

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
 * An implementation of the model object '<em><b>Tcd Diagrama Clases</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagrama_concreta.impl.TcdDiagramaClasesImpl#getListaClases <em>Lista Clases</em>}</li>
 *   <li>{@link diagrama_concreta.impl.TcdDiagramaClasesImpl#getListaRelaciones <em>Lista Relaciones</em>}</li>
 *   <li>{@link diagrama_concreta.impl.TcdDiagramaClasesImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TcdDiagramaClasesImpl extends EObjectImpl implements TcdDiagramaClases {
	/**
	 * The cached value of the '{@link #getListaClases() <em>Lista Clases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaClases()
	 * @generated
	 * @ordered
	 */
	protected EList<TcdClase> listaClases;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TcdDiagramaClasesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diagrama_concretaPackage.Literals.TCD_DIAGRAMA_CLASES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TcdClase> getListaClases() {
		if (listaClases == null) {
			listaClases = new EObjectContainmentEList<TcdClase>(TcdClase.class, this, Diagrama_concretaPackage.TCD_DIAGRAMA_CLASES__LISTA_CLASES);
		}
		return listaClases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TcdRelacion> getListaRelaciones() {
		if (listaRelaciones == null) {
			listaRelaciones = new EObjectContainmentEList<TcdRelacion>(TcdRelacion.class, this, Diagrama_concretaPackage.TCD_DIAGRAMA_CLASES__LISTA_RELACIONES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.TCD_DIAGRAMA_CLASES__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Diagrama_concretaPackage.TCD_DIAGRAMA_CLASES__LISTA_CLASES:
				return ((InternalEList<?>)getListaClases()).basicRemove(otherEnd, msgs);
			case Diagrama_concretaPackage.TCD_DIAGRAMA_CLASES__LISTA_RELACIONES:
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
			case Diagrama_concretaPackage.TCD_DIAGRAMA_CLASES__LISTA_CLASES:
				return getListaClases();
			case Diagrama_concretaPackage.TCD_DIAGRAMA_CLASES__LISTA_RELACIONES:
				return getListaRelaciones();
			case Diagrama_concretaPackage.TCD_DIAGRAMA_CLASES__NOMBRE:
				return getNombre();
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
			case Diagrama_concretaPackage.TCD_DIAGRAMA_CLASES__LISTA_CLASES:
				getListaClases().clear();
				getListaClases().addAll((Collection<? extends TcdClase>)newValue);
				return;
			case Diagrama_concretaPackage.TCD_DIAGRAMA_CLASES__LISTA_RELACIONES:
				getListaRelaciones().clear();
				getListaRelaciones().addAll((Collection<? extends TcdRelacion>)newValue);
				return;
			case Diagrama_concretaPackage.TCD_DIAGRAMA_CLASES__NOMBRE:
				setNombre((String)newValue);
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
			case Diagrama_concretaPackage.TCD_DIAGRAMA_CLASES__LISTA_CLASES:
				getListaClases().clear();
				return;
			case Diagrama_concretaPackage.TCD_DIAGRAMA_CLASES__LISTA_RELACIONES:
				getListaRelaciones().clear();
				return;
			case Diagrama_concretaPackage.TCD_DIAGRAMA_CLASES__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
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
			case Diagrama_concretaPackage.TCD_DIAGRAMA_CLASES__LISTA_CLASES:
				return listaClases != null && !listaClases.isEmpty();
			case Diagrama_concretaPackage.TCD_DIAGRAMA_CLASES__LISTA_RELACIONES:
				return listaRelaciones != null && !listaRelaciones.isEmpty();
			case Diagrama_concretaPackage.TCD_DIAGRAMA_CLASES__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
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
		result.append(')');
		return result.toString();
	}

} //TcdDiagramaClasesImpl
