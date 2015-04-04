/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.controllers;

import com.github.somi92.seecsk.data.DBBroker;
import com.github.somi92.seecsk.domain.Clan;
import com.github.somi92.seecsk.domain.Grupa;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author milos
 */
public class KontrolerPL {
    
    public static long vratiBrojacEntiteta(Class c) {
        DBBroker dbbroker = new DBBroker();
        dbbroker.otvoriBazuPodataka();
        long brojac = dbbroker.vratiBrojacEntiteta(c);
        dbbroker.zatvoriBazuPodataka();
        return brojac;
    }
    
    public static List<Clan> vratiListuClanova() {
        DBBroker dbbroker = new DBBroker();
        dbbroker.otvoriBazuPodataka();
        List<Clan> clanovi = dbbroker.vratiListuClanova();
        dbbroker.zatvoriBazuPodataka();
        return clanovi;
    }
    
    public static List<Grupa> vratiListuGrupa() {
        DBBroker dbbroker = new DBBroker();
        dbbroker.otvoriBazuPodataka();
        List<Grupa> grupe = dbbroker.vratiListuGrupa();
        dbbroker.zatvoriBazuPodataka();
        return grupe;
    }
    
    public static boolean sacuvajClana(Clan clan) {
        DBBroker dbbroker = new DBBroker();
        dbbroker.otvoriBazuPodataka();
        try {
            dbbroker.sacuvajClana(clan);
            dbbroker.commit();
            return true;
        } catch (SQLException ex) {
            dbbroker.rollback();
            JOptionPane.showMessageDialog(null, "Sistem ne može da sačuva člana.", "Greška", JOptionPane.ERROR_MESSAGE);
            System.out.println("Greska: " + ex.getMessage());
            return false;
        } finally {
            dbbroker.zatvoriBazuPodataka();
        }
    }
    
    public static boolean azurirajClana(Clan clan) {
        DBBroker dbbroker = new DBBroker();
        dbbroker.otvoriBazuPodataka();
        try {
            dbbroker.azurirajClana(clan);
            dbbroker.commit();
            return true;
        } catch (SQLException ex) {
            dbbroker.rollback();
            JOptionPane.showMessageDialog(null, "Sistem ne može da ažurira člana.", "Greška", JOptionPane.ERROR_MESSAGE);
            System.out.println("Greska: " + ex.getMessage());
            return false;
        } finally {
            dbbroker.zatvoriBazuPodataka();
        }
    }
    
    public static boolean obrisiClana(Clan clan) {
        DBBroker dbbroker = new DBBroker();
        dbbroker.otvoriBazuPodataka();
        try {
            dbbroker.obrisiClana(clan);
            dbbroker.commit();
            return true;
        } catch (SQLException ex) {
            dbbroker.rollback();
            JOptionPane.showMessageDialog(null, "Sistem ne može da obriše člana.", "Greška", JOptionPane.ERROR_MESSAGE);
            System.out.println("Greska: " + ex.getMessage());
            return false;
        } finally {
            dbbroker.zatvoriBazuPodataka();
        }
    }
}
