package dbHelper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author itzjs
 */

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Users;

/**
 *
 * @author itzjs
 */
public class User_UserDetailsQuery {
     private Connection conn;
    private ResultSet results;
    
    private Users user = new Users();
    private String email;
    
    public User_UserDetailsQuery(String email){
        
        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(User_UserDetailsQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(User_UserDetailsQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        
        this.email = email;
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User_UserDetailsQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url,username,passwd);
        } catch (SQLException ex) {
            Logger.getLogger(User_UserDetailsQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public void doRead(){
        try {
            String query = "SELECT * FROM SiteUsers WHERE email = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1,email);
            
            this.results = ps.executeQuery();
            
            this.results.next();
            
            user.setEmail(this.results.getString("email"));
            user.setFirstName(this.results.getString("firstName"));
            user.setLastName(this.results.getString("lastName"));
            user.setPasswd(this.results.getString("passwd"));
            
            
        } catch (SQLException ex) {
            Logger.getLogger(User_UserDetailsQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Users getUser(){
        return this.user;
    }
}