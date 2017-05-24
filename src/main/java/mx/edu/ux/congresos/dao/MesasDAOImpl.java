/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.dao;

import java.util.List;
import mx.edu.ux.congresos.model.Mesas;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;


@Repository("mesasDao")
public class MesasDAOImpl extends AbstractDAO<Integer, Mesas> implements MesasDAO {

	@Override
	public Mesas findById(int id) {
		return getByKey(id);
	}

	@Override
	public void saveMesas(Mesas mesas) {
		
		persist(mesas);
	}

	@Override
	public List<Mesas> findAllMesas() {
		Criteria criteria = createEntityCriteria();
        return (List<Mesas>) criteria.list();
	}
}
