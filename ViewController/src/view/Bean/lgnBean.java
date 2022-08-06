package view.Bean;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import model_Service.AppModuleImpl;
import model_Service.UserData;

import oracle.adf.share.ADFContext;

import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;

import oracle.jbo.ApplicationModule;
import oracle.jbo.client.Configuration;

public class lgnBean implements Serializable {
    private RichCommandButton loginBtn;
    private RichCommandButton enterBtn;

    public lgnBean() {
    }
    public String UserName;
    public String Password;

    public void SubmitBtn(ActionEvent actionEvent) throws IOException {
        String amDef = "model_Service.AppModule";
        String config = "AppModuleLocal";
        ApplicationModule ami =
            Configuration.createRootApplicationModule(amDef, config);
        AppModuleImpl am = (AppModuleImpl)ami;
        UserData user = am.findUser(UserName, Password);
        if (user != null) {
            this.setUserName(UserName);
            // ADFContext.getCurrent () .getSessionScope () .put ("user", UserName);
            getLoginBtn().setRendered(false);
            getEnterBtn().setRendered(true);
            ADFContext.getCurrent().getSessionScope().put("account",UserName);

            FacesContext ctx = FacesContext.getCurrentInstance();
            ctx.getExternalContext().redirect("Home.jspx");
        } else {
            FacesMessage fm =
                new FacesMessage(FacesMessage.SEVERITY_ERROR, null, null);
            fm.setDetail("Invalid UserName or Password");
            FacesContext.getCurrentInstance().addMessage(null, fm);
            System.out.println("else in bean method exicuted");
            this.setUserName("null");
        }
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPassword() {
        return Password;
    }

    public void setLoginBtn(RichCommandButton loginBtn) {
        this.loginBtn = loginBtn;
    }

    public RichCommandButton getLoginBtn() {
        return loginBtn;
    }

    public void setEnterBtn(RichCommandButton enterBtn) {
        this.enterBtn = enterBtn;
    }

    public RichCommandButton getEnterBtn() {
        return enterBtn;
    }

   
}
