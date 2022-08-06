package view.Bean;

import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class ExpenceBean {
    
    public ExpenceBean() {
    }
    private RichPopup r1;

    public String NewExpence() {
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bc = bctx.getCurrentBindingsEntry();
        OperationBinding ob= bc.getOperationBinding("CreateInsert2");
        ob.execute();
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        getR1().show(hints);
        
        return null;
    }

    public void setR1(RichPopup r1) {
        this.r1 = r1;
    }

    public RichPopup getR1() {
        return r1;
    }

    public String OpenStudentsRecord() {
        // Add event code here...
        return null;
    }
}
