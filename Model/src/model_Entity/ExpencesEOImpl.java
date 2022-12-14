package model_Entity;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 13 08:24:32 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ExpencesEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        TokenNo {
            public Object get(ExpencesEOImpl obj) {
                return obj.getTokenNo();
            }

            public void put(ExpencesEOImpl obj, Object value) {
                obj.setTokenNo((Number)value);
            }
        }
        ,
        TakenDate {
            public Object get(ExpencesEOImpl obj) {
                return obj.getTakenDate();
            }

            public void put(ExpencesEOImpl obj, Object value) {
                obj.setTakenDate((Date)value);
            }
        }
        ,
        Amount {
            public Object get(ExpencesEOImpl obj) {
                return obj.getAmount();
            }

            public void put(ExpencesEOImpl obj, Object value) {
                obj.setAmount((Number)value);
            }
        }
        ,
        Reason {
            public Object get(ExpencesEOImpl obj) {
                return obj.getReason();
            }

            public void put(ExpencesEOImpl obj, Object value) {
                obj.setReason((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(ExpencesEOImpl object);

        public abstract void put(ExpencesEOImpl object, Object value);

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

    public static final int TOKENNO = AttributesEnum.TokenNo.index();
    public static final int TAKENDATE = AttributesEnum.TakenDate.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int REASON = AttributesEnum.Reason.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ExpencesEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model_Entity.ExpencesEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for TokenNo, using the alias name TokenNo.
     * @return the TokenNo
     */
    public Number getTokenNo() {
        return (Number)getAttributeInternal(TOKENNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for TokenNo.
     * @param value value to set the TokenNo
     */
    public void setTokenNo(Number value) {
        setAttributeInternal(TOKENNO, value);
    }

    /**
     * Gets the attribute value for TakenDate, using the alias name TakenDate.
     * @return the TakenDate
     */
    public Date getTakenDate() {
        return (Date)getAttributeInternal(TAKENDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TakenDate.
     * @param value value to set the TakenDate
     */
    public void setTakenDate(Date value) {
        setAttributeInternal(TAKENDATE, value);
    }

    /**
     * Gets the attribute value for Amount, using the alias name Amount.
     * @return the Amount
     */
    public Number getAmount() {
        return (Number)getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Amount.
     * @param value value to set the Amount
     */
    public void setAmount(Number value) {
        setAttributeInternal(AMOUNT, value);
    }

    /**
     * Gets the attribute value for Reason, using the alias name Reason.
     * @return the Reason
     */
    public String getReason() {
        return (String)getAttributeInternal(REASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for Reason.
     * @param value value to set the Reason
     */
    public void setReason(String value) {
        setAttributeInternal(REASON, value);
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
     * @param tokenNo key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number tokenNo) {
        return new Key(new Object[]{tokenNo});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl se = new SequenceImpl("TOKEN_SEQ",getDBTransaction());
        this.setTokenNo(se.getSequenceNumber());
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
