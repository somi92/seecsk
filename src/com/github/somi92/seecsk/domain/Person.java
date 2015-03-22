/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.domain;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author milos
 */
public class Person {
    
    private long sysId;
    private String idCard;
    private String firstLastName;
    private char gender;
    private String email;
    private String phoneNum;
    private Calendar dateOfBirth;
    private String remark;

    public Person() {
    }

    public Person(long id, String idCard, String firstLastName, char gender, String email, String pnoneNum, Calendar dateOfBirth, String remark) {
        this.sysId = id;
        this.idCard = idCard;
        this.firstLastName = firstLastName;
        this.gender = gender;
        this.email = email;
        this.phoneNum = pnoneNum;
        this.dateOfBirth = dateOfBirth;
        this.remark = remark;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getSysId() {
        return sysId;
    }

    public void setSysId(long sysId) {
        this.sysId = sysId;
    }
    
    public String getIdCard() {
        return idCard;
    }
    
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + (int) (this.sysId ^ (this.sysId >>> 32));
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
        final Person other = (Person) obj;
        if (this.sysId != other.sysId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return sysId + ", " + firstLastName;
    }
    
    
}
