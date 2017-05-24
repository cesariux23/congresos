
package mx.edu.ux.congresos.dao;

import java.util.List;
import mx.edu.ux.congresos.model.TipoAdministrador;

public interface TipoAdministradorDAO {
    TipoAdministrador findById(int id);
    
    void saveTipoAdministrador(TipoAdministrador employee);
 
    List findAllTipoAdministrador(); 
}
