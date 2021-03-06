package entity;
// Generated 19/05/2017 05:19:01 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TipoAdministrador generated by hbm2java
 */
public class TipoAdministrador  implements java.io.Serializable {


     private int idTipo;
     private String nombre;
     private String descripcion;
     private Set administradors = new HashSet(0);

    public TipoAdministrador() {
    }

	
    public TipoAdministrador(int idTipo, String nombre, String descripcion) {
        this.idTipo = idTipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public TipoAdministrador(int idTipo, String nombre, String descripcion, Set administradors) {
       this.idTipo = idTipo;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.administradors = administradors;
    }
   
    public int getIdTipo() {
        return this.idTipo;
    }
    
    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
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
    public Set getAdministradors() {
        return this.administradors;
    }
    
    public void setAdministradors(Set administradors) {
        this.administradors = administradors;
    }




}


