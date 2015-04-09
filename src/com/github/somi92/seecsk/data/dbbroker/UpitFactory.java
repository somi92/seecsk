/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.data.dbbroker;

/**
 *
 * @author milos
 */
public class UpitFactory {
    
    public static final String TIP_INSERT_UPIT = "insert";
    public static final String TIP_SELECT_UPIT = "select";
    public static final String TIP_UPDATE_UPIT = "update";
    public static final String TIP_DELETE_UPIT = "delete";
    
    public static IUpitBazePodataka vratiUpit(String tipUpita) {
        switch(tipUpita) {
            case TIP_INSERT_UPIT:
                return new InsertUpit();
            case TIP_SELECT_UPIT:
                return new SelectUpit();
            case TIP_UPDATE_UPIT:
                return new UpdateUpit();
            case TIP_DELETE_UPIT:
                return new DeleteUpit();
        }
        return null;
    }
}
