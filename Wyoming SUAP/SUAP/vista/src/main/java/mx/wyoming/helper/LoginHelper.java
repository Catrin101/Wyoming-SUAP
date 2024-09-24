package mx.wyoming.helper;

import java.io.Serializable;
import mx.wyoming.entidad.Administrador; // Cambiado de Usuario a Administrador
import mx.wyoming.negocio.integracion.ServiceFacadeLocator;

public class LoginHelper implements Serializable {

    /**
     * Método para hacer login de Administrador usando ID y Contraseña.
     * @param nombreAdministrador
     * @param password
     * @return Administrador si las credenciales son correctas, null si no lo son.
     */
    public Administrador loginAdministrador(String nombreAdministrador, String password) {
        return ServiceFacadeLocator.getInstanceFacadeAdministrador().login(nombreAdministrador, password);
    }
}
