/**
 */
package EmailMarketingSystem.impl;

import EmailMarketingSystem.EmailCampaign;
import EmailMarketingSystem.EmailMarketingSystemPackage;
import EmailMarketingSystem.EmailResponse;
import EmailMarketingSystem.ResponseType;
import EmailMarketingSystem.Subscriber;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Email Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link EmailMarketingSystem.impl.EmailResponseImpl#getResponseID <em>Response ID</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.EmailResponseImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.EmailResponseImpl#getResponseType <em>Response Type</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.EmailResponseImpl#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.EmailResponseImpl#getCampaign <em>Campaign</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmailResponseImpl extends MinimalEObjectImpl.Container implements EmailResponse {
	/**
	 * The default value of the '{@link #getResponseID() <em>Response ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseID()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseID() <em>Response ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseID()
	 * @generated
	 * @ordered
	 */
	protected String responseID = RESPONSE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseType() <em>Response Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseType()
	 * @generated
	 * @ordered
	 */
	protected static final ResponseType RESPONSE_TYPE_EDEFAULT = ResponseType.OPENED;

	/**
	 * The cached value of the '{@link #getResponseType() <em>Response Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseType()
	 * @generated
	 * @ordered
	 */
	protected ResponseType responseType = RESPONSE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubscriber() <em>Subscriber</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriber()
	 * @generated
	 * @ordered
	 */
	protected Subscriber subscriber;

	/**
	 * The cached value of the '{@link #getCampaign() <em>Campaign</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampaign()
	 * @generated
	 * @ordered
	 */
	protected EmailCampaign campaign;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmailResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmailMarketingSystemPackage.Literals.EMAIL_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponseID() {
		return responseID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseID(String newResponseID) {
		String oldResponseID = responseID;
		responseID = newResponseID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.EMAIL_RESPONSE__RESPONSE_ID, oldResponseID, responseID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(Date newTimestamp) {
		Date oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.EMAIL_RESPONSE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseType getResponseType() {
		return responseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseType(ResponseType newResponseType) {
		ResponseType oldResponseType = responseType;
		responseType = newResponseType == null ? RESPONSE_TYPE_EDEFAULT : newResponseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.EMAIL_RESPONSE__RESPONSE_TYPE, oldResponseType, responseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subscriber getSubscriber() {
		if (subscriber != null && subscriber.eIsProxy()) {
			InternalEObject oldSubscriber = (InternalEObject)subscriber;
			subscriber = (Subscriber)eResolveProxy(oldSubscriber);
			if (subscriber != oldSubscriber) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmailMarketingSystemPackage.EMAIL_RESPONSE__SUBSCRIBER, oldSubscriber, subscriber));
			}
		}
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscriber basicGetSubscriber() {
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriber(Subscriber newSubscriber) {
		Subscriber oldSubscriber = subscriber;
		subscriber = newSubscriber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.EMAIL_RESPONSE__SUBSCRIBER, oldSubscriber, subscriber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmailCampaign getCampaign() {
		if (campaign != null && campaign.eIsProxy()) {
			InternalEObject oldCampaign = (InternalEObject)campaign;
			campaign = (EmailCampaign)eResolveProxy(oldCampaign);
			if (campaign != oldCampaign) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmailMarketingSystemPackage.EMAIL_RESPONSE__CAMPAIGN, oldCampaign, campaign));
			}
		}
		return campaign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailCampaign basicGetCampaign() {
		return campaign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCampaign(EmailCampaign newCampaign, NotificationChain msgs) {
		EmailCampaign oldCampaign = campaign;
		campaign = newCampaign;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.EMAIL_RESPONSE__CAMPAIGN, oldCampaign, newCampaign);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCampaign(EmailCampaign newCampaign) {
		if (newCampaign != campaign) {
			NotificationChain msgs = null;
			if (campaign != null)
				msgs = ((InternalEObject)campaign).eInverseRemove(this, EmailMarketingSystemPackage.EMAIL_CAMPAIGN__EMAIL_RESPONSES, EmailCampaign.class, msgs);
			if (newCampaign != null)
				msgs = ((InternalEObject)newCampaign).eInverseAdd(this, EmailMarketingSystemPackage.EMAIL_CAMPAIGN__EMAIL_RESPONSES, EmailCampaign.class, msgs);
			msgs = basicSetCampaign(newCampaign, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.EMAIL_RESPONSE__CAMPAIGN, newCampaign, newCampaign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseType getResponseTypeDetail() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__CAMPAIGN:
				if (campaign != null)
					msgs = ((InternalEObject)campaign).eInverseRemove(this, EmailMarketingSystemPackage.EMAIL_CAMPAIGN__EMAIL_RESPONSES, EmailCampaign.class, msgs);
				return basicSetCampaign((EmailCampaign)otherEnd, msgs);
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
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__CAMPAIGN:
				return basicSetCampaign(null, msgs);
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
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__RESPONSE_ID:
				return getResponseID();
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__TIMESTAMP:
				return getTimestamp();
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__RESPONSE_TYPE:
				return getResponseType();
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__SUBSCRIBER:
				if (resolve) return getSubscriber();
				return basicGetSubscriber();
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__CAMPAIGN:
				if (resolve) return getCampaign();
				return basicGetCampaign();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__RESPONSE_ID:
				setResponseID((String)newValue);
				return;
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__TIMESTAMP:
				setTimestamp((Date)newValue);
				return;
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__RESPONSE_TYPE:
				setResponseType((ResponseType)newValue);
				return;
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__SUBSCRIBER:
				setSubscriber((Subscriber)newValue);
				return;
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__CAMPAIGN:
				setCampaign((EmailCampaign)newValue);
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
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__RESPONSE_ID:
				setResponseID(RESPONSE_ID_EDEFAULT);
				return;
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__RESPONSE_TYPE:
				setResponseType(RESPONSE_TYPE_EDEFAULT);
				return;
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__SUBSCRIBER:
				setSubscriber((Subscriber)null);
				return;
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__CAMPAIGN:
				setCampaign((EmailCampaign)null);
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
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__RESPONSE_ID:
				return RESPONSE_ID_EDEFAULT == null ? responseID != null : !RESPONSE_ID_EDEFAULT.equals(responseID);
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__RESPONSE_TYPE:
				return responseType != RESPONSE_TYPE_EDEFAULT;
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__SUBSCRIBER:
				return subscriber != null;
			case EmailMarketingSystemPackage.EMAIL_RESPONSE__CAMPAIGN:
				return campaign != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EmailMarketingSystemPackage.EMAIL_RESPONSE___GET_RESPONSE_TYPE_DETAIL:
				return getResponseTypeDetail();
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
		result.append(" (responseID: ");
		result.append(responseID);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", responseType: ");
		result.append(responseType);
		result.append(')');
		return result.toString();
	}

} //EmailResponseImpl
