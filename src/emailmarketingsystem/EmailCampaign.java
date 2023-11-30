/**
 */
package emailmarketingsystem;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Email Campaign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emailmarketingsystem.EmailCampaign#getSendDate <em>Send Date</em>}</li>
 *   <li>{@link emailmarketingsystem.EmailCampaign#getTemplate <em>Template</em>}</li>
 *   <li>{@link emailmarketingsystem.EmailCampaign#getEmailResponses <em>Email Responses</em>}</li>
 *   <li>{@link emailmarketingsystem.EmailCampaign#getRecipients <em>Recipients</em>}</li>
 * </ul>
 *
 * @see emailmarketingsystem.EmailmarketingsystemPackage#getEmailCampaign()
 * @model
 * @generated
 */
public interface EmailCampaign extends Campaign {
	/**
	 * Returns the value of the '<em><b>Send Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Date</em>' attribute.
	 * @see #setSendDate(Date)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getEmailCampaign_SendDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getSendDate();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.EmailCampaign#getSendDate <em>Send Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Date</em>' attribute.
	 * @see #getSendDate()
	 * @generated
	 */
	void setSendDate(Date value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emailmarketingsystem.EmailTemplate#getEmailCampaigns <em>Email Campaigns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(EmailTemplate)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getEmailCampaign_Template()
	 * @see emailmarketingsystem.EmailTemplate#getEmailCampaigns
	 * @model opposite="emailCampaigns" required="true" ordered="false"
	 * @generated
	 */
	EmailTemplate getTemplate();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.EmailCampaign#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(EmailTemplate value);

	/**
	 * Returns the value of the '<em><b>Email Responses</b></em>' reference list.
	 * The list contents are of type {@link emailmarketingsystem.EmailResponse}.
	 * It is bidirectional and its opposite is '{@link emailmarketingsystem.EmailResponse#getCampaign <em>Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Responses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Responses</em>' reference list.
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getEmailCampaign_EmailResponses()
	 * @see emailmarketingsystem.EmailResponse#getCampaign
	 * @model opposite="campaign" ordered="false"
	 * @generated
	 */
	EList<EmailResponse> getEmailResponses();

	/**
	 * Returns the value of the '<em><b>Recipients</b></em>' reference list.
	 * The list contents are of type {@link emailmarketingsystem.Subscriber}.
	 * It is bidirectional and its opposite is '{@link emailmarketingsystem.Subscriber#getEmailCampaigns <em>Email Campaigns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipients</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipients</em>' reference list.
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getEmailCampaign_Recipients()
	 * @see emailmarketingsystem.Subscriber#getEmailCampaigns
	 * @model opposite="emailCampaigns" ordered="false"
	 * @generated
	 */
	EList<Subscriber> getRecipients();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  self.sendDate.toString() > DateTime.now().toString()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body=' self.sendDate.toString() &gt; DateTime.now().toString()'"
	 * @generated
	 */
	boolean emailCampaingSendDateCheck(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sendEmail();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CampaignAnalytics trackCampaign();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model responseRequired="true" responseOrdered="false"
	 * @generated
	 */
	void recordEmailResponse(EmailResponse response);

} // EmailCampaign
