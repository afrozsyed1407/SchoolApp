package view.Bean;

import java.io.Serializable;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import weblogic.servlet.security.ServletAuthentication;

public class LogOutBean implements Serializable {
    public LogOutBean() {
    }
    public String user;

    public String LogoutAction(ActionEvent actionEvent) {
        FacesContext fctx = FacesContext.getCurrentInstance();  
             ExternalContext ectx = fctx.getExternalContext();  
             String url = ectx.getRequestContextPath() + "/adfAuthentication?logout=true&end_url=/faces/login.jspx";  
               
             HttpSession session = (HttpSession)ectx.getSession(false);  
             session.invalidate();  
               
             HttpServletRequest request = (HttpServletRequest)ectx.getRequest();  
             ServletAuthentication.logout(request);  
             ServletAuthentication.invalidateAll(request);  
             ServletAuthentication.killCookie(request);  
               
             try{  
               ectx.redirect(url);  
             }  
             catch(Exception e){  
               e.printStackTrace();  
             }  
             fctx.responseComplete();  
               
             return null; 
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }
}
