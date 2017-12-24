/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author itzjs
 */
public class Tasks {
    private int taskID;
    private String taskName;
    private String taskcat;
    private Date Taskduedate;
    private String taskdetails;
    private String email;
    private int taskComplete;
    private Date DateAdded;
    private Date DateUpdated;

    public Tasks() {

    }

    public Tasks(int taskID, String taskName, String taskcat, Date Taskduedate, String taskdetails, String email, int taskComplete, Date DateAdded, Date DateUpdated) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.taskcat = taskcat;
        this.Taskduedate = Taskduedate;
        this.taskdetails = taskdetails;
        this.email = email;
        this.taskComplete = taskComplete;
        this.DateAdded = DateAdded;
        this.DateUpdated = DateUpdated;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskcat() {
        return taskcat;
    }

    public void setTaskcat(String taskcat) {
        this.taskcat = taskcat;
    }

    public Date getTaskduedate() {
        return Taskduedate;
    }

    public void setTaskduedate(Date Taskduedate) {
        this.Taskduedate = Taskduedate;
    }

    public String getTaskdetails() {
        return taskdetails;
    }

    public void setTaskdetails(String taskdetails) {
        this.taskdetails = taskdetails;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTaskComplete() {
        return taskComplete;
    }

    public void setTaskComplete(int taskComplete) {
        this.taskComplete = taskComplete;
    }

    public Date getDateAdded() {
        return DateAdded;
    }

    public void setDateAdded(Date DateAdded) {
        this.DateAdded = DateAdded;
    }

    public Date getDateUpdated() {
        return DateUpdated;
    }

    public void setDateUpdated(Date DateUpdated) {
        this.DateUpdated = DateUpdated;
    }

    @Override
    public String toString() {
        return "Tasks{" + "taskID=" + taskID + ", taskName=" + taskName + ", taskcat=" + taskcat + ", Taskduedate=" + Taskduedate + ", taskdetails=" + taskdetails + ", email=" + email + ", taskComplete=" + taskComplete + ", DateAdded=" + DateAdded + ", DateUpdated=" + DateUpdated + '}';
    }

}