/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Classes.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import project_asi_1.Classes.Eleve;
import project_asi_1.Classes.Groupe;
import project_asi_1.Classes.Repo;
import project_asi_1.Classes.Ssh;
import project_asi_1.Classes.utils.HibernateUtils;
import project_asi_1.Classes.utils.Prop;

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

    public void saveRepo(Repo repo) {
        Transaction transaction = null;
        Session session = getSession();
        transaction = session.beginTransaction();
        session.save(repo);
        transaction.commit();
    }

    public List<Repo> getRepos() {
        Session session = getSession();
        return (List<Repo>) session.createQuery("from " + Repo.class.getName()).list();
    }

    public void refresh(Repo repo) {
        Transaction transaction = null;
        transaction = HibernateUtils.getSessionFactory().getCurrentSession().beginTransaction();
        HibernateUtils.getSessionFactory().getCurrentSession().merge(repo);
        transaction.commit();

    }

    public Repo getOneRepo(Repo repo) {
        Session session = getSession();
        return (Repo) session.get(Repo.class, repo.getId());
    }

    public void createRepo(Groupe g) throws IOException, SQLException {
        try {
            Ssh ssh = new Ssh();
            ArrayList<String> commands = new ArrayList<String>();
            commands.add("cd " + Prop.getSvnPath());
            commands.add("svnadmin create --fs-type fsfs " + g.getNom());
            commands.add("cd " + g.getNom() + "/conf");
            for (Eleve eleve : g.getEleves()) {
                commands.add("echo '" + eleve.getAbreviation() + " = " + eleve.getPwd() + "' >> passwd");
            }
            for (String command : commands) {
                System.out.println(command);
            }
            ssh.sshCommand(commands);

        } catch (Exception e) {
            System.out.println(e);

        }

    }

}
