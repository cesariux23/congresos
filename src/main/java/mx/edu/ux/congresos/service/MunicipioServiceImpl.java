/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.service;

import java.util.List;
import mx.edu.ux.congresos.dao.MunicipioDAO;
import mx.edu.ux.congresos.model.Estado;
import mx.edu.ux.congresos.model.Municipio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("municipioService")
@Transactional
public class MunicipioServiceImpl implements MunicipioService {

    @Autowired
    private MunicipioDAO dao;

    @Override
    public Municipio findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveMunicipio(Municipio employee) {
        // TODO Auto-generated method stub
        dao.saveMunicipio(employee);
    }


    @Override
    public List<Municipio> findAllMunicipio() {
        return dao.findAllMunicipio();
    }

    public List findByEstado(Estado estado) {
        return dao.findByEstado(estado);
    }

}
