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
 * @author Lucas
 */
public class BaseDD extends javax.swing.JPanel {

    /**
     * Creates new form BaseDD
     */
    public BaseDD() {
        initComponents();
        remplirListBD();
        remplirListGroupe();
    }

    private void remplirListBD() {
        BddDAO bdDao = new BddDAO();
        List<Bdd> b = bdDao.getBdd();
        DefaultListModel dlm = new DefaultListModel();
        listBD_BD.setModel(dlm);
        for (Bdd bdd : b) {
            dlm.addElement(bdd);
        }
    }

    private void remplirListGroupe() {
        GroupeDAO GroupeDao = new GroupeDAO();
        List<Groupe> gr = GroupeDao.getGroupes();
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listBD_eleve = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listBD_BD = new javax.swing.JList<>();
        btnBDCréer = new javax.swing.JButton();
        btnBDModifier = new javax.swing.JButton();
        BtnBDSupprimer = new javax.swing.JButton();
        btnBDRetour = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Base de donnée");

        listBD_eleve.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listBD_eleve);

        listBD_BD.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listBD_BD);

        btnBDCréer.setText("Créer");
        btnBDCréer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBDCréerActionPerformed(evt);
            }
        });

        btnBDModifier.setText("Modifier");
        btnBDModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBDModifierActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBDCréer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnBDModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(BtnBDSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBDRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2))
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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBDModifier, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(BtnBDSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBDCréer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(btnBDRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.BD_popup_suppr());
        Frame.getFrames()[0].setVisible(true);
        BddDAO bdDao = new BddDAO();
        Object o = listBD_BD.getModel().getElementAt(listBD_BD.getSelectedIndex());
        Bdd b = new Bdd();
        if (o instanceof Bdd) {
            b = (Bdd) o;
            bdDao.deleteBdd(b);
        }
        System.out.println(listBD_BD.getSelectedValuesList().get(0));
    }//GEN-LAST:event_BtnBDSupprimerActionPerformed

    private void btnBDModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBDModifierActionPerformed
        Frame.getFrames()[0].remove(this);
        Frame.getFrames()[0].add(new project_asi_1.Views.BD_modifier());
        Frame.getFrames()[0].setVisible(true);
    }//GEN-LAST:event_btnBDModifierActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBDSupprimer;
    private javax.swing.JButton btnBDCréer;
    private javax.swing.JButton btnBDModifier;
    private javax.swing.JButton btnBDRetour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listBD_BD;
    private javax.swing.JList<String> listBD_eleve;
    // End of variables declaration//GEN-END:variables
}