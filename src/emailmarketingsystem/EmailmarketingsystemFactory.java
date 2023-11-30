/**
 */
package emailmarketingsystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see emailmarketingsystem.EmailmarketingsystemPackage
 * @generated
 */
public interface EmailmarketingsystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmailmarketingsystemFactory eINSTANCE = emailmarketingsystem.impl.EmailmarketingsystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Campaign State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Campaign State Machine</em>'.
	 * @generated
	 */
	CampaignStateMachine createCampaignStateMachine();

	/**
	 * Returns a new object of class '<em>Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Campaign</em>'.
	 * @generated
	 */
	Campaign createCampaign();

	/**
	 * Returns a new object of class '<em>Campaign Analytics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Campaign Analytics</em>'.
	 * @generated
	 */
	CampaignAnalytics createCampaignAnalytics();

	/**
	 * Returns a new object of class '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Segment</em>'.
	 * @generated
	 */
	Segment createSegment();

	/**
	 * Returns a new object of class '<em>Segment Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Segment Condition</em>'.
	 * @generated
	 */
	SegmentCondition createSegmentCondition();

	/**
	 * Returns a new object of class '<em>Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscriber</em>'.
	 * @generated
	 */
	Subscriber createSubscriber();

	/**
	 * Returns a new object of class '<em>Preference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preference</em>'.
	 * @generated
	 */
	Preference createPreference();

	/**
	 * Returns a new object of class '<em>Email Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Email Campaign</em>'.
	 * @generated
	 */
	EmailCampaign createEmailCampaign();

	/**
	 * Returns a new object of class '<em>Email Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Email Template</em>'.
	 * @generated
	 */
	EmailTemplate createEmailTemplate();

	/**
	 * Returns a new object of class '<em>Email Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Email Response</em>'.
	 * @generated
	 */
	EmailResponse createEmailResponse();

	/**
	 * Returns a new object of class '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time</em>'.
	 * @generated
	 */
	DateTime createDateTime();

	/**
	 * Returns a new object of class '<em>User Flow State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Flow State Machine</em>'.
	 * @generated
	 */
	UserFlowStateMachine createUserFlowStateMachine();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EmailmarketingsystemPackage getEmailmarketingsystemPackage();

} //EmailmarketingsystemFactory
