package view.Bean;

import java.util.Map;

import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import javax.servlet.http.HttpSession;

public class SkinChanger {
    public SkinChanger() {
    }

    public void ChangeSkin(ValueChangeEvent valueChangeEvent) {
        String skinName = String.valueOf(valueChangeEvent.getNewValue());
        putInSession("skin", skinName);
        refreshPage();
    }

    public String getCurrentSkin() {
        Object skin = getFromSession("skin");
        if (skin == null) {
            putInSession("skin", "mySkin1");
            return "mySkin1";
        }
        return skin.toString();
    }

    public static Object getFromSession(String key) {
        try {
            FacesContext ctx = FacesContext.getCurrentInstance();
            Map sessionState = ctx.getExternalContext().getSessionMap();
            return sessionState.get(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void putInSession(String key, Object object) {
        try {
            FacesContext ctx = FacesContext.getCurrentInstance();
            HttpSession session =
                (HttpSession)ctx.getExternalContext().getSession(true);
            session.setAttribute(key, object);
        } catch (Exception e) {
            System.err.println("storeOnSession -- " + e);
        }
    }

    public static void refreshPage() {
        FacesContext context = FacesContext.getCurrentInstance();
        String currentView = context.getViewRoot().getViewId();
        javax.faces.application.ViewHandler vh =
            context.getApplication().getViewHandler();
        UIViewRoot UIV = vh.createView(context, currentView);
        UIV.setViewId(currentView);
        context.setViewRoot(UIV);
    }
}
