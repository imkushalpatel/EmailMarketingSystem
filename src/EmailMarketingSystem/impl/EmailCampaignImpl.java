/**
 */
package EmailMarketingSystem.impl;

import EmailMarketingSystem.EmailCampaign;
import EmailMarketingSystem.EmailMarketingSystemPackage;
import EmailMarketingSystem.EmailResponse;
import EmailMarketingSystem.EmailTemplate;
import EmailMarketingSystem.Subscriber;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Email Campaign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link EmailMarketingSystem.impl.EmailCampaignImpl#getEmailCampaignId <em>Email Campaign Id</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.EmailCampaignImpl#getSendDate <em>Send Date</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.EmailCampaignImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.EmailCampaignImpl#getEmailResponses <em>Email Responses</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.EmailCampaignImpl#getRecipients <em>Recipients</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmailCampaignImpl extends CampaignImpl implements EmailCampaign {
	/**
	 * The default value of the '{@link #getEmailCampaignId() <em>Email Campaign Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailCampaignId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_CAMPAIGN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailCampaignId() <em>Email Campaign Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailCampaignId()
	 * @generated
	 * @ordered
	 */
	protected String emailCampaignId = EMAIL_CAMPAIGN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSendDate() <em>Send Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SEND_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSendDate() <em>Send Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendDate()
	 * @generated
	 * @ordered
	 */
	protected Date sendDate = SEND_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected EmailTemplate template;

	/**
	 * The cached value of the '{@link #getEmailResponses() <em>Email Responses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailResponses()
	 * @generated
	 * @ordered
	 */
	protected EList<EmailResponse> emailResponses;

	/**
	 * The cached value of the '{@link #getRecipients() <em>Recipients</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipients()
	 * @generated
	 * @ordered
	 */
	protected EList<Subscriber> recipients;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmailCampaignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmailMarketingSystemPackage.Literals.EMAIL_CAMPAIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailCampaignId() {
		return emailCampaignId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailCampaignId(String newEmailCampaignId) {
		String oldEmailCampaignId = emailCampaignId;
		emailCampaignId = newEmailCampaignId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.EMAIL_CAMPAIGN__EMAIL_CAMPAIGN_ID, oldEmailCampaignId, emailCampaignId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSendDate() {
		return sendDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSendDate(Date newSendDate) {
		Date oldSendDate = sendDate;
		sendDate = newSendDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.EMAIL_CAMPAIGN__SEND_DATE, oldSendDate, sendDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Subscriber> getRecipients() {
		if (recipients == null) {
			recipients = new EObjectWithInverseResolvingEList.ManyInverse<Subscriber>(Subscriber.class, this, EmailMarketingSystemPackage.EMAIL_CAMPAIGN__RECIPIENTS, EmailMarketingSystemPackage.SUBSCRIBER__EMAIL_CAMPAIGNS);
		}
		return recipients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmailTemplate getTemplate() {
		if (template != null && template.eIsProxy()) {
			InternalEObject oldTemplate = (InternalEObject)template;
			template = (EmailTemplate)eResolveProxy(oldTemplate);
			if (template != oldTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmailMarketingSystemPackage.EMAIL_CAMPAIGN__TEMPLATE, oldTemplate, template));
			}
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailTemplate basicGetTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(EmailTemplate newTemplate, NotificationChain msgs) {
		EmailTemplate oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.EMAIL_CAMPAIGN__TEMPLATE, oldTemplate, newTemplate);
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
	public void setTemplate(EmailTemplate newTemplate) {
		if (newTemplate != template) {
			NotificationChain msgs = null;
			if (template != null)
				msgs = ((InternalEObject)template).eInverseRemove(this, EmailMarketingSystemPackage.EMAIL_TEMPLATE__EMAIL_CAMPAIGNS, EmailTemplate.class, msgs);
			if (newTemplate != null)
				msgs = ((InternalEObject)newTemplate).eInverseAdd(this, EmailMarketingSystemPackage.EMAIL_TEMPLATE__EMAIL_CAMPAIGNS, EmailTemplate.class, msgs);
			msgs = basicSetTemplate(newTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.EMAIL_CAMPAIGN__TEMPLATE, newTemplate, newTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailResponse> getEmailResponses() {
		if (emailResponses == null) {
			emailResponses = new EObjectWithInverseResolvingEList<EmailResponse>(EmailResponse.class, this, EmailMarketingSystemPackage.EMAIL_CAMPAIGN__EMAIL_RESPONSES, EmailMarketingSystemPackage.EMAIL_RESPONSE__CAMPAIGN);
		}
		return emailResponses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendEmail() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void trackCampaign() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pauseCampaign() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelCampaign() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addEmailCampaign() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeEmailCampaign() {
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
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__TEMPLATE:
				if (template != null)
					msgs = ((InternalEObject)template).eInverseRemove(this, EmailMarketingSystemPackage.EMAIL_TEMPLATE__EMAIL_CAMPAIGNS, EmailTemplate.class, msgs);
				return basicSetTemplate((EmailTemplate)otherEnd, msgs);
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__EMAIL_RESPONSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmailResponses()).basicAdd(otherEnd, msgs);
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__RECIPIENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRecipients()).basicAdd(otherEnd, msgs);
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
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__TEMPLATE:
				return basicSetTemplate(null, msgs);
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__EMAIL_RESPONSES:
				return ((InternalEList<?>)getEmailResponses()).basicRemove(otherEnd, msgs);
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__RECIPIENTS:
				return ((InternalEList<?>)getRecipients()).basicRemove(otherEnd, msgs);
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
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__EMAIL_CAMPAIGN_ID:
				return getEmailCampaignId();
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__SEND_DATE:
				return getSendDate();
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__TEMPLATE:
				if (resolve) return getTemplate();
				return basicGetTemplate();
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__EMAIL_RESPONSES:
				return getEmailResponses();
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__RECIPIENTS:
				return getRecipients();
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
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__EMAIL_CAMPAIGN_ID:
				setEmailCampaignId((String)newValue);
				return;
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__SEND_DATE:
				setSendDate((Date)newValue);
				return;
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__TEMPLATE:
				setTemplate((EmailTemplate)newValue);
				return;
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__EMAIL_RESPONSES:
				getEmailResponses().clear();
				getEmailResponses().addAll((Collection<? extends EmailResponse>)newValue);
				return;
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__RECIPIENTS:
				getRecipients().clear();
				getRecipients().addAll((Collection<? extends Subscriber>)newValue);
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
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__EMAIL_CAMPAIGN_ID:
				setEmailCampaignId(EMAIL_CAMPAIGN_ID_EDEFAULT);
				return;
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__SEND_DATE:
				setSendDate(SEND_DATE_EDEFAULT);
				return;
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__TEMPLATE:
				setTemplate((EmailTemplate)null);
				return;
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__EMAIL_RESPONSES:
				getEmailResponses().clear();
				return;
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__RECIPIENTS:
				getRecipients().clear();
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
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__EMAIL_CAMPAIGN_ID:
				return EMAIL_CAMPAIGN_ID_EDEFAULT == null ? emailCampaignId != null : !EMAIL_CAMPAIGN_ID_EDEFAULT.equals(emailCampaignId);
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__SEND_DATE:
				return SEND_DATE_EDEFAULT == null ? sendDate != null : !SEND_DATE_EDEFAULT.equals(sendDate);
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__TEMPLATE:
				return template != null;
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__EMAIL_RESPONSES:
				return emailResponses != null && !emailResponses.isEmpty();
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN__RECIPIENTS:
				return recipients != null && !recipients.isEmpty();
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
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN___SEND_EMAIL:
				sendEmail();
				return null;
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN___TRACK_CAMPAIGN:
				trackCampaign();
				return null;
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN___PAUSE_CAMPAIGN:
				pauseCampaign();
				return null;
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN___CANCEL_CAMPAIGN:
				cancelCampaign();
				return null;
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN___ADD_EMAIL_CAMPAIGN:
				addEmailCampaign();
				return null;
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN___REMOVE_EMAIL_CAMPAIGN:
				removeEmailCampaign();
				return null;
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
		result.append(" (emailCampaignId: ");
		result.append(emailCampaignId);
		result.append(", sendDate: ");
		result.append(sendDate);
		result.append(')');
		return result.toString();
	}

} //EmailCampaignImpl
