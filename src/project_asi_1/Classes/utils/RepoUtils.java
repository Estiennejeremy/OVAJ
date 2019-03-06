/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Classes.utils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import project_asi_1.Classes.Eleve;
import project_asi_1.Classes.Groupe;
import project_asi_1.Classes.Repo;
import project_asi_1.Classes.Ssh;

/**
 *
 * @author ESTIENNE
 */
public abstract class RepoUtils {

    public static void addEleveOnRepo(Eleve el, Groupe g) throws IOException, SQLException {
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

    public static void AddEleveOnSvn(Eleve eleve) throws IOException, SQLException {
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

    public static void createRepo(Groupe g, Repo repo) throws IOException, SQLException {
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

            repo.setPath("svn://" + Prop.getHoteSsh() + "/" + Prop.getSvnPath() + "/" + g.getNom());
            repo.setGroupe(g);
            repo.setNom(g.getNom());

        } catch (Exception e) {
            System.out.println(e);

        }

    }

}
