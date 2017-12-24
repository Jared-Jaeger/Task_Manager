/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author colbert
 */
public class Users {
    
    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private String passwd;
    private Date dateCreated;
    private Date dateUpdated;
    private String role;
    

    public Users() {
        
    }

    public Users(int id, String email, String firstName, String lastName, String passwd, Date dateCreated, Date dateUpdated, String role) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passwd = passwd;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", passwd=" + passwd + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + ", role=" + role + '}';
    }

}
