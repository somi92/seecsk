/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.data;

import com.github.somi92.seecsk.domain.Clan;
import com.github.somi92.seecsk.domain.Grupa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author milos
 */
public class DBBroker {
    
    private Connection konekcija;
    
    private String drajverBaze = "com.mysql.jdbc.Driver";
    private String hostPort = "localhost:3306";
    private String bazaPodataka = "seecsk";
    private String user = "seecsk";
    private String password = "seecsk@2015";
    
    public void otvoriBazuPodataka() {
        try {
            ucitajDrajver();
            konekcija = DriverManager.getConnection("jdbc:mysql://"+hostPort+"/"+bazaPodataka, user, password);
            System.out.println("Uspostavljenja veza sa bazom podataka: " + hostPort + "/"+bazaPodataka);
            konekcija.setAutoCommit(false);
        } catch (ClassNotFoundException ex) {
            System.out.println("Greska pri ucitavanju drajvera: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Greska u radu sa bazom: " + ex.getMessage());
        }
    }
    
    public void commit() {
        try {
            konekcija.commit();
        } catch (SQLException ex) {
            System.out.println("Greska u radu sa bazom, ne moze se izvrsiti commit: " + ex.getMessage());
        }
    }
    
    public void rollback() {
        try {
            konekcija.rollback();
        } catch (SQLException ex) {
            System.out.println("Greska u radu sa bazom, ne moze se izvrsiti rollback: " + ex.getMessage());
        }
    }
    
    public void zatvoriBazuPodataka() {
        try {
            konekcija.close();
        } catch (SQLException ex) {
            System.out.println("Greska u radu sa bazom, ne moze se zatvoriti konekcija: " + ex.getMessage());
        }
    }

    private void ucitajDrajver() throws ClassNotFoundException {
        Class.forName(drajverBaze);
    }
    
    public List<Clan> vratiListuClanova() {
        List<Clan> clanovi = new ArrayList<>();
        try {
            Statement stm = konekcija.createStatement();
            String upit = "select idClan, brojLK, imePrezime, pol, email, brojTel, datumRodjenja, datumUclanjenja, Clan.napomena as clanNapomena, \n" +
                        "Grupa.idGrupa, Grupa.naziv as grupaNaziv, Grupa.napomena as grupaNapomena\n" +
                        "from Clan join Grupa using(idGrupa);";
            ResultSet rs = stm.executeQuery(upit);
            while(rs.next()) {
                
                Grupa g = new Grupa(rs.getLong("idGrupa"), rs.getString("grupaNaziv"), rs.getString("grupaNapomena"));
                Clan clan = new Clan();
                clan.setIdClan(rs.getLong("idClan"));
                clan.setBrojLK(rs.getString("brojLK"));
                clan.setImePrezime(rs.getString("imePrezime"));
                clan.setPol(rs.getString("pol").charAt(0));
                clan.setEmail(rs.getString("email"));
                clan.setBrojTel(rs.getString("brojTel"));
                clan.setDatumRodjenja(new Date(rs.getDate("datumRodjenja").getTime()));
                clan.setDatumUclanjenja(new Date(rs.getDate("datumUclanjenja").getTime()));
                clan.setNapomena(rs.getString("clanNapomena"));
                clan.setGrupa(g);
                
                clanovi.add(clan);
            }
        } catch (SQLException ex) {
            System.out.println("Greska u radu sa bazom, ne moze se vratiti lista clanova: " + ex.getMessage());
        }
        return clanovi;
    }
}
