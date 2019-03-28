/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Views;

import java.awt.Frame;
import project_asi_1.Classes.DAO.GroupeDAO;
import project_asi_1.Classes.Groupe;

/**
 *
 * @author Lucas
 */
public class groupes_supprimer extends javax.swing.JPanel {

    /**
     * Creates new form groupes_supprimer
     */
    public Groupe g2;

    public groupes_supprimer(Groupe g) {
        initComponents();
        g2 = g;
        jLabelGroupe_supprimer.setText("Voulez vous supprimer " + g.getNom() + " des groupes ?");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonGroupe_non_supprimer = new javax.swing.JButton();
        jLabelGroupe_supprimer = new javax.swing.JLabel();
        jButtonGroupe_oui_supprimer = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        jButtonGroupe_non_supprimer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonGroupe_non_supprimer.setText("Non");
        jButtonGroupe_non_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGroupe_non_supprimerActionPerformed(evt);
            }
        });

        jLabelGroupe_supprimer.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelGroupe_supprimer.setText("Voulez vous supprimer _____ des groupes ?");

        jButtonGroupe_oui_supprimer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonGroupe_oui_supprimer.setText("Oui");
        jButtonGroupe_oui_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGroupe_oui_supprimerActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabelGroupe_supprimer)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jButtonGroupe_oui_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGroupe_non_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(jLabelGroupe_supprimer)
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGroupe_oui_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGroupe_non_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(240, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void jButtonGroupe_oui_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGroupe_oui_supprimerActionPerformed
        try {
            GroupeDAO groupeDao = new GroupeDAO();
            groupeDao.deleteGroupe(g2);
            Frame.getFrames()[0].remove(this);
            Frame.getFrames()[0].add(new project_asi_1.Views.groupes());
            Frame.getFrames()[0].setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButtonGroupe_oui_supprimerActionPerformed

    private void jButtonGroupe_non_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGroupe_non_supprimerActionPerformed
        // TODO add your handling code here:
        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.groupes());
        Frame.getFrames()[0].setVisible(true);
    }//GEN-LAST:event_jButtonGroupe_non_supprimerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton jButtonGroupe_non_supprimer;
    private javax.swing.JButton jButtonGroupe_oui_supprimer;
    private javax.swing.JLabel jLabelGroupe_supprimer;
    // End of variables declaration//GEN-END:variables
}
