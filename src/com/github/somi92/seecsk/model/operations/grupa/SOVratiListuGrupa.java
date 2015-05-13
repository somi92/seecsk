/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.operations.grupa;

import com.github.somi92.seecsk.domain.Grupa;
import com.github.somi92.seecsk.model.exceptions.so.PreduslovException;
import com.github.somi92.seecsk.model.exceptions.so.SOException;
import com.github.somi92.seecsk.model.exceptions.so.ValidacijaException;
import com.github.somi92.seecsk.model.operations.ApstraktnaSistemskaOperacija;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author milos
 */
public class SOVratiListuGrupa extends ApstraktnaSistemskaOperacija {
    
    private List<Grupa> listaGrupa;
    
    public SOVratiListuGrupa(List<Grupa> listaGrupa) {
        this.listaGrupa = listaGrupa;
    }

    @Override
    protected void izvrsiValidaciju() throws ValidacijaException {
        
    }

    @Override
    protected void proveriPreduslove() throws PreduslovException {
        
    }

    @Override
    protected void izvrsiDBTransakciju() throws SOException {
//        try {
//            List<IEntitetBazePodataka> entiteti = dbbroker.vratiListuEntiteta(new Grupa(), null);
//            for(IEntitetBazePodataka ebp : entiteti) {
//                listaGrupa.add((Grupa) ebp);
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
    }

    @Override
    public String vratiImeOperacije() {
        return this.getClass().getSimpleName();
    }
    
    public List<Grupa> vratiListuGrupa() {
        return listaGrupa;
    }
}
