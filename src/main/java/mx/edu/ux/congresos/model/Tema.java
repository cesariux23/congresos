/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.model;

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
@Table(name = "tema")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tema.findAll", query = "SELECT t FROM Tema t"),
    @NamedQuery(name = "Tema.findByIdTema", query = "SELECT t FROM Tema t WHERE t.idTema = :idTema"),
    @NamedQuery(name = "Tema.findByNombre", query = "SELECT t FROM Tema t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tema.findByDescripcion", query = "SELECT t FROM Tema t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "Tema.findByCupo", query = "SELECT t FROM Tema t WHERE t.cupo = :cupo"),
    @NamedQuery(name = "Tema.findByActivo", query = "SELECT t FROM Tema t WHERE t.activo = :activo")})
public class Tema implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tema")
    private Integer idTema;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "cupo")
    private Integer cupo;
    @Basic(optional = false)
    @Column(name = "activo")
    private boolean activo;
    @JoinColumn(name = "id_congreso", referencedColumnName = "id_congreso")
    @ManyToOne(optional = false)
    private Congreso idCongreso;

    public Tema() {
    }

    public Tema(Integer idTema) {
        this.idTema = idTema;
    }

    public Tema(Integer idTema, String nombre, String descripcion, boolean activo) {
        this.idTema = idTema;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Integer getIdTema() {
        return idTema;
    }

    public void setIdTema(Integer idTema) {
        this.idTema = idTema;
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

    public Integer getCupo() {
        return cupo;
    }

    public void setCupo(Integer cupo) {
        this.cupo = cupo;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Congreso getIdCongreso() {
        return idCongreso;
    }

    public void setIdCongreso(Congreso idCongreso) {
        this.idCongreso = idCongreso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTema != null ? idTema.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tema)) {
            return false;
        }
        Tema other = (Tema) object;
        if ((this.idTema == null && other.idTema != null) || (this.idTema != null && !this.idTema.equals(other.idTema))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "congresos2.entity.Tema[ idTema=" + idTema + " ]";
    }
    
}
