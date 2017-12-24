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
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.objects.NativeFunction.function;
import model.Users;


/**
 *
 * @author colbert
 */
public class Admin_UsrMgr_ListUsersQuery {
    private Connection conn;
    private ResultSet results;
    
    public Admin_UsrMgr_ListUsersQuery() {

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
            Logger.getLogger(Admin_UsrMgr_ListUsersQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    public void doRead(){
        
        try {
            String query = "SELECT * FROM SiteUsers INNER JOIN USERROLES ON siteusers.email = userroles.email";
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Admin_UsrMgr_ListUsersQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String makeUserTable(){
        
        String table = "";
        table += "<table class=\"table table-responsive table-hover table-striped\">";
           
            table += "<thead>";
                table += "<tr>";
                    table += "<th> Email </th>";
                    table += "<th> Password </th>";
                    table += "<th> First Name </th>";
                    table += "<th> Last Name </th>";
                    table += "<th> Role </th>";
                    table += "<th> Date Created </th>";
                    table += "<th> Date Updated </th>";
                table += "</tr>";
            table += "</thead>";
        
        try {
            while(this.results.next()){
                
                Users user = new Users();
                user.setEmail(this.results.getString("email"));
                user.setPasswd(this.results.getString("passwd"));
                user.setFirstName(this.results.getString("firstName"));
                user.setLastName(this.results.getString("lastName"));
                user.setRole(this.results.getString("uroles"));
                user.setDateCreated(this.results.getDate("datecreated"));
                user.setDateUpdated(this.results.getDate("dateupdated"));
                
                table += "<tr>";
                table += "<td>"; 
                table += user.getEmail();
                table += "</td>";
                
                table += "<td>";
                table += user.getPasswd();
                table += "</td>";
                
                table += "<td>";
                table += user.getFirstName();
                table += "</td>";
                
                table += "<td>";
                table += user.getLastName();
                table += "</td>";
                
                table += "<td>";
                table += user.getRole();
                table += "</td>";
                
                table += "<td>";
                table += user.getDateCreated();
                table += "</td>";
                
                table += "<td>";
                table += user.getDateUpdated();
                table += "</td>";
                
                
                table += "<td>";

                table += "<a href=getUserForUpdate?email=" + user.getEmail() + " onclick=\"return confirm('Are you sure you want to edit this User?');\"><span class=\"glyphicon glyphicon-pencil\"></span></a>";
                table += "<a href=deleteUser?email=" + user.getEmail() + " onclick=\"return confirm('Are you sure you want to delete this User?');\"><span class=\"glyphicon glyphicon-trash\"></span></a>";

                table += "</td>";
                
                
                table += "</tr>";
            }
      
        } catch (SQLException ex) {
            Logger.getLogger(Admin_UsrMgr_ListUsersQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
            
		table += "</table>";
		return table;
	}
}
