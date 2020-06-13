/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbookmngt_tan;
import java.sql.*;
/**
 *
 * @author WIN 8.1
 */
public class DBCon {
    
    /**
     *
     */
    public static Connection con;
    
   public static Connection getConnection() throws ClassNotFoundException, SQLException{
    Class.forName("com.mysql.jdbc.Driver");
    con= DriverManager.getConnection("jdbc:mysql://localhost:3306/addressbook_db","root","");
    return con;     
   }
 }


