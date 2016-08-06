/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electric;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lakshitha
 */
public class save {
    
    public static void saving(){
        try {
            Connection con = DB.createConnection();
            
            String a1="\"";
            String a2=";";
            String a3="\r\n";
            
            ResultSet r = con.createStatement().executeQuery("select * from 1stpage into outfile 'D:/Survey Data/1stpage.csv' fields enclosed '"+a1+"' by terminated by '"+a2+"' escaped by '"+a1+"' lines terminated by '"+a3+"'");
            
            
        } catch (Exception e) {
            
        }
        
    }
    
}
