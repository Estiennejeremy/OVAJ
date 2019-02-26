/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Classes.DAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import project_asi_1.Classes.Bdd;
import project_asi_1.Classes.utils.HibernateUtils;

/**
 *
 * @author ESTIENNE
 */
public class BddDAO {

    public void saveBdd(Bdd bdd) {
        Transaction transaction = null;
        Session session = HibernateUtils.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(bdd);
        transaction.commit();
    }

    public void refresh(Bdd bdd) {
        Transaction transaction = null;
        transaction = HibernateUtils.getSessionFactory().getCurrentSession().beginTransaction();
        HibernateUtils.getSessionFactory().getCurrentSession().merge(bdd);
        transaction.commit();

    }

    public Bdd getOneBdd(Bdd bdd) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        return (Bdd) session.get(Bdd.class, bdd.getId());
    }

    public List<Bdd> getBdd() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        return (List<Bdd>) session.createQuery("from bdd").list();
    }
}
