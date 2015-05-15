/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.gui;

import com.github.somi92.seecsk.data.Sesija;
import com.github.somi92.seecsk.domain.Clan;
import com.github.somi92.seecsk.domain.Grupa;
import com.github.somi92.seecsk.domain.Uplata;
import com.github.somi92.seecsk.gui.panels.MembersPanel;
import com.github.somi92.seecsk.model.controllers.KontrolerPL;
import com.github.somi92.seecsk.model.operations.Ref;
import com.github.somi92.seecsk.model.tables.UplateTableModel;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicBorders;

/**
 *
 * @author milos
 */
public class FNewMember extends javax.swing.JDialog {

//    private FMembers parent;
    private MembersPanel caller;
    private Clan clan;
    
    /**
     * Creates new form FNewMember
     */
    public FNewMember(FMembers parent, MembersPanel caller, boolean modal) {
        super(parent, modal);
        this.caller = caller;
//        this.operacije = (ApstraktnaSistemskaOperacija) Sesija.vratiInstancu().vratiMapuSesije().get(Sesija.CLAN_OPERACIJA);
        initComponents();
        clan = (Clan) Sesija.vratiInstancu().vratiMapuSesije().get(Sesija.CLAN);
        initForm(clan);
        Sesija.vratiInstancu().vratiMapuSesije().put(Sesija.CLAN, null);
        Sesija.vratiInstancu().vratiMapuSesije().put(Sesija.CLAN_OPERACIJA, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlblFirstLastName = new javax.swing.JLabel();
        jlblPol = new javax.swing.JLabel();
        jlblEmail = new javax.swing.JLabel();
        jlblPhoneNum = new javax.swing.JLabel();
        jlblDateOfBirth = new javax.swing.JLabel();
        jlblMembershipDate = new javax.swing.JLabel();
        jlblGroup = new javax.swing.JLabel();
        jlblRemark = new javax.swing.JLabel();
        jtxtFirstLastName = new javax.swing.JTextField();
        jtxtEmail = new javax.swing.JTextField();
        jtxtPhoneNum = new javax.swing.JTextField();
        jcmbGender = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtaRemark = new javax.swing.JTextArea();
        jcmbGroup = new javax.swing.JComboBox();
        jdccDateOfBirth = new datechooser.beans.DateChooserCombo();
        jdccMembershipDate = new datechooser.beans.DateChooserCombo();
        jlblNameError = new javax.swing.JLabel();
        jlblEmailError = new javax.swing.JLabel();
        jlblPhoneError = new javax.swing.JLabel();
        jlblIdCardError = new javax.swing.JLabel();
        jtxtIdCard = new javax.swing.JTextField();
        jlblidCard = new javax.swing.JLabel();
        jbtnSave = new javax.swing.JButton();
        jbtnEmpty = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jpnlClanarina = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblUplate = new javax.swing.JTable();
        jpnlPrisustva = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtblPrisustva = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SEECSK - Unos novog člana");
        setResizable(false);

        jlblFirstLastName.setText("Ime i prezime:");

        jlblPol.setText("Pol:");

        jlblEmail.setText("E-mail:");

        jlblPhoneNum.setText("Broj telefona:");

        jlblDateOfBirth.setText("Datum rođenja:");

        jlblMembershipDate.setText("Datum učlanjenja:");

        jlblGroup.setText("Grupa:");

        jlblRemark.setText("Napomena:");

        jtxtFirstLastName.setText(" ");
        jtxtFirstLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtFirstLastNameFocusGained(evt);
            }
        });

        jtxtEmail.setText(" ");
        jtxtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtEmailFocusGained(evt);
            }
        });
        jtxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEmailActionPerformed(evt);
            }
        });

        jtxtPhoneNum.setText(" ");
        jtxtPhoneNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtPhoneNumFocusGained(evt);
            }
        });

        jcmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Muški", "Ženski" }));

        jtxtaRemark.setColumns(20);
        jtxtaRemark.setLineWrap(true);
        jtxtaRemark.setRows(5);
        jScrollPane1.setViewportView(jtxtaRemark);

        jdccDateOfBirth.setCalendarPreferredSize(new java.awt.Dimension(340, 240));
        jdccDateOfBirth.setFormat(2);
        jdccDateOfBirth.setLocale(new java.util.Locale("sr", "BA", ""));

        jdccMembershipDate.setCalendarPreferredSize(new java.awt.Dimension(340, 240));
        jdccMembershipDate.setLocale(new java.util.Locale("sr", "BA", ""));

        jlblNameError.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        jlblNameError.setForeground(new java.awt.Color(255, 0, 0));

        jlblEmailError.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        jlblEmailError.setForeground(new java.awt.Color(255, 0, 0));
        jlblEmailError.setText(" ");

        jlblPhoneError.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        jlblPhoneError.setForeground(new java.awt.Color(255, 0, 0));
        jlblPhoneError.setText(" ");

        jlblIdCardError.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        jlblIdCardError.setForeground(new java.awt.Color(255, 0, 0));

        jtxtIdCard.setText(" ");
        jtxtIdCard.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtIdCardFocusGained(evt);
            }
        });

        jlblidCard.setText("Broj lične karte:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblPol, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlblEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblPhoneNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblDateOfBirth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblMembershipDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblRemark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jlblFirstLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblidCard, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtIdCard, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtFirstLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblIdCardError, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdccDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdccMembershipDate, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblPhoneError, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblEmailError, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmbGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtIdCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblidCard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblIdCardError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblFirstLastName)
                    .addComponent(jtxtFirstLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jlblNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblPol)
                    .addComponent(jcmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblEmail)
                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblEmailError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jlblPhoneError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblDateOfBirth)
                    .addComponent(jdccDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdccMembershipDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblMembershipDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblGroup)
                    .addComponent(jcmbGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblRemark))
                .addContainerGap())
        );

        jbtnSave.setText(" Sačuvaj");
        jbtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveActionPerformed(evt);
            }
        });

        jbtnEmpty.setText(" Poništi sve");
        jbtnEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEmptyActionPerformed(evt);
            }
        });

        jbtnExit.setText("Izađi");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jpnlClanarina.setBorder(javax.swing.BorderFactory.createTitledBorder("Uplate članarine izabranog člana"));

        jtblUplate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtblUplate);

        javax.swing.GroupLayout jpnlClanarinaLayout = new javax.swing.GroupLayout(jpnlClanarina);
        jpnlClanarina.setLayout(jpnlClanarinaLayout);
        jpnlClanarinaLayout.setHorizontalGroup(
            jpnlClanarinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlClanarinaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnlClanarinaLayout.setVerticalGroup(
            jpnlClanarinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlClanarinaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jpnlPrisustva.setBorder(javax.swing.BorderFactory.createTitledBorder("Evidentirana prisustva za izabranog člana"));

        jtblPrisustva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jtblPrisustva);

        javax.swing.GroupLayout jpnlPrisustvaLayout = new javax.swing.GroupLayout(jpnlPrisustva);
        jpnlPrisustva.setLayout(jpnlPrisustvaLayout);
        jpnlPrisustvaLayout.setHorizontalGroup(
            jpnlPrisustvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlPrisustvaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnlPrisustvaLayout.setVerticalGroup(
            jpnlPrisustvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlPrisustvaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jbtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnlClanarina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnlPrisustva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnlClanarina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jpnlPrisustva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnEmpty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEmailActionPerformed

    private void jtxtFirstLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtFirstLastNameFocusGained
        jtxtFirstLastName.setBorder(defaultBorder);
        jlblNameError.setText("");
    }//GEN-LAST:event_jtxtFirstLastNameFocusGained

    private void jtxtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtEmailFocusGained
        jtxtEmail.setBorder(defaultBorder);
        jlblEmailError.setText("");
    }//GEN-LAST:event_jtxtEmailFocusGained

    private void jtxtPhoneNumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtPhoneNumFocusGained
        jtxtPhoneNum.setBorder(defaultBorder);
        jlblPhoneError.setText("");
    }//GEN-LAST:event_jtxtPhoneNumFocusGained

    private void jbtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveActionPerformed
        String idClana = jtxtIdCard.getText().trim();
        String imePrezime = jtxtFirstLastName.getText().trim();
        char pol = (jcmbGender.getSelectedItem().toString().equals("Muški") ? 'M' : 'Ž');
        String email = jtxtEmail.getText().trim();
        String brojTel = jtxtPhoneNum.getText().trim();
        Calendar datumRodjenja = jdccDateOfBirth.getSelectedDate();
        Calendar datumUclanjenja = jdccMembershipDate.getSelectedDate();
        Grupa grupa = (Grupa) jcmbGroup.getSelectedItem();
        String napomena = jtxtaRemark.getText().trim();
        
        boolean isValidated = validateInput(idClana, imePrezime, email, brojTel);
        if(isValidated) { 
            if(clan == null ) {
                Ref<Clan> c = new Ref(new Clan());
                KontrolerPL.kreirajClana(c);
                clan = c.get();
            }
//            Clan clan = new Clan(idClana, imePrezime, pol, email, brojTel, datumRodjenja.getTime(), datumUclanjenja.getTime(), napomena);
            clan.setBrojLK(idClana);
            clan.setImePrezime(imePrezime);
            clan.setPol(pol);
            clan.setEmail(email);
            clan.setBrojTel(brojTel);
            clan.setDatumRodjenja(datumRodjenja.getTime());
            clan.setDatumUclanjenja(datumUclanjenja.getTime());
            clan.setNapomena(napomena);
            clan.setGrupa(grupa);
            boolean res = KontrolerPL.sacuvajIliAzurirajClana(clan);
            if(res) {
                JOptionPane.showMessageDialog(this, "Član je uspešno zapamćen.");
                caller.azurirajTabelu();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Sistem ne može da sačuva člana.", "Greška", JOptionPane.ERROR_MESSAGE);
            }
        } else {
//            JOptionPane.showMessageDialog(this, "Podaci nisu validni, pokušajte ponovo.");
        }
    }//GEN-LAST:event_jbtnSaveActionPerformed

    private void jtxtIdCardFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtIdCardFocusGained
        jtxtIdCard.setBorder(defaultBorder);
        jlblIdCardError.setText("");
    }//GEN-LAST:event_jtxtIdCardFocusGained

    private void jbtnEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEmptyActionPerformed
        resetFields();
    }//GEN-LAST:event_jbtnEmptyActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        dispose();
    }//GEN-LAST:event_jbtnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtnEmpty;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnSave;
    private javax.swing.JComboBox jcmbGender;
    private javax.swing.JComboBox jcmbGroup;
    private datechooser.beans.DateChooserCombo jdccDateOfBirth;
    private datechooser.beans.DateChooserCombo jdccMembershipDate;
    private javax.swing.JLabel jlblDateOfBirth;
    private javax.swing.JLabel jlblEmail;
    private javax.swing.JLabel jlblEmailError;
    private javax.swing.JLabel jlblFirstLastName;
    private javax.swing.JLabel jlblGroup;
    private javax.swing.JLabel jlblIdCardError;
    private javax.swing.JLabel jlblMembershipDate;
    private javax.swing.JLabel jlblNameError;
    private javax.swing.JLabel jlblPhoneError;
    private javax.swing.JLabel jlblPhoneNum;
    private javax.swing.JLabel jlblPol;
    private javax.swing.JLabel jlblRemark;
    private javax.swing.JLabel jlblidCard;
    private javax.swing.JPanel jpnlClanarina;
    private javax.swing.JPanel jpnlPrisustva;
    private javax.swing.JTable jtblPrisustva;
    private javax.swing.JTable jtblUplate;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtFirstLastName;
    private javax.swing.JTextField jtxtIdCard;
    private javax.swing.JTextField jtxtPhoneNum;
    private javax.swing.JTextArea jtxtaRemark;
    // End of variables declaration//GEN-END:variables
    private Border errorBorder;
    private Border defaultBorder;
//    private ApstraktnaSistemskaOperacija operacije;
    
    private void initBorders() {
        defaultBorder = jtxtFirstLastName.getBorder();
        errorBorder = new BasicBorders.ButtonBorder(Color.red, Color.red, Color.red, Color.red);
    }
    
    private boolean validateInput(String idCard, String firstLastName, String email, String phoneNumber) {
        boolean isValid = true;
        
        if(idCard == null || idCard.isEmpty() || !idCard.matches("[A-Za-z0-9]{9}")) {
            jlblIdCardError.setText("Morate uneti broj lične karte (9 znakova).");
            jtxtIdCard.setBorder(errorBorder);
            isValid = false;
        }
        
        if(firstLastName == null || firstLastName.isEmpty()) {
            jlblNameError.setText("Morate uneti ime i prezime.");
            jtxtFirstLastName.setBorder(errorBorder);
            isValid = false;
        }
        
        if(email != null && !email.isEmpty() && !email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}")) {
            jlblEmailError.setText("E-mail foramt je nepravilan.");
            jtxtEmail.setBorder(errorBorder);
            isValid = false;
        }
        
        if(phoneNumber == null || phoneNumber.isEmpty()) {
            jlblPhoneError.setText("Broj telefona nije unet.");
            jtxtPhoneNum.setBorder(errorBorder);
            isValid = false;
        }
        
        return isValid;
    }
    
    private void initGroupsCombo() {
        Ref<List<Grupa>> ref = new Ref(new ArrayList<>());
        KontrolerPL.vratiListuGrupa(ref);
        List<Grupa> groups = ref.get();
        for(Grupa g : groups) {
            jcmbGroup.addItem(g);
        }
    }
    
    private void resetFields() {
        jtxtFirstLastName.setText("");
        jtxtIdCard.setText("");
        jtxtEmail.setText("");
        jtxtPhoneNum.setText("");
        jtxtaRemark.setText("");
    }

    private void initForm(Clan clan) {
        resetFields();
        initBorders();
        initGroupsCombo();
        
        UplateTableModel utm = new UplateTableModel();
        jtblUplate.setModel(utm);
        
        if(clan != null) {
            
//            memberId = clan.getIdClan();
            
            jtxtIdCard.setText(clan.getBrojLK());
            jtxtFirstLastName.setText(clan.getImePrezime());
            jcmbGender.setSelectedItem(clan.getPol());
            jtxtEmail.setText(clan.getEmail());
            jtxtPhoneNum.setText(clan.getBrojTel());
            jcmbGender.setSelectedItem(clan.getPol() == 'M' ? "Muški" : "Ženski");
            Calendar dob = Calendar.getInstance();
            dob.setTime(clan.getDatumRodjenja());
            jdccDateOfBirth.setSelectedDate(dob);
            Calendar dom = Calendar.getInstance();
            dom.setTime(clan.getDatumUclanjenja());
            jdccMembershipDate.setSelectedDate(dom);
            jcmbGroup.setSelectedItem(clan.getGrupa());
            jtxtaRemark.setText(clan.getNapomena());
            
            setTitle("SEECSK - Detalji i izmena člana");
            jbtnSave.setText("Izmeni");
            
//            Uplata u = new Uplata();
//            u.setClan(clan);
//            List<Uplata> ul = new ArrayList<>();
//            ul.add(u);
//            Ref<List<Uplata>> uplateRef = new Ref(ul);
//            List<String> pretraga = new ArrayList<>();
//            pretraga.add("clan");
//            KontrolerPL.vratiClanarine(uplateRef, pretraga);
//            ul = uplateRef.get();
            utm.postaviUplateTabele(clan.getUplate());
            
        } else {
            
//            memberId = KontrolerPL.vratiBrojacEntiteta(Clan.class)+1;
            setTitle("SEECSK - Unos novog člana");
            jbtnSave.setText("Sačuvaj");
        }
    }

}