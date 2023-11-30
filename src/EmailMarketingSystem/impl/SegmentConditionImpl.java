/**
 */
package EmailMarketingSystem.impl;

import EmailMarketingSystem.EmailMarketingSystemPackage;
import EmailMarketingSystem.SegmentCondition;

import EmailMarketingSystem.util.EmailMarketingSystemValidator;

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
 *   <li>{@link EmailMarketingSystem.impl.SegmentConditionImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.SegmentConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link EmailMarketingSystem.impl.SegmentConditionImpl#getValue <em>Value</em>}</li>
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
		return EmailMarketingSystemPackage.Literals.SEGMENT_CONDITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.SEGMENT_CONDITION__ATTRIBUTE, oldAttribute, attribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.SEGMENT_CONDITION__OPERATOR, oldOperator, operator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailMarketingSystemPackage.SEGMENT_CONDITION__VALUE, oldValue, value));
	}

	/**
	 * The cached validation expression for the '{@link #Constraint6(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint6</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Constraint6(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT6_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "self.operator = 'greaterThan' or self.operator = 'lessThan' or self.operator = 'equalTo'  or self.operator = 'contains'";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Constraint6(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			EmailMarketingSystemValidator.validate
				(EmailMarketingSystemPackage.Literals.SEGMENT_CONDITION,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 EmailMarketingSystemPackage.Literals.SEGMENT_CONDITION___CONSTRAINT6__DIAGNOSTICCHAIN_MAP,
				 CONSTRAINT6_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 EmailMarketingSystemValidator.DIAGNOSTIC_SOURCE,
				 EmailMarketingSystemValidator.SEGMENT_CONDITION__CONSTRAINT6);
	}

	/**
	 * The cached validation expression for the '{@link #Constraint14(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint14</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #Constraint14(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT14_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "self.operator <>null and self.attribute <>null";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Constraint14(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			EmailMarketingSystemValidator.validate
				(EmailMarketingSystemPackage.Literals.SEGMENT_CONDITION,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 EmailMarketingSystemPackage.Literals.SEGMENT_CONDITION___CONSTRAINT14__DIAGNOSTICCHAIN_MAP,
				 CONSTRAINT14_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 EmailMarketingSystemValidator.DIAGNOSTIC_SOURCE,
				 EmailMarketingSystemValidator.SEGMENT_CONDITION__CONSTRAINT14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmailMarketingSystemPackage.SEGMENT_CONDITION__ATTRIBUTE:
				return getAttribute();
			case EmailMarketingSystemPackage.SEGMENT_CONDITION__OPERATOR:
				return getOperator();
			case EmailMarketingSystemPackage.SEGMENT_CONDITION__VALUE:
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
			case EmailMarketingSystemPackage.SEGMENT_CONDITION__ATTRIBUTE:
				setAttribute((String)newValue);
				return;
			case EmailMarketingSystemPackage.SEGMENT_CONDITION__OPERATOR:
				setOperator((String)newValue);
				return;
			case EmailMarketingSystemPackage.SEGMENT_CONDITION__VALUE:
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
			case EmailMarketingSystemPackage.SEGMENT_CONDITION__ATTRIBUTE:
				setAttribute(ATTRIBUTE_EDEFAULT);
				return;
			case EmailMarketingSystemPackage.SEGMENT_CONDITION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case EmailMarketingSystemPackage.SEGMENT_CONDITION__VALUE:
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
			case EmailMarketingSystemPackage.SEGMENT_CONDITION__ATTRIBUTE:
				return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
			case EmailMarketingSystemPackage.SEGMENT_CONDITION__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
			case EmailMarketingSystemPackage.SEGMENT_CONDITION__VALUE:
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
			case EmailMarketingSystemPackage.SEGMENT_CONDITION___CONSTRAINT6__DIAGNOSTICCHAIN_MAP:
				return Constraint6((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EmailMarketingSystemPackage.SEGMENT_CONDITION___CONSTRAINT14__DIAGNOSTICCHAIN_MAP:
				return Constraint14((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
