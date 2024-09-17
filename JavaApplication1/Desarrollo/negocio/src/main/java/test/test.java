/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import mx.desarrollo.entidad.Administrador;
import mx.desarrollo.integracion.ServiceFacadeLocator;

/**
 *
 * @author lukki
 */
public class test {
    public static void main(String[] args) {
        Administrador administrador = new Administrador();
        
        // Simulamos el login para un administrador
        administrador = ServiceFacadeLocator.getInstanceFacadeAdministrador().login("adminPassword123", "admin.email@uabc.edu.mx");
        
        // Verificamos si el login fue exitoso
        if (administrador.getIdAdministrador() != null) {
            System.out.println("Login exitoso con el correo: " + administrador.getIdAdministrador());
        } else {
            System.out.println("No se encontró registro");
        }
    }
}
