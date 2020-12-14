/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class search extends HttpServlet {

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
           try{
            HttpSession sessionsa = request.getSession(false);
String user = (String) sessionsa.getAttribute("uname");
String sDate1=request.getParameter("d1");
Date d1=new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
String sDate2=request.getParameter("d2");
Date d2=new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
 //           JOptionPane.showMessageDialog(null, sDate1+" "+sDate2);
 Calendar calen1 = Calendar.getInstance(); 
        Calendar calen2 = Calendar.getInstance(); 
        calen1.setTime(d1); 
        calen2.setTime(d2); 
      //  JOptionPane.showMessageDialog(null, d1+" "+d2);
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse(sDate1);
        Date date2 = sdf.parse(sDate2);
        if (date1.compareTo(date2) > 0) {
            System.out.println("Date1 is after Date2");
            out.println("<script> alert(\"Date1 is after Date2!\");</script>");
	        	out.println("<script> location.replace('user_search_event.jsp', '_blank')</script>");
        } else if (date1.compareTo(date2) < 0) {
            System.out.println("Date1 is before Date2");
                 out.println("<script> alert(\"Date1 is before Date2!\");</script>");
	        //	out.println("<script> location.replace('user_search_event.jsp', '_blank')</script>");
              //  request.getRequestDispatcher("user_view_event_search?id="+date1+"-"+date2+"");
                response.sendRedirect("user_view_event_search?id="+sDate1+","+sDate2+"");
     
        } else if (date1.compareTo(date2) == 0) {
            System.out.println("Date1 is equal to Date2");
            out.println("<script> alert(\"Date1 is equal to Date2!\");</script>");
	        	out.println("<script> location.replace('user_search_event.jsp', '_blank')</script>");
        } else {
            System.out.println("How to get here?");
        }
       /* else if (calen1.equals(calen2)) { 
  
            // When Date d1 > Date d2 
            System.out.println("Date1 is after Date2::"+d1.compareTo(d2)); 
            out.println("<script> alert(\"Date1 is Equal!\");</script>");
	        	out.println("<script> location.replace('user_search_event.jsp', '_blank')</script>");
            
        } */

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
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
        processRequest(request, response);
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
