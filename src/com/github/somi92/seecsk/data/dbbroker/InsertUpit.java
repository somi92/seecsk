/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.data.dbbroker;

import com.github.somi92.seecsk.data.IEntitetBazePodataka;

/**
 *
 * @author milos
 */
public class InsertUpit implements IUpitBazePodataka {

    @Override
    public String generisiUpit(IEntitetBazePodataka ebp) {
        Object[] kolone = ebp.vratiVrednostiKolona();
        String parametri = "";
        for(int i=0; i<kolone.length; i++) {
            if(i == kolone.length-1) {
                parametri += "?";
            } else {
                parametri += "?,";
            }
        }
        String upit = "insert into "+ebp.vratiNazivTabele()+" values ("+parametri+");";
        return upit;
    }
    
}
