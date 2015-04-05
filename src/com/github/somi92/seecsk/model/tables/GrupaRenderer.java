/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.tables;

import com.github.somi92.seecsk.domain.Grupa;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author milos
 */
public class GrupaRenderer extends JPanel implements TableCellRenderer {

    private JLabel lbl1;
    private JLabel lbl2;
    
    public GrupaRenderer() {
        lbl1 = new JLabel();
        lbl2 = new JLabel();
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setBackground(Color.LIGHT_GRAY);
        add(lbl1);
        add(lbl2);
        Grupa g = (Grupa) value;
        lbl1.setText(g.getIdGrupa()+"");
        lbl2.setText(g.getNaziv());
        setSize(30, 20);
        return this;
    }
    
}
