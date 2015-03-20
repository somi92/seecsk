/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model;

import com.github.somi92.seecsk.domain.Member;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milos
 */
public class MembersCollection implements DataCollection {

    private List<Member> members;
    
    public MembersCollection() {
        members = new ArrayList<>();
        initMockData();
    }
    
    @Override
    public List<DataCollection> getAllItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addItem(DataCollection item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeItem(DataCollection item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void initMockData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
