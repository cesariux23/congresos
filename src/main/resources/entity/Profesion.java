package entity;
// Generated 19/05/2017 05:19:01 PM by Hibernate Tools 4.3.1



/**
 * Profesion generated by hbm2java
 */
public class Profesion  implements java.io.Serializable {


     private int idProfesion;
     private String nombre;

    public Profesion() {
    }

    public Profesion(int idProfesion, String nombre) {
       this.idProfesion = idProfesion;
       this.nombre = nombre;
    }
   
    public int getIdProfesion() {
        return this.idProfesion;
    }
    
    public void setIdProfesion(int idProfesion) {
        this.idProfesion = idProfesion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}

