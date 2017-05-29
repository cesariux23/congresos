/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.dao;

import java.util.List;
import mx.edu.ux.congresos.model.Aspirante;
import mx.edu.ux.congresos.model.Estado;
import mx.edu.ux.congresos.model.Municipio;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;


@Repository("municipioDao")
public class MunicipioDAOImpl extends AbstractDAO<Integer, Municipio> implements MunicipioDAO {

	@Override
	public Municipio findById(int id) {
		return getByKey(id);
	}
        
	@Override
	public void saveMunicipio(Municipio municipio) {
		
		persist(municipio);
	}

	@Override
	public List<Municipio> findAllMunicipio() {
		Criteria criteria = createEntityCriteria();
        return (List<Municipio>) criteria.list();
	}

    public List findByEstado(Estado estado) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("idEstado", estado));
        return (List<Municipio>) criteria.list();
    }

    
}
