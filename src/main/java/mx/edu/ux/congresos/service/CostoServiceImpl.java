
package mx.edu.ux.congresos.service;

import java.util.List;
import mx.edu.ux.congresos.dao.CostoDAO;
import mx.edu.ux.congresos.model.Costo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("costoService")
@Transactional
public class CostoServiceImpl implements CostoService {

    @Autowired
    private CostoDAO dao;

    @Override
    public Costo findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveCosto(Costo employee) {
        // TODO Auto-generated method stub
        dao.saveCosto(employee);
    }


    @Override
    public List<Costo> findAllCosto() {
        return dao.findAllCosto();
    }

}
