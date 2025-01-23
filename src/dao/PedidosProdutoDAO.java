/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Produtos;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u08852060103
 */
public class ProdutosDAO extends DAOAbstract {
    
    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.beginTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.save(object);
        session.beginTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.save(object);
        session.beginTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Produtos.class);
        criteria.add(Restrictions.eq("idprodutos", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Produtos.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (List) lista;
    }

}
