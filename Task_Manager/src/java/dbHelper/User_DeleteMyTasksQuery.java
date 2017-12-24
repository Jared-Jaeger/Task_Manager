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
import model.Tasks;

/**
 *
 * @author btfra
 */
public class User_DeleteMyTasksQuery {
    
    private Connection conn;
    
    public User_DeleteMyTasksQuery() throws ClassNotFoundException, SQLException{
        
        try {
            Properties props = new Properties();
            InputStream instr = getClass().getResourceAsStream("dbConn.properties");
            
            props.load(instr);
            instr.close();
            
            String driver = props.getProperty("driver.name");
            String url = props.getProperty("server.name");
            String username = props.getProperty("user.name");
            String passwd = props.getProperty("user.password");
            
            Class.forName(driver);
            
            conn = DriverManager.getConnection(url,username,passwd);
            
        } catch (IOException ex) {
            Logger.getLogger(User_DeleteMyTasksQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void doDelete(Tasks tasks)
    {
        
        try {
            //set up a string to hold query
            String query = "DELETE FROM Tasks WHERE taskID = ?";
            
            //create a prepared statement using the query string
            PreparedStatement ps = conn.prepareStatement(query);
            
            //fill in the preparedStatement
            ps.setInt(1, tasks.getTaskID());
            
            //execute the query
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(User_DeleteMyTasksQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}