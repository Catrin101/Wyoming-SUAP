package mx.wyoming.UI;

import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import mx.wyoming.entidad.Administrador; // Cambiado de Usuario a Administrador
import mx.wyoming.helper.LoginHelper;

@ManagedBean(name = "loginUI")
@SessionScoped
public class LoginBeanUI implements Serializable {
    private LoginHelper loginHelper;
    private String adminNom; // nombre del Administrador
    private String adminPassword; // Contraseña del Administrador

    public LoginBeanUI() {
        loginHelper = new LoginHelper();
    }

    @PostConstruct
    public void init() {
        // Inicializamos si es necesario
    }

    public void login() throws IOException {
        String appURL = "/principal.xhtml"; // Cambiado de /index.xhtml a /principal.xhtml
        
        // Inicia sesión solo con Administrador
        Administrador admin = loginHelper.loginAdministrador(adminNom, adminPassword);
        
        if (admin != null) {
            // Si el login es exitoso, redirigir al sistema
            FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() + appURL);
        } else {
            // Si falló, mostrar mensaje de error
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuario o contraseña incorrecta:", "Intente de nuevo"));
        }
    }

    /* Getters y Setters */

    public String getAdminNom() {
        return adminNom;
    }

    public void setAdminNom(String adminNom) {
        this.adminNom = adminNom;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
