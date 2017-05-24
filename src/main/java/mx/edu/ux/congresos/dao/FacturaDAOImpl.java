
package mx.edu.ux.congresos.dao;

import java.util.List;
import mx.edu.ux.congresos.model.Factura;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;


@Repository("facturaDao")
public class FacturaDAOImpl extends AbstractDAO<Integer, Factura> implements FacturaDAO {

	@Override
	public Factura findById(int id) {
		return getByKey(id);
	}

	@Override
	public void saveFactura(Factura factura) {
		
		persist(factura);
	}

	@Override
	public List<Factura> findAllFactura() {
		Criteria criteria = createEntityCriteria();
        return (List<Factura>) criteria.list();
	}
}
