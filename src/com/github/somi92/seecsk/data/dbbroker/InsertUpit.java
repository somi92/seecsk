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
        int duzina = ebp.vratiKolone().values().toArray().length;
        String kolone = "";
        for(int i=0; i<duzina; i++) {
            if(i == duzina-1) {
                kolone += "?";
            } else {
                kolone += "?,";
            }
        }
        String upit = "insert into "+ebp.vratiNazivTabele()+" values ("+kolone+");";
        return upit;
    }
    
}
