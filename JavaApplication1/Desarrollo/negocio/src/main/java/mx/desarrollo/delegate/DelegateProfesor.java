/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.delegate;

import java.util.List;
import mx.desarrollo.entidad.Profesor;
import mx.desarrollo.integracion.ServiceLocator;

/**
 *
 * @author Adaptado por ChatGPT
 */
public class DelegateProfesor {

    /**
     * Método para verificar si el profesor está registrado en la base de datos
     * utilizando el idProfesor y el RFC.
     * @param idProfesor 
     * @param rfc
     * @return un tipo profesor; si no encuentra el profesor será null
     */
    public Profesor login(Integer idProfesor, Integer rfc) {
        Profesor profesor = null;
        List<Profesor> profesores = ServiceLocator.getInstanceProfesorDAO().findAll();

        for (Profesor prof : profesores) {
            if (prof.getIdProfesor().equals(idProfesor) && prof.getRfc().equals(rfc)) {
                profesor = prof;
                break;
            }
        }
        return profesor;
    }

    /**
     * Método de ejemplo para guardar Profesor
     * @param profesor de tipo profesor con id 0 para que se cree un id nuevo
     */
    public void saveProfesor(Profesor profesor) {
        ServiceLocator.getInstanceProfesorDAO().save(profesor);
    }

}
