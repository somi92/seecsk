/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.domain;

import java.util.Date;
import java.util.List;

/**
 *
 * @author milos
 */
public class Clan {
    
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
    }

    public Clan(long idClan, String brojLK, String imePrezime, char pol, String email, String brojTel, Date datumRodjenja, Date datumUclanjenja, String napomena, Grupa grupa) {
        this.idClan = idClan;
        this.brojLK = brojLK;
        this.imePrezime = imePrezime;
        this.pol = pol;
        this.email = email;
        this.brojTel = brojTel;
        this.datumRodjenja = datumRodjenja;
        this.datumUclanjenja = datumUclanjenja;
        this.napomena = napomena;
        this.grupa = grupa;
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
    }

    public List<Uplata> getUplate() {
        return uplate;
    }

    public void setUplate(List<Uplata> uplate) {
        this.uplate = uplate;
    }

    public List<Prisustvo> getPrisustva() {
        return prisustva;
    }

    public void setPrisustva(List<Prisustvo> prisustva) {
        this.prisustva = prisustva;
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
    
    
}
