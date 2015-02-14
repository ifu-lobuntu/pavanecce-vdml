/**
 */
package org.pavanecce.vdml.metamodel.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.vdml.PracticeCategory;
import org.pavanecce.vdml.metamodel.vdml.PracticeDefinition;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Practice Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.PracticeCategoryImpl#getParentCategory <em>Parent Category</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.PracticeCategoryImpl#getChildCategory <em>Child Category</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.PracticeCategoryImpl#getCategoryPractice <em>Category Practice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PracticeCategoryImpl extends VdmlElementImpl implements PracticeCategory {
    /**
     * The cached value of the '{@link #getParentCategory() <em>Parent Category</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParentCategory()
     * @generated
     * @ordered
     */
    protected EList<PracticeCategory> parentCategory;

    /**
     * The cached value of the '{@link #getChildCategory() <em>Child Category</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChildCategory()
     * @generated
     * @ordered
     */
    protected EList<PracticeCategory> childCategory;

    /**
     * The cached value of the '{@link #getCategoryPractice() <em>Category Practice</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCategoryPractice()
     * @generated
     * @ordered
     */
    protected EList<PracticeDefinition> categoryPractice;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PracticeCategoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.PRACTICE_CATEGORY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PracticeCategory> getParentCategory() {
        if (parentCategory == null) {
            parentCategory = new EObjectWithInverseResolvingEList.ManyInverse<PracticeCategory>(PracticeCategory.class, this, VdmlPackage.PRACTICE_CATEGORY__PARENT_CATEGORY, VdmlPackage.PRACTICE_CATEGORY__CHILD_CATEGORY);
        }
        return parentCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PracticeCategory> getChildCategory() {
        if (childCategory == null) {
            childCategory = new EObjectWithInverseResolvingEList.ManyInverse<PracticeCategory>(PracticeCategory.class, this, VdmlPackage.PRACTICE_CATEGORY__CHILD_CATEGORY, VdmlPackage.PRACTICE_CATEGORY__PARENT_CATEGORY);
        }
        return childCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PracticeDefinition> getCategoryPractice() {
        if (categoryPractice == null) {
            categoryPractice = new EObjectWithInverseResolvingEList.ManyInverse<PracticeDefinition>(PracticeDefinition.class, this, VdmlPackage.PRACTICE_CATEGORY__CATEGORY_PRACTICE, VdmlPackage.PRACTICE_DEFINITION__CATEGORY);
        }
        return categoryPractice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VdmlPackage.PRACTICE_CATEGORY__PARENT_CATEGORY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentCategory()).basicAdd(otherEnd, msgs);
            case VdmlPackage.PRACTICE_CATEGORY__CHILD_CATEGORY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildCategory()).basicAdd(otherEnd, msgs);
            case VdmlPackage.PRACTICE_CATEGORY__CATEGORY_PRACTICE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategoryPractice()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VdmlPackage.PRACTICE_CATEGORY__PARENT_CATEGORY:
                return ((InternalEList<?>)getParentCategory()).basicRemove(otherEnd, msgs);
            case VdmlPackage.PRACTICE_CATEGORY__CHILD_CATEGORY:
                return ((InternalEList<?>)getChildCategory()).basicRemove(otherEnd, msgs);
            case VdmlPackage.PRACTICE_CATEGORY__CATEGORY_PRACTICE:
                return ((InternalEList<?>)getCategoryPractice()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case VdmlPackage.PRACTICE_CATEGORY__PARENT_CATEGORY:
                return getParentCategory();
            case VdmlPackage.PRACTICE_CATEGORY__CHILD_CATEGORY:
                return getChildCategory();
            case VdmlPackage.PRACTICE_CATEGORY__CATEGORY_PRACTICE:
                return getCategoryPractice();
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
            case VdmlPackage.PRACTICE_CATEGORY__PARENT_CATEGORY:
                getParentCategory().clear();
                getParentCategory().addAll((Collection<? extends PracticeCategory>)newValue);
                return;
            case VdmlPackage.PRACTICE_CATEGORY__CHILD_CATEGORY:
                getChildCategory().clear();
                getChildCategory().addAll((Collection<? extends PracticeCategory>)newValue);
                return;
            case VdmlPackage.PRACTICE_CATEGORY__CATEGORY_PRACTICE:
                getCategoryPractice().clear();
                getCategoryPractice().addAll((Collection<? extends PracticeDefinition>)newValue);
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
            case VdmlPackage.PRACTICE_CATEGORY__PARENT_CATEGORY:
                getParentCategory().clear();
                return;
            case VdmlPackage.PRACTICE_CATEGORY__CHILD_CATEGORY:
                getChildCategory().clear();
                return;
            case VdmlPackage.PRACTICE_CATEGORY__CATEGORY_PRACTICE:
                getCategoryPractice().clear();
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
            case VdmlPackage.PRACTICE_CATEGORY__PARENT_CATEGORY:
                return parentCategory != null && !parentCategory.isEmpty();
            case VdmlPackage.PRACTICE_CATEGORY__CHILD_CATEGORY:
                return childCategory != null && !childCategory.isEmpty();
            case VdmlPackage.PRACTICE_CATEGORY__CATEGORY_PRACTICE:
                return categoryPractice != null && !categoryPractice.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //PracticeCategoryImpl
