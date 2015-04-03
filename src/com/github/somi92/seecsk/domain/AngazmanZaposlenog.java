/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.domain;

import java.util.Objects;

/**
 *
 * @author milos
 */
public class AngazmanZaposlenog {
    
    private Grupa grupa;
    private Zaposleni zaposleni;
    private String uloga;

    public AngazmanZaposlenog() {
    }

    public AngazmanZaposlenog(Grupa grupa, Zaposleni zaposleni, String uloga) {
        this.grupa = grupa;
        this.zaposleni = zaposleni;
        this.uloga = uloga;
        this.grupa.dodajAngazman(this);
        this.zaposleni.dodajAngazman(this);
    }

    public Grupa getGrupa() {
        return grupa;
    }

    public void setGrupa(Grupa grupa) {
        this.grupa = grupa;
        this.grupa.dodajAngazman(this);
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
        this.zaposleni.dodajAngazman(this);
    }

    public String getUloga() {
        return uloga;
    }

    public void setUloga(String uloga) {
        this.uloga = uloga;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.grupa);
        hash = 19 * hash + Objects.hashCode(this.zaposleni);
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
        final AngazmanZaposlenog other = (AngazmanZaposlenog) obj;
        if (!Objects.equals(this.grupa, other.grupa)) {
            return false;
        }
        if (!Objects.equals(this.zaposleni, other.zaposleni)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AngazmanZaposlenog{" + "grupa=" + grupa + ", zaposleni=" + zaposleni + ", uloga=" + uloga + '}';
    }
    
    
}
