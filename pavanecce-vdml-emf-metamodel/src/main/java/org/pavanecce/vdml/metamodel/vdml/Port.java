/**
 */
package org.pavanecce.vdml.metamodel.vdml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Port#isIntermediate <em>Is Intermediate</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Port#getPlanningPercentage <em>Planning Percentage</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Port#getBatchSize <em>Batch Size</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Port#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Port#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.Port#getHandler <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends MeasurableElement {
    /**
     * Returns the value of the '<em><b>Is Intermediate</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Intermediate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Intermediate</em>' attribute.
     * @see #setIsIntermediate(boolean)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getPort_IsIntermediate()
     * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isIntermediate();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.Port#isIntermediate <em>Is Intermediate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Intermediate</em>' attribute.
     * @see #isIntermediate()
     * @generated
     */
    void setIsIntermediate(boolean value);

    /**
     * Returns the value of the '<em><b>Planning Percentage</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Planning Percentage</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Planning Percentage</em>' containment reference.
     * @see #setPlanningPercentage(MeasuredCharacteristic)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getPort_PlanningPercentage()
     * @model containment="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getPlanningPercentage();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.Port#getPlanningPercentage <em>Planning Percentage</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Planning Percentage</em>' containment reference.
     * @see #getPlanningPercentage()
     * @generated
     */
    void setPlanningPercentage(MeasuredCharacteristic value);

    /**
     * Returns the value of the '<em><b>Batch Size</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Batch Size</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Batch Size</em>' containment reference.
     * @see #setBatchSize(MeasuredCharacteristic)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getPort_BatchSize()
     * @model containment="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getBatchSize();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.Port#getBatchSize <em>Batch Size</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Batch Size</em>' containment reference.
     * @see #getBatchSize()
     * @generated
     */
    void setBatchSize(MeasuredCharacteristic value);

    /**
     * Returns the value of the '<em><b>Offset</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Offset</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Offset</em>' containment reference.
     * @see #setOffset(MeasuredCharacteristic)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getPort_Offset()
     * @model containment="true" ordered="false"
     * @generated
     */
    MeasuredCharacteristic getOffset();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.Port#getOffset <em>Offset</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Offset</em>' containment reference.
     * @see #getOffset()
     * @generated
     */
    void setOffset(MeasuredCharacteristic value);

    /**
     * Returns the value of the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Condition</em>' containment reference.
     * @see #setCondition(Expression)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getPort_Condition()
     * @model containment="true" ordered="false"
     * @generated
     */
    Expression getCondition();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.Port#getCondition <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition</em>' containment reference.
     * @see #getCondition()
     * @generated
     */
    void setCondition(Expression value);

    /**
     * Returns the value of the '<em><b>Handler</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.Role#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Handler</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Handler</em>' reference.
     * @see #setHandler(Role)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getPort_Handler()
     * @see org.pavanecce.vdml.metamodel.vdml.Role#getPort
     * @model opposite="port" ordered="false"
     * @generated
     */
    Role getHandler();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.Port#getHandler <em>Handler</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Handler</em>' reference.
     * @see #getHandler()
     * @generated
     */
    void setHandler(Role value);

} // Port
