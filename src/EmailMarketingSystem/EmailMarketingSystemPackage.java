/**
 */
package EmailMarketingSystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see EmailMarketingSystem.EmailMarketingSystemFactory
 * @model kind="package"
 * @generated
 */
public interface EmailMarketingSystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EmailMarketingSystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///EmailMarketingSystem.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EmailMarketingSystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmailMarketingSystemPackage eINSTANCE = EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link EmailMarketingSystem.impl.StateMachine1Impl <em>State Machine1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EmailMarketingSystem.impl.StateMachine1Impl
	 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getStateMachine1()
	 * @generated
	 */
	int STATE_MACHINE1 = 0;

	/**
	 * The number of structural features of the '<em>State Machine1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE1_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>State Machine1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link EmailMarketingSystem.impl.CampaignImpl <em>Campaign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EmailMarketingSystem.impl.CampaignImpl
	 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getCampaign()
	 * @generated
	 */
	int CAMPAIGN = 1;

	/**
	 * The feature id for the '<em><b>Campaign Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN__CAMPAIGN_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN__START_DATE = 2;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN__END_DATE = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN__STATUS = 4;

	/**
	 * The feature id for the '<em><b>Analytics</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN__ANALYTICS = 5;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN__SEGMENTS = 6;

	/**
	 * The number of structural features of the '<em>Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Get Analytics Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN___GET_ANALYTICS_DETAILS = 0;

	/**
	 * The operation id for the '<em>Add Segment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN___ADD_SEGMENT = 1;

	/**
	 * The operation id for the '<em>Remove Segment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN___REMOVE_SEGMENT = 2;

	/**
	 * The operation id for the '<em>View Segment Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN___VIEW_SEGMENT_DETAILS = 3;

	/**
	 * The number of operations of the '<em>Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link EmailMarketingSystem.impl.EmailCampaignImpl <em>Email Campaign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EmailMarketingSystem.impl.EmailCampaignImpl
	 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getEmailCampaign()
	 * @generated
	 */
	int EMAIL_CAMPAIGN = 7;

	/**
	 * The meta object id for the '{@link EmailMarketingSystem.impl.CampaignAnalyticsImpl <em>Campaign Analytics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EmailMarketingSystem.impl.CampaignAnalyticsImpl
	 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getCampaignAnalytics()
	 * @generated
	 */
	int CAMPAIGN_ANALYTICS = 2;

	/**
	 * The feature id for the '<em><b>Clicks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_ANALYTICS__CLICKS = 0;

	/**
	 * The feature id for the '<em><b>Opens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_ANALYTICS__OPENS = 1;

	/**
	 * The feature id for the '<em><b>Conversions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_ANALYTICS__CONVERSIONS = 2;

	/**
	 * The number of structural features of the '<em>Campaign Analytics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_ANALYTICS_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Track Click</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_ANALYTICS___TRACK_CLICK = 0;

	/**
	 * The operation id for the '<em>Track Open</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_ANALYTICS___TRACK_OPEN = 1;

	/**
	 * The operation id for the '<em>Track Conversion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_ANALYTICS___TRACK_CONVERSION = 2;

	/**
	 * The number of operations of the '<em>Campaign Analytics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_ANALYTICS_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link EmailMarketingSystem.impl.SubscriberImpl <em>Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EmailMarketingSystem.impl.SubscriberImpl
	 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getSubscriber()
	 * @generated
	 */
	int SUBSCRIBER = 5;

	/**
	 * The meta object id for the '{@link EmailMarketingSystem.impl.PreferenceImpl <em>Preference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EmailMarketingSystem.impl.PreferenceImpl
	 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getPreference()
	 * @generated
	 */
	int PREFERENCE = 6;

	/**
	 * The meta object id for the '{@link EmailMarketingSystem.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EmailMarketingSystem.impl.SegmentImpl
	 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 3;

	/**
	 * The feature id for the '<em><b>Segment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__SEGMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__CONDITIONS = 2;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Add Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___ADD_CONDITION = 0;

	/**
	 * The operation id for the '<em>Remove Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___REMOVE_CONDITION = 1;

	/**
	 * The operation id for the '<em>View Conditions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___VIEW_CONDITIONS = 2;

	/**
	 * The number of operations of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link EmailMarketingSystem.impl.SegmentConditionImpl <em>Segment Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EmailMarketingSystem.impl.SegmentConditionImpl
	 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getSegmentCondition()
	 * @generated
	 */
	int SEGMENT_CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_CONDITION__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_CONDITION__OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_CONDITION__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Segment Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_CONDITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Segment Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Subscriber Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__SUBSCRIBER_ID = 0;

	/**
	 * The feature id for the '<em><b>Subscription Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__SUBSCRIPTION_DATE = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__LAST_NAME = 3;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__FIRST_NAME = 4;

	/**
	 * The feature id for the '<em><b>Preferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__PREFERENCES = 5;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__SEGMENTS = 6;

	/**
	 * The feature id for the '<em><b>Email Campaigns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__EMAIL_CAMPAIGNS = 7;

	/**
	 * The number of structural features of the '<em>Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Add Email Campaign</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER___ADD_EMAIL_CAMPAIGN = 0;

	/**
	 * The operation id for the '<em>Remove Email Campaign</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER___REMOVE_EMAIL_CAMPAIGN = 1;

	/**
	 * The operation id for the '<em>Update Preferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER___UPDATE_PREFERENCES = 2;

	/**
	 * The operation id for the '<em>Add Segment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER___ADD_SEGMENT = 3;

	/**
	 * The operation id for the '<em>Remove Segment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER___REMOVE_SEGMENT = 4;

	/**
	 * The operation id for the '<em>View Segment Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER___VIEW_SEGMENT_DETAILS = 5;

	/**
	 * The number of operations of the '<em>Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER_OPERATION_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Preference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__PREFERENCE_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Update Preference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE___UPDATE_PREFERENCE = 0;

	/**
	 * The number of operations of the '<em>Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Campaign Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN__CAMPAIGN_ID = CAMPAIGN__CAMPAIGN_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN__NAME = CAMPAIGN__NAME;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN__START_DATE = CAMPAIGN__START_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN__END_DATE = CAMPAIGN__END_DATE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN__STATUS = CAMPAIGN__STATUS;

	/**
	 * The feature id for the '<em><b>Analytics</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN__ANALYTICS = CAMPAIGN__ANALYTICS;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN__SEGMENTS = CAMPAIGN__SEGMENTS;

	/**
	 * The feature id for the '<em><b>Email Campaign Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN__EMAIL_CAMPAIGN_ID = CAMPAIGN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Send Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN__SEND_DATE = CAMPAIGN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN__TEMPLATE = CAMPAIGN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Email Responses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN__EMAIL_RESPONSES = CAMPAIGN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Recipients</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN__RECIPIENTS = CAMPAIGN_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Email Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN_FEATURE_COUNT = CAMPAIGN_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Analytics Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___GET_ANALYTICS_DETAILS = CAMPAIGN___GET_ANALYTICS_DETAILS;

	/**
	 * The operation id for the '<em>Add Segment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___ADD_SEGMENT = CAMPAIGN___ADD_SEGMENT;

	/**
	 * The operation id for the '<em>Remove Segment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___REMOVE_SEGMENT = CAMPAIGN___REMOVE_SEGMENT;

	/**
	 * The operation id for the '<em>View Segment Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___VIEW_SEGMENT_DETAILS = CAMPAIGN___VIEW_SEGMENT_DETAILS;

	/**
	 * The operation id for the '<em>Send Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___SEND_EMAIL = CAMPAIGN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Track Campaign</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___TRACK_CAMPAIGN = CAMPAIGN_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Pause Campaign</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___PAUSE_CAMPAIGN = CAMPAIGN_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Cancel Campaign</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___CANCEL_CAMPAIGN = CAMPAIGN_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Email Campaign</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___ADD_EMAIL_CAMPAIGN = CAMPAIGN_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Remove Email Campaign</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___REMOVE_EMAIL_CAMPAIGN = CAMPAIGN_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Email Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN_OPERATION_COUNT = CAMPAIGN_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link EmailMarketingSystem.impl.EmailTemplateImpl <em>Email Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EmailMarketingSystem.impl.EmailTemplateImpl
	 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getEmailTemplate()
	 * @generated
	 */
	int EMAIL_TEMPLATE = 8;

	/**
	 * The feature id for the '<em><b>Template Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE__TEMPLATE_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE__CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE__CREATED_DATE = 3;

	/**
	 * The feature id for the '<em><b>Email Campaigns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE__EMAIL_CAMPAIGNS = 4;

	/**
	 * The number of structural features of the '<em>Email Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Add Email Campaign</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE___ADD_EMAIL_CAMPAIGN = 0;

	/**
	 * The operation id for the '<em>Remove Email Campaign</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE___REMOVE_EMAIL_CAMPAIGN = 1;

	/**
	 * The number of operations of the '<em>Email Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link EmailMarketingSystem.impl.EmailResponseImpl <em>Email Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EmailMarketingSystem.impl.EmailResponseImpl
	 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getEmailResponse()
	 * @generated
	 */
	int EMAIL_RESPONSE = 9;

	/**
	 * The feature id for the '<em><b>Response ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_RESPONSE__RESPONSE_ID = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_RESPONSE__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Response Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_RESPONSE__RESPONSE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Subscriber</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_RESPONSE__SUBSCRIBER = 3;

	/**
	 * The feature id for the '<em><b>Campaign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_RESPONSE__CAMPAIGN = 4;

	/**
	 * The number of structural features of the '<em>Email Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_RESPONSE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Response Type Detail</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_RESPONSE___GET_RESPONSE_TYPE_DETAIL = 0;

	/**
	 * The number of operations of the '<em>Email Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_RESPONSE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link EmailMarketingSystem.EmailCampaignStatus <em>Email Campaign Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EmailMarketingSystem.EmailCampaignStatus
	 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getEmailCampaignStatus()
	 * @generated
	 */
	int EMAIL_CAMPAIGN_STATUS = 12;

	/**
	 * The meta object id for the '{@link EmailMarketingSystem.ResponseType <em>Response Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EmailMarketingSystem.ResponseType
	 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getResponseType()
	 * @generated
	 */
	int RESPONSE_TYPE = 11;

	/**
	 * The meta object id for the '{@link EmailMarketingSystem.CampaignStatus <em>Campaign Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EmailMarketingSystem.CampaignStatus
	 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getCampaignStatus()
	 * @generated
	 */
	int CAMPAIGN_STATUS = 10;


	/**
	 * Returns the meta object for class '{@link EmailMarketingSystem.StateMachine1 <em>State Machine1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine1</em>'.
	 * @see EmailMarketingSystem.StateMachine1
	 * @generated
	 */
	EClass getStateMachine1();

	/**
	 * Returns the meta object for class '{@link EmailMarketingSystem.Campaign <em>Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campaign</em>'.
	 * @see EmailMarketingSystem.Campaign
	 * @generated
	 */
	EClass getCampaign();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.Campaign#getCampaignId <em>Campaign Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Campaign Id</em>'.
	 * @see EmailMarketingSystem.Campaign#getCampaignId()
	 * @see #getCampaign()
	 * @generated
	 */
	EAttribute getCampaign_CampaignId();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.Campaign#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see EmailMarketingSystem.Campaign#getName()
	 * @see #getCampaign()
	 * @generated
	 */
	EAttribute getCampaign_Name();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.Campaign#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see EmailMarketingSystem.Campaign#getStartDate()
	 * @see #getCampaign()
	 * @generated
	 */
	EAttribute getCampaign_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.Campaign#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see EmailMarketingSystem.Campaign#getEndDate()
	 * @see #getCampaign()
	 * @generated
	 */
	EAttribute getCampaign_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.Campaign#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see EmailMarketingSystem.Campaign#getStatus()
	 * @see #getCampaign()
	 * @generated
	 */
	EAttribute getCampaign_Status();

	/**
	 * Returns the meta object for the reference '{@link EmailMarketingSystem.Campaign#getAnalytics <em>Analytics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analytics</em>'.
	 * @see EmailMarketingSystem.Campaign#getAnalytics()
	 * @see #getCampaign()
	 * @generated
	 */
	EReference getCampaign_Analytics();

	/**
	 * Returns the meta object for the reference list '{@link EmailMarketingSystem.Campaign#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Segments</em>'.
	 * @see EmailMarketingSystem.Campaign#getSegments()
	 * @see #getCampaign()
	 * @generated
	 */
	EReference getCampaign_Segments();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.Campaign#getAnalyticsDetails() <em>Get Analytics Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Analytics Details</em>' operation.
	 * @see EmailMarketingSystem.Campaign#getAnalyticsDetails()
	 * @generated
	 */
	EOperation getCampaign__GetAnalyticsDetails();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.Campaign#addSegment() <em>Add Segment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Segment</em>' operation.
	 * @see EmailMarketingSystem.Campaign#addSegment()
	 * @generated
	 */
	EOperation getCampaign__AddSegment();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.Campaign#removeSegment() <em>Remove Segment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Segment</em>' operation.
	 * @see EmailMarketingSystem.Campaign#removeSegment()
	 * @generated
	 */
	EOperation getCampaign__RemoveSegment();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.Campaign#viewSegmentDetails() <em>View Segment Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Segment Details</em>' operation.
	 * @see EmailMarketingSystem.Campaign#viewSegmentDetails()
	 * @generated
	 */
	EOperation getCampaign__ViewSegmentDetails();

	/**
	 * Returns the meta object for class '{@link EmailMarketingSystem.EmailCampaign <em>Email Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Campaign</em>'.
	 * @see EmailMarketingSystem.EmailCampaign
	 * @generated
	 */
	EClass getEmailCampaign();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.EmailCampaign#getEmailCampaignId <em>Email Campaign Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Campaign Id</em>'.
	 * @see EmailMarketingSystem.EmailCampaign#getEmailCampaignId()
	 * @see #getEmailCampaign()
	 * @generated
	 */
	EAttribute getEmailCampaign_EmailCampaignId();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.EmailCampaign#getSendDate <em>Send Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send Date</em>'.
	 * @see EmailMarketingSystem.EmailCampaign#getSendDate()
	 * @see #getEmailCampaign()
	 * @generated
	 */
	EAttribute getEmailCampaign_SendDate();

	/**
	 * Returns the meta object for the reference list '{@link EmailMarketingSystem.EmailCampaign#getRecipients <em>Recipients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recipients</em>'.
	 * @see EmailMarketingSystem.EmailCampaign#getRecipients()
	 * @see #getEmailCampaign()
	 * @generated
	 */
	EReference getEmailCampaign_Recipients();

	/**
	 * Returns the meta object for the reference '{@link EmailMarketingSystem.EmailCampaign#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see EmailMarketingSystem.EmailCampaign#getTemplate()
	 * @see #getEmailCampaign()
	 * @generated
	 */
	EReference getEmailCampaign_Template();

	/**
	 * Returns the meta object for the reference list '{@link EmailMarketingSystem.EmailCampaign#getEmailResponses <em>Email Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Email Responses</em>'.
	 * @see EmailMarketingSystem.EmailCampaign#getEmailResponses()
	 * @see #getEmailCampaign()
	 * @generated
	 */
	EReference getEmailCampaign_EmailResponses();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.EmailCampaign#sendEmail() <em>Send Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Email</em>' operation.
	 * @see EmailMarketingSystem.EmailCampaign#sendEmail()
	 * @generated
	 */
	EOperation getEmailCampaign__SendEmail();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.EmailCampaign#trackCampaign() <em>Track Campaign</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Track Campaign</em>' operation.
	 * @see EmailMarketingSystem.EmailCampaign#trackCampaign()
	 * @generated
	 */
	EOperation getEmailCampaign__TrackCampaign();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.EmailCampaign#pauseCampaign() <em>Pause Campaign</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pause Campaign</em>' operation.
	 * @see EmailMarketingSystem.EmailCampaign#pauseCampaign()
	 * @generated
	 */
	EOperation getEmailCampaign__PauseCampaign();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.EmailCampaign#cancelCampaign() <em>Cancel Campaign</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Campaign</em>' operation.
	 * @see EmailMarketingSystem.EmailCampaign#cancelCampaign()
	 * @generated
	 */
	EOperation getEmailCampaign__CancelCampaign();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.EmailCampaign#addEmailCampaign() <em>Add Email Campaign</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Email Campaign</em>' operation.
	 * @see EmailMarketingSystem.EmailCampaign#addEmailCampaign()
	 * @generated
	 */
	EOperation getEmailCampaign__AddEmailCampaign();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.EmailCampaign#removeEmailCampaign() <em>Remove Email Campaign</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Email Campaign</em>' operation.
	 * @see EmailMarketingSystem.EmailCampaign#removeEmailCampaign()
	 * @generated
	 */
	EOperation getEmailCampaign__RemoveEmailCampaign();

	/**
	 * Returns the meta object for class '{@link EmailMarketingSystem.CampaignAnalytics <em>Campaign Analytics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campaign Analytics</em>'.
	 * @see EmailMarketingSystem.CampaignAnalytics
	 * @generated
	 */
	EClass getCampaignAnalytics();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.CampaignAnalytics#getClicks <em>Clicks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clicks</em>'.
	 * @see EmailMarketingSystem.CampaignAnalytics#getClicks()
	 * @see #getCampaignAnalytics()
	 * @generated
	 */
	EAttribute getCampaignAnalytics_Clicks();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.CampaignAnalytics#getOpens <em>Opens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opens</em>'.
	 * @see EmailMarketingSystem.CampaignAnalytics#getOpens()
	 * @see #getCampaignAnalytics()
	 * @generated
	 */
	EAttribute getCampaignAnalytics_Opens();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.CampaignAnalytics#getConversions <em>Conversions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversions</em>'.
	 * @see EmailMarketingSystem.CampaignAnalytics#getConversions()
	 * @see #getCampaignAnalytics()
	 * @generated
	 */
	EAttribute getCampaignAnalytics_Conversions();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.CampaignAnalytics#trackClick() <em>Track Click</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Track Click</em>' operation.
	 * @see EmailMarketingSystem.CampaignAnalytics#trackClick()
	 * @generated
	 */
	EOperation getCampaignAnalytics__TrackClick();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.CampaignAnalytics#trackOpen() <em>Track Open</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Track Open</em>' operation.
	 * @see EmailMarketingSystem.CampaignAnalytics#trackOpen()
	 * @generated
	 */
	EOperation getCampaignAnalytics__TrackOpen();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.CampaignAnalytics#trackConversion() <em>Track Conversion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Track Conversion</em>' operation.
	 * @see EmailMarketingSystem.CampaignAnalytics#trackConversion()
	 * @generated
	 */
	EOperation getCampaignAnalytics__TrackConversion();

	/**
	 * Returns the meta object for class '{@link EmailMarketingSystem.Subscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscriber</em>'.
	 * @see EmailMarketingSystem.Subscriber
	 * @generated
	 */
	EClass getSubscriber();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.Subscriber#getSubscriberId <em>Subscriber Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscriber Id</em>'.
	 * @see EmailMarketingSystem.Subscriber#getSubscriberId()
	 * @see #getSubscriber()
	 * @generated
	 */
	EAttribute getSubscriber_SubscriberId();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.Subscriber#getSubscriptionDate <em>Subscription Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription Date</em>'.
	 * @see EmailMarketingSystem.Subscriber#getSubscriptionDate()
	 * @see #getSubscriber()
	 * @generated
	 */
	EAttribute getSubscriber_SubscriptionDate();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.Subscriber#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see EmailMarketingSystem.Subscriber#getEmail()
	 * @see #getSubscriber()
	 * @generated
	 */
	EAttribute getSubscriber_Email();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.Subscriber#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see EmailMarketingSystem.Subscriber#getLastName()
	 * @see #getSubscriber()
	 * @generated
	 */
	EAttribute getSubscriber_LastName();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.Subscriber#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see EmailMarketingSystem.Subscriber#getFirstName()
	 * @see #getSubscriber()
	 * @generated
	 */
	EAttribute getSubscriber_FirstName();

	/**
	 * Returns the meta object for the reference list '{@link EmailMarketingSystem.Subscriber#getPreferences <em>Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Preferences</em>'.
	 * @see EmailMarketingSystem.Subscriber#getPreferences()
	 * @see #getSubscriber()
	 * @generated
	 */
	EReference getSubscriber_Preferences();

	/**
	 * Returns the meta object for the reference list '{@link EmailMarketingSystem.Subscriber#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Segments</em>'.
	 * @see EmailMarketingSystem.Subscriber#getSegments()
	 * @see #getSubscriber()
	 * @generated
	 */
	EReference getSubscriber_Segments();

	/**
	 * Returns the meta object for the reference list '{@link EmailMarketingSystem.Subscriber#getEmailCampaigns <em>Email Campaigns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Email Campaigns</em>'.
	 * @see EmailMarketingSystem.Subscriber#getEmailCampaigns()
	 * @see #getSubscriber()
	 * @generated
	 */
	EReference getSubscriber_EmailCampaigns();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.Subscriber#addEmailCampaign() <em>Add Email Campaign</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Email Campaign</em>' operation.
	 * @see EmailMarketingSystem.Subscriber#addEmailCampaign()
	 * @generated
	 */
	EOperation getSubscriber__AddEmailCampaign();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.Subscriber#removeEmailCampaign() <em>Remove Email Campaign</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Email Campaign</em>' operation.
	 * @see EmailMarketingSystem.Subscriber#removeEmailCampaign()
	 * @generated
	 */
	EOperation getSubscriber__RemoveEmailCampaign();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.Subscriber#updatePreferences() <em>Update Preferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Preferences</em>' operation.
	 * @see EmailMarketingSystem.Subscriber#updatePreferences()
	 * @generated
	 */
	EOperation getSubscriber__UpdatePreferences();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.Subscriber#addSegment() <em>Add Segment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Segment</em>' operation.
	 * @see EmailMarketingSystem.Subscriber#addSegment()
	 * @generated
	 */
	EOperation getSubscriber__AddSegment();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.Subscriber#removeSegment() <em>Remove Segment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Segment</em>' operation.
	 * @see EmailMarketingSystem.Subscriber#removeSegment()
	 * @generated
	 */
	EOperation getSubscriber__RemoveSegment();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.Subscriber#viewSegmentDetails() <em>View Segment Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Segment Details</em>' operation.
	 * @see EmailMarketingSystem.Subscriber#viewSegmentDetails()
	 * @generated
	 */
	EOperation getSubscriber__ViewSegmentDetails();

	/**
	 * Returns the meta object for class '{@link EmailMarketingSystem.Preference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preference</em>'.
	 * @see EmailMarketingSystem.Preference
	 * @generated
	 */
	EClass getPreference();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.Preference#getPreferenceId <em>Preference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preference Id</em>'.
	 * @see EmailMarketingSystem.Preference#getPreferenceId()
	 * @see #getPreference()
	 * @generated
	 */
	EAttribute getPreference_PreferenceId();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.Preference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see EmailMarketingSystem.Preference#getName()
	 * @see #getPreference()
	 * @generated
	 */
	EAttribute getPreference_Name();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.Preference#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see EmailMarketingSystem.Preference#getValue()
	 * @see #getPreference()
	 * @generated
	 */
	EAttribute getPreference_Value();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.Preference#updatePreference() <em>Update Preference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Preference</em>' operation.
	 * @see EmailMarketingSystem.Preference#updatePreference()
	 * @generated
	 */
	EOperation getPreference__UpdatePreference();

	/**
	 * Returns the meta object for class '{@link EmailMarketingSystem.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see EmailMarketingSystem.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.Segment#getSegmentId <em>Segment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Segment Id</em>'.
	 * @see EmailMarketingSystem.Segment#getSegmentId()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_SegmentId();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.Segment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see EmailMarketingSystem.Segment#getName()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_Name();

	/**
	 * Returns the meta object for the reference list '{@link EmailMarketingSystem.Segment#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conditions</em>'.
	 * @see EmailMarketingSystem.Segment#getConditions()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_Conditions();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.Segment#addCondition() <em>Add Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Condition</em>' operation.
	 * @see EmailMarketingSystem.Segment#addCondition()
	 * @generated
	 */
	EOperation getSegment__AddCondition();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.Segment#removeCondition() <em>Remove Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Condition</em>' operation.
	 * @see EmailMarketingSystem.Segment#removeCondition()
	 * @generated
	 */
	EOperation getSegment__RemoveCondition();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.Segment#viewConditions() <em>View Conditions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Conditions</em>' operation.
	 * @see EmailMarketingSystem.Segment#viewConditions()
	 * @generated
	 */
	EOperation getSegment__ViewConditions();

	/**
	 * Returns the meta object for class '{@link EmailMarketingSystem.SegmentCondition <em>Segment Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment Condition</em>'.
	 * @see EmailMarketingSystem.SegmentCondition
	 * @generated
	 */
	EClass getSegmentCondition();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.SegmentCondition#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see EmailMarketingSystem.SegmentCondition#getAttribute()
	 * @see #getSegmentCondition()
	 * @generated
	 */
	EAttribute getSegmentCondition_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.SegmentCondition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see EmailMarketingSystem.SegmentCondition#getOperator()
	 * @see #getSegmentCondition()
	 * @generated
	 */
	EAttribute getSegmentCondition_Operator();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.SegmentCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see EmailMarketingSystem.SegmentCondition#getValue()
	 * @see #getSegmentCondition()
	 * @generated
	 */
	EAttribute getSegmentCondition_Value();

	/**
	 * Returns the meta object for class '{@link EmailMarketingSystem.EmailTemplate <em>Email Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Template</em>'.
	 * @see EmailMarketingSystem.EmailTemplate
	 * @generated
	 */
	EClass getEmailTemplate();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.EmailTemplate#getTemplateId <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Id</em>'.
	 * @see EmailMarketingSystem.EmailTemplate#getTemplateId()
	 * @see #getEmailTemplate()
	 * @generated
	 */
	EAttribute getEmailTemplate_TemplateId();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.EmailTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see EmailMarketingSystem.EmailTemplate#getName()
	 * @see #getEmailTemplate()
	 * @generated
	 */
	EAttribute getEmailTemplate_Name();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.EmailTemplate#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see EmailMarketingSystem.EmailTemplate#getContent()
	 * @see #getEmailTemplate()
	 * @generated
	 */
	EAttribute getEmailTemplate_Content();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.EmailTemplate#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see EmailMarketingSystem.EmailTemplate#getCreatedDate()
	 * @see #getEmailTemplate()
	 * @generated
	 */
	EAttribute getEmailTemplate_CreatedDate();

	/**
	 * Returns the meta object for the reference list '{@link EmailMarketingSystem.EmailTemplate#getEmailCampaigns <em>Email Campaigns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Email Campaigns</em>'.
	 * @see EmailMarketingSystem.EmailTemplate#getEmailCampaigns()
	 * @see #getEmailTemplate()
	 * @generated
	 */
	EReference getEmailTemplate_EmailCampaigns();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.EmailTemplate#addEmailCampaign() <em>Add Email Campaign</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Email Campaign</em>' operation.
	 * @see EmailMarketingSystem.EmailTemplate#addEmailCampaign()
	 * @generated
	 */
	EOperation getEmailTemplate__AddEmailCampaign();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.EmailTemplate#removeEmailCampaign() <em>Remove Email Campaign</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Email Campaign</em>' operation.
	 * @see EmailMarketingSystem.EmailTemplate#removeEmailCampaign()
	 * @generated
	 */
	EOperation getEmailTemplate__RemoveEmailCampaign();

	/**
	 * Returns the meta object for class '{@link EmailMarketingSystem.EmailResponse <em>Email Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Response</em>'.
	 * @see EmailMarketingSystem.EmailResponse
	 * @generated
	 */
	EClass getEmailResponse();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.EmailResponse#getResponseID <em>Response ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response ID</em>'.
	 * @see EmailMarketingSystem.EmailResponse#getResponseID()
	 * @see #getEmailResponse()
	 * @generated
	 */
	EAttribute getEmailResponse_ResponseID();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.EmailResponse#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see EmailMarketingSystem.EmailResponse#getTimestamp()
	 * @see #getEmailResponse()
	 * @generated
	 */
	EAttribute getEmailResponse_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link EmailMarketingSystem.EmailResponse#getResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Type</em>'.
	 * @see EmailMarketingSystem.EmailResponse#getResponseType()
	 * @see #getEmailResponse()
	 * @generated
	 */
	EAttribute getEmailResponse_ResponseType();

	/**
	 * Returns the meta object for the reference '{@link EmailMarketingSystem.EmailResponse#getSubscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscriber</em>'.
	 * @see EmailMarketingSystem.EmailResponse#getSubscriber()
	 * @see #getEmailResponse()
	 * @generated
	 */
	EReference getEmailResponse_Subscriber();

	/**
	 * Returns the meta object for the reference '{@link EmailMarketingSystem.EmailResponse#getCampaign <em>Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Campaign</em>'.
	 * @see EmailMarketingSystem.EmailResponse#getCampaign()
	 * @see #getEmailResponse()
	 * @generated
	 */
	EReference getEmailResponse_Campaign();

	/**
	 * Returns the meta object for the '{@link EmailMarketingSystem.EmailResponse#getResponseTypeDetail() <em>Get Response Type Detail</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Response Type Detail</em>' operation.
	 * @see EmailMarketingSystem.EmailResponse#getResponseTypeDetail()
	 * @generated
	 */
	EOperation getEmailResponse__GetResponseTypeDetail();

	/**
	 * Returns the meta object for enum '{@link EmailMarketingSystem.EmailCampaignStatus <em>Email Campaign Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Email Campaign Status</em>'.
	 * @see EmailMarketingSystem.EmailCampaignStatus
	 * @generated
	 */
	EEnum getEmailCampaignStatus();

	/**
	 * Returns the meta object for enum '{@link EmailMarketingSystem.ResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Response Type</em>'.
	 * @see EmailMarketingSystem.ResponseType
	 * @generated
	 */
	EEnum getResponseType();

	/**
	 * Returns the meta object for enum '{@link EmailMarketingSystem.CampaignStatus <em>Campaign Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Campaign Status</em>'.
	 * @see EmailMarketingSystem.CampaignStatus
	 * @generated
	 */
	EEnum getCampaignStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmailMarketingSystemFactory getEmailMarketingSystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link EmailMarketingSystem.impl.StateMachine1Impl <em>State Machine1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EmailMarketingSystem.impl.StateMachine1Impl
		 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getStateMachine1()
		 * @generated
		 */
		EClass STATE_MACHINE1 = eINSTANCE.getStateMachine1();

		/**
		 * The meta object literal for the '{@link EmailMarketingSystem.impl.CampaignImpl <em>Campaign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EmailMarketingSystem.impl.CampaignImpl
		 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getCampaign()
		 * @generated
		 */
		EClass CAMPAIGN = eINSTANCE.getCampaign();

		/**
		 * The meta object literal for the '<em><b>Campaign Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPAIGN__CAMPAIGN_ID = eINSTANCE.getCampaign_CampaignId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPAIGN__NAME = eINSTANCE.getCampaign_Name();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPAIGN__START_DATE = eINSTANCE.getCampaign_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPAIGN__END_DATE = eINSTANCE.getCampaign_EndDate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPAIGN__STATUS = eINSTANCE.getCampaign_Status();

		/**
		 * The meta object literal for the '<em><b>Analytics</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPAIGN__ANALYTICS = eINSTANCE.getCampaign_Analytics();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPAIGN__SEGMENTS = eINSTANCE.getCampaign_Segments();

		/**
		 * The meta object literal for the '<em><b>Get Analytics Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMPAIGN___GET_ANALYTICS_DETAILS = eINSTANCE.getCampaign__GetAnalyticsDetails();

		/**
		 * The meta object literal for the '<em><b>Add Segment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMPAIGN___ADD_SEGMENT = eINSTANCE.getCampaign__AddSegment();

		/**
		 * The meta object literal for the '<em><b>Remove Segment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMPAIGN___REMOVE_SEGMENT = eINSTANCE.getCampaign__RemoveSegment();

		/**
		 * The meta object literal for the '<em><b>View Segment Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMPAIGN___VIEW_SEGMENT_DETAILS = eINSTANCE.getCampaign__ViewSegmentDetails();

		/**
		 * The meta object literal for the '{@link EmailMarketingSystem.impl.EmailCampaignImpl <em>Email Campaign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EmailMarketingSystem.impl.EmailCampaignImpl
		 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getEmailCampaign()
		 * @generated
		 */
		EClass EMAIL_CAMPAIGN = eINSTANCE.getEmailCampaign();

		/**
		 * The meta object literal for the '<em><b>Email Campaign Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_CAMPAIGN__EMAIL_CAMPAIGN_ID = eINSTANCE.getEmailCampaign_EmailCampaignId();

		/**
		 * The meta object literal for the '<em><b>Send Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_CAMPAIGN__SEND_DATE = eINSTANCE.getEmailCampaign_SendDate();

		/**
		 * The meta object literal for the '<em><b>Recipients</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMAIL_CAMPAIGN__RECIPIENTS = eINSTANCE.getEmailCampaign_Recipients();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMAIL_CAMPAIGN__TEMPLATE = eINSTANCE.getEmailCampaign_Template();

		/**
		 * The meta object literal for the '<em><b>Email Responses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMAIL_CAMPAIGN__EMAIL_RESPONSES = eINSTANCE.getEmailCampaign_EmailResponses();

		/**
		 * The meta object literal for the '<em><b>Send Email</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMAIL_CAMPAIGN___SEND_EMAIL = eINSTANCE.getEmailCampaign__SendEmail();

		/**
		 * The meta object literal for the '<em><b>Track Campaign</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMAIL_CAMPAIGN___TRACK_CAMPAIGN = eINSTANCE.getEmailCampaign__TrackCampaign();

		/**
		 * The meta object literal for the '<em><b>Pause Campaign</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMAIL_CAMPAIGN___PAUSE_CAMPAIGN = eINSTANCE.getEmailCampaign__PauseCampaign();

		/**
		 * The meta object literal for the '<em><b>Cancel Campaign</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMAIL_CAMPAIGN___CANCEL_CAMPAIGN = eINSTANCE.getEmailCampaign__CancelCampaign();

		/**
		 * The meta object literal for the '<em><b>Add Email Campaign</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMAIL_CAMPAIGN___ADD_EMAIL_CAMPAIGN = eINSTANCE.getEmailCampaign__AddEmailCampaign();

		/**
		 * The meta object literal for the '<em><b>Remove Email Campaign</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMAIL_CAMPAIGN___REMOVE_EMAIL_CAMPAIGN = eINSTANCE.getEmailCampaign__RemoveEmailCampaign();

		/**
		 * The meta object literal for the '{@link EmailMarketingSystem.impl.CampaignAnalyticsImpl <em>Campaign Analytics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EmailMarketingSystem.impl.CampaignAnalyticsImpl
		 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getCampaignAnalytics()
		 * @generated
		 */
		EClass CAMPAIGN_ANALYTICS = eINSTANCE.getCampaignAnalytics();

		/**
		 * The meta object literal for the '<em><b>Clicks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPAIGN_ANALYTICS__CLICKS = eINSTANCE.getCampaignAnalytics_Clicks();

		/**
		 * The meta object literal for the '<em><b>Opens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPAIGN_ANALYTICS__OPENS = eINSTANCE.getCampaignAnalytics_Opens();

		/**
		 * The meta object literal for the '<em><b>Conversions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPAIGN_ANALYTICS__CONVERSIONS = eINSTANCE.getCampaignAnalytics_Conversions();

		/**
		 * The meta object literal for the '<em><b>Track Click</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMPAIGN_ANALYTICS___TRACK_CLICK = eINSTANCE.getCampaignAnalytics__TrackClick();

		/**
		 * The meta object literal for the '<em><b>Track Open</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMPAIGN_ANALYTICS___TRACK_OPEN = eINSTANCE.getCampaignAnalytics__TrackOpen();

		/**
		 * The meta object literal for the '<em><b>Track Conversion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMPAIGN_ANALYTICS___TRACK_CONVERSION = eINSTANCE.getCampaignAnalytics__TrackConversion();

		/**
		 * The meta object literal for the '{@link EmailMarketingSystem.impl.SubscriberImpl <em>Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EmailMarketingSystem.impl.SubscriberImpl
		 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getSubscriber()
		 * @generated
		 */
		EClass SUBSCRIBER = eINSTANCE.getSubscriber();

		/**
		 * The meta object literal for the '<em><b>Subscriber Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIBER__SUBSCRIBER_ID = eINSTANCE.getSubscriber_SubscriberId();

		/**
		 * The meta object literal for the '<em><b>Subscription Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIBER__SUBSCRIPTION_DATE = eINSTANCE.getSubscriber_SubscriptionDate();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIBER__EMAIL = eINSTANCE.getSubscriber_Email();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIBER__LAST_NAME = eINSTANCE.getSubscriber_LastName();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIBER__FIRST_NAME = eINSTANCE.getSubscriber_FirstName();

		/**
		 * The meta object literal for the '<em><b>Preferences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBER__PREFERENCES = eINSTANCE.getSubscriber_Preferences();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBER__SEGMENTS = eINSTANCE.getSubscriber_Segments();

		/**
		 * The meta object literal for the '<em><b>Email Campaigns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBER__EMAIL_CAMPAIGNS = eINSTANCE.getSubscriber_EmailCampaigns();

		/**
		 * The meta object literal for the '<em><b>Add Email Campaign</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBER___ADD_EMAIL_CAMPAIGN = eINSTANCE.getSubscriber__AddEmailCampaign();

		/**
		 * The meta object literal for the '<em><b>Remove Email Campaign</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBER___REMOVE_EMAIL_CAMPAIGN = eINSTANCE.getSubscriber__RemoveEmailCampaign();

		/**
		 * The meta object literal for the '<em><b>Update Preferences</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBER___UPDATE_PREFERENCES = eINSTANCE.getSubscriber__UpdatePreferences();

		/**
		 * The meta object literal for the '<em><b>Add Segment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBER___ADD_SEGMENT = eINSTANCE.getSubscriber__AddSegment();

		/**
		 * The meta object literal for the '<em><b>Remove Segment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBER___REMOVE_SEGMENT = eINSTANCE.getSubscriber__RemoveSegment();

		/**
		 * The meta object literal for the '<em><b>View Segment Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBER___VIEW_SEGMENT_DETAILS = eINSTANCE.getSubscriber__ViewSegmentDetails();

		/**
		 * The meta object literal for the '{@link EmailMarketingSystem.impl.PreferenceImpl <em>Preference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EmailMarketingSystem.impl.PreferenceImpl
		 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getPreference()
		 * @generated
		 */
		EClass PREFERENCE = eINSTANCE.getPreference();

		/**
		 * The meta object literal for the '<em><b>Preference Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCE__PREFERENCE_ID = eINSTANCE.getPreference_PreferenceId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCE__NAME = eINSTANCE.getPreference_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCE__VALUE = eINSTANCE.getPreference_Value();

		/**
		 * The meta object literal for the '<em><b>Update Preference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PREFERENCE___UPDATE_PREFERENCE = eINSTANCE.getPreference__UpdatePreference();

		/**
		 * The meta object literal for the '{@link EmailMarketingSystem.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EmailMarketingSystem.impl.SegmentImpl
		 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT__SEGMENT_ID = eINSTANCE.getSegment_SegmentId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT__NAME = eINSTANCE.getSegment_Name();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__CONDITIONS = eINSTANCE.getSegment_Conditions();

		/**
		 * The meta object literal for the '<em><b>Add Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEGMENT___ADD_CONDITION = eINSTANCE.getSegment__AddCondition();

		/**
		 * The meta object literal for the '<em><b>Remove Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEGMENT___REMOVE_CONDITION = eINSTANCE.getSegment__RemoveCondition();

		/**
		 * The meta object literal for the '<em><b>View Conditions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEGMENT___VIEW_CONDITIONS = eINSTANCE.getSegment__ViewConditions();

		/**
		 * The meta object literal for the '{@link EmailMarketingSystem.impl.SegmentConditionImpl <em>Segment Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EmailMarketingSystem.impl.SegmentConditionImpl
		 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getSegmentCondition()
		 * @generated
		 */
		EClass SEGMENT_CONDITION = eINSTANCE.getSegmentCondition();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT_CONDITION__ATTRIBUTE = eINSTANCE.getSegmentCondition_Attribute();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT_CONDITION__OPERATOR = eINSTANCE.getSegmentCondition_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT_CONDITION__VALUE = eINSTANCE.getSegmentCondition_Value();

		/**
		 * The meta object literal for the '{@link EmailMarketingSystem.impl.EmailTemplateImpl <em>Email Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EmailMarketingSystem.impl.EmailTemplateImpl
		 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getEmailTemplate()
		 * @generated
		 */
		EClass EMAIL_TEMPLATE = eINSTANCE.getEmailTemplate();

		/**
		 * The meta object literal for the '<em><b>Template Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_TEMPLATE__TEMPLATE_ID = eINSTANCE.getEmailTemplate_TemplateId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_TEMPLATE__NAME = eINSTANCE.getEmailTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_TEMPLATE__CONTENT = eINSTANCE.getEmailTemplate_Content();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_TEMPLATE__CREATED_DATE = eINSTANCE.getEmailTemplate_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Email Campaigns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMAIL_TEMPLATE__EMAIL_CAMPAIGNS = eINSTANCE.getEmailTemplate_EmailCampaigns();

		/**
		 * The meta object literal for the '<em><b>Add Email Campaign</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMAIL_TEMPLATE___ADD_EMAIL_CAMPAIGN = eINSTANCE.getEmailTemplate__AddEmailCampaign();

		/**
		 * The meta object literal for the '<em><b>Remove Email Campaign</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMAIL_TEMPLATE___REMOVE_EMAIL_CAMPAIGN = eINSTANCE.getEmailTemplate__RemoveEmailCampaign();

		/**
		 * The meta object literal for the '{@link EmailMarketingSystem.impl.EmailResponseImpl <em>Email Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EmailMarketingSystem.impl.EmailResponseImpl
		 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getEmailResponse()
		 * @generated
		 */
		EClass EMAIL_RESPONSE = eINSTANCE.getEmailResponse();

		/**
		 * The meta object literal for the '<em><b>Response ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_RESPONSE__RESPONSE_ID = eINSTANCE.getEmailResponse_ResponseID();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_RESPONSE__TIMESTAMP = eINSTANCE.getEmailResponse_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Response Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_RESPONSE__RESPONSE_TYPE = eINSTANCE.getEmailResponse_ResponseType();

		/**
		 * The meta object literal for the '<em><b>Subscriber</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMAIL_RESPONSE__SUBSCRIBER = eINSTANCE.getEmailResponse_Subscriber();

		/**
		 * The meta object literal for the '<em><b>Campaign</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMAIL_RESPONSE__CAMPAIGN = eINSTANCE.getEmailResponse_Campaign();

		/**
		 * The meta object literal for the '<em><b>Get Response Type Detail</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMAIL_RESPONSE___GET_RESPONSE_TYPE_DETAIL = eINSTANCE.getEmailResponse__GetResponseTypeDetail();

		/**
		 * The meta object literal for the '{@link EmailMarketingSystem.EmailCampaignStatus <em>Email Campaign Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EmailMarketingSystem.EmailCampaignStatus
		 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getEmailCampaignStatus()
		 * @generated
		 */
		EEnum EMAIL_CAMPAIGN_STATUS = eINSTANCE.getEmailCampaignStatus();

		/**
		 * The meta object literal for the '{@link EmailMarketingSystem.ResponseType <em>Response Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EmailMarketingSystem.ResponseType
		 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getResponseType()
		 * @generated
		 */
		EEnum RESPONSE_TYPE = eINSTANCE.getResponseType();

		/**
		 * The meta object literal for the '{@link EmailMarketingSystem.CampaignStatus <em>Campaign Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EmailMarketingSystem.CampaignStatus
		 * @see EmailMarketingSystem.impl.EmailMarketingSystemPackageImpl#getCampaignStatus()
		 * @generated
		 */
		EEnum CAMPAIGN_STATUS = eINSTANCE.getCampaignStatus();

	}

} //EmailMarketingSystemPackage
