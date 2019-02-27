/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Classes;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
    @OneToMany(mappedBy = "repo")
    private List<Groupe> groupe;

    public Repo() {
    }

    public Repo(int id, String nom, String path, Groupe groupe) {
        this.id = id;
        this.nom = nom;
        this.path = path;
        this.groupe = new ArrayList<Groupe>();
    }

    public Repo(String nom, String path, Groupe groupe) {
        this.nom = nom;
        this.path = path;
        this.groupe = new ArrayList<Groupe>();
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

    public List<Groupe> getGroupe() {
        return groupe;
    }

    public void setGroupe(List<Groupe> groupe) {
        this.groupe = groupe;
    }

}
