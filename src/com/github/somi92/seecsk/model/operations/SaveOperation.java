/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.operations;

import com.github.somi92.seecsk.domain.Member;

/**
 *
 * @author milos
 */
public class SaveOperation implements SEECSKOperations {
    
    private Operations operations;
    
    public SaveOperation(Operations operations) {
        this.operations = operations;
    }

    @Override
    public String getOperationName() {
        return "Sačuvaj";
    }

    @Override
    public boolean executeOperation(Object o) {
        Member m = (Member) o;
        return operations.saveMember(m);
    }
    
}
