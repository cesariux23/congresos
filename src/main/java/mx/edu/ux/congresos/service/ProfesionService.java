
package mx.edu.ux.congresos.service;

import java.util.List;

import mx.edu.ux.congresos.model.Profesion;

public interface ProfesionService {
    Profesion findById(int id);
    
    void saveProfesion(Profesion employee);
 
    List findAllProfesion(); 
}
