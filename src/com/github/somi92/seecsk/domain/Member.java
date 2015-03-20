/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.domain;

import java.util.Date;
import java.util.List;

/**
 *
 * @author milos
 */
public class Member extends Person {

    private Date dateOfMembership;
    private List<MembershipFee> membershipFees;
    private List<Attendance> attendanceRecords;

    
    public Member() {
        
    }

    public Member(long id, String firstLastName, char gender, String email, String pnoneNum, Date dateOfBirth, Date dateOfMembership) {
        super(id, firstLastName, gender, email, pnoneNum, dateOfBirth);
        this.dateOfMembership = dateOfMembership;
    }

    public Date getDateOfMembership() {
        return dateOfMembership;
    }

    public void setDateOfMembership(Date dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }
    
    public void addMembershipFee(MembershipFee membershipFee) {
        membershipFees.add(membershipFee);
    }
    
    public List<MembershipFee> getMembershipFees() {
        return membershipFees;
    }
    
    public void removeMembershipFee(MembershipFee membershipFee) {
        membershipFees.remove(membershipFee);
    }
    
    public void addAttendanceRecord(Attendance attendance) {
        attendanceRecords.add(attendance);
    }
    
    public List<Attendance> getAttendanceRecords() {
        return attendanceRecords;
    }
    
    public void removeAttendanceRecord(Attendance attendance) {
        attendanceRecords.remove(attendance);
    } 
}
