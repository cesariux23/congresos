
package mx.edu.ux.congresos.service;

import java.util.List;

import mx.edu.ux.congresos.model.Costo;

public interface CostoService {
    Costo findById(int id);
    
    void saveCosto(Costo employee);
 
    List findAllCosto(); 
}
