/**
 */
package abstracta_relacional;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta_relacional.ForeignKey#getTableReferenced <em>Table Referenced</em>}</li>
 * </ul>
 *
 * @see abstracta_relacional.Abstracta_relacionalPackage#getForeignKey()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface ForeignKey extends Column {
	/**
	 * Returns the value of the '<em><b>Table Referenced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Referenced</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Referenced</em>' reference.
	 * @see #setTableReferenced(Table)
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getForeignKey_TableReferenced()
	 * @model
	 * @generated
	 */
	Table getTableReferenced();

	/**
	 * Sets the value of the '{@link abstracta_relacional.ForeignKey#getTableReferenced <em>Table Referenced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Referenced</em>' reference.
	 * @see #getTableReferenced()
	 * @generated
	 */
	void setTableReferenced(Table value);

} // ForeignKey
