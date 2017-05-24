
package mx.edu.ux.congresos.service;

import java.util.List;

import mx.edu.ux.congresos.model.TipoAdministrador;

public interface TipoAdministradorService {
    TipoAdministrador findById(int id);
    
    void saveTipoAdministrador(TipoAdministrador employee);
 
    List findAllTipoAdministrador(); 
}
