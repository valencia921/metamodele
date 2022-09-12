/**
 */
package diagrama_concreta.impl;

import diagrama_concreta.Diagrama_concretaPackage;
import diagrama_concreta.Multiplicidad;
import diagrama_concreta.TcdAgregacion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tcd Agregacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagrama_concreta.impl.TcdAgregacionImpl#getNombreOrigen <em>Nombre Origen</em>}</li>
 *   <li>{@link diagrama_concreta.impl.TcdAgregacionImpl#getNombreDestino <em>Nombre Destino</em>}</li>
 *   <li>{@link diagrama_concreta.impl.TcdAgregacionImpl#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}</li>
 *   <li>{@link diagrama_concreta.impl.TcdAgregacionImpl#getMultiplicidadDestino <em>Multiplicidad Destino</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TcdAgregacionImpl extends TcdRelacionImpl implements TcdAgregacion {
	/**
	 * The default value of the '{@link #getNombreOrigen() <em>Nombre Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreOrigen()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_ORIGEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreOrigen() <em>Nombre Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreOrigen()
	 * @generated
	 * @ordered
	 */
	protected String nombreOrigen = NOMBRE_ORIGEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreDestino() <em>Nombre Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreDestino()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_DESTINO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreDestino() <em>Nombre Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreDestino()
	 * @generated
	 * @ordered
	 */
	protected String nombreDestino = NOMBRE_DESTINO_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicidadOrigen() <em>Multiplicidad Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadOrigen()
	 * @generated
	 * @ordered
	 */
	protected static final Multiplicidad MULTIPLICIDAD_ORIGEN_EDEFAULT = Multiplicidad.UNO;

	/**
	 * The cached value of the '{@link #getMultiplicidadOrigen() <em>Multiplicidad Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadOrigen()
	 * @generated
	 * @ordered
	 */
	protected Multiplicidad multiplicidadOrigen = MULTIPLICIDAD_ORIGEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicidadDestino() <em>Multiplicidad Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadDestino()
	 * @generated
	 * @ordered
	 */
	protected static final Multiplicidad MULTIPLICIDAD_DESTINO_EDEFAULT = Multiplicidad.UNO;

	/**
	 * The cached value of the '{@link #getMultiplicidadDestino() <em>Multiplicidad Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadDestino()
	 * @generated
	 * @ordered
	 */
	protected Multiplicidad multiplicidadDestino = MULTIPLICIDAD_DESTINO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TcdAgregacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diagrama_concretaPackage.Literals.TCD_AGREGACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreOrigen() {
		return nombreOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreOrigen(String newNombreOrigen) {
		String oldNombreOrigen = nombreOrigen;
		nombreOrigen = newNombreOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.TCD_AGREGACION__NOMBRE_ORIGEN, oldNombreOrigen, nombreOrigen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreDestino() {
		return nombreDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreDestino(String newNombreDestino) {
		String oldNombreDestino = nombreDestino;
		nombreDestino = newNombreDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.TCD_AGREGACION__NOMBRE_DESTINO, oldNombreDestino, nombreDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicidad getMultiplicidadOrigen() {
		return multiplicidadOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidadOrigen(Multiplicidad newMultiplicidadOrigen) {
		Multiplicidad oldMultiplicidadOrigen = multiplicidadOrigen;
		multiplicidadOrigen = newMultiplicidadOrigen == null ? MULTIPLICIDAD_ORIGEN_EDEFAULT : newMultiplicidadOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.TCD_AGREGACION__MULTIPLICIDAD_ORIGEN, oldMultiplicidadOrigen, multiplicidadOrigen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicidad getMultiplicidadDestino() {
		return multiplicidadDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidadDestino(Multiplicidad newMultiplicidadDestino) {
		Multiplicidad oldMultiplicidadDestino = multiplicidadDestino;
		multiplicidadDestino = newMultiplicidadDestino == null ? MULTIPLICIDAD_DESTINO_EDEFAULT : newMultiplicidadDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.TCD_AGREGACION__MULTIPLICIDAD_DESTINO, oldMultiplicidadDestino, multiplicidadDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Diagrama_concretaPackage.TCD_AGREGACION__NOMBRE_ORIGEN:
				return getNombreOrigen();
			case Diagrama_concretaPackage.TCD_AGREGACION__NOMBRE_DESTINO:
				return getNombreDestino();
			case Diagrama_concretaPackage.TCD_AGREGACION__MULTIPLICIDAD_ORIGEN:
				return getMultiplicidadOrigen();
			case Diagrama_concretaPackage.TCD_AGREGACION__MULTIPLICIDAD_DESTINO:
				return getMultiplicidadDestino();
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
			case Diagrama_concretaPackage.TCD_AGREGACION__NOMBRE_ORIGEN:
				setNombreOrigen((String)newValue);
				return;
			case Diagrama_concretaPackage.TCD_AGREGACION__NOMBRE_DESTINO:
				setNombreDestino((String)newValue);
				return;
			case Diagrama_concretaPackage.TCD_AGREGACION__MULTIPLICIDAD_ORIGEN:
				setMultiplicidadOrigen((Multiplicidad)newValue);
				return;
			case Diagrama_concretaPackage.TCD_AGREGACION__MULTIPLICIDAD_DESTINO:
				setMultiplicidadDestino((Multiplicidad)newValue);
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
			case Diagrama_concretaPackage.TCD_AGREGACION__NOMBRE_ORIGEN:
				setNombreOrigen(NOMBRE_ORIGEN_EDEFAULT);
				return;
			case Diagrama_concretaPackage.TCD_AGREGACION__NOMBRE_DESTINO:
				setNombreDestino(NOMBRE_DESTINO_EDEFAULT);
				return;
			case Diagrama_concretaPackage.TCD_AGREGACION__MULTIPLICIDAD_ORIGEN:
				setMultiplicidadOrigen(MULTIPLICIDAD_ORIGEN_EDEFAULT);
				return;
			case Diagrama_concretaPackage.TCD_AGREGACION__MULTIPLICIDAD_DESTINO:
				setMultiplicidadDestino(MULTIPLICIDAD_DESTINO_EDEFAULT);
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
			case Diagrama_concretaPackage.TCD_AGREGACION__NOMBRE_ORIGEN:
				return NOMBRE_ORIGEN_EDEFAULT == null ? nombreOrigen != null : !NOMBRE_ORIGEN_EDEFAULT.equals(nombreOrigen);
			case Diagrama_concretaPackage.TCD_AGREGACION__NOMBRE_DESTINO:
				return NOMBRE_DESTINO_EDEFAULT == null ? nombreDestino != null : !NOMBRE_DESTINO_EDEFAULT.equals(nombreDestino);
			case Diagrama_concretaPackage.TCD_AGREGACION__MULTIPLICIDAD_ORIGEN:
				return multiplicidadOrigen != MULTIPLICIDAD_ORIGEN_EDEFAULT;
			case Diagrama_concretaPackage.TCD_AGREGACION__MULTIPLICIDAD_DESTINO:
				return multiplicidadDestino != MULTIPLICIDAD_DESTINO_EDEFAULT;
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
		result.append(" (nombreOrigen: ");
		result.append(nombreOrigen);
		result.append(", nombreDestino: ");
		result.append(nombreDestino);
		result.append(", multiplicidadOrigen: ");
		result.append(multiplicidadOrigen);
		result.append(", multiplicidadDestino: ");
		result.append(multiplicidadDestino);
		result.append(')');
		return result.toString();
	}

} //TcdAgregacionImpl
