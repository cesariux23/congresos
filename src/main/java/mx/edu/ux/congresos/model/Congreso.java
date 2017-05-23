/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(name = "congreso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Congreso.findAll", query = "SELECT c FROM Congreso c"),
    @NamedQuery(name = "Congreso.findByIdCongreso", query = "SELECT c FROM Congreso c WHERE c.idCongreso = :idCongreso"),
    @NamedQuery(name = "Congreso.findByNombre", query = "SELECT c FROM Congreso c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Congreso.findByDescripcion", query = "SELECT c FROM Congreso c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "Congreso.findByClave", query = "SELECT c FROM Congreso c WHERE c.clave = :clave"),
    @NamedQuery(name = "Congreso.findByNumero", query = "SELECT c FROM Congreso c WHERE c.numero = :numero"),
    @NamedQuery(name = "Congreso.findByEstatus", query = "SELECT c FROM Congreso c WHERE c.estatus = :estatus"),
    @NamedQuery(name = "Congreso.findByFecha", query = "SELECT c FROM Congreso c WHERE c.fecha = :fecha")})
public class Congreso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_congreso")
    private Integer idCongreso;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "clave")
    private String clave;
    @Basic(optional = false)
    @Column(name = "numero")
    private int numero;
    @Basic(optional = false)
    @Column(name = "estatus")
    private boolean estatus;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCongreso")
    private Collection<CategoriaInscripcion> categoriaInscripcionCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "congreso")
    private Mesas mesas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCongreso")
    private Collection<Tema> temaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCongreso")
    private Collection<Aspirante> aspiranteCollection;

    public Congreso() {
    }

    public Congreso(Integer idCongreso) {
        this.idCongreso = idCongreso;
    }

    public Congreso(Integer idCongreso, String nombre, String descripcion, String clave, int numero, boolean estatus, Date fecha) {
        this.idCongreso = idCongreso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.clave = clave;
        this.numero = numero;
        this.estatus = estatus;
        this.fecha = fecha;
    }

    public Integer getIdCongreso() {
        return idCongreso;
    }

    public void setIdCongreso(Integer idCongreso) {
        this.idCongreso = idCongreso;
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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public Collection<CategoriaInscripcion> getCategoriaInscripcionCollection() {
        return categoriaInscripcionCollection;
    }

    public void setCategoriaInscripcionCollection(Collection<CategoriaInscripcion> categoriaInscripcionCollection) {
        this.categoriaInscripcionCollection = categoriaInscripcionCollection;
    }

    public Mesas getMesas() {
        return mesas;
    }

    public void setMesas(Mesas mesas) {
        this.mesas = mesas;
    }

    @XmlTransient
    public Collection<Tema> getTemaCollection() {
        return temaCollection;
    }

    public void setTemaCollection(Collection<Tema> temaCollection) {
        this.temaCollection = temaCollection;
    }

    @XmlTransient
    public Collection<Aspirante> getAspiranteCollection() {
        return aspiranteCollection;
    }

    public void setAspiranteCollection(Collection<Aspirante> aspiranteCollection) {
        this.aspiranteCollection = aspiranteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCongreso != null ? idCongreso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Congreso)) {
            return false;
        }
        Congreso other = (Congreso) object;
        if ((this.idCongreso == null && other.idCongreso != null) || (this.idCongreso != null && !this.idCongreso.equals(other.idCongreso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "congresos2.entity.Congreso[ idCongreso=" + idCongreso + " ]";
    }
    
}
