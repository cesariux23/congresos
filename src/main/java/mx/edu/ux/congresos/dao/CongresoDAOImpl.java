/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.dao;

import java.util.List;
import mx.edu.ux.congresos.model.Congreso;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;


@Repository("congresoDao")
public class CongresoDAOImpl extends AbstractDAO<Integer, Congreso> implements CongresoDAO {

	@Override
	public Congreso findById(int id) {
		return getByKey(id);
	}

	@Override
	public void saveCongreso(Congreso congreso) {
		
		persist(congreso);
	}

	@Override
	public List<Congreso> findAllCongresos() {
		Criteria criteria = createEntityCriteria();
        return (List<Congreso>) criteria.list();
	}
}
