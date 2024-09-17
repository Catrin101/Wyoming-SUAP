/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.facade;

import mx.desarrollo.delegate.DelegateProfesor;
import mx.desarrollo.entidad.Profesor;

public class FacadeProfesor {
    
    private final DelegateProfesor delegateProfesor;

    public FacadeProfesor() {
        this.delegateProfesor = new DelegateProfesor();
    }
    
    /**
     * Método para verificar si el profesor está registrado usando el ID y RFC
     * @param idProfesor id del profesor
     * @param rfc RFC del profesor
     * @return devuelve un objeto Profesor si se encuentra, null si no
     */
    public Profesor login(Integer idProfesor, Integer rfc) {
        return delegateProfesor.login(idProfesor, rfc);
    }
    
    /**
     * Método de ejemplo para guardar un Profesor
     * @param profesor objeto de tipo Profesor con id 0 para que se cree un nuevo id
     */
    public void guardarProfesor(Profesor profesor) {
        delegateProfesor.saveProfesor(profesor);
    }
    
}
