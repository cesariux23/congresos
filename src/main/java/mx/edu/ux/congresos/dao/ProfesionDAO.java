
package mx.edu.ux.congresos.dao;

import java.util.List;
import mx.edu.ux.congresos.model.Profesion;

public interface ProfesionDAO {
   Profesion findById(int id);
    
    void saveProfesion(Profesion employee);
 
    List findAllProfesion(); 
}
