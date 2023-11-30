/**
 */
package emailmarketingsystem.impl;

import emailmarketingsystem.CampaignAnalytics;
import emailmarketingsystem.EmailmarketingsystemPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Campaign Analytics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emailmarketingsystem.impl.CampaignAnalyticsImpl#getClicks <em>Clicks</em>}</li>
 *   <li>{@link emailmarketingsystem.impl.CampaignAnalyticsImpl#getOpens <em>Opens</em>}</li>
 *   <li>{@link emailmarketingsystem.impl.CampaignAnalyticsImpl#getConversions <em>Conversions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CampaignAnalyticsImpl extends MinimalEObjectImpl.Container implements CampaignAnalytics {
	/**
	 * The default value of the '{@link #getClicks() <em>Clicks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClicks()
	 * @generated
	 * @ordered
	 */
	protected static final int CLICKS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getClicks() <em>Clicks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClicks()
	 * @generated
	 * @ordered
	 */
	protected int clicks = CLICKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpens() <em>Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpens()
	 * @generated
	 * @ordered
	 */
	protected static final int OPENS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOpens() <em>Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpens()
	 * @generated
	 * @ordered
	 */
	protected int opens = OPENS_EDEFAULT;

	/**
	 * The default value of the '{@link #getConversions() <em>Conversions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversions()
	 * @generated
	 * @ordered
	 */
	protected static final int CONVERSIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConversions() <em>Conversions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversions()
	 * @generated
	 * @ordered
	 */
	protected int conversions = CONVERSIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CampaignAnalyticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmailmarketingsystemPackage.Literals.CAMPAIGN_ANALYTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getClicks() {
		return clicks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClicks(int newClicks) {
		int oldClicks = clicks;
		clicks = newClicks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS__CLICKS, oldClicks, clicks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOpens() {
		return opens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpens(int newOpens) {
		int oldOpens = opens;
		opens = newOpens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS__OPENS, oldOpens, opens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getConversions() {
		return conversions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConversions(int newConversions) {
		int oldConversions = conversions;
		conversions = newConversions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS__CONVERSIONS, oldConversions, conversions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void trackClick() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void trackOpen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void trackConversion() {
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
			case EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS__CLICKS:
				return getClicks();
			case EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS__OPENS:
				return getOpens();
			case EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS__CONVERSIONS:
				return getConversions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS__CLICKS:
				setClicks((Integer)newValue);
				return;
			case EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS__OPENS:
				setOpens((Integer)newValue);
				return;
			case EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS__CONVERSIONS:
				setConversions((Integer)newValue);
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
			case EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS__CLICKS:
				setClicks(CLICKS_EDEFAULT);
				return;
			case EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS__OPENS:
				setOpens(OPENS_EDEFAULT);
				return;
			case EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS__CONVERSIONS:
				setConversions(CONVERSIONS_EDEFAULT);
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
			case EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS__CLICKS:
				return clicks != CLICKS_EDEFAULT;
			case EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS__OPENS:
				return opens != OPENS_EDEFAULT;
			case EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS__CONVERSIONS:
				return conversions != CONVERSIONS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS___TRACK_CLICK:
				trackClick();
				return null;
			case EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS___TRACK_OPEN:
				trackOpen();
				return null;
			case EmailmarketingsystemPackage.CAMPAIGN_ANALYTICS___TRACK_CONVERSION:
				trackConversion();
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
		result.append(" (clicks: ");
		result.append(clicks);
		result.append(", opens: ");
		result.append(opens);
		result.append(", conversions: ");
		result.append(conversions);
		result.append(')');
		return result.toString();
	}

} //CampaignAnalyticsImpl
