/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.domain;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author milos
 */
public class Category {
    
    private long categoryId;
    private String categoryName;
    private List<Group> groups;

    public Category() {
        
    }

    public Category(long categoryId, String categoryName, List<Group> groups) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.groups = groups;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    
    public void addGroup(Group group) {
        groups.add(group);
    }
    
    public List<Group> getGroups() {
        return groups;
    }
    
    public void removeGroup(Group group) {
        groups.remove(group);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (this.categoryId ^ (this.categoryId >>> 32));
        hash = 59 * hash + Objects.hashCode(this.categoryName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Category other = (Category) obj;
        if (this.categoryId != other.categoryId) {
            return false;
        }
        if (!Objects.equals(this.categoryName, other.categoryName)) {
            return false;
        }
        return true;
    }
    
    
}
