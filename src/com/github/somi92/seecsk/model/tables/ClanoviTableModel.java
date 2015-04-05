/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.tables;

import com.github.somi92.seecsk.domain.Clan;
import com.github.somi92.seecsk.domain.Grupa;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            case 8:
                return "Napomena";
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
        return 9;
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
            case 8:
                return c.getNapomena();
            default:
                return "Greška";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        try {
            Clan c = clanovi.get(rowIndex);
            switch(columnIndex) {
                case 0:
                    c.setIdClan(Long.parseLong(aValue.toString()));
                    break;
                case 1:
                    c.setBrojLK(aValue.toString());
                    break;
                case 2:
                    c.setImePrezime(aValue.toString());
                    break;
                case 3:
                    c.setEmail(aValue.toString());
                    break;
                case 4:
                    c.setBrojTel(aValue.toString());
                    break;
                case 5:
                    DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
                    Date date1 = df1.parse(aValue.toString());
                    c.setDatumRodjenja(date1);
                    break;
                case 6:
                    DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
                    Date date2 = df2.parse(aValue.toString());
                    c.setDatumUclanjenja(date2);
                    break;
                case 7:
                    c.setGrupa((Grupa) aValue);
                    break;
                case 8:
                    c.setNapomena(aValue.toString());
                    break;
            }
        } catch (ParseException ex) {
            Logger.getLogger(ClanoviTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex == 1 || columnIndex == 2 || columnIndex == 3 || columnIndex == 4 ||
                columnIndex == 5 || columnIndex == 6 || columnIndex == 7 || columnIndex == 8) {
            return true;
        }
        return false;
    }
    
    
    
}
