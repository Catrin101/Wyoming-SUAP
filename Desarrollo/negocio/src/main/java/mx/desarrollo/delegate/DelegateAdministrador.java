/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.delegate;

import java.util.List;
import mx.desarrollo.entidad.Administrador;
import mx.desarrollo.integracion.ServiceLocator;


public class DelegateAdministrador {

    /**
     * Método para verificar si el administrador está registrado en la base de datos
     * @param password 
     * @param nombreAdministrador
     * @return un tipo administrador; si no encuentra el administrador será null
     */
    public Administrador login(String password, String nombreAdministrador) {
        Administrador administrador = new Administrador();
        List<Administrador> administradores = ServiceLocator.getInstanceAdministradorDAO().findAll();

        for (Administrador admin : administradores) {
            if (admin.getContrasena().equalsIgnoreCase(password) && 
                admin.getNombreAdministrador().equalsIgnoreCase(nombreAdministrador)) {
                administrador = admin;
            }
        }
        return administrador;
    }

    /**
     * Método de ejemplo para guardar Administrador
     * @param administrador de tipo administrador con id 0 para que se cree un id nuevo
     */
    public void saveAdministrador(Administrador administrador) {
        ServiceLocator.getInstanceAdministradorDAO().save(administrador);
    }

}
