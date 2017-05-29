/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.dao;

import java.util.List;

import mx.edu.ux.congresos.model.Municipio;

public interface MunicipioDAO {
    Municipio findById(int id);
    
    void saveMunicipio(Municipio municipio);
    
    List findAllMunicipio(); 
}
