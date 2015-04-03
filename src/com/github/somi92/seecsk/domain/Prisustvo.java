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
public class Prisustvo {
    
    private int redniBroj;
    private boolean prisustvo;
    private int kasnjenjeMin;
    private Trening trening;
    private Clan clan;

    public Prisustvo() {
    }

    public Prisustvo(int redniBroj, boolean prisustvo, int kasnjenjeMin, Trening trening, Clan clan) {
        this.redniBroj = redniBroj;
        this.prisustvo = prisustvo;
        this.kasnjenjeMin = kasnjenjeMin;
        this.trening = trening;
        this.clan = clan;
        this.clan.dodajPrisustvo(this);
        this.trening.dodajPrisustvo(this);
    }

    public int getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }

    public boolean isPrisustvo() {
        return prisustvo;
    }

    public void setPrisustvo(boolean prisustvo) {
        this.prisustvo = prisustvo;
    }

    public int getKasnjenjeMin() {
        return kasnjenjeMin;
    }

    public void setKasnjenjeMin(int kasnjenjeMin) {
        this.kasnjenjeMin = kasnjenjeMin;
    }

    public Trening getTrening() {
        return trening;
    }

    public void setTrening(Trening trening) {
        this.trening = trening;
        this.trening.dodajPrisustvo(this);
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
        this.clan.dodajPrisustvo(this);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.redniBroj;
        hash = 59 * hash + Objects.hashCode(this.trening);
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
        final Prisustvo other = (Prisustvo) obj;
        if (this.redniBroj != other.redniBroj) {
            return false;
        }
        if (!Objects.equals(this.trening, other.trening)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Prisustvo{" + "redniBroj=" + redniBroj + ", prisustvo=" + prisustvo + ", kasnjenjeMin=" + kasnjenjeMin + ", trening=" + trening + ", clan=" + clan + '}';
    }
    
    
}
