/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.domain;

import java.util.Calendar;

/**
 *
 * @author milos
 */
public class Staff extends Person {
    
    private Role role;

    public Staff() {
        
    }

    public Staff(Role role, long id, String idCard, String firstLastName, char gender, String email, String pnoneNum,Calendar dateOfBirth, String remark) {
        super(id, idCard, firstLastName, gender, email, pnoneNum, dateOfBirth, remark);
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    public enum Role {
        
        COACH, ASSISTANT_COACH, ATHLETIC_TRAINER,
        GYM_TRAINER, FITNESS_TRAINER, PERSONAL_TRAINER,
        ASSISTANT_TRAINER, DOCTOR, PHYSIOTHERAPIST, 
        ADMINISTRATIVE_STAFF, OTHER
    }
}
