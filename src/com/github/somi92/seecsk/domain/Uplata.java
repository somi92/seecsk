/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.domain;

import com.github.somi92.sqldbb.annotations.Column;
import com.github.somi92.sqldbb.annotations.ForeignKey;
import com.github.somi92.sqldbb.annotations.PrimaryKey;
import com.github.somi92.sqldbb.annotations.Table;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author milos
 */

@Table("Uplata")
public class Uplata {
    
    @PrimaryKey("idClanarina")
    @ForeignKey(column = "idClanarina", referencingTable = "Clanarina", referencingColumn = "idClanarina", isCollectionItem = false)
    private Clanarina clanarina;
//    @PrimaryKey("redniBroj")
//    private int redniBroj;
    @Column("iznos")
    private double iznos;
    @Column("datumUplate")
    private Date datumUplate;
    @PrimaryKey("idClan")
    @ForeignKey(column = "idClan", referencingTable = "Clan", referencingColumn = "idClan", isCollectionItem = true)
    private Clan clan;

    public Uplata() {
    }

    public Uplata(Clanarina clanarina, double iznos, Date datumUplate, Clan clan) {
        this.clanarina = clanarina;
        this.iznos = iznos;
        this.datumUplate = datumUplate;
        this.clan = clan;
//        this.clanarina.dodajUplatu(this);
//        this.clan.dodajUplatu(this);
    }

    public Clanarina getClanarina() {
        return clanarina;
    }

    public void setClanarina(Clanarina clanarina) {
        this.clanarina = clanarina;
//        this.clanarina.dodajUplatu(this);
    }
    
//    public int getRedniBroj() {
//        return redniBroj;
//    }
//
//    public void setRedniBroj(int redniBroj) {
//        this.redniBroj = redniBroj;
//    }

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
        hash = 61 * hash + Objects.hashCode(this.clanarina);
        hash = 61 * hash + Objects.hashCode(this.clan);
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
        if (!Objects.equals(this.clan, other.clan)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Uplata{" + "clanarina=" + clanarina + ", iznos=" + iznos + ", datumUplate=" + datumUplate + ", clan=" + clan + '}';
    }
    
    
}
