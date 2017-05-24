/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.dao;

import java.util.List;
import mx.edu.ux.congresos.model.Administrador;

public interface AdministradorDAO {
    Administrador findById(int id);
    
    void saveAdministrador(Administrador employee);
 
    List findAllAdministrador(); 
}
