/**
 */
package org.pavanecce.vdml.metamodel.vdml.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.cmmn1.TDefinitions;
import org.eclipse.cmmn1.util.ImportHelper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.pavanecce.vdml.metamodel.vdml.util.VdmlResourceFactoryImpl
 * @generated
 */
public class VdmlResourceImpl extends XMLResourceImpl {
    private static Set<EClass> referrables = new HashSet<EClass>();
    static {
        referrables.add(VdmlPackage.eINSTANCE.getCapabilityMethod());
        referrables.add(VdmlPackage.eINSTANCE.getRole());
    }
    /**
     * Creates an instance of the resource.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param uri the URI of the new resource.
     * @generated
     */
    public VdmlResourceImpl(URI uri) {
        super(uri);
    }
    protected XMLSave createXMLSave() {
        prepareSave();
        return super.createXMLSave();
    }
    protected void prepareSave() {
        EObject cur;
        TDefinitions thisDefinitions = ImportHelper.getDefinitions(this);
        for (Iterator<EObject> iter = getAllContents(); iter.hasNext();) {
            cur = iter.next();
            setIdIfNotSet(cur);
        }
    }
    protected static void setIdIfNotSet(EObject obj) {
        if (obj.eClass() != null && referrables.contains(obj.eClass())) {
            EStructuralFeature idAttr = obj.eClass().getEIDAttribute();
            if (idAttr != null && !obj.eIsSet(idAttr)) {
                obj.eSet(idAttr, EcoreUtil.generateUUID());
            }
        }else{
            EStructuralFeature idAttr = obj.eClass().getEIDAttribute();
            if (idAttr != null && !obj.eIsSet(idAttr)) {
                obj.eSet(idAttr, null);
            }
        }
    }

} //VdmlResourceImpl