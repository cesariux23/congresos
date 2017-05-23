/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "costo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Costo.findAll", query = "SELECT c FROM Costo c"),
    @NamedQuery(name = "Costo.findByIdCosto", query = "SELECT c FROM Costo c WHERE c.idCosto = :idCosto"),
    @NamedQuery(name = "Costo.findByDescripcion", query = "SELECT c FROM Costo c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "Costo.findByFechaAntes", query = "SELECT c FROM Costo c WHERE c.fechaAntes = :fechaAntes"),
    @NamedQuery(name = "Costo.findByFechaDespues", query = "SELECT c FROM Costo c WHERE c.fechaDespues = :fechaDespues"),
    @NamedQuery(name = "Costo.findByCantidadAntes", query = "SELECT c FROM Costo c WHERE c.cantidadAntes = :cantidadAntes"),
    @NamedQuery(name = "Costo.findByCantidadDespues", query = "SELECT c FROM Costo c WHERE c.cantidadDespues = :cantidadDespues")})
public class Costo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_costo")
    private Integer idCosto;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "fecha_antes")
    @Temporal(TemporalType.DATE)
    private Date fechaAntes;
    @Basic(optional = false)
    @Column(name = "fecha_despues")
    @Temporal(TemporalType.DATE)
    private Date fechaDespues;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "cantidad_antes")
    private BigDecimal cantidadAntes;
    @Basic(optional = false)
    @Column(name = "cantidad_despues")
    private BigDecimal cantidadDespues;
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    @ManyToOne(optional = false)
    private CategoriaInscripcion idCategoria;

    public Costo() {
    }

    public Costo(Integer idCosto) {
        this.idCosto = idCosto;
    }

    public Costo(Integer idCosto, String descripcion, Date fechaAntes, Date fechaDespues, BigDecimal cantidadAntes, BigDecimal cantidadDespues) {
        this.idCosto = idCosto;
        this.descripcion = descripcion;
        this.fechaAntes = fechaAntes;
        this.fechaDespues = fechaDespues;
        this.cantidadAntes = cantidadAntes;
        this.cantidadDespues = cantidadDespues;
    }

    public Integer getIdCosto() {
        return idCosto;
    }

    public void setIdCosto(Integer idCosto) {
        this.idCosto = idCosto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaAntes() {
        return fechaAntes;
    }

    public void setFechaAntes(Date fechaAntes) {
        this.fechaAntes = fechaAntes;
    }

    public Date getFechaDespues() {
        return fechaDespues;
    }

    public void setFechaDespues(Date fechaDespues) {
        this.fechaDespues = fechaDespues;
    }

    public BigDecimal getCantidadAntes() {
        return cantidadAntes;
    }

    public void setCantidadAntes(BigDecimal cantidadAntes) {
        this.cantidadAntes = cantidadAntes;
    }

    public BigDecimal getCantidadDespues() {
        return cantidadDespues;
    }

    public void setCantidadDespues(BigDecimal cantidadDespues) {
        this.cantidadDespues = cantidadDespues;
    }

    public CategoriaInscripcion getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(CategoriaInscripcion idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCosto != null ? idCosto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Costo)) {
            return false;
        }
        Costo other = (Costo) object;
        if ((this.idCosto == null && other.idCosto != null) || (this.idCosto != null && !this.idCosto.equals(other.idCosto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "congresos2.entity.Costo[ idCosto=" + idCosto + " ]";
    }
    
}
