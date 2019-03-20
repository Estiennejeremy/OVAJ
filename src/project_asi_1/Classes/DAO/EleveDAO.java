
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
import project_asi_1.Classes.Eleve;
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
        Session session = HibernateUtils.getSessionFactory().openSession();
        return (List<Eleve>) session.createQuery("from " + Eleve.class.getName()).list();
    }

    public void refresh(Eleve eleve) {
        Transaction transaction = null;
        transaction = HibernateUtils.getSessionFactory().getCurrentSession().beginTransaction();
        HibernateUtils.getSessionFactory().getCurrentSession().merge(eleve);
        transaction.commit();

    }

    public Eleve getOneEleve(Eleve eleve) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        return (Eleve) session.get(Eleve.class, eleve.getId());
    }

    public void createMysqlUser(Eleve e) { // creer un utiliseur mysql
        Session session = HibernateUtils.getSessionFactory().openSession();
        String SQLRequest = "CREATE USER '" + e.getAbreviation() + "'@'%' IDENTIFIED BY '" + e.getPwd() + "'; ";
        session.beginTransaction();
        session.createSQLQuery(SQLRequest).executeUpdate();
        session.getTransaction().commit();
        session.close();

    }

    public void addEleveOnSchema(Eleve e, Bdd d) { // ajoute un eleve sur un schema
        Session session = HibernateUtils.getSessionFactory().openSession();
        String SQLRequest = "GRANT ALL PRIVILEGES ON database " + d.getNom() + ".* TO '" + e.getAbreviation() + "'@'%';";
        session.beginTransaction();
        session.createSQLQuery(SQLRequest).executeUpdate();
        session.getTransaction().commit();
        session.close();

    }
}
