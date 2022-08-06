package view.Bean;

import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.DialogEvent.Outcome;

import oracle.adf.view.rich.util.FacesMessageUtils;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.event.DisclosureEvent;

public class EmpSalryBean {
    private RichDialog saveSalary;

    public EmpSalryBean() {
    }

    public void setSaveSalary(RichDialog saveSalary) {
        this.saveSalary = saveSalary;
    }

    public RichDialog getSaveSalary() {
        return saveSalary;
    }

    public void SaveIt(ActionEvent actionEvent) {
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bc = bctx.getCurrentBindingsEntry();
        OperationBinding ob = bc.getOperationBinding("Commit");
        ob.execute();
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO,null,null);
        fm.setDetail("Saved Sucessfully");
        FacesContext.getCurrentInstance().addMessage(null,fm);
    }
}
