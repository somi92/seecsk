/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.data.dbbroker;

import com.github.somi92.seecsk.data.IEntitetBazePodataka;
import java.util.HashMap;

/**
 *
 * @author milos
 */
public class SelectUpit implements IUpitBazePodataka {

    @Override
    public String generisiUpit(IEntitetBazePodataka ebp, HashMap<String, Object> parametri) {
        String[] naziviKolona = ebp.vratiKolone().keySet().toArray(new String[ebp.vratiKolone().keySet().size()]);
        String kolone = "";
        for(int i=0; i<naziviKolona.length; i++) {
            if(i == naziviKolona.length-1) {
                kolone += naziviKolona[i];
            } else {
                kolone += naziviKolona[i]+", ";
            }
        }
        String kriterijum = "";
        if(parametri != null) {
            kriterijum = " where ";
            String[] kljucevi = parametri.keySet().toArray(new String[parametri.keySet().size()]);
            for(int i=0; i<kljucevi.length; i++) {
                kriterijum += kljucevi[i]+"="+parametri.get(kljucevi[i]);
            }
        }
//        String upit = "select "+kolone+" from "+ebp.vratiNazivTabele()+
//                " where "+ebp.vratiIdKolonu()+"="+ebp.vratiKolone().get(ebp.vratiIdKolonu())+";";
        String upit = "select "+kolone+" from "+ebp.vratiNazivTabele()+kriterijum+";";
        return upit;
    }
    
}
