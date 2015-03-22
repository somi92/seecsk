/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.data;

import com.github.somi92.seecsk.domain.Member;
import com.github.somi92.seecsk.model.operations.SEECSKOperations;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author milos
 */
public class Session {
    
    public static final String MEMBER_OPERATION = "member_operation";
    public static final String MEMBER = "member";
    
    private static Session INSTANCE;
    private Map<String, Object> sessionMap;
    
    private Session() {
        sessionMap = new HashMap<>();
    }
    
    public static Session getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Session();
        }
        return INSTANCE;
    }
    
    public Map<String, Object> getSessionMap() {
        return sessionMap;
    }
}
