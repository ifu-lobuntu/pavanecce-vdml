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
import org.eclipse.emf.ecore.util.InternalEList;
import org.pavanecce.vdml.metamodel.vdml.MeasuredCharacteristic;
import org.pavanecce.vdml.metamodel.vdml.ValueDefinition;
import org.pavanecce.vdml.metamodel.vdml.ValueElement;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueElementImpl#getValueDefinition <em>Value Definition</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueElementImpl#getValueMeasurement <em>Value Measurement</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.impl.ValueElementImpl#getBenchmark <em>Benchmark</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ValueElementImpl extends MeasurableElementImpl implements ValueElement {
    /**
     * The cached value of the '{@link #getValueDefinition() <em>Value Definition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueDefinition()
     * @generated
     * @ordered
     */
    protected ValueDefinition valueDefinition;

    /**
     * The cached value of the '{@link #getValueMeasurement() <em>Value Measurement</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueMeasurement()
     * @generated
     * @ordered
     */
    protected MeasuredCharacteristic valueMeasurement;

    /**
     * The cached value of the '{@link #getBenchmark() <em>Benchmark</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBenchmark()
     * @generated
     * @ordered
     */
    protected EList<MeasuredCharacteristic> benchmark;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ValueElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VdmlPackage.Literals.VALUE_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueDefinition getValueDefinition() {
        if (valueDefinition != null && valueDefinition.eIsProxy()) {
            InternalEObject oldValueDefinition = (InternalEObject)valueDefinition;
            valueDefinition = (ValueDefinition)eResolveProxy(oldValueDefinition);
            if (valueDefinition != oldValueDefinition) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VdmlPackage.VALUE_ELEMENT__VALUE_DEFINITION, oldValueDefinition, valueDefinition));
            }
        }
        return valueDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueDefinition basicGetValueDefinition() {
        return valueDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValueDefinition(ValueDefinition newValueDefinition) {
        ValueDefinition oldValueDefinition = valueDefinition;
        valueDefinition = newValueDefinition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_ELEMENT__VALUE_DEFINITION, oldValueDefinition, valueDefinition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasuredCharacteristic getValueMeasurement() {
        return valueMeasurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValueMeasurement(MeasuredCharacteristic newValueMeasurement, NotificationChain msgs) {
        MeasuredCharacteristic oldValueMeasurement = valueMeasurement;
        valueMeasurement = newValueMeasurement;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_ELEMENT__VALUE_MEASUREMENT, oldValueMeasurement, newValueMeasurement);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValueMeasurement(MeasuredCharacteristic newValueMeasurement) {
        if (newValueMeasurement != valueMeasurement) {
            NotificationChain msgs = null;
            if (valueMeasurement != null)
                msgs = ((InternalEObject)valueMeasurement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_ELEMENT__VALUE_MEASUREMENT, null, msgs);
            if (newValueMeasurement != null)
                msgs = ((InternalEObject)newValueMeasurement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VdmlPackage.VALUE_ELEMENT__VALUE_MEASUREMENT, null, msgs);
            msgs = basicSetValueMeasurement(newValueMeasurement, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VdmlPackage.VALUE_ELEMENT__VALUE_MEASUREMENT, newValueMeasurement, newValueMeasurement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MeasuredCharacteristic> getBenchmark() {
        if (benchmark == null) {
            benchmark = new EObjectContainmentEList<MeasuredCharacteristic>(MeasuredCharacteristic.class, this, VdmlPackage.VALUE_ELEMENT__BENCHMARK);
        }
        return benchmark;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case VdmlPackage.VALUE_ELEMENT__VALUE_MEASUREMENT:
                return basicSetValueMeasurement(null, msgs);
            case VdmlPackage.VALUE_ELEMENT__BENCHMARK:
                return ((InternalEList<?>)getBenchmark()).basicRemove(otherEnd, msgs);
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
            case VdmlPackage.VALUE_ELEMENT__VALUE_DEFINITION:
                if (resolve) return getValueDefinition();
                return basicGetValueDefinition();
            case VdmlPackage.VALUE_ELEMENT__VALUE_MEASUREMENT:
                return getValueMeasurement();
            case VdmlPackage.VALUE_ELEMENT__BENCHMARK:
                return getBenchmark();
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
            case VdmlPackage.VALUE_ELEMENT__VALUE_DEFINITION:
                setValueDefinition((ValueDefinition)newValue);
                return;
            case VdmlPackage.VALUE_ELEMENT__VALUE_MEASUREMENT:
                setValueMeasurement((MeasuredCharacteristic)newValue);
                return;
            case VdmlPackage.VALUE_ELEMENT__BENCHMARK:
                getBenchmark().clear();
                getBenchmark().addAll((Collection<? extends MeasuredCharacteristic>)newValue);
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
            case VdmlPackage.VALUE_ELEMENT__VALUE_DEFINITION:
                setValueDefinition((ValueDefinition)null);
                return;
            case VdmlPackage.VALUE_ELEMENT__VALUE_MEASUREMENT:
                setValueMeasurement((MeasuredCharacteristic)null);
                return;
            case VdmlPackage.VALUE_ELEMENT__BENCHMARK:
                getBenchmark().clear();
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
            case VdmlPackage.VALUE_ELEMENT__VALUE_DEFINITION:
                return valueDefinition != null;
            case VdmlPackage.VALUE_ELEMENT__VALUE_MEASUREMENT:
                return valueMeasurement != null;
            case VdmlPackage.VALUE_ELEMENT__BENCHMARK:
                return benchmark != null && !benchmark.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ValueElementImpl
