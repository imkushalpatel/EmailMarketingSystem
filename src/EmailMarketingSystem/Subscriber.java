/**
 */
package EmailMarketingSystem;

import java.util.Date;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscriber</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EmailMarketingSystem.Subscriber#getSubscriberId <em>Subscriber Id</em>}</li>
 *   <li>{@link EmailMarketingSystem.Subscriber#getSubscriptionDate <em>Subscription Date</em>}</li>
 *   <li>{@link EmailMarketingSystem.Subscriber#getEmail <em>Email</em>}</li>
 *   <li>{@link EmailMarketingSystem.Subscriber#getLastName <em>Last Name</em>}</li>
 *   <li>{@link EmailMarketingSystem.Subscriber#getFirstName <em>First Name</em>}</li>
 *   <li>{@link EmailMarketingSystem.Subscriber#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link EmailMarketingSystem.Subscriber#getSegments <em>Segments</em>}</li>
 *   <li>{@link EmailMarketingSystem.Subscriber#getEmailCampaigns <em>Email Campaigns</em>}</li>
 * </ul>
 *
 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getSubscriber()
 * @model
 * @generated
 */
public interface Subscriber extends EObject {
	/**
	 * Returns the value of the '<em><b>Subscriber Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber Id</em>' attribute.
	 * @see #setSubscriberId(String)
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getSubscriber_SubscriberId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSubscriberId();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.Subscriber#getSubscriberId <em>Subscriber Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber Id</em>' attribute.
	 * @see #getSubscriberId()
	 * @generated
	 */
	void setSubscriberId(String value);

	/**
	 * Returns the value of the '<em><b>Subscription Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Date</em>' attribute.
	 * @see #setSubscriptionDate(Date)
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getSubscriber_SubscriptionDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getSubscriptionDate();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.Subscriber#getSubscriptionDate <em>Subscription Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Date</em>' attribute.
	 * @see #getSubscriptionDate()
	 * @generated
	 */
	void setSubscriptionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getSubscriber_Email()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.Subscriber#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getSubscriber_LastName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.Subscriber#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getSubscriber_FirstName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.Subscriber#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Preferences</b></em>' reference list.
	 * The list contents are of type {@link EmailMarketingSystem.Preference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferences</em>' reference list.
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getSubscriber_Preferences()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Preference> getPreferences();

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
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getSubscriber_Segments()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Segment> getSegments();

	/**
	 * Returns the value of the '<em><b>Email Campaigns</b></em>' reference list.
	 * The list contents are of type {@link EmailMarketingSystem.EmailCampaign}.
	 * It is bidirectional and its opposite is '{@link EmailMarketingSystem.EmailCampaign#getRecipients <em>Recipients</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Campaigns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Campaigns</em>' reference list.
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getSubscriber_EmailCampaigns()
	 * @see EmailMarketingSystem.EmailCampaign#getRecipients
	 * @model opposite="recipients" ordered="false"
	 * @generated
	 */
	EList<EmailCampaign> getEmailCampaigns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subscriber.allInstances()->forAll(u1, u2 | u1 <> u2 implies u1.email <> u2.email)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean Constraint1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.email<>null
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean Constraint2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.email.matches('^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean Constraint3(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.emailCampaigns->forAll(c | c.segments->select(s | s.subscribers->includes(self))->size() <= 1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean Constraint4(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.firstName  <> null and self.lastName <> null
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean Constraint5(DiagnosticChain diagnostics, Map<Object, Object> context);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model subscriberIdRequired="true" subscriberIdOrdered="false" preferencesRequired="true" preferencesOrdered="false"
	 * @generated
	 */
	void updatePreferences(String subscriberId, Preference preferences);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	Segment addSegment(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model segmentIdRequired="true" segmentIdOrdered="false"
	 * @generated
	 */
	void removeSegment(String segmentId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" segmentIdRequired="true" segmentIdOrdered="false"
	 * @generated
	 */
	Segment viewSegmentDetails(String segmentId);

} // Subscriber
