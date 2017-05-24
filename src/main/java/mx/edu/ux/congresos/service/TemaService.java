
package mx.edu.ux.congresos.service;

import java.util.List;

import mx.edu.ux.congresos.model.Tema;

public interface TemaService {
   Tema findById(int id);
    
    void saveTema(Tema employee);
 
    List findAllTema(); 
}
