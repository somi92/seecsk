/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.gui;

import com.github.somi92.seecsk.domain.Clan;
import com.github.somi92.seecsk.model.controllers.KontrolerPL;

/**
 *
 * @author milos
 */
public class FMainForm extends javax.swing.JFrame {

    /**
     * Creates new form FMainForm
     */
    public FMainForm() {
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

        jPanel1 = new javax.swing.JPanel();
        jbtnMembers = new javax.swing.JButton();
        jbtnGroupsCategories = new javax.swing.JButton();
        jbtnAttendance = new javax.swing.JButton();
        jbtnMembershipFee = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SEECSK - Sistem za elektronsku evidenciju članova sportskog kluba");

        jbtnMembers.setText("Evidencija članova");
        jbtnMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMembersActionPerformed(evt);
            }
        });

        jbtnGroupsCategories.setText("Grupe i kategorije");
        jbtnGroupsCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGroupsCategoriesActionPerformed(evt);
            }
        });

        jbtnAttendance.setText("  Evidencija dolazaka");
        jbtnAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAttendanceActionPerformed(evt);
            }
        });

        jbtnMembershipFee.setText("Evidencija članarina");
        jbtnMembershipFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMembershipFeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jbtnGroupsCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnMembershipFee, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnGroupsCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnMembershipFee, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMembersActionPerformed
        
        FMembers fMembers = new FMembers();
        fMembers.setVisible(true);
    }//GEN-LAST:event_jbtnMembersActionPerformed

    private void jbtnGroupsCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGroupsCategoriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnGroupsCategoriesActionPerformed

    private void jbtnAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAttendanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAttendanceActionPerformed

    private void jbtnMembershipFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMembershipFeeActionPerformed
        
    }//GEN-LAST:event_jbtnMembershipFeeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAttendance;
    private javax.swing.JButton jbtnGroupsCategories;
    private javax.swing.JButton jbtnMembers;
    private javax.swing.JButton jbtnMembershipFee;
    // End of variables declaration//GEN-END:variables
}
