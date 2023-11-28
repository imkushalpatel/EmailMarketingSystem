/**
 */
package EmailMarketingSystem;

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
 *   <li>{@link EmailMarketingSystem.Segment#getSegmentId <em>Segment Id</em>}</li>
 *   <li>{@link EmailMarketingSystem.Segment#getName <em>Name</em>}</li>
 *   <li>{@link EmailMarketingSystem.Segment#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getSegment()
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
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getSegment_SegmentId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSegmentId();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.Segment#getSegmentId <em>Segment Id</em>}' attribute.
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
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getSegment_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link EmailMarketingSystem.Segment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' reference list.
	 * The list contents are of type {@link EmailMarketingSystem.SegmentCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' reference list.
	 * @see EmailMarketingSystem.EmailMarketingSystemPackage#getSegment_Conditions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SegmentCondition> getConditions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void viewConditions();

} // Segment
