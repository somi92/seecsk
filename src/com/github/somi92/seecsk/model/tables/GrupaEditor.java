/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.model.tables;

import com.github.somi92.seecsk.domain.Grupa;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author milos
 */
public class GrupaEditor extends AbstractCellEditor implements TableCellEditor {

//    private JPanel panel;
    private JTextField txtField1;
    private JTextField txtField2;
//    private JButton btn;
    private String s1 = new String();
    private String s2 = new String();
    
    public GrupaEditor() {
        txtField1 = new JTextField();
        txtField2 = new JTextField();
//        panel = new JPanel();
//        btn = new JButton("Dugme");
    }
    
    @Override
    public Object getCellEditorValue() {
        return new Grupa(Long.parseLong(txtField1.getText()), txtField2.getText(), "");
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
//        JTextField txtField1 = new JTextField();
//        JTextField txtField2 = new JTextField();
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel textFieldPanel = new JPanel(new BorderLayout());
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        JButton btn = new JButton("Dugme");
        
        s1 = ((Grupa) value).getIdGrupa()+"";
        s2 = ((Grupa) value).getNaziv();
        txtField1.setText(s1);
        txtField2.setText(s2);
        txtField1.setPreferredSize(new Dimension(30, 20));
        txtField2.setPreferredSize(new Dimension(100, 20));
        btn.setPreferredSize(new Dimension(120, 20));
        
        textFieldPanel.add(txtField1, BorderLayout.WEST);
        textFieldPanel.add(txtField2, BorderLayout.EAST);
        buttonPanel.add(btn);
        
        mainPanel.add(textFieldPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5) );
        btn.addActionListener(null);
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("Clicked! "+ new GregorianCalendar().getTime());
                
            }
        });
        return mainPanel;
    }
    
}
