/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.service;

import java.util.List;
import mx.edu.ux.congresos.model.Aspirante;

/**
 *
 * @author cencarnacion
 */
public interface AspiranteService {
    Aspirante findById(int id);
    
    void saveAspirante(Aspirante aspirante);
    
    void updateAspirante(Aspirante aspirante);
 
    List findAllAspirantes(); 
    
    void deleteAspiranteByClaveAspirante(String clave);
 
    Aspirante findAspiranteByClaveAspirante(String clave);
    
}
