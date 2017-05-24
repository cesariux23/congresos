
package mx.edu.ux.congresos.dao;

import java.util.List;
import mx.edu.ux.congresos.model.Tema;

public interface TemaDAO {
    Tema findById(int id);
    
    void saveTema(Tema employee);
 
    List findAllTema(); 
}
