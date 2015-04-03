/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.operations;

import com.github.somi92.seecsk.domain.Clan;

/**
 *
 * @author milos
 */
public class AzurirajOperacija implements SEECSKOperacije {
    
    private Operacije operacije;
    
    public AzurirajOperacija(Operacije operations) {
        this.operacije = operations;
    }

    @Override
    public String vratiImeOperacije() {
        return "Izmeni";
    }

    @Override
    public boolean izvrsiOperaciju(Object o) {
        Clan c = (Clan) o;
        return operacije.azurirajClana(c);
    }
    
}
