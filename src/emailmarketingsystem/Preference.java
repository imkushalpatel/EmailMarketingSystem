/**
 */
package emailmarketingsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emailmarketingsystem.Preference#getPreferenceId <em>Preference Id</em>}</li>
 *   <li>{@link emailmarketingsystem.Preference#getName <em>Name</em>}</li>
 *   <li>{@link emailmarketingsystem.Preference#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see emailmarketingsystem.EmailmarketingsystemPackage#getPreference()
 * @model
 * @generated
 */
public interface Preference extends EObject {
	/**
	 * Returns the value of the '<em><b>Preference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preference Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preference Id</em>' attribute.
	 * @see #setPreferenceId(String)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getPreference_PreferenceId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPreferenceId();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.Preference#getPreferenceId <em>Preference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preference Id</em>' attribute.
	 * @see #getPreferenceId()
	 * @generated
	 */
	void setPreferenceId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getPreference_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.Preference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getPreference_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.Preference#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model preferenceIdRequired="true" preferenceIdOrdered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	void updatePreference(String preferenceId, String value);

} // Preference
