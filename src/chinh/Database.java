/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author tunga
 */
public class Database {
    private final String DB_Driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    //private final String DB_Url="jdbc:derby://localhost:1527/DKHP";
    private final String DB_Url= "jdbc:sqlserver://SYTUNG-LAPTOP;"
            + "databaseName=DKHP;"
            + "integratedSecurity=true";
    private final String DB_User="sa";
    private final String DB_Pass="";
    
    protected Connection cnn=null;
    protected ResultSet rs=null;
    
    public Database(){
        try {
            Class.forName(DB_Driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Connection openConnection(){
        try {
            cnn=DriverManager.getConnection(DB_Url,DB_User,DB_Pass);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnn;
        
        
    }
    
    public void closeConnection(){
        try {
            if(rs !=null){
            rs.close();
            }
            if(cnn!= null)
            {
                cnn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}