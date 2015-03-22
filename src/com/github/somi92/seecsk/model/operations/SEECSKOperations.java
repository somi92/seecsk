/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.operations;

/**
 *
 * @author milos
 */
public interface SEECSKOperations {
    
    public String getOperationName();
    public boolean executeOperation(Object o);
}
