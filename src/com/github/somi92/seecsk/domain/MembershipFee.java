/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.domain;

import java.time.Month;
import java.time.Year;
import java.util.Date;

/**
 *
 * @author milos
 */
public class MembershipFee {
    
    private long feeAmount;
    private Date dateReceived;
    private Month month;
    private Year year;

    public MembershipFee() {
        
    }

    public MembershipFee(long feeAmount, Date dateReceived, Month month, Year year) {
        this.feeAmount = feeAmount;
        this.dateReceived = dateReceived;
        this.month = month;
        this.year = year;
    }

    public long getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(long feeAmount) {
        this.feeAmount = feeAmount;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }
    
    
}
