/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Views;

import java.awt.Frame;

/**
 *
 * @author Elodie
 */
public class Repo_popup_creer extends javax.swing.JPanel {

    /**
     * Creates new form BD
     */
    public Repo_popup_creer() {
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

        jLabel2 = new javax.swing.JLabel();
        lblREPO_creation = new javax.swing.JLabel();
        btnREPO_copier = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaREPO_log = new javax.swing.JTextArea();
        btnExit = new javax.swing.JButton();
        btnREPO_retour = new javax.swing.JButton();

        lblREPO_creation.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblREPO_creation.setText("<html> <p>Le repository ___________<br>  a bien été créé</p></html>");

        btnREPO_copier.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnREPO_copier.setText("Copier");
        btnREPO_copier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREPO_copierActionPerformed(evt);
            }
        });

        txtareaREPO_log.setColumns(20);
        txtareaREPO_log.setRows(5);
        jScrollPane1.setViewportView(txtareaREPO_log);

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnREPO_retour.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnREPO_retour.setText("Retour");
        btnREPO_retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREPO_retourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 356, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblREPO_creation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnREPO_copier)
                                .addGap(203, 203, 203))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnREPO_retour)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(lblREPO_creation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(btnREPO_copier)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(btnREPO_retour)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnREPO_copierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREPO_copierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnREPO_copierActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnREPO_retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREPO_retourActionPerformed
        // TODO add your handling code here:
        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.Repo());
        Frame.getFrames()[0].setVisible(true);
    }//GEN-LAST:event_btnREPO_retourActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnREPO_copier;
    private javax.swing.JButton btnREPO_retour;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblREPO_creation;
    private javax.swing.JTextArea txtareaREPO_log;
    // End of variables declaration//GEN-END:variables
}
