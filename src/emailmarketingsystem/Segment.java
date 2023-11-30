/**
 */
package emailmarketingsystem;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emailmarketingsystem.Segment#getSegmentId <em>Segment Id</em>}</li>
 *   <li>{@link emailmarketingsystem.Segment#getName <em>Name</em>}</li>
 *   <li>{@link emailmarketingsystem.Segment#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @see emailmarketingsystem.EmailmarketingsystemPackage#getSegment()
 * @model
 * @generated
 */
public interface Segment extends EObject {
	/**
	 * Returns the value of the '<em><b>Segment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Id</em>' attribute.
	 * @see #setSegmentId(String)
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getSegment_SegmentId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSegmentId();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.Segment#getSegmentId <em>Segment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Id</em>' attribute.
	 * @see #getSegmentId()
	 * @generated
	 */
	void setSegmentId(String value);

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
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getSegment_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link emailmarketingsystem.Segment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' reference list.
	 * The list contents are of type {@link emailmarketingsystem.SegmentCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' reference list.
	 * @see emailmarketingsystem.EmailmarketingsystemPackage#getSegment_Conditions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SegmentCondition> getConditions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Segment.allInstances()->forAll(s1, s2 | s1 <> s2 implies s1.name <> s2.name)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='Segment.allInstances()-&gt;forAll(s1, s2 | s1 &lt;&gt; s2 implies s1.name &lt;&gt; s2.name)'"
	 * @generated
	 */
	boolean segmentDuplicateNameCheck(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  self.subscribers->size() > 0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body=' self.subscribers-&gt;size() &gt; 0'"
	 * @generated
	 */
	boolean segmentSubsribersSizeCheck(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model attributeRequired="true" attributeOrdered="false" operatorRequired="true" operatorOrdered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	void addCondition(String attribute, String operator, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conditionIndexRequired="true" conditionIndexOrdered="false"
	 * @generated
	 */
	void removeCondition(int conditionIndex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<SegmentCondition> viewConditions();

} // Segment
