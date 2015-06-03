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
import java.util.Objects;

/**
 *
 * @author milos
 */

@Table("Prisustvo")
public class Prisustvo {
    
    @Column("prisustvo")
    private boolean prisustvo;
    @Column("kasnjenjeMin")
    private int kasnjenjeMin;
    @PrimaryKey("idTrening")
    @ForeignKey(column = "idTrening", referencingTable = "Trening", referencingColumn = "idTrening", isCollectionItem = false)
    private Trening trening;
    @PrimaryKey("idClan")
    @ForeignKey(column = "idClan", referencingTable = "Clan", referencingColumn = "idClan", isCollectionItem = true)
    private Clan clan;

    public Prisustvo() {
    }

    public Prisustvo(boolean prisustvo, int kasnjenjeMin, Trening trening, Clan clan) {
        this.prisustvo = prisustvo;
        this.kasnjenjeMin = kasnjenjeMin;
        this.trening = trening;
        this.clan = clan;
    }

    public boolean getPrisustvo() {
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
        hash = 37 * hash + Objects.hashCode(this.trening);
        hash = 37 * hash + Objects.hashCode(this.clan);
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
        if (!Objects.equals(this.trening, other.trening)) {
            return false;
        }
        if (!Objects.equals(this.clan, other.clan)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Prisustvo{" + "prisustvo=" + prisustvo + ", kasnjenjeMin=" + kasnjenjeMin + ", trening=" + trening + ", clan=" + clan + '}';
    }
    
    
}
