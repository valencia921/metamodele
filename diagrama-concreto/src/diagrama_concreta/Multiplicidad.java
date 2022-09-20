/**
 */
package diagrama_concreta;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Multiplicidad</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see diagrama_concreta.Diagrama_concretaPackage#getMultiplicidad()
 * @model
 * @generated
 */
public enum Multiplicidad implements Enumerator {
	/**
	 * The '<em><b>UNO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNO_VALUE
	 * @generated
	 * @ordered
	 */
	UNO(0, "UNO", "UNO"),

	/**
	 * The '<em><b>CERO UNO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERO_UNO_VALUE
	 * @generated
	 * @ordered
	 */
	CERO_UNO(1, "CERO_UNO", "CERO_UNO"),

	/**
	 * The '<em><b>CERO MUCHOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERO_MUCHOS_VALUE
	 * @generated
	 * @ordered
	 */
	CERO_MUCHOS(2, "CERO_MUCHOS", "CERO_MUCHOS"),

	/**
	 * The '<em><b>UNO MUCHOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNO_MUCHOS_VALUE
	 * @generated
	 * @ordered
	 */
	UNO_MUCHOS(3, "UNO_MUCHOS", "UNO_MUCHOS");

	/**
	 * The '<em><b>UNO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNO_VALUE = 0;

	/**
	 * The '<em><b>CERO UNO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CERO UNO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CERO_UNO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CERO_UNO_VALUE = 1;

	/**
	 * The '<em><b>CERO MUCHOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CERO MUCHOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CERO_MUCHOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CERO_MUCHOS_VALUE = 2;

	/**
	 * The '<em><b>UNO MUCHOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNO MUCHOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNO_MUCHOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNO_MUCHOS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Multiplicidad</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Multiplicidad[] VALUES_ARRAY =
		new Multiplicidad[] {
			UNO,
			CERO_UNO,
			CERO_MUCHOS,
			UNO_MUCHOS,
		};

	/**
	 * A public read-only list of all the '<em><b>Multiplicidad</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Multiplicidad> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Multiplicidad</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Multiplicidad get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Multiplicidad result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplicidad</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Multiplicidad getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Multiplicidad result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplicidad</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Multiplicidad get(int value) {
		switch (value) {
			case UNO_VALUE: return UNO;
			case CERO_UNO_VALUE: return CERO_UNO;
			case CERO_MUCHOS_VALUE: return CERO_MUCHOS;
			case UNO_MUCHOS_VALUE: return UNO_MUCHOS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Multiplicidad(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Multiplicidad
