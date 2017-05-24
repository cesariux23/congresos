
package mx.edu.ux.congresos.dao;

import java.util.List;
import mx.edu.ux.congresos.model.Costo;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;


@Repository("costoDao")
public class CostoDAOImpl extends AbstractDAO<Integer, Costo> implements CostoDAO {

	@Override
	public Costo findById(int id) {
		return getByKey(id);
	}

	@Override
	public void saveCosto(Costo costo) {
		
		persist(costo);
	}

	@Override
	public List<Costo> findAllCosto() {
		Criteria criteria = createEntityCriteria();
        return (List<Costo>) criteria.list();
	}
}
