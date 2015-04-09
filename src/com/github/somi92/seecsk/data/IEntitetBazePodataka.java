/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.data;

import java.util.HashMap;

/**
 *
 * @author milos
 */
public interface IEntitetBazePodataka {
    
    public String vratiNazivTabele();
    public String[] vratiNaziveKolona();
    public Object[] vratiVrednostiKolona();
    public String vratiIdKolonu();
    public IEntitetBazePodataka vratiEntitet(Object[] vrednostiKolona);
}
