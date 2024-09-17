package mx.wyoming.dao;

import mx.wyoming.entidad.Profesor;
import mx.wyoming.entidad.UnidadDeAprendizaje;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import mx.wyoming.entidad.Asignacion;

@Stateless
public class AsignacionProfesorDAO {

    @PersistenceContext
    private EntityManager em;

    // Obtener la lista de profesores desde la base de datos
    public List<Profesor> obtenerProfesores() {
        return em.createNamedQuery("Profesor.findAll", Profesor.class).getResultList();
    }

    // Obtener la lista de unidades de aprendizaje desde la base de datos
    public List<UnidadDeAprendizaje> obtenerUnidades() {
        return em.createNamedQuery("UnidadDeAprendizaje.findAll", UnidadDeAprendizaje.class).getResultList();
    }

    // Asignar un profesor a una unidad de aprendizaje
    public void asignarProfesorUnidad(Integer idProfesor, Integer idUnidadAprendizaje) {
        // Crear una nueva entidad de asignación (si la tienes creada)
        Asignacion asignacion = new Asignacion();
        asignacion.setIdProfesor(idProfesor);
        asignacion.setIdUnidad(idUnidadAprendizaje);

        // Persistir la asignación en la base de datos
        em.persist(asignacion);
    }
}
