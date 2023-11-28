/**
 */
package EmailMarketingSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Campaign Analytics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EmailMarketingSystem.CampaignAnalytics#getClicks <em>Clicks</em>}</li>
 *   <li>{@link EmailMarketingSystem.CampaignAnalytics#getOpens <em>Opens</em>}</li>
 *   <li>{@link EmailMarketingSystem.CampaignAnalytics#getConversions <em>Conversions</em>}</li>
 * </ul>
 *
 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getCampaignAnalytics()
 * @model
 * @generated
 */
public interface CampaignAnalytics extends EObject {
	/**
	 * Returns the value of the '<em><b>Clicks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clicks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clicks</em>' attribute.
	 * @see #setClicks(int)
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getCampaignAnalytics_Clicks()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getClicks();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.CampaignAnalytics#getClicks <em>Clicks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clicks</em>' attribute.
	 * @see #getClicks()
	 * @generated
	 */
	void setClicks(int value);

	/**
	 * Returns the value of the '<em><b>Opens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opens</em>' attribute.
	 * @see #setOpens(int)
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getCampaignAnalytics_Opens()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getOpens();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.CampaignAnalytics#getOpens <em>Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opens</em>' attribute.
	 * @see #getOpens()
	 * @generated
	 */
	void setOpens(int value);

	/**
	 * Returns the value of the '<em><b>Conversions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversions</em>' attribute.
	 * @see #setConversions(int)
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getCampaignAnalytics_Conversions()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getConversions();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.CampaignAnalytics#getConversions <em>Conversions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversions</em>' attribute.
	 * @see #getConversions()
	 * @generated
	 */
	void setConversions(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void trackClick();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void trackOpen();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void trackConversion();

} // CampaignAnalytics
