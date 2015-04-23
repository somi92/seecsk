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
public class DeleteUpit implements IUpitBazePodataka {

    @Override
    public String generisiUpit(IEntitetBazePodataka ebp, HashMap<String, Object> parametri) {
        String upit = "delete from "+ebp.vratiNazivTabele()+" where "+
                ebp.vratiIdKolonu()+"="+ebp.vratiKolone().get(ebp.vratiIdKolonu())+";";
        return upit;
    }
    
}
