/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.data.dbbroker;

import com.github.somi92.seecsk.data.IEntitetBazePodataka;
import com.github.somi92.seecsk.domain.Clan;
import com.github.somi92.seecsk.domain.Grupa;
import com.github.somi92.seecsk.domain.Kategorija;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

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
            konekcija = DriverManager.getConnection("jdbc:mysql://"+hostPort+"/"+bazaPodataka+"?useUnicode=yes&characterEncoding=UTF-8", user, password);
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
            System.out.println("Prekinuta je veza sa bazom podataka: " + hostPort + "/"+bazaPodataka);
        } catch (SQLException ex) {
            System.out.println("Greska u radu sa bazom, ne moze se zatvoriti konekcija: " + ex.getMessage());
        }
    }

    private void ucitajDrajver() throws ClassNotFoundException {
        Class.forName(drajverBaze);
    }
    
    public long vratiBrojacEntiteta(Class c) {
        long brojac = 0;
        try {
            String klasa = c.getSimpleName();
            Statement stm = konekcija.createStatement();
            String upit = "select count(id"+klasa+") as brojac from "+klasa+";";
            ResultSet rs = stm.executeQuery(upit);
            while(rs.next()) {
                brojac = rs.getLong("brojac");
            }
            rs.close();
            stm.close();
        } catch (SQLException ex) {
            System.out.println("Greska u radu sa bazom, ne moze se vratiti brojac: " + ex.getMessage());
        }
        return brojac;
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
            rs.close();
            stm.close();
        } catch (SQLException ex) {
            System.out.println("Greska u radu sa bazom, ne moze se vratiti lista clanova: " + ex.getMessage());
        }
        return clanovi;
    }
    
    public List<Grupa> vratiListuGrupa() {
        List<Grupa> grupe = new ArrayList<>();
        try {
            Statement stm = konekcija.createStatement();
            String upit = "select idGrupa, Grupa.naziv as grupaNaziv, Grupa.napomena as grupaNapomena, "
                    + "idKategorija, Kategorija.naziv as kategorijaNaziv, Kategorija.napomena as kategorijaNapomena "
                    + "from Grupa join Kategorija using(idKategorija);";
            ResultSet rs = stm.executeQuery(upit);
            while(rs.next()) {
                Kategorija k = new Kategorija();
                k.setIdKategorija(rs.getLong("idKategorija"));
                k.setNazivKategorije(rs.getString("kategorijaNaziv"));
                k.setNapomena(rs.getString("kategorijaNapomena"));
                Grupa g = new Grupa();
                g.setIdGrupa(rs.getLong("idGrupa"));
                g.setNaziv(rs.getString("grupaNaziv"));
                g.setNapomena(rs.getString("grupaNapomena"));
                g.setKategorija(k);
                grupe.add(g);
            }
            rs.close();
            stm.close();
        } catch (SQLException ex) {
            System.out.println("Greska u radu sa bazom, ne moze se vratiti lista grupa: " + ex.getMessage());
        }
        return grupe;
    }
    
    public void sacuvajClana(Clan clan) throws SQLException {
        String upit = "insert into Clan values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = konekcija.prepareStatement(upit);
        ps.setLong(1, clan.getIdClan());
        ps.setString(2, clan.getBrojLK());
        ps.setString(3, clan.getImePrezime());
        ps.setString(4, clan.getPol()+"");
        ps.setString(5, clan.getEmail());
        ps.setString(6, clan.getBrojTel());
        ps.setDate(7, new java.sql.Date(clan.getDatumRodjenja().getTime()));
        ps.setDate(8, new java.sql.Date(clan.getDatumUclanjenja().getTime()));
        ps.setString(9, clan.getNapomena());
        ps.setLong(10, clan.getGrupa().getIdGrupa());
        ps.executeUpdate();
        ps.close();
    }
    
    public void azurirajClana(Clan clan) throws SQLException {
        String upit = "update Clan set"
                + " idClan=?, brojLK=?, imePrezime=?, pol=?, email=?,"
                + " brojTel=?, datumRodjenja=?, datumUclanjenja=?, napomena=?, idGrupa=?"
                + " where idClan=?;";
        PreparedStatement ps = konekcija.prepareStatement(upit);
        ps.setLong(1, clan.getIdClan());
        ps.setString(2, clan.getBrojLK());
        ps.setString(3, clan.getImePrezime());
        ps.setString(4, clan.getPol()+"");
        ps.setString(5, clan.getEmail());
        ps.setString(6, clan.getBrojTel());
        ps.setDate(7, new java.sql.Date(clan.getDatumRodjenja().getTime()));
        ps.setDate(8, new java.sql.Date(clan.getDatumUclanjenja().getTime()));
        ps.setString(9, clan.getNapomena());
        ps.setLong(10, clan.getGrupa().getIdGrupa());
        ps.setLong(11, clan.getIdClan());
        ps.executeUpdate();
        ps.close();
    }
    
    public void obrisiClana(Clan clan) throws SQLException {
        String upit = "delete from Clan where idClan=?;";
        PreparedStatement ps = konekcija.prepareStatement(upit);
        ps.setLong(1, clan.getIdClan());
        ps.execute();
        ps.close();
    }
    
    /******************************************************************/
    
    public void sacuvajIliAzurirajEntitet(IEntitetBazePodataka ebp) throws SQLException {
        IEntitetBazePodataka entitet = ucitajEntitet(ebp);
        String upit = "";
        IUpitBazePodataka upitGenerator = null;
        if(entitet != null) {
            // azuriraj
            upitGenerator = UpitFactory.vratiUpit(UpitFactory.TIP_UPDATE_UPIT);
        } else {
            // ubaci
            upitGenerator = UpitFactory.vratiUpit(UpitFactory.TIP_INSERT_UPIT);
        }
        upit = upitGenerator.generisiUpit(ebp, null);
        PreparedStatement ps = pripremiPSUpit(ebp, upit);
        ps.executeUpdate();
        ps.close();
    }
    
    private PreparedStatement pripremiPSUpit(IEntitetBazePodataka ebp, String upit) throws SQLException {
        Object[] kolone = ebp.vratiKolone().values().toArray();
        PreparedStatement ps = konekcija.prepareStatement(upit);
        for(int i=0; i<kolone.length; i++) {
                String klasa = kolone[i].getClass().getSimpleName();
                
                switch(klasa) {
                    case "Integer":
                        ps.setInt(i+1, (int) kolone[i]);
                        break;
                    case "String":
                        ps.setString(i+1, (String) kolone[i]);
                        break;
                    case "Long":
                        ps.setLong(i+1, (long) kolone[i]);
                        break;
                    case "Float":
                        ps.setFloat(i+1, (float) kolone[i]);
                        break;
                    case "Double":
                        ps.setDouble(i+1, (double) kolone[i]);
                        break;
                    case "Boolean":
                        ps.setBoolean(i+1, (boolean) kolone[i]);
                        break;
                    case "Date":
                        ps.setDate(i+1, (java.sql.Date) kolone[i]);
                        break;
                    default:
                        ps.setString(i+1, kolone[i].toString());
                }
        }
        return ps;
    }
    
    private IEntitetBazePodataka ucitajEntitet(IEntitetBazePodataka ebp) throws SQLException {
        
//        IUpitBazePodataka upitGenerator = UpitFactory.vratiUpit(UpitFactory.TIP_INSERT_UPIT);
        IUpitBazePodataka upitGenerator = UpitFactory.vratiUpit(UpitFactory.TIP_SELECT_UPIT);
        HashMap<String, Object> kriterijum = new HashMap<>();
        kriterijum.put(ebp.vratiIdKolonu(), ebp.vratiKolone().get(ebp.vratiIdKolonu()));
        String upit = upitGenerator.generisiUpit(ebp, kriterijum);
        
        Statement stm = konekcija.createStatement();
        
        ResultSet rs = stm.executeQuery(upit);
        Object[] k = ebp.vratiKolone().values().toArray();
        IEntitetBazePodataka noviEbp = null;
        
        while(rs.next()) {
//            Object[] vrednostiKolona = new Object[k.length];
            HashMap<String,Object> vrednostiKolona = new HashMap<>();
            String[] kljucevi = ebp.vratiKolone().keySet().toArray(new String[ebp.vratiKolone().keySet().size()]);
            for(int i=0; i<kljucevi.length; i++) {
                String klasa = k[i].getClass().getSimpleName();
                
                switch(klasa) {
                    case "Integer":
                        vrednostiKolona.put(kljucevi[i], rs.getInt(kljucevi[i]));
                        break;
                    case "String":
                        vrednostiKolona.put(kljucevi[i], rs.getString(kljucevi[i]));
                        break;
                    case "Long":
                        vrednostiKolona.put(kljucevi[i], rs.getLong(kljucevi[i]));
                        break;
                    case "Float":
                        vrednostiKolona.put(kljucevi[i], rs.getFloat(kljucevi[i]));
                        break;
                    case "Double":
                        vrednostiKolona.put(kljucevi[i], rs.getDouble(kljucevi[i]));
                        break;
                    case "Boolean":
                        vrednostiKolona.put(kljucevi[i], rs.getBoolean(kljucevi[i]));
                        break;
                    case "Date":
                        vrednostiKolona.put(kljucevi[i], rs.getDate(kljucevi[i]));
                        break;
                    default:
                        vrednostiKolona.put(kljucevi[i], rs.getString(kljucevi[i]));
                }
            }
            noviEbp = ebp.vratiEntitet(vrednostiKolona);
        }
        stm.close();
        rs.close();
        
        return noviEbp;
    }
        
}
