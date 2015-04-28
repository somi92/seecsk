/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.tables;

import java.awt.Component;
import javax.swing.AbstractCellEditor;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author milos
 */
public class TestEditor extends AbstractCellEditor implements TableCellEditor {
    
    private JComboBox jcmbPol;
    
    @Override
    public Object getCellEditorValue() {
//        return (char) jcmbPol.getSelectedItem().toString().charAt(0);
        return jcmbPol.getSelectedItem().toString();
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        jcmbPol = new JComboBox(new Object[] {"M","Ž"});
        String item = value.toString();
        jcmbPol.setSelectedItem(item);
        return jcmbPol;
    }
    
}
