/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.operations;

import com.github.somi92.seecsk.domain.Member;
import com.github.somi92.seecsk.model.MembersCollection;

/**
 *
 * @author milos
 */
public class Operations {
    
    public boolean saveMember(Member m) {
        MembersCollection.getInstance().addMember(m);
        return true;
    }
    
    public boolean updateMember(Member m) {
        MembersCollection.getInstance().updateMember(m);
        return true;
    }
}
