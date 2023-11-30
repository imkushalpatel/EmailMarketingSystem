/**
 */
package emailmarketingsystem;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Email Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emailmarketingsystem.EmailTemplate#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link emailmarketingsystem.EmailTemplate#getName <em>Name</em>}</li>
 *   <li>{@link emailmarketingsystem.EmailTemplate#getSubject <em>Subject</em>}</li>
 *   <li>{@link emailmarketingsystem.EmailTemplate#getContent <em>Content</em>}</li>
 *   <li>{@link emailmarketingsystem.EmailTemplate#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link emailmarketingsystem.EmailTemplate#getEmailCampaigns <em>Email Campaigns</em>}</li>
 * </ul>
 *
 * @see emailmarketingsystem.EmailmarketingsystemPackage#getEmailTemplate()
 * @model
 * @generated
 */
public interface EmailTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Template Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Id</em>' attribute.
	 * @see #setTemplateId(String)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getEmailTemplate_TemplateId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTemplateId();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.EmailTemplate#getTemplateId <em>Template Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Id</em>' attribute.
	 * @see #getTemplateId()
	 * @generated
	 */
	void setTemplateId(String value);

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
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getEmailTemplate_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.EmailTemplate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getEmailTemplate_Subject()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.EmailTemplate#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getEmailTemplate_Content()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.EmailTemplate#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getEmailTemplate_CreatedDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.EmailTemplate#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Email Campaigns</b></em>' reference list.
	 * The list contents are of type {@link emailmarketingsystem.EmailCampaign}.
	 * It is bidirectional and its opposite is '{@link emailmarketingsystem.EmailCampaign#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Campaigns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Campaigns</em>' reference list.
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getEmailTemplate_EmailCampaigns()
	 * @see emailmarketingsystem.EmailCampaign#getTemplate
	 * @model opposite="template" ordered="false"
	 * @generated
	 */
	EList<EmailCampaign> getEmailCampaigns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject <> null and self.content <> null
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.subject &lt;&gt; null and self.content &lt;&gt; null'"
	 * @generated
	 */
	boolean Constraint13(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model emailCampaignIdRequired="true" emailCampaignIdOrdered="false"
	 * @generated
	 */
	void addEmailCampaign(String emailCampaignId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model emailCampaignIdRequired="true" emailCampaignIdOrdered="false"
	 * @generated
	 */
	void removeEmailCampaign(String emailCampaignId);

} // EmailTemplate
