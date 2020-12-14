/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class edit extends HttpServlet {

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
            out.println("<title>Servlet edit</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>Servlet edit at " + request.getContextPath() + "</h1>");
            
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
    protected void doGet(HttpServletRequest request, HttpServletResponse res)
            throws ServletException, IOException {
        //processRequest(request, response);
         PrintWriter out = res.getWriter();  
         res.setContentType("text/html"); 
             out.println("<meta http-equiv=Content-Type content=text/html; charset=UTF-8 />");
    out.println("<title>Home</title>");



    out.println("<link rel=stylesheet href=style.css type=text/css media=screen />");
   
   out.println(" <script type=text/javascript src=jquery.js></script>");
  out.println("  <script type=text/javascript src=script.js></script>");

        String strId =request.getParameter("id");
int id = Integer.parseInt(strId);
Connection con = null;
String url = "jdbc:mysql://localhost:3306/";;
String db = "university";
String driver = "com.mysql.jdbc.Driver";
try{
Class.forName(driver);
con = DriverManager.getConnection(url+db,"root","Sam@01121997");
try{
Statement st = con.createStatement();
String query = "SELECT * FROM event WHERE id="+id;
ResultSet rs = st.executeQuery(query);
while (rs.next()) {
	
 out.println("<table border=1 width=50%>");
out.println("<tr>");
out.println("<td width=100%>");
out.println("<form method=POST action=Event_update>");
out.println("<input type=hidden name=id value="+request.getParameter("id")+">");
out.println("<h2 align=center>UPDATE RECORD</h2>");
out.println("<table border=2  width=100% bgColor=lightgreen>");
out.println("<tr>");
out.println("<td width=50% bgColor=lightgreen><b>Event ID:</b></td>");
out.println("<td width=50% bgColor=lightgreen><input type=text name=id  value="+rs.getString(1)+" size=50/> </td>");
out.println("</tr>");

out.println("<tr>");
out.println("<td width=50% bgColor=lightgreen><b>Event Name:</b></td>");
out.println("<td width=50% bgColor=lightgreen><input type=text name=name  value="+rs.getString(2)+" size=50/> </td>");
out.println("</tr>");
out.println("<tr>");
out.println("<td width=50% bgColor=lightgreen><b>Event Description:</b></td>");
out.println("<td width=50% bgColor=lightgreen><input type=text name=descr value="+rs.getString(3)+" size=50></td>");
out.println("</tr>");
out.println("<tr>");
out.println("<td width=50% bgColor=lightgreen><b>Date of event:</b></td>");
out.println("<td width=50% bgColor=lightgreen><input type=text name=doe value="+rs.getString(4)+" size=50></td>");
out.println("</tr>");
out.println("<tr>");
out.println("<td width=50% bgColor=lightgreen><b>Address:</b></td>");
out.println("<td width=50% bgColor=lightgreen><input type=text name=adrs value="+rs.getString(5)+" size=50></td>");
out.println("</tr>");
out.println("<tr>");
out.println("<td width=50% bgColor=lightgreen><b>Phone:</b></td>");
out.println("<td width=50% bgColor=lightgreen><input type=text name=phone value="+rs.getString(6)+" size=50></td>");
out.println("</tr>");
out.println("<tr>");
out.println("<td width=50% bgColor=lightgreen><b>Email:</b></td>");
out.println("<td width=50% bgColor=lightgreen><input type=text name=email value="+rs.getString(7)+" size=50></td>");
out.println("</tr>");
out.println("<tr>");
out.println("<td width=50% bgColor=lightgreen><b>Rules:</b></td>");
out.println("<td width=50% bgColor=lightgreen><input type=text name=rules value="+rs.getString(8)+"size=50></td>");
out.println("</tr>");

out.println("</table>");
out.println("<p><input type=submit value=Update name=submit>");
out.println("<input type=reset value=Reset name=reset></p>");

out.println("</form>");
out.println("</td>");
out.println("</tr>");
out.println("</table>");
}

rs.close();	
con.close();

}
catch (SQLException ex){
System.out.println("SQL statement is not executed!");
}
}
catch (Exception e){
e.printStackTrace();
}

out.println("<br>");
out.println("<a href='view'> RETURN TO view PAGE </a>");

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
        processRequest(request, response);
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
