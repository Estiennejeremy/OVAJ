/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1;

import java.io.IOException;
import java.sql.SQLException;
import project_asi_1.Classes.DAO.EleveDAO;
import project_asi_1.Classes.Eleve;
import project_asi_1.Classes.Groupe;

/**
 *
 * @author ESTIENNE
 */
public class Project_ASI_1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws IOException, SQLException {

        // TODO code application logic here
//        JFrame myFrame = new JFrame("frame");
//        myFrame.setSize(1080, 720);
//        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        myFrame.add(new project_asi_1.Views.accueil());
//        myFrame.setVisible(true);
        Eleve e = new Eleve("test", "test2", "test3", "test4");
        Groupe g = new Groupe("yes");
        g.addEleve(e);
        EleveDAO d = new EleveDAO();
        System.out.println(g.getEleves());
        // d.saveEleve(e);
//        Bdd df = new Bdd("sayor", g);
//        df.generateBd();
        System.exit(0);

    }
}
