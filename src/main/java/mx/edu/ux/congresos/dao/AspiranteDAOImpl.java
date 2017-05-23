/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.dao;

import java.util.List;
import mx.edu.ux.congresos.model.Aspirante;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("aspiranteDao")
public class AspiranteDAOImpl extends AbstractDAO<Integer, Aspirante> implements AspiranteDAO {

    @Override
    public void deleteAspiranteByClaveAspirante(String clave) {
        Query query = getSession().createSQLQuery("delete from aspirante where clave_aspirante = :clave");
        query.setString("clave", clave);
        query.executeUpdate();
    }

    @Override
    public Aspirante findById(int id) {
        return (Aspirante) getByKey(id);
    }

    @Override
    public void saveAspirante(Aspirante aspirante) {
        persist(aspirante);
    }

    @Override
    public List findAllAspirantes() {
        Criteria criteria = createEntityCriteria();
        return (List) criteria.list();
    }

    @Override
    public Aspirante findAspiranteByClaveAspirante(String clave) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("claveAspirante", clave));
        return (Aspirante) criteria.uniqueResult();
    }
}
