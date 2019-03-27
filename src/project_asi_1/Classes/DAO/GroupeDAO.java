/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Classes.DAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import project_asi_1.Classes.Groupe;
import project_asi_1.Classes.utils.HibernateUtils;

/**
 *
 * @author ESTIENNE
 */
public class GroupeDAO {

    private Session getSession() {
        Session session = null;
        if (HibernateUtils.getSessionFactory().getCurrentSession().isOpen()) {
            session = HibernateUtils.getSessionFactory().getCurrentSession();
        } else {
            session = HibernateUtils.getSessionFactory().openSession();
        }
        return session;
    }

    public void saveGroupe(Groupe groupe) {
        Transaction transaction = null;
        Session session = getSession();
        transaction = session.beginTransaction();
        session.save(groupe);
        transaction.commit();
    }

    public void deleteGroupe(Groupe groupe) {
        Transaction transaction = null;
        Session session = getSession();
        transaction = session.beginTransaction();
        session.delete(groupe);

        transaction.commit();

    }

    public void refresh(Groupe groupe) {
        Transaction transaction = null;
        transaction = HibernateUtils.getSessionFactory().getCurrentSession().beginTransaction();
        HibernateUtils.getSessionFactory().getCurrentSession().merge(groupe);
        transaction.commit();
    }

    public Groupe getOneGroupe(Groupe groupe) {
        Session session = getSession();
        return (Groupe) session.get(Groupe.class, groupe.getId());
    }

    public List<Groupe> getGroupes() {
        Session session = getSession();
        session.beginTransaction();
        List<Groupe> groupes = (List<Groupe>) session.createQuery("from " + Groupe.class.getName()).list();
        session.getTransaction().commit();

        return groupes;

    }
}
