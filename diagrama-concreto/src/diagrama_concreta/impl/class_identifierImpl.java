/**
 */
package diagrama_concreta.impl;

import diagrama_concreta.Diagrama_concretaPackage;
import diagrama_concreta.TCDAtributo;
import diagrama_concreta.class_identifier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>class identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagrama_concreta.impl.class_identifierImpl#getIdentificador <em>Identificador</em>}</li>
 * </ul>
 *
 * @generated
 */
public class class_identifierImpl extends EObjectImpl implements class_identifier {
	/**
	 * The cached value of the '{@link #getIdentificador() <em>Identificador</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificador()
	 * @generated
	 * @ordered
	 */
	protected TCDAtributo identificador;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected class_identifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diagrama_concretaPackage.Literals.CLASS_IDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDAtributo getIdentificador() {
		if (identificador != null && identificador.eIsProxy()) {
			InternalEObject oldIdentificador = (InternalEObject)identificador;
			identificador = (TCDAtributo)eResolveProxy(oldIdentificador);
			if (identificador != oldIdentificador) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Diagrama_concretaPackage.CLASS_IDENTIFIER__IDENTIFICADOR, oldIdentificador, identificador));
			}
		}
		return identificador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDAtributo basicGetIdentificador() {
		return identificador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentificador(TCDAtributo newIdentificador) {
		TCDAtributo oldIdentificador = identificador;
		identificador = newIdentificador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.CLASS_IDENTIFIER__IDENTIFICADOR, oldIdentificador, identificador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Diagrama_concretaPackage.CLASS_IDENTIFIER__IDENTIFICADOR:
				if (resolve) return getIdentificador();
				return basicGetIdentificador();
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
			case Diagrama_concretaPackage.CLASS_IDENTIFIER__IDENTIFICADOR:
				setIdentificador((TCDAtributo)newValue);
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
			case Diagrama_concretaPackage.CLASS_IDENTIFIER__IDENTIFICADOR:
				setIdentificador((TCDAtributo)null);
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
			case Diagrama_concretaPackage.CLASS_IDENTIFIER__IDENTIFICADOR:
				return identificador != null;
		}
		return super.eIsSet(featureID);
	}

} //class_identifierImpl
