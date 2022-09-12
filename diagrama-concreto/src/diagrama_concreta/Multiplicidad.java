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
	 * The '<em><b>Uno</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNO_VALUE
	 * @generated
	 * @ordered
	 */
	UNO(0, "uno", "uno"),

	/**
	 * The '<em><b>Uno cero</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNO_CERO_VALUE
	 * @generated
	 * @ordered
	 */
	UNO_CERO(1, "uno_cero", "uno_cero"),

	/**
	 * The '<em><b>Cero varios</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERO_VARIOS_VALUE
	 * @generated
	 * @ordered
	 */
	CERO_VARIOS(2, "cero_varios", "cero_varios"),

	/**
	 * The '<em><b>Uno varios</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNO_VARIOS_VALUE
	 * @generated
	 * @ordered
	 */
	UNO_VARIOS(3, "uno_varios", "uno_varios");

	/**
	 * The '<em><b>Uno</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uno</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNO
	 * @model name="uno"
	 * @generated
	 * @ordered
	 */
	public static final int UNO_VALUE = 0;

	/**
	 * The '<em><b>Uno cero</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uno cero</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNO_CERO
	 * @model name="uno_cero"
	 * @generated
	 * @ordered
	 */
	public static final int UNO_CERO_VALUE = 1;

	/**
	 * The '<em><b>Cero varios</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cero varios</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CERO_VARIOS
	 * @model name="cero_varios"
	 * @generated
	 * @ordered
	 */
	public static final int CERO_VARIOS_VALUE = 2;

	/**
	 * The '<em><b>Uno varios</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uno varios</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNO_VARIOS
	 * @model name="uno_varios"
	 * @generated
	 * @ordered
	 */
	public static final int UNO_VARIOS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Multiplicidad</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Multiplicidad[] VALUES_ARRAY =
		new Multiplicidad[] {
			UNO,
			UNO_CERO,
			CERO_VARIOS,
			UNO_VARIOS,
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
			case UNO_CERO_VALUE: return UNO_CERO;
			case CERO_VARIOS_VALUE: return CERO_VARIOS;
			case UNO_VARIOS_VALUE: return UNO_VARIOS;
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
