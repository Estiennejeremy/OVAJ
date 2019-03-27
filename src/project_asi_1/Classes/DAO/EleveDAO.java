
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Classes.DAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import project_asi_1.Classes.Eleve;
import project_asi_1.Classes.Groupe;
import project_asi_1.Classes.utils.HibernateUtils;

/**
 *
 * @author ESTIENNE
 */
public class EleveDAO {

    private Session getSession() {
        Session session = null;
        if (HibernateUtils.getSessionFactory().getCurrentSession().isOpen()) {
            session = HibernateUtils.getSessionFactory().getCurrentSession();
        } else {
            session = HibernateUtils.getSessionFactory().openSession();
        }
        return session;
    }

    public void saveEleve(Eleve eleve) {
        Transaction transaction = null;
        Session session = getSession();
        transaction = session.beginTransaction();
        session.save(eleve);
        transaction.commit();
    }

    public List<Eleve> getEleves() {
        Session session = getSession();
        session.beginTransaction();
        List<Eleve> eleves = (List<Eleve>) session.createQuery("from " + Eleve.class.getName()).list();
        session.getTransaction().commit();

        return eleves;
    }

    public void refresh(Eleve eleve) {
        Transaction transaction = null;
        transaction = HibernateUtils.getSessionFactory().getCurrentSession().beginTransaction();
        HibernateUtils.getSessionFactory().getCurrentSession().merge(eleve);
        transaction.commit();

    }

    public void deleteEleve(Eleve eleve) {
        Transaction transaction = null;
        Session session = getSession();
        transaction = session.beginTransaction();
        session.delete(eleve);

        transaction.commit();

    }

    public Eleve getOneEleve(Eleve eleve) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        return (Eleve) session.get(Eleve.class, eleve.getId());
    }

    public List<Eleve> getEleveByGroupe(Groupe g) {
        Session session = getSession();
        session.beginTransaction();
        List<Eleve> eleves = (List<Eleve>) session.createQuery("from " + Eleve.class.getName() + " e  left join groupe_eleve g on e.id_eleve = g.id_groupe  where id_groupe = " + g.getId()).list();
        session.getTransaction().commit();
        return eleves;

    }

}
