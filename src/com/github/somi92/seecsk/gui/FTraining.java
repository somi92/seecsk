/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.gui;

import com.github.somi92.seecsk.data.Sesija;
import com.github.somi92.seecsk.domain.Grupa;
import com.github.somi92.seecsk.gui.panels.TrainingPanel;
import java.awt.CardLayout;

/**
 *
 * @author milos
 */
public class FTraining extends javax.swing.JDialog {

    /**
     * Creates new form FTraining
     */
    public FTraining(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Evidencija treninga");
        setResizable(false);

        jpnlContainer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpnlContainer.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 1547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpnlContainer;
    // End of variables declaration//GEN-END:variables

    private void initForm() {
        TrainingPanel tp = new TrainingPanel();
        Grupa g = (Grupa) Sesija.vratiInstancu().vratiMapuSesije().get(Sesija.GRUPA);
        tp.setGroup(g);
        Sesija.vratiInstancu().vratiMapuSesije().put(Sesija.GRUPA, null);
        jpnlContainer.add("trainingPanel", tp);
        CardLayout cl = (CardLayout) jpnlContainer.getLayout();
        cl.show(jpnlContainer, "trainingPanel");   
    }
}