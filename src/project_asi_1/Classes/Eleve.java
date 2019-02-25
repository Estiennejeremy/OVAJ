/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Classes;

/**
 *
 * @author ESTIENNE
 */
public class Eleve {

    private String nom;
    private String prenom;
    private String mail;
    private String pwd;

    public Eleve() {
    }

    public Eleve(String nom, String prenom, String mail, String pwd) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.pwd = pwd;
    }

    public String getNom() {
        return nom;
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

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return this.getNom() + " " + this.getPrenom(); //To change body of generated methods, choose Tools | Templates.
    }

}
