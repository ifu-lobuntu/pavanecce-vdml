/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.PortContainer#getContainedPort <em>Contained Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getPortContainer()
 * @model abstract="true"
 * @generated
 */
public interface PortContainer extends MeasurableElement {
    /**
     * Returns the value of the '<em><b>Contained Port</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.Port}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contained Port</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contained Port</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getPortContainer_ContainedPort()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Port> getContainedPort();

} // PortContainer
