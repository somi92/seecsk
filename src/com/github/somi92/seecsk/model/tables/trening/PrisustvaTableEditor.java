/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.tables.trening;

import java.awt.Component;
import javax.swing.AbstractCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author milos
 */
public class PrisustvaTableEditor extends AbstractCellEditor implements TableCellEditor {

    private JCheckBox jchbPrisutan;
    
    public PrisustvaTableEditor() {
        jchbPrisutan = new JCheckBox();
    }
    
    @Override
    public Object getCellEditorValue() {
        return jchbPrisutan.isSelected();
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        jchbPrisutan.setSelected((boolean) value);
        return jchbPrisutan;
    }
    
}
