/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(name = "categoria_inscripcion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoriaInscripcion.findAll", query = "SELECT c FROM CategoriaInscripcion c"),
    @NamedQuery(name = "CategoriaInscripcion.findByIdCategoria", query = "SELECT c FROM CategoriaInscripcion c WHERE c.idCategoria = :idCategoria"),
    @NamedQuery(name = "CategoriaInscripcion.findByNombre", query = "SELECT c FROM CategoriaInscripcion c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CategoriaInscripcion.findByDescripcion", query = "SELECT c FROM CategoriaInscripcion c WHERE c.descripcion = :descripcion")})
public class CategoriaInscripcion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_categoria")
    private Integer idCategoria;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "id_congreso", referencedColumnName = "id_congreso")
    @ManyToOne(optional = false)
    private Congreso idCongreso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCategoria")
    private Collection<Costo> costoCollection;

    public CategoriaInscripcion() {
    }

    public CategoriaInscripcion(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public CategoriaInscripcion(Integer idCategoria, String nombre, String descripcion) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
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

    public Congreso getIdCongreso() {
        return idCongreso;
    }

    public void setIdCongreso(Congreso idCongreso) {
        this.idCongreso = idCongreso;
    }

    @XmlTransient
    public Collection<Costo> getCostoCollection() {
        return costoCollection;
    }

    public void setCostoCollection(Collection<Costo> costoCollection) {
        this.costoCollection = costoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCategoria != null ? idCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaInscripcion)) {
            return false;
        }
        CategoriaInscripcion other = (CategoriaInscripcion) object;
        if ((this.idCategoria == null && other.idCategoria != null) || (this.idCategoria != null && !this.idCategoria.equals(other.idCategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "congresos2.entity.CategoriaInscripcion[ idCategoria=" + idCategoria + " ]";
    }
    
}
