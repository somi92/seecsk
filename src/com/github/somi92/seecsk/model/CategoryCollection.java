/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model;

import com.github.somi92.seecsk.domain.Kategorija;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milos
 */
public class CategoryCollection {
    
    private static CategoryCollection INSTANCE;
    private List<Kategorija> categories;
    
    private CategoryCollection() {
        categories = new ArrayList<>();
        initTestData();
    }
    
    public static CategoryCollection getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new CategoryCollection();
        }
        return INSTANCE;
    }
    
    public boolean addCategory(Kategorija c) {
        if(!categories.contains(c)) {
            categories.add(c);
            return true;
        }
        return false;
    }
    
    public List<Kategorija> getAllCategories() {
        return categories;
    }
    
    private void initTestData() {
        addCategory(new Kategorija(11, "Kadeti"));
        addCategory(new Kategorija(12, "Juniori"));
        addCategory(new Kategorija(13, "Seniori"));
    }
}
