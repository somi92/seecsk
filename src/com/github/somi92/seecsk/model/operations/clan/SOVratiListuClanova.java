/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.operations.clan;

import com.github.somi92.seecsk.data.IEntitetBazePodataka;
import com.github.somi92.seecsk.domain.Clan;
import com.github.somi92.seecsk.model.exceptions.so.PreduslovException;
import com.github.somi92.seecsk.model.exceptions.so.SOException;
import com.github.somi92.seecsk.model.exceptions.so.ValidacijaException;
import com.github.somi92.seecsk.model.operations.ApstraktnaSistemskaOperacija;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author milos
 */
public class SOVratiListuClanova extends ApstraktnaSistemskaOperacija {

    private List<Clan> listaClanova;
    
    public SOVratiListuClanova(List<Clan> listaClanova) {
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
            List<IEntitetBazePodataka> entiteti = dbbroker.vratiListuEntiteta(new Clan(), null);
            for(IEntitetBazePodataka ebp : entiteti) {
                listaClanova.add((Clan) ebp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String vratiImeOperacije() {
        return this.getClass().getSimpleName();
    }
    
    public List<Clan> vratiListuClanova() {
        return listaClanova;
    }
}
