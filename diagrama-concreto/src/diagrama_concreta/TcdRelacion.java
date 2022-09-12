/**
 */
package diagrama_concreta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tcd Relacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagrama_concreta.TcdRelacion#getSource <em>Source</em>}</li>
 *   <li>{@link diagrama_concreta.TcdRelacion#getTarget <em>Target</em>}</li>
 *   <li>{@link diagrama_concreta.TcdRelacion#getNavegavilidad <em>Navegavilidad</em>}</li>
 * </ul>
 *
 * @see diagrama_concreta.Diagrama_concretaPackage#getTcdRelacion()
 * @model abstract="true"
 *        annotation="gmf.link source='source' target='target' style='solid' width='2'"
 * @generated
 */
public interface TcdRelacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TcdClase)
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTcdRelacion_Source()
	 * @model
	 * @generated
	 */
	TcdClase getSource();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TcdRelacion#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TcdClase value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TcdClase)
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTcdRelacion_Target()
	 * @model
	 * @generated
	 */
	TcdClase getTarget();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TcdRelacion#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TcdClase value);

	/**
	 * Returns the value of the '<em><b>Navegavilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navegavilidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navegavilidad</em>' attribute.
	 * @see #setNavegavilidad(String)
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTcdRelacion_Navegavilidad()
	 * @model
	 * @generated
	 */
	String getNavegavilidad();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TcdRelacion#getNavegavilidad <em>Navegavilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navegavilidad</em>' attribute.
	 * @see #getNavegavilidad()
	 * @generated
	 */
	void setNavegavilidad(String value);

} // TcdRelacion
