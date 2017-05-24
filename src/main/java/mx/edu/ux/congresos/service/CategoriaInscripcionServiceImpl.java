/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.service;

import java.util.List;
import mx.edu.ux.congresos.dao.CategoriaInscripcionDAO;
import mx.edu.ux.congresos.model.CategoriaInscripcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("categoriaInscripcionService")
@Transactional
public class CategoriaInscripcionServiceImpl implements CategoriaInscripcionService {

    @Autowired
    private CategoriaInscripcionDAO dao;

    @Override
    public CategoriaInscripcion findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveCategoriaInscripcion(CategoriaInscripcion employee) {
        // TODO Auto-generated method stub
        dao.saveCategoriaInscripcion(employee);
    }


    @Override
    public List<CategoriaInscripcion> findAllCategoriaInscripcion() {
        return dao.findAllCategoriaInscripcion();
    }

}
