package entity;
// Generated 19/05/2017 05:19:01 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Congreso generated by hbm2java
 */
public class Congreso  implements java.io.Serializable {


     private int idCongreso;
     private String nombre;
     private String descripcion;
     private String clave;
     private int numero;
     private boolean estatus;
     private Date fecha;
     private Set aspirantes = new HashSet(0);
     private Set temas = new HashSet(0);
     private Set categoriaInscripcions = new HashSet(0);

    public Congreso() {
    }

	
    public Congreso(int idCongreso, String nombre, String descripcion, String clave, int numero, boolean estatus, Date fecha) {
        this.idCongreso = idCongreso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.clave = clave;
        this.numero = numero;
        this.estatus = estatus;
        this.fecha = fecha;
    }
    public Congreso(int idCongreso, String nombre, String descripcion, String clave, int numero, boolean estatus, Date fecha, Set aspirantes, Set temas, Set categoriaInscripcions) {
       this.idCongreso = idCongreso;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.clave = clave;
       this.numero = numero;
       this.estatus = estatus;
       this.fecha = fecha;
       this.aspirantes = aspirantes;
       this.temas = temas;
       this.categoriaInscripcions = categoriaInscripcions;
    }
   
    public int getIdCongreso() {
        return this.idCongreso;
    }
    
    public void setIdCongreso(int idCongreso) {
        this.idCongreso = idCongreso;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public boolean isEstatus() {
        return this.estatus;
    }
    
    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Set getAspirantes() {
        return this.aspirantes;
    }
    
    public void setAspirantes(Set aspirantes) {
        this.aspirantes = aspirantes;
    }
    public Set getTemas() {
        return this.temas;
    }
    
    public void setTemas(Set temas) {
        this.temas = temas;
    }
    public Set getCategoriaInscripcions() {
        return this.categoriaInscripcions;
    }
    
    public void setCategoriaInscripcions(Set categoriaInscripcions) {
        this.categoriaInscripcions = categoriaInscripcions;
    }




}


