/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.tables;

import com.github.somi92.seecsk.domain.Member;
import java.text.SimpleDateFormat;
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
                return "Broj LK";
            case 2:
                return "Ime i prezime";
            case 3:
                return "E-mail";
            case 4:
                return "Broj telefona";
            case 5:
                return "Datum rođenja";
            case 6:
                return "Datum učlanjenja";
            case 7:
                return "Grupa";
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
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Member m = members.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return m.getSysId();
            case 1:
                return m.getIdCard();
            case 2:
                return m.getFirstLastName();
            case 3:
                return m.getEmail();
            case 4:
                return m.getPhoneNum();
            case 5:
                return new SimpleDateFormat("dd/MM/yyyy").format(m.getDateOfBirth().getTime());
            case 6:
                return new SimpleDateFormat("dd/MM/yyyy").format(m.getDateOfMembership().getTime());
            case 7:
                return m.getGroup();
            default:
                return "Greška";
        }
    }
    
}
