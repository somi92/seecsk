/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model;

import com.github.somi92.seecsk.domain.Category;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milos
 */
public class CategoryCollection {
    
    private static CategoryCollection INSTANCE;
    private List<Category> categories;
    
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
    
    public boolean addCategory(Category c) {
        if(!categories.contains(c)) {
            categories.add(c);
            return true;
        }
        return false;
    }
    
    public List<Category> getAllCategories() {
        return categories;
    }
    
    private void initTestData() {
        addCategory(new Category(11, "Kadeti"));
        addCategory(new Category(12, "Juniori"));
        addCategory(new Category(13, "Seniori"));
    }
}
