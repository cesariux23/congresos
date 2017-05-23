/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.service;

import java.util.List;
import mx.edu.ux.congresos.dao.AspiranteDAO;
import mx.edu.ux.congresos.model.Aspirante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("aspiranteService")
@Transactional
public class AspiranteServiceImpl implements AspiranteService {

    @Autowired
    private AspiranteDAO dao;

    @Override
    public Aspirante findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveAspirante(Aspirante aspirante) {
        // TODO Auto-generated method stub
        dao.saveAspirante(aspirante);
    }


    @Override
    public List<Aspirante> findAllAspirantes() {
        return dao.findAllAspirantes();
    }

    public void deleteAspiranteByClaveAspirante(String clave) {
        dao.deleteAspiranteByClaveAspirante(clave);
    }

    public Aspirante findAspiranteByClaveAspirante(String clave) {
        return dao.findAspiranteByClaveAspirante(clave);
    }

    public void updateAspirante(Aspirante aspirante) {
        Aspirante entity = dao.findById(aspirante.getIdAspirante());
        if(entity!=null){
            entity.setNombre(aspirante.getNombre());
        }
    }
}