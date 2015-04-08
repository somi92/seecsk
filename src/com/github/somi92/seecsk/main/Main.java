/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.main;

import com.github.somi92.seecsk.gui.FMainForm;
import java.util.Date;
import java.util.GregorianCalendar;

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
        
        String a = "STRING";
//        boolean a = true;
//        float a = 25;
        Date ud = new Date();
        java.sql.Date sd = new java.sql.Date(new GregorianCalendar().getTimeInMillis());
        Object o = sd;
        
        System.out.println(o.getClass().getSimpleName());
        System.out.println((Date) o);
    }
}
