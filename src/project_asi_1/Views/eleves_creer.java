/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1;

/**
 *
 * @author Lucas
 */
public class eleves_creer extends javax.swing.JPanel {

    /**
     * Creates new form eleves_creer
     */
    public eleves_creer() {
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

        lblEleve_prenom = new javax.swing.JLabel();
        lblEleve_creer = new javax.swing.JLabel();
        lblEleve_nom1 = new javax.swing.JLabel();
        lblEleve_mail = new javax.swing.JLabel();
        jTextFieldEleve_nom = new javax.swing.JTextField();
        jTextFieldEleve_mail = new javax.swing.JTextField();
        jTextFieldEleve_prenom = new javax.swing.JTextField();
        jCheckBoxEleve_repo = new javax.swing.JCheckBox();
        jCheckBoxEleve_repo1 = new javax.swing.JCheckBox();
        btnEleve_valider = new javax.swing.JButton();
        btnEleve_retour1 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        lblEleve_prenom.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblEleve_prenom.setText("Prénom");

        lblEleve_creer.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblEleve_creer.setText("Créer");

        lblEleve_nom1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblEleve_nom1.setText("Nom");

        lblEleve_mail.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblEleve_mail.setText("Mail");

        jTextFieldEleve_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEleve_nomActionPerformed(evt);
            }
        });

        jTextFieldEleve_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEleve_mailActionPerformed(evt);
            }
        });

        jTextFieldEleve_prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEleve_prenomActionPerformed(evt);
            }
        });

        jCheckBoxEleve_repo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jCheckBoxEleve_repo.setText("Base de données");

        jCheckBoxEleve_repo1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jCheckBoxEleve_repo1.setText("Repository");

        btnEleve_valider.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEleve_valider.setText("Valider");

        btnEleve_retour1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEleve_retour1.setText("Retour");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBoxEleve_repo)
                .addGap(217, 217, 217))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEleve_prenom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                                .addComponent(jTextFieldEleve_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblEleve_nom1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldEleve_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblEleve_mail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEleve_valider, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEleve_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(lblEleve_creer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 433, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(296, 296, 296)
                    .addComponent(jCheckBoxEleve_repo1)
                    .addContainerGap(583, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(btnEleve_retour1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(885, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblEleve_creer))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldEleve_nom)
                    .addComponent(lblEleve_nom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEleve_prenom)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldEleve_prenom)
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEleve_mail)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldEleve_mail, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(59, 59, 59)
                .addComponent(jCheckBoxEleve_repo)
                .addGap(40, 40, 40)
                .addComponent(btnEleve_valider, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(458, Short.MAX_VALUE)
                    .addComponent(jCheckBoxEleve_repo1)
                    .addGap(209, 209, 209)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(584, Short.MAX_VALUE)
                    .addComponent(btnEleve_retour1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(62, 62, 62)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEleve_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEleve_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEleve_nomActionPerformed

    private void jTextFieldEleve_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEleve_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEleve_mailActionPerformed

    private void jTextFieldEleve_prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEleve_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEleve_prenomActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEleve_retour1;
    private javax.swing.JButton btnEleve_valider;
    private javax.swing.JButton btnExit;
    private javax.swing.JCheckBox jCheckBoxEleve_repo;
    private javax.swing.JCheckBox jCheckBoxEleve_repo1;
    private javax.swing.JTextField jTextFieldEleve_mail;
    private javax.swing.JTextField jTextFieldEleve_nom;
    private javax.swing.JTextField jTextFieldEleve_prenom;
    private javax.swing.JLabel lblEleve_creer;
    private javax.swing.JLabel lblEleve_mail;
    private javax.swing.JLabel lblEleve_nom1;
    private javax.swing.JLabel lblEleve_prenom;
    // End of variables declaration//GEN-END:variables
}