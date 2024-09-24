/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.wyoming.negocio.integracion;

import mx.wyoming.negocio.facade.FacadeAdministrador;
import mx.wyoming.negocio.facade.FacadeUnidadDeAprendizaje;
import mx.wyoming.negocio.facade.FacadeProfesor;

public class ServiceFacadeLocator {
    
    private static FacadeAdministrador facadeAdministrador;
    private static FacadeUnidadDeAprendizaje facadeUnidadDeAprendizaje;
    private static FacadeProfesor facadeProfesor;
    
    // Singleton para FacadeAdministrador
    public static FacadeAdministrador getInstanceFacadeAdministrador() {
        if (facadeAdministrador == null) {
            facadeAdministrador = new FacadeAdministrador();
        }
        return facadeAdministrador;
    }
    
    // Singleton para FacadeUnidadDeAprendizaje
    public static FacadeUnidadDeAprendizaje getInstanceFacadeUnidadDeAprendizaje() {
        if (facadeUnidadDeAprendizaje == null) {
            facadeUnidadDeAprendizaje = new FacadeUnidadDeAprendizaje();
        }
        return facadeUnidadDeAprendizaje;
    }
    
    // Singleton para FacadeProfesor
    public static FacadeProfesor getInstanceFacadeProfesor() {
        if (facadeProfesor == null) {
            facadeProfesor = new FacadeProfesor();
        }
        return facadeProfesor;
    }
}
