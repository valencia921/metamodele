/**
 */
package diagrama_concreta.impl;

import diagrama_concreta.Diagrama_concretaPackage;
import diagrama_concreta.TcdClase;
import diagrama_concreta.TcdRelacion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tcd Relacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagrama_concreta.impl.TcdRelacionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link diagrama_concreta.impl.TcdRelacionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link diagrama_concreta.impl.TcdRelacionImpl#getNavegavilidad <em>Navegavilidad</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TcdRelacionImpl extends EObjectImpl implements TcdRelacion {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected TcdClase source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TcdClase target;

	/**
	 * The default value of the '{@link #getNavegavilidad() <em>Navegavilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavegavilidad()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVEGAVILIDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavegavilidad() <em>Navegavilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavegavilidad()
	 * @generated
	 * @ordered
	 */
	protected String navegavilidad = NAVEGAVILIDAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TcdRelacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diagrama_concretaPackage.Literals.TCD_RELACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcdClase getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (TcdClase)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Diagrama_concretaPackage.TCD_RELACION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcdClase basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(TcdClase newSource) {
		TcdClase oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.TCD_RELACION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcdClase getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (TcdClase)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Diagrama_concretaPackage.TCD_RELACION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcdClase basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TcdClase newTarget) {
		TcdClase oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.TCD_RELACION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNavegavilidad() {
		return navegavilidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavegavilidad(String newNavegavilidad) {
		String oldNavegavilidad = navegavilidad;
		navegavilidad = newNavegavilidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.TCD_RELACION__NAVEGAVILIDAD, oldNavegavilidad, navegavilidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Diagrama_concretaPackage.TCD_RELACION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Diagrama_concretaPackage.TCD_RELACION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case Diagrama_concretaPackage.TCD_RELACION__NAVEGAVILIDAD:
				return getNavegavilidad();
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
			case Diagrama_concretaPackage.TCD_RELACION__SOURCE:
				setSource((TcdClase)newValue);
				return;
			case Diagrama_concretaPackage.TCD_RELACION__TARGET:
				setTarget((TcdClase)newValue);
				return;
			case Diagrama_concretaPackage.TCD_RELACION__NAVEGAVILIDAD:
				setNavegavilidad((String)newValue);
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
			case Diagrama_concretaPackage.TCD_RELACION__SOURCE:
				setSource((TcdClase)null);
				return;
			case Diagrama_concretaPackage.TCD_RELACION__TARGET:
				setTarget((TcdClase)null);
				return;
			case Diagrama_concretaPackage.TCD_RELACION__NAVEGAVILIDAD:
				setNavegavilidad(NAVEGAVILIDAD_EDEFAULT);
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
			case Diagrama_concretaPackage.TCD_RELACION__SOURCE:
				return source != null;
			case Diagrama_concretaPackage.TCD_RELACION__TARGET:
				return target != null;
			case Diagrama_concretaPackage.TCD_RELACION__NAVEGAVILIDAD:
				return NAVEGAVILIDAD_EDEFAULT == null ? navegavilidad != null : !NAVEGAVILIDAD_EDEFAULT.equals(navegavilidad);
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
		result.append(" (navegavilidad: ");
		result.append(navegavilidad);
		result.append(')');
		return result.toString();
	}

} //TcdRelacionImpl
