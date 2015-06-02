/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.util;

/**
 *
 * @author milos
 */
public interface Constants {
    
    public interface DatabaseConfigKeys {
        
        public static final String DB_URL = "db_url";
        public static final String DB_DRIVER = "db_driver";
        public static final String DB_HOST = "db_host";
        public static final String DB_PASSWORD = "db_password";
    }
    
    public interface OrgInfoConfigKeys {
        
        public static final String ORGANISATION_NAME = "organisation_name";
        public static final String ORGANISATION_ADDRESS = "organisation_address";
        public static final String ORGANISATION_PHONE_NUMBER = "organisation_phone_number";
        public static final String ORGANISATION_ACCOUNT_NUMBER = "organisation_account_number";
        public static final String ORGANISATION_EMAIL = "organisation_email";
        public static final String ORGANISATION_EMAIL_PASSWORD = "organisation_email_password";
    }
    
    public interface EmailServerConfigKeys {
        
        public static final String EMAIL_SERVER_HOST = "email_server_host";
        public static final String EMAIL_SERVER_PORT = "email_server_port";
    }
    
    
    public interface LocationConfigKeys {
        
        public static final String TEMP_INVOICE_LOCATION = "temp/";
    }
}
