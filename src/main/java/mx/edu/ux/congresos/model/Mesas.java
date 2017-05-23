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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "mesas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mesas.findAll", query = "SELECT m FROM Mesas m"),
    @NamedQuery(name = "Mesas.findByIdMesa", query = "SELECT m FROM Mesas m WHERE m.idMesa = :idMesa"),
    @NamedQuery(name = "Mesas.findByNombreMesa", query = "SELECT m FROM Mesas m WHERE m.nombreMesa = :nombreMesa"),
    @NamedQuery(name = "Mesas.findByCantidad", query = "SELECT m FROM Mesas m WHERE m.cantidad = :cantidad"),
    @NamedQuery(name = "Mesas.findByIdCongreso", query = "SELECT m FROM Mesas m WHERE m.idCongreso = :idCongreso")})
public class Mesas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_mesa")
    private Integer idMesa;
    @Column(name = "nombre_mesa")
    private String nombreMesa;
    @Column(name = "cantidad")
    private String cantidad;
    @Column(name = "id_congreso")
    private Integer idCongreso;
    @JoinColumn(name = "id_mesa", referencedColumnName = "id_congreso", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Congreso congreso;

    public Mesas() {
    }

    public Mesas(Integer idMesa) {
        this.idMesa = idMesa;
    }

    public Integer getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }

    public String getNombreMesa() {
        return nombreMesa;
    }

    public void setNombreMesa(String nombreMesa) {
        this.nombreMesa = nombreMesa;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getIdCongreso() {
        return idCongreso;
    }

    public void setIdCongreso(Integer idCongreso) {
        this.idCongreso = idCongreso;
    }

    public Congreso getCongreso() {
        return congreso;
    }

    public void setCongreso(Congreso congreso) {
        this.congreso = congreso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMesa != null ? idMesa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mesas)) {
            return false;
        }
        Mesas other = (Mesas) object;
        if ((this.idMesa == null && other.idMesa != null) || (this.idMesa != null && !this.idMesa.equals(other.idMesa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "congresos2.entity.Mesas[ idMesa=" + idMesa + " ]";
    }
    
}
