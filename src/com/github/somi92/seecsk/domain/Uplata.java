/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.domain;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author milos
 */
public class Uplata {
    
    private Clanarina clanarina;
    private int redniBroj;
    private double iznos;
    private Date datumUplate;
    private Clan clan;

    public Uplata() {
    }

    public Uplata(Clanarina clanarina, int redniBroj, double iznos, Date datumUplate, Clan clan) {
        this.clanarina = clanarina;
        this.redniBroj = redniBroj;
        this.iznos = iznos;
        this.datumUplate = datumUplate;
        this.clan = clan;
    }

    public Clanarina getClanarina() {
        return clanarina;
    }

    public void setClanarina(Clanarina clanarina) {
        this.clanarina = clanarina;
    }
    
    public int getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public Date getDatumUplate() {
        return datumUplate;
    }

    public void setDatumUplate(Date datumUplate) {
        this.datumUplate = datumUplate;
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.clanarina);
        hash = 83 * hash + this.redniBroj;
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
        final Uplata other = (Uplata) obj;
        if (!Objects.equals(this.clanarina, other.clanarina)) {
            return false;
        }
        if (this.redniBroj != other.redniBroj) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Uplata{" + "clanarina=" + clanarina + ", redniBroj=" + redniBroj + ", iznos=" + iznos + ", datumUplate=" + datumUplate + ", clan=" + clan + '}';
    }
    
    
}
