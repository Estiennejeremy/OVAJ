/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Classes.DAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import project_asi_1.Classes.Repo;
import project_asi_1.Classes.utils.HibernateUtils;

/**
 *
 * @author Lucas
 */
public abstract class RepoDAO {

    private static Session getSession() {
        Session session = null;
        if (HibernateUtils.getSessionFactory().getCurrentSession().isOpen()) {
            session = HibernateUtils.getSessionFactory().getCurrentSession();
        } else {
            session = HibernateUtils.getSessionFactory().openSession();
        }
        return session;
    }

    public static void saveRepo(Repo repo) {
        Transaction transaction = null;
        Session session = getSession();
        transaction = session.beginTransaction();
        session.save(repo);
        transaction.commit();
    }

    public static void deleteRepo(Repo repo) {
        Transaction transaction = null;
        Session session = getSession();
        transaction = session.beginTransaction();
        session.delete(repo);
        transaction.commit();
    }

    public static List<Repo> getRepos() {
        Session session = getSession();
        return (List<Repo>) session.createQuery("from " + Repo.class.getName()).list();
    }

    public static void refresh(Repo repo) {
        Transaction transaction = null;
        transaction = HibernateUtils.getSessionFactory().getCurrentSession().beginTransaction();
        HibernateUtils.getSessionFactory().getCurrentSession().merge(repo);
        transaction.commit();

    }

    public static Repo getOneRepo(Repo repo) {
        Session session = getSession();
        return (Repo) session.get(Repo.class, repo.getId());
    }

}
