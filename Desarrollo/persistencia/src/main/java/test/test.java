/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import mx.desarrollo.DAO.AdministradorDAO;
import mx.desarrollo.DAO.UnidadDeAprendizajeDAO;
import mx.desarrollo.DAO.ProfesorDAO;
import mx.desarrollo.entidad.Administrador;
import mx.desarrollo.entidad.UnidadDeAprendizaje;
import mx.desarrollo.entidad.Profesor;

/**
 *
 * @author lukki
 */
public class test {
    public static void main(String[] args) {
        // Test para Administrador
        List<Administrador> listaAdministradores = new ArrayList<>();
        AdministradorDAO administradorDao = new AdministradorDAO();
        listaAdministradores = administradorDao.findAll();
        
        System.out.println("Listado de Administradores:");
        for (Administrador admin : listaAdministradores) {
            System.out.println("Nombre: " + admin.getNombreAdministrador());
        }
        
        // Test para Unidad de Aprendizaje
        List<UnidadDeAprendizaje> listaUnidades = new ArrayList<>();
        UnidadDeAprendizajeDAO unidadDeAprendizajeDao = new UnidadDeAprendizajeDAO();
        listaUnidades = unidadDeAprendizajeDao.findAll();
        
        System.out.println("\nListado de Unidades de Aprendizaje:");
        for (UnidadDeAprendizaje ua : listaUnidades) {
            System.out.println("Nombre: " + ua.getNombreDeLaUnidadAprendisaje());
        }

        // Test para Profesor
        List<Profesor> listaProfesores = new ArrayList<>();
        ProfesorDAO profesorDao = new ProfesorDAO();
        listaProfesores = profesorDao.findAll();
        
        System.out.println("\nListado de Profesores:");
        for (Profesor profesor : listaProfesores) {
            System.out.println("Nombre: " + profesor.getNombre());
        }
    }
}
