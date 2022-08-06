package model_Entity;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 13 08:28:11 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TeacherClassEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        TechclassId {
            public Object get(TeacherClassEOImpl obj) {
                return obj.getTechclassId();
            }

            public void put(TeacherClassEOImpl obj, Object value) {
                obj.setTechclassId((String)value);
            }
        }
        ,
        StaffId {
            public Object get(TeacherClassEOImpl obj) {
                return obj.getStaffId();
            }

            public void put(TeacherClassEOImpl obj, Object value) {
                obj.setStaffId((Number)value);
            }
        }
        ,
        ClsdivId {
            public Object get(TeacherClassEOImpl obj) {
                return obj.getClsdivId();
            }

            public void put(TeacherClassEOImpl obj, Object value) {
                obj.setClsdivId((String)value);
            }
        }
        ,
        SubId {
            public Object get(TeacherClassEOImpl obj) {
                return obj.getSubId();
            }

            public void put(TeacherClassEOImpl obj, Object value) {
                obj.setSubId((String)value);
            }
        }
        ,
        ClassDivEO {
            public Object get(TeacherClassEOImpl obj) {
                return obj.getClassDivEO();
            }

            public void put(TeacherClassEOImpl obj, Object value) {
                obj.setClassDivEO((EntityImpl)value);
            }
        }
        ,
        StaffEO {
            public Object get(TeacherClassEOImpl obj) {
                return obj.getStaffEO();
            }

            public void put(TeacherClassEOImpl obj, Object value) {
                obj.setStaffEO((StaffEOImpl)value);
            }
        }
        ,
        SubjectEO {
            public Object get(TeacherClassEOImpl obj) {
                return obj.getSubjectEO();
            }

            public void put(TeacherClassEOImpl obj, Object value) {
                obj.setSubjectEO((EntityImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(TeacherClassEOImpl object);

        public abstract void put(TeacherClassEOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int TECHCLASSID = AttributesEnum.TechclassId.index();
    public static final int STAFFID = AttributesEnum.StaffId.index();
    public static final int CLSDIVID = AttributesEnum.ClsdivId.index();
    public static final int SUBID = AttributesEnum.SubId.index();
    public static final int CLASSDIVEO = AttributesEnum.ClassDivEO.index();
    public static final int STAFFEO = AttributesEnum.StaffEO.index();
    public static final int SUBJECTEO = AttributesEnum.SubjectEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TeacherClassEOImpl() {
    }

    /**
     * Gets the attribute value for TechclassId, using the alias name TechclassId.
     * @return the TechclassId
     */
    public String getTechclassId() {
        return (String)getAttributeInternal(TECHCLASSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TechclassId.
     * @param value value to set the TechclassId
     */
    public void setTechclassId(String value) {
        setAttributeInternal(TECHCLASSID, value);
    }

    /**
     * Gets the attribute value for StaffId, using the alias name StaffId.
     * @return the StaffId
     */
    public Number getStaffId() {
        return (Number)getAttributeInternal(STAFFID);
    }

    /**
     * Sets <code>value</code> as the attribute value for StaffId.
     * @param value value to set the StaffId
     */
    public void setStaffId(Number value) {
        setAttributeInternal(STAFFID, value);
    }

    /**
     * Gets the attribute value for ClsdivId, using the alias name ClsdivId.
     * @return the ClsdivId
     */
    public String getClsdivId() {
        return (String)getAttributeInternal(CLSDIVID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ClsdivId.
     * @param value value to set the ClsdivId
     */
    public void setClsdivId(String value) {
        setAttributeInternal(CLSDIVID, value);
    }

    /**
     * Gets the attribute value for SubId, using the alias name SubId.
     * @return the SubId
     */
    public String getSubId() {
        return (String)getAttributeInternal(SUBID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SubId.
     * @param value value to set the SubId
     */
    public void setSubId(String value) {
        setAttributeInternal(SUBID, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getClassDivEO() {
        return (EntityImpl)getAttributeInternal(CLASSDIVEO);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setClassDivEO(EntityImpl value) {
        setAttributeInternal(CLASSDIVEO, value);
    }

    /**
     * @return the associated entity StaffEOImpl.
     */
    public StaffEOImpl getStaffEO() {
        return (StaffEOImpl)getAttributeInternal(STAFFEO);
    }

    /**
     * Sets <code>value</code> as the associated entity StaffEOImpl.
     */
    public void setStaffEO(StaffEOImpl value) {
        setAttributeInternal(STAFFEO, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getSubjectEO() {
        return (EntityImpl)getAttributeInternal(SUBJECTEO);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setSubjectEO(EntityImpl value) {
        setAttributeInternal(SUBJECTEO, value);
    }

    /**
     * @param techclassId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String techclassId) {
        return new Key(new Object[]{techclassId});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model_Entity.TeacherClassEO");
        }
        return mDefinitionObject;
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl se = new SequenceImpl("CLSTECH_SEQ",getDBTransaction());
        this.setTechclassId(se.getSequenceNumber().toString());
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}