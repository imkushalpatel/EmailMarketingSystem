/**
 */
package emailmarketingsystem;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Campaign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emailmarketingsystem.Campaign#getCampaignId <em>Campaign Id</em>}</li>
 *   <li>{@link emailmarketingsystem.Campaign#getName <em>Name</em>}</li>
 *   <li>{@link emailmarketingsystem.Campaign#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link emailmarketingsystem.Campaign#getEndDate <em>End Date</em>}</li>
 *   <li>{@link emailmarketingsystem.Campaign#getStatus <em>Status</em>}</li>
 *   <li>{@link emailmarketingsystem.Campaign#getAnalytics <em>Analytics</em>}</li>
 *   <li>{@link emailmarketingsystem.Campaign#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @see emailmarketingsystem.EmailmarketingsystemPackage#getCampaign()
 * @model
 * @generated
 */
public interface Campaign extends EObject {
	/**
	 * Returns the value of the '<em><b>Campaign Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Campaign Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campaign Id</em>' attribute.
	 * @see #setCampaignId(String)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getCampaign_CampaignId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCampaignId();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.Campaign#getCampaignId <em>Campaign Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Campaign Id</em>' attribute.
	 * @see #getCampaignId()
	 * @generated
	 */
	void setCampaignId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getCampaign_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.Campaign#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getCampaign_StartDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.Campaign#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getCampaign_EndDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.Campaign#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link emailmarketingsystem.CampaignStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see emailmarketingsystem.CampaignStatus
	 * @see #setStatus(CampaignStatus)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getCampaign_Status()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CampaignStatus getStatus();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.Campaign#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see emailmarketingsystem.CampaignStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CampaignStatus value);

	/**
	 * Returns the value of the '<em><b>Analytics</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analytics</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analytics</em>' reference.
	 * @see #setAnalytics(CampaignAnalytics)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getCampaign_Analytics()
	 * @model ordered="false"
	 * @generated
	 */
	CampaignAnalytics getAnalytics();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.Campaign#getAnalytics <em>Analytics</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analytics</em>' reference.
	 * @see #getAnalytics()
	 * @generated
	 */
	void setAnalytics(CampaignAnalytics value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' reference list.
	 * The list contents are of type {@link emailmarketingsystem.Segment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' reference list.
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getCampaign_Segments()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Segment> getSegments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Campaign.allInstances()->forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='Campaign.allInstances()-&gt;forAll(c1, c2 | c1 &lt;&gt; c2 implies c1.name &lt;&gt; c2.name)'"
	 * @generated
	 */
	boolean campaignDuplicateNameCheck(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.name<>null
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.name&lt;&gt;null'"
	 * @generated
	 */
	boolean campaignNameCheck(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.startDate.toString() < self.endDate.toString()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.startDate.toString() &lt; self.endDate.toString()'"
	 * @generated
	 */
	boolean campaignStartEndDateCheck(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	CampaignAnalytics getAnalyticsDetails();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	Segment addSegment(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model segmentIdRequired="true" segmentIdOrdered="false"
	 * @generated
	 */
	void removeSegment(String segmentId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" segmentIdRequired="true" segmentIdOrdered="false"
	 * @generated
	 */
	Segment viewSegmentDetails(String segmentId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void pauseCampaign();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cancelCampaign();

} // Campaign
