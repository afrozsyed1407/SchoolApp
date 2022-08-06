package view.Bean;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;

import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class MainPageBean {
    private RichShowDetailItem dashBoard;
    private RichShowDetailItem staffRecords;
    private RichShowDetailItem staffDetails;
    private RichShowDetailItem studentsRecord;
    private RichShowDetailItem studentDetails;
    private RichShowDetailItem feeRecords;
    private RichShowDetailItem feeCollection;
    private RichShowDetailItem classRecords;
    private RichShowDetailItem attendRecord;
    private RichShowDetailItem takeAttend;
    private RichShowDetailItem ledger;
    private RichShowDetailItem expences;
    private RichShowDetailItem marksEntry;
    private RichShowDetailItem marksRcd;
    private RichShowDetailItem birthDay;

    public MainPageBean() {
    }

    public void setDashBoard(RichShowDetailItem dashBoard) {
        this.dashBoard = dashBoard;
    }

    public RichShowDetailItem getDashBoard() {
        return dashBoard;
    }

    public void setStaffRecords(RichShowDetailItem staffRecords) {
        this.staffRecords = staffRecords;
    }

    public RichShowDetailItem getStaffRecords() {
        return staffRecords;
    }

    public void setStaffDetails(RichShowDetailItem staffDetails) {
        this.staffDetails = staffDetails;
    }

    public RichShowDetailItem getStaffDetails() {
        return staffDetails;
    }

    public void setStudentsRecord(RichShowDetailItem studentsRecord) {
        this.studentsRecord = studentsRecord;
    }

    public RichShowDetailItem getStudentsRecord() {
        return studentsRecord;
    }

    public void setStudentDetails(RichShowDetailItem studentDetails) {
        this.studentDetails = studentDetails;
    }

    public RichShowDetailItem getStudentDetails() {
        return studentDetails;
    }

    public void setFeeRecords(RichShowDetailItem feeRecords) {
        this.feeRecords = feeRecords;
    }

    public RichShowDetailItem getFeeRecords() {
        return feeRecords;
    }

    public void setFeeCollection(RichShowDetailItem feeCollection) {
        this.feeCollection = feeCollection;
    }

    public RichShowDetailItem getFeeCollection() {
        return feeCollection;
    }

    public void setClassRecords(RichShowDetailItem classRecords) {
        this.classRecords = classRecords;
    }

    public RichShowDetailItem getClassRecords() {
        return classRecords;
    }

    public void setAttendRecord(RichShowDetailItem attendRecord) {
        this.attendRecord = attendRecord;
    }

    public RichShowDetailItem getAttendRecord() {
        return attendRecord;
    }

    public void setTakeAttend(RichShowDetailItem takeAttend) {
        this.takeAttend = takeAttend;
    }

    public RichShowDetailItem getTakeAttend() {
        return takeAttend;
    }

    public void setLedger(RichShowDetailItem ledger) {
        this.ledger = ledger;
    }

    public RichShowDetailItem getLedger() {
        return ledger;
    }

    public void setExpences(RichShowDetailItem expences) {
        this.expences = expences;
    }

    public RichShowDetailItem getExpences() {
        return expences;
    }

    public void SettingRenders(int a) {
        getDashBoard().setRendered(false);
        getStaffRecords().setRendered(false);
        getStaffDetails().setRendered(false);
        getStudentsRecord().setRendered(false);
        getStudentDetails().setRendered(false);
        getFeeRecords().setRendered(false);
        getFeeCollection().setRendered(false);
        getClassRecords().setRendered(false);
        getAttendRecord().setRendered(false);
        getTakeAttend().setRendered(false);
        getLedger().setRendered(false);
        getExpences().setRendered(false);
        getMarksEntry().setRendered(false);
        getMarksRcd().setRendered(false);
        getBirthDay().setRendered(false);
        

        switch (a) {
            case 1:
                getDashBoard().setRendered(true);
                break;
            case 2:
                getStaffRecords().setRendered(true);
                break;
            case 3:
                getStaffDetails().setRendered(true);
                break;
            case 4:
                getStudentsRecord().setRendered(true);
                break;
            case 5:
                getStudentDetails().setRendered(true);
                break;
            case 6:
                getFeeRecords().setRendered(true);
                break;
            case 7:
                getFeeCollection().setRendered(true);
                break;
            case 8:
                getClassRecords().setRendered(true);
                break;
            case 9:
                getAttendRecord().setRendered(true);
                break;
            case 10:
                getTakeAttend().setRendered(true);
                break;
            case 11:
                getExpences().setRendered(true);
                break;
            case 12:
                getLedger().setRendered(true);
                break;
            case 13:
                getMarksEntry().setRendered(true);
                break;
            case 14:
                getMarksRcd().setRendered(true);
                break;
            case 15:
                getBirthDay().setRendered(true);
                break;
        }

    }

    public String OpenDashboard() {
        SettingRenders(1);
        return null;
    }

    public String OpenStaffRecords() {
        SettingRenders(2);
        return null;
    }

    public String NewStaff() {
        SettingRenders(3);
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bc = bctx.getCurrentBindingsEntry();
        OperationBinding ob = bc.getOperationBinding("CreateInsert4");
        ob.execute();
        AdfFacesContext adfFacesContext = AdfFacesContext.getCurrentInstance();
        adfFacesContext.addPartialTarget(getStaffDetails());
        return null;
    }

    public String AddNewStudent() {
        SettingRenders(5);
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bc = bctx.getCurrentBindingsEntry();
        OperationBinding ob = bc.getOperationBinding("CreateInsert5");
        ob.execute();
        AdfFacesContext adfFacesContext = AdfFacesContext.getCurrentInstance();
        adfFacesContext.addPartialTarget(getStudentDetails());
        return null;
    }

    public String OpenStudentsRecord() {
        SettingRenders(4);
        return null;
    }

    public String StudAttenRec() {
        SettingRenders(9);
        return null;
    }

    public String TakeStudAtten() {
        SettingRenders(10);
        return null;
    }

    public String OpenFeeRecords() {
        SettingRenders(6);
        return null;
    }

    public String NewFeeCollect() {
        SettingRenders(7);
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bc = bctx.getCurrentBindingsEntry();
        OperationBinding ob = bc.getOperationBinding("CreateInsert1");
        ob.execute();
        AdfFacesContext adfFacesContext = AdfFacesContext.getCurrentInstance();
        adfFacesContext.addPartialTarget(getFeeCollection());
        return null;
    }

    public String ExpenceRecd() {
        SettingRenders(11);
        return null;
    }

    public String LdgerSheet() {
        SettingRenders(12);
        return null;
    }

    public String OpenClassRcd() {
        SettingRenders(8);
        return null;
    }

    public void EditStaffRe(ActionEvent actionEvent) {
        getStaffDetails().setRendered(true);
        getStaffRecords().setRendered(false);
    }

    public void EditStudRec(ActionEvent actionEvent) {
        getStudentDetails().setRendered(true);
        getStudentsRecord().setRendered(false);
    }

    public void setMarksEntry(RichShowDetailItem marksEntry) {
        this.marksEntry = marksEntry;
    }

    public RichShowDetailItem getMarksEntry() {
        return marksEntry;
    }

    public void setMarksRcd(RichShowDetailItem marksRcd) {
        this.marksRcd = marksRcd;
    }

    public RichShowDetailItem getMarksRcd() {
        return marksRcd;
    }

    public String MarksEntry() {
        SettingRenders(13);
        return null;
    }

    public String MarksRecords() {
        SettingRenders(14);
        return null;
    }

    public String BirthDayPage() {
        SettingRenders(15);
        return null;
    }

    public void setBirthDay(RichShowDetailItem birthDay) {
        this.birthDay = birthDay;
    }

    public RichShowDetailItem getBirthDay() {
        return birthDay;
    }
}
