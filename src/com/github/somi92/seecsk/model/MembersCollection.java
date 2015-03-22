/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model;

import com.github.somi92.seecsk.domain.Member;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author milos
 */
public class MembersCollection {

    private static MembersCollection INSTANCE;
    private List<Member> members;
    private long counter;
    
    private MembersCollection() {
        members = new ArrayList<>();
        counter = 1;
        initTestData();
    }
    
    public static MembersCollection getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new MembersCollection();
        }
        return INSTANCE;
    }
    
    public boolean addMember(Member m) {
        if(!members.contains(m)) {
            members.add(m);
            counter++;
            return true;
        }
        return false;
    }
    
    public boolean updateMember(Member m) {
        for(Member member : members) {
            if(member.equals(m)) {
                members.remove(member);
                members.add(m);
                return true;
            }
        }
        return false;
    }
    
    public boolean removeMember(Member m) {
        return members.remove(m);
    }
    
    public void removeMember(int index) {
        members.remove(index);
    }
    
    public List<Member> getAllMembers() {
        return members;
    }
    
    public long useCounter() {
        return counter++;
    }

    private void initTestData() {
        
        Member m1 = new Member("123456789", "Milos Stojanovic", 'm', "milos92s@yahoo.com", "064/912-18-31", 
                new GregorianCalendar(1992, 2, 31), new GregorianCalendar(2015, 1, 12), "sdasda kl;flkfsd;oe fwpkfodskp fds flewnflkewfnlewfd;lmf femwfmdf fwkldfmd;mwldw fwkldewmfmf wfwd',';md;ew llm;l");
        m1.setSysId(counter);
        m1.setGroup(GroupsCollection.getInstance().getAllGroups().get(3));
        addMember(m1);
        
        Member m2 = new Member("432987123", "Petar Petrovic", 'm', "pera@yahoo.com", "064/912-18-31", 
                new GregorianCalendar(1992, 2, 31), new GregorianCalendar(2015, 1, 12), ""); 
        m2.setGroup(GroupsCollection.getInstance().getAllGroups().get(3));
        m2.setSysId(counter);
        addMember(m2);
        
        Member m3 = new Member("143980083", "Marko Markovic", 'm', "marko@yahoo.com", "064/912-18-31", 
                new GregorianCalendar(1992, 2, 31), new GregorianCalendar(2015, 1, 12), "");
        m3.setGroup(GroupsCollection.getInstance().getAllGroups().get(2));
        m3.setSysId(counter);
        addMember(m3);
        
        Member m4 = new Member("122332239", "Jovan Jovanovic", 'm', "jova@yahoo.com", "064/912-18-31", 
                new GregorianCalendar(1992, 2, 31), new GregorianCalendar(2015, 1, 12), "");
        m4.setGroup(GroupsCollection.getInstance().getAllGroups().get(1));
        m4.setSysId(counter);
        addMember(m4);
        
        Member m5 = new Member("321234789", "Nikola Nikolic", 'm', "nikola@yahoo.com", "064/912-18-31", 
                new GregorianCalendar(1992, 2, 31), new GregorianCalendar(2015, 1, 12), "");
        m5.setGroup(GroupsCollection.getInstance().getAllGroups().get(0));
        m5.setSysId(counter);
        addMember(m5);
    }
    
}
