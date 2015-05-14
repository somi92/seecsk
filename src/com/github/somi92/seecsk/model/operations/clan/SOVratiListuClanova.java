/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.operations.clan;

import com.github.somi92.seecsk.domain.Clan;
import com.github.somi92.seecsk.model.exceptions.so.PreduslovException;
import com.github.somi92.seecsk.model.exceptions.so.SOException;
import com.github.somi92.seecsk.model.exceptions.so.ValidacijaException;
import com.github.somi92.seecsk.model.operations.ApstraktnaSistemskaOperacija;
import com.github.somi92.seecsk.model.operations.Ref;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milos
 */
public class SOVratiListuClanova extends ApstraktnaSistemskaOperacija {

    private Ref<List<Clan>> listaClanova;
    
    public SOVratiListuClanova(Ref<List<Clan>> listaClanova) {
        this.listaClanova = listaClanova;
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
            listaClanova.set(dbbroker.loadEntities(new Clan(), null, false));
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Greska -> "+this.getClass().getName()+": "+ex.getMessage());
        }
    }

    @Override
    public String vratiImeOperacije() {
        return this.getClass().getSimpleName();
    }
    
//    public List<Clan> vratiListuClanova() {
//        return listaClanova.get();
//    }
}
