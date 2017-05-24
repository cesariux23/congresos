/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.service;

import java.util.List;

import mx.edu.ux.congresos.model.Mesas;

public interface MesasService {
    Mesas findById(int id);
    
    void saveMesas(Mesas employee);
 
    List findAllMesas(); 
}
