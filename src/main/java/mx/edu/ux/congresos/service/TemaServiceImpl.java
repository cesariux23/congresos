
package mx.edu.ux.congresos.service;

import java.util.List;
import mx.edu.ux.congresos.dao.TemaDAO;
import mx.edu.ux.congresos.model.Tema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("temaService")
@Transactional
public class TemaServiceImpl implements TemaService {

    @Autowired
    private TemaDAO dao;

    @Override
    public Tema findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveTema(Tema employee) {
        // TODO Auto-generated method stub
        dao.saveTema(employee);
    }


    @Override
    public List<Tema> findAllTema() {
        return dao.findAllTema();
    }

}
