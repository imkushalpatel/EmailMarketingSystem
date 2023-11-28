/**
 */
package EmailMarketingSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marketing System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EmailMarketingSystem.MarketingSystem#getCampaigns <em>Campaigns</em>}</li>
 *   <li>{@link EmailMarketingSystem.MarketingSystem#getTemplates <em>Templates</em>}</li>
 *   <li>{@link EmailMarketingSystem.MarketingSystem#getSubscribers <em>Subscribers</em>}</li>
 *   <li>{@link EmailMarketingSystem.MarketingSystem#getEmailCampaigns <em>Email Campaigns</em>}</li>
 *   <li>{@link EmailMarketingSystem.MarketingSystem#getEmailResponses <em>Email Responses</em>}</li>
 * </ul>
 *
 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getMarketingSystem()
 * @model
 * @generated
 */
public interface MarketingSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Campaigns</b></em>' reference list.
	 * The list contents are of type {@link EmailMarketingSystem.Campaign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Campaigns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campaigns</em>' reference list.
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getMarketingSystem_Campaigns()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Campaign> getCampaigns();

	/**
	 * Returns the value of the '<em><b>Templates</b></em>' reference list.
	 * The list contents are of type {@link EmailMarketingSystem.EmailTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' reference list.
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getMarketingSystem_Templates()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EmailTemplate> getTemplates();

	/**
	 * Returns the value of the '<em><b>Subscribers</b></em>' reference list.
	 * The list contents are of type {@link EmailMarketingSystem.Subscriber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribers</em>' reference list.
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getMarketingSystem_Subscribers()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Subscriber> getSubscribers();

	/**
	 * Returns the value of the '<em><b>Email Campaigns</b></em>' reference list.
	 * The list contents are of type {@link EmailMarketingSystem.EmailCampaign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Campaigns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Campaigns</em>' reference list.
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getMarketingSystem_EmailCampaigns()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EmailCampaign> getEmailCampaigns();

	/**
	 * Returns the value of the '<em><b>Email Responses</b></em>' reference list.
	 * The list contents are of type {@link EmailMarketingSystem.EmailResponse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Responses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Responses</em>' reference list.
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getMarketingSystem_EmailResponses()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EmailResponse> getEmailResponses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createCampaign();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateCampaign();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deleteCampaign();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void viewCampaignDetails();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createTemplate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateTemplate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deleteTemplate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void viewTemplateDetails();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void subscribe();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unsubscribe();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateSubscription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void viewSubscriberDetails();

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
	 * @model
	 * @generated
	 */
	void trackCampaign();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void pauseCampaign();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cancelCampaign();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void analyzeCampaign();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createSegment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void viewSegmentDetails();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sendEmailToSegment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void recordEmailResponse();

} // MarketingSystem
