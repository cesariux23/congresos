/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name = "aspirante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aspirante.findAll", query = "SELECT a FROM Aspirante a"),
    @NamedQuery(name = "Aspirante.findByIdAspirante", query = "SELECT a FROM Aspirante a WHERE a.idAspirante = :idAspirante"),
    @NamedQuery(name = "Aspirante.findByClaveAspirante", query = "SELECT a FROM Aspirante a WHERE a.claveAspirante = :claveAspirante"),
    @NamedQuery(name = "Aspirante.findByNombre", query = "SELECT a FROM Aspirante a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Aspirante.findByApellidoPaterno", query = "SELECT a FROM Aspirante a WHERE a.apellidoPaterno = :apellidoPaterno"),
    @NamedQuery(name = "Aspirante.findByApellidoMaterno", query = "SELECT a FROM Aspirante a WHERE a.apellidoMaterno = :apellidoMaterno"),
    @NamedQuery(name = "Aspirante.findByCalle", query = "SELECT a FROM Aspirante a WHERE a.calle = :calle"),
    @NamedQuery(name = "Aspirante.findByNumero", query = "SELECT a FROM Aspirante a WHERE a.numero = :numero"),
    @NamedQuery(name = "Aspirante.findByColonia", query = "SELECT a FROM Aspirante a WHERE a.colonia = :colonia"),
    @NamedQuery(name = "Aspirante.findByCp", query = "SELECT a FROM Aspirante a WHERE a.cp = :cp"),
    @NamedQuery(name = "Aspirante.findByTelefono", query = "SELECT a FROM Aspirante a WHERE a.telefono = :telefono"),
    @NamedQuery(name = "Aspirante.findByCelular", query = "SELECT a FROM Aspirante a WHERE a.celular = :celular"),
    @NamedQuery(name = "Aspirante.findByCorreo", query = "SELECT a FROM Aspirante a WHERE a.correo = :correo"),
    @NamedQuery(name = "Aspirante.findByProcedencia", query = "SELECT a FROM Aspirante a WHERE a.procedencia = :procedencia"),
    @NamedQuery(name = "Aspirante.findByOtros", query = "SELECT a FROM Aspirante a WHERE a.otros = :otros"),
    @NamedQuery(name = "Aspirante.findByConsecutivo", query = "SELECT a FROM Aspirante a WHERE a.consecutivo = :consecutivo"),
    @NamedQuery(name = "Aspirante.findByActivo", query = "SELECT a FROM Aspirante a WHERE a.activo = :activo"),
    @NamedQuery(name = "Aspirante.findByFactura", query = "SELECT a FROM Aspirante a WHERE a.factura = :factura"),
    @NamedQuery(name = "Aspirante.findByPagar", query = "SELECT a FROM Aspirante a WHERE a.pagar = :pagar"),
    @NamedQuery(name = "Aspirante.findByFechaRegistro", query = "SELECT a FROM Aspirante a WHERE a.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "Aspirante.findByIdTema", query = "SELECT a FROM Aspirante a WHERE a.idTema = :idTema"),
    @NamedQuery(name = "Aspirante.findByIdProfesion", query = "SELECT a FROM Aspirante a WHERE a.idProfesion = :idProfesion"),
    @NamedQuery(name = "Aspirante.findByIdMunicipio", query = "SELECT a FROM Aspirante a WHERE a.idMunicipio = :idMunicipio"),
    @NamedQuery(name = "Aspirante.findByIdCategoria", query = "SELECT a FROM Aspirante a WHERE a.idCategoria = :idCategoria"),
    @NamedQuery(name = "Aspirante.findByFolio", query = "SELECT a FROM Aspirante a WHERE a.folio = :folio"),
    @NamedQuery(name = "Aspirante.findByAsistio", query = "SELECT a FROM Aspirante a WHERE a.asistio = :asistio")})
public class Aspirante implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    @Basic(optional = false)
    @Column(name = "id_aspirante")
    private int idAspirante;
    @Id
    @Basic(optional = false)
    @Column(name = "clave_aspirante", unique=true, nullable = false)
    private String claveAspirante;
    @NotEmpty
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @NotEmpty
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @NotEmpty
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private String numero;
    @Column(name = "colonia")
    private String colonia;
    @Column(name = "cp")
    private Integer cp;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "celular")
    private String celular;
    @NotEmpty
    @Email
    @Basic(optional = false)
    @Column(name = "correo")
    private String correo;
    @Column(name = "procedencia")
    private String procedencia;
    @Column(name = "otros")
    private String otros;
    @Column(name = "consecutivo")
    private Integer consecutivo;
    @Basic(optional = false)
    @Column(name = "activo")
    private boolean activo;
    @Column(name = "factura")
    private Boolean factura;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "pagar")
    private BigDecimal pagar;
    @Basic(optional = false)
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Column(name = "id_tema")
    private Integer idTema;
    @Min(1)
    @Basic(optional = false)
    @Column(name = "id_profesion")
    private int idProfesion;
    @Min(1)
    @Basic(optional = false)
    @Column(name = "id_municipio")
    private int idMunicipio;
    @Min(1)
    @Basic(optional = false)
    @Column(name = "id_categoria")
    private int idCategoria;
    @Column(name = "folio")
    private String folio;
    @Column(name = "asistio")
    private Boolean asistio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "claveAspirante")
    private Collection<Factura> facturaCollection;
    @JoinColumn(name = "id_congreso", referencedColumnName = "id_congreso")
    @ManyToOne(optional = false)
    @NotNull
    private Congreso idCongreso;

    public Aspirante() {
    }

    public Aspirante(String claveAspirante) {
        this.claveAspirante = claveAspirante;
    }

    public Aspirante(String claveAspirante, int idAspirante, String nombre, String correo, boolean activo, BigDecimal pagar, Date fechaRegistro, int idProfesion, int idMunicipio, int idCategoria) {
        this.claveAspirante = claveAspirante;
        this.idAspirante = idAspirante;
        this.nombre = nombre;
        this.correo = correo;
        this.activo = activo;
        this.pagar = pagar;
        this.fechaRegistro = fechaRegistro;
        this.idProfesion = idProfesion;
        this.idMunicipio = idMunicipio;
        this.idCategoria = idCategoria;
    }

    public int getIdAspirante() {
        return idAspirante;
    }

    public void setIdAspirante(int idAspirante) {
        this.idAspirante = idAspirante;
    }

    public String getClaveAspirante() {
        return claveAspirante;
    }

    public void setClaveAspirante(String claveAspirante) {
        this.claveAspirante = claveAspirante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public Integer getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Boolean getFactura() {
        return factura;
    }

    public void setFactura(Boolean factura) {
        this.factura = factura;
    }

    public BigDecimal getPagar() {
        return pagar;
    }

    public void setPagar(BigDecimal pagar) {
        this.pagar = pagar;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdTema() {
        return idTema;
    }

    public void setIdTema(Integer idTema) {
        this.idTema = idTema;
    }

    public int getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(int idProfesion) {
        this.idProfesion = idProfesion;
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public Boolean getAsistio() {
        return asistio;
    }

    public void setAsistio(Boolean asistio) {
        this.asistio = asistio;
    }

    @XmlTransient
    public Collection<Factura> getFacturaCollection() {
        return facturaCollection;
    }

    public void setFacturaCollection(Collection<Factura> facturaCollection) {
        this.facturaCollection = facturaCollection;
    }

    public Congreso getIdCongreso() {
        return idCongreso;
    }

    public void setIdCongreso(Congreso idCongreso) {
        this.idCongreso = idCongreso;
    }

    //propiedad para el formulario
    public Integer getEstado(){
        return 30;
    }
    
    public void setEstado(Integer estado){
        //se crea la propiedad virtual
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (claveAspirante != null ? claveAspirante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aspirante)) {
            return false;
        }
        Aspirante other = (Aspirante) object;
        if ((this.claveAspirante == null && other.claveAspirante != null) || (this.claveAspirante != null && !this.claveAspirante.equals(other.claveAspirante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "congresos2.entity.Aspirante[ claveAspirante=" + claveAspirante + " ]";
    }
    
}
