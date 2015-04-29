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
public class InsertUpit implements IUpitBazePodataka {

    @Override
    public String generisiUpit(IEntitetBazePodataka ebp, HashMap<String, Object> parametri) {
        String[] naziviKolona = ebp.vratiKolone().keySet().toArray(new String[ebp.vratiKolone().keySet().size()]);
        int duzina = naziviKolona.length;
        String kolone = "";
        String vrednosti = "";
        for(int i=0; i<duzina; i++) {
            if(i == duzina-1) {
                vrednosti += "?";
                kolone += naziviKolona[i];
            } else {
                vrednosti += "?,";
                kolone += naziviKolona[i] + ",";
            }
        }
        String upit = "insert into "+ebp.vratiNazivTabele()+" ("+kolone+") values ("+vrednosti+");";
        return upit;
    }
    
}
