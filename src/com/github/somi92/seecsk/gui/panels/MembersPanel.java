/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.gui.panels;

import com.github.somi92.seecsk.data.Sesija;
import com.github.somi92.seecsk.domain.Clan;
import com.github.somi92.seecsk.gui.FNewMember;
import com.github.somi92.seecsk.model.controllers.KontrolerPL;
import com.github.somi92.seecsk.model.operations.Ref;
import com.github.somi92.seecsk.model.tables.ClanoviTableModel;
import com.github.somi92.seecsk.model.tables.ClanoviTableRenderer;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author milos
 */
public class MembersPanel extends javax.swing.JPanel {

    /**
     * Creates new form MembersPanel
     */
    public MembersPanel() {
        initComponents();
        initSearch();
        azurirajTabelu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMembers = new javax.swing.JPanel();
        jcmbCriteria = new javax.swing.JComboBox();
        jlblCriteria = new javax.swing.JLabel();
        jtxtfFilter = new javax.swing.JTextField();
        jlblFilter = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblMembers = new javax.swing.JTable();
        jbtnNew = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jtbtnDebt = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PanelMembers.setBorder(null);

        jcmbCriteria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Broj LK", "Ime i prezime", "Broj telefona", "Grupa" }));

        jlblCriteria.setText(" Kriterijum za filtriranje:");

        jtxtfFilter.setText(" ");
        jtxtfFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtfFilterKeyPressed(evt);
            }
        });

        jlblFilter.setText(" Filter:");

        jtblMembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Broj LK", "Ime i prezime", "E-mail", "Broj telefona", "Datum rođenja", "Datum učlanjenja", "Grupa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtblMembers);

        jbtnNew.setText(" Novi član");
        jbtnNew.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNewActionPerformed(evt);
            }
        });

        jbtnUpdate.setText("Detalji i izmena");
        jbtnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });

        jbtnDelete.setText("Obriši člana");
        jbtnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        jtbtnDebt.setText("Označi dužnike");
        jtbtnDebt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtbtnDebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbtnDebtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMembersLayout = new javax.swing.GroupLayout(PanelMembers);
        PanelMembers.setLayout(PanelMembersLayout);
        PanelMembersLayout.setHorizontalGroup(
            PanelMembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMembersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelMembersLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(PanelMembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtfFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(PanelMembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblCriteria)
                            .addComponent(jcmbCriteria, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jtbtnDebt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1422, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        PanelMembersLayout.setVerticalGroup(
            PanelMembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMembersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMembersLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(PanelMembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtbtnDebt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelMembersLayout.createSequentialGroup()
                                .addGroup(PanelMembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(PanelMembersLayout.createSequentialGroup()
                        .addGroup(PanelMembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblFilter)
                            .addComponent(jlblCriteria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelMembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtfFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmbCriteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Članovi kluba");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelMembers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelMembers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtfFilterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtfFilterKeyPressed

    }//GEN-LAST:event_jtxtfFilterKeyPressed

    private void jbtnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNewActionPerformed
        //        Sesija.vratiInstancu().vratiMapuSesije().put(Sesija.CLAN_OPERACIJA, new SacuvajOperacija(new Operacije()));
        FNewMember fNew = new FNewMember(null, this, true);
        fNew.setVisible(true);
//        System.out.println("RETURN");
    }//GEN-LAST:event_jbtnNewActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        int row = jtblMembers.getSelectedRow();
        if(row == -1) {
            JOptionPane.showMessageDialog(this, "Niste selektovali člana.");
        } else {
            //            Sesija.vratiInstancu().vratiMapuSesije().put(Sesija.CLAN_OPERACIJA, new AzurirajOperacija(new Operacije()));
            Sesija.vratiInstancu().vratiMapuSesije().put(Sesija.CLAN,
                clanoviTableModel.vratiClanoveTabele().get(row));
            FNewMember fNew = new FNewMember(null, this, true);
            fNew.setVisible(true);
        }
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        int row = jtblMembers.getSelectedRow();
        if(row == -1) {
            JOptionPane.showMessageDialog(this, "Niste selektovali člana.");
        } else {
            int response = JOptionPane.showConfirmDialog(this, "Jeste li sigurni da želite izbrisati izabranog člana?", "Potvrdite izbor", JOptionPane.OK_CANCEL_OPTION);
            if(response == JOptionPane.OK_OPTION) {
                //                KolekcijaClanova.vratiInstancu().obrisiClana(row);
                boolean res = KontrolerPL.obrisiClana(clanoviTableModel.vratiClanoveTabele().get(row));
                if(res) {
                    azurirajTabelu();
                }
            }
        }
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jtbtnDebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbtnDebtActionPerformed
        if(jtbtnDebt.isSelected()) {
            clanoviTableModel.setMark(true);
        } else {
            clanoviTableModel.setMark(false);
        }
    }//GEN-LAST:event_jtbtnDebtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMembers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnNew;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JComboBox jcmbCriteria;
    private javax.swing.JLabel jlblCriteria;
    private javax.swing.JLabel jlblFilter;
    private javax.swing.JTable jtblMembers;
    private javax.swing.JToggleButton jtbtnDebt;
    private javax.swing.JTextField jtxtfFilter;
    // End of variables declaration//GEN-END:variables
    
    private ClanoviTableModel clanoviTableModel;
    
    public void azurirajTabelu() {
//        List<Clan> lc = KolekcijaClanova.vratiInstancu().vratiSveClanove();
//        List<Clan> lc = new ArrayList<>();
        Ref<List<Clan>> ref = new Ref(new ArrayList<>());
        KontrolerPL.vratiListuClanova(ref);
        azurirajTabelu(ref.get());
    }
    
    public void azurirajTabelu(List<Clan> lc) {
        clanoviTableModel = new ClanoviTableModel(lc, jtbtnDebt.isSelected());
        jtblMembers.setModel(clanoviTableModel);
        TableColumnModel tcm = jtblMembers.getColumnModel();
        Enumeration<TableColumn> tce = tcm.getColumns();
        while(tce.hasMoreElements()) {
            TableColumn tc = tce.nextElement();
            tc.setCellRenderer(new ClanoviTableRenderer());
        }
    }
    
    private void filterSearch(String criteria) {
        String filter = criteria.toUpperCase();
//        List<Clan> sourceList = KolekcijaClanova.vratiInstancu().vratiSveClanove();
        Ref<List<Clan>> ref = new Ref<>(new ArrayList<Clan>());
        KontrolerPL.vratiListuClanova(ref);
        List<Clan> sourceList = ref.get();
        List<Clan> resultList = new ArrayList<>();
        
        if(jcmbCriteria.getSelectedItem().toString().contains("Broj LK")) {
            for(Clan clan : sourceList) {
                if(clan.getBrojLK().toUpperCase().contains(filter)) {
                    resultList.add(clan);
                }
            }
        }
        if(jcmbCriteria.getSelectedItem().toString().contains("Ime i prezime")) {
            for(Clan clan : sourceList) {
                if(clan.getImePrezime().toUpperCase().contains(filter)) {
                    resultList.add(clan);
                }
            }
        }
        if(jcmbCriteria.getSelectedItem().toString().contains("Broj telefona")) {
            for(Clan clan : sourceList) {
                if(clan.getBrojTel().toUpperCase().contains(filter)) {
                    resultList.add(clan);
                }
            }
        }
        if(jcmbCriteria.getSelectedItem().toString().contains("Grupa")) {
            for(Clan clan : sourceList) {
                if(clan.getGrupa().toString().toUpperCase().contains(filter)) {
                    resultList.add(clan);
                }
            }
        }
        
        azurirajTabelu(resultList);
    }
    
    private void initSearch() {
        
        jcmbCriteria.setSelectedIndex(1);
        
        jtxtfFilter.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                update();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                update();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                update();
            }
            
            public void update() {
                filterSearch(jtxtfFilter.getText().trim());
            }
            
        });
    }

}
