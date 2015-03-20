/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model;

import java.util.List;

/**
 *
 * @author milos
 */
public interface DataCollection {
    
    public List<DataCollection> getAllItems();
    public void addItem(DataCollection item);
    public void removeItem(DataCollection item);
}
