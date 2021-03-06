/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Views;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import project_asi_1.Classes.DAO.EleveDAO;
import project_asi_1.Classes.DAO.GroupeDAO;
import project_asi_1.Classes.Eleve;
import project_asi_1.Classes.Groupe;

/**
 *
 * @author Lucas
 */
public class groupes extends javax.swing.JPanel {

    /**
     * Creates new form groupes
     */
    public static List<Eleve> eleves = new ArrayList<Eleve>();

    public groupes() {
        initComponents();
        replirListGroupe();
    }

    public void replirListGroupe() {
        GroupeDAO groupeDao = new GroupeDAO();
        List<Groupe> groupes = groupeDao.getGroupes();
        DefaultListModel dlm = new DefaultListModel();
        jListGroupe1.setModel(dlm);
        for (Groupe g : groupes) {
            dlm.addElement(g);
        }
    }

    public void remplirListEleve() {
        eleves = null;
        EleveDAO eleveDao = new EleveDAO();
        Object o = jListGroupe1.getModel().getElementAt(jListGroupe1.getSelectedIndex());
        if (o instanceof Groupe) {
            Groupe g = (Groupe) o;
            eleves = g.getEleves();
        }
        DefaultListModel dlm2 = new DefaultListModel();
        jListGroupe_gestion1.setModel(dlm2);
        for (Eleve eleve : eleves) {
            dlm2.addElement(eleve);
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

        jLabelGroupe = new javax.swing.JLabel();
        lblGroupe_gestion = new javax.swing.JLabel();
        jButtonGroupe_supprimer = new javax.swing.JButton();
        jButtonGroupe_creer2 = new javax.swing.JButton();
        lblGroupe_gestion1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListGroupe1 = new javax.swing.JList<>();
        jButtonGroupe_supprimer_membre = new javax.swing.JButton();
        jButtonGroupe_membre_creer = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListGroupe_gestion1 = new javax.swing.JList<>();
        btnGroupe_retour = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        jLabelGroupe.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelGroupe.setText("Groupe");

        lblGroupe_gestion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblGroupe_gestion.setText("Gestion des groupes");

        jButtonGroupe_supprimer.setText("Supprimer");
        jButtonGroupe_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGroupe_supprimerActionPerformed(evt);
            }
        });

        jButtonGroupe_creer2.setText("Créer");
        jButtonGroupe_creer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGroupe_creer2ActionPerformed(evt);
            }
        });

        lblGroupe_gestion1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblGroupe_gestion1.setText("Gestion des membres");

        jListGroupe1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jListGroupe1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListGroupe1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListGroupe1);

        jButtonGroupe_supprimer_membre.setText("Supprimer");
        jButtonGroupe_supprimer_membre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGroupe_supprimer_membreActionPerformed(evt);
            }
        });

        jButtonGroupe_membre_creer.setText("Ajouter");
        jButtonGroupe_membre_creer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGroupe_membre_creerActionPerformed(evt);
            }
        });

        jListGroupe_gestion1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jScrollPane3.setViewportView(jListGroupe_gestion1);

        btnGroupe_retour.setText("Retour");
        btnGroupe_retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGroupe_retourActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonGroupe_supprimer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jButtonGroupe_creer2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblGroupe_gestion, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(163, 163, 163)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonGroupe_membre_creer, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonGroupe_supprimer_membre, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblGroupe_gestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(191, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelGroupe)
                        .addGap(392, 392, 392)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGroupe_retour, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabelGroupe))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(lblGroupe_gestion)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jScrollPane3)
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(lblGroupe_gestion1)
                                        .addGap(96, 96, 96)
                                        .addComponent(jButtonGroupe_membre_creer, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(jButtonGroupe_supprimer_membre, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(198, 198, 198)
                                        .addComponent(jButtonGroupe_creer2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(jButtonGroupe_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnGroupe_retour, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnGroupe_retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGroupe_retourActionPerformed

        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.accueil());
        Frame.getFrames()[0].setVisible(true);
    }//GEN-LAST:event_btnGroupe_retourActionPerformed

    private void jButtonGroupe_creer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGroupe_creer2ActionPerformed

        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.groupes_creer());
        Frame.getFrames()[0].setVisible(true);
    }//GEN-LAST:event_jButtonGroupe_creer2ActionPerformed

    private void jButtonGroupe_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGroupe_supprimerActionPerformed
        Object o = jListGroupe1.getModel().getElementAt(jListGroupe1.getSelectedIndex());
        if (o instanceof Groupe) {
            Groupe g = (Groupe) o;
            Frame.getFrames()[0].remove(this);
            Frame.getFrames()[0].add(new project_asi_1.Views.groupes_supprimer(g));
            Frame.getFrames()[0].setVisible(true);
        }

    }//GEN-LAST:event_jButtonGroupe_supprimerActionPerformed

    private void jButtonGroupe_membre_creerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGroupe_membre_creerActionPerformed
        Object o = jListGroupe1.getModel().getElementAt(jListGroupe1.getSelectedIndex());
        if (o instanceof Groupe) {
            Groupe g = (Groupe) o;
            Frame.getFrames()[0].remove(this);
            Frame.getFrames()[0].add(new project_asi_1.Views.groupes_addmembre(g));
            Frame.getFrames()[0].setVisible(true);
        }

    }//GEN-LAST:event_jButtonGroupe_membre_creerActionPerformed

    private void jButtonGroupe_supprimer_membreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGroupe_supprimer_membreActionPerformed
        Object o = jListGroupe1.getModel().getElementAt(jListGroupe1.getSelectedIndex());
        Object o2 = jListGroupe_gestion1.getModel().getElementAt(jListGroupe_gestion1.getSelectedIndex());
        if (o instanceof Groupe) {
            if (o2 instanceof Eleve) {
                Groupe g = (Groupe) o;
                Eleve e = (Eleve) o2;
                Frame.getFrames()[0].remove(this);
                Frame.getFrames()[0].add(new project_asi_1.Views.groupes_supp_membre(e, g));
                Frame.getFrames()[0].setVisible(true);
            }

        }
    }//GEN-LAST:event_jButtonGroupe_supprimer_membreActionPerformed

    private void jListGroupe1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListGroupe1ValueChanged
        remplirListEleve();
    }//GEN-LAST:event_jListGroupe1ValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGroupe_retour;
    private javax.swing.JButton jButtonGroupe_creer2;
    private javax.swing.JButton jButtonGroupe_membre_creer;
    private javax.swing.JButton jButtonGroupe_supprimer;
    private javax.swing.JButton jButtonGroupe_supprimer_membre;
    private javax.swing.JLabel jLabelGroupe;
    private javax.swing.JList<String> jListGroupe1;
    private javax.swing.JList<String> jListGroupe_gestion1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblGroupe_gestion;
    private javax.swing.JLabel lblGroupe_gestion1;
    // End of variables declaration//GEN-END:variables
}
