/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.tables.clan;

import com.github.somi92.seecsk.domain.Clan;
import com.github.somi92.seecsk.domain.Uplata;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author milos
 */
public class ClanoviTableModel extends AbstractTableModel {
    
    private List<Clan> clanovi;
    private HashMap<Integer, Color> rowColors;
    private boolean mark;
    
    public ClanoviTableModel() {
        rowColors = new HashMap<>();
        mark = false;
    }
    
    public ClanoviTableModel(List<Clan> clanovi, boolean mark) {
        this();
        this.clanovi = clanovi;
        this.mark = mark;
    }
    
    public void postaviClanoveTabele(List<Clan> clanovi) {
        this.clanovi = clanovi;
    }
    
    public List<Clan> vratiClanoveTabele() {
        return clanovi;
    }
    
    public boolean isMark() {
        return mark;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
        rowColors.clear();
        fireTableDataChanged();
    }

    public HashMap<Integer, Color> getRowColors() {
        return rowColors;
    }

    public void setRowColors(HashMap<Integer, Color> rowColors) {
        this.rowColors = rowColors;
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
        if(mark) {
            // 30 days in milliseconds
            long l = 2592000000l;
            Date border1 = new Date(new Date().getTime()-l);
            Date border2 = new Date(new Date().getTime()-(l+l));
            Date d = getMaxDate(c.getUplate());
            if(!d.after(border1)) {
                if(!d.after(border2)) {
                    rowColors.put(rowIndex, Color.red);
                } else {
                    rowColors.put(rowIndex, Color.orange);
                }
            }
        }
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
    
    private Date getMaxDate(List<Uplata> uplate) {
        Date maxDate = new Date();
        maxDate.setTime(0);
        for(Uplata u : uplate) {
            if(u.getDatumUplate().after(maxDate)) {
                maxDate = u.getDatumUplate();
            }
        }
        return maxDate;
    }
}
