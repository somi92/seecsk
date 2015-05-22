/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.operations.trening;

import com.github.somi92.seecsk.domain.Trening;
import com.github.somi92.seecsk.model.exceptions.so.PreduslovException;
import com.github.somi92.seecsk.model.exceptions.so.SOException;
import com.github.somi92.seecsk.model.exceptions.so.ValidacijaException;
import com.github.somi92.seecsk.model.operations.ApstraktnaSistemskaOperacija;
import com.github.somi92.seecsk.model.operations.Ref;
import java.sql.SQLException;

/**
 *
 * @author milos
 */
public class SOUcitajTrening extends ApstraktnaSistemskaOperacija {
    
    private Ref<Trening> trening;

    public SOUcitajTrening(Ref<Trening> trening) {
        this.trening = trening;
    }
    
    @Override
    protected void izvrsiValidaciju() throws ValidacijaException {
        
    }

    @Override
    protected void proveriPreduslove() throws PreduslovException {
        
    }

    @Override
    protected void izvrsiDBTransakciju() throws SOException {
        try {
//            Trening t = trening.get();
//            t = dbbroker.loadEntity(t, true);
            trening.set(dbbroker.loadEntity(trening.get(), true));
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Greska -> "+this.getClass().getName()+": "+ex.getMessage());
        }
    }

    @Override
    public String vratiImeOperacije() {
        return this.getClass().getSimpleName();
    }
}
