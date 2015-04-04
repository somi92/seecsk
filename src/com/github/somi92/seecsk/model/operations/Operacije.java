/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.operations;

import com.github.somi92.seecsk.domain.Clan;
import com.github.somi92.seecsk.model.controllers.KontrolerPL;

/**
 *
 * @author milos
 */
public class Operacije {
    
    public boolean sacuvajClana(Clan clan) {
//        KolekcijaClanova.vratiInstancu().dodajClana(clan);
        return KontrolerPL.sacuvajClana(clan);
    }
    
    public boolean azurirajClana(Clan clan) {
//        KolekcijaClanova.vratiInstancu().izmeniClana(clan);
        return KontrolerPL.azurirajClana(clan);
    }
}
