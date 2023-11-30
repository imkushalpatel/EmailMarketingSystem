/**
 */
package emailmarketingsystem;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emailmarketingsystem.SegmentCondition#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link emailmarketingsystem.SegmentCondition#getOperator <em>Operator</em>}</li>
 *   <li>{@link emailmarketingsystem.SegmentCondition#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see emailmarketingsystem.EmailmarketingsystemPackage#getSegmentCondition()
 * @model
 * @generated
 */
public interface SegmentCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see #setAttribute(String)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getSegmentCondition_Attribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getAttribute();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.SegmentCondition#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getSegmentCondition_Operator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.SegmentCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getSegmentCondition_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.SegmentCondition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.operator = 'greaterThan' or self.operator = 'lessThan' or self.operator = 'equalTo'  or self.operator = 'contains'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.operator = \'greaterThan\' or self.operator = \'lessThan\' or self.operator = \'equalTo\'  or self.operator = \'contains\''"
	 * @generated
	 */
	boolean Constraint6(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.operator <>null and self.attribute <>null
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.operator &lt;&gt;null and self.attribute &lt;&gt;null'"
	 * @generated
	 */
	boolean Constraint14(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SegmentCondition
