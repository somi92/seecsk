/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author milos
 */
public class Grupa {
    
    private long idGrupa;
    private String naziv;
    private String napomena;
    private List<Staff> zaposleni;
    private List<Member> clanovi;
    private Kategorija kategorija;

    public Grupa() {
        zaposleni = new ArrayList<>();
        clanovi = new ArrayList<>();
    }

    public Grupa(long idGrupa, String naziv) {
        this();
        this.idGrupa = idGrupa;
        this.naziv = naziv;
    }

    public long getIdGrupa() {
        return idGrupa;
    }

    public void setIdGrupa(long idGrupa) {
        this.idGrupa = idGrupa;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }
    
    public List<Staff> getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(List<Staff> zaposleni) {
        this.zaposleni = zaposleni;
    }
    
    public Kategorija getKategorija() {
        return kategorija;
    }

    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
        kategorija.dodajGrupu(this);
    }
    
    public void dodajZaposlenog(Staff zaposleni) {
        this.zaposleni.add(zaposleni);
    }
    
    public List<Staff> vratiListuZaposlenih() {
        return zaposleni;
    }
    
    public void obrisiZaposlenog(Staff zaposleni) {
         this.zaposleni.remove(zaposleni);
    }
    
    public void dodajClana(Member clan) {
        clanovi.add(clan);
    }
    
    public List<Member> vratiListuClanova() {
        return clanovi;
    }
    
    public void obrisiClana(Member clan) {
        clanovi.remove(clan);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (this.idGrupa ^ (this.idGrupa >>> 32));
        hash = 97 * hash + Objects.hashCode(this.naziv);
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
        final Grupa other = (Grupa) obj;
        if (this.idGrupa != other.idGrupa) {
            return false;
        }
        if (this.naziv != other.naziv) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return naziv;
    } 
}
