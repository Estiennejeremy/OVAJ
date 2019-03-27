/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import project_asi_1.Classes.DAO.EleveDAO;

/**
 *
 * @author ESTIENNE
 */
@Entity
@Table(name = "eleve", schema = "OVAJ")
public class Eleve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_eleve")
    private int id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "mail")
    private String mail;
    @Column(name = "pwd")
    private String pwd;
    @Column(name = "abreviation")
    private String abreviation;
    @ManyToMany(mappedBy = "eleves", fetch = FetchType.EAGER)
    private List<Groupe> groupes;

    public Eleve() {
    }

    public Eleve(int id, String nom, String prenom, String mail, String pwd, String abreviation, List<Groupe> groupes) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.pwd = pwd;
        this.abreviation = abreviation;
        this.groupes = groupes;
    }

    public Eleve(String nom, String prenom, String mail) {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }

        String generatedString = buffer.toString();
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.pwd = generatedString;
        this.abreviation = prenom.charAt(0) + nom;
        this.groupes = new ArrayList<Groupe>();
        EleveDAO eleveDao = new EleveDAO();
        // BddUtils.createMysqlUser(this);

    }

    public List<Groupe> getGroupes() {
        return groupes;
    }

    public void setGroupe(List<Groupe> groupe) {
        this.groupes = groupe;
    }

    public String getNom() {
        return nom;
    }

    public void addGroupes(Groupe g) {
        this.groupes.add(g);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPwd() {
        return pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    @Override
    public String toString() {
        return nom;
    }

}
