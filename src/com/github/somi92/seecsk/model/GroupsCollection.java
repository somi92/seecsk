/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model;

import com.github.somi92.seecsk.domain.Category;
import com.github.somi92.seecsk.domain.Group;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milos
 */
public class GroupsCollection {
    
    private static GroupsCollection INSTANCE;
    private List<Group> groups;
    
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
    
    public boolean addGroup(Group g) {
        if(!groups.contains(g)) {
            groups.add(g);
            return true;
        }
        return false;
    }
    
    public List<Group> getAllGroups() {
        return groups;
    }

    private void initTestData() {
        
        List<Category> cl = CategoryCollection.getInstance().getAllCategories();
        
        Group g1 = new Group(21, "Kadeti 1. grupa");
        g1.setCategory(cl.get(0));
        Group g2 = new Group(22, "Kadeti 2. grupa");
        g2.setCategory(cl.get(0));
        Group g3 = new Group(23, "Juniori 1. grupa");
        g3.setCategory(cl.get(1));
        Group g4 = new Group(24, "Seniori 1. grupa");
        g4.setCategory(cl.get(2));
        
        addGroup(g1);
        addGroup(g2);
        addGroup(g3);
        addGroup(g4);
    }
}
