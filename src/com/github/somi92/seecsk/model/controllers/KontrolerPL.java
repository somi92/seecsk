/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.controllers;

import com.github.somi92.seecsk.data.DBBroker;
import com.github.somi92.seecsk.domain.Clan;
import java.util.List;

/**
 *
 * @author milos
 */
public class KontrolerPL {
    
    public static List<Clan> vratiListuClanova() {
        DBBroker dbbroker = new DBBroker();
        dbbroker.otvoriBazuPodataka();
        List<Clan> clanovi = dbbroker.vratiListuClanova();
        dbbroker.zatvoriBazuPodataka();
        return clanovi;
    }
}
