/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1;

/**
 *
 * @author Elodie
 */
public class Repo_modifier extends javax.swing.JPanel {

    /**
     * Creates new form BD
     */
    public Repo_modifier() {
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

        lblREPO_modifier = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblREPO_nom = new javax.swing.JLabel();
        lblREPO_user = new javax.swing.JLabel();
        btnREPO_valider = new javax.swing.JButton();
        textREPO_nom = new javax.swing.JTextField();
        btnBD_retour = new javax.swing.JButton();
        comboxREPO_user = new javax.swing.JComboBox<>();
        lblREPO_repo = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        lblREPO_modifier.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblREPO_modifier.setText("Modifier");

        lblREPO_nom.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblREPO_nom.setText("Nom : ");

        lblREPO_user.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblREPO_user.setText("<html><p>Utilisateur <br>(ou Groupe) : </p></html>");

        btnREPO_valider.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnREPO_valider.setText("Valider");
        btnREPO_valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREPO_validerActionPerformed(evt);
            }
        });

        textREPO_nom.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        textREPO_nom.setText("ROUX Lucas");
        textREPO_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textREPO_nomActionPerformed(evt);
            }
        });

        btnBD_retour.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnBD_retour.setText("Retour");
        btnBD_retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBD_retourActionPerformed(evt);
            }
        });

        comboxREPO_user.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        comboxREPO_user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coucou", "ça", "va", "?" }));

        lblREPO_repo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblREPO_repo.setText("Repositories");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblREPO_repo)
                        .addGap(337, 337, 337)
                        .addComponent(lblREPO_modifier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnREPO_valider)
                        .addGap(449, 449, 449))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblREPO_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblREPO_nom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textREPO_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 4, Short.MAX_VALUE))
                            .addComponent(comboxREPO_user, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBD_retour)))
                .addContainerGap(220, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblREPO_repo)
                    .addComponent(lblREPO_modifier))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(lblREPO_nom)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textREPO_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblREPO_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxREPO_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111)
                .addComponent(btnREPO_valider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(btnBD_retour)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnREPO_validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREPO_validerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnREPO_validerActionPerformed

    private void textREPO_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textREPO_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textREPO_nomActionPerformed

    private void btnBD_retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBD_retourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBD_retourActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBD_retour;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnREPO_valider;
    private javax.swing.JComboBox<String> comboxREPO_user;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblREPO_modifier;
    private javax.swing.JLabel lblREPO_nom;
    private javax.swing.JLabel lblREPO_repo;
    private javax.swing.JLabel lblREPO_user;
    private javax.swing.JTextField textREPO_nom;
    // End of variables declaration//GEN-END:variables
}
