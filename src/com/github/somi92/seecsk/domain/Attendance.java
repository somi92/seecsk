/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.domain;

import java.util.Date;

/**
 *
 * @author milos
 */
public class Attendance {
    
    private Date date;
    private boolean isAttended;

    public Attendance() {
        
    }

    public Attendance(Date date, boolean isAttended) {
        this.date = date;
        this.isAttended = isAttended;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isIsAttended() {
        return isAttended;
    }

    public void setIsAttended(boolean isAttended) {
        this.isAttended = isAttended;
    }
    
    
}
