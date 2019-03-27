/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Views;

import java.awt.Frame;
import java.util.List;
import javax.swing.DefaultListModel;
import project_asi_1.Classes.DAO.EleveDAO;
import project_asi_1.Classes.Eleve;

/**
 *
 * @author Lucas
 */
public class eleves extends javax.swing.JPanel {

    /**
     * Creates new form eleves
     */
    public eleves() {
        initComponents();
        remplirListEleve();
    }

    public void remplirListEleve() {
        EleveDAO eleveDao = new EleveDAO();
        List<Eleve> eleves = eleveDao.getEleves();
        DefaultListModel dlm = new DefaultListModel();
        jListEleves.setModel(dlm);
        for (Eleve e : eleves) {
            dlm.addElement(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEleves = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListEleves = new javax.swing.JList<>();
        btnRetour = new javax.swing.JButton();
        brnCreer = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        labInfo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1080, 720));

        lblEleves.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblEleves.setText("Elèves");

        jListEleves.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jListEleves.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListEleves.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListElevesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListEleves);

        btnRetour.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRetour.setText("Retour");
        btnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourActionPerformed(evt);
            }
        });

        brnCreer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        brnCreer.setText("Créer");
        brnCreer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnCreerActionPerformed(evt);
            }
        });

        btnSupprimer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
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
                .addGap(414, 414, 414)
                .addComponent(lblEleves, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addGap(415, 415, 415))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(brnCreer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(btnRetour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(242, 242, 242))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblEleves)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(brnCreer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(labInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void brnCreerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnCreerActionPerformed

        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.eleves_creer());
        Frame.getFrames()[0].setVisible(true);
    }//GEN-LAST:event_brnCreerActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        Object r = jListEleves.getModel().getElementAt(jListEleves.getSelectedIndex());
        if (r instanceof Eleve) {
            Eleve eleve = (Eleve) r;

            Frame.getFrames()[0].remove(this);
            Frame.getFrames()[0].add(new project_asi_1.Views.eleves_supprimer(eleve));
            Frame.getFrames()[0].setVisible(true);
        }
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourActionPerformed
        // TODO add your handling code here:
        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.accueil());
        Frame.getFrames()[0].setVisible(true);
    }//GEN-LAST:event_btnRetourActionPerformed

    private void jListElevesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListElevesValueChanged
        Object r = jListEleves.getModel().getElementAt(jListEleves.getSelectedIndex());
        if (r instanceof Eleve) {
            Eleve eleve = (Eleve) r;

            labInfo.setText("Nom : " + eleve.getNom() + " Prénom :  " + eleve.getPrenom() + "  mot de passe : " + eleve.getPwd());
        }

    }//GEN-LAST:event_jListElevesValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnCreer;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRetour;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JList<String> jListEleves;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labInfo;
    private javax.swing.JLabel lblEleves;
    // End of variables declaration//GEN-END:variables
}
