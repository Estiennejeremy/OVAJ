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

    public void saveGroupe(Groupe groupe) {
        Transaction transaction = null;
        Session session = HibernateUtils.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(groupe);
        transaction.commit();
    }

    public void refresh(Groupe groupe) {
        Transaction transaction = null;
        transaction = HibernateUtils.getSessionFactory().getCurrentSession().beginTransaction();
        HibernateUtils.getSessionFactory().getCurrentSession().merge(groupe);
        transaction.commit();
    }

    public Groupe getOneGroupe(Groupe groupe) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        return (Groupe) session.get(Groupe.class, groupe.getId());
    }

    public List<Groupe> getGroupes() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        return (List<Groupe>) session.createQuery("from groupe").list();
    }
}