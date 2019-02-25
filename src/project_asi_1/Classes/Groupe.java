/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Classes;

import java.util.ArrayList;

/**
 *
 * @author ESTIENNE
 */
public class Groupe {

    private String nom;
    private ArrayList<Eleve> eleves;

    public Groupe() {
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

    public ArrayList<Eleve> getEleves() {
        return eleves;
    }

    public void setEleves(ArrayList<Eleve> eleves) {
        this.eleves = eleves;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
