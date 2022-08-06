package view.Bean;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class CommonMethodsBean {
    public CommonMethodsBean() {
    }

    public void SaveDetails(ActionEvent actionEvent) {
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding op = bindings.getOperationBinding("Commit");
        op.execute();
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Data Saved Sucessfully..", null));
    }
}
