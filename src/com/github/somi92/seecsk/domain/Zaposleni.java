/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milos
 */
public class Zaposleni {
    
    private long idZaposleni;
    private String imePrezime;
    private String email;
    private String brojTel;
    private String korisnickoIme;
    private String sifra;
    private String napomena;
    private List<AngazmanZaposlenog> angazmani;

    public Zaposleni() {
        angazmani = new ArrayList<>();
    }

    public Zaposleni(long idZaposleni, String imePrezime, String email, String brojTel, String korisnickoIme, String sifra, String napomena) {
        this();
        this.idZaposleni = idZaposleni;
        this.imePrezime = imePrezime;
        this.email = email;
        this.brojTel = brojTel;
        this.korisnickoIme = korisnickoIme;
        this.sifra = sifra;
        this.napomena = napomena;
    }

    public long getIdZaposleni() {
        return idZaposleni;
    }

    public void setIdZaposleni(long idZaposleni) {
        this.idZaposleni = idZaposleni;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
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

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public List<AngazmanZaposlenog> vratiSveAngazmane() {
        return angazmani;
    }

    public boolean dodajAngazman(AngazmanZaposlenog angazman) {
        return angazmani.add(angazman);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (this.idZaposleni ^ (this.idZaposleni >>> 32));
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
        final Zaposleni other = (Zaposleni) obj;
        if (this.idZaposleni != other.idZaposleni) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Zaposleni{" + "idZaposleni=" + idZaposleni + ", imePrezime=" + imePrezime + '}';
    }
    
    
}
