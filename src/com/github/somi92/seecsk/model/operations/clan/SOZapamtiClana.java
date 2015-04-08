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

/**
 *
 * @author milos
 */
public class SOZapamtiClana extends ApstraktnaSistemskaOperacija {

    private Clan clan;
    
    public SOZapamtiClana(Clan clan) {
        this.clan = clan;
    } 
    
    @Override
    protected void izvrsiValidaciju() throws ValidacijaException {
        
    }

    @Override
    protected void proveriPreduslove() throws PreduslovException {
        
    }

    @Override
    protected void izvrsiDBTransakciju() throws SOException {
        dbbroker.sacuvajIliAzurirajEntitet(clan);
    }

    @Override
    public String vratiImeOperacije() {
        
        return this.getClass().getSimpleName();
    }
}
