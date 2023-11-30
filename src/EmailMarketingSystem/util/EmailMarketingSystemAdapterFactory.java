/**
 */
package EmailMarketingSystem.util;

import EmailMarketingSystem.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see EmailMarketingSystem.EmailMarketingSystemPackage
 * @generated
 */
public class EmailMarketingSystemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EmailMarketingSystemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailMarketingSystemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EmailMarketingSystemPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmailMarketingSystemSwitch<Adapter> modelSwitch =
		new EmailMarketingSystemSwitch<Adapter>() {
			@Override
			public Adapter caseCampaignStateMachine(CampaignStateMachine object) {
				return createCampaignStateMachineAdapter();
			}
			@Override
			public Adapter caseCampaign(Campaign object) {
				return createCampaignAdapter();
			}
			@Override
			public Adapter caseCampaignAnalytics(CampaignAnalytics object) {
				return createCampaignAnalyticsAdapter();
			}
			@Override
			public Adapter caseSegment(Segment object) {
				return createSegmentAdapter();
			}
			@Override
			public Adapter caseSegmentCondition(SegmentCondition object) {
				return createSegmentConditionAdapter();
			}
			@Override
			public Adapter caseSubscriber(Subscriber object) {
				return createSubscriberAdapter();
			}
			@Override
			public Adapter casePreference(Preference object) {
				return createPreferenceAdapter();
			}
			@Override
			public Adapter caseEmailCampaign(EmailCampaign object) {
				return createEmailCampaignAdapter();
			}
			@Override
			public Adapter caseEmailTemplate(EmailTemplate object) {
				return createEmailTemplateAdapter();
			}
			@Override
			public Adapter caseEmailResponse(EmailResponse object) {
				return createEmailResponseAdapter();
			}
			@Override
			public Adapter caseDateTime(DateTime object) {
				return createDateTimeAdapter();
			}
			@Override
			public Adapter caseUserFlowStateMachine(UserFlowStateMachine object) {
				return createUserFlowStateMachineAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link EmailMarketingSystem.CampaignStateMachine <em>Campaign State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EmailMarketingSystem.CampaignStateMachine
	 * @generated
	 */
	public Adapter createCampaignStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EmailMarketingSystem.Campaign <em>Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EmailMarketingSystem.Campaign
	 * @generated
	 */
	public Adapter createCampaignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EmailMarketingSystem.CampaignAnalytics <em>Campaign Analytics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EmailMarketingSystem.CampaignAnalytics
	 * @generated
	 */
	public Adapter createCampaignAnalyticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EmailMarketingSystem.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EmailMarketingSystem.Segment
	 * @generated
	 */
	public Adapter createSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EmailMarketingSystem.SegmentCondition <em>Segment Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EmailMarketingSystem.SegmentCondition
	 * @generated
	 */
	public Adapter createSegmentConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EmailMarketingSystem.Subscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EmailMarketingSystem.Subscriber
	 * @generated
	 */
	public Adapter createSubscriberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EmailMarketingSystem.Preference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EmailMarketingSystem.Preference
	 * @generated
	 */
	public Adapter createPreferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EmailMarketingSystem.EmailCampaign <em>Email Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EmailMarketingSystem.EmailCampaign
	 * @generated
	 */
	public Adapter createEmailCampaignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EmailMarketingSystem.EmailTemplate <em>Email Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EmailMarketingSystem.EmailTemplate
	 * @generated
	 */
	public Adapter createEmailTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EmailMarketingSystem.EmailResponse <em>Email Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EmailMarketingSystem.EmailResponse
	 * @generated
	 */
	public Adapter createEmailResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EmailMarketingSystem.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EmailMarketingSystem.DateTime
	 * @generated
	 */
	public Adapter createDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EmailMarketingSystem.UserFlowStateMachine <em>User Flow State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EmailMarketingSystem.UserFlowStateMachine
	 * @generated
	 */
	public Adapter createUserFlowStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EmailMarketingSystemAdapterFactory
