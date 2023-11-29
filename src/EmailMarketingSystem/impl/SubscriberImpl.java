/**
 */
package EmailMarketingSystem.impl;

import EmailMarketingSystem.EmailCampaign;
import EmailMarketingSystem.EmailMarketingSystemPackage;
import EmailMarketingSystem.Preference;
import EmailMarketingSystem.Segment;
import EmailMarketingSystem.Subscriber;

import EmailMarketingSystem.util.EmailMarketingSystemValidator;
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
 *   <li>{@link EmailMarketingSystem.impl.SubscriberImpl#getSubscriberId <em>Subscriber Id</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.SubscriberImpl#getSubscriptionDate <em>Subscription Date</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.SubscriberImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.SubscriberImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.SubscriberImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.SubscriberImpl#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.SubscriberImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.SubscriberImpl#getEmailCampaigns <em>Email Campaigns</em>}</li>
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
		return EmailMarketingSystemPackage.Literals.SUBSCRIBER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.SUBSCRIBER__SUBSCRIBER_ID, oldSubscriberId, subscriberId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.SUBSCRIBER__SUBSCRIPTION_DATE, oldSubscriptionDate, subscriptionDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.SUBSCRIBER__EMAIL, oldEmail, email));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.SUBSCRIBER__LAST_NAME, oldLastName, lastName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.SUBSCRIBER__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Preference> getPreferences() {
		if (preferences == null) {
			preferences = new EObjectResolvingEList<Preference>(Preference.class, this, EmailMarketingSystemPackage.SUBSCRIBER__PREFERENCES);
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
			segments = new EObjectResolvingEList<Segment>(Segment.class, this, EmailMarketingSystemPackage.SUBSCRIBER__SEGMENTS);
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
			emailCampaigns = new EObjectWithInverseResolvingEList.ManyInverse<EmailCampaign>(EmailCampaign.class, this, EmailMarketingSystemPackage.SUBSCRIBER__EMAIL_CAMPAIGNS, EmailMarketingSystemPackage.EMAIL_CAMPAIGN__RECIPIENTS);
		}
		return emailCampaigns;
	}

	/**
	 * The cached validation expression for the '{@link #Constraint1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint1</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Constraint1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT1_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Subscriber.allInstances()->forAll(u1, u2 | u1 <> u2 implies u1.email <> u2.email)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Constraint1(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			EmailMarketingSystemValidator.validate
				(EmailMarketingSystemPackage.Literals.SUBSCRIBER,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 EmailMarketingSystemPackage.Literals.SUBSCRIBER___CONSTRAINT1__DIAGNOSTICCHAIN_MAP,
				 CONSTRAINT1_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 EmailMarketingSystemValidator.DIAGNOSTIC_SOURCE,
				 EmailMarketingSystemValidator.SUBSCRIBER__CONSTRAINT1);
	}

	/**
	 * The cached validation expression for the '{@link #Constraint2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Constraint2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT2_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "self.email<>null";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Constraint2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			EmailMarketingSystemValidator.validate
				(EmailMarketingSystemPackage.Literals.SUBSCRIBER,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 EmailMarketingSystemPackage.Literals.SUBSCRIBER___CONSTRAINT2__DIAGNOSTICCHAIN_MAP,
				 CONSTRAINT2_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 EmailMarketingSystemValidator.DIAGNOSTIC_SOURCE,
				 EmailMarketingSystemValidator.SUBSCRIBER__CONSTRAINT2);
	}

	/**
	 * The cached validation expression for the '{@link #Constraint3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint3</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Constraint3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT3_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "self.email.matches('^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$')";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Constraint3(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			EmailMarketingSystemValidator.validate
				(EmailMarketingSystemPackage.Literals.SUBSCRIBER,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 EmailMarketingSystemPackage.Literals.SUBSCRIBER___CONSTRAINT3__DIAGNOSTICCHAIN_MAP,
				 CONSTRAINT3_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 EmailMarketingSystemValidator.DIAGNOSTIC_SOURCE,
				 EmailMarketingSystemValidator.SUBSCRIBER__CONSTRAINT3);
	}

	/**
	 * The cached validation expression for the '{@link #Constraint4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint4</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Constraint4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT4_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "self.emailCampaigns->forAll(c | c.segments->select(s | s.subscribers->includes(self))->size() <= 1)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Constraint4(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			EmailMarketingSystemValidator.validate
				(EmailMarketingSystemPackage.Literals.SUBSCRIBER,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 EmailMarketingSystemPackage.Literals.SUBSCRIBER___CONSTRAINT4__DIAGNOSTICCHAIN_MAP,
				 CONSTRAINT4_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 EmailMarketingSystemValidator.DIAGNOSTIC_SOURCE,
				 EmailMarketingSystemValidator.SUBSCRIBER__CONSTRAINT4);
	}

	/**
	 * The cached validation expression for the '{@link #Constraint5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint5</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Constraint5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT5_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "self.firstName  <> null and self.lastName <> null";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Constraint5(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			EmailMarketingSystemValidator.validate
				(EmailMarketingSystemPackage.Literals.SUBSCRIBER,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 EmailMarketingSystemPackage.Literals.SUBSCRIBER___CONSTRAINT5__DIAGNOSTICCHAIN_MAP,
				 CONSTRAINT5_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 EmailMarketingSystemValidator.DIAGNOSTIC_SOURCE,
				 EmailMarketingSystemValidator.SUBSCRIBER__CONSTRAINT5);
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
			case EmailMarketingSystemPackage.SUBSCRIBER__EMAIL_CAMPAIGNS:
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
			case EmailMarketingSystemPackage.SUBSCRIBER__EMAIL_CAMPAIGNS:
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
			case EmailMarketingSystemPackage.SUBSCRIBER__SUBSCRIBER_ID:
				return getSubscriberId();
			case EmailMarketingSystemPackage.SUBSCRIBER__SUBSCRIPTION_DATE:
				return getSubscriptionDate();
			case EmailMarketingSystemPackage.SUBSCRIBER__EMAIL:
				return getEmail();
			case EmailMarketingSystemPackage.SUBSCRIBER__LAST_NAME:
				return getLastName();
			case EmailMarketingSystemPackage.SUBSCRIBER__FIRST_NAME:
				return getFirstName();
			case EmailMarketingSystemPackage.SUBSCRIBER__PREFERENCES:
				return getPreferences();
			case EmailMarketingSystemPackage.SUBSCRIBER__SEGMENTS:
				return getSegments();
			case EmailMarketingSystemPackage.SUBSCRIBER__EMAIL_CAMPAIGNS:
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
			case EmailMarketingSystemPackage.SUBSCRIBER__SUBSCRIBER_ID:
				setSubscriberId((String)newValue);
				return;
			case EmailMarketingSystemPackage.SUBSCRIBER__SUBSCRIPTION_DATE:
				setSubscriptionDate((Date)newValue);
				return;
			case EmailMarketingSystemPackage.SUBSCRIBER__EMAIL:
				setEmail((String)newValue);
				return;
			case EmailMarketingSystemPackage.SUBSCRIBER__LAST_NAME:
				setLastName((String)newValue);
				return;
			case EmailMarketingSystemPackage.SUBSCRIBER__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case EmailMarketingSystemPackage.SUBSCRIBER__PREFERENCES:
				getPreferences().clear();
				getPreferences().addAll((Collection<? extends Preference>)newValue);
				return;
			case EmailMarketingSystemPackage.SUBSCRIBER__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends Segment>)newValue);
				return;
			case EmailMarketingSystemPackage.SUBSCRIBER__EMAIL_CAMPAIGNS:
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
			case EmailMarketingSystemPackage.SUBSCRIBER__SUBSCRIBER_ID:
				setSubscriberId(SUBSCRIBER_ID_EDEFAULT);
				return;
			case EmailMarketingSystemPackage.SUBSCRIBER__SUBSCRIPTION_DATE:
				setSubscriptionDate(SUBSCRIPTION_DATE_EDEFAULT);
				return;
			case EmailMarketingSystemPackage.SUBSCRIBER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case EmailMarketingSystemPackage.SUBSCRIBER__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case EmailMarketingSystemPackage.SUBSCRIBER__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case EmailMarketingSystemPackage.SUBSCRIBER__PREFERENCES:
				getPreferences().clear();
				return;
			case EmailMarketingSystemPackage.SUBSCRIBER__SEGMENTS:
				getSegments().clear();
				return;
			case EmailMarketingSystemPackage.SUBSCRIBER__EMAIL_CAMPAIGNS:
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
			case EmailMarketingSystemPackage.SUBSCRIBER__SUBSCRIBER_ID:
				return SUBSCRIBER_ID_EDEFAULT == null ? subscriberId != null : !SUBSCRIBER_ID_EDEFAULT.equals(subscriberId);
			case EmailMarketingSystemPackage.SUBSCRIBER__SUBSCRIPTION_DATE:
				return SUBSCRIPTION_DATE_EDEFAULT == null ? subscriptionDate != null : !SUBSCRIPTION_DATE_EDEFAULT.equals(subscriptionDate);
			case EmailMarketingSystemPackage.SUBSCRIBER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case EmailMarketingSystemPackage.SUBSCRIBER__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case EmailMarketingSystemPackage.SUBSCRIBER__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case EmailMarketingSystemPackage.SUBSCRIBER__PREFERENCES:
				return preferences != null && !preferences.isEmpty();
			case EmailMarketingSystemPackage.SUBSCRIBER__SEGMENTS:
				return segments != null && !segments.isEmpty();
			case EmailMarketingSystemPackage.SUBSCRIBER__EMAIL_CAMPAIGNS:
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
			case EmailMarketingSystemPackage.SUBSCRIBER___CONSTRAINT1__DIAGNOSTICCHAIN_MAP:
				return Constraint1((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EmailMarketingSystemPackage.SUBSCRIBER___CONSTRAINT2__DIAGNOSTICCHAIN_MAP:
				return Constraint2((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EmailMarketingSystemPackage.SUBSCRIBER___CONSTRAINT3__DIAGNOSTICCHAIN_MAP:
				return Constraint3((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EmailMarketingSystemPackage.SUBSCRIBER___CONSTRAINT4__DIAGNOSTICCHAIN_MAP:
				return Constraint4((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EmailMarketingSystemPackage.SUBSCRIBER___CONSTRAINT5__DIAGNOSTICCHAIN_MAP:
				return Constraint5((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EmailMarketingSystemPackage.SUBSCRIBER___ADD_EMAIL_CAMPAIGN__STRING:
				addEmailCampaign((String)arguments.get(0));
				return null;
			case EmailMarketingSystemPackage.SUBSCRIBER___REMOVE_EMAIL_CAMPAIGN__STRING:
				removeEmailCampaign((String)arguments.get(0));
				return null;
			case EmailMarketingSystemPackage.SUBSCRIBER___UPDATE_PREFERENCES__STRING_PREFERENCE:
				updatePreferences((String)arguments.get(0), (Preference)arguments.get(1));
				return null;
			case EmailMarketingSystemPackage.SUBSCRIBER___ADD_SEGMENT__STRING:
				return addSegment((String)arguments.get(0));
			case EmailMarketingSystemPackage.SUBSCRIBER___REMOVE_SEGMENT__STRING:
				removeSegment((String)arguments.get(0));
				return null;
			case EmailMarketingSystemPackage.SUBSCRIBER___VIEW_SEGMENT_DETAILS__STRING:
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
