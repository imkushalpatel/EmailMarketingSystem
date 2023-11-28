/**
 */
package EmailMarketingSystem.impl;

import EmailMarketingSystem.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmailMarketingSystemFactoryImpl extends EFactoryImpl implements EmailMarketingSystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EmailMarketingSystemFactory init() {
		try {
			EmailMarketingSystemFactory theEmailMarketingSystemFactory = (EmailMarketingSystemFactory)EPackage.Registry.INSTANCE.getEFactory(EmailMarketingSystemPackage.eNS_URI);
			if (theEmailMarketingSystemFactory != null) {
				return theEmailMarketingSystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmailMarketingSystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailMarketingSystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EmailMarketingSystemPackage.STATE_MACHINE1: return createStateMachine1();
			case EmailMarketingSystemPackage.CAMPAIGN: return createCampaign();
			case EmailMarketingSystemPackage.CAMPAIGN_ANALYTICS: return createCampaignAnalytics();
			case EmailMarketingSystemPackage.SEGMENT: return createSegment();
			case EmailMarketingSystemPackage.SEGMENT_CONDITION: return createSegmentCondition();
			case EmailMarketingSystemPackage.SUBSCRIBER: return createSubscriber();
			case EmailMarketingSystemPackage.PREFERENCE: return createPreference();
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN: return createEmailCampaign();
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE: return createEmailTemplate();
			case EmailMarketingSystemPackage.EMAIL_RESPONSE: return createEmailResponse();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EmailMarketingSystemPackage.CAMPAIGN_STATUS:
				return createCampaignStatusFromString(eDataType, initialValue);
			case EmailMarketingSystemPackage.RESPONSE_TYPE:
				return createResponseTypeFromString(eDataType, initialValue);
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN_STATUS:
				return createEmailCampaignStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EmailMarketingSystemPackage.CAMPAIGN_STATUS:
				return convertCampaignStatusToString(eDataType, instanceValue);
			case EmailMarketingSystemPackage.RESPONSE_TYPE:
				return convertResponseTypeToString(eDataType, instanceValue);
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN_STATUS:
				return convertEmailCampaignStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateMachine1 createStateMachine1() {
		StateMachine1Impl stateMachine1 = new StateMachine1Impl();
		return stateMachine1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Campaign createCampaign() {
		CampaignImpl campaign = new CampaignImpl();
		return campaign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CampaignAnalytics createCampaignAnalytics() {
		CampaignAnalyticsImpl campaignAnalytics = new CampaignAnalyticsImpl();
		return campaignAnalytics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Segment createSegment() {
		SegmentImpl segment = new SegmentImpl();
		return segment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentCondition createSegmentCondition() {
		SegmentConditionImpl segmentCondition = new SegmentConditionImpl();
		return segmentCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subscriber createSubscriber() {
		SubscriberImpl subscriber = new SubscriberImpl();
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Preference createPreference() {
		PreferenceImpl preference = new PreferenceImpl();
		return preference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmailCampaign createEmailCampaign() {
		EmailCampaignImpl emailCampaign = new EmailCampaignImpl();
		return emailCampaign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmailTemplate createEmailTemplate() {
		EmailTemplateImpl emailTemplate = new EmailTemplateImpl();
		return emailTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmailResponse createEmailResponse() {
		EmailResponseImpl emailResponse = new EmailResponseImpl();
		return emailResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CampaignStatus createCampaignStatusFromString(EDataType eDataType, String initialValue) {
		CampaignStatus result = CampaignStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCampaignStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseType createResponseTypeFromString(EDataType eDataType, String initialValue) {
		ResponseType result = ResponseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResponseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailCampaignStatus createEmailCampaignStatusFromString(EDataType eDataType, String initialValue) {
		EmailCampaignStatus result = EmailCampaignStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEmailCampaignStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmailMarketingSystemPackage getEmailMarketingSystemPackage() {
		return (EmailMarketingSystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmailMarketingSystemPackage getPackage() {
		return EmailMarketingSystemPackage.eINSTANCE;
	}

} //EmailMarketingSystemFactoryImpl
