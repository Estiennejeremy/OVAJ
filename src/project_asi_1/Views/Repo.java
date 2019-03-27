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
import project_asi_1.Classes.DAO.GroupeDAO;
import project_asi_1.Classes.DAO.RepoDAO;
import project_asi_1.Classes.Groupe;
import project_asi_1.Classes.Repository;

/**
 *
 * @author Elodie
 */
public class Repo extends javax.swing.JPanel {

    /**
     * Creates new form BD
     */
    public Repo() {
        initComponents();
        replirListGroupe();

    }
    public static List<Repository> repository = new ArrayList<Repository>();

    public void replirListGroupe() {
        GroupeDAO groupeDao = new GroupeDAO();
        List<Groupe> groupes = groupeDao.getGroupes();
        DefaultListModel dlm = new DefaultListModel();
        listREPO_eleve.setModel(dlm);
        for (Groupe g : groupes) {
            dlm.addElement(g);
        }
    }

    public void remplirListRepo() {
        repository = null;
        RepoDAO repoDao = new RepoDAO();
        Object o = listREPO_eleve.getModel().getElementAt(listREPO_eleve.getSelectedIndex());
        if (o instanceof Groupe) {
            Groupe g = (Groupe) o;
            repository = repoDao.getRepoByGroupe(g);
        }
        DefaultListModel dlm2 = new DefaultListModel();
        listREPO_repo.setModel(dlm2);
        for (Repository repository : repository) {
            dlm2.addElement(repository);
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

        lblREPO_Repo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnREPO_retour = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listREPO_eleve = new javax.swing.JList<>();
        txtREPO_search = new javax.swing.JTextField();
        btnREPO_loupe = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listREPO_repo = new javax.swing.JList<>();
        btnREPO_creer = new javax.swing.JButton();
        btnREPO_supprimer = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        lblREPO_Repo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblREPO_Repo.setText("Repositories");

        btnREPO_retour.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnREPO_retour.setText("Retour");
        btnREPO_retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREPO_retourActionPerformed(evt);
            }
        });

        listREPO_eleve.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        listREPO_eleve.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listREPO_eleveValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listREPO_eleve);

        txtREPO_search.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtREPO_search.setForeground(new java.awt.Color(204, 204, 204));
        txtREPO_search.setText("Rechercher...");
        txtREPO_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtREPO_searchActionPerformed(evt);
            }
        });

        btnREPO_loupe.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnREPO_loupe.setText("<html>&#128269;</html>");

        listREPO_repo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jScrollPane2.setViewportView(listREPO_repo);

        btnREPO_creer.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnREPO_creer.setText("Créer");
        btnREPO_creer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREPO_creerActionPerformed(evt);
            }
        });

        btnREPO_supprimer.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnREPO_supprimer.setText("Supprimer");
        btnREPO_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREPO_supprimerActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(478, Short.MAX_VALUE)
                .addComponent(lblREPO_Repo)
                .addGap(282, 282, 282)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtREPO_search, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnREPO_loupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnREPO_retour)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnREPO_creer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(190, 190, 190)
                            .addComponent(btnREPO_supprimer))))
                .addGap(28, 28, 28))
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
                    .addComponent(lblREPO_Repo)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtREPO_search, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnREPO_loupe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnREPO_creer)
                            .addComponent(btnREPO_supprimer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                        .addComponent(btnREPO_retour)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnREPO_retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREPO_retourActionPerformed
        // TODO add your handling code here:
        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.accueil());
        Frame.getFrames()[0].setVisible(true);
    }//GEN-LAST:event_btnREPO_retourActionPerformed

    private void txtREPO_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtREPO_searchActionPerformed
        System.out.println("try");

    }//GEN-LAST:event_txtREPO_searchActionPerformed

    private void btnREPO_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREPO_supprimerActionPerformed
        Object r = listREPO_repo.getModel().getElementAt(listREPO_repo.getSelectedIndex());
        if (r instanceof Repository) {
            Repository rep = (Repository) r;

            Frame.getFrames()[0].remove(this);
            Frame.getFrames()[0].add(new project_asi_1.Views.Repo_popup_suppr(rep));
            Frame.getFrames()[0].setVisible(true);

        }

    }//GEN-LAST:event_btnREPO_supprimerActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnREPO_creerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREPO_creerActionPerformed
        // TODO add your handling code here:
        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.Repo_creer());
        Frame.getFrames()[0].setVisible(true);
    }//GEN-LAST:event_btnREPO_creerActionPerformed

    private void listREPO_eleveValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listREPO_eleveValueChanged
        remplirListRepo();
    }//GEN-LAST:event_listREPO_eleveValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnREPO_creer;
    private javax.swing.JButton btnREPO_loupe;
    private javax.swing.JButton btnREPO_retour;
    private javax.swing.JButton btnREPO_supprimer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblREPO_Repo;
    private javax.swing.JList<String> listREPO_eleve;
    private javax.swing.JList<String> listREPO_repo;
    private javax.swing.JTextField txtREPO_search;
    // End of variables declaration//GEN-END:variables
}
