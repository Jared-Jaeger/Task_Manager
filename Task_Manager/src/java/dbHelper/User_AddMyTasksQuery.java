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
import java.sql.Date;
import model.Tasks;

/**
 *
 * @author btfra
 */
public class User_AddMyTasksQuery {
    
    private Connection conn;
    
    public User_AddMyTasksQuery() throws ClassNotFoundException, SQLException {

        try {
            Properties props = new Properties();
            try (InputStream instr = getClass().getResourceAsStream("dbConn.properties")) {
                props.load(instr);
            }
            
            String driver = props.getProperty("driver.name");
            String url = props.getProperty("server.name");
            String username = props.getProperty("user.name");
            String passwd = props.getProperty("user.password");
            Class.forName(driver);
            
            conn = DriverManager.getConnection(url, username, passwd);
            
        } catch (IOException ex) {
            Logger.getLogger(User_AddMyTasksQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    public void doAdd(Tasks task){
       
        try {
            String query="INSERT INTO tasks (taskName, taskCat, taskDetails, taskdueDate, email, taskComplete, dateAdded, dateUpdated)" +  "VALUES ( ?, ?, ?, ?, ?, 0, current_timestamp, current_timestamp)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
         
            ps.setString(1, task.getTaskName());
            ps.setString(2, task.getTaskcat());
            ps.setString(3, task.getTaskdetails());
            java.sql.Date sqlDate = new java.sql.Date(task.getTaskduedate().getTime());
            ps.setDate(4, sqlDate);
            ps.setString(5, task.getEmail());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(User_AddMyTasksQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    
    
}
