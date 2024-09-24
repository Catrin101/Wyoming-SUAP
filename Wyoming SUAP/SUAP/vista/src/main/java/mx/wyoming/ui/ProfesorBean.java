package mx.wyoming.UI;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.util.List;
import mx.wyoming.entidad.Profesor;
import mx.wyoming.dao.ProfesorDAO;

@Named
@RequestScoped
public class ProfesorBean {

    private List<Profesor> profesores;

    private ProfesorDAO profesorDAO = new ProfesorDAO(); // Simulación de DAO; normalmente sería inyectado

    public ProfesorBean() {
        profesores = profesorDAO.obtenerTodos(); // Lógica para obtener los profesores
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    // Métodos como editarProfesor(), borrarProfesor() según el HTML
    public void editarProfesor(int idProfesor) {
        // Lógica de edición
    }

    public void borrarProfesor(int idProfesor) {
        // Lógica de borrado
    }
}
