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
    private List<MembershipFee> feePayments;
    private List<Attendance> attendanceRecords;
    
    
}
