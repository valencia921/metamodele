/**
 */
package diagrama_concreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tcd Metodo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagrama_concreta.TcdMetodo#getListaParametros <em>Lista Parametros</em>}</li>
 *   <li>{@link diagrama_concreta.TcdMetodo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagrama_concreta.TcdMetodo#getModificadorAcceso <em>Modificador Acceso</em>}</li>
 *   <li>{@link diagrama_concreta.TcdMetodo#getTipoRetorno <em>Tipo Retorno</em>}</li>
 *   <li>{@link diagrama_concreta.TcdMetodo#getSemantica <em>Semantica</em>}</li>
 * </ul>
 *
 * @see diagrama_concreta.Diagrama_concretaPackage#getTcdMetodo()
 * @model annotation="gmf.node label='nombre'"
 * @generated
 */
public interface TcdMetodo extends EObject {
	/**
	 * Returns the value of the '<em><b>Lista Parametros</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama_concreta.TcdParametro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Parametros</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Parametros</em>' containment reference list.
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTcdMetodo_ListaParametros()
	 * @model containment="true"
	 * @generated
	 */
	EList<TcdParametro> getListaParametros();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTcdMetodo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TcdMetodo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Modificador Acceso</b></em>' attribute.
	 * The literals are from the enumeration {@link diagrama_concreta.Visibilidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modificador Acceso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modificador Acceso</em>' attribute.
	 * @see diagrama_concreta.Visibilidad
	 * @see #setModificadorAcceso(Visibilidad)
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTcdMetodo_ModificadorAcceso()
	 * @model
	 * @generated
	 */
	Visibilidad getModificadorAcceso();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TcdMetodo#getModificadorAcceso <em>Modificador Acceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modificador Acceso</em>' attribute.
	 * @see diagrama_concreta.Visibilidad
	 * @see #getModificadorAcceso()
	 * @generated
	 */
	void setModificadorAcceso(Visibilidad value);

	/**
	 * Returns the value of the '<em><b>Tipo Retorno</b></em>' attribute.
	 * The literals are from the enumeration {@link diagrama_concreta.TipoRetorno}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Retorno</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Retorno</em>' attribute.
	 * @see diagrama_concreta.TipoRetorno
	 * @see #setTipoRetorno(TipoRetorno)
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTcdMetodo_TipoRetorno()
	 * @model
	 * @generated
	 */
	TipoRetorno getTipoRetorno();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TcdMetodo#getTipoRetorno <em>Tipo Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Retorno</em>' attribute.
	 * @see diagrama_concreta.TipoRetorno
	 * @see #getTipoRetorno()
	 * @generated
	 */
	void setTipoRetorno(TipoRetorno value);

	/**
	 * Returns the value of the '<em><b>Semantica</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantica</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantica</em>' attribute.
	 * @see #setSemantica(String)
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTcdMetodo_Semantica()
	 * @model
	 * @generated
	 */
	String getSemantica();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TcdMetodo#getSemantica <em>Semantica</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantica</em>' attribute.
	 * @see #getSemantica()
	 * @generated
	 */
	void setSemantica(String value);

} // TcdMetodo
