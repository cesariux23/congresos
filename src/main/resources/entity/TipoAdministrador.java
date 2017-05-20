/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author cencarnacion
 */
@Entity
@Table(name = "tipo_administrador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoAdministrador.findAll", query = "SELECT t FROM TipoAdministrador t"),
    @NamedQuery(name = "TipoAdministrador.findByIdTipo", query = "SELECT t FROM TipoAdministrador t WHERE t.idTipo = :idTipo"),
    @NamedQuery(name = "TipoAdministrador.findByNombre", query = "SELECT t FROM TipoAdministrador t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TipoAdministrador.findByDescripcion", query = "SELECT t FROM TipoAdministrador t WHERE t.descripcion = :descripcion")})
public class TipoAdministrador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tipo")
    private Integer idTipo;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipo")
    private Collection<Administrador> administradorCollection;

    public TipoAdministrador() {
    }

    public TipoAdministrador(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public TipoAdministrador(Integer idTipo, String nombre, String descripcion) {
        this.idTipo = idTipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<Administrador> getAdministradorCollection() {
        return administradorCollection;
    }

    public void setAdministradorCollection(Collection<Administrador> administradorCollection) {
        this.administradorCollection = administradorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipo != null ? idTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoAdministrador)) {
            return false;
        }
        TipoAdministrador other = (TipoAdministrador) object;
        if ((this.idTipo == null && other.idTipo != null) || (this.idTipo != null && !this.idTipo.equals(other.idTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TipoAdministrador[ idTipo=" + idTipo + " ]";
    }
    
}
