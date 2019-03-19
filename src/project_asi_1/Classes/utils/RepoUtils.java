/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Classes.utils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import project_asi_1.Classes.DAO.RepoDAO;
import project_asi_1.Classes.Eleve;
import project_asi_1.Classes.Groupe;
import project_asi_1.Classes.Repo;
import project_asi_1.Classes.Ssh;

/**
 *
 * @author ESTIENNE
 */
public abstract class RepoUtils {

    public static void addEleveOnRepo(Eleve el, Groupe g) throws IOException, SQLException { //ajouter des eleve sur un repository
        try {
            Ssh ssh = new Ssh();
            ArrayList<String> commands = new ArrayList<String>();
            commands.add("cd " + Prop.getSvnPath());

            commands.add("cd " + g.getNom() + "/conf");

            commands.add("echo '" + el.getAbreviation() + " = " + el.getPwd() + "' >> passwd");

            for (String command : commands) {
                System.out.println(command);
            }
            ssh.sshCommand(commands);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void AddEleveOnSvn(Eleve eleve) throws IOException, SQLException { // ajoute un eleve dans la liste des user svn
        try {
            Ssh ssh = new Ssh();
            ArrayList<String> commands = new ArrayList<String>();
            commands.add("htpasswd -nb /etc/apache2/dav_svn.conf " + eleve.getNom() + " " + eleve.getPwd());

            for (String command : commands) {
                System.out.println(command);
            }
            ssh.sshCommand(commands);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void createRepo(String nomRepo, Repo repo) throws IOException, SQLException { //cree un repository
        try {

            Ssh ssh = new Ssh();
            ArrayList<String> commands = new ArrayList<String>();
            commands.add("cd " + Prop.getSvnPath());
            commands.add("svnadmin create --fs-type fsfs " + nomRepo);
            commands.add("cd " + nomRepo + "/conf");
            for (Eleve eleve : repo.getGroupe().getEleves()) {
                commands.add("echo '" + eleve.getAbreviation() + " = " + eleve.getPwd() + "' >> passwd");
            }
            for (String command : commands) {
                System.out.println(command);
            }
            ssh.sshCommand(commands);

            repo.setPath("svn://" + Prop.getHoteSsh() + "/" + Prop.getSvnPath() + "/" + nomRepo);

        } catch (Exception e) {
            System.out.println(e);

        }

    }

    public static void DeleteRepo(Repo repo) throws IOException, SQLException { // supprime un repository
        try {
            Ssh ssh = new Ssh();
            ArrayList<String> commands = new ArrayList<String>();
            commands.add("cd " + Prop.getSvnPath());
            commands.add("rm -rf " + repo.getNom());

            for (String command : commands) {
                System.out.println(command);
            }
            ssh.sshCommand(commands);

        } catch (Exception e) {
            System.out.println(e);
        }
        RepoDAO.deleteRepo(repo);

    }

}
