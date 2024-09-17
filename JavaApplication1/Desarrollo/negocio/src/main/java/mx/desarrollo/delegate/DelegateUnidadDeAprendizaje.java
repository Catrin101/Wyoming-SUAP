/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.delegate;

import java.util.List;
import mx.desarrollo.entidad.UnidadDeAprendizaje;
import mx.desarrollo.integracion.ServiceLocator;

public class DelegateUnidadDeAprendizaje {

    /**
     * Método para buscar Unidad de Aprendizaje por nombre
     * @param nombreUnidad nombre de la Unidad de Aprendizaje
     * @return la Unidad de Aprendizaje si la encuentra, si no será null
     */
    public UnidadDeAprendizaje findByName(String nombreUnidad) {
        UnidadDeAprendizaje unidadDeAprendizaje = null;
        List<UnidadDeAprendizaje> unidades = ServiceLocator.getInstanceUnidadDeAprendizajeDAO().findAll();

        for (UnidadDeAprendizaje unidad : unidades) {
            if (unidad.getNombreDeLaUnidadAprendisaje().equalsIgnoreCase(nombreUnidad)) {
                unidadDeAprendizaje = unidad;
                break;
            }
        }
        return unidadDeAprendizaje;
    }

    /**
     * Método de ejemplo para guardar Unidad de Aprendizaje
     * @param unidadDeAprendizaje de tipo unidad de aprendizaje con id 0 para que se cree un id nuevo
     */
    public void saveUnidadDeAprendizaje(UnidadDeAprendizaje unidadDeAprendizaje) {
        ServiceLocator.getInstanceUnidadDeAprendizajeDAO().save(unidadDeAprendizaje);
    }

}
