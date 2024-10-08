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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eivet
 */
@Entity
@Table(name = "unidad_de_aprendizaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadDeAprendizaje.findAll", query = "SELECT u FROM UnidadDeAprendizaje u")
    , @NamedQuery(name = "UnidadDeAprendizaje.findByIdUnidadAprendizaje", query = "SELECT u FROM UnidadDeAprendizaje u WHERE u.idUnidadAprendizaje = :idUnidadAprendizaje")
    , @NamedQuery(name = "UnidadDeAprendizaje.findByNombreDeLaUnidadAprendisaje", query = "SELECT u FROM UnidadDeAprendizaje u WHERE u.nombreDeLaUnidadAprendisaje = :nombreDeLaUnidadAprendisaje")
    , @NamedQuery(name = "UnidadDeAprendizaje.findByHoraClase", query = "SELECT u FROM UnidadDeAprendizaje u WHERE u.horaClase = :horaClase")
    , @NamedQuery(name = "UnidadDeAprendizaje.findByHoraTaller", query = "SELECT u FROM UnidadDeAprendizaje u WHERE u.horaTaller = :horaTaller")
    , @NamedQuery(name = "UnidadDeAprendizaje.findByHorasLaboratorio", query = "SELECT u FROM UnidadDeAprendizaje u WHERE u.horasLaboratorio = :horasLaboratorio")})
public class UnidadDeAprendizaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idUnidadAprendizaje")
    private Integer idUnidadAprendizaje;
    @Column(name = "nombreDeLaUnidadAprendisaje")
    private String nombreDeLaUnidadAprendisaje;
    @Column(name = "horaClase")
    private Integer horaClase;
    @Column(name = "horaTaller")
    private Integer horaTaller;
    @Column(name = "horasLaboratorio")
    private Integer horasLaboratorio;

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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUnidadAprendizaje != null ? idUnidadAprendizaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
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
        return "mx.wyoming.entidad.UnidadDeAprendizaje[ idUnidadAprendizaje=" + idUnidadAprendizaje + " ]";
    }
    
}
