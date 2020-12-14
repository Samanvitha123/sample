package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class findsol extends HttpServlet {

	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		req.getRequestDispatcher("WEB-INF/lib/resolve.jsp").forward(req,res);
	}
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String uid=req.getParameter("pass");
		Connection con;
try {
	
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Sam@01121997");
			Statement stat=con.createStatement();
			 ResultSet se = stat.executeQuery("select `id`,`issue`,`description`,`sol` from user  where id='"+uid+"'");
			 
				PrintWriter pt=res.getWriter();
				pt.println("<html><head></head><body><h2></h2></body></html>");
				pt.println("<table border=1><th>id</th><th>issue</th><th>description</th><th>solution</th>");
		if(se.next()) {
			PrintWriter out=res.getWriter();
			int v=se.getInt("id");
				String s=se.getString("issue");
				String c=se.getString("description");
				String a=se.getString("sol");
				out.println("<html><body><form ><tr><td>"+v+"</td>");
				out.println("<td>"+s+"</td>");
				out.println("<td>"+c+"</td>");
				out.println("<td>"+a+"</td></tr></body></html>");
		}
		else {
			req.getRequestDispatcher("no.jsp").forward(req,res);
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
}
}
