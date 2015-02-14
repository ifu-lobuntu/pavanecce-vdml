/**
 */
package org.pavanecce.vdml.metamodel.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.vdml.Activity;
import org.pavanecce.vdml.metamodel.vdml.Capability;
import org.pavanecce.vdml.metamodel.vdml.CapabilityOffer;
import org.pavanecce.vdml.metamodel.vdml.DelegationContext;
import org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic;
import org.pavanecce.vdml.metamodel.vdml.PracticeDefinition;
import org.pavanecce.vdml.metamodel.vdml.ResourceUse;
import org.pavanecce.vdml.metamodel.vdml.Role;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ActivityImpl#getCapabilityRequirement <em>Capability Requirement</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ActivityImpl#getResourceUse <em>Resource Use</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ActivityImpl#getDelegationContext <em>Delegation Context</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ActivityImpl#getAppliedCapabilityOffer <em>Applied Capability Offer</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ActivityImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ActivityImpl#getImplementedPractice <em>Implemented Practice</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ActivityImpl#getRecurrenceInterval <em>Recurrence Interval</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ActivityImpl#getPerformingRole <em>Performing Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends PortContainerImpl implements Activity {
    /**
     * The cached value of the '{@link #getCapabilityRequirement() <em>Capability Requirement</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilityRequirement()
     * @generated
     * @ordered
     */
    protected Capability capabilityRequirement;

    /**
     * The cached value of the '{@link #getResourceUse() <em>Resource Use</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceUse()
     * @generated
     * @ordered
     */
    protected EList<ResourceUse> resourceUse;

    /**
     * The cached value of the '{@link #getDelegationContext() <em>Delegation Context</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelegationContext()
     * @generated
     * @ordered
     */
    protected EList<DelegationContext> delegationContext;

    /**
     * The cached value of the '{@link #getAppliedCapabilityOffer() <em>Applied Capability Offer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAppliedCapabilityOffer()
     * @generated
     * @ordered
     */
    protected CapabilityOffer appliedCapabilityOffer;

    /**
     * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDuration()
     * @generated
     * @ordered
     */
    protected MeasuredCharacteristic duration;

    /**
     * The cached value of the '{@link #getImplementedPractice() <em>Implemented Practice</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImplementedPractice()
     * @generated
     * @ordered
     */
    protected EList<PracticeDefinition> implementedPractice;

    /**
     * The cached value of the '{@link #getRecurrenceInterval() <em>Recurrence Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRecurrenceInterval()
     * @generated
     * @ordered
     */
    protected MeasuredCharacteristic recurrenceInterval;

    /**
     * The cached value of the '{@link #getPerformingRole() <em>Performing Role</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPerformingRole()
     * @generated
     * @ordered
     */
    protected Role performingRole;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActivityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.ACTIVITY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Capability getCapabilityRequirement() {
        if (capabilityRequirement != null && capabilityRequirement.eIsProxy()) {
            InternalEObject oldCapabilityRequirement = (InternalEObject)capabilityRequirement;
            capabilityRequirement = (Capability)eResolveProxy(oldCapabilityRequirement);
            if (capabilityRequirement != oldCapabilityRequirement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.ACTIVITY__CAPABILITY_REQUIREMENT, oldCapabilityRequirement, capabilityRequirement));
            }
        }
        return capabilityRequirement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Capability basicGetCapabilityRequirement() {
        return capabilityRequirement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCapabilityRequirement(Capability newCapabilityRequirement) {
        Capability oldCapabilityRequirement = capabilityRequirement;
        capabilityRequirement = newCapabilityRequirement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.ACTIVITY__CAPABILITY_REQUIREMENT, oldCapabilityRequirement, capabilityRequirement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ResourceUse> getResourceUse() {
        if (resourceUse == null) {
            resourceUse = new EObjectContainmentEList<ResourceUse>(ResourceUse.class, this, VdmlPackage.ACTIVITY__RESOURCE_USE);
        }
        return resourceUse;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DelegationContext> getDelegationContext() {
        if (delegationContext == null) {
            delegationContext = new EObjectWithInverseResolvingEList<DelegationContext>(DelegationContext.class, this, VdmlPackage.ACTIVITY__DELEGATION_CONTEXT, VdmlPackage.DELEGATION_CONTEXT__DELEGATED_ACTIVITY);
        }
        return delegationContext;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CapabilityOffer getAppliedCapabilityOffer() {
        if (appliedCapabilityOffer != null && appliedCapabilityOffer.eIsProxy()) {
            InternalEObject oldAppliedCapabilityOffer = (InternalEObject)appliedCapabilityOffer;
            appliedCapabilityOffer = (CapabilityOffer)eResolveProxy(oldAppliedCapabilityOffer);
            if (appliedCapabilityOffer != oldAppliedCapabilityOffer) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.ACTIVITY__APPLIED_CAPABILITY_OFFER, oldAppliedCapabilityOffer, appliedCapabilityOffer));
            }
        }
        return appliedCapabilityOffer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CapabilityOffer basicGetAppliedCapabilityOffer() {
        return appliedCapabilityOffer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAppliedCapabilityOffer(CapabilityOffer newAppliedCapabilityOffer, NotificationChain msgs) {
        CapabilityOffer oldAppliedCapabilityOffer = appliedCapabilityOffer;
        appliedCapabilityOffer = newAppliedCapabilityOffer;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.ACTIVITY__APPLIED_CAPABILITY_OFFER, oldAppliedCapabilityOffer, newAppliedCapabilityOffer);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAppliedCapabilityOffer(CapabilityOffer newAppliedCapabilityOffer) {
        if (newAppliedCapabilityOffer != appliedCapabilityOffer) {
            NotificationChain msgs = null;
            if (appliedCapabilityOffer != null)
                msgs = ((InternalEObject)appliedCapabilityOffer).eInverseRemove(this, VdmlPackage.CAPABILITY_OFFER__APPLYING_ACTIVITY, CapabilityOffer.class, msgs);
            if (newAppliedCapabilityOffer != null)
                msgs = ((InternalEObject)newAppliedCapabilityOffer).eInverseAdd(this, VdmlPackage.CAPABILITY_OFFER__APPLYING_ACTIVITY, CapabilityOffer.class, msgs);
            msgs = basicSetAppliedCapabilityOffer(newAppliedCapabilityOffer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.ACTIVITY__APPLIED_CAPABILITY_OFFER, newAppliedCapabilityOffer, newAppliedCapabilityOffer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasuredCharacteristic getDuration() {
        return duration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDuration(MeasuredCharacteristic newDuration, NotificationChain msgs) {
        MeasuredCharacteristic oldDuration = duration;
        duration = newDuration;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.ACTIVITY__DURATION, oldDuration, newDuration);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDuration(MeasuredCharacteristic newDuration) {
        if (newDuration != duration) {
            NotificationChain msgs = null;
            if (duration != null)
                msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.ACTIVITY__DURATION, null, msgs);
            if (newDuration != null)
                msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.ACTIVITY__DURATION, null, msgs);
            msgs = basicSetDuration(newDuration, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.ACTIVITY__DURATION, newDuration, newDuration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PracticeDefinition> getImplementedPractice() {
        if (implementedPractice == null) {
            implementedPractice = new EObjectResolvingEList<PracticeDefinition>(PracticeDefinition.class, this, VdmlPackage.ACTIVITY__IMPLEMENTED_PRACTICE);
        }
        return implementedPractice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasuredCharacteristic getRecurrenceInterval() {
        return recurrenceInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRecurrenceInterval(MeasuredCharacteristic newRecurrenceInterval, NotificationChain msgs) {
        MeasuredCharacteristic oldRecurrenceInterval = recurrenceInterval;
        recurrenceInterval = newRecurrenceInterval;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.ACTIVITY__RECURRENCE_INTERVAL, oldRecurrenceInterval, newRecurrenceInterval);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRecurrenceInterval(MeasuredCharacteristic newRecurrenceInterval) {
        if (newRecurrenceInterval != recurrenceInterval) {
            NotificationChain msgs = null;
            if (recurrenceInterval != null)
                msgs = ((InternalEObject)recurrenceInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.ACTIVITY__RECURRENCE_INTERVAL, null, msgs);
            if (newRecurrenceInterval != null)
                msgs = ((InternalEObject)newRecurrenceInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.ACTIVITY__RECURRENCE_INTERVAL, null, msgs);
            msgs = basicSetRecurrenceInterval(newRecurrenceInterval, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.ACTIVITY__RECURRENCE_INTERVAL, newRecurrenceInterval, newRecurrenceInterval));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Role getPerformingRole() {
        if (performingRole != null && performingRole.eIsProxy()) {
            InternalEObject oldPerformingRole = (InternalEObject)performingRole;
            performingRole = (Role)eResolveProxy(oldPerformingRole);
            if (performingRole != oldPerformingRole) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.ACTIVITY__PERFORMING_ROLE, oldPerformingRole, performingRole));
            }
        }
        return performingRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Role basicGetPerformingRole() {
        return performingRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPerformingRole(Role newPerformingRole, NotificationChain msgs) {
        Role oldPerformingRole = performingRole;
        performingRole = newPerformingRole;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.ACTIVITY__PERFORMING_ROLE, oldPerformingRole, newPerformingRole);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPerformingRole(Role newPerformingRole) {
        if (newPerformingRole != performingRole) {
            NotificationChain msgs = null;
            if (performingRole != null)
                msgs = ((InternalEObject)performingRole).eInverseRemove(this, VdmlPackage.ROLE__PERFORMED_WORK, Role.class, msgs);
            if (newPerformingRole != null)
                msgs = ((InternalEObject)newPerformingRole).eInverseAdd(this, VdmlPackage.ROLE__PERFORMED_WORK, Role.class, msgs);
            msgs = basicSetPerformingRole(newPerformingRole, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.ACTIVITY__PERFORMING_ROLE, newPerformingRole, newPerformingRole));
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
            case VdmlPackage.ACTIVITY__DELEGATION_CONTEXT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegationContext()).basicAdd(otherEnd, msgs);
            case VdmlPackage.ACTIVITY__APPLIED_CAPABILITY_OFFER:
                if (appliedCapabilityOffer != null)
                    msgs = ((InternalEObject)appliedCapabilityOffer).eInverseRemove(this, VdmlPackage.CAPABILITY_OFFER__APPLYING_ACTIVITY, CapabilityOffer.class, msgs);
                return basicSetAppliedCapabilityOffer((CapabilityOffer)otherEnd, msgs);
            case VdmlPackage.ACTIVITY__PERFORMING_ROLE:
                if (performingRole != null)
                    msgs = ((InternalEObject)performingRole).eInverseRemove(this, VdmlPackage.ROLE__PERFORMED_WORK, Role.class, msgs);
                return basicSetPerformingRole((Role)otherEnd, msgs);
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
            case VdmlPackage.ACTIVITY__RESOURCE_USE:
                return ((InternalEList<?>)getResourceUse()).basicRemove(otherEnd, msgs);
            case VdmlPackage.ACTIVITY__DELEGATION_CONTEXT:
                return ((InternalEList<?>)getDelegationContext()).basicRemove(otherEnd, msgs);
            case VdmlPackage.ACTIVITY__APPLIED_CAPABILITY_OFFER:
                return basicSetAppliedCapabilityOffer(null, msgs);
            case VdmlPackage.ACTIVITY__DURATION:
                return basicSetDuration(null, msgs);
            case VdmlPackage.ACTIVITY__RECURRENCE_INTERVAL:
                return basicSetRecurrenceInterval(null, msgs);
            case VdmlPackage.ACTIVITY__PERFORMING_ROLE:
                return basicSetPerformingRole(null, msgs);
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
            case VdmlPackage.ACTIVITY__CAPABILITY_REQUIREMENT:
                if (resolve) return getCapabilityRequirement();
                return basicGetCapabilityRequirement();
            case VdmlPackage.ACTIVITY__RESOURCE_USE:
                return getResourceUse();
            case VdmlPackage.ACTIVITY__DELEGATION_CONTEXT:
                return getDelegationContext();
            case VdmlPackage.ACTIVITY__APPLIED_CAPABILITY_OFFER:
                if (resolve) return getAppliedCapabilityOffer();
                return basicGetAppliedCapabilityOffer();
            case VdmlPackage.ACTIVITY__DURATION:
                return getDuration();
            case VdmlPackage.ACTIVITY__IMPLEMENTED_PRACTICE:
                return getImplementedPractice();
            case VdmlPackage.ACTIVITY__RECURRENCE_INTERVAL:
                return getRecurrenceInterval();
            case VdmlPackage.ACTIVITY__PERFORMING_ROLE:
                if (resolve) return getPerformingRole();
                return basicGetPerformingRole();
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
            case VdmlPackage.ACTIVITY__CAPABILITY_REQUIREMENT:
                setCapabilityRequirement((Capability)newValue);
                return;
            case VdmlPackage.ACTIVITY__RESOURCE_USE:
                getResourceUse().clear();
                getResourceUse().addAll((Collection<? extends ResourceUse>)newValue);
                return;
            case VdmlPackage.ACTIVITY__DELEGATION_CONTEXT:
                getDelegationContext().clear();
                getDelegationContext().addAll((Collection<? extends DelegationContext>)newValue);
                return;
            case VdmlPackage.ACTIVITY__APPLIED_CAPABILITY_OFFER:
                setAppliedCapabilityOffer((CapabilityOffer)newValue);
                return;
            case VdmlPackage.ACTIVITY__DURATION:
                setDuration((MeasuredCharacteristic)newValue);
                return;
            case VdmlPackage.ACTIVITY__IMPLEMENTED_PRACTICE:
                getImplementedPractice().clear();
                getImplementedPractice().addAll((Collection<? extends PracticeDefinition>)newValue);
                return;
            case VdmlPackage.ACTIVITY__RECURRENCE_INTERVAL:
                setRecurrenceInterval((MeasuredCharacteristic)newValue);
                return;
            case VdmlPackage.ACTIVITY__PERFORMING_ROLE:
                setPerformingRole((Role)newValue);
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
            case VdmlPackage.ACTIVITY__CAPABILITY_REQUIREMENT:
                setCapabilityRequirement((Capability)null);
                return;
            case VdmlPackage.ACTIVITY__RESOURCE_USE:
                getResourceUse().clear();
                return;
            case VdmlPackage.ACTIVITY__DELEGATION_CONTEXT:
                getDelegationContext().clear();
                return;
            case VdmlPackage.ACTIVITY__APPLIED_CAPABILITY_OFFER:
                setAppliedCapabilityOffer((CapabilityOffer)null);
                return;
            case VdmlPackage.ACTIVITY__DURATION:
                setDuration((MeasuredCharacteristic)null);
                return;
            case VdmlPackage.ACTIVITY__IMPLEMENTED_PRACTICE:
                getImplementedPractice().clear();
                return;
            case VdmlPackage.ACTIVITY__RECURRENCE_INTERVAL:
                setRecurrenceInterval((MeasuredCharacteristic)null);
                return;
            case VdmlPackage.ACTIVITY__PERFORMING_ROLE:
                setPerformingRole((Role)null);
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
            case VdmlPackage.ACTIVITY__CAPABILITY_REQUIREMENT:
                return capabilityRequirement != null;
            case VdmlPackage.ACTIVITY__RESOURCE_USE:
                return resourceUse != null && !resourceUse.isEmpty();
            case VdmlPackage.ACTIVITY__DELEGATION_CONTEXT:
                return delegationContext != null && !delegationContext.isEmpty();
            case VdmlPackage.ACTIVITY__APPLIED_CAPABILITY_OFFER:
                return appliedCapabilityOffer != null;
            case VdmlPackage.ACTIVITY__DURATION:
                return duration != null;
            case VdmlPackage.ACTIVITY__IMPLEMENTED_PRACTICE:
                return implementedPractice != null && !implementedPractice.isEmpty();
            case VdmlPackage.ACTIVITY__RECURRENCE_INTERVAL:
                return recurrenceInterval != null;
            case VdmlPackage.ACTIVITY__PERFORMING_ROLE:
                return performingRole != null;
        }
        return super.eIsSet(featureID);
    }

} //ActivityImpl
