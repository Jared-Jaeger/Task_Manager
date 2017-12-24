
package dbHelper;

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
import model.Tasks;


public class Admin_ReadAllTasksQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public Admin_ReadAllTasksQuery() {

        try {
            Properties props = new Properties(); //MWC
            InputStream instr = getClass().getResourceAsStream("dbConn.properties");
            props.load(instr);
            instr.close();
            
            String driver = props.getProperty("driver.name");
            String url = props.getProperty("server.name");
            String username = props.getProperty("user.name");
            String passwd = props.getProperty("user.password");
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, passwd);
        
        } catch (IOException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Admin_ReadAllTasksQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    public void doRead(){
        
        try {
            String query = "Select * from tasks";
            PreparedStatement ps = conn.prepareStatement(query);
            
            this.results = ps.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_ReadAllTasksQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String makeHtmlTable(){
        
        String table = "";
        table += "<table class=\"table table-responsive table-hover table-striped\">";
           
            table += "<thead>";
                table += "<tr>";
                    table += "<th> Task ID </th>";
                    table += "<th> Task Name </th>";
                    table += "<th> Task Category</th>";
                    table += "<th> Due Date </th>";
                    table += "<th> Task Details </th>";
                    table += "<th> Email </th>";
                    table += "<th> Task Complete </th>";
                    table += "<th> Date Added </th>";
                    table += "<th> Date Updated </th>";
                table += "</tr>";
            table += "</thead>";
        
        try {
            while(this.results.next()){
                Tasks task = new Tasks();
                
                task.setTaskID(this.results.getInt("taskID"));
                task.setTaskName(this.results.getString("taskName"));
                task.setTaskcat(this.results.getString("taskCat"));
                task.setTaskduedate(this.results.getDate("taskdueDate"));
                task.setTaskdetails(this.results.getString("taskDetails"));
                task.setEmail(this.results.getString("Email"));
                task.setTaskComplete(this.results.getInt("taskComplete"));
                task.setDateAdded(this.results.getDate("dateAdded"));
                task.setDateUpdated(this.results.getDate("dateUpdated"));
              
                table += "<tr>";
                table += "<td>"; 
                table += task.getTaskID();
                table += "</td>";
                
                table += "<td>";
                table += task.getTaskName();
                table += "</td>";
                
                table += "<td>";
                table += task.getTaskcat();
                table += "</td>";
                
                table += "<td>";
                table += task.getTaskduedate();
                table += "</td>";
                
                table += "<td>";
                table += task.getTaskdetails();
                table += "</td>";
                
                table += "<td>";
                table += task.getEmail();
                table += "</td>";
                
                table += "<td>";
                table += task.getTaskComplete();
                table += "</td>";
                
                table += "<td>";
                table += task.getDateAdded();
                table += "</td>";
                
                table += "<td>";
                table += task.getDateUpdated();
                table += "</td>";
                
                table += "</tr>";
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin_ReadAllTasksQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
            
		table += "</table>";
		return table;
	}
    
    
}
