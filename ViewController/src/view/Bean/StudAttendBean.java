package view.Bean;

import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.binding.BindingContainer;

import oracle.binding.OperationBinding;

import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.uicli.binding.JUCtrlListBinding;

public class StudAttendBean {
    public StudAttendBean() {
    }

    public void TakeAttendence(ValueChangeEvent valueChangeEvent) {
        //myMap.get()
     //   FacesContext fc =FacesContext.getCurrentInstance();
   //    valueChangeEvent.getComponent().processUpdates(fc);
//       Object val= ADFUtils.fi
       BindingContext bctx = BindingContext.getCurrent();
       BindingContainer bc = bctx.getCurrentBindingsEntry();
       JUCtrlListBinding lst = (JUCtrlListBinding)bc.get("ClassList");
       ViewRowImpl r = (ViewRowImpl)lst.getSelectedValue();
       String s = (String)r.getAttribute("ClassList");
        System.out.println(s);
       // String Cls = (String)valueChangeEvent.getNewValue();
       // BindingContainer bc = BindingContext.getCurrent().getCurrentBindingsEntry();
       // OperationBinding ob = bc.getOperationBinding("takeAttendence");
      //  Map m = ob.getParamsMap();
       // m.put("d", Cls);
       // ob.execute();      
        
    }

    public void GetStudCls(ActionEvent actionEvent) {
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bc = bctx.getCurrentBindingsEntry();
        OperationBinding ob = bc.getOperationBinding("takeAttendence1");
        JUCtrlListBinding lst = (JUCtrlListBinding)bc.get("Class11");
        ViewRowImpl r = (ViewRowImpl)lst.getSelectedValue();
        String s = (String)r.getAttribute("Class1");
        Map m = ob.getParamsMap();
        m.put("d", s);
        ob.execute();
       // Object selected= lst.getSelectedValue();
       // String s = selected.toString();
        //ViewRowImpl r = (ViewRowImpl)lst.getSelectedValue();
       // String s = (String)r.getAttribute("ClassList");
      //  String ss = (String)r.getAttribute("ClsdivId");
       //  System.out.println(selected);
       //  System.out.println(s);
    }
}
