/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Classes.utils;

import java.io.IOException;
import java.sql.SQLException;
import org.hibernate.Session;
import project_asi_1.Classes.Bdd;
import project_asi_1.Classes.DAO.BddDAO;
import project_asi_1.Classes.Eleve;
import project_asi_1.Classes.Groupe;

/**
 *
 * @author ESTIENNE
 */
public abstract class BddUtils {

    /**
     * Créer une base de donnée sur le serveur
     */
    public static void generateBd(Groupe g, Bdd bd) throws IOException, SQLException { // cree un schema

        Session session = HibernateUtils.getSessionFactory().openSession();
        String SQLRequest = "";
        String nomBd = g.getNom() + "_" + bd.getNom();
        SQLRequest = "CREATE SCHEMA " + nomBd + ";";

        session.beginTransaction();
        session.createSQLQuery(SQLRequest).executeUpdate();
        session.getTransaction().commit();
        session.close();
        bd.setNomComplet(nomBd);
        BddDAO bddDao = new BddDAO();

        bddDao.saveBdd(bd);
        String SQLRequest2 = "";
        for (Eleve e : g.getEleves()) {
            SQLRequest2 = "";
            SQLRequest2 = "GRANT ALL PRIVILEGES ON " + nomBd + ".* TO '" + e.getAbreviation() + "'@'%' ; ";
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.createSQLQuery(SQLRequest2).executeUpdate();
            session.getTransaction().commit();
            session.close();
        }

    }

    public static void changeNameBdd(Bdd bd, String newName) { // change le nom d'un schema

        Session session = HibernateUtils.getSessionFactory().openSession();
        String SQLRequest = "ALTER SCHEMA " + bd.getNom() + " RENAME TO " + newName + " ;";
        session.beginTransaction();
        session.createSQLQuery(SQLRequest).executeUpdate();
        session.getTransaction().commit();
        session.close();
        bd.setNom(newName);
        BddDAO bddDao = new BddDAO();
        bddDao.refresh(bd);

    }

    public static void deleteSchema(Bdd bd) { // change le nom d'un schema

        Session session = HibernateUtils.getSessionFactory().openSession();
        String SQLRequest = "DROP SCHEMA " + bd.getNom() + " ;";
        session.beginTransaction();
        session.createSQLQuery(SQLRequest).executeUpdate();
        session.getTransaction().commit();
        session.close();
        bd = null;
        BddDAO bddDao = new BddDAO();
        bddDao.deleteBdd(bd);

    }

    public static void createMysqlUser(Eleve e) { // creer un utiliseur mysql
        Session session = HibernateUtils.getSessionFactory().openSession();
        String SQLRequest = "CREATE USER '" + e.getAbreviation() + "'@'%' IDENTIFIED BY '" + e.getPwd() + "'; ";
        System.out.println(SQLRequest);
        session.beginTransaction();
        session.createSQLQuery(SQLRequest).executeUpdate();
        session.getTransaction().commit();
        session.close();

    }

    public static void dropMysqlUser(Eleve e) { // creer un utiliseur mysql
        Session session = HibernateUtils.getSessionFactory().openSession();
        String SQLRequest = "DROP USER '" + e.getAbreviation() + "'@'%' ; ";
        System.out.println(SQLRequest);
        session.beginTransaction();
        session.createSQLQuery(SQLRequest).executeUpdate();
        session.getTransaction().commit();
        session.close();

    }

    public static void addEleveOnSchema(Eleve e, Bdd d) { // ajoute un eleve sur un schema
        Session session = HibernateUtils.getSessionFactory().openSession();
        String SQLRequest = "GRANT ALL PRIVILEGES ON database " + d.getNom() + ".* TO '" + e.getAbreviation() + "'@'%' IDENTIFIED BY " + e.getPwd() + " ;";
        session.beginTransaction();
        session.createSQLQuery(SQLRequest).executeUpdate();
        session.getTransaction().commit();
        session.close();

    }

}
