/**
 */
package EmailMarketingSystem.util;

import EmailMarketingSystem.*;

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
 * @see EmailMarketingSystem.EmailMarketingSystemPackage
 * @generated
 */
public class EmailMarketingSystemValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EmailMarketingSystemValidator INSTANCE = new EmailMarketingSystemValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "EmailMarketingSystem";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint7' of 'Campaign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAMPAIGN__CONSTRAINT7 = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint8' of 'Campaign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAMPAIGN__CONSTRAINT8 = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint9' of 'Campaign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAMPAIGN__CONSTRAINT9 = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint11' of 'Segment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEGMENT__CONSTRAINT11 = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint12' of 'Segment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEGMENT__CONSTRAINT12 = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint14' of 'Segment Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEGMENT_CONDITION__CONSTRAINT14 = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint6' of 'Segment Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEGMENT_CONDITION__CONSTRAINT6 = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint1' of 'Subscriber'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIBER__CONSTRAINT1 = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint2' of 'Subscriber'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIBER__CONSTRAINT2 = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint3' of 'Subscriber'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIBER__CONSTRAINT3 = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint4' of 'Subscriber'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIBER__CONSTRAINT4 = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint5' of 'Subscriber'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIBER__CONSTRAINT5 = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint10' of 'Email Campaign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMAIL_CAMPAIGN__CONSTRAINT10 = 13;

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
	public EmailMarketingSystemValidator() {
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
	  return EmailMarketingSystemPackage.eINSTANCE;
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
			case EmailMarketingSystemPackage.STATE_MACHINE1:
				return validateStateMachine1((StateMachine1)value, diagnostics, context);
			case EmailMarketingSystemPackage.CAMPAIGN:
				return validateCampaign((Campaign)value, diagnostics, context);
			case EmailMarketingSystemPackage.CAMPAIGN_ANALYTICS:
				return validateCampaignAnalytics((CampaignAnalytics)value, diagnostics, context);
			case EmailMarketingSystemPackage.SEGMENT:
				return validateSegment((Segment)value, diagnostics, context);
			case EmailMarketingSystemPackage.SEGMENT_CONDITION:
				return validateSegmentCondition((SegmentCondition)value, diagnostics, context);
			case EmailMarketingSystemPackage.SUBSCRIBER:
				return validateSubscriber((Subscriber)value, diagnostics, context);
			case EmailMarketingSystemPackage.PREFERENCE:
				return validatePreference((Preference)value, diagnostics, context);
			case EmailMarketingSystemPackage.EMAIL_CAMPAIGN:
				return validateEmailCampaign((EmailCampaign)value, diagnostics, context);
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE:
				return validateEmailTemplate((EmailTemplate)value, diagnostics, context);
			case EmailMarketingSystemPackage.EMAIL_RESPONSE:
				return validateEmailResponse((EmailResponse)value, diagnostics, context);
			case EmailMarketingSystemPackage.DATE_TIME:
				return validateDateTime((DateTime)value, diagnostics, context);
			case EmailMarketingSystemPackage.CAMPAIGN_STATUS:
				return validateCampaignStatus((CampaignStatus)value, diagnostics, context);
			case EmailMarketingSystemPackage.RESPONSE_TYPE:
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
	public boolean validateStateMachine1(StateMachine1 stateMachine1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stateMachine1, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateCampaign_Constraint7(campaign, diagnostics, context);
		if (result || diagnostics != null) result &= validateCampaign_Constraint8(campaign, diagnostics, context);
		if (result || diagnostics != null) result &= validateCampaign_Constraint9(campaign, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Constraint7 constraint of '<em>Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCampaign_Constraint7(Campaign campaign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return campaign.Constraint7(diagnostics, context);
	}

	/**
	 * Validates the Constraint8 constraint of '<em>Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCampaign_Constraint8(Campaign campaign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return campaign.Constraint8(diagnostics, context);
	}

	/**
	 * Validates the Constraint9 constraint of '<em>Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCampaign_Constraint9(Campaign campaign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return campaign.Constraint9(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateSegment_Constraint11(segment, diagnostics, context);
		if (result || diagnostics != null) result &= validateSegment_Constraint12(segment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Constraint11 constraint of '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSegment_Constraint11(Segment segment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return segment.Constraint11(diagnostics, context);
	}

	/**
	 * Validates the Constraint12 constraint of '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSegment_Constraint12(Segment segment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return segment.Constraint12(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateSegmentCondition_Constraint14(segmentCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateSegmentCondition_Constraint6(segmentCondition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Constraint14 constraint of '<em>Segment Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSegmentCondition_Constraint14(SegmentCondition segmentCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return segmentCondition.Constraint14(diagnostics, context);
	}

	/**
	 * Validates the Constraint6 constraint of '<em>Segment Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSegmentCondition_Constraint6(SegmentCondition segmentCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return segmentCondition.Constraint6(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateSubscriber_Constraint1(subscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubscriber_Constraint2(subscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubscriber_Constraint3(subscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubscriber_Constraint4(subscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubscriber_Constraint5(subscriber, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Constraint1 constraint of '<em>Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriber_Constraint1(Subscriber subscriber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscriber.Constraint1(diagnostics, context);
	}

	/**
	 * Validates the Constraint2 constraint of '<em>Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriber_Constraint2(Subscriber subscriber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscriber.Constraint2(diagnostics, context);
	}

	/**
	 * Validates the Constraint3 constraint of '<em>Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriber_Constraint3(Subscriber subscriber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscriber.Constraint3(diagnostics, context);
	}

	/**
	 * Validates the Constraint4 constraint of '<em>Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriber_Constraint4(Subscriber subscriber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscriber.Constraint4(diagnostics, context);
	}

	/**
	 * Validates the Constraint5 constraint of '<em>Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriber_Constraint5(Subscriber subscriber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscriber.Constraint5(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateCampaign_Constraint7(emailCampaign, diagnostics, context);
		if (result || diagnostics != null) result &= validateCampaign_Constraint8(emailCampaign, diagnostics, context);
		if (result || diagnostics != null) result &= validateCampaign_Constraint9(emailCampaign, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmailCampaign_Constraint10(emailCampaign, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Constraint10 constraint of '<em>Email Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailCampaign_Constraint10(EmailCampaign emailCampaign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return emailCampaign.Constraint10(diagnostics, context);
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

} //EmailMarketingSystemValidator
