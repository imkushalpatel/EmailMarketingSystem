/**
 */
package emailmarketingsystem.impl;

import emailmarketingsystem.*;

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
public class EmailmarketingsystemFactoryImpl extends EFactoryImpl implements EmailmarketingsystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EmailmarketingsystemFactory init() {
		try {
			EmailmarketingsystemFactory theEmailmarketingsystemFactory = (EmailmarketingsystemFactory)EPackage.Registry.INSTANCE.getEFactory(EmailmarketingsystemPackage.eNS_URI);
			if (theEmailmarketingsystemFactory != null) {
				return theEmailmarketingsystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmailmarketingsystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailmarketingsystemFactoryImpl() {
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
			case EmailmarketingsystemPackage.CAMPAIGN_STATE_MACHINE: return createCampaignStateMachine();
			case EmailmarketingsystemPackage.CAMPAIGN: return createCampaign();
			case EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS: return createCampaignAnalytics();
			case EmailmarketingsystemPackage.SEGMENT: return createSegment();
			case EmailmarketingsystemPackage.SEGMENT_CONDITION: return createSegmentCondition();
			case EmailmarketingsystemPackage.SUBSCRIBER: return createSubscriber();
			case EmailmarketingsystemPackage.PREFERENCE: return createPreference();
			case EmailmarketingsystemPackage.EMAIL_CAMPAIGN: return createEmailCampaign();
			case EmailmarketingsystemPackage.EMAIL_TEMPLATE: return createEmailTemplate();
			case EmailmarketingsystemPackage.EMAIL_RESPONSE: return createEmailResponse();
			case EmailmarketingsystemPackage.DATE_TIME: return createDateTime();
			case EmailmarketingsystemPackage.USER_FLOW_STATE_MACHINE: return createUserFlowStateMachine();
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
			case EmailmarketingsystemPackage.CAMPAIGN_STATUS:
				return createCampaignStatusFromString(eDataType, initialValue);
			case EmailmarketingsystemPackage.RESPONSE_TYPE:
				return createResponseTypeFromString(eDataType, initialValue);
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
			case EmailmarketingsystemPackage.CAMPAIGN_STATUS:
				return convertCampaignStatusToString(eDataType, instanceValue);
			case EmailmarketingsystemPackage.RESPONSE_TYPE:
				return convertResponseTypeToString(eDataType, instanceValue);
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
	public CampaignStateMachine createCampaignStateMachine() {
		CampaignStateMachineImpl campaignStateMachine = new CampaignStateMachineImpl();
		return campaignStateMachine;
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
	@Override
	public DateTime createDateTime() {
		DateTimeImpl dateTime = new DateTimeImpl();
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserFlowStateMachine createUserFlowStateMachine() {
		UserFlowStateMachineImpl userFlowStateMachine = new UserFlowStateMachineImpl();
		return userFlowStateMachine;
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
	@Override
	public EmailmarketingsystemPackage getEmailmarketingsystemPackage() {
		return (EmailmarketingsystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmailmarketingsystemPackage getPackage() {
		return EmailmarketingsystemPackage.eINSTANCE;
	}

} //EmailmarketingsystemFactoryImpl
