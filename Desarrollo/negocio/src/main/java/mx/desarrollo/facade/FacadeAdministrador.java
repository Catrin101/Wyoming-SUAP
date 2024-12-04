/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.facade;

import mx.desarrollo.delegate.DelegateAdministrador;
import mx.desarrollo.entidad.Administrador;

public class FacadeAdministrador {
    
    private final DelegateAdministrador delegateAdministrador;

    public FacadeAdministrador() {
        this.delegateAdministrador = new DelegateAdministrador();
    }
    
    /**
     * Método para verificar si el administrador está registrado
     * @param password contraseña del administrador
     * @param nombreAdministrador nombre del administrador
     * @return devuelve un objeto Administrador si se encuentra, null si no
     */
    public Administrador login(String password, String nombreAdministrador) {
        return delegateAdministrador.login(password, nombreAdministrador);
    }
    
    /**
     * Método de ejemplo para guardar un Administrador
     * @param administrador objeto de tipo Administrador con id 0 para que se cree un nuevo id
     */
    public void guardarAdministrador(Administrador administrador) {
        delegateAdministrador.saveAdministrador(administrador);
    }
    
}
