/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Classes;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import project_asi_1.Classes.utils.Prop;

/**
 *
 * @author Lucas
 */
@Entity
@Table(name = "repo", schema = "OVAJ")
public class Repo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_repo")
    private int id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "path")
    private String path;
    @ManyToOne
    private Groupe groupe;

    public Repo() {
    }

    public Repo(int id, String nom, String path, Groupe groupe) {
        this.id = id;
        this.nom = nom;
        this.path = path;
        this.groupe = groupe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
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

            this.setPath("svn://" + Prop.getHoteSsh() + "/" + Prop.getSvnPath() + "/" + g.getNom());
            this.setGroupe(g);
            this.setNom(g.getNom());

        } catch (Exception e) {
            System.out.println(e);

        }

    }

}
