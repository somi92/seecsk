/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.domain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author milos
 */
public class Member extends Person {

    private Calendar dateOfMembership;
    private List<MembershipFee> membershipFees;
    private List<Attendance> attendanceRecords;
    private Grupa group;

    
    public Member() {
        membershipFees = new ArrayList<>();
        attendanceRecords = new ArrayList<>();
    }

    public Member(String idCard, String firstLastName, char gender, String email, String pnoneNum, Calendar dateOfBirth, Calendar dateOfMembership, String remark) {
        super(idCard, firstLastName, gender, email, pnoneNum, dateOfBirth, remark);
        this.dateOfMembership = dateOfMembership;
        membershipFees = new ArrayList<>();
        attendanceRecords = new ArrayList<>();
    }

    public Calendar getDateOfMembership() {
        return dateOfMembership;
    }

    public void setDateOfMembership(Calendar dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }
    
    public Grupa getGroup() {
        return group;
    }

    public void setGroup(Grupa group) {
        this.group = group;
        group.dodajClana(this);
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
