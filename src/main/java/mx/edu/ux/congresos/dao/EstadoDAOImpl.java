/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.dao;

import java.util.List;
import mx.edu.ux.congresos.model.Estado;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;


@Repository("estadoDao")
public class EstadoDAOImpl extends AbstractDAO<Integer, Estado> implements EstadoDAO {

	@Override
	public Estado findById(int id) {
		return getByKey(id);
	}

	@Override
	public void saveEstado(Estado estado) {
		
		persist(estado);
	}

	@Override
	public List<Estado> findAllEstados() {
		Criteria criteria = createEntityCriteria();
        return (List<Estado>) criteria.list();
	}


}
