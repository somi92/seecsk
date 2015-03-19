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

    public Group() {
        
    }

    public Group(long groupId, long groupName, List<Staff> associatedStaff, List<Member> members, List<Schedule> groupSchedules) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.associatedStaff = associatedStaff;
        this.members = members;
        this.groupSchedules = groupSchedules;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public long getGroupName() {
        return groupName;
    }

    public void setGroupName(long groupName) {
        this.groupName = groupName;
    }
    
    public void addStaff(Staff staff) {
        associatedStaff.add(staff);
    }
    
    public List<Staff> getStaff() {
        return associatedStaff;
    }
    
    public void removeStaff(Staff staff) {
         associatedStaff.remove(staff);
    }
    
    public void addMember(Member member) {
        members.add(member);
    }
    
    public List<Member> getMembers() {
        return members;
    }
    
    public void removeMember(Member member) {
        members.remove(member);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (this.groupId ^ (this.groupId >>> 32));
        hash = 29 * hash + (int) (this.groupName ^ (this.groupName >>> 32));
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
        final Group other = (Group) obj;
        if (this.groupId != other.groupId) {
            return false;
        }
        if (this.groupName != other.groupName) {
            return false;
        }
        return true;
    }
    
    
}
