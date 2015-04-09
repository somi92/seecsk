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
public class UpdateUpit implements IUpitBazePodataka {

    @Override
    public String generisiUpit(IEntitetBazePodataka ebp) {
        String[] naziviKolona = ebp.vratiNaziveKolona();
        String parametri = "";
        for(int i=0; i<naziviKolona.length; i++) {
            if(i == naziviKolona.length-1) {
                parametri += naziviKolona[i]+"=?";
            } else {
                parametri += naziviKolona[i]+"=?, ";
            }
        }
        String upit = "update "+ebp.vratiNazivTabele()+" set "+parametri+
                " where "+ebp.vratiIdKolonu()+"="+ebp.vratiVrednostiKolona()[0]+";";
        return upit;
    }
    
}
