/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.wyoming.negocio.facade;

import mx.wyoming.negocio.delegate.DelegateUnidadDeAprendizaje;
import mx.wyoming.entidad.UnidadDeAprendizaje;

public class FacadeUnidadDeAprendizaje {
    
    private final DelegateUnidadDeAprendizaje delegateUnidadDeAprendizaje;

    public FacadeUnidadDeAprendizaje() {
        this.delegateUnidadDeAprendizaje = new DelegateUnidadDeAprendizaje();
    }
    
    /**
     * Método para guardar una Unidad de Aprendizaje
     * @param unidadDeAprendizaje objeto de tipo UnidadDeAprendizaje para guardar
     */
    public void guardarUnidadDeAprendizaje(UnidadDeAprendizaje unidadDeAprendizaje) {
        delegateUnidadDeAprendizaje.saveUnidadDeAprendizaje(unidadDeAprendizaje);
    }
    
    /**
     * Método para buscar una Unidad de Aprendizaje por su nombre
     * @param nombreUnidad nombre de la Unidad de Aprendizaje
     * @return la Unidad de Aprendizaje si existe, null si no se encuentra
     */
    public UnidadDeAprendizaje buscarPorNombre(String nombreUnidad) {
        return delegateUnidadDeAprendizaje.findByName(nombreUnidad);
    }
    
}
