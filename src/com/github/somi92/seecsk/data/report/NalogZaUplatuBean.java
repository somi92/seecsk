/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.data.report;

import java.util.HashMap;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author milos
 */
public class NalogZaUplatuBean {
    
    public String uplatilac;
    
    public static void generateInvoice(HashMap<String, Object> params) throws JRException, ClassNotFoundException {
        
//        Class.forName("org.apache.commons.digester.Digester");
        
        JasperReport jr = JasperCompileManager.
                compileReport("src/com/github/somi92/seecsk/data/report/template/NalogZaUplatu.jrxml");
        
        JasperPrint jasperPrint = JasperFillManager.fillReport(jr, params, new JREmptyDataSource());
        
        JasperExportManager.exportReportToPdfFile(jasperPrint, "test.pdf");

        JasperViewer.viewReport(jasperPrint);
        
    }
}
