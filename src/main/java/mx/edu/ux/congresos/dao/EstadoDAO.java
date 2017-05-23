/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.dao;

import java.util.List;
import mx.edu.ux.congresos.model.Estado;

public interface EstadoDAO {
    Estado findById(int id);
    
    void saveEstado(Estado employee);
 
    List findAllEstados(); 
}
