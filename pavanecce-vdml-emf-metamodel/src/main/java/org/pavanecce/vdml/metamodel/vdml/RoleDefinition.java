/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;
import org.pavanecce.vdml.metamodel.smm.Characteristic;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.RoleDefinition#getCategory <em>Category</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.RoleDefinition#getCharacteristicDefinition <em>Characteristic Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getRoleDefinition()
 * @model
 * @generated
 */
public interface RoleDefinition extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Category</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.RoleCategory}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.RoleCategory#getCategoryRole <em>Category Role</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getRoleDefinition_Category()
     * @see org.pavanecce.vdml.metamodel.vdml.RoleCategory#getCategoryRole
     * @model opposite="categoryRole" ordered="false"
     * @generated
     */
    EList<RoleCategory> getCategory();

    /**
     * Returns the value of the '<em><b>Characteristic Definition</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.smm.Characteristic}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Characteristic Definition</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Characteristic Definition</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getRoleDefinition_CharacteristicDefinition()
     * @model ordered="false"
     * @generated
     */
    EList<Characteristic> getCharacteristicDefinition();

} // RoleDefinition
