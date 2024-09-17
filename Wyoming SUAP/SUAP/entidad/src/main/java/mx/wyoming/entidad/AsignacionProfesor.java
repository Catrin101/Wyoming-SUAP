/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.wyoming.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "asignacion_profesor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AsignacionProfesor.findAll", query = "SELECT a FROM AsignacionProfesor a"),
    @NamedQuery(name = "AsignacionProfesor.findByIdAsignacion", query = "SELECT a FROM AsignacionProfesor a WHERE a.idAsignacion = :idAsignacion"),
    @NamedQuery(name = "AsignacionProfesor.findByProfesorAndUnidad", query = "SELECT a FROM AsignacionProfesor a WHERE a.profesor.idProfesor = :idProfesor AND a.unidadDeAprendizaje.idUnidadAprendizaje = :idUnidadAprendizaje")
})
public class AsignacionProfesor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "idAsignacion")
    private Integer idAsignacion;

    @JoinColumn(name = "idProfesor", referencedColumnName = "idProfesor")
    @ManyToOne(optional = false)
    private Profesor profesor;

    @JoinColumn(name = "idUnidadAprendizaje", referencedColumnName = "idUnidadAprendizaje")
    @ManyToOne(optional = false)
    private UnidadDeAprendizaje unidadDeAprendizaje;

    public AsignacionProfesor() {}

    public AsignacionProfesor(Integer idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public Integer getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(Integer idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public UnidadDeAprendizaje getUnidadDeAprendizaje() {
        return unidadDeAprendizaje;
    }

    public void setUnidadDeAprendizaje(UnidadDeAprendizaje unidadDeAprendizaje) {
        this.unidadDeAprendizaje = unidadDeAprendizaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAsignacion != null ? idAsignacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof AsignacionProfesor)) {
            return false;
        }
        AsignacionProfesor other = (AsignacionProfesor) object;
        if ((this.idAsignacion == null && other.idAsignacion != null) || (this.idAsignacion != null && !this.idAsignacion.equals(other.idAsignacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.wyoming.entidad.AsignacionProfesor[ idAsignacion=" + idAsignacion + " ]";
    }
}
