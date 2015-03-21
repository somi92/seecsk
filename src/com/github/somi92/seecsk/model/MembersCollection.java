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
    
    private MembersCollection() {
        members = new ArrayList<>();
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
            return true;
        }
        return false;
    }
    
    public List<Member> getAllMembers() {
        return members;
    }

    private void initTestData() {
        Member m1 = new Member(31, "Milos Stojanovic", 'm', "milos92s@yahoo.com", "064/912-18-31", 
                new GregorianCalendar(1992, 2, 31), new GregorianCalendar(2015, 1, 12), "sdasda kl;flkfsd;oe fwpkfodskp fds flewnflkewfnlewfd;lmf femwfmdf fwkldfmd;mwldw fwkldewmfmf wfwd',';md;ew llm;l");
        m1.setGroup(GroupsCollection.getInstance().getAllGroups().get(3));
        Member m2 = new Member(32, "Petar Petrovic", 'm', "pera@yahoo.com", "064/912-18-31", 
                new GregorianCalendar(1992, 2, 31), new GregorianCalendar(2015, 1, 12), ""); 
        m2.setGroup(GroupsCollection.getInstance().getAllGroups().get(3));
        Member m3 = new Member(33, "Marko Markovic", 'm', "marko@yahoo.com", "064/912-18-31", 
                new GregorianCalendar(1992, 2, 31), new GregorianCalendar(2015, 1, 12), "");
        m3.setGroup(GroupsCollection.getInstance().getAllGroups().get(2));
        Member m4 = new Member(34, "Jovan Jovanovic", 'm', "jova@yahoo.com", "064/912-18-31", 
                new GregorianCalendar(1992, 2, 31), new GregorianCalendar(2015, 1, 12), "");
        m4.setGroup(GroupsCollection.getInstance().getAllGroups().get(1));
        Member m5 = new Member(35, "Nikola Nikolic", 'm', "nikola@yahoo.com", "064/912-18-31", 
                new GregorianCalendar(1992, 2, 31), new GregorianCalendar(2015, 1, 12), "");
        m5.setGroup(GroupsCollection.getInstance().getAllGroups().get(0));
        
        addMember(m1);
        addMember(m2);
        addMember(m3);
        addMember(m4);
        addMember(m5);
    }
    
}
