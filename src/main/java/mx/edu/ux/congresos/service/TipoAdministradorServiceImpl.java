
package mx.edu.ux.congresos.service;

import java.util.List;
import mx.edu.ux.congresos.dao.TipoAdministradorDAO;
import mx.edu.ux.congresos.model.TipoAdministrador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("tipoAdministradorService")
@Transactional
public class TipoAdministradorServiceImpl implements TipoAdministradorService {

    @Autowired
    private TipoAdministradorDAO dao;

    @Override
    public TipoAdministrador findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveTipoAdministrador(TipoAdministrador employee) {
        // TODO Auto-generated method stub
        dao.saveTipoAdministrador(employee);
    }


    @Override
    public List<TipoAdministrador> findAllTipoAdministrador() {
        return dao.findAllTipoAdministrador();
    }

}
