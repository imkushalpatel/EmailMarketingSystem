/**
 */
package EmailMarketingSystem;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Campaign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EmailMarketingSystem.Campaign#getCampaignId <em>Campaign Id</em>}</li>
 *   <li>{@link EmailMarketingSystem.Campaign#getName <em>Name</em>}</li>
 *   <li>{@link EmailMarketingSystem.Campaign#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link EmailMarketingSystem.Campaign#getEndDate <em>End Date</em>}</li>
 *   <li>{@link EmailMarketingSystem.Campaign#getEmailCampaigns <em>Email Campaigns</em>}</li>
 *   <li>{@link EmailMarketingSystem.Campaign#getStatus <em>Status</em>}</li>
 *   <li>{@link EmailMarketingSystem.Campaign#getAnalytics <em>Analytics</em>}</li>
 *   <li>{@link EmailMarketingSystem.Campaign#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getCampaign()
 * @model
 * @generated
 */
public interface Campaign extends EObject {
	/**
	 * Returns the value of the '<em><b>Campaign Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Campaign Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campaign Id</em>' attribute.
	 * @see #setCampaignId(String)
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getCampaign_CampaignId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCampaignId();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.Campaign#getCampaignId <em>Campaign Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Campaign Id</em>' attribute.
	 * @see #getCampaignId()
	 * @generated
	 */
	void setCampaignId(String value);

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
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getCampaign_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.Campaign#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getCampaign_StartDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.Campaign#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getCampaign_EndDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.Campaign#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

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
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getCampaign_EmailCampaigns()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EmailCampaign> getEmailCampaigns();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link EmailMarketingSystem.CampaignStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see EmailMarketingSystem.CampaignStatus
	 * @see #setStatus(CampaignStatus)
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getCampaign_Status()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CampaignStatus getStatus();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.Campaign#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see EmailMarketingSystem.CampaignStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CampaignStatus value);

	/**
	 * Returns the value of the '<em><b>Analytics</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analytics</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analytics</em>' reference.
	 * @see #setAnalytics(CampaignAnalytics)
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getCampaign_Analytics()
	 * @model ordered="false"
	 * @generated
	 */
	CampaignAnalytics getAnalytics();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.Campaign#getAnalytics <em>Analytics</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analytics</em>' reference.
	 * @see #getAnalytics()
	 * @generated
	 */
	void setAnalytics(CampaignAnalytics value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' reference list.
	 * The list contents are of type {@link EmailMarketingSystem.Segment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' reference list.
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getCampaign_Segments()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Segment> getSegments();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getAnalyticsDetails();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addSegment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeSegment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void viewSegmentDetails();

} // Campaign
