/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Classes.utils;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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

        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        Session session = HibernateUtils.getSessionFactory().openSession();
        String SQLRequest = "";
        String nomBd = bd.getNom() + timeStamp;
        SQLRequest = "CREATE SCHEMA " + nomBd + ";";
        for (Eleve e : g.getEleves()) {
            SQLRequest = SQLRequest + " GRANT ALL PRIVILEGES ON database " + nomBd + ".* TO '" + e.getAbreviation() + "'@'%';";
        }
        session.beginTransaction();
        session.createSQLQuery(SQLRequest).executeUpdate();
        session.getTransaction().commit();
        session.close();
        bd.setNomComplet(nomBd);
        BddDAO.saveBdd(bd);

    }

    public static void changeNameBdd(Bdd bd, String newName) { // change le nom d'un schema

        Session session = HibernateUtils.getSessionFactory().openSession();
        String SQLRequest = "ALTER SCHEMA " + bd.getNom() + " RENAME TO " + newName + " ;";
        session.beginTransaction();
        session.createSQLQuery(SQLRequest).executeUpdate();
        session.getTransaction().commit();
        session.close();
        bd.setNom(newName);
        BddDAO.refresh(bd);

    }

    public static void deleteSchema(Bdd bd) { // change le nom d'un schema

        Session session = HibernateUtils.getSessionFactory().openSession();
        String SQLRequest = "DROP SCHEMA " + bd.getNom() + " ;";
        session.beginTransaction();
        session.createSQLQuery(SQLRequest).executeUpdate();
        session.getTransaction().commit();
        session.close();
        bd = null;
        BddDAO.deleteBdd(bd);

    }

}
