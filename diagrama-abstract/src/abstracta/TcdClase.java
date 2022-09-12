/**
 */
package abstracta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tcd Clase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.TcdClase#getListaAtributos <em>Lista Atributos</em>}</li>
 *   <li>{@link abstracta.TcdClase#getListaMetodos <em>Lista Metodos</em>}</li>
 *   <li>{@link abstracta.TcdClase#getListaRelaciones <em>Lista Relaciones</em>}</li>
 *   <li>{@link abstracta.TcdClase#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.TcdClase#getEstereotipo <em>Estereotipo</em>}</li>
 *   <li>{@link abstracta.TcdClase#getModificadorAcceso <em>Modificador Acceso</em>}</li>
 *   <li>{@link abstracta.TcdClase#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link abstracta.TcdClase#getDocumentacion <em>Documentacion</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getTcdClase()
 * @model
 * @generated
 */
public interface TcdClase extends EObject {
	/**
	 * Returns the value of the '<em><b>Lista Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.TcdAtributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Atributos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Atributos</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getTcdClase_ListaAtributos()
	 * @model containment="true"
	 * @generated
	 */
	EList<TcdAtributo> getListaAtributos();

	/**
	 * Returns the value of the '<em><b>Lista Metodos</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.TcdMetodo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Metodos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Metodos</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getTcdClase_ListaMetodos()
	 * @model containment="true"
	 * @generated
	 */
	EList<TcdMetodo> getListaMetodos();

	/**
	 * Returns the value of the '<em><b>Lista Relaciones</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.TcdRelacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Relaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Relaciones</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getTcdClase_ListaRelaciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<TcdRelacion> getListaRelaciones();

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
	 * @see abstracta.AbstractaPackage#getTcdClase_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link abstracta.TcdClase#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Estereotipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estereotipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estereotipo</em>' attribute.
	 * @see #setEstereotipo(String)
	 * @see abstracta.AbstractaPackage#getTcdClase_Estereotipo()
	 * @model
	 * @generated
	 */
	String getEstereotipo();

	/**
	 * Sets the value of the '{@link abstracta.TcdClase#getEstereotipo <em>Estereotipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estereotipo</em>' attribute.
	 * @see #getEstereotipo()
	 * @generated
	 */
	void setEstereotipo(String value);

	/**
	 * Returns the value of the '<em><b>Modificador Acceso</b></em>' attribute.
	 * The literals are from the enumeration {@link abstracta.Visibilidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modificador Acceso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modificador Acceso</em>' attribute.
	 * @see abstracta.Visibilidad
	 * @see #setModificadorAcceso(Visibilidad)
	 * @see abstracta.AbstractaPackage#getTcdClase_ModificadorAcceso()
	 * @model
	 * @generated
	 */
	Visibilidad getModificadorAcceso();

	/**
	 * Sets the value of the '{@link abstracta.TcdClase#getModificadorAcceso <em>Modificador Acceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modificador Acceso</em>' attribute.
	 * @see abstracta.Visibilidad
	 * @see #getModificadorAcceso()
	 * @generated
	 */
	void setModificadorAcceso(Visibilidad value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see abstracta.AbstractaPackage#getTcdClase_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link abstracta.TcdClase#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Documentacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentacion</em>' attribute.
	 * @see #setDocumentacion(String)
	 * @see abstracta.AbstractaPackage#getTcdClase_Documentacion()
	 * @model
	 * @generated
	 */
	String getDocumentacion();

	/**
	 * Sets the value of the '{@link abstracta.TcdClase#getDocumentacion <em>Documentacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentacion</em>' attribute.
	 * @see #getDocumentacion()
	 * @generated
	 */
	void setDocumentacion(String value);

} // TcdClase
