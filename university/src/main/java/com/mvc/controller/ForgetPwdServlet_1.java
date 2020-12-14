/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.controller;

import com.mvc.util.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class ForgetPwdServlet_1 extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           String q1,q2,q3,aq1,aq2,aq3;
         //   username=request.getParameter("username");
            q1=request.getParameter("q1");
            q2=request.getParameter("q2");
            q3=request.getParameter("q3");
            aq1=request.getParameter("aq1");
            aq2=request.getParameter("aq2");
            aq3=request.getParameter("aq3");
            
            Connection con = DBConnection.createConnection(); 
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from users where  q1='"+q1+"' and q2='"+q2+"' and q3='"+q3+"'");
            if(rs.next())
            {
              // response.sendRedirect("useriddisp.jsp?id="+rs.getString("q1")+"-"+rs.getString("q2")+"-"+rs.getString("q3"));
                if(rs.getString("ans1").equalsIgnoreCase(aq1)&&rs.getString("ans2").equalsIgnoreCase(aq2)&&rs.getString("ans3").equalsIgnoreCase(aq3))
                {
                  //  out.println("<p> you authorized person soory to inconvinence. </p>");
                  //  out.println("<br>");
               //     out.println("<a href='pwdupdate.jsp'> Your ID is:::::::<h2>"+rs.getString("username")+"</h2></a>");
                     response.sendRedirect("userpwddisp.jsp?id="+rs.getString("username")+"-"+rs.getString("password"));
                }
            }
            /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ForgetUseridServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ForgetUseridServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/
           
            
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ForgetPwdServlet_1.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ForgetPwdServlet_1.class.getName()).log(Level.SEVERE, null, ex);
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
