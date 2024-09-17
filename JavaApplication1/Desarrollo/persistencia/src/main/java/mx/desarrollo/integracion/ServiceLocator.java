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
package mx.desarrollo.integracion;

import mx.desarrollo.DAO.AdministradorDAO;
import mx.desarrollo.DAO.UnidadDeAprendizajeDAO;
import mx.desarrollo.DAO.ProfesorDAO;

/**
 *
 * @author total
 */
public class ServiceLocator {
    
    private static AdministradorDAO administradorDAO;
    private static UnidadDeAprendizajeDAO unidadDeAprendizajeDAO;
    private static ProfesorDAO profesorDAO;
    
    /**
     * Se crea la instancia de AdministradorDAO si no existe.
     */
    public static AdministradorDAO getInstanceAdministradorDAO() {
        if (administradorDAO == null) {
            administradorDAO = new AdministradorDAO();
        }
        return administradorDAO;
    }

    /**
     * Se crea la instancia de UnidadDeAprendizajeDAO si no existe.
     */
    public static UnidadDeAprendizajeDAO getInstanceUnidadDeAprendizajeDAO() {
        if (unidadDeAprendizajeDAO == null) {
            unidadDeAprendizajeDAO = new UnidadDeAprendizajeDAO();
        }
        return unidadDeAprendizajeDAO;
    }

    /**
     * Se crea la instancia de ProfesorDAO si no existe.
     */
    public static ProfesorDAO getInstanceProfesorDAO() {
        if (profesorDAO == null) {
            profesorDAO = new ProfesorDAO();
        }
        return profesorDAO;
    }
}
