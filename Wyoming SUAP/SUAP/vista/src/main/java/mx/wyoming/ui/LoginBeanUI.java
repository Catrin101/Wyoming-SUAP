package mx.wyoming.UI;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named
@SessionScoped
public class LoginBeanUI implements Serializable {

    private String username;
    private String password;

    // Getters y setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Método de login
    public String login() {
        if ("admin".equals(username) && "admin123".equals(password)) {
            return "Principal.xhtml?faces-redirect=true"; // Redirige al menú principal
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuario o contraseña incorrectos", ""));
            return null; // Mantiene en la página de login
        }
    }
}
