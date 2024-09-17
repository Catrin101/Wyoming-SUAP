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
@Table(name = "administrador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administrador.findAll", query = "SELECT a FROM Administrador a"),
    @NamedQuery(name = "Administrador.findByIdAdministrador", query = "SELECT a FROM Administrador a WHERE a.idAdministrador = :idAdministrador"),
    @NamedQuery(name = "Administrador.findByNombreAdministrador", query = "SELECT a FROM Administrador a WHERE a.nombreAdministrador = :nombreAdministrador"),
    @NamedQuery(name = "Administrador.findByContrasena", query = "SELECT a FROM Administrador a WHERE a.contrasena = :contrasena")
})
public class Administrador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idAdministrador")
    private Integer idAdministrador;
    @Column(name = "nombreAdministrador")
    private String nombreAdministrador;
    @Column(name = "contrasena")
    private String contrasena;

    public Administrador() {
    }

    public Administrador(Integer idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public Integer getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Integer idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdministrador != null ? idAdministrador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Administrador)) {
            return false;
        }
        Administrador other = (Administrador) object;
        if ((this.idAdministrador == null && other.idAdministrador != null) || (this.idAdministrador != null && !this.idAdministrador.equals(other.idAdministrador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.desarrollo.entidad.Administrador[ idAdministrador=" + idAdministrador + " ]";
    }
}
