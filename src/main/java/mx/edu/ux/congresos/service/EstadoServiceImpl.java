/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.service;

import java.util.List;
import mx.edu.ux.congresos.dao.EstadoDAO;
import mx.edu.ux.congresos.model.Estado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("estadoService")
@Transactional
public class EstadoServiceImpl implements EstadoService {

    @Autowired
    private EstadoDAO dao;

    @Override
    public Estado findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveEstado(Estado employee) {
        // TODO Auto-generated method stub
        dao.saveEstado(employee);
    }


    @Override
    public List<Estado> findAllEstados() {
        return dao.findAllEstados();
    }

}
