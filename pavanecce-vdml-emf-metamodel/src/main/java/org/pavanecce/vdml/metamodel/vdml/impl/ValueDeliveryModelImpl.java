/**
 */
package org.pavanecce.vdml.metamodel.vdml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.smm.SmmModel;
import org.pavanecce.vdml.metamodel.vdml.Actor;
import org.pavanecce.vdml.metamodel.vdml.BusinessItemLibrary;
import org.pavanecce.vdml.metamodel.vdml.CapabilityLibrary;
import org.pavanecce.vdml.metamodel.vdml.Collaboration;
import org.pavanecce.vdml.metamodel.vdml.PracticeLibrary;
import org.pavanecce.vdml.metamodel.vdml.RoleLibrary;
import org.pavanecce.vdml.metamodel.vdml.Scenario;
import org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel;
import org.pavanecce.vdml.metamodel.vdml.ValueLibrary;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Delivery Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueDeliveryModelImpl#getMetricsModel <em>Metrics Model</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueDeliveryModelImpl#getValueLibrary <em>Value Library</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueDeliveryModelImpl#getCapabilitylibrary <em>Capabilitylibrary</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueDeliveryModelImpl#getBusinessItemLibrary <em>Business Item Library</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueDeliveryModelImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueDeliveryModelImpl#getPracticeLibrary <em>Practice Library</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueDeliveryModelImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueDeliveryModelImpl#getCollaboration <em>Collaboration</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueDeliveryModelImpl#getRoleLibrary <em>Role Library</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueDeliveryModelImpl#getDiagram <em>Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueDeliveryModelImpl extends VdmlElementImpl implements ValueDeliveryModel {
    /**
     * The cached value of the '{@link #getMetricsModel() <em>Metrics Model</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMetricsModel()
     * @generated
     * @ordered
     */
    protected EList<SmmModel> metricsModel;

    /**
     * The cached value of the '{@link #getValueLibrary() <em>Value Library</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueLibrary()
     * @generated
     * @ordered
     */
    protected EList<ValueLibrary> valueLibrary;

    /**
     * The cached value of the '{@link #getCapabilitylibrary() <em>Capabilitylibrary</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilitylibrary()
     * @generated
     * @ordered
     */
    protected EList<CapabilityLibrary> capabilitylibrary;

    /**
     * The cached value of the '{@link #getBusinessItemLibrary() <em>Business Item Library</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBusinessItemLibrary()
     * @generated
     * @ordered
     */
    protected EList<BusinessItemLibrary> businessItemLibrary;

    /**
     * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActor()
     * @generated
     * @ordered
     */
    protected EList<Actor> actor;

    /**
     * The cached value of the '{@link #getPracticeLibrary() <em>Practice Library</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPracticeLibrary()
     * @generated
     * @ordered
     */
    protected EList<PracticeLibrary> practiceLibrary;

    /**
     * The cached value of the '{@link #getScenario() <em>Scenario</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScenario()
     * @generated
     * @ordered
     */
    protected EList<Scenario> scenario;

    /**
     * The cached value of the '{@link #getCollaboration() <em>Collaboration</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCollaboration()
     * @generated
     * @ordered
     */
    protected EList<Collaboration> collaboration;

    /**
     * The cached value of the '{@link #getRoleLibrary() <em>Role Library</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoleLibrary()
     * @generated
     * @ordered
     */
    protected EList<RoleLibrary> roleLibrary;

    /**
     * The cached value of the '{@link #getDiagram() <em>Diagram</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiagram()
     * @generated
     * @ordered
     */
    protected EList<VDMLDiagram> diagram;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ValueDeliveryModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.VALUE_DELIVERY_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SmmModel> getMetricsModel() {
        if (metricsModel == null) {
            metricsModel = new EObjectContainmentEList<SmmModel>(SmmModel.class, this, VdmlPackage.VALUE_DELIVERY_MODEL__METRICS_MODEL);
        }
        return metricsModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ValueLibrary> getValueLibrary() {
        if (valueLibrary == null) {
            valueLibrary = new EObjectContainmentEList<ValueLibrary>(ValueLibrary.class, this, VdmlPackage.VALUE_DELIVERY_MODEL__VALUE_LIBRARY);
        }
        return valueLibrary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CapabilityLibrary> getCapabilitylibrary() {
        if (capabilitylibrary == null) {
            capabilitylibrary = new EObjectContainmentEList<CapabilityLibrary>(CapabilityLibrary.class, this, VdmlPackage.VALUE_DELIVERY_MODEL__CAPABILITYLIBRARY);
        }
        return capabilitylibrary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BusinessItemLibrary> getBusinessItemLibrary() {
        if (businessItemLibrary == null) {
            businessItemLibrary = new EObjectContainmentEList<BusinessItemLibrary>(BusinessItemLibrary.class, this, VdmlPackage.VALUE_DELIVERY_MODEL__BUSINESS_ITEM_LIBRARY);
        }
        return businessItemLibrary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Actor> getActor() {
        if (actor == null) {
            actor = new EObjectContainmentEList<Actor>(Actor.class, this, VdmlPackage.VALUE_DELIVERY_MODEL__ACTOR);
        }
        return actor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PracticeLibrary> getPracticeLibrary() {
        if (practiceLibrary == null) {
            practiceLibrary = new EObjectContainmentEList<PracticeLibrary>(PracticeLibrary.class, this, VdmlPackage.VALUE_DELIVERY_MODEL__PRACTICE_LIBRARY);
        }
        return practiceLibrary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Scenario> getScenario() {
        if (scenario == null) {
            scenario = new EObjectContainmentEList<Scenario>(Scenario.class, this, VdmlPackage.VALUE_DELIVERY_MODEL__SCENARIO);
        }
        return scenario;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Collaboration> getCollaboration() {
        if (collaboration == null) {
            collaboration = new EObjectContainmentEList<Collaboration>(Collaboration.class, this, VdmlPackage.VALUE_DELIVERY_MODEL__COLLABORATION);
        }
        return collaboration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RoleLibrary> getRoleLibrary() {
        if (roleLibrary == null) {
            roleLibrary = new EObjectContainmentEList<RoleLibrary>(RoleLibrary.class, this, VdmlPackage.VALUE_DELIVERY_MODEL__ROLE_LIBRARY);
        }
        return roleLibrary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VDMLDiagram> getDiagram() {
        if (diagram == null) {
            diagram = new EObjectContainmentEList<VDMLDiagram>(VDMLDiagram.class, this, VdmlPackage.VALUE_DELIVERY_MODEL__DIAGRAM);
        }
        return diagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VdmlPackage.VALUE_DELIVERY_MODEL__METRICS_MODEL:
                return ((InternalEList<?>)getMetricsModel()).basicRemove(otherEnd, msgs);
            case VdmlPackage.VALUE_DELIVERY_MODEL__VALUE_LIBRARY:
                return ((InternalEList<?>)getValueLibrary()).basicRemove(otherEnd, msgs);
            case VdmlPackage.VALUE_DELIVERY_MODEL__CAPABILITYLIBRARY:
                return ((InternalEList<?>)getCapabilitylibrary()).basicRemove(otherEnd, msgs);
            case VdmlPackage.VALUE_DELIVERY_MODEL__BUSINESS_ITEM_LIBRARY:
                return ((InternalEList<?>)getBusinessItemLibrary()).basicRemove(otherEnd, msgs);
            case VdmlPackage.VALUE_DELIVERY_MODEL__ACTOR:
                return ((InternalEList<?>)getActor()).basicRemove(otherEnd, msgs);
            case VdmlPackage.VALUE_DELIVERY_MODEL__PRACTICE_LIBRARY:
                return ((InternalEList<?>)getPracticeLibrary()).basicRemove(otherEnd, msgs);
            case VdmlPackage.VALUE_DELIVERY_MODEL__SCENARIO:
                return ((InternalEList<?>)getScenario()).basicRemove(otherEnd, msgs);
            case VdmlPackage.VALUE_DELIVERY_MODEL__COLLABORATION:
                return ((InternalEList<?>)getCollaboration()).basicRemove(otherEnd, msgs);
            case VdmlPackage.VALUE_DELIVERY_MODEL__ROLE_LIBRARY:
                return ((InternalEList<?>)getRoleLibrary()).basicRemove(otherEnd, msgs);
            case VdmlPackage.VALUE_DELIVERY_MODEL__DIAGRAM:
                return ((InternalEList<?>)getDiagram()).basicRemove(otherEnd, msgs);
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
            case VdmlPackage.VALUE_DELIVERY_MODEL__METRICS_MODEL:
                return getMetricsModel();
            case VdmlPackage.VALUE_DELIVERY_MODEL__VALUE_LIBRARY:
                return getValueLibrary();
            case VdmlPackage.VALUE_DELIVERY_MODEL__CAPABILITYLIBRARY:
                return getCapabilitylibrary();
            case VdmlPackage.VALUE_DELIVERY_MODEL__BUSINESS_ITEM_LIBRARY:
                return getBusinessItemLibrary();
            case VdmlPackage.VALUE_DELIVERY_MODEL__ACTOR:
                return getActor();
            case VdmlPackage.VALUE_DELIVERY_MODEL__PRACTICE_LIBRARY:
                return getPracticeLibrary();
            case VdmlPackage.VALUE_DELIVERY_MODEL__SCENARIO:
                return getScenario();
            case VdmlPackage.VALUE_DELIVERY_MODEL__COLLABORATION:
                return getCollaboration();
            case VdmlPackage.VALUE_DELIVERY_MODEL__ROLE_LIBRARY:
                return getRoleLibrary();
            case VdmlPackage.VALUE_DELIVERY_MODEL__DIAGRAM:
                return getDiagram();
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
            case VdmlPackage.VALUE_DELIVERY_MODEL__METRICS_MODEL:
                getMetricsModel().clear();
                getMetricsModel().addAll((Collection<? extends SmmModel>)newValue);
                return;
            case VdmlPackage.VALUE_DELIVERY_MODEL__VALUE_LIBRARY:
                getValueLibrary().clear();
                getValueLibrary().addAll((Collection<? extends ValueLibrary>)newValue);
                return;
            case VdmlPackage.VALUE_DELIVERY_MODEL__CAPABILITYLIBRARY:
                getCapabilitylibrary().clear();
                getCapabilitylibrary().addAll((Collection<? extends CapabilityLibrary>)newValue);
                return;
            case VdmlPackage.VALUE_DELIVERY_MODEL__BUSINESS_ITEM_LIBRARY:
                getBusinessItemLibrary().clear();
                getBusinessItemLibrary().addAll((Collection<? extends BusinessItemLibrary>)newValue);
                return;
            case VdmlPackage.VALUE_DELIVERY_MODEL__ACTOR:
                getActor().clear();
                getActor().addAll((Collection<? extends Actor>)newValue);
                return;
            case VdmlPackage.VALUE_DELIVERY_MODEL__PRACTICE_LIBRARY:
                getPracticeLibrary().clear();
                getPracticeLibrary().addAll((Collection<? extends PracticeLibrary>)newValue);
                return;
            case VdmlPackage.VALUE_DELIVERY_MODEL__SCENARIO:
                getScenario().clear();
                getScenario().addAll((Collection<? extends Scenario>)newValue);
                return;
            case VdmlPackage.VALUE_DELIVERY_MODEL__COLLABORATION:
                getCollaboration().clear();
                getCollaboration().addAll((Collection<? extends Collaboration>)newValue);
                return;
            case VdmlPackage.VALUE_DELIVERY_MODEL__ROLE_LIBRARY:
                getRoleLibrary().clear();
                getRoleLibrary().addAll((Collection<? extends RoleLibrary>)newValue);
                return;
            case VdmlPackage.VALUE_DELIVERY_MODEL__DIAGRAM:
                getDiagram().clear();
                getDiagram().addAll((Collection<? extends VDMLDiagram>)newValue);
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
            case VdmlPackage.VALUE_DELIVERY_MODEL__METRICS_MODEL:
                getMetricsModel().clear();
                return;
            case VdmlPackage.VALUE_DELIVERY_MODEL__VALUE_LIBRARY:
                getValueLibrary().clear();
                return;
            case VdmlPackage.VALUE_DELIVERY_MODEL__CAPABILITYLIBRARY:
                getCapabilitylibrary().clear();
                return;
            case VdmlPackage.VALUE_DELIVERY_MODEL__BUSINESS_ITEM_LIBRARY:
                getBusinessItemLibrary().clear();
                return;
            case VdmlPackage.VALUE_DELIVERY_MODEL__ACTOR:
                getActor().clear();
                return;
            case VdmlPackage.VALUE_DELIVERY_MODEL__PRACTICE_LIBRARY:
                getPracticeLibrary().clear();
                return;
            case VdmlPackage.VALUE_DELIVERY_MODEL__SCENARIO:
                getScenario().clear();
                return;
            case VdmlPackage.VALUE_DELIVERY_MODEL__COLLABORATION:
                getCollaboration().clear();
                return;
            case VdmlPackage.VALUE_DELIVERY_MODEL__ROLE_LIBRARY:
                getRoleLibrary().clear();
                return;
            case VdmlPackage.VALUE_DELIVERY_MODEL__DIAGRAM:
                getDiagram().clear();
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
            case VdmlPackage.VALUE_DELIVERY_MODEL__METRICS_MODEL:
                return metricsModel != null && !metricsModel.isEmpty();
            case VdmlPackage.VALUE_DELIVERY_MODEL__VALUE_LIBRARY:
                return valueLibrary != null && !valueLibrary.isEmpty();
            case VdmlPackage.VALUE_DELIVERY_MODEL__CAPABILITYLIBRARY:
                return capabilitylibrary != null && !capabilitylibrary.isEmpty();
            case VdmlPackage.VALUE_DELIVERY_MODEL__BUSINESS_ITEM_LIBRARY:
                return businessItemLibrary != null && !businessItemLibrary.isEmpty();
            case VdmlPackage.VALUE_DELIVERY_MODEL__ACTOR:
                return actor != null && !actor.isEmpty();
            case VdmlPackage.VALUE_DELIVERY_MODEL__PRACTICE_LIBRARY:
                return practiceLibrary != null && !practiceLibrary.isEmpty();
            case VdmlPackage.VALUE_DELIVERY_MODEL__SCENARIO:
                return scenario != null && !scenario.isEmpty();
            case VdmlPackage.VALUE_DELIVERY_MODEL__COLLABORATION:
                return collaboration != null && !collaboration.isEmpty();
            case VdmlPackage.VALUE_DELIVERY_MODEL__ROLE_LIBRARY:
                return roleLibrary != null && !roleLibrary.isEmpty();
            case VdmlPackage.VALUE_DELIVERY_MODEL__DIAGRAM:
                return diagram != null && !diagram.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ValueDeliveryModelImpl
