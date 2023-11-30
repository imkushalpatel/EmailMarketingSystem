/**
 */
package emailmarketingsystem;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Email Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emailmarketingsystem.EmailResponse#getResponseID <em>Response ID</em>}</li>
 *   <li>{@link emailmarketingsystem.EmailResponse#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link emailmarketingsystem.EmailResponse#getResponseType <em>Response Type</em>}</li>
 *   <li>{@link emailmarketingsystem.EmailResponse#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link emailmarketingsystem.EmailResponse#getCampaign <em>Campaign</em>}</li>
 * </ul>
 *
 * @see emailmarketingsystem.EmailmarketingsystemPackage#getEmailResponse()
 * @model
 * @generated
 */
public interface EmailResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Response ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response ID</em>' attribute.
	 * @see #setResponseID(String)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getEmailResponse_ResponseID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getResponseID();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.EmailResponse#getResponseID <em>Response ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response ID</em>' attribute.
	 * @see #getResponseID()
	 * @generated
	 */
	void setResponseID(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getEmailResponse_Timestamp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.EmailResponse#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Response Type</b></em>' attribute.
	 * The literals are from the enumeration {@link emailmarketingsystem.ResponseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Type</em>' attribute.
	 * @see emailmarketingsystem.ResponseType
	 * @see #setResponseType(ResponseType)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getEmailResponse_ResponseType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ResponseType getResponseType();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.EmailResponse#getResponseType <em>Response Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Type</em>' attribute.
	 * @see emailmarketingsystem.ResponseType
	 * @see #getResponseType()
	 * @generated
	 */
	void setResponseType(ResponseType value);

	/**
	 * Returns the value of the '<em><b>Subscriber</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber</em>' reference.
	 * @see #setSubscriber(Subscriber)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getEmailResponse_Subscriber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Subscriber getSubscriber();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.EmailResponse#getSubscriber <em>Subscriber</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber</em>' reference.
	 * @see #getSubscriber()
	 * @generated
	 */
	void setSubscriber(Subscriber value);

	/**
	 * Returns the value of the '<em><b>Campaign</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emailmarketingsystem.EmailCampaign#getEmailResponses <em>Email Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Campaign</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campaign</em>' reference.
	 * @see #setCampaign(EmailCampaign)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getEmailResponse_Campaign()
	 * @see emailmarketingsystem.EmailCampaign#getEmailResponses
	 * @model opposite="emailResponses" required="true" ordered="false"
	 * @generated
	 */
	EmailCampaign getCampaign();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.EmailResponse#getCampaign <em>Campaign</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Campaign</em>' reference.
	 * @see #getCampaign()
	 * @generated
	 */
	void setCampaign(EmailCampaign value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	ResponseType getResponseTypeDetail();

} // EmailResponse
