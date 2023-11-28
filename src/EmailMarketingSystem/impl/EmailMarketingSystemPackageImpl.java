/**
 */
package EmailMarketingSystem.impl;

import EmailMarketingSystem.Campaign;
import EmailMarketingSystem.CampaignAnalytics;
import EmailMarketingSystem.CampaignStatus;
import EmailMarketingSystem.EmailCampaign;
import EmailMarketingSystem.EmailCampaignStatus;
import EmailMarketingSystem.EmailMarketingSystemFactory;
import EmailMarketingSystem.EmailMarketingSystemPackage;
import EmailMarketingSystem.EmailResponse;
import EmailMarketingSystem.EmailTemplate;
import EmailMarketingSystem.MarketingSystem;
import EmailMarketingSystem.Preference;
import EmailMarketingSystem.ResponseType;
import EmailMarketingSystem.Segment;
import EmailMarketingSystem.SegmentCondition;
import EmailMarketingSystem.StateMachine1;
import EmailMarketingSystem.Subscriber;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	private EClass emailCampaignEClass = null;

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
	private EClass marketingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum emailCampaignStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum responseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum campaignStatusEEnum = null;

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
	public EReference getCampaign_EmailCampaigns() {
		return (EReference)campaignEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCampaign_Status() {
		return (EAttribute)campaignEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCampaign_Analytics() {
		return (EReference)campaignEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCampaign_Segments() {
		return (EReference)campaignEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCampaign__AddEmailCampaign() {
		return campaignEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCampaign__RemoveEmailCampaign() {
		return campaignEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCampaign__GetAnalyticsDetails() {
		return campaignEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCampaign__AddSegment() {
		return campaignEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCampaign__RemoveSegment() {
		return campaignEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCampaign__ViewSegmentDetails() {
		return campaignEClass.getEOperations().get(5);
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
	public EAttribute getEmailCampaign_EmailCampaignId() {
		return (EAttribute)emailCampaignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailCampaign_SendDate() {
		return (EAttribute)emailCampaignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailCampaign_Status() {
		return (EAttribute)emailCampaignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmailCampaign_Analytics() {
		return (EReference)emailCampaignEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmailCampaign_Recipients() {
		return (EReference)emailCampaignEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmailCampaign_Template() {
		return (EReference)emailCampaignEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmailCampaign_EmailResponses() {
		return (EReference)emailCampaignEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmailCampaign__SendEmail() {
		return emailCampaignEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmailCampaign__TrackCampaign() {
		return emailCampaignEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmailCampaign__PauseCampaign() {
		return emailCampaignEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmailCampaign__CancelCampaign() {
		return emailCampaignEClass.getEOperations().get(3);
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
	public EOperation getSubscriber__AddEmailCampaign() {
		return subscriberEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscriber__RemoveEmailCampaign() {
		return subscriberEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscriber__UpdatePreferences() {
		return subscriberEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscriber__AddSegment() {
		return subscriberEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscriber__RemoveSegment() {
		return subscriberEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscriber__ViewSegmentDetails() {
		return subscriberEClass.getEOperations().get(5);
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
	public EOperation getPreference__UpdatePreference() {
		return preferenceEClass.getEOperations().get(0);
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
	public EOperation getSegment__AddCondition() {
		return segmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSegment__RemoveCondition() {
		return segmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSegment__ViewConditions() {
		return segmentEClass.getEOperations().get(2);
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
	public EAttribute getEmailTemplate_Content() {
		return (EAttribute)emailTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailTemplate_CreatedDate() {
		return (EAttribute)emailTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmailTemplate_EmailCampaigns() {
		return (EReference)emailTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmailTemplate__AddEmailCampaign() {
		return emailTemplateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmailTemplate__RemoveEmailCampaign() {
		return emailTemplateEClass.getEOperations().get(1);
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
	public EClass getMarketingSystem() {
		return marketingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketingSystem_Campaigns() {
		return (EReference)marketingSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketingSystem_Templates() {
		return (EReference)marketingSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketingSystem_Subscribers() {
		return (EReference)marketingSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketingSystem_EmailCampaigns() {
		return (EReference)marketingSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketingSystem_EmailResponses() {
		return (EReference)marketingSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__CreateCampaign() {
		return marketingSystemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__UpdateCampaign() {
		return marketingSystemEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__DeleteCampaign() {
		return marketingSystemEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__ViewCampaignDetails() {
		return marketingSystemEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__CreateTemplate() {
		return marketingSystemEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__UpdateTemplate() {
		return marketingSystemEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__DeleteTemplate() {
		return marketingSystemEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__ViewTemplateDetails() {
		return marketingSystemEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__Subscribe() {
		return marketingSystemEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__Unsubscribe() {
		return marketingSystemEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__UpdateSubscription() {
		return marketingSystemEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__ViewSubscriberDetails() {
		return marketingSystemEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__SendEmail() {
		return marketingSystemEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__TrackCampaign() {
		return marketingSystemEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__PauseCampaign() {
		return marketingSystemEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__CancelCampaign() {
		return marketingSystemEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__AnalyzeCampaign() {
		return marketingSystemEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__CreateSegment() {
		return marketingSystemEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__ViewSegmentDetails() {
		return marketingSystemEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__SendEmailToSegment() {
		return marketingSystemEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarketingSystem__RecordEmailResponse() {
		return marketingSystemEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEmailCampaignStatus() {
		return emailCampaignStatusEEnum;
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
	public EEnum getCampaignStatus() {
		return campaignStatusEEnum;
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
		createEReference(campaignEClass, CAMPAIGN__EMAIL_CAMPAIGNS);
		createEAttribute(campaignEClass, CAMPAIGN__STATUS);
		createEReference(campaignEClass, CAMPAIGN__ANALYTICS);
		createEReference(campaignEClass, CAMPAIGN__SEGMENTS);
		createEOperation(campaignEClass, CAMPAIGN___ADD_EMAIL_CAMPAIGN);
		createEOperation(campaignEClass, CAMPAIGN___REMOVE_EMAIL_CAMPAIGN);
		createEOperation(campaignEClass, CAMPAIGN___GET_ANALYTICS_DETAILS);
		createEOperation(campaignEClass, CAMPAIGN___ADD_SEGMENT);
		createEOperation(campaignEClass, CAMPAIGN___REMOVE_SEGMENT);
		createEOperation(campaignEClass, CAMPAIGN___VIEW_SEGMENT_DETAILS);

		emailCampaignEClass = createEClass(EMAIL_CAMPAIGN);
		createEAttribute(emailCampaignEClass, EMAIL_CAMPAIGN__EMAIL_CAMPAIGN_ID);
		createEAttribute(emailCampaignEClass, EMAIL_CAMPAIGN__SEND_DATE);
		createEAttribute(emailCampaignEClass, EMAIL_CAMPAIGN__STATUS);
		createEReference(emailCampaignEClass, EMAIL_CAMPAIGN__ANALYTICS);
		createEReference(emailCampaignEClass, EMAIL_CAMPAIGN__RECIPIENTS);
		createEReference(emailCampaignEClass, EMAIL_CAMPAIGN__TEMPLATE);
		createEReference(emailCampaignEClass, EMAIL_CAMPAIGN__EMAIL_RESPONSES);
		createEOperation(emailCampaignEClass, EMAIL_CAMPAIGN___SEND_EMAIL);
		createEOperation(emailCampaignEClass, EMAIL_CAMPAIGN___TRACK_CAMPAIGN);
		createEOperation(emailCampaignEClass, EMAIL_CAMPAIGN___PAUSE_CAMPAIGN);
		createEOperation(emailCampaignEClass, EMAIL_CAMPAIGN___CANCEL_CAMPAIGN);

		campaignAnalyticsEClass = createEClass(CAMPAIGN_ANALYTICS);
		createEAttribute(campaignAnalyticsEClass, CAMPAIGN_ANALYTICS__CLICKS);
		createEAttribute(campaignAnalyticsEClass, CAMPAIGN_ANALYTICS__OPENS);
		createEAttribute(campaignAnalyticsEClass, CAMPAIGN_ANALYTICS__CONVERSIONS);
		createEOperation(campaignAnalyticsEClass, CAMPAIGN_ANALYTICS___TRACK_CLICK);
		createEOperation(campaignAnalyticsEClass, CAMPAIGN_ANALYTICS___TRACK_OPEN);
		createEOperation(campaignAnalyticsEClass, CAMPAIGN_ANALYTICS___TRACK_CONVERSION);

		subscriberEClass = createEClass(SUBSCRIBER);
		createEAttribute(subscriberEClass, SUBSCRIBER__SUBSCRIBER_ID);
		createEAttribute(subscriberEClass, SUBSCRIBER__SUBSCRIPTION_DATE);
		createEAttribute(subscriberEClass, SUBSCRIBER__EMAIL);
		createEAttribute(subscriberEClass, SUBSCRIBER__LAST_NAME);
		createEAttribute(subscriberEClass, SUBSCRIBER__FIRST_NAME);
		createEReference(subscriberEClass, SUBSCRIBER__PREFERENCES);
		createEReference(subscriberEClass, SUBSCRIBER__SEGMENTS);
		createEReference(subscriberEClass, SUBSCRIBER__EMAIL_CAMPAIGNS);
		createEOperation(subscriberEClass, SUBSCRIBER___ADD_EMAIL_CAMPAIGN);
		createEOperation(subscriberEClass, SUBSCRIBER___REMOVE_EMAIL_CAMPAIGN);
		createEOperation(subscriberEClass, SUBSCRIBER___UPDATE_PREFERENCES);
		createEOperation(subscriberEClass, SUBSCRIBER___ADD_SEGMENT);
		createEOperation(subscriberEClass, SUBSCRIBER___REMOVE_SEGMENT);
		createEOperation(subscriberEClass, SUBSCRIBER___VIEW_SEGMENT_DETAILS);

		preferenceEClass = createEClass(PREFERENCE);
		createEAttribute(preferenceEClass, PREFERENCE__PREFERENCE_ID);
		createEAttribute(preferenceEClass, PREFERENCE__NAME);
		createEAttribute(preferenceEClass, PREFERENCE__VALUE);
		createEOperation(preferenceEClass, PREFERENCE___UPDATE_PREFERENCE);

		segmentEClass = createEClass(SEGMENT);
		createEAttribute(segmentEClass, SEGMENT__SEGMENT_ID);
		createEAttribute(segmentEClass, SEGMENT__NAME);
		createEReference(segmentEClass, SEGMENT__CONDITIONS);
		createEOperation(segmentEClass, SEGMENT___ADD_CONDITION);
		createEOperation(segmentEClass, SEGMENT___REMOVE_CONDITION);
		createEOperation(segmentEClass, SEGMENT___VIEW_CONDITIONS);

		segmentConditionEClass = createEClass(SEGMENT_CONDITION);
		createEAttribute(segmentConditionEClass, SEGMENT_CONDITION__ATTRIBUTE);
		createEAttribute(segmentConditionEClass, SEGMENT_CONDITION__OPERATOR);
		createEAttribute(segmentConditionEClass, SEGMENT_CONDITION__VALUE);

		emailTemplateEClass = createEClass(EMAIL_TEMPLATE);
		createEAttribute(emailTemplateEClass, EMAIL_TEMPLATE__TEMPLATE_ID);
		createEAttribute(emailTemplateEClass, EMAIL_TEMPLATE__NAME);
		createEAttribute(emailTemplateEClass, EMAIL_TEMPLATE__CONTENT);
		createEAttribute(emailTemplateEClass, EMAIL_TEMPLATE__CREATED_DATE);
		createEReference(emailTemplateEClass, EMAIL_TEMPLATE__EMAIL_CAMPAIGNS);
		createEOperation(emailTemplateEClass, EMAIL_TEMPLATE___ADD_EMAIL_CAMPAIGN);
		createEOperation(emailTemplateEClass, EMAIL_TEMPLATE___REMOVE_EMAIL_CAMPAIGN);

		emailResponseEClass = createEClass(EMAIL_RESPONSE);
		createEAttribute(emailResponseEClass, EMAIL_RESPONSE__RESPONSE_ID);
		createEAttribute(emailResponseEClass, EMAIL_RESPONSE__TIMESTAMP);
		createEAttribute(emailResponseEClass, EMAIL_RESPONSE__RESPONSE_TYPE);
		createEReference(emailResponseEClass, EMAIL_RESPONSE__SUBSCRIBER);
		createEReference(emailResponseEClass, EMAIL_RESPONSE__CAMPAIGN);
		createEOperation(emailResponseEClass, EMAIL_RESPONSE___GET_RESPONSE_TYPE_DETAIL);

		marketingSystemEClass = createEClass(MARKETING_SYSTEM);
		createEReference(marketingSystemEClass, MARKETING_SYSTEM__CAMPAIGNS);
		createEReference(marketingSystemEClass, MARKETING_SYSTEM__TEMPLATES);
		createEReference(marketingSystemEClass, MARKETING_SYSTEM__SUBSCRIBERS);
		createEReference(marketingSystemEClass, MARKETING_SYSTEM__EMAIL_CAMPAIGNS);
		createEReference(marketingSystemEClass, MARKETING_SYSTEM__EMAIL_RESPONSES);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___CREATE_CAMPAIGN);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___UPDATE_CAMPAIGN);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___DELETE_CAMPAIGN);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___VIEW_CAMPAIGN_DETAILS);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___CREATE_TEMPLATE);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___UPDATE_TEMPLATE);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___DELETE_TEMPLATE);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___VIEW_TEMPLATE_DETAILS);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___SUBSCRIBE);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___UNSUBSCRIBE);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___UPDATE_SUBSCRIPTION);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___VIEW_SUBSCRIBER_DETAILS);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___SEND_EMAIL);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___TRACK_CAMPAIGN);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___PAUSE_CAMPAIGN);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___CANCEL_CAMPAIGN);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___ANALYZE_CAMPAIGN);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___CREATE_SEGMENT);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___VIEW_SEGMENT_DETAILS);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___SEND_EMAIL_TO_SEGMENT);
		createEOperation(marketingSystemEClass, MARKETING_SYSTEM___RECORD_EMAIL_RESPONSE);

		// Create enums
		emailCampaignStatusEEnum = createEEnum(EMAIL_CAMPAIGN_STATUS);
		responseTypeEEnum = createEEnum(RESPONSE_TYPE);
		campaignStatusEEnum = createEEnum(CAMPAIGN_STATUS);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(stateMachine1EClass, StateMachine1.class, "StateMachine1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(campaignEClass, Campaign.class, "Campaign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCampaign_CampaignId(), ecorePackage.getEString(), "campaignId", null, 1, 1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCampaign_Name(), ecorePackage.getEString(), "name", null, 1, 1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCampaign_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCampaign_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCampaign_EmailCampaigns(), this.getEmailCampaign(), null, "emailCampaigns", null, 0, -1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCampaign_Status(), this.getCampaignStatus(), "status", null, 1, 1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCampaign_Analytics(), this.getCampaignAnalytics(), null, "analytics", null, 0, 1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCampaign_Segments(), this.getSegment(), null, "segments", null, 0, -1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getCampaign__AddEmailCampaign(), null, "addEmailCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCampaign__RemoveEmailCampaign(), null, "removeEmailCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCampaign__GetAnalyticsDetails(), null, "getAnalyticsDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCampaign__AddSegment(), null, "addSegment", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCampaign__RemoveSegment(), null, "removeSegment", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCampaign__ViewSegmentDetails(), null, "viewSegmentDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(emailCampaignEClass, EmailCampaign.class, "EmailCampaign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmailCampaign_EmailCampaignId(), ecorePackage.getEString(), "emailCampaignId", null, 1, 1, EmailCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmailCampaign_SendDate(), ecorePackage.getEDate(), "sendDate", null, 1, 1, EmailCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmailCampaign_Status(), this.getEmailCampaignStatus(), "status", null, 1, 1, EmailCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmailCampaign_Analytics(), this.getCampaignAnalytics(), null, "analytics", null, 0, 1, EmailCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmailCampaign_Recipients(), this.getSubscriber(), this.getSubscriber_EmailCampaigns(), "recipients", null, 0, -1, EmailCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmailCampaign_Template(), this.getEmailTemplate(), this.getEmailTemplate_EmailCampaigns(), "template", null, 1, 1, EmailCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmailCampaign_EmailResponses(), this.getEmailResponse(), this.getEmailResponse_Campaign(), "emailResponses", null, 0, -1, EmailCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getEmailCampaign__SendEmail(), null, "sendEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmailCampaign__TrackCampaign(), null, "trackCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmailCampaign__PauseCampaign(), null, "pauseCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmailCampaign__CancelCampaign(), null, "cancelCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(campaignAnalyticsEClass, CampaignAnalytics.class, "CampaignAnalytics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCampaignAnalytics_Clicks(), ecorePackage.getEInt(), "clicks", null, 1, 1, CampaignAnalytics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCampaignAnalytics_Opens(), ecorePackage.getEInt(), "opens", null, 1, 1, CampaignAnalytics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCampaignAnalytics_Conversions(), ecorePackage.getEInt(), "conversions", null, 1, 1, CampaignAnalytics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getCampaignAnalytics__TrackClick(), null, "trackClick", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCampaignAnalytics__TrackOpen(), null, "trackOpen", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCampaignAnalytics__TrackConversion(), null, "trackConversion", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(subscriberEClass, Subscriber.class, "Subscriber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubscriber_SubscriberId(), ecorePackage.getEString(), "subscriberId", null, 1, 1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubscriber_SubscriptionDate(), ecorePackage.getEDate(), "subscriptionDate", null, 1, 1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubscriber_Email(), ecorePackage.getEString(), "email", null, 1, 1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubscriber_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubscriber_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubscriber_Preferences(), this.getPreference(), null, "preferences", null, 0, -1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubscriber_Segments(), this.getSegment(), null, "segments", null, 0, -1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubscriber_EmailCampaigns(), this.getEmailCampaign(), this.getEmailCampaign_Recipients(), "emailCampaigns", null, 0, -1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getSubscriber__AddEmailCampaign(), null, "addEmailCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSubscriber__RemoveEmailCampaign(), null, "removeEmailCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSubscriber__UpdatePreferences(), null, "updatePreferences", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSubscriber__AddSegment(), null, "addSegment", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSubscriber__RemoveSegment(), null, "removeSegment", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSubscriber__ViewSegmentDetails(), null, "viewSegmentDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(preferenceEClass, Preference.class, "Preference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreference_PreferenceId(), ecorePackage.getEString(), "preferenceId", null, 1, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPreference_Name(), ecorePackage.getEString(), "name", null, 1, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPreference_Value(), ecorePackage.getEString(), "value", null, 1, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getPreference__UpdatePreference(), null, "updatePreference", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(segmentEClass, Segment.class, "Segment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSegment_SegmentId(), ecorePackage.getEString(), "segmentId", null, 1, 1, Segment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSegment_Name(), ecorePackage.getEString(), "name", null, 1, 1, Segment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSegment_Conditions(), this.getSegmentCondition(), null, "conditions", null, 0, -1, Segment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getSegment__AddCondition(), null, "addCondition", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSegment__RemoveCondition(), null, "removeCondition", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSegment__ViewConditions(), null, "viewConditions", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(segmentConditionEClass, SegmentCondition.class, "SegmentCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSegmentCondition_Attribute(), ecorePackage.getEString(), "attribute", null, 1, 1, SegmentCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSegmentCondition_Operator(), ecorePackage.getEString(), "operator", null, 1, 1, SegmentCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSegmentCondition_Value(), ecorePackage.getEString(), "value", null, 1, 1, SegmentCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(emailTemplateEClass, EmailTemplate.class, "EmailTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmailTemplate_TemplateId(), ecorePackage.getEString(), "templateId", null, 1, 1, EmailTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmailTemplate_Name(), ecorePackage.getEString(), "name", null, 1, 1, EmailTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmailTemplate_Content(), ecorePackage.getEString(), "content", null, 1, 1, EmailTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmailTemplate_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 1, 1, EmailTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmailTemplate_EmailCampaigns(), this.getEmailCampaign(), this.getEmailCampaign_Template(), "emailCampaigns", null, 0, -1, EmailTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getEmailTemplate__AddEmailCampaign(), null, "addEmailCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmailTemplate__RemoveEmailCampaign(), null, "removeEmailCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(emailResponseEClass, EmailResponse.class, "EmailResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmailResponse_ResponseID(), ecorePackage.getEString(), "responseID", null, 1, 1, EmailResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmailResponse_Timestamp(), ecorePackage.getEDate(), "timestamp", null, 1, 1, EmailResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmailResponse_ResponseType(), this.getResponseType(), "responseType", null, 1, 1, EmailResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmailResponse_Subscriber(), this.getSubscriber(), null, "subscriber", null, 1, 1, EmailResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmailResponse_Campaign(), this.getEmailCampaign(), this.getEmailCampaign_EmailResponses(), "campaign", null, 1, 1, EmailResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getEmailResponse__GetResponseTypeDetail(), null, "getResponseTypeDetail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(marketingSystemEClass, MarketingSystem.class, "MarketingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarketingSystem_Campaigns(), this.getCampaign(), null, "campaigns", null, 0, -1, MarketingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMarketingSystem_Templates(), this.getEmailTemplate(), null, "templates", null, 0, -1, MarketingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMarketingSystem_Subscribers(), this.getSubscriber(), null, "subscribers", null, 0, -1, MarketingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMarketingSystem_EmailCampaigns(), this.getEmailCampaign(), null, "emailCampaigns", null, 0, -1, MarketingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMarketingSystem_EmailResponses(), this.getEmailResponse(), null, "emailResponses", null, 0, -1, MarketingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getMarketingSystem__CreateCampaign(), null, "createCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__UpdateCampaign(), null, "updateCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__DeleteCampaign(), null, "deleteCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__ViewCampaignDetails(), null, "viewCampaignDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__CreateTemplate(), null, "createTemplate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__UpdateTemplate(), null, "updateTemplate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__DeleteTemplate(), null, "deleteTemplate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__ViewTemplateDetails(), null, "viewTemplateDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__Subscribe(), null, "subscribe", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__Unsubscribe(), null, "unsubscribe", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__UpdateSubscription(), null, "updateSubscription", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__ViewSubscriberDetails(), null, "viewSubscriberDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__SendEmail(), null, "sendEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__TrackCampaign(), null, "trackCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__PauseCampaign(), null, "pauseCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__CancelCampaign(), null, "cancelCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__AnalyzeCampaign(), null, "analyzeCampaign", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__CreateSegment(), null, "createSegment", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__ViewSegmentDetails(), null, "viewSegmentDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__SendEmailToSegment(), null, "sendEmailToSegment", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMarketingSystem__RecordEmailResponse(), null, "recordEmailResponse", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(emailCampaignStatusEEnum, EmailCampaignStatus.class, "EmailCampaignStatus");
		addEEnumLiteral(emailCampaignStatusEEnum, EmailCampaignStatus.ACTIVE);
		addEEnumLiteral(emailCampaignStatusEEnum, EmailCampaignStatus.EXPIRED);
		addEEnumLiteral(emailCampaignStatusEEnum, EmailCampaignStatus.STOPPED);
		addEEnumLiteral(emailCampaignStatusEEnum, EmailCampaignStatus.INACTIVE);

		initEEnum(responseTypeEEnum, ResponseType.class, "ResponseType");
		addEEnumLiteral(responseTypeEEnum, ResponseType.OPENED);
		addEEnumLiteral(responseTypeEEnum, ResponseType.CLICKED);
		addEEnumLiteral(responseTypeEEnum, ResponseType.UNSUBSCRIBED);
		addEEnumLiteral(responseTypeEEnum, ResponseType._BOUNCED);

		initEEnum(campaignStatusEEnum, CampaignStatus.class, "CampaignStatus");
		addEEnumLiteral(campaignStatusEEnum, CampaignStatus.ACTIVE);
		addEEnumLiteral(campaignStatusEEnum, CampaignStatus.INACTIVE);
		addEEnumLiteral(campaignStatusEEnum, CampaignStatus.STOPPED);
		addEEnumLiteral(campaignStatusEEnum, CampaignStatus.EXPIRED);

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
