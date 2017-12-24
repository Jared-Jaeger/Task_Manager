/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbHelper;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Users;

/**
 *
 * @author itzjs
 */
public class Admin_UpdateUserQuery {
    
    private Connection conn;
    
    public Admin_UpdateUserQuery() {
    Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(Admin_UpdateUserQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(Admin_UpdateUserQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin_UpdateUserQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url,username,passwd);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_UpdateUserQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    public void doUpdate(Users user){
        
        try {
            String query = "UPDATE  SiteUsers SET  firstname = ?, lastname = ?, passwd = ?, dateupdated = current_timestamp WHERE email = ?";
            
            PreparedStatement ps1 = conn.prepareStatement(query);
            
            ps1.setString(1, user.getFirstName());
            ps1.setString(2, user.getLastName());
            ps1.setString(3, user.getPasswd());
            ps1.setString(4, user.getEmail());
            ps1.executeUpdate();
            
            ps1.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Admin_UpdateUserQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
