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
public class groupes_creer extends javax.swing.JPanel {

    /**
     * Creates new form groupes_creer
     */
    public groupes_creer() {
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

        jLabelGroupe_creer = new javax.swing.JLabel();
        jTextFieldGroupe_creer_nom = new javax.swing.JTextField();
        lblGroupe_ajouterEleve = new javax.swing.JLabel();
        jButtonGroupe_ajouterEleves = new javax.swing.JButton();
        lblEGroupe_creer_nom = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListGroupe1 = new javax.swing.JList<>();
        jButtonGroupe_creer_annuler = new javax.swing.JButton();
        jButtonGroupe_creer_valider = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        jLabelGroupe_creer.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelGroupe_creer.setText("Créer");

        jTextFieldGroupe_creer_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGroupe_creer_nomActionPerformed(evt);
            }
        });

        lblGroupe_ajouterEleve.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblGroupe_ajouterEleve.setText("Elèves ajoutés");

        jButtonGroupe_ajouterEleves.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonGroupe_ajouterEleves.setText("Ajouter un élève");

        lblEGroupe_creer_nom.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblEGroupe_creer_nom.setText("Nom :");

        jListGroupe1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListGroupe1);

        jButtonGroupe_creer_annuler.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonGroupe_creer_annuler.setText("Annuler");

        jButtonGroupe_creer_valider.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonGroupe_creer_valider.setText("Valider");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jTextFieldGroupe_creer_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGroupe_ajouterEleve))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jButtonGroupe_ajouterEleves, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(313, 313, 313)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addGap(322, 322, 322))
            .addGroup(layout.createSequentialGroup()
                .addGap(433, 433, 433)
                .addComponent(jLabelGroupe_creer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButtonGroupe_creer_annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGroupe_creer_valider, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(lblEGroupe_creer_nom)
                    .addContainerGap(1042, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabelGroupe_creer)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldGroupe_creer_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGroupe_ajouterEleve))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGroupe_ajouterEleves, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGroupe_creer_annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGroupe_creer_valider, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(224, 224, 224)
                    .addComponent(lblEGroupe_creer_nom)
                    .addContainerGap(452, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldGroupe_creer_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGroupe_creer_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGroupe_creer_nomActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton jButtonGroupe_ajouterEleves;
    private javax.swing.JButton jButtonGroupe_creer_annuler;
    private javax.swing.JButton jButtonGroupe_creer_valider;
    private javax.swing.JLabel jLabelGroupe_creer;
    private javax.swing.JList<String> jListGroupe1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldGroupe_creer_nom;
    private javax.swing.JLabel lblEGroupe_creer_nom;
    private javax.swing.JLabel lblGroupe_ajouterEleve;
    // End of variables declaration//GEN-END:variables
}