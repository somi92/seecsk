/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model;

import com.github.somi92.seecsk.domain.Clan;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author milos
 */
public class KolekcijaClanova {

    private static KolekcijaClanova INSTANCE;
    private List<Clan> clanovi;
    private long brojac;
    
    private KolekcijaClanova() {
        clanovi = new ArrayList<>();
        brojac = 1;
        inicijalizujTestPodatke();
    }
    
    public static KolekcijaClanova vratiInstancu() {
        if(INSTANCE == null) {
            INSTANCE = new KolekcijaClanova();
        }
        return INSTANCE;
    }
    
    public boolean dodajClana(Clan clan) {
        if(!clanovi.contains(clan)) {
            clanovi.add(clan);
            brojac++;
            return true;
        }
        return false;
    }
    
    public boolean izmeniClana(Clan clan) {
        for(Clan c : clanovi) {
            if(c.equals(clan)) {
                clanovi.remove(c);
                clanovi.add(clan);
                return true;
            }
        }
        return false;
    }
    
    public boolean obrisiClana(Clan clan) {
        return clanovi.remove(clan);
    }
    
    public void obrisiClana(int index) {
        clanovi.remove(index);
    }
    
    public List<Clan> vratiSveClanove() {
        return clanovi;
    }
    
    public long vratiBrojac() {
        return brojac++;
    }

    private void inicijalizujTestPodatke() {
        
        Clan c1 = new Clan("123456789", "Milos Stojanovic", 'm', "milos92s@yahoo.com", "064/912-18-31",
                new GregorianCalendar(1992, 2, 31).getTime(), new GregorianCalendar(2015, 1, 12).getTime(), 
                "sdasda kl;flkfsd;oe fwpkfodskp fds flewnflkewfnlewfd;lmf femwfmdf fwkldfmd;mwldw fwkldewmfmf wfwd',';md;ew llm;l");
        c1.setIdClan(brojac);
        c1.setGrupa(KolekcijaGrupa.vratiInstancu().vratiSveGrupe().get(3));
        dodajClana(c1);
        
        Clan c2 = new Clan("432987123", "Petar Petrovic", 'm', "pera@yahoo.com", "064/912-18-31", 
                new GregorianCalendar(1992, 2, 31).getTime(), new GregorianCalendar(2015, 1, 12).getTime(), ""); 
        c2.setIdClan(brojac);
        c2.setGrupa(KolekcijaGrupa.vratiInstancu().vratiSveGrupe().get(3));
        dodajClana(c2);
        
        Clan c3 = new Clan("143980083", "Marko Markovic", 'm', "marko@yahoo.com", "064/912-18-31", 
                new GregorianCalendar(1992, 2, 31).getTime(), new GregorianCalendar(2015, 1, 12).getTime(), "");
        c3.setIdClan(brojac);
        c3.setGrupa(KolekcijaGrupa.vratiInstancu().vratiSveGrupe().get(2));
        dodajClana(c3);
        
        Clan c4 = new Clan("122332239", "Jovan Jovanovic", 'm', "jova@yahoo.com", "064/912-18-31", 
                new GregorianCalendar(1992, 2, 31).getTime(), new GregorianCalendar(2015, 1, 12).getTime(), "");
        c4.setIdClan(brojac);
        c4.setGrupa(KolekcijaGrupa.vratiInstancu().vratiSveGrupe().get(1));
        dodajClana(c4);
        
        Clan c5 = new Clan("321234789", "Nikola Nikolic", 'm', "nikola@yahoo.com", "064/912-18-31", 
                new GregorianCalendar(1992, 2, 31).getTime(), new GregorianCalendar(2015, 1, 12).getTime(), "");
        c5.setIdClan(brojac);
        c5.setGrupa(KolekcijaGrupa.vratiInstancu().vratiSveGrupe().get(0));
        dodajClana(c5);
    }
    
}
