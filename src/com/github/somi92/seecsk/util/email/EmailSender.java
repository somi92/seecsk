/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.util.email;

import com.github.somi92.seecsk.util.Config;
import com.github.somi92.seecsk.util.Constants;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

/**
 *
 * @author milos
 */
public class EmailSender {
    
    public static void sendEmail() {
        
        try {
            String k1 = Constants.ConfigKeys.ORGANISATION_EMAIL;
            String k2 = Constants.ConfigKeys.ORGANISATION_EMAIL_PASSWORD;
            String user = Config.vratiInstancu().vratiVrednost(k1);
            String password = Config.vratiInstancu().vratiVrednost(k2);
            
            EmailAttachment ea = new EmailAttachment();
            ea.setPath("temp/uplatnica_36.pdf");
            ea.setDisposition(EmailAttachment.ATTACHMENT);
            ea.setDescription("Primer popunjene uplatnice za clanarinu");
            ea.setName("Uplatnica");
            
            MultiPartEmail mpe = new MultiPartEmail();
            mpe.setDebug(true);
            mpe.setAuthenticator(new DefaultAuthenticator(user, password));
            mpe.setHostName("smtp.mail.yahoo.com");
            mpe.setSSLOnConnect(true);
            mpe.setStartTLSEnabled(true);
            mpe.setSslSmtpPort(587+"");
//            mpe.setAuthentication(user, password);
            mpe.setSubject("Uplatnica za clanarinu");
            mpe.setFrom(Config.vratiInstancu().vratiVrednost(Constants.ConfigKeys.ORGANISATION_EMAIL));
            mpe.setMsg("Test attachment");

            mpe.addTo("stojanovicmilos31@gmail.com");
            mpe.attach(ea);
            
            mpe.send();
            
        } catch (EmailException ex) {
//            ex.printStackTrace();
        }
    }
}
