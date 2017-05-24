
package mx.edu.ux.congresos.dao;

import java.util.List;
import mx.edu.ux.congresos.model.Tema;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;


@Repository("temaDao")
public class TemaDAOImpl extends AbstractDAO<Integer, Tema> implements TemaDAO {

	@Override
	public Tema findById(int id) {
		return getByKey(id);
	}

	@Override
	public void saveTema(Tema tema) {
		
		persist(tema);
	}

	@Override
	public List<Tema> findAllTema() {
		Criteria criteria = createEntityCriteria();
        return (List<Tema>) criteria.list();
	}
}
