
package mx.edu.ux.congresos.service;

import java.util.List;
import mx.edu.ux.congresos.dao.ProfesionDAO;
import mx.edu.ux.congresos.model.Profesion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("profesionService")
@Transactional
public class ProfesionServiceImpl implements ProfesionService {

    @Autowired
    private ProfesionDAO dao;

    @Override
    public Profesion findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveProfesion(Profesion employee) {
        // TODO Auto-generated method stub
        dao.saveProfesion(employee);
    }


    @Override
    public List<Profesion> findAllProfesion() {
        return dao.findAllProfesion();
    }

}
