/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.main;

import com.github.somi92.seecsk.gui.FMainForm;
import com.github.somi92.seecsk.util.Config;
import com.github.somi92.seecsk.util.Constants;
import com.github.somi92.sqldbb.broker.DBBroker;

/**
 *
 * @author milos
 */
public class Main {
    
    public static void main(String[] args) {
        
        DBBroker broker = new DBBroker();
        broker.setDatabaseServer(Config.vratiInstancu().vratiVrednost(Constants.DatabaseConfigKeys.DB_SERVER));
        
        broker.setDatabaseDriver(Config.vratiInstancu().vratiVrednost(Constants.DatabaseConfigKeys.DB_DRIVER));
        broker.setHostPort(Config.vratiInstancu().vratiVrednost(Constants.DatabaseConfigKeys.DB_HOST)+":"+
                Config.vratiInstancu().vratiVrednost(Constants.DatabaseConfigKeys.DB_PORT));
        broker.setDatabase(Config.vratiInstancu().vratiVrednost(Constants.DatabaseConfigKeys.DB_NAME));
        broker.setUsername(Config.vratiInstancu().vratiVrednost(Constants.DatabaseConfigKeys.DB_USER));
        broker.setPassword(Config.vratiInstancu().vratiVrednost(Constants.DatabaseConfigKeys.DB_PASSWORD));
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMainForm().setVisible(true);
            }
        });
    }
}
