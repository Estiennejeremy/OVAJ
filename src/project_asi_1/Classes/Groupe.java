/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Classes;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ESTIENNE
 */
@Entity
@Table(name = "groupe")
public class Groupe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_groupe")
    private int id;
    @Column(name = "nom")
    private String nom;
    @ManyToMany(mappedBy = "groupes", fetch = FetchType.EAGER)
    private List<Eleve> eleves;

    @OneToMany(mappedBy = "groupe")
    private List<Bdd> bdd;

    @OneToMany(mappedBy = "groupe")
    private List<Repository> repo;

    @Column(name = "creation_date")
    private Date dateCreation = new Date();

    public Groupe() {
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Repository> getRepo() {
        return repo;
    }

    public void setRepo(List<Repository> repo) {
        this.repo = repo;
    }

    public Groupe(String nom) throws IOException, SQLException {
        this.nom = nom;
        this.eleves = new ArrayList<Eleve>();

    }

    public Groupe(String nom, List<Eleve> eleves) {
        this.nom = nom;
        this.eleves = eleves;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Eleve> getEleves() {
        return eleves;
    }

    public void setEleves(List<Eleve> eleves) {
        this.eleves = eleves;
    }

    public void addEleve(Eleve e) {
        this.eleves.add(e);

    }

    public void removeEleve(Eleve e) {
        this.eleves.remove(e);
        e.removeGroupe(this);
    }

    public void addRepo(Repository r) {
        this.repo.add(r);
    }

    public List<Bdd> getBdd() {
        return bdd;
    }

    public void setBdd(List<Bdd> bdd) {
        this.bdd = bdd;
    }

    public void addBdd(Bdd b) {
        this.bdd.add(b);
    }

    @Override
    public String toString() {
        return nom; //To change body of generated methods, choose Tools | Templates.
    }

}
