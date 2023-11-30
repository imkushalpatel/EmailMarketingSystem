/**
 */
package emailmarketingsystem.impl;

import emailmarketingsystem.Campaign;
import emailmarketingsystem.CampaignAnalytics;
import emailmarketingsystem.CampaignStatus;
import emailmarketingsystem.EmailmarketingsystemPackage;
import emailmarketingsystem.Segment;

import emailmarketingsystem.util.EmailmarketingsystemValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Campaign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emailmarketingsystem.impl.CampaignImpl#getCampaignId <em>Campaign Id</em>}</li>
 *   <li>{@link emailmarketingsystem.impl.CampaignImpl#getName <em>Name</em>}</li>
 *   <li>{@link emailmarketingsystem.impl.CampaignImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link emailmarketingsystem.impl.CampaignImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link emailmarketingsystem.impl.CampaignImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link emailmarketingsystem.impl.CampaignImpl#getAnalytics <em>Analytics</em>}</li>
 *   <li>{@link emailmarketingsystem.impl.CampaignImpl#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CampaignImpl extends MinimalEObjectImpl.Container implements Campaign {
	/**
	 * The default value of the '{@link #getCampaignId() <em>Campaign Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampaignId()
	 * @generated
	 * @ordered
	 */
	protected static final String CAMPAIGN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCampaignId() <em>Campaign Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampaignId()
	 * @generated
	 * @ordered
	 */
	protected String campaignId = CAMPAIGN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CampaignStatus STATUS_EDEFAULT = CampaignStatus.ACTIVE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CampaignStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnalytics() <em>Analytics</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalytics()
	 * @generated
	 * @ordered
	 */
	protected CampaignAnalytics analytics;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<Segment> segments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CampaignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmailmarketingsystemPackage.Literals.CAMPAIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCampaignId() {
		return campaignId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCampaignId(String newCampaignId) {
		String oldCampaignId = campaignId;
		campaignId = newCampaignId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailmarketingsystemPackage.CAMPAIGN__CAMPAIGN_ID, oldCampaignId, campaignId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailmarketingsystemPackage.CAMPAIGN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailmarketingsystemPackage.CAMPAIGN__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailmarketingsystemPackage.CAMPAIGN__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CampaignStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(CampaignStatus newStatus) {
		CampaignStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailmarketingsystemPackage.CAMPAIGN__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CampaignAnalytics getAnalytics() {
		if (analytics != null && analytics.eIsProxy()) {
			InternalEObject oldAnalytics = (InternalEObject)analytics;
			analytics = (CampaignAnalytics)eResolveProxy(oldAnalytics);
			if (analytics != oldAnalytics) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmailmarketingsystemPackage.CAMPAIGN__ANALYTICS, oldAnalytics, analytics));
			}
		}
		return analytics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CampaignAnalytics basicGetAnalytics() {
		return analytics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnalytics(CampaignAnalytics newAnalytics) {
		CampaignAnalytics oldAnalytics = analytics;
		analytics = newAnalytics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailmarketingsystemPackage.CAMPAIGN__ANALYTICS, oldAnalytics, analytics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Segment> getSegments() {
		if (segments == null) {
			segments = new EObjectResolvingEList<Segment>(Segment.class, this, EmailmarketingsystemPackage.CAMPAIGN__SEGMENTS);
		}
		return segments;
	}

	/**
	 * The cached validation expression for the '{@link #Constraint8(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint8</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Constraint8(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT8_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Campaign.allInstances()->forAll(c1, c2 | c1 <> c2 implies c1.name <> c2.name)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Constraint8(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			EmailmarketingsystemValidator.validate
				(EmailmarketingsystemPackage.Literals.CAMPAIGN,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 EmailmarketingsystemPackage.Literals.CAMPAIGN___CONSTRAINT8__DIAGNOSTICCHAIN_MAP,
				 CONSTRAINT8_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 EmailmarketingsystemValidator.DIAGNOSTIC_SOURCE,
				 EmailmarketingsystemValidator.CAMPAIGN__CONSTRAINT8);
	}

	/**
	 * The cached validation expression for the '{@link #Constraint7(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint7</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Constraint7(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT7_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "self.name<>null";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Constraint7(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			EmailmarketingsystemValidator.validate
				(EmailmarketingsystemPackage.Literals.CAMPAIGN,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 EmailmarketingsystemPackage.Literals.CAMPAIGN___CONSTRAINT7__DIAGNOSTICCHAIN_MAP,
				 CONSTRAINT7_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 EmailmarketingsystemValidator.DIAGNOSTIC_SOURCE,
				 EmailmarketingsystemValidator.CAMPAIGN__CONSTRAINT7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CampaignAnalytics getAnalyticsDetails() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment addSegment(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeSegment(String segmentId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment viewSegmentDetails(String segmentId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pauseCampaign() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelCampaign() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmailmarketingsystemPackage.CAMPAIGN__CAMPAIGN_ID:
				return getCampaignId();
			case EmailmarketingsystemPackage.CAMPAIGN__NAME:
				return getName();
			case EmailmarketingsystemPackage.CAMPAIGN__START_DATE:
				return getStartDate();
			case EmailmarketingsystemPackage.CAMPAIGN__END_DATE:
				return getEndDate();
			case EmailmarketingsystemPackage.CAMPAIGN__STATUS:
				return getStatus();
			case EmailmarketingsystemPackage.CAMPAIGN__ANALYTICS:
				if (resolve) return getAnalytics();
				return basicGetAnalytics();
			case EmailmarketingsystemPackage.CAMPAIGN__SEGMENTS:
				return getSegments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmailmarketingsystemPackage.CAMPAIGN__CAMPAIGN_ID:
				setCampaignId((String)newValue);
				return;
			case EmailmarketingsystemPackage.CAMPAIGN__NAME:
				setName((String)newValue);
				return;
			case EmailmarketingsystemPackage.CAMPAIGN__START_DATE:
				setStartDate((Date)newValue);
				return;
			case EmailmarketingsystemPackage.CAMPAIGN__END_DATE:
				setEndDate((Date)newValue);
				return;
			case EmailmarketingsystemPackage.CAMPAIGN__STATUS:
				setStatus((CampaignStatus)newValue);
				return;
			case EmailmarketingsystemPackage.CAMPAIGN__ANALYTICS:
				setAnalytics((CampaignAnalytics)newValue);
				return;
			case EmailmarketingsystemPackage.CAMPAIGN__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends Segment>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmailmarketingsystemPackage.CAMPAIGN__CAMPAIGN_ID:
				setCampaignId(CAMPAIGN_ID_EDEFAULT);
				return;
			case EmailmarketingsystemPackage.CAMPAIGN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EmailmarketingsystemPackage.CAMPAIGN__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case EmailmarketingsystemPackage.CAMPAIGN__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case EmailmarketingsystemPackage.CAMPAIGN__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case EmailmarketingsystemPackage.CAMPAIGN__ANALYTICS:
				setAnalytics((CampaignAnalytics)null);
				return;
			case EmailmarketingsystemPackage.CAMPAIGN__SEGMENTS:
				getSegments().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmailmarketingsystemPackage.CAMPAIGN__CAMPAIGN_ID:
				return CAMPAIGN_ID_EDEFAULT == null ? campaignId != null : !CAMPAIGN_ID_EDEFAULT.equals(campaignId);
			case EmailmarketingsystemPackage.CAMPAIGN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EmailmarketingsystemPackage.CAMPAIGN__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case EmailmarketingsystemPackage.CAMPAIGN__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case EmailmarketingsystemPackage.CAMPAIGN__STATUS:
				return status != STATUS_EDEFAULT;
			case EmailmarketingsystemPackage.CAMPAIGN__ANALYTICS:
				return analytics != null;
			case EmailmarketingsystemPackage.CAMPAIGN__SEGMENTS:
				return segments != null && !segments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EmailmarketingsystemPackage.CAMPAIGN___CONSTRAINT8__DIAGNOSTICCHAIN_MAP:
				return Constraint8((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EmailmarketingsystemPackage.CAMPAIGN___CONSTRAINT7__DIAGNOSTICCHAIN_MAP:
				return Constraint7((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EmailmarketingsystemPackage.CAMPAIGN___GET_ANALYTICS_DETAILS:
				return getAnalyticsDetails();
			case EmailmarketingsystemPackage.CAMPAIGN___ADD_SEGMENT__STRING:
				return addSegment((String)arguments.get(0));
			case EmailmarketingsystemPackage.CAMPAIGN___REMOVE_SEGMENT__STRING:
				removeSegment((String)arguments.get(0));
				return null;
			case EmailmarketingsystemPackage.CAMPAIGN___VIEW_SEGMENT_DETAILS__STRING:
				return viewSegmentDetails((String)arguments.get(0));
			case EmailmarketingsystemPackage.CAMPAIGN___PAUSE_CAMPAIGN:
				pauseCampaign();
				return null;
			case EmailmarketingsystemPackage.CAMPAIGN___CANCEL_CAMPAIGN:
				cancelCampaign();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (campaignId: ");
		result.append(campaignId);
		result.append(", name: ");
		result.append(name);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //CampaignImpl
