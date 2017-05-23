/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.service;

import java.util.List;
import mx.edu.ux.congresos.dao.CongresoDAO;
import mx.edu.ux.congresos.model.Congreso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("congresoService")
@Transactional
public class CongresoServiceImpl implements CongresoService {

    @Autowired
    private CongresoDAO dao;

    @Override
    public Congreso findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveCongreso(Congreso employee) {
        // TODO Auto-generated method stub
        dao.saveCongreso(employee);
    }


    @Override
    public List<Congreso> findAllCongresos() {
        return dao.findAllCongresos();
    }

}
