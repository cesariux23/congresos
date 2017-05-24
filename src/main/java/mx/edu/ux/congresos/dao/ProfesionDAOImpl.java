
package mx.edu.ux.congresos.dao;

import java.util.List;
import mx.edu.ux.congresos.model.Profesion;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;


@Repository("profesionDao")
public class ProfesionDAOImpl extends AbstractDAO<Integer, Profesion> implements ProfesionDAO {

	@Override
	public Profesion findById(int id) {
		return getByKey(id);
	}

	@Override
	public void saveProfesion(Profesion profesion) {
		
		persist(profesion);
	}

	@Override
	public List<Profesion> findAllProfesion() {
		Criteria criteria = createEntityCriteria();
        return (List<Profesion>) criteria.list();
	}
}
