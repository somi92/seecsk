/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.domain;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author milos
 */
public class Trening {
    
    private long idTrening;
    private Date datumVreme;
    private int trajanjeMin;
    private String opisTreninga;
    private Grupa grupa;
    private List<Prisustvo> prisustva;

    public Trening() {
    }

    public Trening(long idTrening, Date datumVreme, int trajanjeMin, String opisTreninga, Grupa grupa) {
        this.idTrening = idTrening;
        this.datumVreme = datumVreme;
        this.trajanjeMin = trajanjeMin;
        this.opisTreninga = opisTreninga;
        this.grupa = grupa;
        this.grupa.dodajTrening(this);
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
        this.grupa.dodajTrening(this);
    }

    public List<Prisustvo> vratiSvaPrisustva() {
        return prisustva;
    }

    public boolean dodajPrisustvo(Prisustvo prisustvo) {
        return prisustva.add(prisustvo);
    }
    
    public boolean obrisiPrisustvo(Prisustvo prisustvo) {
        return prisustva.remove(prisustvo);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (this.idTrening ^ (this.idTrening >>> 32));
        hash = 53 * hash + Objects.hashCode(this.datumVreme);
        hash = 53 * hash + Objects.hashCode(this.grupa);
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
        if (!Objects.equals(this.datumVreme, other.datumVreme)) {
            return false;
        }
        if (!Objects.equals(this.grupa, other.grupa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Trening{" + "idTrening=" + idTrening + ", datumVreme=" + datumVreme + ", grupa=" + grupa + '}';
    }
    
    
}
