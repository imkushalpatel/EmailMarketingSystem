/**
 */
package emailmarketingsystem.impl;

import emailmarketingsystem.EmailmarketingsystemPackage;
import emailmarketingsystem.SegmentCondition;

import emailmarketingsystem.util.EmailmarketingsystemValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Segment Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emailmarketingsystem.impl.SegmentConditionImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link emailmarketingsystem.impl.SegmentConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link emailmarketingsystem.impl.SegmentConditionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SegmentConditionImpl extends MinimalEObjectImpl.Container implements SegmentCondition {
	/**
	 * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected String attribute = ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegmentConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmailmarketingsystemPackage.Literals.SEGMENT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttribute(String newAttribute) {
		String oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailmarketingsystemPackage.SEGMENT_CONDITION__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(String newOperator) {
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailmarketingsystemPackage.SEGMENT_CONDITION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailmarketingsystemPackage.SEGMENT_CONDITION__VALUE, oldValue, value));
	}

	/**
	 * The cached validation expression for the '{@link #segmentConditionOperaterCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Segment Condition Operater Check</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #segmentConditionOperaterCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SEGMENT_CONDITION_OPERATER_CHECK_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "self.operator = 'greaterThan' or self.operator = 'lessThan' or self.operator = 'equalTo'  or self.operator = 'contains'";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean segmentConditionOperaterCheck(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			EmailmarketingsystemValidator.validate
				(EmailmarketingsystemPackage.Literals.SEGMENT_CONDITION,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 EmailmarketingsystemPackage.Literals.SEGMENT_CONDITION___SEGMENT_CONDITION_OPERATER_CHECK__DIAGNOSTICCHAIN_MAP,
				 SEGMENT_CONDITION_OPERATER_CHECK_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 EmailmarketingsystemValidator.DIAGNOSTIC_SOURCE,
				 EmailmarketingsystemValidator.SEGMENT_CONDITION__SEGMENT_CONDITION_OPERATER_CHECK);
	}

	/**
	 * The cached validation expression for the '{@link #segmentConditionNullCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Segment Condition Null Check</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #segmentConditionNullCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SEGMENT_CONDITION_NULL_CHECK_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "self.operator <>null and self.attribute <>null";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean segmentConditionNullCheck(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			EmailmarketingsystemValidator.validate
				(EmailmarketingsystemPackage.Literals.SEGMENT_CONDITION,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 EmailmarketingsystemPackage.Literals.SEGMENT_CONDITION___SEGMENT_CONDITION_NULL_CHECK__DIAGNOSTICCHAIN_MAP,
				 SEGMENT_CONDITION_NULL_CHECK_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 EmailmarketingsystemValidator.DIAGNOSTIC_SOURCE,
				 EmailmarketingsystemValidator.SEGMENT_CONDITION__SEGMENT_CONDITION_NULL_CHECK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmailmarketingsystemPackage.SEGMENT_CONDITION__ATTRIBUTE:
				return getAttribute();
			case EmailmarketingsystemPackage.SEGMENT_CONDITION__OPERATOR:
				return getOperator();
			case EmailmarketingsystemPackage.SEGMENT_CONDITION__VALUE:
				return getValue();
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
			case EmailmarketingsystemPackage.SEGMENT_CONDITION__ATTRIBUTE:
				setAttribute((String)newValue);
				return;
			case EmailmarketingsystemPackage.SEGMENT_CONDITION__OPERATOR:
				setOperator((String)newValue);
				return;
			case EmailmarketingsystemPackage.SEGMENT_CONDITION__VALUE:
				setValue((String)newValue);
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
			case EmailmarketingsystemPackage.SEGMENT_CONDITION__ATTRIBUTE:
				setAttribute(ATTRIBUTE_EDEFAULT);
				return;
			case EmailmarketingsystemPackage.SEGMENT_CONDITION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case EmailmarketingsystemPackage.SEGMENT_CONDITION__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case EmailmarketingsystemPackage.SEGMENT_CONDITION__ATTRIBUTE:
				return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
			case EmailmarketingsystemPackage.SEGMENT_CONDITION__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
			case EmailmarketingsystemPackage.SEGMENT_CONDITION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
			case EmailmarketingsystemPackage.SEGMENT_CONDITION___SEGMENT_CONDITION_OPERATER_CHECK__DIAGNOSTICCHAIN_MAP:
				return segmentConditionOperaterCheck((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EmailmarketingsystemPackage.SEGMENT_CONDITION___SEGMENT_CONDITION_NULL_CHECK__DIAGNOSTICCHAIN_MAP:
				return segmentConditionNullCheck((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (attribute: ");
		result.append(attribute);
		result.append(", operator: ");
		result.append(operator);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //SegmentConditionImpl
