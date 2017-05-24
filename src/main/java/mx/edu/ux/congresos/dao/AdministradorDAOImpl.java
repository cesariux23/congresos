/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.dao;

import java.util.List;
import mx.edu.ux.congresos.model.Administrador;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;


@Repository("administradorDao")
public class AdministradorDAOImpl extends AbstractDAO<Integer, Administrador> implements AdministradorDAO {

	@Override
	public Administrador findById(int id) {
		return getByKey(id);
	}

	@Override
	public void saveAdministrador(Administrador administrador) {
		
		persist(administrador);
	}

	@Override
	public List<Administrador> findAllAdministrador() {
		Criteria criteria = createEntityCriteria();
        return (List<Administrador>) criteria.list();
	}
}
