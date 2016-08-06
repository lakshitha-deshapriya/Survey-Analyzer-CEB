/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package electric;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Owner
 */
public class DB {
private static Connection con;
public static Connection createConnection()throws Exception{
Class.forName("com.mysql.jdbc.Driver").newInstance();
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/survey","root","1234");
   
    
return con;
}
 
}
