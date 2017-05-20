/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

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
 * @author cencarnacion
 */
@Entity
@Table(name = "profesion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profesion.findAll", query = "SELECT p FROM Profesion p"),
    @NamedQuery(name = "Profesion.findByIdProfesion", query = "SELECT p FROM Profesion p WHERE p.idProfesion = :idProfesion"),
    @NamedQuery(name = "Profesion.findByNombre", query = "SELECT p FROM Profesion p WHERE p.nombre = :nombre")})
public class Profesion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_profesion")
    private Integer idProfesion;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;

    public Profesion() {
    }

    public Profesion(Integer idProfesion) {
        this.idProfesion = idProfesion;
    }

    public Profesion(Integer idProfesion, String nombre) {
        this.idProfesion = idProfesion;
        this.nombre = nombre;
    }

    public Integer getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(Integer idProfesion) {
        this.idProfesion = idProfesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProfesion != null ? idProfesion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesion)) {
            return false;
        }
        Profesion other = (Profesion) object;
        if ((this.idProfesion == null && other.idProfesion != null) || (this.idProfesion != null && !this.idProfesion.equals(other.idProfesion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Profesion[ idProfesion=" + idProfesion + " ]";
    }
    
}
