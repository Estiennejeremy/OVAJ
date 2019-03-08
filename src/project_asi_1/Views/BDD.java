/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_asi_1.Views;

import java.awt.Frame;
import java.util.List;
import javax.swing.DefaultListModel;
import project_asi_1.Classes.Bdd;
import project_asi_1.Classes.DAO.BddDAO;
import project_asi_1.Classes.DAO.GroupeDAO;
import project_asi_1.Classes.Groupe;

/**
 *
 * @author Elodie
 */
public class BDD extends javax.swing.JPanel {

    /**
     * Creates new form BD
     */
    public BDD() {
        initComponents();
        remplirListBD();
        remplirListGroupe();
    }

    private void remplirListBD() {
        List<Bdd> b = BddDAO.getBdd();
        DefaultListModel dlm = new DefaultListModel();
        listBD_bd.setModel(dlm);
        for (Bdd bdd : b) {
            dlm.addElement(bdd);
        }
    }

    private void remplirListGroupe() {
        List<Groupe> gr = GroupeDAO.getGroupes();
        DefaultListModel dlmGr = new DefaultListModel();
        listBD_eleve.setModel(dlmGr);
        for (Groupe groupe : gr) {
            dlmGr.addElement(groupe.getNom());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        lblBD_BD = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBD_retour = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listBD_eleve = new javax.swing.JList<>();
        txtBD_search = new javax.swing.JTextField();
        btnBD_loupe = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listBD_bd = new javax.swing.JList<>();
        btnBD_creer = new javax.swing.JButton();
        btnBD_supprimer = new javax.swing.JButton();
        btnBD_modifier = new javax.swing.JButton();
        btnExit2 = new javax.swing.JButton();

        lblBD_BD.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblBD_BD.setText("Base de données");

        btnBD_retour.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnBD_retour.setText("Retour");
        btnBD_retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBD_retourActionPerformed(evt);
            }
        });

        listBD_eleve.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jScrollPane1.setViewportView(listBD_eleve);

        txtBD_search.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtBD_search.setForeground(new java.awt.Color(204, 204, 204));
        txtBD_search.setText("Rechercher...");
        txtBD_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBD_searchActionPerformed(evt);
            }
        });

        btnBD_loupe.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnBD_loupe.setText("<html>&#128269;</html>");

        listBD_bd.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jScrollPane2.setViewportView(listBD_bd);

        btnBD_creer.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnBD_creer.setText("Créer");
        btnBD_creer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBD_creerActionPerformed(evt);
            }
        });

        btnBD_supprimer.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnBD_supprimer.setText("Supprimer");
        btnBD_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBD_supprimerActionPerformed(evt);
            }
        });

        btnBD_modifier.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnBD_modifier.setText("Modifier");
        btnBD_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBD_modifierActionPerformed(evt);
            }
        });

        btnExit2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExit2.setText("X");
        btnExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(375, Short.MAX_VALUE)
                                .addComponent(lblBD_BD)
                                .addGap(282, 282, 282)
                                .addComponent(btnExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtBD_search, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnBD_loupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnBD_retour)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(btnBD_creer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(btnBD_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(btnBD_supprimer))))
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
                                        .addComponent(lblBD_BD)
                                        .addComponent(btnExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtBD_search, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(13, 13, 13))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnBD_loupe)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnBD_creer)
                                                        .addComponent(btnBD_modifier)
                                                        .addComponent(btnBD_supprimer))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                                                .addComponent(btnBD_retour)
                                                .addContainerGap())))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>

    private void btnBD_retourActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.accueil());
        Frame.getFrames()[0].setVisible(true);
    }

    private void txtBD_searchActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnBD_supprimerActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.BD_popup_suppr());
        Frame.getFrames()[0].setVisible(true);

        //        Bdd b = listBD_bd.getModel().getSelectedItem();
//        Bdd cacahuete;
//        cacahuete = bdDao.getOneBdd();
        BddDAO.deleteBdd(listBD_bd.getSelectedValuesList().get(0));
        System.out.println(listBD_bd.getSelectedValuesList().get(0));
    }

    private void btnExit2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        System.exit(0);
    }

    private void btnBD_creerActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.BD_creer());
        Frame.getFrames()[0].setVisible(true);
    }

    private void btnBD_modifierActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.BD_modifier());
        Frame.getFrames()[0].setVisible(true);
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnBD_creer;
    private javax.swing.JButton btnBD_loupe;
    private javax.swing.JButton btnBD_modifier;
    private javax.swing.JButton btnBD_retour;
    private javax.swing.JButton btnBD_supprimer;
    private javax.swing.JButton btnExit2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBD_BD;
    private javax.swing.JList<Bdd> listBD_bd;
    private javax.swing.JList<Bdd> listBD_eleve;
    private javax.swing.JTextField txtBD_search;
    // End of variables declaration
}
