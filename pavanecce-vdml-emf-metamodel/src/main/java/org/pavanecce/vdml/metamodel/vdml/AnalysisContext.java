/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;
import org.pavanecce.vdml.metamodel.smm.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.AnalysisContext#getDelegationtContext <em>Delegationt Context</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.AnalysisContext#getContextObservation <em>Context Observation</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.AnalysisContext#getContextStore <em>Context Store</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.AnalysisContext#getContextBasedAssignment <em>Context Based Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getAnalysisContext()
 * @model abstract="true"
 * @generated
 */
public interface AnalysisContext extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Delegationt Context</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.DelegationContext}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.DelegationContext#getParentContext <em>Parent Context</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delegationt Context</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delegationt Context</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getAnalysisContext_DelegationtContext()
     * @see org.pavanecce.vdml.metamodel.vdml.DelegationContext#getParentContext
     * @model opposite="parentContext" containment="true" ordered="false"
     * @generated
     */
    EList<DelegationContext> getDelegationtContext();

    /**
     * Returns the value of the '<em><b>Context Observation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Observation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Observation</em>' reference.
     * @see #setContextObservation(Observation)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getAnalysisContext_ContextObservation()
     * @model ordered="false"
     * @generated
     */
    Observation getContextObservation();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.AnalysisContext#getContextObservation <em>Context Observation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Observation</em>' reference.
     * @see #getContextObservation()
     * @generated
     */
    void setContextObservation(Observation value);

    /**
     * Returns the value of the '<em><b>Context Store</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.Store}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.Store#getStoreContext <em>Store Context</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Store</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Store</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getAnalysisContext_ContextStore()
     * @see org.pavanecce.vdml.metamodel.vdml.Store#getStoreContext
     * @model opposite="storeContext" ordered="false"
     * @generated
     */
    EList<Store> getContextStore();

    /**
     * Returns the value of the '<em><b>Context Based Assignment</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.Assignment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Based Assignment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Based Assignment</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getAnalysisContext_ContextBasedAssignment()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Assignment> getContextBasedAssignment();

} // AnalysisContext
