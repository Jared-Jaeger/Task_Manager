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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Tasks;
import model.Users;

/**
 *
 * @author itzjs
 */
public class User_UpdateTaskFormQuery {
     private Connection conn;
    private ResultSet results;
    
    private Tasks task = new Tasks();
    private int taskID;
    
    public User_UpdateTaskFormQuery(int taskID){
        
        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(User_UpdateTaskFormQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(User_UpdateTaskFormQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        
        this.taskID = taskID;
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User_UpdateTaskFormQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url,username,passwd);
        } catch (SQLException ex) {
            Logger.getLogger(User_UpdateTaskFormQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public void doRead(){
        try {
            String query = "SELECT * FROM Tasks WHERE taskID = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1,taskID);
            
            this.results = ps.executeQuery();
            
            this.results.next();
             
                task.setTaskName(this.results.getString("taskName"));
                task.setTaskcat(this.results.getString("taskCat"));
                task.setTaskduedate(this.results.getDate("taskdueDate"));
                task.setTaskdetails(this.results.getString("taskDetails"));
                task.setTaskComplete(this.results.getInt("taskComplete"));
                task.setTaskID(this.results.getInt("taskID"));
                
        } catch (SQLException ex) {
            Logger.getLogger(Admin_UsrMgr_ListUsersQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Tasks getTask(){
        return this.task;
    }
}
