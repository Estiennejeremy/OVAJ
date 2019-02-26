/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1;

import javax.swing.*;

/**
 *
 * @author ESTIENNE
 */
public class Project_ASI_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        JFrame myFrame = new JFrame("frame");
        myFrame.setSize(1080, 720);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.add(new project_asi_1.Views.accueil());
        myFrame.setVisible(true);



    }
}
