/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Classes;

import java.io.IOException;
import java.sql.SQLException;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import project_asi_1.Classes.utils.RepoUtils;

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

    public Repo(String nom, Groupe g) throws IOException, SQLException {
        this.nom = nom;
        this.groupe = g;
        RepoUtils.createRepo(nom, this);
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

}
