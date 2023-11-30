/**
 */
package emailmarketingsystem;

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
 * @see emailmarketingsystem.EmailmarketingsystemFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface EmailmarketingsystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emailmarketingsystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///emailmarketingsystem.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emailmarketingsystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmailmarketingsystemPackage eINSTANCE = emailmarketingsystem.impl.EmailmarketingsystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link emailmarketingsystem.impl.CampaignStateMachineImpl <em>Campaign State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emailmarketingsystem.impl.CampaignStateMachineImpl
	 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getCampaignStateMachine()
	 * @generated
	 */
	int CAMPAIGN_STATE_MACHINE = 0;

	/**
	 * The number of structural features of the '<em>Campaign State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_STATE_MACHINE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Campaign State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_STATE_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emailmarketingsystem.impl.CampaignImpl <em>Campaign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emailmarketingsystem.impl.CampaignImpl
	 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getCampaign()
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
	 * The operation id for the '<em>Constraint8</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN___CONSTRAINT8__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Constraint7</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN___CONSTRAINT7__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Get Analytics Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN___GET_ANALYTICS_DETAILS = 2;

	/**
	 * The operation id for the '<em>Add Segment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN___ADD_SEGMENT__STRING = 3;

	/**
	 * The operation id for the '<em>Remove Segment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN___REMOVE_SEGMENT__STRING = 4;

	/**
	 * The operation id for the '<em>View Segment Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN___VIEW_SEGMENT_DETAILS__STRING = 5;

	/**
	 * The operation id for the '<em>Pause Campaign</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN___PAUSE_CAMPAIGN = 6;

	/**
	 * The operation id for the '<em>Cancel Campaign</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN___CANCEL_CAMPAIGN = 7;

	/**
	 * The number of operations of the '<em>Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link emailmarketingsystem.impl.CampaignAnalyticsImpl <em>Campaign Analytics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emailmarketingsystem.impl.CampaignAnalyticsImpl
	 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getCampaignAnalytics()
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
	 * The meta object id for the '{@link emailmarketingsystem.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emailmarketingsystem.impl.SegmentImpl
	 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getSegment()
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
	 * The operation id for the '<em>Constraint11</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___CONSTRAINT11__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Constraint12</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___CONSTRAINT12__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Add Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___ADD_CONDITION__STRING_STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Remove Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___REMOVE_CONDITION__INT = 3;

	/**
	 * The operation id for the '<em>View Conditions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___VIEW_CONDITIONS = 4;

	/**
	 * The number of operations of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link emailmarketingsystem.impl.SegmentConditionImpl <em>Segment Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emailmarketingsystem.impl.SegmentConditionImpl
	 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getSegmentCondition()
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
	 * The operation id for the '<em>Constraint6</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_CONDITION___CONSTRAINT6__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Constraint14</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_CONDITION___CONSTRAINT14__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Segment Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_CONDITION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link emailmarketingsystem.impl.SubscriberImpl <em>Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emailmarketingsystem.impl.SubscriberImpl
	 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getSubscriber()
	 * @generated
	 */
	int SUBSCRIBER = 5;

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
	 * The operation id for the '<em>Constraint1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER___CONSTRAINT1__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Constraint2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER___CONSTRAINT2__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Constraint3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER___CONSTRAINT3__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Constraint4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER___CONSTRAINT4__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Constraint5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER___CONSTRAINT5__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>Add Email Campaign</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER___ADD_EMAIL_CAMPAIGN__STRING = 5;

	/**
	 * The operation id for the '<em>Remove Email Campaign</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER___REMOVE_EMAIL_CAMPAIGN__STRING = 6;

	/**
	 * The operation id for the '<em>Update Preferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER___UPDATE_PREFERENCES__STRING_PREFERENCE = 7;

	/**
	 * The operation id for the '<em>Add Segment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER___ADD_SEGMENT__STRING = 8;

	/**
	 * The operation id for the '<em>Remove Segment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER___REMOVE_SEGMENT__STRING = 9;

	/**
	 * The operation id for the '<em>View Segment Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER___VIEW_SEGMENT_DETAILS__STRING = 10;

	/**
	 * The number of operations of the '<em>Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER_OPERATION_COUNT = 11;

	/**
	 * The meta object id for the '{@link emailmarketingsystem.impl.PreferenceImpl <em>Preference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emailmarketingsystem.impl.PreferenceImpl
	 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getPreference()
	 * @generated
	 */
	int PREFERENCE = 6;

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
	int PREFERENCE___UPDATE_PREFERENCE__STRING_STRING = 0;

	/**
	 * The number of operations of the '<em>Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link emailmarketingsystem.impl.EmailCampaignImpl <em>Email Campaign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emailmarketingsystem.impl.EmailCampaignImpl
	 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getEmailCampaign()
	 * @generated
	 */
	int EMAIL_CAMPAIGN = 7;

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
	 * The feature id for the '<em><b>Send Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN__SEND_DATE = CAMPAIGN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN__TEMPLATE = CAMPAIGN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Email Responses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN__EMAIL_RESPONSES = CAMPAIGN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Recipients</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN__RECIPIENTS = CAMPAIGN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Email Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN_FEATURE_COUNT = CAMPAIGN_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Constraint8</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___CONSTRAINT8__DIAGNOSTICCHAIN_MAP = CAMPAIGN___CONSTRAINT8__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Constraint7</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___CONSTRAINT7__DIAGNOSTICCHAIN_MAP = CAMPAIGN___CONSTRAINT7__DIAGNOSTICCHAIN_MAP;

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
	int EMAIL_CAMPAIGN___ADD_SEGMENT__STRING = CAMPAIGN___ADD_SEGMENT__STRING;

	/**
	 * The operation id for the '<em>Remove Segment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___REMOVE_SEGMENT__STRING = CAMPAIGN___REMOVE_SEGMENT__STRING;

	/**
	 * The operation id for the '<em>View Segment Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___VIEW_SEGMENT_DETAILS__STRING = CAMPAIGN___VIEW_SEGMENT_DETAILS__STRING;

	/**
	 * The operation id for the '<em>Pause Campaign</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___PAUSE_CAMPAIGN = CAMPAIGN___PAUSE_CAMPAIGN;

	/**
	 * The operation id for the '<em>Cancel Campaign</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___CANCEL_CAMPAIGN = CAMPAIGN___CANCEL_CAMPAIGN;

	/**
	 * The operation id for the '<em>Constraint10</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___CONSTRAINT10__DIAGNOSTICCHAIN_MAP = CAMPAIGN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Send Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___SEND_EMAIL = CAMPAIGN_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Track Campaign</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___TRACK_CAMPAIGN = CAMPAIGN_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Record Email Response</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN___RECORD_EMAIL_RESPONSE__EMAILRESPONSE = CAMPAIGN_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Email Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CAMPAIGN_OPERATION_COUNT = CAMPAIGN_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link emailmarketingsystem.impl.EmailTemplateImpl <em>Email Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emailmarketingsystem.impl.EmailTemplateImpl
	 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getEmailTemplate()
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
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE__SUBJECT = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE__CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE__CREATED_DATE = 4;

	/**
	 * The feature id for the '<em><b>Email Campaigns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE__EMAIL_CAMPAIGNS = 5;

	/**
	 * The number of structural features of the '<em>Email Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Constraint13</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE___CONSTRAINT13__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Add Email Campaign</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE___ADD_EMAIL_CAMPAIGN__STRING = 1;

	/**
	 * The operation id for the '<em>Remove Email Campaign</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE___REMOVE_EMAIL_CAMPAIGN__STRING = 2;

	/**
	 * The number of operations of the '<em>Email Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link emailmarketingsystem.impl.EmailResponseImpl <em>Email Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emailmarketingsystem.impl.EmailResponseImpl
	 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getEmailResponse()
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
	 * The meta object id for the '{@link emailmarketingsystem.impl.DateTimeImpl <em>Date Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emailmarketingsystem.impl.DateTimeImpl
	 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 10;

	/**
	 * The number of structural features of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Now</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME___NOW = 0;

	/**
	 * The number of operations of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link emailmarketingsystem.impl.UserFlowStateMachineImpl <em>User Flow State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emailmarketingsystem.impl.UserFlowStateMachineImpl
	 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getUserFlowStateMachine()
	 * @generated
	 */
	int USER_FLOW_STATE_MACHINE = 11;

	/**
	 * The number of structural features of the '<em>User Flow State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FLOW_STATE_MACHINE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>User Flow State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FLOW_STATE_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emailmarketingsystem.CampaignStatus <em>Campaign Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emailmarketingsystem.CampaignStatus
	 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getCampaignStatus()
	 * @generated
	 */
	int CAMPAIGN_STATUS = 12;

	/**
	 * The meta object id for the '{@link emailmarketingsystem.ResponseType <em>Response Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emailmarketingsystem.ResponseType
	 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getResponseType()
	 * @generated
	 */
	int RESPONSE_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link emailmarketingsystem.CampaignStateMachine <em>Campaign State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campaign State Machine</em>'.
	 * @see emailmarketingsystem.CampaignStateMachine
	 * @generated
	 */
	EClass getCampaignStateMachine();

	/**
	 * Returns the meta object for class '{@link emailmarketingsystem.Campaign <em>Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campaign</em>'.
	 * @see emailmarketingsystem.Campaign
	 * @generated
	 */
	EClass getCampaign();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.Campaign#getCampaignId <em>Campaign Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Campaign Id</em>'.
	 * @see emailmarketingsystem.Campaign#getCampaignId()
	 * @see #getCampaign()
	 * @generated
	 */
	EAttribute getCampaign_CampaignId();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.Campaign#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see emailmarketingsystem.Campaign#getName()
	 * @see #getCampaign()
	 * @generated
	 */
	EAttribute getCampaign_Name();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.Campaign#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see emailmarketingsystem.Campaign#getStartDate()
	 * @see #getCampaign()
	 * @generated
	 */
	EAttribute getCampaign_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.Campaign#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see emailmarketingsystem.Campaign#getEndDate()
	 * @see #getCampaign()
	 * @generated
	 */
	EAttribute getCampaign_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.Campaign#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see emailmarketingsystem.Campaign#getStatus()
	 * @see #getCampaign()
	 * @generated
	 */
	EAttribute getCampaign_Status();

	/**
	 * Returns the meta object for the reference '{@link emailmarketingsystem.Campaign#getAnalytics <em>Analytics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analytics</em>'.
	 * @see emailmarketingsystem.Campaign#getAnalytics()
	 * @see #getCampaign()
	 * @generated
	 */
	EReference getCampaign_Analytics();

	/**
	 * Returns the meta object for the reference list '{@link emailmarketingsystem.Campaign#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Segments</em>'.
	 * @see emailmarketingsystem.Campaign#getSegments()
	 * @see #getCampaign()
	 * @generated
	 */
	EReference getCampaign_Segments();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Campaign#Constraint8(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint8</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint8</em>' operation.
	 * @see emailmarketingsystem.Campaign#Constraint8(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCampaign__Constraint8__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Campaign#Constraint7(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint7</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint7</em>' operation.
	 * @see emailmarketingsystem.Campaign#Constraint7(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCampaign__Constraint7__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Campaign#getAnalyticsDetails() <em>Get Analytics Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Analytics Details</em>' operation.
	 * @see emailmarketingsystem.Campaign#getAnalyticsDetails()
	 * @generated
	 */
	EOperation getCampaign__GetAnalyticsDetails();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Campaign#addSegment(java.lang.String) <em>Add Segment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Segment</em>' operation.
	 * @see emailmarketingsystem.Campaign#addSegment(java.lang.String)
	 * @generated
	 */
	EOperation getCampaign__AddSegment__String();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Campaign#removeSegment(java.lang.String) <em>Remove Segment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Segment</em>' operation.
	 * @see emailmarketingsystem.Campaign#removeSegment(java.lang.String)
	 * @generated
	 */
	EOperation getCampaign__RemoveSegment__String();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Campaign#viewSegmentDetails(java.lang.String) <em>View Segment Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Segment Details</em>' operation.
	 * @see emailmarketingsystem.Campaign#viewSegmentDetails(java.lang.String)
	 * @generated
	 */
	EOperation getCampaign__ViewSegmentDetails__String();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Campaign#pauseCampaign() <em>Pause Campaign</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pause Campaign</em>' operation.
	 * @see emailmarketingsystem.Campaign#pauseCampaign()
	 * @generated
	 */
	EOperation getCampaign__PauseCampaign();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Campaign#cancelCampaign() <em>Cancel Campaign</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Campaign</em>' operation.
	 * @see emailmarketingsystem.Campaign#cancelCampaign()
	 * @generated
	 */
	EOperation getCampaign__CancelCampaign();

	/**
	 * Returns the meta object for class '{@link emailmarketingsystem.CampaignAnalytics <em>Campaign Analytics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campaign Analytics</em>'.
	 * @see emailmarketingsystem.CampaignAnalytics
	 * @generated
	 */
	EClass getCampaignAnalytics();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.CampaignAnalytics#getClicks <em>Clicks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clicks</em>'.
	 * @see emailmarketingsystem.CampaignAnalytics#getClicks()
	 * @see #getCampaignAnalytics()
	 * @generated
	 */
	EAttribute getCampaignAnalytics_Clicks();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.CampaignAnalytics#getOpens <em>Opens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opens</em>'.
	 * @see emailmarketingsystem.CampaignAnalytics#getOpens()
	 * @see #getCampaignAnalytics()
	 * @generated
	 */
	EAttribute getCampaignAnalytics_Opens();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.CampaignAnalytics#getConversions <em>Conversions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversions</em>'.
	 * @see emailmarketingsystem.CampaignAnalytics#getConversions()
	 * @see #getCampaignAnalytics()
	 * @generated
	 */
	EAttribute getCampaignAnalytics_Conversions();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.CampaignAnalytics#trackClick() <em>Track Click</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Track Click</em>' operation.
	 * @see emailmarketingsystem.CampaignAnalytics#trackClick()
	 * @generated
	 */
	EOperation getCampaignAnalytics__TrackClick();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.CampaignAnalytics#trackOpen() <em>Track Open</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Track Open</em>' operation.
	 * @see emailmarketingsystem.CampaignAnalytics#trackOpen()
	 * @generated
	 */
	EOperation getCampaignAnalytics__TrackOpen();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.CampaignAnalytics#trackConversion() <em>Track Conversion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Track Conversion</em>' operation.
	 * @see emailmarketingsystem.CampaignAnalytics#trackConversion()
	 * @generated
	 */
	EOperation getCampaignAnalytics__TrackConversion();

	/**
	 * Returns the meta object for class '{@link emailmarketingsystem.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see emailmarketingsystem.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.Segment#getSegmentId <em>Segment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Segment Id</em>'.
	 * @see emailmarketingsystem.Segment#getSegmentId()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_SegmentId();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.Segment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see emailmarketingsystem.Segment#getName()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_Name();

	/**
	 * Returns the meta object for the reference list '{@link emailmarketingsystem.Segment#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conditions</em>'.
	 * @see emailmarketingsystem.Segment#getConditions()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_Conditions();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Segment#Constraint11(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint11</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint11</em>' operation.
	 * @see emailmarketingsystem.Segment#Constraint11(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSegment__Constraint11__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Segment#Constraint12(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint12</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint12</em>' operation.
	 * @see emailmarketingsystem.Segment#Constraint12(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSegment__Constraint12__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Segment#addCondition(java.lang.String, java.lang.String, java.lang.String) <em>Add Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Condition</em>' operation.
	 * @see emailmarketingsystem.Segment#addCondition(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getSegment__AddCondition__String_String_String();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Segment#removeCondition(int) <em>Remove Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Condition</em>' operation.
	 * @see emailmarketingsystem.Segment#removeCondition(int)
	 * @generated
	 */
	EOperation getSegment__RemoveCondition__int();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Segment#viewConditions() <em>View Conditions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Conditions</em>' operation.
	 * @see emailmarketingsystem.Segment#viewConditions()
	 * @generated
	 */
	EOperation getSegment__ViewConditions();

	/**
	 * Returns the meta object for class '{@link emailmarketingsystem.SegmentCondition <em>Segment Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment Condition</em>'.
	 * @see emailmarketingsystem.SegmentCondition
	 * @generated
	 */
	EClass getSegmentCondition();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.SegmentCondition#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see emailmarketingsystem.SegmentCondition#getAttribute()
	 * @see #getSegmentCondition()
	 * @generated
	 */
	EAttribute getSegmentCondition_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.SegmentCondition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see emailmarketingsystem.SegmentCondition#getOperator()
	 * @see #getSegmentCondition()
	 * @generated
	 */
	EAttribute getSegmentCondition_Operator();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.SegmentCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see emailmarketingsystem.SegmentCondition#getValue()
	 * @see #getSegmentCondition()
	 * @generated
	 */
	EAttribute getSegmentCondition_Value();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.SegmentCondition#Constraint6(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint6</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint6</em>' operation.
	 * @see emailmarketingsystem.SegmentCondition#Constraint6(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSegmentCondition__Constraint6__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.SegmentCondition#Constraint14(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint14</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint14</em>' operation.
	 * @see emailmarketingsystem.SegmentCondition#Constraint14(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSegmentCondition__Constraint14__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link emailmarketingsystem.Subscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscriber</em>'.
	 * @see emailmarketingsystem.Subscriber
	 * @generated
	 */
	EClass getSubscriber();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.Subscriber#getSubscriberId <em>Subscriber Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscriber Id</em>'.
	 * @see emailmarketingsystem.Subscriber#getSubscriberId()
	 * @see #getSubscriber()
	 * @generated
	 */
	EAttribute getSubscriber_SubscriberId();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.Subscriber#getSubscriptionDate <em>Subscription Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription Date</em>'.
	 * @see emailmarketingsystem.Subscriber#getSubscriptionDate()
	 * @see #getSubscriber()
	 * @generated
	 */
	EAttribute getSubscriber_SubscriptionDate();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.Subscriber#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see emailmarketingsystem.Subscriber#getEmail()
	 * @see #getSubscriber()
	 * @generated
	 */
	EAttribute getSubscriber_Email();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.Subscriber#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see emailmarketingsystem.Subscriber#getLastName()
	 * @see #getSubscriber()
	 * @generated
	 */
	EAttribute getSubscriber_LastName();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.Subscriber#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see emailmarketingsystem.Subscriber#getFirstName()
	 * @see #getSubscriber()
	 * @generated
	 */
	EAttribute getSubscriber_FirstName();

	/**
	 * Returns the meta object for the reference list '{@link emailmarketingsystem.Subscriber#getPreferences <em>Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Preferences</em>'.
	 * @see emailmarketingsystem.Subscriber#getPreferences()
	 * @see #getSubscriber()
	 * @generated
	 */
	EReference getSubscriber_Preferences();

	/**
	 * Returns the meta object for the reference list '{@link emailmarketingsystem.Subscriber#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Segments</em>'.
	 * @see emailmarketingsystem.Subscriber#getSegments()
	 * @see #getSubscriber()
	 * @generated
	 */
	EReference getSubscriber_Segments();

	/**
	 * Returns the meta object for the reference list '{@link emailmarketingsystem.Subscriber#getEmailCampaigns <em>Email Campaigns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Email Campaigns</em>'.
	 * @see emailmarketingsystem.Subscriber#getEmailCampaigns()
	 * @see #getSubscriber()
	 * @generated
	 */
	EReference getSubscriber_EmailCampaigns();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Subscriber#Constraint1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint1</em>' operation.
	 * @see emailmarketingsystem.Subscriber#Constraint1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSubscriber__Constraint1__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Subscriber#Constraint2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint2</em>' operation.
	 * @see emailmarketingsystem.Subscriber#Constraint2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSubscriber__Constraint2__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Subscriber#Constraint3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint3</em>' operation.
	 * @see emailmarketingsystem.Subscriber#Constraint3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSubscriber__Constraint3__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Subscriber#Constraint4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint4</em>' operation.
	 * @see emailmarketingsystem.Subscriber#Constraint4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSubscriber__Constraint4__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Subscriber#Constraint5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint5</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint5</em>' operation.
	 * @see emailmarketingsystem.Subscriber#Constraint5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSubscriber__Constraint5__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Subscriber#addEmailCampaign(java.lang.String) <em>Add Email Campaign</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Email Campaign</em>' operation.
	 * @see emailmarketingsystem.Subscriber#addEmailCampaign(java.lang.String)
	 * @generated
	 */
	EOperation getSubscriber__AddEmailCampaign__String();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Subscriber#removeEmailCampaign(java.lang.String) <em>Remove Email Campaign</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Email Campaign</em>' operation.
	 * @see emailmarketingsystem.Subscriber#removeEmailCampaign(java.lang.String)
	 * @generated
	 */
	EOperation getSubscriber__RemoveEmailCampaign__String();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Subscriber#updatePreferences(java.lang.String, emailmarketingsystem.Preference) <em>Update Preferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Preferences</em>' operation.
	 * @see emailmarketingsystem.Subscriber#updatePreferences(java.lang.String, emailmarketingsystem.Preference)
	 * @generated
	 */
	EOperation getSubscriber__UpdatePreferences__String_Preference();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Subscriber#addSegment(java.lang.String) <em>Add Segment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Segment</em>' operation.
	 * @see emailmarketingsystem.Subscriber#addSegment(java.lang.String)
	 * @generated
	 */
	EOperation getSubscriber__AddSegment__String();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Subscriber#removeSegment(java.lang.String) <em>Remove Segment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Segment</em>' operation.
	 * @see emailmarketingsystem.Subscriber#removeSegment(java.lang.String)
	 * @generated
	 */
	EOperation getSubscriber__RemoveSegment__String();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Subscriber#viewSegmentDetails(java.lang.String) <em>View Segment Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Segment Details</em>' operation.
	 * @see emailmarketingsystem.Subscriber#viewSegmentDetails(java.lang.String)
	 * @generated
	 */
	EOperation getSubscriber__ViewSegmentDetails__String();

	/**
	 * Returns the meta object for class '{@link emailmarketingsystem.Preference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preference</em>'.
	 * @see emailmarketingsystem.Preference
	 * @generated
	 */
	EClass getPreference();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.Preference#getPreferenceId <em>Preference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preference Id</em>'.
	 * @see emailmarketingsystem.Preference#getPreferenceId()
	 * @see #getPreference()
	 * @generated
	 */
	EAttribute getPreference_PreferenceId();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.Preference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see emailmarketingsystem.Preference#getName()
	 * @see #getPreference()
	 * @generated
	 */
	EAttribute getPreference_Name();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.Preference#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see emailmarketingsystem.Preference#getValue()
	 * @see #getPreference()
	 * @generated
	 */
	EAttribute getPreference_Value();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.Preference#updatePreference(java.lang.String, java.lang.String) <em>Update Preference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Preference</em>' operation.
	 * @see emailmarketingsystem.Preference#updatePreference(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPreference__UpdatePreference__String_String();

	/**
	 * Returns the meta object for class '{@link emailmarketingsystem.EmailCampaign <em>Email Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Campaign</em>'.
	 * @see emailmarketingsystem.EmailCampaign
	 * @generated
	 */
	EClass getEmailCampaign();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.EmailCampaign#getSendDate <em>Send Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send Date</em>'.
	 * @see emailmarketingsystem.EmailCampaign#getSendDate()
	 * @see #getEmailCampaign()
	 * @generated
	 */
	EAttribute getEmailCampaign_SendDate();

	/**
	 * Returns the meta object for the reference '{@link emailmarketingsystem.EmailCampaign#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see emailmarketingsystem.EmailCampaign#getTemplate()
	 * @see #getEmailCampaign()
	 * @generated
	 */
	EReference getEmailCampaign_Template();

	/**
	 * Returns the meta object for the reference list '{@link emailmarketingsystem.EmailCampaign#getEmailResponses <em>Email Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Email Responses</em>'.
	 * @see emailmarketingsystem.EmailCampaign#getEmailResponses()
	 * @see #getEmailCampaign()
	 * @generated
	 */
	EReference getEmailCampaign_EmailResponses();

	/**
	 * Returns the meta object for the reference list '{@link emailmarketingsystem.EmailCampaign#getRecipients <em>Recipients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recipients</em>'.
	 * @see emailmarketingsystem.EmailCampaign#getRecipients()
	 * @see #getEmailCampaign()
	 * @generated
	 */
	EReference getEmailCampaign_Recipients();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.EmailCampaign#Constraint10(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint10</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint10</em>' operation.
	 * @see emailmarketingsystem.EmailCampaign#Constraint10(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEmailCampaign__Constraint10__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.EmailCampaign#sendEmail() <em>Send Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Email</em>' operation.
	 * @see emailmarketingsystem.EmailCampaign#sendEmail()
	 * @generated
	 */
	EOperation getEmailCampaign__SendEmail();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.EmailCampaign#trackCampaign() <em>Track Campaign</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Track Campaign</em>' operation.
	 * @see emailmarketingsystem.EmailCampaign#trackCampaign()
	 * @generated
	 */
	EOperation getEmailCampaign__TrackCampaign();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.EmailCampaign#recordEmailResponse(emailmarketingsystem.EmailResponse) <em>Record Email Response</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Record Email Response</em>' operation.
	 * @see emailmarketingsystem.EmailCampaign#recordEmailResponse(emailmarketingsystem.EmailResponse)
	 * @generated
	 */
	EOperation getEmailCampaign__RecordEmailResponse__EmailResponse();

	/**
	 * Returns the meta object for class '{@link emailmarketingsystem.EmailTemplate <em>Email Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Template</em>'.
	 * @see emailmarketingsystem.EmailTemplate
	 * @generated
	 */
	EClass getEmailTemplate();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.EmailTemplate#getTemplateId <em>Template Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Id</em>'.
	 * @see emailmarketingsystem.EmailTemplate#getTemplateId()
	 * @see #getEmailTemplate()
	 * @generated
	 */
	EAttribute getEmailTemplate_TemplateId();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.EmailTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see emailmarketingsystem.EmailTemplate#getName()
	 * @see #getEmailTemplate()
	 * @generated
	 */
	EAttribute getEmailTemplate_Name();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.EmailTemplate#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see emailmarketingsystem.EmailTemplate#getSubject()
	 * @see #getEmailTemplate()
	 * @generated
	 */
	EAttribute getEmailTemplate_Subject();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.EmailTemplate#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see emailmarketingsystem.EmailTemplate#getContent()
	 * @see #getEmailTemplate()
	 * @generated
	 */
	EAttribute getEmailTemplate_Content();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.EmailTemplate#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see emailmarketingsystem.EmailTemplate#getCreatedDate()
	 * @see #getEmailTemplate()
	 * @generated
	 */
	EAttribute getEmailTemplate_CreatedDate();

	/**
	 * Returns the meta object for the reference list '{@link emailmarketingsystem.EmailTemplate#getEmailCampaigns <em>Email Campaigns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Email Campaigns</em>'.
	 * @see emailmarketingsystem.EmailTemplate#getEmailCampaigns()
	 * @see #getEmailTemplate()
	 * @generated
	 */
	EReference getEmailTemplate_EmailCampaigns();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.EmailTemplate#Constraint13(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint13</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint13</em>' operation.
	 * @see emailmarketingsystem.EmailTemplate#Constraint13(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEmailTemplate__Constraint13__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.EmailTemplate#addEmailCampaign(java.lang.String) <em>Add Email Campaign</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Email Campaign</em>' operation.
	 * @see emailmarketingsystem.EmailTemplate#addEmailCampaign(java.lang.String)
	 * @generated
	 */
	EOperation getEmailTemplate__AddEmailCampaign__String();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.EmailTemplate#removeEmailCampaign(java.lang.String) <em>Remove Email Campaign</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Email Campaign</em>' operation.
	 * @see emailmarketingsystem.EmailTemplate#removeEmailCampaign(java.lang.String)
	 * @generated
	 */
	EOperation getEmailTemplate__RemoveEmailCampaign__String();

	/**
	 * Returns the meta object for class '{@link emailmarketingsystem.EmailResponse <em>Email Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Response</em>'.
	 * @see emailmarketingsystem.EmailResponse
	 * @generated
	 */
	EClass getEmailResponse();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.EmailResponse#getResponseID <em>Response ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response ID</em>'.
	 * @see emailmarketingsystem.EmailResponse#getResponseID()
	 * @see #getEmailResponse()
	 * @generated
	 */
	EAttribute getEmailResponse_ResponseID();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.EmailResponse#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see emailmarketingsystem.EmailResponse#getTimestamp()
	 * @see #getEmailResponse()
	 * @generated
	 */
	EAttribute getEmailResponse_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link emailmarketingsystem.EmailResponse#getResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Type</em>'.
	 * @see emailmarketingsystem.EmailResponse#getResponseType()
	 * @see #getEmailResponse()
	 * @generated
	 */
	EAttribute getEmailResponse_ResponseType();

	/**
	 * Returns the meta object for the reference '{@link emailmarketingsystem.EmailResponse#getSubscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscriber</em>'.
	 * @see emailmarketingsystem.EmailResponse#getSubscriber()
	 * @see #getEmailResponse()
	 * @generated
	 */
	EReference getEmailResponse_Subscriber();

	/**
	 * Returns the meta object for the reference '{@link emailmarketingsystem.EmailResponse#getCampaign <em>Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Campaign</em>'.
	 * @see emailmarketingsystem.EmailResponse#getCampaign()
	 * @see #getEmailResponse()
	 * @generated
	 */
	EReference getEmailResponse_Campaign();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.EmailResponse#getResponseTypeDetail() <em>Get Response Type Detail</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Response Type Detail</em>' operation.
	 * @see emailmarketingsystem.EmailResponse#getResponseTypeDetail()
	 * @generated
	 */
	EOperation getEmailResponse__GetResponseTypeDetail();

	/**
	 * Returns the meta object for class '{@link emailmarketingsystem.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time</em>'.
	 * @see emailmarketingsystem.DateTime
	 * @generated
	 */
	EClass getDateTime();

	/**
	 * Returns the meta object for the '{@link emailmarketingsystem.DateTime#now() <em>Now</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Now</em>' operation.
	 * @see emailmarketingsystem.DateTime#now()
	 * @generated
	 */
	EOperation getDateTime__Now();

	/**
	 * Returns the meta object for class '{@link emailmarketingsystem.UserFlowStateMachine <em>User Flow State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Flow State Machine</em>'.
	 * @see emailmarketingsystem.UserFlowStateMachine
	 * @generated
	 */
	EClass getUserFlowStateMachine();

	/**
	 * Returns the meta object for enum '{@link emailmarketingsystem.CampaignStatus <em>Campaign Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Campaign Status</em>'.
	 * @see emailmarketingsystem.CampaignStatus
	 * @generated
	 */
	EEnum getCampaignStatus();

	/**
	 * Returns the meta object for enum '{@link emailmarketingsystem.ResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Response Type</em>'.
	 * @see emailmarketingsystem.ResponseType
	 * @generated
	 */
	EEnum getResponseType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmailmarketingsystemFactory getEmailmarketingsystemFactory();

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
		 * The meta object literal for the '{@link emailmarketingsystem.impl.CampaignStateMachineImpl <em>Campaign State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emailmarketingsystem.impl.CampaignStateMachineImpl
		 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getCampaignStateMachine()
		 * @generated
		 */
		EClass CAMPAIGN_STATE_MACHINE = eINSTANCE.getCampaignStateMachine();

		/**
		 * The meta object literal for the '{@link emailmarketingsystem.impl.CampaignImpl <em>Campaign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emailmarketingsystem.impl.CampaignImpl
		 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getCampaign()
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
		 * The meta object literal for the '<em><b>Constraint8</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMPAIGN___CONSTRAINT8__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCampaign__Constraint8__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Constraint7</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMPAIGN___CONSTRAINT7__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCampaign__Constraint7__DiagnosticChain_Map();

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
		EOperation CAMPAIGN___ADD_SEGMENT__STRING = eINSTANCE.getCampaign__AddSegment__String();

		/**
		 * The meta object literal for the '<em><b>Remove Segment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMPAIGN___REMOVE_SEGMENT__STRING = eINSTANCE.getCampaign__RemoveSegment__String();

		/**
		 * The meta object literal for the '<em><b>View Segment Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMPAIGN___VIEW_SEGMENT_DETAILS__STRING = eINSTANCE.getCampaign__ViewSegmentDetails__String();

		/**
		 * The meta object literal for the '<em><b>Pause Campaign</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMPAIGN___PAUSE_CAMPAIGN = eINSTANCE.getCampaign__PauseCampaign();

		/**
		 * The meta object literal for the '<em><b>Cancel Campaign</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMPAIGN___CANCEL_CAMPAIGN = eINSTANCE.getCampaign__CancelCampaign();

		/**
		 * The meta object literal for the '{@link emailmarketingsystem.impl.CampaignAnalyticsImpl <em>Campaign Analytics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emailmarketingsystem.impl.CampaignAnalyticsImpl
		 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getCampaignAnalytics()
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
		 * The meta object literal for the '{@link emailmarketingsystem.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emailmarketingsystem.impl.SegmentImpl
		 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getSegment()
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
		 * The meta object literal for the '<em><b>Constraint11</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEGMENT___CONSTRAINT11__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSegment__Constraint11__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Constraint12</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEGMENT___CONSTRAINT12__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSegment__Constraint12__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Add Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEGMENT___ADD_CONDITION__STRING_STRING_STRING = eINSTANCE.getSegment__AddCondition__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEGMENT___REMOVE_CONDITION__INT = eINSTANCE.getSegment__RemoveCondition__int();

		/**
		 * The meta object literal for the '<em><b>View Conditions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEGMENT___VIEW_CONDITIONS = eINSTANCE.getSegment__ViewConditions();

		/**
		 * The meta object literal for the '{@link emailmarketingsystem.impl.SegmentConditionImpl <em>Segment Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emailmarketingsystem.impl.SegmentConditionImpl
		 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getSegmentCondition()
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
		 * The meta object literal for the '<em><b>Constraint6</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEGMENT_CONDITION___CONSTRAINT6__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSegmentCondition__Constraint6__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Constraint14</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEGMENT_CONDITION___CONSTRAINT14__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSegmentCondition__Constraint14__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link emailmarketingsystem.impl.SubscriberImpl <em>Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emailmarketingsystem.impl.SubscriberImpl
		 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getSubscriber()
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
		 * The meta object literal for the '<em><b>Constraint1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBER___CONSTRAINT1__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSubscriber__Constraint1__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Constraint2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBER___CONSTRAINT2__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSubscriber__Constraint2__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Constraint3</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBER___CONSTRAINT3__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSubscriber__Constraint3__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Constraint4</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBER___CONSTRAINT4__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSubscriber__Constraint4__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Constraint5</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBER___CONSTRAINT5__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSubscriber__Constraint5__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Add Email Campaign</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBER___ADD_EMAIL_CAMPAIGN__STRING = eINSTANCE.getSubscriber__AddEmailCampaign__String();

		/**
		 * The meta object literal for the '<em><b>Remove Email Campaign</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBER___REMOVE_EMAIL_CAMPAIGN__STRING = eINSTANCE.getSubscriber__RemoveEmailCampaign__String();

		/**
		 * The meta object literal for the '<em><b>Update Preferences</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBER___UPDATE_PREFERENCES__STRING_PREFERENCE = eINSTANCE.getSubscriber__UpdatePreferences__String_Preference();

		/**
		 * The meta object literal for the '<em><b>Add Segment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBER___ADD_SEGMENT__STRING = eINSTANCE.getSubscriber__AddSegment__String();

		/**
		 * The meta object literal for the '<em><b>Remove Segment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBER___REMOVE_SEGMENT__STRING = eINSTANCE.getSubscriber__RemoveSegment__String();

		/**
		 * The meta object literal for the '<em><b>View Segment Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBER___VIEW_SEGMENT_DETAILS__STRING = eINSTANCE.getSubscriber__ViewSegmentDetails__String();

		/**
		 * The meta object literal for the '{@link emailmarketingsystem.impl.PreferenceImpl <em>Preference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emailmarketingsystem.impl.PreferenceImpl
		 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getPreference()
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
		EOperation PREFERENCE___UPDATE_PREFERENCE__STRING_STRING = eINSTANCE.getPreference__UpdatePreference__String_String();

		/**
		 * The meta object literal for the '{@link emailmarketingsystem.impl.EmailCampaignImpl <em>Email Campaign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emailmarketingsystem.impl.EmailCampaignImpl
		 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getEmailCampaign()
		 * @generated
		 */
		EClass EMAIL_CAMPAIGN = eINSTANCE.getEmailCampaign();

		/**
		 * The meta object literal for the '<em><b>Send Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_CAMPAIGN__SEND_DATE = eINSTANCE.getEmailCampaign_SendDate();

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
		 * The meta object literal for the '<em><b>Recipients</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMAIL_CAMPAIGN__RECIPIENTS = eINSTANCE.getEmailCampaign_Recipients();

		/**
		 * The meta object literal for the '<em><b>Constraint10</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMAIL_CAMPAIGN___CONSTRAINT10__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEmailCampaign__Constraint10__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Record Email Response</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMAIL_CAMPAIGN___RECORD_EMAIL_RESPONSE__EMAILRESPONSE = eINSTANCE.getEmailCampaign__RecordEmailResponse__EmailResponse();

		/**
		 * The meta object literal for the '{@link emailmarketingsystem.impl.EmailTemplateImpl <em>Email Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emailmarketingsystem.impl.EmailTemplateImpl
		 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getEmailTemplate()
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
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_TEMPLATE__SUBJECT = eINSTANCE.getEmailTemplate_Subject();

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
		 * The meta object literal for the '<em><b>Constraint13</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMAIL_TEMPLATE___CONSTRAINT13__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEmailTemplate__Constraint13__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Add Email Campaign</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMAIL_TEMPLATE___ADD_EMAIL_CAMPAIGN__STRING = eINSTANCE.getEmailTemplate__AddEmailCampaign__String();

		/**
		 * The meta object literal for the '<em><b>Remove Email Campaign</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMAIL_TEMPLATE___REMOVE_EMAIL_CAMPAIGN__STRING = eINSTANCE.getEmailTemplate__RemoveEmailCampaign__String();

		/**
		 * The meta object literal for the '{@link emailmarketingsystem.impl.EmailResponseImpl <em>Email Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emailmarketingsystem.impl.EmailResponseImpl
		 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getEmailResponse()
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
		 * The meta object literal for the '{@link emailmarketingsystem.impl.DateTimeImpl <em>Date Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emailmarketingsystem.impl.DateTimeImpl
		 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getDateTime()
		 * @generated
		 */
		EClass DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '<em><b>Now</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATE_TIME___NOW = eINSTANCE.getDateTime__Now();

		/**
		 * The meta object literal for the '{@link emailmarketingsystem.impl.UserFlowStateMachineImpl <em>User Flow State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emailmarketingsystem.impl.UserFlowStateMachineImpl
		 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getUserFlowStateMachine()
		 * @generated
		 */
		EClass USER_FLOW_STATE_MACHINE = eINSTANCE.getUserFlowStateMachine();

		/**
		 * The meta object literal for the '{@link emailmarketingsystem.CampaignStatus <em>Campaign Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emailmarketingsystem.CampaignStatus
		 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getCampaignStatus()
		 * @generated
		 */
		EEnum CAMPAIGN_STATUS = eINSTANCE.getCampaignStatus();

		/**
		 * The meta object literal for the '{@link emailmarketingsystem.ResponseType <em>Response Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emailmarketingsystem.ResponseType
		 * @see emailmarketingsystem.impl.EmailmarketingsystemPackageImpl#getResponseType()
		 * @generated
		 */
		EEnum RESPONSE_TYPE = eINSTANCE.getResponseType();

	}

} //EmailmarketingsystemPackage
