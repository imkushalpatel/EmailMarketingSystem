/**
 */
package EmailMarketingSystem.impl;

import EmailMarketingSystem.Campaign;
import EmailMarketingSystem.CampaignAnalytics;
import EmailMarketingSystem.CampaignStatus;
import EmailMarketingSystem.DateTime;
import EmailMarketingSystem.EmailCampaign;
import EmailMarketingSystem.EmailMarketingSystemFactory;
import EmailMarketingSystem.EmailMarketingSystemPackage;
import EmailMarketingSystem.EmailResponse;
import EmailMarketingSystem.EmailTemplate;
import EmailMarketingSystem.Preference;
import EmailMarketingSystem.ResponseType;
import EmailMarketingSystem.Segment;
import EmailMarketingSystem.SegmentCondition;
import EmailMarketingSystem.StateMachine1;
import EmailMarketingSystem.Subscriber;

import EmailMarketingSystem.util.EmailMarketingSystemValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmailMarketingSystemPackageImpl extends EPackageImpl implements EmailMarketingSystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachine1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass campaignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass campaignAnalyticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segmentConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailCampaignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum campaignStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum responseTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EmailMarketingSystemPackageImpl() {
		super(eNS_URI, EmailMarketingSystemFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EmailMarketingSystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EmailMarketingSystemPackage init() {
		if (isInited) return (EmailMarketingSystemPackage)EPackage.Registry.INSTANCE.getEPackage(EmailMarketingSystemPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEmailMarketingSystemPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EmailMarketingSystemPackageImpl theEmailMarketingSystemPackage = registeredEmailMarketingSystemPackage instanceof EmailMarketingSystemPackageImpl ? (EmailMarketingSystemPackageImpl)registeredEmailMarketingSystemPackage : new EmailMarketingSystemPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEmailMarketingSystemPackage.createPackageContents();

		// Initialize created meta-data
		theEmailMarketingSystemPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEmailMarketingSystemPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return EmailMarketingSystemValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEmailMarketingSystemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EmailMarketingSystemPackage.eNS_URI, theEmailMarketingSystemPackage);
		return theEmailMarketingSystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateMachine1() {
		return stateMachine1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCampaign() {
		return campaignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCampaign_CampaignId() {
		return (EAttribute)campaignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCampaign_Name() {
		return (EAttribute)campaignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCampaign_StartDate() {
		return (EAttribute)campaignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCampaign_EndDate() {
		return (EAttribute)campaignEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCampaign_Status() {
		return (EAttribute)campaignEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCampaign_Analytics() {
		return (EReference)campaignEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCampaign_Segments() {
		return (EReference)campaignEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCampaign__Constraint7__DiagnosticChain_Map() {
		return campaignEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCampaign__Constraint8__DiagnosticChain_Map() {
		return campaignEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCampaign__Constraint9__DiagnosticChain_Map() {
		return campaignEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCampaign__GetAnalyticsDetails() {
		return campaignEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCampaign__AddSegment__String() {
		return campaignEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCampaign__RemoveSegment__String() {
		return campaignEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCampaign__ViewSegmentDetails__String() {
		return campaignEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCampaign__PauseCampaign() {
		return campaignEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCampaign__CancelCampaign() {
		return campaignEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCampaignAnalytics() {
		return campaignAnalyticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCampaignAnalytics_Clicks() {
		return (EAttribute)campaignAnalyticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCampaignAnalytics_Opens() {
		return (EAttribute)campaignAnalyticsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCampaignAnalytics_Conversions() {
		return (EAttribute)campaignAnalyticsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCampaignAnalytics__TrackClick() {
		return campaignAnalyticsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCampaignAnalytics__TrackOpen() {
		return campaignAnalyticsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCampaignAnalytics__TrackConversion() {
		return campaignAnalyticsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSegment() {
		return segmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSegment_SegmentId() {
		return (EAttribute)segmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSegment_Name() {
		return (EAttribute)segmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSegment_Conditions() {
		return (EReference)segmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSegment__Constraint11__DiagnosticChain_Map() {
		return segmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSegment__Constraint12__DiagnosticChain_Map() {
		return segmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSegment__AddCondition__String_String_String() {
		return segmentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSegment__RemoveCondition__int() {
		return segmentEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSegment__ViewConditions() {
		return segmentEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSegmentCondition() {
		return segmentConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSegmentCondition_Attribute() {
		return (EAttribute)segmentConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSegmentCondition_Operator() {
		return (EAttribute)segmentConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSegmentCondition_Value() {
		return (EAttribute)segmentConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSegmentCondition__Constraint14__DiagnosticChain_Map() {
		return segmentConditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSegmentCondition__Constraint6__DiagnosticChain_Map() {
		return segmentConditionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubscriber() {
		return subscriberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscriber_SubscriberId() {
		return (EAttribute)subscriberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscriber_SubscriptionDate() {
		return (EAttribute)subscriberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscriber_Email() {
		return (EAttribute)subscriberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscriber_LastName() {
		return (EAttribute)subscriberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubscriber_FirstName() {
		return (EAttribute)subscriberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscriber_Preferences() {
		return (EReference)subscriberEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscriber_Segments() {
		return (EReference)subscriberEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscriber_EmailCampaigns() {
		return (EReference)subscriberEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscriber__Constraint1__DiagnosticChain_Map() {
		return subscriberEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscriber__Constraint2__DiagnosticChain_Map() {
		return subscriberEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscriber__Constraint3__DiagnosticChain_Map() {
		return subscriberEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscriber__Constraint4__DiagnosticChain_Map() {
		return subscriberEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscriber__Constraint5__DiagnosticChain_Map() {
		return subscriberEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscriber__AddEmailCampaign__String() {
		return subscriberEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscriber__RemoveEmailCampaign__String() {
		return subscriberEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscriber__UpdatePreferences__String_Preference() {
		return subscriberEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscriber__AddSegment__String() {
		return subscriberEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscriber__RemoveSegment__String() {
		return subscriberEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscriber__ViewSegmentDetails__String() {
		return subscriberEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreference() {
		return preferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreference_PreferenceId() {
		return (EAttribute)preferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreference_Name() {
		return (EAttribute)preferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPreference_Value() {
		return (EAttribute)preferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPreference__UpdatePreference__String_String() {
		return preferenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmailCampaign() {
		return emailCampaignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailCampaign_SendDate() {
		return (EAttribute)emailCampaignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmailCampaign_Template() {
		return (EReference)emailCampaignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmailCampaign_EmailResponses() {
		return (EReference)emailCampaignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmailCampaign_Recipients() {
		return (EReference)emailCampaignEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmailCampaign__Constraint10__DiagnosticChain_Map() {
		return emailCampaignEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmailCampaign__SendEmail() {
		return emailCampaignEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmailCampaign__TrackCampaign() {
		return emailCampaignEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmailCampaign__RecordEmailResponse__EmailResponse() {
		return emailCampaignEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmailTemplate() {
		return emailTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailTemplate_TemplateId() {
		return (EAttribute)emailTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailTemplate_Name() {
		return (EAttribute)emailTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailTemplate_Subject() {
		return (EAttribute)emailTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailTemplate_Content() {
		return (EAttribute)emailTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailTemplate_CreatedDate() {
		return (EAttribute)emailTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmailTemplate_EmailCampaigns() {
		return (EReference)emailTemplateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmailTemplate__Constraint13__DiagnosticChain_Map() {
		return emailTemplateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmailTemplate__AddEmailCampaign__String() {
		return emailTemplateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmailTemplate__RemoveEmailCampaign__String() {
		return emailTemplateEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmailResponse() {
		return emailResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailResponse_ResponseID() {
		return (EAttribute)emailResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailResponse_Timestamp() {
		return (EAttribute)emailResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailResponse_ResponseType() {
		return (EAttribute)emailResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmailResponse_Subscriber() {
		return (EReference)emailResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmailResponse_Campaign() {
		return (EReference)emailResponseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmailResponse__GetResponseTypeDetail() {
		return emailResponseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateTime() {
		return dateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDateTime__Now() {
		return dateTimeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCampaignStatus() {
		return campaignStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResponseType() {
		return responseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmailMarketingSystemFactory getEmailMarketingSystemFactory() {
		return (EmailMarketingSystemFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		stateMachine1EClass = createEClass(STATE_MACHINE1);

		campaignEClass = createEClass(CAMPAIGN);
		createEAttribute(campaignEClass, CAMPAIGN__CAMPAIGN_ID);
		createEAttribute(campaignEClass, CAMPAIGN__NAME);
		createEAttribute(campaignEClass, CAMPAIGN__START_DATE);
		createEAttribute(campaignEClass, CAMPAIGN__END_DATE);
		createEAttribute(campaignEClass, CAMPAIGN__STATUS);
		createEReference(campaignEClass, CAMPAIGN__ANALYTICS);
		createEReference(campaignEClass, CAMPAIGN__SEGMENTS);
		createEOperation(campaignEClass, CAMPAIGN___CONSTRAINT7__DIAGNOSTICCHAIN_MAP);
		createEOperation(campaignEClass, CAMPAIGN___CONSTRAINT8__DIAGNOSTICCHAIN_MAP);
		createEOperation(campaignEClass, CAMPAIGN___CONSTRAINT9__DIAGNOSTICCHAIN_MAP);
		createEOperation(campaignEClass, CAMPAIGN___GET_ANALYTICS_DETAILS);
		createEOperation(campaignEClass, CAMPAIGN___ADD_SEGMENT__STRING);
		createEOperation(campaignEClass, CAMPAIGN___REMOVE_SEGMENT__STRING);
		createEOperation(campaignEClass, CAMPAIGN___VIEW_SEGMENT_DETAILS__STRING);
		createEOperation(campaignEClass, CAMPAIGN___PAUSE_CAMPAIGN);
		createEOperation(campaignEClass, CAMPAIGN___CANCEL_CAMPAIGN);

		campaignAnalyticsEClass = createEClass(CAMPAIGN_ANALYTICS);
		createEAttribute(campaignAnalyticsEClass, CAMPAIGN_ANALYTICS__CLICKS);
		createEAttribute(campaignAnalyticsEClass, CAMPAIGN_ANALYTICS__OPENS);
		createEAttribute(campaignAnalyticsEClass, CAMPAIGN_ANALYTICS__CONVERSIONS);
		createEOperation(campaignAnalyticsEClass, CAMPAIGN_ANALYTICS___TRACK_CLICK);
		createEOperation(campaignAnalyticsEClass, CAMPAIGN_ANALYTICS___TRACK_OPEN);
		createEOperation(campaignAnalyticsEClass, CAMPAIGN_ANALYTICS___TRACK_CONVERSION);

		segmentEClass = createEClass(SEGMENT);
		createEAttribute(segmentEClass, SEGMENT__SEGMENT_ID);
		createEAttribute(segmentEClass, SEGMENT__NAME);
		createEReference(segmentEClass, SEGMENT__CONDITIONS);
		createEOperation(segmentEClass, SEGMENT___CONSTRAINT11__DIAGNOSTICCHAIN_MAP);
		createEOperation(segmentEClass, SEGMENT___CONSTRAINT12__DIAGNOSTICCHAIN_MAP);
		createEOperation(segmentEClass, SEGMENT___ADD_CONDITION__STRING_STRING_STRING);
		createEOperation(segmentEClass, SEGMENT___REMOVE_CONDITION__INT);
		createEOperation(segmentEClass, SEGMENT___VIEW_CONDITIONS);

		segmentConditionEClass = createEClass(SEGMENT_CONDITION);
		createEAttribute(segmentConditionEClass, SEGMENT_CONDITION__ATTRIBUTE);
		createEAttribute(segmentConditionEClass, SEGMENT_CONDITION__OPERATOR);
		createEAttribute(segmentConditionEClass, SEGMENT_CONDITION__VALUE);
		createEOperation(segmentConditionEClass, SEGMENT_CONDITION___CONSTRAINT14__DIAGNOSTICCHAIN_MAP);
		createEOperation(segmentConditionEClass, SEGMENT_CONDITION___CONSTRAINT6__DIAGNOSTICCHAIN_MAP);

		subscriberEClass = createEClass(SUBSCRIBER);
		createEAttribute(subscriberEClass, SUBSCRIBER__SUBSCRIBER_ID);
		createEAttribute(subscriberEClass, SUBSCRIBER__SUBSCRIPTION_DATE);
		createEAttribute(subscriberEClass, SUBSCRIBER__EMAIL);
		createEAttribute(subscriberEClass, SUBSCRIBER__LAST_NAME);
		createEAttribute(subscriberEClass, SUBSCRIBER__FIRST_NAME);
		createEReference(subscriberEClass, SUBSCRIBER__PREFERENCES);
		createEReference(subscriberEClass, SUBSCRIBER__SEGMENTS);
		createEReference(subscriberEClass, SUBSCRIBER__EMAIL_CAMPAIGNS);
		createEOperation(subscriberEClass, SUBSCRIBER___CONSTRAINT1__DIAGNOSTICCHAIN_MAP);
		createEOperation(subscriberEClass, SUBSCRIBER___CONSTRAINT2__DIAGNOSTICCHAIN_MAP);
		createEOperation(subscriberEClass, SUBSCRIBER___CONSTRAINT3__DIAGNOSTICCHAIN_MAP);
		createEOperation(subscriberEClass, SUBSCRIBER___CONSTRAINT4__DIAGNOSTICCHAIN_MAP);
		createEOperation(subscriberEClass, SUBSCRIBER___CONSTRAINT5__DIAGNOSTICCHAIN_MAP);
		createEOperation(subscriberEClass, SUBSCRIBER___ADD_EMAIL_CAMPAIGN__STRING);
		createEOperation(subscriberEClass, SUBSCRIBER___REMOVE_EMAIL_CAMPAIGN__STRING);
		createEOperation(subscriberEClass, SUBSCRIBER___UPDATE_PREFERENCES__STRING_PREFERENCE);
		createEOperation(subscriberEClass, SUBSCRIBER___ADD_SEGMENT__STRING);
		createEOperation(subscriberEClass, SUBSCRIBER___REMOVE_SEGMENT__STRING);
		createEOperation(subscriberEClass, SUBSCRIBER___VIEW_SEGMENT_DETAILS__STRING);

		preferenceEClass = createEClass(PREFERENCE);
		createEAttribute(preferenceEClass, PREFERENCE__PREFERENCE_ID);
		createEAttribute(preferenceEClass, PREFERENCE__NAME);
		createEAttribute(preferenceEClass, PREFERENCE__VALUE);
		createEOperation(preferenceEClass, PREFERENCE___UPDATE_PREFERENCE__STRING_STRING);

		emailCampaignEClass = createEClass(EMAIL_CAMPAIGN);
		createEAttribute(emailCampaignEClass, EMAIL_CAMPAIGN__SEND_DATE);
		createEReference(emailCampaignEClass, EMAIL_CAMPAIGN__TEMPLATE);
		createEReference(emailCampaignEClass, EMAIL_CAMPAIGN__EMAIL_RESPONSES);
		createEReference(emailCampaignEClass, EMAIL_CAMPAIGN__RECIPIENTS);
		createEOperation(emailCampaignEClass, EMAIL_CAMPAIGN___CONSTRAINT10__DIAGNOSTICCHAIN_MAP);
		createEOperation(emailCampaignEClass, EMAIL_CAMPAIGN___SEND_EMAIL);
		createEOperation(emailCampaignEClass, EMAIL_CAMPAIGN___TRACK_CAMPAIGN);
		createEOperation(emailCampaignEClass, EMAIL_CAMPAIGN___RECORD_EMAIL_RESPONSE__EMAILRESPONSE);

		emailTemplateEClass = createEClass(EMAIL_TEMPLATE);
		createEAttribute(emailTemplateEClass, EMAIL_TEMPLATE__TEMPLATE_ID);
		createEAttribute(emailTemplateEClass, EMAIL_TEMPLATE__NAME);
		createEAttribute(emailTemplateEClass, EMAIL_TEMPLATE__SUBJECT);
		createEAttribute(emailTemplateEClass, EMAIL_TEMPLATE__CONTENT);
		createEAttribute(emailTemplateEClass, EMAIL_TEMPLATE__CREATED_DATE);
		createEReference(emailTemplateEClass, EMAIL_TEMPLATE__EMAIL_CAMPAIGNS);
		createEOperation(emailTemplateEClass, EMAIL_TEMPLATE___CONSTRAINT13__DIAGNOSTICCHAIN_MAP);
		createEOperation(emailTemplateEClass, EMAIL_TEMPLATE___ADD_EMAIL_CAMPAIGN__STRING);
		createEOperation(emailTemplateEClass, EMAIL_TEMPLATE___REMOVE_EMAIL_CAMPAIGN__STRING);

		emailResponseEClass = createEClass(EMAIL_RESPONSE);
		createEAttribute(emailResponseEClass, EMAIL_RESPONSE__RESPONSE_ID);
		createEAttribute(emailResponseEClass, EMAIL_RESPONSE__TIMESTAMP);
		createEAttribute(emailResponseEClass, EMAIL_RESPONSE__RESPONSE_TYPE);
		createEReference(emailResponseEClass, EMAIL_RESPONSE__SUBSCRIBER);
		createEReference(emailResponseEClass, EMAIL_RESPONSE__CAMPAIGN);
		createEOperation(emailResponseEClass, EMAIL_RESPONSE___GET_RESPONSE_TYPE_DETAIL);

		dateTimeEClass = createEClass(DATE_TIME);
		createEOperation(dateTimeEClass, DATE_TIME___NOW);

		// Create enums
		campaignStatusEEnum = createEEnum(CAMPAIGN_STATUS);
		responseTypeEEnum = createEEnum(RESPONSE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		emailCampaignEClass.getESuperTypes().add(this.getCampaign());

		// Initialize classes, features, and operations; add parameters
		initEClass(stateMachine1EClass, StateMachine1.class, "StateMachine1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(campaignEClass, Campaign.class, "Campaign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCampaign_CampaignId(), ecorePackage.getEString(), "campaignId", null, 1, 1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCampaign_Name(), ecorePackage.getEString(), "name", null, 1, 1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCampaign_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCampaign_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCampaign_Status(), this.getCampaignStatus(), "status", null, 1, 1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCampaign_Analytics(), this.getCampaignAnalytics(), null, "analytics", null, 0, 1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCampaign_Segments(), this.getSegment(), null, "segments", null, 0, -1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getCampaign__Constraint7__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint7", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCampaign__Constraint8__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint8", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCampaign__Constraint9__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint9", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCampaign__GetAnalyticsDetails(), this.getCampaignAnalytics(), "getAnalyticsDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCampaign__AddSegment__String(), this.getSegment(), "addSegment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCampaign__RemoveSegment__String(), null, "removeSegment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "segmentId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCampaign__ViewSegmentDetails__String(), this.getSegment(), "viewSegmentDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "segmentId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCampaign__PauseCampaign(), null, "pauseCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCampaign__CancelCampaign(), null, "cancelCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(campaignAnalyticsEClass, CampaignAnalytics.class, "CampaignAnalytics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCampaignAnalytics_Clicks(), ecorePackage.getEInt(), "clicks", null, 1, 1, CampaignAnalytics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCampaignAnalytics_Opens(), ecorePackage.getEInt(), "opens", null, 1, 1, CampaignAnalytics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCampaignAnalytics_Conversions(), ecorePackage.getEInt(), "conversions", null, 1, 1, CampaignAnalytics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getCampaignAnalytics__TrackClick(), null, "trackClick", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCampaignAnalytics__TrackOpen(), null, "trackOpen", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCampaignAnalytics__TrackConversion(), null, "trackConversion", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(segmentEClass, Segment.class, "Segment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSegment_SegmentId(), ecorePackage.getEString(), "segmentId", null, 1, 1, Segment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSegment_Name(), ecorePackage.getEString(), "name", null, 1, 1, Segment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSegment_Conditions(), this.getSegmentCondition(), null, "conditions", null, 0, -1, Segment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getSegment__Constraint11__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint11", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSegment__Constraint12__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint12", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSegment__AddCondition__String_String_String(), null, "addCondition", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "operator", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getSegment__RemoveCondition__int(), null, "removeCondition", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "conditionIndex", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSegment__ViewConditions(), this.getSegmentCondition(), "viewConditions", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(segmentConditionEClass, SegmentCondition.class, "SegmentCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSegmentCondition_Attribute(), ecorePackage.getEString(), "attribute", null, 1, 1, SegmentCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSegmentCondition_Operator(), ecorePackage.getEString(), "operator", null, 1, 1, SegmentCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSegmentCondition_Value(), ecorePackage.getEString(), "value", null, 1, 1, SegmentCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getSegmentCondition__Constraint14__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint14", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSegmentCondition__Constraint6__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint6", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(subscriberEClass, Subscriber.class, "Subscriber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubscriber_SubscriberId(), ecorePackage.getEString(), "subscriberId", null, 1, 1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubscriber_SubscriptionDate(), ecorePackage.getEDate(), "subscriptionDate", null, 1, 1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubscriber_Email(), ecorePackage.getEString(), "email", null, 1, 1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubscriber_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubscriber_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubscriber_Preferences(), this.getPreference(), null, "preferences", null, 0, -1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubscriber_Segments(), this.getSegment(), null, "segments", null, 0, -1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubscriber_EmailCampaigns(), this.getEmailCampaign(), this.getEmailCampaign_Recipients(), "emailCampaigns", null, 0, -1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getSubscriber__Constraint1__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSubscriber__Constraint2__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSubscriber__Constraint3__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint3", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSubscriber__Constraint4__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint4", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSubscriber__Constraint5__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint5", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSubscriber__AddEmailCampaign__String(), null, "addEmailCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "emailCampaignId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getSubscriber__RemoveEmailCampaign__String(), null, "removeEmailCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "emailCampaignId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getSubscriber__UpdatePreferences__String_Preference(), null, "updatePreferences", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "subscriberId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPreference(), "preferences", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getSubscriber__AddSegment__String(), this.getSegment(), "addSegment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getSubscriber__RemoveSegment__String(), null, "removeSegment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "segmentId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getSubscriber__ViewSegmentDetails__String(), this.getSegment(), "viewSegmentDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "segmentId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(preferenceEClass, Preference.class, "Preference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreference_PreferenceId(), ecorePackage.getEString(), "preferenceId", null, 1, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPreference_Name(), ecorePackage.getEString(), "name", null, 1, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPreference_Value(), ecorePackage.getEString(), "value", null, 1, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPreference__UpdatePreference__String_String(), null, "updatePreference", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "preferenceId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(emailCampaignEClass, EmailCampaign.class, "EmailCampaign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmailCampaign_SendDate(), ecorePackage.getEDate(), "sendDate", null, 1, 1, EmailCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmailCampaign_Template(), this.getEmailTemplate(), this.getEmailTemplate_EmailCampaigns(), "template", null, 1, 1, EmailCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmailCampaign_EmailResponses(), this.getEmailResponse(), this.getEmailResponse_Campaign(), "emailResponses", null, 0, -1, EmailCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmailCampaign_Recipients(), this.getSubscriber(), this.getSubscriber_EmailCampaigns(), "recipients", null, 0, -1, EmailCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getEmailCampaign__Constraint10__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint10", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEmailCampaign__SendEmail(), null, "sendEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmailCampaign__TrackCampaign(), this.getCampaignAnalytics(), "trackCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getEmailCampaign__RecordEmailResponse__EmailResponse(), null, "recordEmailResponse", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getEmailResponse(), "response", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(emailTemplateEClass, EmailTemplate.class, "EmailTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmailTemplate_TemplateId(), ecorePackage.getEString(), "templateId", null, 1, 1, EmailTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmailTemplate_Name(), ecorePackage.getEString(), "name", null, 1, 1, EmailTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmailTemplate_Subject(), ecorePackage.getEString(), "subject", null, 1, 1, EmailTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmailTemplate_Content(), ecorePackage.getEString(), "content", null, 1, 1, EmailTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmailTemplate_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 1, 1, EmailTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmailTemplate_EmailCampaigns(), this.getEmailCampaign(), this.getEmailCampaign_Template(), "emailCampaigns", null, 0, -1, EmailTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getEmailTemplate__Constraint13__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Constraint13", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEmailTemplate__AddEmailCampaign__String(), null, "addEmailCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "emailCampaignId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getEmailTemplate__RemoveEmailCampaign__String(), null, "removeEmailCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "emailCampaignId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(emailResponseEClass, EmailResponse.class, "EmailResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmailResponse_ResponseID(), ecorePackage.getEString(), "responseID", null, 1, 1, EmailResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmailResponse_Timestamp(), ecorePackage.getEDate(), "timestamp", null, 1, 1, EmailResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmailResponse_ResponseType(), this.getResponseType(), "responseType", null, 1, 1, EmailResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmailResponse_Subscriber(), this.getSubscriber(), null, "subscriber", null, 1, 1, EmailResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmailResponse_Campaign(), this.getEmailCampaign(), this.getEmailCampaign_EmailResponses(), "campaign", null, 1, 1, EmailResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getEmailResponse__GetResponseTypeDetail(), this.getResponseType(), "getResponseTypeDetail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(dateTimeEClass, DateTime.class, "DateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDateTime__Now(), ecorePackage.getEDate(), "now", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(campaignStatusEEnum, CampaignStatus.class, "CampaignStatus");
		addEEnumLiteral(campaignStatusEEnum, CampaignStatus.ACTIVE);
		addEEnumLiteral(campaignStatusEEnum, CampaignStatus.INACTIVE);
		addEEnumLiteral(campaignStatusEEnum, CampaignStatus.STOPPED);
		addEEnumLiteral(campaignStatusEEnum, CampaignStatus.EXPIRED);

		initEEnum(responseTypeEEnum, ResponseType.class, "ResponseType");
		addEEnumLiteral(responseTypeEEnum, ResponseType.OPENED);
		addEEnumLiteral(responseTypeEEnum, ResponseType.CLICKED);
		addEEnumLiteral(responseTypeEEnum, ResponseType.UNSUBSCRIBED);
		addEEnumLiteral(responseTypeEEnum, ResponseType._BOUNCED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (responseTypeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "originalName", " BOUNCED"
		   });
	}

} //EmailMarketingSystemPackageImpl
