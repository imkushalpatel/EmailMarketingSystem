/**
 */
package emailmarketingsystem.impl;

import emailmarketingsystem.EmailmarketingsystemPackage;
import emailmarketingsystem.Segment;
import emailmarketingsystem.SegmentCondition;

import emailmarketingsystem.util.EmailmarketingsystemValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emailmarketingsystem.impl.SegmentImpl#getSegmentId <em>Segment Id</em>}</li>
 *   <li>{@link emailmarketingsystem.impl.SegmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link emailmarketingsystem.impl.SegmentImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SegmentImpl extends MinimalEObjectImpl.Container implements Segment {
	/**
	 * The default value of the '{@link #getSegmentId() <em>Segment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentId()
	 * @generated
	 * @ordered
	 */
	protected static final String SEGMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSegmentId() <em>Segment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentId()
	 * @generated
	 * @ordered
	 */
	protected String segmentId = SEGMENT_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<SegmentCondition> conditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmailmarketingsystemPackage.Literals.SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSegmentId() {
		return segmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSegmentId(String newSegmentId) {
		String oldSegmentId = segmentId;
		segmentId = newSegmentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailmarketingsystemPackage.SEGMENT__SEGMENT_ID, oldSegmentId, segmentId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailmarketingsystemPackage.SEGMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SegmentCondition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectResolvingEList<SegmentCondition>(SegmentCondition.class, this, EmailmarketingsystemPackage.SEGMENT__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * The cached validation expression for the '{@link #segmentDuplicateNameCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Segment Duplicate Name Check</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #segmentDuplicateNameCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SEGMENT_DUPLICATE_NAME_CHECK_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Segment.allInstances()->forAll(s1, s2 | s1 <> s2 implies s1.name <> s2.name)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean segmentDuplicateNameCheck(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			EmailmarketingsystemValidator.validate
				(EmailmarketingsystemPackage.Literals.SEGMENT,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 EmailmarketingsystemPackage.Literals.SEGMENT___SEGMENT_DUPLICATE_NAME_CHECK__DIAGNOSTICCHAIN_MAP,
				 SEGMENT_DUPLICATE_NAME_CHECK_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 EmailmarketingsystemValidator.DIAGNOSTIC_SOURCE,
				 EmailmarketingsystemValidator.SEGMENT__SEGMENT_DUPLICATE_NAME_CHECK);
	}

	/**
	 * The cached validation expression for the '{@link #segmentSubsribersSizeCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Segment Subsribers Size Check</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #segmentSubsribersSizeCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SEGMENT_SUBSRIBERS_SIZE_CHECK_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = " self.subscribers->size() > 0";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean segmentSubsribersSizeCheck(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			EmailmarketingsystemValidator.validate
				(EmailmarketingsystemPackage.Literals.SEGMENT,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 EmailmarketingsystemPackage.Literals.SEGMENT___SEGMENT_SUBSRIBERS_SIZE_CHECK__DIAGNOSTICCHAIN_MAP,
				 SEGMENT_SUBSRIBERS_SIZE_CHECK_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 EmailmarketingsystemValidator.DIAGNOSTIC_SOURCE,
				 EmailmarketingsystemValidator.SEGMENT__SEGMENT_SUBSRIBERS_SIZE_CHECK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addCondition(String attribute, String operator, String value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeCondition(int conditionIndex) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SegmentCondition> viewConditions() {
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
			case EmailmarketingsystemPackage.SEGMENT__SEGMENT_ID:
				return getSegmentId();
			case EmailmarketingsystemPackage.SEGMENT__NAME:
				return getName();
			case EmailmarketingsystemPackage.SEGMENT__CONDITIONS:
				return getConditions();
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
			case EmailmarketingsystemPackage.SEGMENT__SEGMENT_ID:
				setSegmentId((String)newValue);
				return;
			case EmailmarketingsystemPackage.SEGMENT__NAME:
				setName((String)newValue);
				return;
			case EmailmarketingsystemPackage.SEGMENT__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends SegmentCondition>)newValue);
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
			case EmailmarketingsystemPackage.SEGMENT__SEGMENT_ID:
				setSegmentId(SEGMENT_ID_EDEFAULT);
				return;
			case EmailmarketingsystemPackage.SEGMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EmailmarketingsystemPackage.SEGMENT__CONDITIONS:
				getConditions().clear();
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
			case EmailmarketingsystemPackage.SEGMENT__SEGMENT_ID:
				return SEGMENT_ID_EDEFAULT == null ? segmentId != null : !SEGMENT_ID_EDEFAULT.equals(segmentId);
			case EmailmarketingsystemPackage.SEGMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EmailmarketingsystemPackage.SEGMENT__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
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
			case EmailmarketingsystemPackage.SEGMENT___SEGMENT_DUPLICATE_NAME_CHECK__DIAGNOSTICCHAIN_MAP:
				return segmentDuplicateNameCheck((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EmailmarketingsystemPackage.SEGMENT___SEGMENT_SUBSRIBERS_SIZE_CHECK__DIAGNOSTICCHAIN_MAP:
				return segmentSubsribersSizeCheck((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EmailmarketingsystemPackage.SEGMENT___ADD_CONDITION__STRING_STRING_STRING:
				addCondition((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case EmailmarketingsystemPackage.SEGMENT___REMOVE_CONDITION__INT:
				removeCondition((Integer)arguments.get(0));
				return null;
			case EmailmarketingsystemPackage.SEGMENT___VIEW_CONDITIONS:
				return viewConditions();
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
		result.append(" (segmentId: ");
		result.append(segmentId);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SegmentImpl
