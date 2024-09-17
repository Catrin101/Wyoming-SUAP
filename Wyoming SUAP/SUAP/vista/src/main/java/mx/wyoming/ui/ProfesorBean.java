/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.wyoming.UI;

import mx.wyoming.entidad.Profesor;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Bean para manejar las acciones de alta de profesores.
 */
@ManagedBean(name = "profesorBean")
@RequestScoped
public class ProfesorBean {

    private Integer id;
    private String nombre;
    private String apellidos;
    private String rfc;

    // Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    // Método para guardar un nuevo profesor
    public void guardar() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tuUnidadDePersistencia");  // Cambia 'tuUnidadDePersistencia' por el nombre correcto de tu unidad de persistencia.
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            // Crear un nuevo profesor y asignar los valores del formulario
            Profesor profesor = new Profesor();
            profesor.setIdProfesor(id);
            profesor.setNombre(nombre);
            profesor.setApellido(apellidos);
            profesor.setRfc(rfc);

            // Persistir el profesor en la base de datos
            em.persist(profesor);
            em.getTransaction().commit();

            // Mensaje de éxito
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Profesor guardado con éxito"));

        } catch (Exception e) {
            em.getTransaction().rollback();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al guardar el profesor", e.getMessage()));
        } finally {
            em.close();
            emf.close();
        }
    }
}
