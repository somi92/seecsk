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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author milos
 */

@Table("Grupa")
public class Grupa {
    
    @PrimaryKey("idGrupa")
    private long idGrupa;
    @Column("naziv")
    private String naziv;
    @Column("napomena")
    private String napomena;
    private List<AngazmanZaposlenog> angazman;
//    @Collection(childEntityClass = Clan.class, referencingField = "grupa")
    private List<Clan> clanovi;
    private List<Trening> treninzi;
    private Kategorija kategorija;

    public Grupa() {
        angazman = new ArrayList<>();
        clanovi = new ArrayList<>();
        treninzi = new ArrayList<>();
        naziv = "";
        napomena = "";
    }

    public Grupa(long idGrupa, String naziv, String napomena) {
        this();
        this.idGrupa = idGrupa;
        this.naziv = naziv;
        this.napomena = napomena;
    }

    public long getIdGrupa() {
        return idGrupa;
    }

    public void setIdGrupa(long idGrupa) {
        this.idGrupa = idGrupa;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

//    public void setAngazman(List<AngazmanZaposlenog> angazman) {
//        this.angazman = angazman;
//    }
    
    public boolean dodajAngazman(AngazmanZaposlenog angazman) {
        return this.angazman.add(angazman);
    }
    
    public List<AngazmanZaposlenog> vratiListuAngazmana() {
        return angazman;
    }
    
    public boolean obrisiAngazman(AngazmanZaposlenog angazman) {
         return this.angazman.remove(angazman);
    }
    
    public void setClanovi(List<Clan> clanovi) {
        this.clanovi = clanovi;
    }
    
    public boolean dodajClana(Clan clan) {
        return clanovi.add(clan);
    }
    
    public List<Clan> vratiListuClanova() {
        return clanovi;
    }
    
    public boolean obrisiClana(Clan clan) {
        return clanovi.remove(clan);
    }

//    public void setTreninzi(List<Trening> treninzi) {
//        this.treninzi = treninzi;
//    }
    
    public boolean dodajTrening(Trening trening) {
        return treninzi.add(trening);
    }
    
    public List<Trening> vratiListuTreninga() {
        return treninzi;
    }
    
    public boolean obrisiTrening(Trening trening) {
        return treninzi.remove(trening);
    }
    
    public Kategorija getKategorija() {
        return kategorija;
    }

    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
//        this.kategorija.dodajGrupu(this);
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (this.idGrupa ^ (this.idGrupa >>> 32));
        hash = 97 * hash + Objects.hashCode(this.naziv);
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
        final Grupa other = (Grupa) obj;
        if (this.idGrupa != other.idGrupa) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return naziv;
    }
}
