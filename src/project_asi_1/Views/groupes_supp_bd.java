/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Views;

import java.awt.Frame;

/**
 *
 * @author Lucas
 */
public class groupes_supp_bd extends javax.swing.JPanel {

    /**
     * Creates new form groupes_supp_bd
     */
    public groupes_supp_bd() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonGroupe_oui_supprimerBD = new javax.swing.JButton();
        jButtonGroupe_non_supprimerBD = new javax.swing.JButton();
        jLabelGroupe_supprimer_bd = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        jButtonGroupe_oui_supprimerBD.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonGroupe_oui_supprimerBD.setText("Oui");
        jButtonGroupe_oui_supprimerBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGroupe_oui_supprimerBDActionPerformed(evt);
            }
        });

        jButtonGroupe_non_supprimerBD.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonGroupe_non_supprimerBD.setText("Non");
        jButtonGroupe_non_supprimerBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGroupe_non_supprimerBDActionPerformed(evt);
            }
        });

        jLabelGroupe_supprimer_bd.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelGroupe_supprimer_bd.setText("<html><p>Voulez vous supprimer la  <br>base  _____ du groupe _____ ?</p></html>");

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
                .addGap(228, 228, 228)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelGroupe_supprimer_bd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonGroupe_oui_supprimerBD, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                        .addComponent(jButtonGroupe_non_supprimerBD, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264))))
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
                .addGap(68, 68, 68)
                .addComponent(jLabelGroupe_supprimer_bd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGroupe_oui_supprimerBD, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGroupe_non_supprimerBD, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void jButtonGroupe_oui_supprimerBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGroupe_oui_supprimerBDActionPerformed
        // TODO add your handling code here:
        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.groupes());
        Frame.getFrames()[0].setVisible(true);
    }//GEN-LAST:event_jButtonGroupe_oui_supprimerBDActionPerformed

    private void jButtonGroupe_non_supprimerBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGroupe_non_supprimerBDActionPerformed
        // TODO add your handling code here:
        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.groupes());
        Frame.getFrames()[0].setVisible(true);
    }//GEN-LAST:event_jButtonGroupe_non_supprimerBDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton jButtonGroupe_non_supprimerBD;
    private javax.swing.JButton jButtonGroupe_oui_supprimerBD;
    private javax.swing.JLabel jLabelGroupe_supprimer_bd;
    // End of variables declaration//GEN-END:variables
}
