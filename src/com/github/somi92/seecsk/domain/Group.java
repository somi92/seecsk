/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.domain;

import java.util.List;

/**
 *
 * @author milos
 */
public class Group {
    
    private long groupId;
    private long groupName;
    private List<Staff> associatedStaff;
    private List<Member> members;
    private List<Schedule> groupSchedules;
    
}
