/**
 */
package emailmarketingsystem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Response Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see emailmarketingsystem.EmailmarketingsystemPackage#getResponseType()
 * @model
 * @generated
 */
public enum ResponseType implements Enumerator {
	/**
	 * The '<em><b>OPENED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENED_VALUE
	 * @generated
	 * @ordered
	 */
	OPENED(0, "OPENED", "OPENED"),

	/**
	 * The '<em><b>CLICKED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLICKED_VALUE
	 * @generated
	 * @ordered
	 */
	CLICKED(1, "CLICKED", "CLICKED"),

	/**
	 * The '<em><b>UNSUBSCRIBED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUBSCRIBED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSUBSCRIBED(2, "UNSUBSCRIBED", "UNSUBSCRIBED"),

	/**
	 * The '<em><b>BOUNCED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_BOUNCED_VALUE
	 * @generated
	 * @ordered
	 */
	_BOUNCED(3, "_BOUNCED", "_BOUNCED");

	/**
	 * The '<em><b>OPENED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPENED_VALUE = 0;

	/**
	 * The '<em><b>CLICKED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLICKED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLICKED_VALUE = 1;

	/**
	 * The '<em><b>UNSUBSCRIBED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUBSCRIBED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSUBSCRIBED_VALUE = 2;

	/**
	 * The '<em><b>BOUNCED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_BOUNCED
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName=' BOUNCED'"
	 * @generated
	 * @ordered
	 */
	public static final int _BOUNCED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Response Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResponseType[] VALUES_ARRAY =
		new ResponseType[] {
			OPENED,
			CLICKED,
			UNSUBSCRIBED,
			_BOUNCED,
		};

	/**
	 * A public read-only list of all the '<em><b>Response Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResponseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Response Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResponseType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResponseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Response Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResponseType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResponseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Response Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResponseType get(int value) {
		switch (value) {
			case OPENED_VALUE: return OPENED;
			case CLICKED_VALUE: return CLICKED;
			case UNSUBSCRIBED_VALUE: return UNSUBSCRIBED;
			case _BOUNCED_VALUE: return _BOUNCED;
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
	private ResponseType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //ResponseType
