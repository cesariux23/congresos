/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ux.congresos.dao;

import java.util.List;
import mx.edu.ux.congresos.model.CategoriaInscripcion;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;


@Repository("categoriaInscripcionDao")
public class CategoriaInscripcionDAOImpl extends AbstractDAO<Integer, CategoriaInscripcion > implements CategoriaInscripcionDAO {

	@Override
	public CategoriaInscripcion findById(int id) {
		return getByKey(id);
	}

	@Override
	public void saveCategoriaInscripcion (CategoriaInscripcion categoriaInscripcion) {
		
		persist(categoriaInscripcion);
	}

	@Override
	public List<CategoriaInscripcion > findAllCategoriaInscripcion () {
		Criteria criteria = createEntityCriteria();
        return (List<CategoriaInscripcion>) criteria.list();
	}
}
