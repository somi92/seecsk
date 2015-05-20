/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.domain;

import com.github.somi92.sqldbb.annotations.Collection;
import com.github.somi92.sqldbb.annotations.Column;
import com.github.somi92.sqldbb.annotations.PrimaryKey;
import com.github.somi92.sqldbb.annotations.Table;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author milos
 */

@Table("Clanarina")
public class Clanarina {
    
    @PrimaryKey("idClanarina")
    private long idClanarina;
    @Column("datumOd")
    private Date datumOd;
    @Column("datumDo")
    private Date datumDo;
    @Column("napomena")
    private String napomena;
//    @Collection(childEntityClass = Uplata.class, referencingField = "clanarina")
    private List<Uplata> uplate;

    public Clanarina() {
    }

    public Clanarina(long idClanarina, Date datumOd, Date datumDo, String napomena) {
        this.idClanarina = idClanarina;
        this.datumOd = datumOd;
        this.datumDo = datumDo;
        this.napomena = napomena;
    }

    public long getIdClanarina() {
        return idClanarina;
    }

    public void setIdClanarina(long idClanarina) {
        this.idClanarina = idClanarina;
    }

    public Date getDatumOd() {
        return datumOd;
    }

    public void setDatumOd(Date datumOd) {
        this.datumOd = datumOd;
    }

    public Date getDatumDo() {
        return datumDo;
    }

    public void setDatumDo(Date datumDo) {
        this.datumDo = datumDo;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }
    
    public List<Uplata> getUplate() {
        return uplate;
    }

    public void setUplate(List<Uplata> uplate) {
        this.uplate = uplate;
    }

    public List<Uplata> vratiSveUplate() {
        return uplate;
    }

    public boolean dodajUplatu(Uplata uplata) {
        return uplate.add(uplata);
    }
    
    public boolean obrisiUplatu(Uplata uplata) {
        return uplate.remove(uplata);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (this.idClanarina ^ (this.idClanarina >>> 32));
        hash = 97 * hash + Objects.hashCode(this.datumOd);
        hash = 97 * hash + Objects.hashCode(this.datumDo);
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
        final Clanarina other = (Clanarina) obj;
        if (this.idClanarina != other.idClanarina) {
            return false;
        }
        if (!Objects.equals(this.datumOd, other.datumOd)) {
            return false;
        }
        if (!Objects.equals(this.datumDo, other.datumDo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return new SimpleDateFormat("dd/MM/yyyy").format(datumOd) + " - " + new SimpleDateFormat("dd/MM/yyyy").format(datumDo);
    }
}
