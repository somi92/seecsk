/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.main;

import com.github.somi92.seecsk.data.IEntitetBazePodataka;
import com.github.somi92.seecsk.domain.Clan;
import com.github.somi92.seecsk.gui.FMainForm;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author milos
 */
public class Main {
    
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMainForm().setVisible(true);
            }
        });
    }
}
