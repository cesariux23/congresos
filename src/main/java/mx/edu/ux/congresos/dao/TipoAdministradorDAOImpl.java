/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.dao;

import java.util.List;
import mx.edu.ux.congresos.model.TipoAdministrador;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;


@Repository("tipoAdministradorDao")
public class TipoAdministradorDAOImpl extends AbstractDAO<Integer, TipoAdministrador> implements TipoAdministradorDAO {

	@Override
	public TipoAdministrador findById(int id) {
		return getByKey(id);
	}

	@Override
	public void saveTipoAdministrador(TipoAdministrador tipoAdministrador) {
		
		persist(tipoAdministrador);
	}

	@Override
	public List<TipoAdministrador> findAllTipoAdministrador() {
		Criteria criteria = createEntityCriteria();
        return (List<TipoAdministrador>) criteria.list();
	}
}
