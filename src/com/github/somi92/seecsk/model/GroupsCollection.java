/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model;

import com.github.somi92.seecsk.domain.Kategorija;
import com.github.somi92.seecsk.domain.Grupa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milos
 */
public class GroupsCollection {
    
    private static GroupsCollection INSTANCE;
    private List<Grupa> groups;
    
    private GroupsCollection() {
        groups = new ArrayList<>();
        initTestData();
    }
    
    public static GroupsCollection getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new GroupsCollection();
        }
        return INSTANCE;
    }
    
    public boolean addGroup(Grupa g) {
        if(!groups.contains(g)) {
            groups.add(g);
            return true;
        }
        return false;
    }
    
    public List<Grupa> getAllGroups() {
        return groups;
    }

    private void initTestData() {
        
        List<Kategorija> cl = CategoryCollection.getInstance().getAllCategories();
        
        Grupa g1 = new Grupa(21, "Kadeti 1. grupa");
        g1.setKategorija(cl.get(0));
        Grupa g2 = new Grupa(22, "Kadeti 2. grupa");
        g2.setKategorija(cl.get(0));
        Grupa g3 = new Grupa(23, "Juniori 1. grupa");
        g3.setKategorija(cl.get(1));
        Grupa g4 = new Grupa(24, "Seniori 1. grupa");
        g4.setKategorija(cl.get(2));
        
        addGroup(g1);
        addGroup(g2);
        addGroup(g3);
        addGroup(g4);
    }
}
