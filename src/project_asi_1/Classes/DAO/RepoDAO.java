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
public class RepoDAO {

    public void saveRepo(Repo repo) {
        Transaction transaction = null;
        Session session = HibernateUtils.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(repo);
        transaction.commit();
    }

    public List<Repo> getRepos() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        return (List<Repo>) session.createQuery("from repo").list();
    }

    public void refresh(Repo repo) {
        Transaction transaction = null;
        transaction = HibernateUtils.getSessionFactory().getCurrentSession().beginTransaction();
        HibernateUtils.getSessionFactory().getCurrentSession().merge(repo);
        transaction.commit();

    }

    public Repo getOneRepo(Repo repo) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        return (Repo) session.get(Repo.class, repo.getId());
    }
}
