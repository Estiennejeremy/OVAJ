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
import project_asi_1.Classes.Bdd;
import project_asi_1.Classes.DAO.BddDAO;
import project_asi_1.Classes.DAO.GroupeDAO;
import project_asi_1.Classes.Groupe;

/**
 *
 * @author Lucas
 */
public class BaseDD extends javax.swing.JPanel {

    /**
     * Creates new form BaseDD
     */
    public List<Bdd> bdds = new ArrayList<Bdd>();

    public BaseDD() {
        initComponents();

        remplirListGroupe();
    }

    private void remplirListBD() {

        bdds = null;
        BddDAO bdDao = new BddDAO();
        Object o = listBD_eleve.getModel().getElementAt(listBD_eleve.getSelectedIndex());
        if (o instanceof Groupe) {
            Groupe g = (Groupe) o;
            bdds = bdDao.getBddByGroupe(g);
        }
        DefaultListModel dlm2 = new DefaultListModel();
        listBD_BD.setModel(dlm2);
        for (Bdd bd : bdds) {
            dlm2.addElement(bd);
        }

    }

    private void remplirListGroupe() {
        GroupeDAO GroupeDao = new GroupeDAO();
        List<Groupe> gr = GroupeDao.getGroupes();
        DefaultListModel dlmGr = new DefaultListModel();
        listBD_eleve.setModel(dlmGr);
        for (Groupe groupe : gr) {
            dlmGr.addElement(groupe);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listBD_eleve = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listBD_BD = new javax.swing.JList<>();
        btnBDCréer = new javax.swing.JButton();
        BtnBDSupprimer = new javax.swing.JButton();
        btnBDRetour = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Base de donnée");

        listBD_eleve.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        listBD_eleve.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listBD_eleve.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listBD_eleveValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listBD_eleve);

        listBD_BD.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jScrollPane2.setViewportView(listBD_BD);

        btnBDCréer.setText("Créer");
        btnBDCréer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBDCréerActionPerformed(evt);
            }
        });

        BtnBDSupprimer.setText("Supprimer");
        BtnBDSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBDSupprimerActionPerformed(evt);
            }
        });

        btnBDRetour.setText("Retour");
        btnBDRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBDRetourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnBDRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBDCréer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnBDSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnBDRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBDCréer, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBDSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBDCréerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBDCréerActionPerformed
        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.BD_creer());
        Frame.getFrames()[0].setVisible(true);
    }//GEN-LAST:event_btnBDCréerActionPerformed

    private void btnBDRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBDRetourActionPerformed
        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.accueil());
        Frame.getFrames()[0].setVisible(true);
    }//GEN-LAST:event_btnBDRetourActionPerformed

    private void BtnBDSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBDSupprimerActionPerformed
        Object b = listBD_BD.getModel().getElementAt(listBD_BD.getSelectedIndex());
        if (b instanceof Bdd) {
            Bdd bdd = (Bdd) b;

            Frame.getFrames()[0].remove(this);
            Frame.getFrames()[0].add(new project_asi_1.Views.BD_popup_suppr(bdd));
            Frame.getFrames()[0].setVisible(true);

        }
    }//GEN-LAST:event_BtnBDSupprimerActionPerformed

    private void listBD_eleveValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listBD_eleveValueChanged
        remplirListBD();
    }//GEN-LAST:event_listBD_eleveValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBDSupprimer;
    private javax.swing.JButton btnBDCréer;
    private javax.swing.JButton btnBDRetour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listBD_BD;
    private javax.swing.JList<String> listBD_eleve;
    // End of variables declaration//GEN-END:variables
}
