/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author milos
 */
public class Group {
    
    private long groupId;
    private String groupName;
    private List<Staff> associatedStaff;
    private List<Member> members;
    private List<Schedule> groupSchedules;
    private Category category;

    public Group() {
        associatedStaff = new ArrayList<>();
        members = new ArrayList<>();
        groupSchedules = new ArrayList<>();
    }

    public Group(long groupId, String groupName) {
        this();
        this.groupId = groupId;
        this.groupName = groupName;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
        category.addGroup(this);
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
        int hash = 5;
        hash = 97 * hash + (int) (this.groupId ^ (this.groupId >>> 32));
        hash = 97 * hash + Objects.hashCode(this.groupName);
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

    @Override
    public String toString() {
        return groupName;
    } 
}
