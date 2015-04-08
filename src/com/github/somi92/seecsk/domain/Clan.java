/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.domain;

import com.github.somi92.seecsk.data.IEntitetBazePodataka;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author milos
 */
public class Clan implements IEntitetBazePodataka {
    
    private long idClan;
    private String brojLK;
    private String imePrezime;
    private char pol;
    private String email;
    private String brojTel;
    private Date datumRodjenja;
    private Date datumUclanjenja;
    private String napomena;
    private Grupa grupa;
    private List<Uplata> uplate;
    private List<Prisustvo> prisustva;

    public Clan() {
        uplate = new ArrayList<>();
        prisustva = new ArrayList<>();
    }

    public Clan(String brojLK, String imePrezime, char pol, String email, String brojTel, Date datumRodjenja, Date datumUclanjenja, String napomena) {
        this();
        this.brojLK = brojLK;
        this.imePrezime = imePrezime;
        this.pol = pol;
        this.email = email;
        this.brojTel = brojTel;
        this.datumRodjenja = datumRodjenja;
        this.datumUclanjenja = datumUclanjenja;
        this.napomena = napomena;
    }

    public long getIdClan() {
        return idClan;
    }

    public void setIdClan(long idClan) {
        this.idClan = idClan;
    }

    public String getBrojLK() {
        return brojLK;
    }

    public void setBrojLK(String brojLK) {
        this.brojLK = brojLK;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public char getPol() {
        return pol;
    }

    public void setPol(char pol) {
        this.pol = pol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBrojTel() {
        return brojTel;
    }

    public void setBrojTel(String brojTel) {
        this.brojTel = brojTel;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public Date getDatumUclanjenja() {
        return datumUclanjenja;
    }

    public void setDatumUclanjenja(Date datumUclanjenja) {
        this.datumUclanjenja = datumUclanjenja;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public Grupa getGrupa() {
        return grupa;
    }

    public void setGrupa(Grupa grupa) {
        this.grupa = grupa;
//        this.grupa.dodajClana(this);
    }

    boolean dodajUplatu(Uplata uplata) {
        return uplate.add(uplata);
    }
    
    public List<Uplata> vratiListuUplata() {
        return uplate;
    }
    
    boolean dodajPrisustvo(Prisustvo prisustvo) {
        return prisustva.add(prisustvo);
    }

    public List<Prisustvo> vratiListuPrisustva() {
        return prisustva;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + (int) (this.idClan ^ (this.idClan >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Clan other = (Clan) obj;
        if (this.idClan != other.idClan) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clan{" + "idClan=" + idClan + ", imePrezime=" + imePrezime + '}';
    }

    @Override
    public String vratiNazivTabele() {
        return "Clan";
    }
    
    @Override
    public String[] vratiNaziveKolona() {
        String [] naziviKolona = {"idClan","brojLK","imePrezime","pol","email","brojTel",
                        "datumRodjenja","datumUclanjenja","napomena","idGrupa"};
        return naziviKolona;
    }

    @Override
    public Object[] vratiVrednostiKolona() {
        String sDatumRodjenja = new SimpleDateFormat("yyyy-MM-dd").format(datumRodjenja);
        String sDatumUclanjenja = new SimpleDateFormat("yyyy-MM-dd").format(datumUclanjenja);
//        return idClan+", '"+brojLK +"', '"+imePrezime+"', '"+pol+"', '"+email+"', '"+brojTel+"', '"
//                +sDatumRodjenja+"', '"+sDatumUclanjenja+"', '"+napomena+"', "+grupa.getIdGrupa()+";";
        Object[] kolone = {idClan, brojLK, imePrezime, pol, email, brojTel, 
            sDatumRodjenja, sDatumUclanjenja, napomena, grupa.getIdGrupa()};
        
        return kolone;
    }  
}
