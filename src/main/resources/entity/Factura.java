/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
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

/**
 *
 * @author cencarnacion
 */
@Entity
@Table(name = "factura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query = "SELECT f FROM Factura f"),
    @NamedQuery(name = "Factura.findByIdFactura", query = "SELECT f FROM Factura f WHERE f.idFactura = :idFactura"),
    @NamedQuery(name = "Factura.findByContribuyente", query = "SELECT f FROM Factura f WHERE f.contribuyente = :contribuyente"),
    @NamedQuery(name = "Factura.findByRfc", query = "SELECT f FROM Factura f WHERE f.rfc = :rfc"),
    @NamedQuery(name = "Factura.findByDomicilioFiscal", query = "SELECT f FROM Factura f WHERE f.domicilioFiscal = :domicilioFiscal"),
    @NamedQuery(name = "Factura.findByColonia", query = "SELECT f FROM Factura f WHERE f.colonia = :colonia"),
    @NamedQuery(name = "Factura.findByCp", query = "SELECT f FROM Factura f WHERE f.cp = :cp"),
    @NamedQuery(name = "Factura.findByPoblacion", query = "SELECT f FROM Factura f WHERE f.poblacion = :poblacion"),
    @NamedQuery(name = "Factura.findByLocalidad", query = "SELECT f FROM Factura f WHERE f.localidad = :localidad"),
    @NamedQuery(name = "Factura.findByTelefono", query = "SELECT f FROM Factura f WHERE f.telefono = :telefono"),
    @NamedQuery(name = "Factura.findByCorreo", query = "SELECT f FROM Factura f WHERE f.correo = :correo"),
    @NamedQuery(name = "Factura.findByNumeroFactura", query = "SELECT f FROM Factura f WHERE f.numeroFactura = :numeroFactura"),
    @NamedQuery(name = "Factura.findByIdEstado", query = "SELECT f FROM Factura f WHERE f.idEstado = :idEstado"),
    @NamedQuery(name = "Factura.findByIdMunicipio", query = "SELECT f FROM Factura f WHERE f.idMunicipio = :idMunicipio"),
    @NamedQuery(name = "Factura.findByFechaSolicitud", query = "SELECT f FROM Factura f WHERE f.fechaSolicitud = :fechaSolicitud")})
public class Factura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_factura")
    private Integer idFactura;
    @Basic(optional = false)
    @Column(name = "contribuyente")
    private String contribuyente;
    @Basic(optional = false)
    @Column(name = "rfc")
    private String rfc;
    @Basic(optional = false)
    @Column(name = "domicilio_fiscal")
    private String domicilioFiscal;
    @Basic(optional = false)
    @Column(name = "colonia")
    private String colonia;
    @Basic(optional = false)
    @Column(name = "cp")
    private int cp;
    @Basic(optional = false)
    @Column(name = "poblacion")
    private String poblacion;
    @Basic(optional = false)
    @Column(name = "localidad")
    private String localidad;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "correo")
    private String correo;
    @Column(name = "numero_factura")
    private String numeroFactura;
    @Basic(optional = false)
    @Column(name = "id_estado")
    private int idEstado;
    @Basic(optional = false)
    @Column(name = "id_municipio")
    private int idMunicipio;
    @Basic(optional = false)
    @Column(name = "fecha_solicitud")
    @Temporal(TemporalType.DATE)
    private Date fechaSolicitud;
    @JoinColumn(name = "clave_aspirante", referencedColumnName = "clave_aspirante")
    @ManyToOne(optional = false)
    private Aspirante claveAspirante;

    public Factura() {
    }

    public Factura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Factura(Integer idFactura, String contribuyente, String rfc, String domicilioFiscal, String colonia, int cp, String poblacion, String localidad, String telefono, String correo, int idEstado, int idMunicipio, Date fechaSolicitud) {
        this.idFactura = idFactura;
        this.contribuyente = contribuyente;
        this.rfc = rfc;
        this.domicilioFiscal = domicilioFiscal;
        this.colonia = colonia;
        this.cp = cp;
        this.poblacion = poblacion;
        this.localidad = localidad;
        this.telefono = telefono;
        this.correo = correo;
        this.idEstado = idEstado;
        this.idMunicipio = idMunicipio;
        this.fechaSolicitud = fechaSolicitud;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public String getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(String contribuyente) {
        this.contribuyente = contribuyente;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDomicilioFiscal() {
        return domicilioFiscal;
    }

    public void setDomicilioFiscal(String domicilioFiscal) {
        this.domicilioFiscal = domicilioFiscal;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Aspirante getClaveAspirante() {
        return claveAspirante;
    }

    public void setClaveAspirante(Aspirante claveAspirante) {
        this.claveAspirante = claveAspirante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFactura != null ? idFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.idFactura == null && other.idFactura != null) || (this.idFactura != null && !this.idFactura.equals(other.idFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Factura[ idFactura=" + idFactura + " ]";
    }
    
}
