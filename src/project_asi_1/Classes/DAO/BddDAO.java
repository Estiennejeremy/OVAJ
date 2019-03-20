
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

    private Session getSession() {
        Session session = null;
        if (HibernateUtils.getSessionFactory().getCurrentSession().isOpen()) {
            session = HibernateUtils.getSessionFactory().getCurrentSession();
        } else {
            session = HibernateUtils.getSessionFactory().openSession();
        }
        return session;
    }

    public void saveBdd(Bdd bdd) {
        Transaction transaction = null;
        Session session = getSession();
        transaction = session.beginTransaction();
        session.save(bdd);
        transaction.commit();
    }

    public void deleteBdd(Bdd bdd) {
        Transaction transaction = null;
        Session session = getSession();
        transaction = session.beginTransaction();
        session.delete(bdd);
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
        return (List<Bdd>) session.createQuery("from " + Bdd.class.getName()).list();
    }
}
