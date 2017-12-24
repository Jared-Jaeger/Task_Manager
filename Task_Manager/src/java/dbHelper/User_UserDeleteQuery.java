package dbHelper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author itzjs
 */
public class User_UserDeleteQuery {
    
    private Connection conn;
    
    public User_UserDeleteQuery() {
    Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(User_UserDeleteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(User_UserDeleteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User_UserDeleteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url,username,passwd);
        } catch (SQLException ex) {
            Logger.getLogger(User_UserDeleteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    public void doUserDelete(String email){
        
        try {
            //set up a string to hold query
            String query1 = "DELETE FROM UserRoles WHERE email = ?";
            
            //create a prepared statement using the query string
            PreparedStatement ps1 = conn.prepareStatement(query1);
            
            //fill in the preparedStatement
            ps1.setString(1, email);
            
            //execute the query
            ps1.executeUpdate();
            
            
            String query2 = "DELETE FROM SiteUsers WHERE email = ?";
            
            //create a prepared statement using the query string
            PreparedStatement ps2 = conn.prepareStatement(query2);
            
            //fill in the preparedStatement
            ps2.setString(1, email);
            
            //execute the query
            ps2.executeUpdate();
            
            String query3 = "DELETE FROM tasks WHERE email = ?";
            
            //create a prepared statement using the query string
            PreparedStatement ps3 = conn.prepareStatement(query3);
            
            //fill in the preparedStatement
            ps3.setString(1, email);
            
            //execute the query
            ps3.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_UsrMgr_DeleteUserQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
