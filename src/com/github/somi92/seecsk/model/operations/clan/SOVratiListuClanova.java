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
import java.util.List;

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
        listaClanova = dbbroker.vratiListuClanova();
    }

    @Override
    public String vratiImeOperacije() {
        return this.getClass().getSimpleName();
    }
    
    public List<Clan> vratiListuClanova() {
        return listaClanova;
    }
}
