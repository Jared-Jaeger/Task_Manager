/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dbHelper.User_DeleteMyTasksQuery;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Tasks;

/**
 *
 * @author Morgan
 */
@WebServlet(name = "User_DeleteMyTasksServlet", urlPatterns = {"/user/deleteTask"})
public class User_DeleteMyTasksServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet User_DeleteTasksServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet User_DeleteTasksServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                doPost(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            int taskID = Integer.parseInt(request.getParameter("taskID"));
            
            //create a deleteQuery object
            User_DeleteMyTasksQuery dq = new User_DeleteMyTasksQuery();
            
            Tasks tasks= new Tasks();
            tasks.setTaskID(taskID);
            
            //use deleteQuery to delete object
            dq.doDelete(tasks);
            
            //pass execution back to the ReadServlet
            String url = "/user/readMyTasks";
            
            RequestDispatcher dispatcher = request.getRequestDispatcher(url);
            dispatcher.forward (request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User_DeleteMyTasksServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(User_DeleteMyTasksServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}