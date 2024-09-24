package mx.wyoming.UI;

import mx.wyoming.entidad.UnidadDeAprendizaje;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class UnidadAprendizajeBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idUnidadAprendizaje;
    private String nombreDeLaUnidadAprendisaje;
    private Integer horaClase;
    private Integer horaTaller;
    private Integer horasLaboratorio;

    private EntityManagerFactory emf;

    public UnidadAprendizajeBean() {
        emf = Persistence.createEntityManagerFactory("nombre_de_tu_unidad_de_persistencia"); // Actualiza con el nombre correcto
    }

    // Getters y Setters
    public Integer getIdUnidadAprendizaje() {
        return idUnidadAprendizaje;
    }

    public void setIdUnidadAprendizaje(Integer idUnidadAprendizaje) {
        this.idUnidadAprendizaje = idUnidadAprendizaje;
    }

    public String getNombreDeLaUnidadAprendisaje() {
        return nombreDeLaUnidadAprendisaje;
    }

    public void setNombreDeLaUnidadAprendisaje(String nombreDeLaUnidadAprendisaje) {
        this.nombreDeLaUnidadAprendisaje = nombreDeLaUnidadAprendisaje;
    }

    public Integer getHoraClase() {
        return horaClase;
    }

    public void setHoraClase(Integer horaClase) {
        this.horaClase = horaClase;
    }

    public Integer getHoraTaller() {
        return horaTaller;
    }

    public void setHoraTaller(Integer horaTaller) {
        this.horaTaller = horaTaller;
    }

    public Integer getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(Integer horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }

    // Método para guardar la unidad de aprendizaje en la base de datos
    public void guardar() {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            UnidadDeAprendizaje unidad = new UnidadDeAprendizaje();
            unidad.setIdUnidadAprendizaje(idUnidadAprendizaje);
            unidad.setNombreDeLaUnidadAprendisaje(nombreDeLaUnidadAprendisaje);
            unidad.setHoraClase(horaClase);
            unidad.setHoraTaller(horaTaller);
            unidad.setHorasLaboratorio(horasLaboratorio);

            // Persistir la entidad en la base de datos
            em.persist(unidad);
            em.getTransaction().commit();

            // Mostrar mensaje de éxito
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito", "Unidad de Aprendizaje guardada correctamente");
            FacesContext.getCurrentInstance().addMessage(null, msg);

        } catch (Exception e) {
            em.getTransaction().rollback();
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "No se pudo guardar la Unidad de Aprendizaje");
            FacesContext.getCurrentInstance().addMessage(null, msg);
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
