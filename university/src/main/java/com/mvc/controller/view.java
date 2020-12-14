/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class view extends HttpServlet {

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
            out.println("<title>Servlet view</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet view at " + request.getContextPath() + "</h1>");
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
        PrintWriter out = res.getWriter();  
         res.setContentType("text/html");  
         out.println("<html><body>");  
            out.println("<meta http-equiv=Content-Type content=text/html; charset=UTF-8 />");
    out.println("<title>Home</title>");



    out.println("<link rel=stylesheet href=style.css type=text/css media=screen />");
   
   out.println(" <script type=text/javascript src=jquery.js></script>");
  out.println("  <script type=text/javascript src=script.js></script>");
        
         out.println("<center>");
        out.println("<table border=1 borderColor=black cellPadding=0 cellSpacing=0 width=920 height=80>");
out.println("<tbody>");
//out.println("<td bgColor=cyan width="150" align=center height=19><font color=red><b>");
//out.println("Student No.</b></font></td>");

out.println("<td bgColor=cyan width=290 height=19><font color=red><b> ID</b></font></td>");
out.println("<td bgColor=cyan width=290 height=19><font color=red><b>Event Name</b></font></td>");
out.println("<td bgColor=cyan width=230 height=19><font color=red><b>Description</b></font></td>");
out.println("<td bgColor=cyan width=290 height=19><font color=red><b>Date of Event </b></font></td>");
out.println("<td bgColor=cyan width=290 height=19><font color=red><b>address </b></font></td>");
out.println("<td bgColor=cyan width=290 height=19><font color=red><b>phone </b></font></td>");
out.println("<td bgColor=cyan width=290 height=19><font color=red><b>Email </b></font></td>");
out.println("<td bgColor=cyan width=290 height=19><font color=red><b>Rules </b></font></td>");


out.println("<td bgColor=cyan width=290 height=19><font color=red><b>EDIT </b></font></td>");
out.println("<td bgColor=cyan width=290 height=19><font color=red><b>DELETE </b></font></td>");
String DRIVER = "com.mysql.jdbc.Driver";
try{
Class.forName(DRIVER).newInstance();
Connection con=null;
ResultSet rst=null;
Statement stmt=null;
  
String url="jdbc:mysql://localhost:3306/university?user=root&password=Sam@01121997";
int i=1;
con=DriverManager.getConnection(url);
stmt=con.createStatement();
rst=stmt.executeQuery("SELECT * FROM event");
while(rst.next()){

if (i==(i/2)*2){
out.println("<tr>");
out.println("<td bgColor=lightgreen vAlign=top width=80 align=center height=19>"+i+"</td>");
out.println("<td bgColor=lightgreen vAlign=top width=110 height=19>"+rst.getString(2)+"</td>");
out.println("<td bgColor=lightgreen vAlign=top width=224 height=19>"+rst.getString(3)+"</td>");
out.println("<td bgColor=lightgreen vAlign=top width=230 height=19>"+rst.getString(4)+"</td>");
out.println("<td bgColor=lightgreen vAlign=top width=244 height=19>"+rst.getString(5)+"</td>");
out.println("<td bgColor=lightgreen vAlign=top width=250 height=19>"+rst.getString(6)+"</td>");
out.println("<td bgColor=lightgreen vAlign=top width=250 height=19>"+rst.getString(7)+"</td>");
out.println("<td bgColor=lightgreen vAlign=top width=250 height=19>"+rst.getString(8)+"</td>");

out.println("<td bgColor=lightgreen vAlign=top width=220 height=19 >");
out.println("    <a href="+"edit?id="+rst.getInt(1)+"> Edit Record </a></td>");
out.println("<td bgColor=lightgreen vAlign=top width=230 height=19>");
out.println("    <a href="+"delete?id="+rst.getInt(1)+"> Delete Record </a></td>");
out.println("</tr>");
}else{
out.println("<tr>");
//out.println("<td bgColor=lightgreen vAlign=top width=80 align=center height=19>"+i+"</td>");
out.println("<td bgColor=lightgreen vAlign=top width=80 align=center height=19>"+i+"</td>");
out.println("<td bgColor=lightgreen vAlign=top width=110 height=19>"+rst.getString(2)+"</td>");
out.println("<td bgColor=lightgreen vAlign=top width=224 height=19>"+rst.getString(3)+"</td>");
out.println("<td bgColor=lightgreen vAlign=top width=230 height=19>"+rst.getString(4)+"</td>");
out.println("<td bgColor=lightgreen vAlign=top width=244 height=19>"+rst.getString(5)+"</td>");
out.println("<td bgColor=lightgreen vAlign=top width=250 height=19>"+rst.getString(6)+"</td>");
out.println("<td bgColor=lightgreen vAlign=top width=250 height=19>"+rst.getString(7)+"</td>");
out.println("<td bgColor=lightgreen vAlign=top width=250 height=19>"+rst.getString(8)+"</td>");
out.println("<td bgColor=lightgreen vAlign=top width=220 height=19 >");
    out.println("<a href="+"edit?id="+rst.getInt(1)+"> Edit Record </a></td>");
out.println("<td bgColor=lightgreen vAlign=top width=230 height=19>");
    out.println("<a href="+"delete?id="+rst.getInt(1)+"> Delete Record </a></td>");
out.println("</tr>");
	}

i++;
}
rst.close();
stmt.close();
con.close();
}catch(Exception e){
System.out.println(e.getMessage());
}
out.println("</tbody>");
out.println("</table>");
out.println("</center>");

        //processRequest(request, response);
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
