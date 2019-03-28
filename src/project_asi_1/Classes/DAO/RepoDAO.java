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
import project_asi_1.Classes.Repository;
import project_asi_1.Classes.utils.HibernateUtils;

/**
 *
 * @author Lucas
 */
public class RepoDAO {

    private Session getSession() {
        Session session = null;
        if (HibernateUtils.getSessionFactory().getCurrentSession().isOpen()) {
            session = HibernateUtils.getSessionFactory().getCurrentSession();
        } else {
            session = HibernateUtils.getSessionFactory().openSession();
        }
        return session;
    }

    public void saveRepo(Repository repo) {
        Transaction transaction = null;
        Session session = getSession();
        transaction = session.beginTransaction();
        session.save(repo);
        transaction.commit();
    }

    public void deleteRepo(Repository repo) {
        Transaction transaction = null;
        Session session = getSession();
        transaction = session.beginTransaction();
        session.delete(repo);
        transaction.commit();
    }

    public List<Repository> getRepos() {
        Session session = getSession();
        return (List<Repository>) session.createQuery("from " + Repository.class.getName()).list();
    }

    public List<Repository> getRepoByGroupe(Groupe g) {
        Session session = getSession();
        session.beginTransaction();
        List<Repository> repos = (List<Repository>) session.createQuery("from " + Repository.class.getName() + " where groupe_repo_id_groupe = " + g.getId()).list();
        session.getTransaction().commit();
        return repos;

    }

    public void refresh(Repository repo) {
        Transaction transaction = null;
        transaction = HibernateUtils.getSessionFactory().getCurrentSession().beginTransaction();
        HibernateUtils.getSessionFactory().getCurrentSession().merge(repo);
        transaction.commit();

    }

    public Repository getOneRepo(Repository repo) {
        Session session = getSession();
        return (Repository) session.get(Repository.class, repo.getId());
    }

}
