/**
 */
package emailmarketingsystem.impl;

import emailmarketingsystem.EmailCampaign;
import emailmarketingsystem.EmailmarketingsystemPackage;
import emailmarketingsystem.Preference;
import emailmarketingsystem.Segment;
import emailmarketingsystem.Subscriber;

import emailmarketingsystem.util.EmailmarketingsystemValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscriber</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emailmarketingsystem.impl.SubscriberImpl#getSubscriberId <em>Subscriber Id</em>}</li>
 *   <li>{@link emailmarketingsystem.impl.SubscriberImpl#getSubscriptionDate <em>Subscription Date</em>}</li>
 *   <li>{@link emailmarketingsystem.impl.SubscriberImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link emailmarketingsystem.impl.SubscriberImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link emailmarketingsystem.impl.SubscriberImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link emailmarketingsystem.impl.SubscriberImpl#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link emailmarketingsystem.impl.SubscriberImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link emailmarketingsystem.impl.SubscriberImpl#getEmailCampaigns <em>Email Campaigns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriberImpl extends MinimalEObjectImpl.Container implements Subscriber {
	/**
	 * The default value of the '{@link #getSubscriberId() <em>Subscriber Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriberId() <em>Subscriber Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberId()
	 * @generated
	 * @ordered
	 */
	protected String subscriberId = SUBSCRIBER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriptionDate() <em>Subscription Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SUBSCRIPTION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionDate() <em>Subscription Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionDate()
	 * @generated
	 * @ordered
	 */
	protected Date subscriptionDate = SUBSCRIPTION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreferences() <em>Preferences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Preference> preferences;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<Segment> segments;

	/**
	 * The cached value of the '{@link #getEmailCampaigns() <em>Email Campaigns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailCampaigns()
	 * @generated
	 * @ordered
	 */
	protected EList<EmailCampaign> emailCampaigns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmailmarketingsystemPackage.Literals.SUBSCRIBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscriberId() {
		return subscriberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriberId(String newSubscriberId) {
		String oldSubscriberId = subscriberId;
		subscriberId = newSubscriberId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailmarketingsystemPackage.SUBSCRIBER__SUBSCRIBER_ID, oldSubscriberId, subscriberId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSubscriptionDate() {
		return subscriptionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionDate(Date newSubscriptionDate) {
		Date oldSubscriptionDate = subscriptionDate;
		subscriptionDate = newSubscriptionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailmarketingsystemPackage.SUBSCRIBER__SUBSCRIPTION_DATE, oldSubscriptionDate, subscriptionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailmarketingsystemPackage.SUBSCRIBER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailmarketingsystemPackage.SUBSCRIBER__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailmarketingsystemPackage.SUBSCRIBER__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Preference> getPreferences() {
		if (preferences == null) {
			preferences = new EObjectResolvingEList<Preference>(Preference.class, this, EmailmarketingsystemPackage.SUBSCRIBER__PREFERENCES);
		}
		return preferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Segment> getSegments() {
		if (segments == null) {
			segments = new EObjectResolvingEList<Segment>(Segment.class, this, EmailmarketingsystemPackage.SUBSCRIBER__SEGMENTS);
		}
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailCampaign> getEmailCampaigns() {
		if (emailCampaigns == null) {
			emailCampaigns = new EObjectWithInverseResolvingEList.ManyInverse<EmailCampaign>(EmailCampaign.class, this, EmailmarketingsystemPackage.SUBSCRIBER__EMAIL_CAMPAIGNS, EmailmarketingsystemPackage.EMAIL_CAMPAIGN__RECIPIENTS);
		}
		return emailCampaigns;
	}

	/**
	 * The cached validation expression for the '{@link #subscriberDuplicateEmailCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subscriber Duplicate Email Check</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #subscriberDuplicateEmailCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_DUPLICATE_EMAIL_CHECK_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Subscriber.allInstances()->forAll(u1, u2 | u1 <> u2 implies u1.email <> u2.email)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean subscriberDuplicateEmailCheck(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			EmailmarketingsystemValidator.validate
				(EmailmarketingsystemPackage.Literals.SUBSCRIBER,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 EmailmarketingsystemPackage.Literals.SUBSCRIBER___SUBSCRIBER_DUPLICATE_EMAIL_CHECK__DIAGNOSTICCHAIN_MAP,
				 SUBSCRIBER_DUPLICATE_EMAIL_CHECK_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 EmailmarketingsystemValidator.DIAGNOSTIC_SOURCE,
				 EmailmarketingsystemValidator.SUBSCRIBER__SUBSCRIBER_DUPLICATE_EMAIL_CHECK);
	}

	/**
	 * The cached validation expression for the '{@link #subscriberEmailCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subscriber Email Check</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #subscriberEmailCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_EMAIL_CHECK_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "self.email<>null";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean subscriberEmailCheck(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			EmailmarketingsystemValidator.validate
				(EmailmarketingsystemPackage.Literals.SUBSCRIBER,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 EmailmarketingsystemPackage.Literals.SUBSCRIBER___SUBSCRIBER_EMAIL_CHECK__DIAGNOSTICCHAIN_MAP,
				 SUBSCRIBER_EMAIL_CHECK_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 EmailmarketingsystemValidator.DIAGNOSTIC_SOURCE,
				 EmailmarketingsystemValidator.SUBSCRIBER__SUBSCRIBER_EMAIL_CHECK);
	}

	/**
	 * The cached validation expression for the '{@link #subscriberEmailRegexCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subscriber Email Regex Check</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #subscriberEmailRegexCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_EMAIL_REGEX_CHECK_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "self.email.matches('^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$')";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean subscriberEmailRegexCheck(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			EmailmarketingsystemValidator.validate
				(EmailmarketingsystemPackage.Literals.SUBSCRIBER,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 EmailmarketingsystemPackage.Literals.SUBSCRIBER___SUBSCRIBER_EMAIL_REGEX_CHECK__DIAGNOSTICCHAIN_MAP,
				 SUBSCRIBER_EMAIL_REGEX_CHECK_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 EmailmarketingsystemValidator.DIAGNOSTIC_SOURCE,
				 EmailmarketingsystemValidator.SUBSCRIBER__SUBSCRIBER_EMAIL_REGEX_CHECK);
	}

	/**
	 * The cached validation expression for the '{@link #subscriberCampaignsSegmentCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subscriber Campaigns Segment Check</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #subscriberCampaignsSegmentCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_CAMPAIGNS_SEGMENT_CHECK_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "self.emailCampaigns->forAll(c | c.segments->select(s | s.subscribers->includes(self))->size() <= 1)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean subscriberCampaignsSegmentCheck(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			EmailmarketingsystemValidator.validate
				(EmailmarketingsystemPackage.Literals.SUBSCRIBER,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 EmailmarketingsystemPackage.Literals.SUBSCRIBER___SUBSCRIBER_CAMPAIGNS_SEGMENT_CHECK__DIAGNOSTICCHAIN_MAP,
				 SUBSCRIBER_CAMPAIGNS_SEGMENT_CHECK_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 EmailmarketingsystemValidator.DIAGNOSTIC_SOURCE,
				 EmailmarketingsystemValidator.SUBSCRIBER__SUBSCRIBER_CAMPAIGNS_SEGMENT_CHECK);
	}

	/**
	 * The cached validation expression for the '{@link #subscriberNameCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subscriber Name Check</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #subscriberNameCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_NAME_CHECK_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "self.firstName  <> null and self.lastName <> null";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean subscriberNameCheck(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			EmailmarketingsystemValidator.validate
				(EmailmarketingsystemPackage.Literals.SUBSCRIBER,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 EmailmarketingsystemPackage.Literals.SUBSCRIBER___SUBSCRIBER_NAME_CHECK__DIAGNOSTICCHAIN_MAP,
				 SUBSCRIBER_NAME_CHECK_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 EmailmarketingsystemValidator.DIAGNOSTIC_SOURCE,
				 EmailmarketingsystemValidator.SUBSCRIBER__SUBSCRIBER_NAME_CHECK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addEmailCampaign(String emailCampaignId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeEmailCampaign(String emailCampaignId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updatePreferences(String subscriberId, Preference preferences) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment addSegment(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeSegment(String segmentId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment viewSegmentDetails(String segmentId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmailmarketingsystemPackage.SUBSCRIBER__EMAIL_CAMPAIGNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmailCampaigns()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmailmarketingsystemPackage.SUBSCRIBER__EMAIL_CAMPAIGNS:
				return ((InternalEList<?>)getEmailCampaigns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmailmarketingsystemPackage.SUBSCRIBER__SUBSCRIBER_ID:
				return getSubscriberId();
			case EmailmarketingsystemPackage.SUBSCRIBER__SUBSCRIPTION_DATE:
				return getSubscriptionDate();
			case EmailmarketingsystemPackage.SUBSCRIBER__EMAIL:
				return getEmail();
			case EmailmarketingsystemPackage.SUBSCRIBER__LAST_NAME:
				return getLastName();
			case EmailmarketingsystemPackage.SUBSCRIBER__FIRST_NAME:
				return getFirstName();
			case EmailmarketingsystemPackage.SUBSCRIBER__PREFERENCES:
				return getPreferences();
			case EmailmarketingsystemPackage.SUBSCRIBER__SEGMENTS:
				return getSegments();
			case EmailmarketingsystemPackage.SUBSCRIBER__EMAIL_CAMPAIGNS:
				return getEmailCampaigns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmailmarketingsystemPackage.SUBSCRIBER__SUBSCRIBER_ID:
				setSubscriberId((String)newValue);
				return;
			case EmailmarketingsystemPackage.SUBSCRIBER__SUBSCRIPTION_DATE:
				setSubscriptionDate((Date)newValue);
				return;
			case EmailmarketingsystemPackage.SUBSCRIBER__EMAIL:
				setEmail((String)newValue);
				return;
			case EmailmarketingsystemPackage.SUBSCRIBER__LAST_NAME:
				setLastName((String)newValue);
				return;
			case EmailmarketingsystemPackage.SUBSCRIBER__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case EmailmarketingsystemPackage.SUBSCRIBER__PREFERENCES:
				getPreferences().clear();
				getPreferences().addAll((Collection<? extends Preference>)newValue);
				return;
			case EmailmarketingsystemPackage.SUBSCRIBER__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends Segment>)newValue);
				return;
			case EmailmarketingsystemPackage.SUBSCRIBER__EMAIL_CAMPAIGNS:
				getEmailCampaigns().clear();
				getEmailCampaigns().addAll((Collection<? extends EmailCampaign>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmailmarketingsystemPackage.SUBSCRIBER__SUBSCRIBER_ID:
				setSubscriberId(SUBSCRIBER_ID_EDEFAULT);
				return;
			case EmailmarketingsystemPackage.SUBSCRIBER__SUBSCRIPTION_DATE:
				setSubscriptionDate(SUBSCRIPTION_DATE_EDEFAULT);
				return;
			case EmailmarketingsystemPackage.SUBSCRIBER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case EmailmarketingsystemPackage.SUBSCRIBER__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case EmailmarketingsystemPackage.SUBSCRIBER__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case EmailmarketingsystemPackage.SUBSCRIBER__PREFERENCES:
				getPreferences().clear();
				return;
			case EmailmarketingsystemPackage.SUBSCRIBER__SEGMENTS:
				getSegments().clear();
				return;
			case EmailmarketingsystemPackage.SUBSCRIBER__EMAIL_CAMPAIGNS:
				getEmailCampaigns().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmailmarketingsystemPackage.SUBSCRIBER__SUBSCRIBER_ID:
				return SUBSCRIBER_ID_EDEFAULT == null ? subscriberId != null : !SUBSCRIBER_ID_EDEFAULT.equals(subscriberId);
			case EmailmarketingsystemPackage.SUBSCRIBER__SUBSCRIPTION_DATE:
				return SUBSCRIPTION_DATE_EDEFAULT == null ? subscriptionDate != null : !SUBSCRIPTION_DATE_EDEFAULT.equals(subscriptionDate);
			case EmailmarketingsystemPackage.SUBSCRIBER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case EmailmarketingsystemPackage.SUBSCRIBER__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case EmailmarketingsystemPackage.SUBSCRIBER__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case EmailmarketingsystemPackage.SUBSCRIBER__PREFERENCES:
				return preferences != null && !preferences.isEmpty();
			case EmailmarketingsystemPackage.SUBSCRIBER__SEGMENTS:
				return segments != null && !segments.isEmpty();
			case EmailmarketingsystemPackage.SUBSCRIBER__EMAIL_CAMPAIGNS:
				return emailCampaigns != null && !emailCampaigns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EmailmarketingsystemPackage.SUBSCRIBER___SUBSCRIBER_DUPLICATE_EMAIL_CHECK__DIAGNOSTICCHAIN_MAP:
				return subscriberDuplicateEmailCheck((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EmailmarketingsystemPackage.SUBSCRIBER___SUBSCRIBER_EMAIL_CHECK__DIAGNOSTICCHAIN_MAP:
				return subscriberEmailCheck((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EmailmarketingsystemPackage.SUBSCRIBER___SUBSCRIBER_EMAIL_REGEX_CHECK__DIAGNOSTICCHAIN_MAP:
				return subscriberEmailRegexCheck((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EmailmarketingsystemPackage.SUBSCRIBER___SUBSCRIBER_CAMPAIGNS_SEGMENT_CHECK__DIAGNOSTICCHAIN_MAP:
				return subscriberCampaignsSegmentCheck((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EmailmarketingsystemPackage.SUBSCRIBER___SUBSCRIBER_NAME_CHECK__DIAGNOSTICCHAIN_MAP:
				return subscriberNameCheck((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EmailmarketingsystemPackage.SUBSCRIBER___ADD_EMAIL_CAMPAIGN__STRING:
				addEmailCampaign((String)arguments.get(0));
				return null;
			case EmailmarketingsystemPackage.SUBSCRIBER___REMOVE_EMAIL_CAMPAIGN__STRING:
				removeEmailCampaign((String)arguments.get(0));
				return null;
			case EmailmarketingsystemPackage.SUBSCRIBER___UPDATE_PREFERENCES__STRING_PREFERENCE:
				updatePreferences((String)arguments.get(0), (Preference)arguments.get(1));
				return null;
			case EmailmarketingsystemPackage.SUBSCRIBER___ADD_SEGMENT__STRING:
				return addSegment((String)arguments.get(0));
			case EmailmarketingsystemPackage.SUBSCRIBER___REMOVE_SEGMENT__STRING:
				removeSegment((String)arguments.get(0));
				return null;
			case EmailmarketingsystemPackage.SUBSCRIBER___VIEW_SEGMENT_DETAILS__STRING:
				return viewSegmentDetails((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (subscriberId: ");
		result.append(subscriberId);
		result.append(", subscriptionDate: ");
		result.append(subscriptionDate);
		result.append(", email: ");
		result.append(email);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(')');
		return result.toString();
	}

} //SubscriberImpl
