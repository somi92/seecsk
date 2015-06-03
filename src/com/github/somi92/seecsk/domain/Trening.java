/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.domain;

import com.github.somi92.sqldbb.annotations.Collection;
import com.github.somi92.sqldbb.annotations.Column;
import com.github.somi92.sqldbb.annotations.ForeignKey;
import com.github.somi92.sqldbb.annotations.PrimaryKey;
import com.github.somi92.sqldbb.annotations.Table;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author milos
 */

@Table("Trening")
public class Trening {
    
    @PrimaryKey("idTrening")
    private long idTrening;
    @Column("datumVreme")
    private Date datumVreme;
    @Column("trajanjeMin")
    private int trajanjeMin;
    @Column("opisTreninga")
    private String opisTreninga;
    @PrimaryKey("idGrupa")
    @ForeignKey(column = "idGrupa", referencingTable = "Grupa", referencingColumn = "idGrupa", isCollectionItem = false)
    private Grupa grupa;
//    @Collection(childEntityClass = Prisustvo.class, referencingField = "trening")
    private List<Prisustvo> prisustva;

    public Trening() {
    }

    public Trening(long idTrening, Date datumVreme, int trajanjeMin, String opisTreninga, Grupa grupa) {
        this.idTrening = idTrening;
        this.datumVreme = datumVreme;
        this.trajanjeMin = trajanjeMin;
        this.opisTreninga = opisTreninga;
        this.grupa = grupa;
    }

    public long getIdTrening() {
        return idTrening;
    }

    public void setIdTrening(long idTrening) {
        this.idTrening = idTrening;
    }

    public Date getDatumVreme() {
        return datumVreme;
    }

    public void setDatumVreme(Date datumVreme) {
        this.datumVreme = datumVreme;
    }

    public int getTrajanjeMin() {
        return trajanjeMin;
    }

    public void setTrajanjeMin(int trajanjeMin) {
        this.trajanjeMin = trajanjeMin;
    }

    public String getOpisTreninga() {
        return opisTreninga;
    }

    public void setOpisTreninga(String opisTreninga) {
        this.opisTreninga = opisTreninga;
    }

    public Grupa getGrupa() {
        return grupa;
    }

    public void setGrupa(Grupa grupa) {
        this.grupa = grupa;
    }

    public List<Prisustvo> getPrisustva() {
        return prisustva;
    }

    public void setPrisustva(List<Prisustvo> prisustva) {
        this.prisustva = prisustva;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (this.idTrening ^ (this.idTrening >>> 32));
        hash = 23 * hash + Objects.hashCode(this.grupa);
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
        final Trening other = (Trening) obj;
        if (this.idTrening != other.idTrening) {
            return false;
        }
        if (!Objects.equals(this.grupa, other.grupa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Trening{" + "idTrening=" + idTrening + ", datumVreme=" + datumVreme + ", trajanjeMin=" + trajanjeMin + ", opisTreninga=" + opisTreninga + ", grupa=" + grupa + ", prisustva=" + prisustva + '}';
    }

    
}
