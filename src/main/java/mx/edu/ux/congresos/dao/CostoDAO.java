
package mx.edu.ux.congresos.dao;

import java.util.List;
import mx.edu.ux.congresos.model.Costo;

public interface CostoDAO {
   Costo findById(int id);
    
    void saveCosto(Costo employee);
 
    List findAllCosto(); 
}
