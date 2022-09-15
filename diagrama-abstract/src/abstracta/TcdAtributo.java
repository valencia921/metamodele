/**
 */
package abstracta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCD Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.TCDAtributo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.TCDAtributo#getTipoDato <em>Tipo Dato</em>}</li>
 *   <li>{@link abstracta.TCDAtributo#getVisibilidad <em>Visibilidad</em>}</li>
 *   <li>{@link abstracta.TCDAtributo#isIsConstante <em>Is Constante</em>}</li>
 *   <li>{@link abstracta.TCDAtributo#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link abstracta.TCDAtributo#getValorDefecto <em>Valor Defecto</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getTCDAtributo()
 * @model
 * @generated
 */
public interface TCDAtributo extends EObject {
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
	 * @see abstracta.AbstractaPackage#getTCDAtributo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link abstracta.TCDAtributo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Dato</b></em>' attribute.
	 * The literals are from the enumeration {@link abstracta.TipoDato}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Dato</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Dato</em>' attribute.
	 * @see abstracta.TipoDato
	 * @see #setTipoDato(TipoDato)
	 * @see abstracta.AbstractaPackage#getTCDAtributo_TipoDato()
	 * @model
	 * @generated
	 */
	TipoDato getTipoDato();

	/**
	 * Sets the value of the '{@link abstracta.TCDAtributo#getTipoDato <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Dato</em>' attribute.
	 * @see abstracta.TipoDato
	 * @see #getTipoDato()
	 * @generated
	 */
	void setTipoDato(TipoDato value);

	/**
	 * Returns the value of the '<em><b>Visibilidad</b></em>' attribute.
	 * The literals are from the enumeration {@link abstracta.Visibilidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibilidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibilidad</em>' attribute.
	 * @see abstracta.Visibilidad
	 * @see #setVisibilidad(Visibilidad)
	 * @see abstracta.AbstractaPackage#getTCDAtributo_Visibilidad()
	 * @model
	 * @generated
	 */
	Visibilidad getVisibilidad();

	/**
	 * Sets the value of the '{@link abstracta.TCDAtributo#getVisibilidad <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibilidad</em>' attribute.
	 * @see abstracta.Visibilidad
	 * @see #getVisibilidad()
	 * @generated
	 */
	void setVisibilidad(Visibilidad value);

	/**
	 * Returns the value of the '<em><b>Is Constante</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Constante</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Constante</em>' attribute.
	 * @see #setIsConstante(boolean)
	 * @see abstracta.AbstractaPackage#getTCDAtributo_IsConstante()
	 * @model
	 * @generated
	 */
	boolean isIsConstante();

	/**
	 * Sets the value of the '{@link abstracta.TCDAtributo#isIsConstante <em>Is Constante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Constante</em>' attribute.
	 * @see #isIsConstante()
	 * @generated
	 */
	void setIsConstante(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see abstracta.AbstractaPackage#getTCDAtributo_IsStatic()
	 * @model
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link abstracta.TCDAtributo#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Valor Defecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor Defecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Defecto</em>' attribute.
	 * @see #setValorDefecto(String)
	 * @see abstracta.AbstractaPackage#getTCDAtributo_ValorDefecto()
	 * @model
	 * @generated
	 */
	String getValorDefecto();

	/**
	 * Sets the value of the '{@link abstracta.TCDAtributo#getValorDefecto <em>Valor Defecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Defecto</em>' attribute.
	 * @see #getValorDefecto()
	 * @generated
	 */
	void setValorDefecto(String value);

} // TCDAtributo
