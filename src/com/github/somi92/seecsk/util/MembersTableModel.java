/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.util;

import com.github.somi92.seecsk.domain.Member;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author milos
 */
public class MembersTableModel extends AbstractTableModel {
    
    private List<Member> members;
    
    public MembersTableModel(List<Member> members) {
        this.members = members;
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "ID";
            case 1:
                return "Ime i prezime";
            case 2:
                return "E-mail";
            case 3:
                return "Broj telefona";
            case 4:
                return "Datum rođenja";
            case 5:
                return "Datum učlanjenja";
            case 6:
                return "Napomena";
            default:
                return "Greška";
        }
    }

    @Override
    public int getRowCount() {
        return members.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Member m = members.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return m.getId();
            case 1:
                return m.getFirstLastName();
            case 2:
                return m.getEmail();
            case 3:
                return m.getPhoneNum();
            case 4:
                return m.getDateOfBirth();
            case 5:
                return m.getDateOfMembership();
            case 6:
                return m.getRemark();
            default:
                return "Greška";
        }
    }
    
}
