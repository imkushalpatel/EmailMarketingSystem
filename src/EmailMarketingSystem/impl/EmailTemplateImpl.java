/**
 */
package EmailMarketingSystem.impl;

import EmailMarketingSystem.EmailCampaign;
import EmailMarketingSystem.EmailMarketingSystemPackage;
import EmailMarketingSystem.EmailTemplate;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Email Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link EmailMarketingSystem.impl.EmailTemplateImpl#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.EmailTemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.EmailTemplateImpl#getContent <em>Content</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.EmailTemplateImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.EmailTemplateImpl#getEmailCampaigns <em>Email Campaigns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmailTemplateImpl extends MinimalEObjectImpl.Container implements EmailTemplate {
	/**
	 * The default value of the '{@link #getTemplateId() <em>Template Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateId()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateId() <em>Template Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateId()
	 * @generated
	 * @ordered
	 */
	protected String templateId = TEMPLATE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date createdDate = CREATED_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmailCampaigns() <em>Email Campaigns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailCampaigns()
	 * @generated
	 * @ordered
	 */
	protected EList<EmailCampaign> emailCampaigns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmailTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmailMarketingSystemPackage.Literals.EMAIL_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplateId() {
		return templateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateId(String newTemplateId) {
		String oldTemplateId = templateId;
		templateId = newTemplateId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.EMAIL_TEMPLATE__TEMPLATE_ID, oldTemplateId, templateId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.EMAIL_TEMPLATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.EMAIL_TEMPLATE__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		Date oldCreatedDate = createdDate;
		createdDate = newCreatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.EMAIL_TEMPLATE__CREATED_DATE, oldCreatedDate, createdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmailCampaign> getEmailCampaigns() {
		if (emailCampaigns == null) {
			emailCampaigns = new EObjectWithInverseResolvingEList<EmailCampaign>(EmailCampaign.class, this, EmailMarketingSystemPackage.EMAIL_TEMPLATE__EMAIL_CAMPAIGNS, EmailMarketingSystemPackage.EMAIL_CAMPAIGN__TEMPLATE);
		}
		return emailCampaigns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addEmailCampaign() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeEmailCampaign() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__EMAIL_CAMPAIGNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmailCampaigns()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__EMAIL_CAMPAIGNS:
				return ((InternalEList<?>)getEmailCampaigns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__TEMPLATE_ID:
				return getTemplateId();
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__NAME:
				return getName();
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__CONTENT:
				return getContent();
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__CREATED_DATE:
				return getCreatedDate();
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__EMAIL_CAMPAIGNS:
				return getEmailCampaigns();
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
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__TEMPLATE_ID:
				setTemplateId((String)newValue);
				return;
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__NAME:
				setName((String)newValue);
				return;
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__CONTENT:
				setContent((String)newValue);
				return;
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__EMAIL_CAMPAIGNS:
				getEmailCampaigns().clear();
				getEmailCampaigns().addAll((Collection<? extends EmailCampaign>)newValue);
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
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__TEMPLATE_ID:
				setTemplateId(TEMPLATE_ID_EDEFAULT);
				return;
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__EMAIL_CAMPAIGNS:
				getEmailCampaigns().clear();
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
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__TEMPLATE_ID:
				return TEMPLATE_ID_EDEFAULT == null ? templateId != null : !TEMPLATE_ID_EDEFAULT.equals(templateId);
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE__EMAIL_CAMPAIGNS:
				return emailCampaigns != null && !emailCampaigns.isEmpty();
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
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE___ADD_EMAIL_CAMPAIGN:
				addEmailCampaign();
				return null;
			case EmailMarketingSystemPackage.EMAIL_TEMPLATE___REMOVE_EMAIL_CAMPAIGN:
				removeEmailCampaign();
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
		result.append(" (templateId: ");
		result.append(templateId);
		result.append(", name: ");
		result.append(name);
		result.append(", content: ");
		result.append(content);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(')');
		return result.toString();
	}

} //EmailTemplateImpl
