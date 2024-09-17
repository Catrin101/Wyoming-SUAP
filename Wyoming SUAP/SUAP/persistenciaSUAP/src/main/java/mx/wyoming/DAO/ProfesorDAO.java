package mx.wyoming.dao;

import mx.wyoming.entidad.Profesor;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ProfesorDAO {

    @PersistenceContext
    private EntityManager em;

    public List<Profesor> obtenerTodos() {
        return em.createQuery("SELECT p FROM Profesor p", Profesor.class).getResultList();
    }
}
