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
public class Kategorija {
    
    private long idKategorija;
    private String nazivKategorije;
    private String napomena;
    private List<Grupa> grupe;

    public Kategorija() {
        grupe = new ArrayList<>();
    }

    public Kategorija(long idKategorija, String nazivKategorije) {
        this();
        this.idKategorija = idKategorija;
        this.nazivKategorije = nazivKategorije;
    }

    public long getIdKategorija() {
        return idKategorija;
    }

    public void setIdKategorija(long idKategorija) {
        this.idKategorija = idKategorija;
    }

    public String getNazivKategorije() {
        return nazivKategorije;
    }

    public void setNazivKategorije(String nazivKategorije) {
        this.nazivKategorije = nazivKategorije;
    }
    
    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }
    
    public void dodajGrupu(Grupa grupa) {
        grupe.add(grupa);
    }
    
    public List<Grupa> vratiListuGrupa() {
        return grupe;
    }
    
    public void obrisiGrupu(Grupa grupa) {
        grupe.remove(grupa);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (this.idKategorija ^ (this.idKategorija >>> 32));
        hash = 59 * hash + Objects.hashCode(this.nazivKategorije);
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
        final Kategorija other = (Kategorija) obj;
        if (this.idKategorija != other.idKategorija) {
            return false;
        }
        if (!Objects.equals(this.nazivKategorije, other.nazivKategorije)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Kategorija{" + "idKategorija=" + idKategorija + ", nazivKategorije=" + nazivKategorije + '}';
    }
    
    
}
