package mx.wyoming.bean;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import mx.wyoming.dao.AsignacionProfesorDAO;
import mx.wyoming.entidad.Profesor;
import mx.wyoming.entidad.UnidadDeAprendizaje;
import java.util.List;

@ManagedBean
@ViewScoped
public class AsignacionBean {

    @EJB
    private AsignacionProfesorDAO asignacionProfesorDAO;

    private Integer idProfesor;
    private Integer idUnidadAprendizaje;

    private List<Profesor> profesores;
    private List<UnidadDeAprendizaje> unidades;

    @PostConstruct
    public void init() {
        // Llenar las listas de profesores y unidades de aprendizaje
        profesores = asignacionProfesorDAO.obtenerProfesores();
        unidades = asignacionProfesorDAO.obtenerUnidades();
    }

    // Método para asignar un profesor a una unidad de aprendizaje
    public void asignarProfesorUnidad() {
        try {
            asignacionProfesorDAO.asignarProfesorUnidad(idProfesor, idUnidadAprendizaje);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito", "Profesor asignado con éxito"));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "No se pudo realizar la asignación"));
        }
    }

    // Getters y Setters
    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Integer getIdUnidadAprendizaje() {
        return idUnidadAprendizaje;
    }

    public void setIdUnidadAprendizaje(Integer idUnidadAprendizaje) {
        this.idUnidadAprendizaje = idUnidadAprendizaje;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public List<UnidadDeAprendizaje> getUnidades() {
        return unidades;
    }
}
