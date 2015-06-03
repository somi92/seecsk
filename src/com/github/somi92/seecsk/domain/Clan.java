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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author milos
 */

@Table("Clan")
public class Clan {
    
    @PrimaryKey("idClan")
    private long idClan;
    @Column("brojLK")
    private String brojLK;
    @Column("imePrezime")
    private String imePrezime;
    @Column("pol")
    private char pol;
    @Column("email")
    private String email;
    @Column("adresa")
    private String adresa;
    @Column("brojTel")
    private String brojTel;
    @Column("datumRodjenja")
    private Date datumRodjenja;
    @Column("datumUclanjenja")
    private Date datumUclanjenja;
    @Column("napomena")
    private String napomena;
    @ForeignKey(column = "idGrupa", referencingTable = "Grupa", referencingColumn = "idGrupa", isCollectionItem = false)
    private Grupa grupa;
    @Collection(childEntityClass = Uplata.class, referencingField = "clan")
    private List<Uplata> uplate;
    @Collection(childEntityClass = Prisustvo.class, referencingField = "clan")
    private List<Prisustvo> prisustva;

    public Clan() {
        uplate = new ArrayList<>();
        prisustva = new ArrayList<>();
        brojLK = "";
        imePrezime = "";
        email = "";
        adresa = "";
        brojTel = "";
        datumRodjenja = new Date();
        datumUclanjenja = new Date();
        napomena = "";
    }

    public Clan(String brojLK, String imePrezime, char pol, String email, String adresa, String brojTel, Date datumRodjenja, Date datumUclanjenja, String napomena) {
        this();
        this.brojLK = brojLK;
        this.imePrezime = imePrezime;
        this.pol = pol;
        this.email = email;
        this.adresa = adresa;
        this.brojTel = brojTel;
        this.datumRodjenja = datumRodjenja;
        this.datumUclanjenja = datumUclanjenja;
        this.napomena = napomena;
    }

    public long getIdClan() {
        return idClan;
    }

    public void setIdClan(long idClan) {
        this.idClan = idClan;
    }

    public String getBrojLK() {
        return brojLK;
    }

    public void setBrojLK(String brojLK) {
        this.brojLK = brojLK;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public char getPol() {
        return pol;
    }

    public void setPol(char pol) {
        this.pol = pol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getBrojTel() {
        return brojTel;
    }

    public void setBrojTel(String brojTel) {
        this.brojTel = brojTel;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public Date getDatumUclanjenja() {
        return datumUclanjenja;
    }

    public void setDatumUclanjenja(Date datumUclanjenja) {
        this.datumUclanjenja = datumUclanjenja;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public Grupa getGrupa() {
        return grupa;
    }

    public void setGrupa(Grupa grupa) {
        this.grupa = grupa;
//        this.grupa.dodajClana(this);
    }
    
    public List<Uplata> getUplate() {
        return uplate;
    }

    public void setUplate(List<Uplata> uplate) {
        this.uplate = uplate;
    }

    public List<Prisustvo> getPrisustva() {
        return prisustva;
    }

    public void setPrisustva(List<Prisustvo> prisustva) {
        this.prisustva = prisustva;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + (int) (this.idClan ^ (this.idClan >>> 32));
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
        final Clan other = (Clan) obj;
        if (this.idClan != other.idClan) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return imePrezime;
    }
}
