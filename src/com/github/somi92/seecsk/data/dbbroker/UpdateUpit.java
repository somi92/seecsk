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
public class UpdateUpit implements IUpitBazePodataka {

    @Override
    public String generisiUpit(IEntitetBazePodataka ebp, HashMap<String, Object> parametri) {
        String[] naziviKolona = (String[]) ebp.vratiKolone().keySet().toArray();
        String kolone = "";
        for(int i=0; i<naziviKolona.length; i++) {
            if(i == naziviKolona.length-1) {
                kolone += naziviKolona[i]+"=?";
            } else {
                kolone += naziviKolona[i]+"=?, ";
            }
        }
        String upit = "update "+ebp.vratiNazivTabele()+" set "+kolone+
                " where "+ebp.vratiIdKolonu()+"="+ebp.vratiKolone().get(ebp.vratiIdKolonu())+";";
        return upit;
    }
    
}
