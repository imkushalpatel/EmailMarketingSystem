/**
 */
package emailmarketingsystem.util;

import emailmarketingsystem.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see emailmarketingsystem.EmailmarketingsystemPackage
 * @generated
 */
public class EmailmarketingsystemValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EmailmarketingsystemValidator INSTANCE = new EmailmarketingsystemValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "emailmarketingsystem";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Campaign Duplicate Name Check' of 'Campaign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAMPAIGN__CAMPAIGN_DUPLICATE_NAME_CHECK = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Campaign Name Check' of 'Campaign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAMPAIGN__CAMPAIGN_NAME_CHECK = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Campaign Start End Date Check' of 'Campaign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAMPAIGN__CAMPAIGN_START_END_DATE_CHECK = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Segment Duplicate Name Check' of 'Segment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEGMENT__SEGMENT_DUPLICATE_NAME_CHECK = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Segment Subsribers Size Check' of 'Segment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEGMENT__SEGMENT_SUBSRIBERS_SIZE_CHECK = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Segment Condition Operater Check' of 'Segment Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEGMENT_CONDITION__SEGMENT_CONDITION_OPERATER_CHECK = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Segment Condition Null Check' of 'Segment Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEGMENT_CONDITION__SEGMENT_CONDITION_NULL_CHECK = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subscriber Duplicate Email Check' of 'Subscriber'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIBER__SUBSCRIBER_DUPLICATE_EMAIL_CHECK = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subscriber Email Check' of 'Subscriber'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIBER__SUBSCRIBER_EMAIL_CHECK = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subscriber Email Regex Check' of 'Subscriber'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIBER__SUBSCRIBER_EMAIL_REGEX_CHECK = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subscriber Campaigns Segment Check' of 'Subscriber'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIBER__SUBSCRIBER_CAMPAIGNS_SEGMENT_CHECK = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subscriber Name Check' of 'Subscriber'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIBER__SUBSCRIBER_NAME_CHECK = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Email Campaing Send Date Check' of 'Email Campaign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMAIL_CAMPAIGN__EMAIL_CAMPAING_SEND_DATE_CHECK = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint13' of 'Email Template'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMAIL_TEMPLATE__CONSTRAINT13 = 14;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 14;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Delegates evaluation of the given invariant expression against the object in the given context.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context, String validationDelegate, EOperation invariant, String expression, int severity, String source, int code) {
		return EObjectValidator.validate(eClass, eObject, diagnostics, context, validationDelegate, invariant, expression, severity, source, code);
	}

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailmarketingsystemValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return EmailmarketingsystemPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case EmailmarketingsystemPackage.CAMPAIGN_STATE_MACHINE:
				return validateCampaignStateMachine((CampaignStateMachine)value, diagnostics, context);
			case EmailmarketingsystemPackage.CAMPAIGN:
				return validateCampaign((Campaign)value, diagnostics, context);
			case EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS:
				return validateCampaignAnalytics((CampaignAnalytics)value, diagnostics, context);
			case EmailmarketingsystemPackage.SEGMENT:
				return validateSegment((Segment)value, diagnostics, context);
			case EmailmarketingsystemPackage.SEGMENT_CONDITION:
				return validateSegmentCondition((SegmentCondition)value, diagnostics, context);
			case EmailmarketingsystemPackage.SUBSCRIBER:
				return validateSubscriber((Subscriber)value, diagnostics, context);
			case EmailmarketingsystemPackage.PREFERENCE:
				return validatePreference((Preference)value, diagnostics, context);
			case EmailmarketingsystemPackage.EMAIL_CAMPAIGN:
				return validateEmailCampaign((EmailCampaign)value, diagnostics, context);
			case EmailmarketingsystemPackage.EMAIL_TEMPLATE:
				return validateEmailTemplate((EmailTemplate)value, diagnostics, context);
			case EmailmarketingsystemPackage.EMAIL_RESPONSE:
				return validateEmailResponse((EmailResponse)value, diagnostics, context);
			case EmailmarketingsystemPackage.DATE_TIME:
				return validateDateTime((DateTime)value, diagnostics, context);
			case EmailmarketingsystemPackage.USER_FLOW_STATE_MACHINE:
				return validateUserFlowStateMachine((UserFlowStateMachine)value, diagnostics, context);
			case EmailmarketingsystemPackage.CAMPAIGN_STATUS:
				return validateCampaignStatus((CampaignStatus)value, diagnostics, context);
			case EmailmarketingsystemPackage.RESPONSE_TYPE:
				return validateResponseType((ResponseType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCampaignStateMachine(CampaignStateMachine campaignStateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(campaignStateMachine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCampaign(Campaign campaign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(campaign, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(campaign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(campaign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(campaign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(campaign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(campaign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(campaign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(campaign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(campaign, diagnostics, context);
		if (result || diagnostics != null) result &= validateCampaign_campaignDuplicateNameCheck(campaign, diagnostics, context);
		if (result || diagnostics != null) result &= validateCampaign_campaignNameCheck(campaign, diagnostics, context);
		if (result || diagnostics != null) result &= validateCampaign_campaignStartEndDateCheck(campaign, diagnostics, context);
		return result;
	}

	/**
	 * Validates the campaignDuplicateNameCheck constraint of '<em>Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCampaign_campaignDuplicateNameCheck(Campaign campaign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return campaign.campaignDuplicateNameCheck(diagnostics, context);
	}

	/**
	 * Validates the campaignNameCheck constraint of '<em>Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCampaign_campaignNameCheck(Campaign campaign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return campaign.campaignNameCheck(diagnostics, context);
	}

	/**
	 * Validates the campaignStartEndDateCheck constraint of '<em>Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCampaign_campaignStartEndDateCheck(Campaign campaign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return campaign.campaignStartEndDateCheck(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCampaignAnalytics(CampaignAnalytics campaignAnalytics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(campaignAnalytics, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSegment(Segment segment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(segment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(segment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(segment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(segment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(segment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(segment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(segment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(segment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(segment, diagnostics, context);
		if (result || diagnostics != null) result &= validateSegment_segmentDuplicateNameCheck(segment, diagnostics, context);
		if (result || diagnostics != null) result &= validateSegment_segmentSubsribersSizeCheck(segment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the segmentDuplicateNameCheck constraint of '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSegment_segmentDuplicateNameCheck(Segment segment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return segment.segmentDuplicateNameCheck(diagnostics, context);
	}

	/**
	 * Validates the segmentSubsribersSizeCheck constraint of '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSegment_segmentSubsribersSizeCheck(Segment segment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return segment.segmentSubsribersSizeCheck(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSegmentCondition(SegmentCondition segmentCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(segmentCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(segmentCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(segmentCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(segmentCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(segmentCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(segmentCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(segmentCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(segmentCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(segmentCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateSegmentCondition_segmentConditionOperaterCheck(segmentCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateSegmentCondition_segmentConditionNullCheck(segmentCondition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the segmentConditionOperaterCheck constraint of '<em>Segment Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSegmentCondition_segmentConditionOperaterCheck(SegmentCondition segmentCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return segmentCondition.segmentConditionOperaterCheck(diagnostics, context);
	}

	/**
	 * Validates the segmentConditionNullCheck constraint of '<em>Segment Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSegmentCondition_segmentConditionNullCheck(SegmentCondition segmentCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return segmentCondition.segmentConditionNullCheck(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriber(Subscriber subscriber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subscriber, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubscriber_subscriberDuplicateEmailCheck(subscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubscriber_subscriberEmailCheck(subscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubscriber_subscriberEmailRegexCheck(subscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubscriber_subscriberCampaignsSegmentCheck(subscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubscriber_subscriberNameCheck(subscriber, diagnostics, context);
		return result;
	}

	/**
	 * Validates the subscriberDuplicateEmailCheck constraint of '<em>Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriber_subscriberDuplicateEmailCheck(Subscriber subscriber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscriber.subscriberDuplicateEmailCheck(diagnostics, context);
	}

	/**
	 * Validates the subscriberEmailCheck constraint of '<em>Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriber_subscriberEmailCheck(Subscriber subscriber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscriber.subscriberEmailCheck(diagnostics, context);
	}

	/**
	 * Validates the subscriberEmailRegexCheck constraint of '<em>Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriber_subscriberEmailRegexCheck(Subscriber subscriber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscriber.subscriberEmailRegexCheck(diagnostics, context);
	}

	/**
	 * Validates the subscriberCampaignsSegmentCheck constraint of '<em>Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriber_subscriberCampaignsSegmentCheck(Subscriber subscriber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscriber.subscriberCampaignsSegmentCheck(diagnostics, context);
	}

	/**
	 * Validates the subscriberNameCheck constraint of '<em>Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriber_subscriberNameCheck(Subscriber subscriber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscriber.subscriberNameCheck(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreference(Preference preference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(preference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailCampaign(EmailCampaign emailCampaign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(emailCampaign, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(emailCampaign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emailCampaign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emailCampaign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(emailCampaign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(emailCampaign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(emailCampaign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(emailCampaign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emailCampaign, diagnostics, context);
		if (result || diagnostics != null) result &= validateCampaign_campaignDuplicateNameCheck(emailCampaign, diagnostics, context);
		if (result || diagnostics != null) result &= validateCampaign_campaignNameCheck(emailCampaign, diagnostics, context);
		if (result || diagnostics != null) result &= validateCampaign_campaignStartEndDateCheck(emailCampaign, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmailCampaign_emailCampaingSendDateCheck(emailCampaign, diagnostics, context);
		return result;
	}

	/**
	 * Validates the emailCampaingSendDateCheck constraint of '<em>Email Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailCampaign_emailCampaingSendDateCheck(EmailCampaign emailCampaign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return emailCampaign.emailCampaingSendDateCheck(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailTemplate(EmailTemplate emailTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(emailTemplate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(emailTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emailTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emailTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(emailTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(emailTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(emailTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(emailTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emailTemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmailTemplate_Constraint13(emailTemplate, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Constraint13 constraint of '<em>Email Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailTemplate_Constraint13(EmailTemplate emailTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return emailTemplate.Constraint13(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailResponse(EmailResponse emailResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emailResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime(DateTime dateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserFlowStateMachine(UserFlowStateMachine userFlowStateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userFlowStateMachine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCampaignStatus(CampaignStatus campaignStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseType(ResponseType responseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EmailmarketingsystemValidator
