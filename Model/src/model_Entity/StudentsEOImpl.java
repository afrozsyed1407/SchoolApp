package model_Entity;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 13 08:27:19 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class StudentsEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        StudentId {
            public Object get(StudentsEOImpl obj) {
                return obj.getStudentId();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setStudentId((Number)value);
            }
        }
        ,
        StuddentName {
            public Object get(StudentsEOImpl obj) {
                return obj.getStuddentName();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setStuddentName((String)value);
            }
        }
        ,
        FatherName {
            public Object get(StudentsEOImpl obj) {
                return obj.getFatherName();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setFatherName((String)value);
            }
        }
        ,
        MotherName {
            public Object get(StudentsEOImpl obj) {
                return obj.getMotherName();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setMotherName((String)value);
            }
        }
        ,
        Dateofbirth {
            public Object get(StudentsEOImpl obj) {
                return obj.getDateofbirth();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setDateofbirth((Date)value);
            }
        }
        ,
        Gender {
            public Object get(StudentsEOImpl obj) {
                return obj.getGender();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setGender((String)value);
            }
        }
        ,
        Aadhar {
            public Object get(StudentsEOImpl obj) {
                return obj.getAadhar();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setAadhar((Number)value);
            }
        }
        ,
        Mobile {
            public Object get(StudentsEOImpl obj) {
                return obj.getMobile();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setMobile((Number)value);
            }
        }
        ,
        Email {
            public Object get(StudentsEOImpl obj) {
                return obj.getEmail();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setEmail((String)value);
            }
        }
        ,
        Caste {
            public Object get(StudentsEOImpl obj) {
                return obj.getCaste();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setCaste((String)value);
            }
        }
        ,
        Religion {
            public Object get(StudentsEOImpl obj) {
                return obj.getReligion();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setReligion((String)value);
            }
        }
        ,
        MotherTongue {
            public Object get(StudentsEOImpl obj) {
                return obj.getMotherTongue();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setMotherTongue((String)value);
            }
        }
        ,
        Disability {
            public Object get(StudentsEOImpl obj) {
                return obj.getDisability();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setDisability((String)value);
            }
        }
        ,
        Address {
            public Object get(StudentsEOImpl obj) {
                return obj.getAddress();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setAddress((String)value);
            }
        }
        ,
        DateOfAdmission {
            public Object get(StudentsEOImpl obj) {
                return obj.getDateOfAdmission();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setDateOfAdmission((Date)value);
            }
        }
        ,
        Fee {
            public Object get(StudentsEOImpl obj) {
                return obj.getFee();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setFee((Number)value);
            }
        }
        ,
        Photo {
            public Object get(StudentsEOImpl obj) {
                return obj.getPhoto();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setPhoto((BlobDomain)value);
            }
        }
        ,
        PreviousSchool {
            public Object get(StudentsEOImpl obj) {
                return obj.getPreviousSchool();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setPreviousSchool((String)value);
            }
        }
        ,
        ClsdivId {
            public Object get(StudentsEOImpl obj) {
                return obj.getClsdivId();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setClsdivId((String)value);
            }
        }
        ,
        Nationality {
            public Object get(StudentsEOImpl obj) {
                return obj.getNationality();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setNationality((String)value);
            }
        }
        ,
        FatherOccupation {
            public Object get(StudentsEOImpl obj) {
                return obj.getFatherOccupation();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setFatherOccupation((String)value);
            }
        }
        ,
        FatherAadhar {
            public Object get(StudentsEOImpl obj) {
                return obj.getFatherAadhar();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setFatherAadhar((Number)value);
            }
        }
        ,
        FatherIncome {
            public Object get(StudentsEOImpl obj) {
                return obj.getFatherIncome();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setFatherIncome((Number)value);
            }
        }
        ,
        MotherOccupation {
            public Object get(StudentsEOImpl obj) {
                return obj.getMotherOccupation();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setMotherOccupation((String)value);
            }
        }
        ,
        MotherAadhar {
            public Object get(StudentsEOImpl obj) {
                return obj.getMotherAadhar();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setMotherAadhar((Number)value);
            }
        }
        ,
        MotherIncome {
            public Object get(StudentsEOImpl obj) {
                return obj.getMotherIncome();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setMotherIncome((String)value);
            }
        }
        ,
        TcNumber {
            public Object get(StudentsEOImpl obj) {
                return obj.getTcNumber();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setTcNumber((String)value);
            }
        }
        ,
        FirstLanguage {
            public Object get(StudentsEOImpl obj) {
                return obj.getFirstLanguage();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setFirstLanguage((String)value);
            }
        }
        ,
        SecondLanguage {
            public Object get(StudentsEOImpl obj) {
                return obj.getSecondLanguage();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setSecondLanguage((String)value);
            }
        }
        ,
        IdentificationMarks {
            public Object get(StudentsEOImpl obj) {
                return obj.getIdentificationMarks();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setIdentificationMarks((String)value);
            }
        }
        ,
        Subcaste {
            public Object get(StudentsEOImpl obj) {
                return obj.getSubcaste();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setSubcaste((String)value);
            }
        }
        ,
        FeesEO {
            public Object get(StudentsEOImpl obj) {
                return obj.getFeesEO();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        AttendenceEO {
            public Object get(StudentsEOImpl obj) {
                return obj.getAttendenceEO();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ClassDivEO {
            public Object get(StudentsEOImpl obj) {
                return obj.getClassDivEO();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setClassDivEO((EntityImpl)value);
            }
        }
        ,
        StudentsMarksEO {
            public Object get(StudentsEOImpl obj) {
                return obj.getStudentsMarksEO();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        NewStudentsMarksEO {
            public Object get(StudentsEOImpl obj) {
                return obj.getNewStudentsMarksEO();
            }

            public void put(StudentsEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(StudentsEOImpl object);

        public abstract void put(StudentsEOImpl object, Object value);

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


    public static final int STUDENTID = AttributesEnum.StudentId.index();
    public static final int STUDDENTNAME = AttributesEnum.StuddentName.index();
    public static final int FATHERNAME = AttributesEnum.FatherName.index();
    public static final int MOTHERNAME = AttributesEnum.MotherName.index();
    public static final int DATEOFBIRTH = AttributesEnum.Dateofbirth.index();
    public static final int GENDER = AttributesEnum.Gender.index();
    public static final int AADHAR = AttributesEnum.Aadhar.index();
    public static final int MOBILE = AttributesEnum.Mobile.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int CASTE = AttributesEnum.Caste.index();
    public static final int RELIGION = AttributesEnum.Religion.index();
    public static final int MOTHERTONGUE = AttributesEnum.MotherTongue.index();
    public static final int DISABILITY = AttributesEnum.Disability.index();
    public static final int ADDRESS = AttributesEnum.Address.index();
    public static final int DATEOFADMISSION = AttributesEnum.DateOfAdmission.index();
    public static final int FEE = AttributesEnum.Fee.index();
    public static final int PHOTO = AttributesEnum.Photo.index();
    public static final int PREVIOUSSCHOOL = AttributesEnum.PreviousSchool.index();
    public static final int CLSDIVID = AttributesEnum.ClsdivId.index();
    public static final int NATIONALITY = AttributesEnum.Nationality.index();
    public static final int FATHEROCCUPATION = AttributesEnum.FatherOccupation.index();
    public static final int FATHERAADHAR = AttributesEnum.FatherAadhar.index();
    public static final int FATHERINCOME = AttributesEnum.FatherIncome.index();
    public static final int MOTHEROCCUPATION = AttributesEnum.MotherOccupation.index();
    public static final int MOTHERAADHAR = AttributesEnum.MotherAadhar.index();
    public static final int MOTHERINCOME = AttributesEnum.MotherIncome.index();
    public static final int TCNUMBER = AttributesEnum.TcNumber.index();
    public static final int FIRSTLANGUAGE = AttributesEnum.FirstLanguage.index();
    public static final int SECONDLANGUAGE = AttributesEnum.SecondLanguage.index();
    public static final int IDENTIFICATIONMARKS = AttributesEnum.IdentificationMarks.index();
    public static final int SUBCASTE = AttributesEnum.Subcaste.index();
    public static final int FEESEO = AttributesEnum.FeesEO.index();
    public static final int ATTENDENCEEO = AttributesEnum.AttendenceEO.index();
    public static final int CLASSDIVEO = AttributesEnum.ClassDivEO.index();
    public static final int STUDENTSMARKSEO = AttributesEnum.StudentsMarksEO.index();
    public static final int NEWSTUDENTSMARKSEO = AttributesEnum.NewStudentsMarksEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public StudentsEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model_Entity.StudentsEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for StudentId, using the alias name StudentId.
     * @return the StudentId
     */
    public Number getStudentId() {
        return (Number)getAttributeInternal(STUDENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for StudentId.
     * @param value value to set the StudentId
     */
    public void setStudentId(Number value) {
        setAttributeInternal(STUDENTID, value);
    }

    /**
     * Gets the attribute value for StuddentName, using the alias name StuddentName.
     * @return the StuddentName
     */
    public String getStuddentName() {
        return (String)getAttributeInternal(STUDDENTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for StuddentName.
     * @param value value to set the StuddentName
     */
    public void setStuddentName(String value) {
        setAttributeInternal(STUDDENTNAME, value);
    }

    /**
     * Gets the attribute value for FatherName, using the alias name FatherName.
     * @return the FatherName
     */
    public String getFatherName() {
        return (String)getAttributeInternal(FATHERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FatherName.
     * @param value value to set the FatherName
     */
    public void setFatherName(String value) {
        setAttributeInternal(FATHERNAME, value);
    }

    /**
     * Gets the attribute value for MotherName, using the alias name MotherName.
     * @return the MotherName
     */
    public String getMotherName() {
        return (String)getAttributeInternal(MOTHERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for MotherName.
     * @param value value to set the MotherName
     */
    public void setMotherName(String value) {
        setAttributeInternal(MOTHERNAME, value);
    }

    /**
     * Gets the attribute value for Dateofbirth, using the alias name Dateofbirth.
     * @return the Dateofbirth
     */
    public Date getDateofbirth() {
        return (Date)getAttributeInternal(DATEOFBIRTH);
    }

    /**
     * Sets <code>value</code> as the attribute value for Dateofbirth.
     * @param value value to set the Dateofbirth
     */
    public void setDateofbirth(Date value) {
        setAttributeInternal(DATEOFBIRTH, value);
    }

    /**
     * Gets the attribute value for Gender, using the alias name Gender.
     * @return the Gender
     */
    public String getGender() {
        return (String)getAttributeInternal(GENDER);
    }

    /**
     * Sets <code>value</code> as the attribute value for Gender.
     * @param value value to set the Gender
     */
    public void setGender(String value) {
        setAttributeInternal(GENDER, value);
    }

    /**
     * Gets the attribute value for Aadhar, using the alias name Aadhar.
     * @return the Aadhar
     */
    public Number getAadhar() {
        return (Number)getAttributeInternal(AADHAR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Aadhar.
     * @param value value to set the Aadhar
     */
    public void setAadhar(Number value) {
        setAttributeInternal(AADHAR, value);
    }

    /**
     * Gets the attribute value for Mobile, using the alias name Mobile.
     * @return the Mobile
     */
    public Number getMobile() {
        return (Number)getAttributeInternal(MOBILE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Mobile.
     * @param value value to set the Mobile
     */
    public void setMobile(Number value) {
        setAttributeInternal(MOBILE, value);
    }

    /**
     * Gets the attribute value for Email, using the alias name Email.
     * @return the Email
     */
    public String getEmail() {
        return (String)getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Email.
     * @param value value to set the Email
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for Caste, using the alias name Caste.
     * @return the Caste
     */
    public String getCaste() {
        return (String)getAttributeInternal(CASTE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Caste.
     * @param value value to set the Caste
     */
    public void setCaste(String value) {
        setAttributeInternal(CASTE, value);
    }

    /**
     * Gets the attribute value for Religion, using the alias name Religion.
     * @return the Religion
     */
    public String getReligion() {
        return (String)getAttributeInternal(RELIGION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Religion.
     * @param value value to set the Religion
     */
    public void setReligion(String value) {
        setAttributeInternal(RELIGION, value);
    }

    /**
     * Gets the attribute value for MotherTongue, using the alias name MotherTongue.
     * @return the MotherTongue
     */
    public String getMotherTongue() {
        return (String)getAttributeInternal(MOTHERTONGUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for MotherTongue.
     * @param value value to set the MotherTongue
     */
    public void setMotherTongue(String value) {
        setAttributeInternal(MOTHERTONGUE, value);
    }

    /**
     * Gets the attribute value for Disability, using the alias name Disability.
     * @return the Disability
     */
    public String getDisability() {
        return (String)getAttributeInternal(DISABILITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Disability.
     * @param value value to set the Disability
     */
    public void setDisability(String value) {
        setAttributeInternal(DISABILITY, value);
    }

    /**
     * Gets the attribute value for Address, using the alias name Address.
     * @return the Address
     */
    public String getAddress() {
        return (String)getAttributeInternal(ADDRESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Address.
     * @param value value to set the Address
     */
    public void setAddress(String value) {
        setAttributeInternal(ADDRESS, value);
    }

    /**
     * Gets the attribute value for DateOfAdmission, using the alias name DateOfAdmission.
     * @return the DateOfAdmission
     */
    public Date getDateOfAdmission() {
        return (Date)getAttributeInternal(DATEOFADMISSION);
    }

    /**
     * Sets <code>value</code> as the attribute value for DateOfAdmission.
     * @param value value to set the DateOfAdmission
     */
    public void setDateOfAdmission(Date value) {
        setAttributeInternal(DATEOFADMISSION, value);
    }

    /**
     * Gets the attribute value for Fee, using the alias name Fee.
     * @return the Fee
     */
    public Number getFee() {
        return (Number)getAttributeInternal(FEE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Fee.
     * @param value value to set the Fee
     */
    public void setFee(Number value) {
        setAttributeInternal(FEE, value);
    }

    /**
     * Gets the attribute value for Photo, using the alias name Photo.
     * @return the Photo
     */
    public BlobDomain getPhoto() {
        return (BlobDomain)getAttributeInternal(PHOTO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Photo.
     * @param value value to set the Photo
     */
    public void setPhoto(BlobDomain value) {
        setAttributeInternal(PHOTO, value);
    }

    /**
     * Gets the attribute value for PreviousSchool, using the alias name PreviousSchool.
     * @return the PreviousSchool
     */
    public String getPreviousSchool() {
        return (String)getAttributeInternal(PREVIOUSSCHOOL);
    }

    /**
     * Sets <code>value</code> as the attribute value for PreviousSchool.
     * @param value value to set the PreviousSchool
     */
    public void setPreviousSchool(String value) {
        setAttributeInternal(PREVIOUSSCHOOL, value);
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
     * Gets the attribute value for Nationality, using the alias name Nationality.
     * @return the Nationality
     */
    public String getNationality() {
        return (String)getAttributeInternal(NATIONALITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nationality.
     * @param value value to set the Nationality
     */
    public void setNationality(String value) {
        setAttributeInternal(NATIONALITY, value);
    }

    /**
     * Gets the attribute value for FatherOccupation, using the alias name FatherOccupation.
     * @return the FatherOccupation
     */
    public String getFatherOccupation() {
        return (String)getAttributeInternal(FATHEROCCUPATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for FatherOccupation.
     * @param value value to set the FatherOccupation
     */
    public void setFatherOccupation(String value) {
        setAttributeInternal(FATHEROCCUPATION, value);
    }

    /**
     * Gets the attribute value for FatherAadhar, using the alias name FatherAadhar.
     * @return the FatherAadhar
     */
    public Number getFatherAadhar() {
        return (Number)getAttributeInternal(FATHERAADHAR);
    }

    /**
     * Sets <code>value</code> as the attribute value for FatherAadhar.
     * @param value value to set the FatherAadhar
     */
    public void setFatherAadhar(Number value) {
        setAttributeInternal(FATHERAADHAR, value);
    }

    /**
     * Gets the attribute value for FatherIncome, using the alias name FatherIncome.
     * @return the FatherIncome
     */
    public Number getFatherIncome() {
        return (Number)getAttributeInternal(FATHERINCOME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FatherIncome.
     * @param value value to set the FatherIncome
     */
    public void setFatherIncome(Number value) {
        setAttributeInternal(FATHERINCOME, value);
    }

    /**
     * Gets the attribute value for MotherOccupation, using the alias name MotherOccupation.
     * @return the MotherOccupation
     */
    public String getMotherOccupation() {
        return (String)getAttributeInternal(MOTHEROCCUPATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for MotherOccupation.
     * @param value value to set the MotherOccupation
     */
    public void setMotherOccupation(String value) {
        setAttributeInternal(MOTHEROCCUPATION, value);
    }

    /**
     * Gets the attribute value for MotherAadhar, using the alias name MotherAadhar.
     * @return the MotherAadhar
     */
    public Number getMotherAadhar() {
        return (Number)getAttributeInternal(MOTHERAADHAR);
    }

    /**
     * Sets <code>value</code> as the attribute value for MotherAadhar.
     * @param value value to set the MotherAadhar
     */
    public void setMotherAadhar(Number value) {
        setAttributeInternal(MOTHERAADHAR, value);
    }

    /**
     * Gets the attribute value for MotherIncome, using the alias name MotherIncome.
     * @return the MotherIncome
     */
    public String getMotherIncome() {
        return (String)getAttributeInternal(MOTHERINCOME);
    }

    /**
     * Sets <code>value</code> as the attribute value for MotherIncome.
     * @param value value to set the MotherIncome
     */
    public void setMotherIncome(String value) {
        setAttributeInternal(MOTHERINCOME, value);
    }

    /**
     * Gets the attribute value for TcNumber, using the alias name TcNumber.
     * @return the TcNumber
     */
    public String getTcNumber() {
        return (String)getAttributeInternal(TCNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for TcNumber.
     * @param value value to set the TcNumber
     */
    public void setTcNumber(String value) {
        setAttributeInternal(TCNUMBER, value);
    }

    /**
     * Gets the attribute value for FirstLanguage, using the alias name FirstLanguage.
     * @return the FirstLanguage
     */
    public String getFirstLanguage() {
        return (String)getAttributeInternal(FIRSTLANGUAGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FirstLanguage.
     * @param value value to set the FirstLanguage
     */
    public void setFirstLanguage(String value) {
        setAttributeInternal(FIRSTLANGUAGE, value);
    }

    /**
     * Gets the attribute value for SecondLanguage, using the alias name SecondLanguage.
     * @return the SecondLanguage
     */
    public String getSecondLanguage() {
        return (String)getAttributeInternal(SECONDLANGUAGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SecondLanguage.
     * @param value value to set the SecondLanguage
     */
    public void setSecondLanguage(String value) {
        setAttributeInternal(SECONDLANGUAGE, value);
    }

    /**
     * Gets the attribute value for IdentificationMarks, using the alias name IdentificationMarks.
     * @return the IdentificationMarks
     */
    public String getIdentificationMarks() {
        return (String)getAttributeInternal(IDENTIFICATIONMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for IdentificationMarks.
     * @param value value to set the IdentificationMarks
     */
    public void setIdentificationMarks(String value) {
        setAttributeInternal(IDENTIFICATIONMARKS, value);
    }

    /**
     * Gets the attribute value for Subcaste, using the alias name Subcaste.
     * @return the Subcaste
     */
    public String getSubcaste() {
        return (String)getAttributeInternal(SUBCASTE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Subcaste.
     * @param value value to set the Subcaste
     */
    public void setSubcaste(String value) {
        setAttributeInternal(SUBCASTE, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getFeesEO() {
        return (RowIterator)getAttributeInternal(FEESEO);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getAttendenceEO() {
        return (RowIterator)getAttributeInternal(ATTENDENCEEO);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getStudentsMarksEO() {
        return (RowIterator)getAttributeInternal(STUDENTSMARKSEO);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getNewStudentsMarksEO() {
        return (RowIterator)getAttributeInternal(NEWSTUDENTSMARKSEO);
    }


    /**
     * @param studentId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number studentId) {
        return new Key(new Object[]{studentId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl se = new SequenceImpl("STUD_SEQ",getDBTransaction());
        this.setStudentId(se.getSequenceNumber());
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
