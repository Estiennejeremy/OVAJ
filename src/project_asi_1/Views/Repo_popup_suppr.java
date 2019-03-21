/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Views;

import java.awt.Frame;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import project_asi_1.Classes.Repository;
import project_asi_1.Classes.utils.RepoUtils;

/**
 *
 * @author Elodie
 */
public class Repo_popup_suppr extends javax.swing.JPanel {

    public static Repository rep;

    public Repo_popup_suppr(Repository repos) {
        initComponents();
        rep = repos;
        lblREPO_suppr.setText("<html> <p>Voulez-vous supprimer " + repos.getNom() + "<br>  des repositories ? </p></html>");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblREPO_suppr = new javax.swing.JLabel();
        btnREPO_oui = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnREPO_non = new javax.swing.JButton();

        lblREPO_suppr.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblREPO_suppr.setText("<html> <p>Voulez-vous supprimer ___________<br>  des repositories ? </p></html>");

        btnREPO_oui.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnREPO_oui.setText("Oui");
        btnREPO_oui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREPO_ouiActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnREPO_non.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnREPO_non.setText("Non");
        btnREPO_non.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREPO_nonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblREPO_suppr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(324, 324, 324))))
            .addGroup(layout.createSequentialGroup()
                .addGap(469, 469, 469)
                .addComponent(btnREPO_oui)
                .addGap(119, 119, 119)
                .addComponent(btnREPO_non)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(lblREPO_suppr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnREPO_oui)
                    .addComponent(btnREPO_non))
                .addContainerGap(344, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnREPO_ouiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREPO_ouiActionPerformed

        try {
            RepoUtils.DeleteRepo(rep);
        } catch (IOException ex) {
            Logger.getLogger(Repo_popup_suppr.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Repo_popup_suppr.class.getName()).log(Level.SEVERE, null, ex);
        }
        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.Repo());
        Frame.getFrames()[0].setVisible(true);
    }//GEN-LAST:event_btnREPO_ouiActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnREPO_nonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREPO_nonActionPerformed
        // TODO add your handling code here:
        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.Repo());
        Frame.getFrames()[0].setVisible(true);
    }//GEN-LAST:event_btnREPO_nonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnREPO_non;
    private javax.swing.JButton btnREPO_oui;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblREPO_suppr;
    // End of variables declaration//GEN-END:variables
}
