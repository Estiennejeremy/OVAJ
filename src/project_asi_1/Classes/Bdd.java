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
 * @author ESTIENNE
 */
@Entity
@Table(name = "bdd", schema = "OVAJ")
public class Bdd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bd")
    private int id;
    @Column(name = "nom")
    private String nom;
    @ManyToOne
    private Groupe groupe;

    public Bdd() {
    }

    public Bdd(int id, String nom, Groupe groupe) {
        this.id = id;
        this.nom = nom;
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

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public void generateBd() throws IOException, SQLException {
        Ssh ssh = new Ssh();
        String SQLRequest = "";
        ArrayList<String> commands = new ArrayList<String>();
        commands.add("mysql -u root -p");
        commands.add(Prop.getmdpBdd());

        SQLRequest = "CREATE SCHEMA " + groupe.getNom() + ";";
        for (Eleve e : groupe.getEleves()) {
            SQLRequest = SQLRequest + " GRANT ALL PRIVILEGES ON database " + groupe.getNom() + ".* TO '" + e.getAbreviation() + "'@'" + Prop.getHoteBdd() + "';";
            System.out.println("GRANT ALL PRIVILEGES ON database " + groupe.getNom() + ".* TO '" + e.getAbreviation() + "'@'" + Prop.getHoteBdd() + "';");
        }
        SQLRequest = SQLRequest + " exit";
        commands.add(SQLRequest);
        ssh.sshCommand(commands);

    }

}
