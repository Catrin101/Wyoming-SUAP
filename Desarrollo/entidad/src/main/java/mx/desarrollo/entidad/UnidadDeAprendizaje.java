/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "unidad_de_aprendizaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadDeAprendizaje.findAll", query = "SELECT u FROM UnidadDeAprendizaje u"),
    @NamedQuery(name = "UnidadDeAprendizaje.findByIdUnidadAprendizaje", query = "SELECT u FROM UnidadDeAprendizaje u WHERE u.idUnidadAprendizaje = :idUnidadAprendizaje"),
    @NamedQuery(name = "UnidadDeAprendizaje.findByNombreDeLaUnidadAprendisaje", query = "SELECT u FROM UnidadDeAprendizaje u WHERE u.nombreDeLaUnidadAprendisaje = :nombreDeLaUnidadAprendisaje"),
    @NamedQuery(name = "UnidadDeAprendizaje.findByHoraClase", query = "SELECT u FROM UnidadDeAprendizaje u WHERE u.horaClase = :horaClase"),
    @NamedQuery(name = "UnidadDeAprendizaje.findByHoraTaller", query = "SELECT u FROM UnidadDeAprendizaje u WHERE u.horaTaller = :horaTaller"),
    @NamedQuery(name = "UnidadDeAprendizaje.findByHorasLaboratorio", query = "SELECT u FROM UnidadDeAprendizaje u WHERE u.horasLaboratorio = :horasLaboratorio")
})
public class UnidadDeAprendizaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idUnidadAprendizaje")
    private Integer idUnidadAprendizaje;
    @Column(name = "nombreDeLaUnidadAprendisaje")
    private String nombreDeLaUnidadAprendisaje;
    @Column(name = "horaClase")
    private String horaClase;
    @Column(name = "horaTaller")
    private String horaTaller;
    @Column(name = "horasLaboratorio")
    private String horasLaboratorio;

    public UnidadDeAprendizaje() {
    }

    public UnidadDeAprendizaje(Integer idUnidadAprendizaje) {
        this.idUnidadAprendizaje = idUnidadAprendizaje;
    }

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

    public String getHoraClase() {
        return horaClase;
    }

    public void setHoraClase(String horaClase) {
        this.horaClase = horaClase;
    }

    public String getHoraTaller() {
        return horaTaller;
    }

    public void setHoraTaller(String horaTaller) {
        this.horaTaller = horaTaller;
    }

    public String getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(String horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUnidadAprendizaje != null ? idUnidadAprendizaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof UnidadDeAprendizaje)) {
            return false;
        }
        UnidadDeAprendizaje other = (UnidadDeAprendizaje) object;
        if ((this.idUnidadAprendizaje == null && other.idUnidadAprendizaje != null) || (this.idUnidadAprendizaje != null && !this.idUnidadAprendizaje.equals(other.idUnidadAprendizaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.desarrollo.entidad.UnidadDeAprendizaje[ idUnidadAprendizaje=" + idUnidadAprendizaje + " ]";
    }
}
