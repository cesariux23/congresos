/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.service;

import java.util.List;
import mx.edu.ux.congresos.dao.MesasDAO;
import mx.edu.ux.congresos.model.Mesas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("mesasService")
@Transactional
public class MesasServiceImpl implements MesasService {

    @Autowired
    private MesasDAO dao;

    @Override
    public Mesas findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveMesas(Mesas employee) {
        // TODO Auto-generated method stub
        dao.saveMesas(employee);
    }


    @Override
    public List<Mesas> findAllMesas() {
        return dao.findAllMesas();
    }

}
