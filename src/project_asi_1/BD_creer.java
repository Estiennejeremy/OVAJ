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
public class BD_creer extends javax.swing.JPanel {

    /**
     * Creates new form BD
     */
    public BD_creer() {
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

        lblBD_créer = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBD_nom = new javax.swing.JLabel();
        lblBD_user = new javax.swing.JLabel();
        btnBD_valider = new javax.swing.JButton();
        textBD_nom = new javax.swing.JTextField();
        btnBD_retour = new javax.swing.JButton();
        comboboxBD_user = new javax.swing.JComboBox<>();
        lblBD_BD = new javax.swing.JLabel();

        lblBD_créer.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblBD_créer.setText("Créer");

        lblBD_nom.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblBD_nom.setText("Nom : ");

        lblBD_user.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblBD_user.setText("<html><p>Utilisateur <br>(ou Groupe) : </p></html>");

        btnBD_valider.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnBD_valider.setText("Valider");
        btnBD_valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBD_validerActionPerformed(evt);
            }
        });

        textBD_nom.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        textBD_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBD_nomActionPerformed(evt);
            }
        });

        btnBD_retour.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnBD_retour.setText("Retour");
        btnBD_retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBD_retourActionPerformed(evt);
            }
        });

        comboboxBD_user.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        comboboxBD_user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coucou", "ça", "va", "?" }));

        lblBD_BD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBD_BD.setText("Base de données");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblBD_BD)
                        .addGap(363, 363, 363)
                        .addComponent(lblBD_créer)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBD_valider)
                        .addGap(449, 449, 449))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBD_nom)
                            .addComponent(lblBD_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboboxBD_user, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textBD_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBD_retour)))
                .addContainerGap(230, Short.MAX_VALUE))
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
                    .addComponent(lblBD_BD)
                    .addComponent(lblBD_créer))
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBD_nom)
                    .addComponent(textBD_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboboxBD_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBD_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111)
                .addComponent(btnBD_valider)
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

    private void btnBD_validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBD_validerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBD_validerActionPerformed

    private void textBD_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBD_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBD_nomActionPerformed

    private void btnBD_retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBD_retourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBD_retourActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBD_retour;
    private javax.swing.JButton btnBD_valider;
    private javax.swing.JComboBox<String> comboboxBD_user;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBD_BD;
    private javax.swing.JLabel lblBD_créer;
    private javax.swing.JLabel lblBD_nom;
    private javax.swing.JLabel lblBD_user;
    private javax.swing.JTextField textBD_nom;
    // End of variables declaration//GEN-END:variables
}
