/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Views;

import java.awt.Frame;
import project_asi_1.Classes.Bdd;
import project_asi_1.Classes.DAO.BddDAO;

/**
 *
 * @author Elodie
 */
public class BD_popup_suppr extends javax.swing.JPanel {

    /**
     * Creates new form BD
     */
    public static Bdd bd;

    public BD_popup_suppr(Bdd bdd) {
        initComponents();
        bd = bdd;
        lblBD_suppr.setText("<html> <p>Voulez-vous supprimer " + bdd.getNom() + "<br>  des bases de données </p></html>");
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
        lblBD_suppr = new javax.swing.JLabel();
        btnBD_oui = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnBD_non = new javax.swing.JButton();

        lblBD_suppr.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblBD_suppr.setText("<html> <p>Voulez-vous supprimer ___________<br>  des bases de données ? </p></html>");

        btnBD_oui.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnBD_oui.setText("Oui");
        btnBD_oui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBD_ouiActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnBD_non.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnBD_non.setText("Non");
        btnBD_non.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBD_nonActionPerformed(evt);
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
                        .addComponent(lblBD_suppr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(324, 324, 324))))
            .addGroup(layout.createSequentialGroup()
                .addGap(469, 469, 469)
                .addComponent(btnBD_oui)
                .addGap(119, 119, 119)
                .addComponent(btnBD_non)
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
                .addComponent(lblBD_suppr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBD_oui)
                    .addComponent(btnBD_non))
                .addContainerGap(344, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBD_ouiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBD_ouiActionPerformed
        // TODO add your handling code here:

        try {

            BddDAO bddDao = new BddDAO();
            bddDao.deleteBdd(bd);
            Frame.getFrames()[0].remove(this);
            Frame.getFrames()[0].add(new project_asi_1.Views.BaseDD());
            Frame.getFrames()[0].setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_btnBD_ouiActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBD_nonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBD_nonActionPerformed
        // TODO add your handling code here:
        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.BaseDD());
        Frame.getFrames()[0].setVisible(true);
    }//GEN-LAST:event_btnBD_nonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBD_non;
    private javax.swing.JButton btnBD_oui;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBD_suppr;
    // End of variables declaration//GEN-END:variables
}
