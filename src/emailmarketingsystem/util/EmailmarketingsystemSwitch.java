/**
 */
package emailmarketingsystem.util;

import emailmarketingsystem.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see emailmarketingsystem.EmailmarketingsystemPackage
 * @generated
 */
public class EmailmarketingsystemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EmailmarketingsystemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailmarketingsystemSwitch() {
		if (modelPackage == null) {
			modelPackage = EmailmarketingsystemPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EmailmarketingsystemPackage.CAMPAIGN_STATE_MACHINE: {
				CampaignStateMachine campaignStateMachine = (CampaignStateMachine)theEObject;
				T result = caseCampaignStateMachine(campaignStateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmailmarketingsystemPackage.CAMPAIGN: {
				Campaign campaign = (Campaign)theEObject;
				T result = caseCampaign(campaign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS: {
				CampaignAnalytics campaignAnalytics = (CampaignAnalytics)theEObject;
				T result = caseCampaignAnalytics(campaignAnalytics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmailmarketingsystemPackage.SEGMENT: {
				Segment segment = (Segment)theEObject;
				T result = caseSegment(segment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmailmarketingsystemPackage.SEGMENT_CONDITION: {
				SegmentCondition segmentCondition = (SegmentCondition)theEObject;
				T result = caseSegmentCondition(segmentCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmailmarketingsystemPackage.SUBSCRIBER: {
				Subscriber subscriber = (Subscriber)theEObject;
				T result = caseSubscriber(subscriber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmailmarketingsystemPackage.PREFERENCE: {
				Preference preference = (Preference)theEObject;
				T result = casePreference(preference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmailmarketingsystemPackage.EMAIL_CAMPAIGN: {
				EmailCampaign emailCampaign = (EmailCampaign)theEObject;
				T result = caseEmailCampaign(emailCampaign);
				if (result == null) result = caseCampaign(emailCampaign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmailmarketingsystemPackage.EMAIL_TEMPLATE: {
				EmailTemplate emailTemplate = (EmailTemplate)theEObject;
				T result = caseEmailTemplate(emailTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmailmarketingsystemPackage.EMAIL_RESPONSE: {
				EmailResponse emailResponse = (EmailResponse)theEObject;
				T result = caseEmailResponse(emailResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmailmarketingsystemPackage.DATE_TIME: {
				DateTime dateTime = (DateTime)theEObject;
				T result = caseDateTime(dateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmailmarketingsystemPackage.USER_FLOW_STATE_MACHINE: {
				UserFlowStateMachine userFlowStateMachine = (UserFlowStateMachine)theEObject;
				T result = caseUserFlowStateMachine(userFlowStateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Campaign State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Campaign State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCampaignStateMachine(CampaignStateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Campaign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCampaign(Campaign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Campaign Analytics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Campaign Analytics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCampaignAnalytics(CampaignAnalytics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegment(Segment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segment Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segment Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegmentCondition(SegmentCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscriber</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscriber(Subscriber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreference(Preference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email Campaign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmailCampaign(EmailCampaign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmailTemplate(EmailTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmailResponse(EmailResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime(DateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Flow State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Flow State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserFlowStateMachine(UserFlowStateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EmailmarketingsystemSwitch
