/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.tables;

import com.github.somi92.seecsk.domain.Clan;
import java.lang.reflect.Member;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author milos
 */
public class ClanoviTableModel extends AbstractTableModel {
    
    private List<Clan> clanovi;
    
    public ClanoviTableModel() {
        
    }
    
    public ClanoviTableModel(List<Clan> clanovi) {
        this();
        this.clanovi = clanovi;
    }
    
    public void postaviClanoveTabele(List<Clan> clanovi) {
        this.clanovi = clanovi;
    }
    
    public List<Clan> vratiClanoveTabele() {
        return clanovi;
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
        return clanovi.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Clan c = clanovi.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return c.getIdClan();
            case 1:
                return c.getBrojLK();
            case 2:
                return c.getImePrezime();
            case 3:
                return c.getEmail();
            case 4:
                return c.getBrojTel();
            case 5:
                return new SimpleDateFormat("dd/MM/yyyy").format(c.getDatumRodjenja().getTime());
            case 6:
                return new SimpleDateFormat("dd/MM/yyyy").format(c.getDatumUclanjenja().getTime());
            case 7:
                return c.getGrupa();
            default:
                return "Greška";
        }
    }
    
}
