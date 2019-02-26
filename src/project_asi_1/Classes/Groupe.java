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
 * @author ESTIENNE
 */
@Entity
@Table(name = "groupe", schema = "OVAJ")
public class Groupe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_groupe")
    private int id;
    @Column(name = "nom")
    private String nom;
    @OneToMany(mappedBy = "groupe")
    private List<Eleve> eleves;
    @OneToMany(mappedBy = "groupe")
    private List<Bdd> bdd;

    public Groupe() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Groupe(String nom) {
        this.nom = nom;
        this.eleves = new ArrayList<Eleve>();
    }

    public Groupe(String nom, ArrayList<Eleve> eleves) {
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

    public void setEleves(ArrayList<Eleve> eleves) {
        this.eleves = eleves;
    }

    public void addEleve(Eleve e) {
        this.eleves.add(e);
    }

    public List<Bdd> getBdd() {
        return bdd;
    }

    public void setBdd(ArrayList<Bdd> bdd) {
        this.bdd = bdd;
    }

    public void addEleve(Bdd b) {
        this.bdd.add(b);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
