/**
 */
package EmailMarketingSystem.impl;

import EmailMarketingSystem.Campaign;
import EmailMarketingSystem.EmailCampaign;
import EmailMarketingSystem.EmailMarketingSystemPackage;
import EmailMarketingSystem.EmailResponse;
import EmailMarketingSystem.EmailTemplate;
import EmailMarketingSystem.MarketingSystem;
import EmailMarketingSystem.Subscriber;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marketing System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link EmailMarketingSystem.impl.MarketingSystemImpl#getCampaigns <em>Campaigns</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.MarketingSystemImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.MarketingSystemImpl#getSubscribers <em>Subscribers</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.MarketingSystemImpl#getEmailCampaigns <em>Email Campaigns</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.MarketingSystemImpl#getEmailResponses <em>Email Responses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarketingSystemImpl extends MinimalEObjectImpl.Container implements MarketingSystem {
	/**
	 * The cached value of the '{@link #getCampaigns() <em>Campaigns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampaigns()
	 * @generated
	 * @ordered
	 */
	protected EList<Campaign> campaigns;

	/**
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<EmailTemplate> templates;

	/**
	 * The cached value of the '{@link #getSubscribers() <em>Subscribers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribers()
	 * @generated
	 * @ordered
	 */
	protected EList<Subscriber> subscribers;

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
	 * The cached value of the '{@link #getEmailResponses() <em>Email Responses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailResponses()
	 * @generated
	 * @ordered
	 */
	protected EList<EmailResponse> emailResponses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketingSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmailMarketingSystemPackage.Literals.MARKETING_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Campaign> getCampaigns() {
		if (campaigns == null) {
			campaigns = new EObjectResolvingEList<Campaign>(Campaign.class, this, EmailMarketingSystemPackage.MARKETING_SYSTEM__CAMPAIGNS);
		}
		return campaigns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailTemplate> getTemplates() {
		if (templates == null) {
			templates = new EObjectResolvingEList<EmailTemplate>(EmailTemplate.class, this, EmailMarketingSystemPackage.MARKETING_SYSTEM__TEMPLATES);
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Subscriber> getSubscribers() {
		if (subscribers == null) {
			subscribers = new EObjectResolvingEList<Subscriber>(Subscriber.class, this, EmailMarketingSystemPackage.MARKETING_SYSTEM__SUBSCRIBERS);
		}
		return subscribers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailCampaign> getEmailCampaigns() {
		if (emailCampaigns == null) {
			emailCampaigns = new EObjectResolvingEList<EmailCampaign>(EmailCampaign.class, this, EmailMarketingSystemPackage.MARKETING_SYSTEM__EMAIL_CAMPAIGNS);
		}
		return emailCampaigns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailResponse> getEmailResponses() {
		if (emailResponses == null) {
			emailResponses = new EObjectResolvingEList<EmailResponse>(EmailResponse.class, this, EmailMarketingSystemPackage.MARKETING_SYSTEM__EMAIL_RESPONSES);
		}
		return emailResponses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createCampaign() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateCampaign() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteCampaign() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void viewCampaignDetails() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createTemplate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateTemplate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteTemplate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void viewTemplateDetails() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void subscribe() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsubscribe() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateSubscription() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void viewSubscriberDetails() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public void analyzeCampaign() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createSegment() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void viewSegmentDetails() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendEmailToSegment() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void recordEmailResponse() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__CAMPAIGNS:
				return getCampaigns();
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__TEMPLATES:
				return getTemplates();
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__SUBSCRIBERS:
				return getSubscribers();
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__EMAIL_CAMPAIGNS:
				return getEmailCampaigns();
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__EMAIL_RESPONSES:
				return getEmailResponses();
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
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__CAMPAIGNS:
				getCampaigns().clear();
				getCampaigns().addAll((Collection<? extends Campaign>)newValue);
				return;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends EmailTemplate>)newValue);
				return;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__SUBSCRIBERS:
				getSubscribers().clear();
				getSubscribers().addAll((Collection<? extends Subscriber>)newValue);
				return;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__EMAIL_CAMPAIGNS:
				getEmailCampaigns().clear();
				getEmailCampaigns().addAll((Collection<? extends EmailCampaign>)newValue);
				return;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__EMAIL_RESPONSES:
				getEmailResponses().clear();
				getEmailResponses().addAll((Collection<? extends EmailResponse>)newValue);
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
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__CAMPAIGNS:
				getCampaigns().clear();
				return;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__TEMPLATES:
				getTemplates().clear();
				return;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__SUBSCRIBERS:
				getSubscribers().clear();
				return;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__EMAIL_CAMPAIGNS:
				getEmailCampaigns().clear();
				return;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__EMAIL_RESPONSES:
				getEmailResponses().clear();
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
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__CAMPAIGNS:
				return campaigns != null && !campaigns.isEmpty();
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__TEMPLATES:
				return templates != null && !templates.isEmpty();
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__SUBSCRIBERS:
				return subscribers != null && !subscribers.isEmpty();
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__EMAIL_CAMPAIGNS:
				return emailCampaigns != null && !emailCampaigns.isEmpty();
			case EmailMarketingSystemPackage.MARKETING_SYSTEM__EMAIL_RESPONSES:
				return emailResponses != null && !emailResponses.isEmpty();
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
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___CREATE_CAMPAIGN:
				createCampaign();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___UPDATE_CAMPAIGN:
				updateCampaign();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___DELETE_CAMPAIGN:
				deleteCampaign();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___VIEW_CAMPAIGN_DETAILS:
				viewCampaignDetails();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___CREATE_TEMPLATE:
				createTemplate();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___UPDATE_TEMPLATE:
				updateTemplate();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___DELETE_TEMPLATE:
				deleteTemplate();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___VIEW_TEMPLATE_DETAILS:
				viewTemplateDetails();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___SUBSCRIBE:
				subscribe();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___UNSUBSCRIBE:
				unsubscribe();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___UPDATE_SUBSCRIPTION:
				updateSubscription();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___VIEW_SUBSCRIBER_DETAILS:
				viewSubscriberDetails();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___SEND_EMAIL:
				sendEmail();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___TRACK_CAMPAIGN:
				trackCampaign();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___PAUSE_CAMPAIGN:
				pauseCampaign();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___CANCEL_CAMPAIGN:
				cancelCampaign();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___ANALYZE_CAMPAIGN:
				analyzeCampaign();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___CREATE_SEGMENT:
				createSegment();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___VIEW_SEGMENT_DETAILS:
				viewSegmentDetails();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___SEND_EMAIL_TO_SEGMENT:
				sendEmailToSegment();
				return null;
			case EmailMarketingSystemPackage.MARKETING_SYSTEM___RECORD_EMAIL_RESPONSE:
				recordEmailResponse();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MarketingSystemImpl
