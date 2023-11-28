/**
 */
package EmailMarketingSystem;

import java.util.Date;

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
 *   <li>{@link EmailMarketingSystem.EmailTemplate#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link EmailMarketingSystem.EmailTemplate#getName <em>Name</em>}</li>
 *   <li>{@link EmailMarketingSystem.EmailTemplate#getContent <em>Content</em>}</li>
 *   <li>{@link EmailMarketingSystem.EmailTemplate#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link EmailMarketingSystem.EmailTemplate#getEmailCampaigns <em>Email Campaigns</em>}</li>
 * </ul>
 *
 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getEmailTemplate()
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
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getEmailTemplate_TemplateId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTemplateId();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.EmailTemplate#getTemplateId <em>Template Id</em>}' attribute.
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
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getEmailTemplate_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.EmailTemplate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getEmailTemplate_Content()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.EmailTemplate#getContent <em>Content</em>}' attribute.
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
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getEmailTemplate_CreatedDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.EmailTemplate#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Email Campaigns</b></em>' reference list.
	 * The list contents are of type {@link EmailMarketingSystem.EmailCampaign}.
	 * It is bidirectional and its opposite is '{@link EmailMarketingSystem.EmailCampaign#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Campaigns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Campaigns</em>' reference list.
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getEmailTemplate_EmailCampaigns()
	 * @see EmailMarketingSystem.EmailCampaign#getTemplate
	 * @model opposite="template" ordered="false"
	 * @generated
	 */
	EList<EmailCampaign> getEmailCampaigns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addEmailCampaign();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeEmailCampaign();

} // EmailTemplate
