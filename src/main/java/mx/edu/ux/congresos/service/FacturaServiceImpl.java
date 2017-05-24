
package mx.edu.ux.congresos.service;

import java.util.List;
import mx.edu.ux.congresos.dao.FacturaDAO;
import mx.edu.ux.congresos.model.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("facturaService")
@Transactional
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaDAO dao;

    @Override
    public Factura findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveFactura(Factura employee) {
        // TODO Auto-generated method stub
        dao.saveFactura(employee);
    }


    @Override
    public List<Factura> findAllFactura() {
        return dao.findAllFactura();
    }

}
