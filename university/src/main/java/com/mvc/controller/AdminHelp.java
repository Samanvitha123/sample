package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminHelp extends HttpServlet {

	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		Connection con;
try {
	String g="";
	int v=0;
			PrintWriter pt=res.getWriter();
			pt.println("<html><head></head><body><h2>List of tickets are generated</h2></body></html>");
			pt.println("<table border=1><th>id</th><th>issue</th><th>description</th><th>solution</th><th>submit</th>");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Sam@01121997");
			Statement stat=con.createStatement();
			 ResultSet se = stat.executeQuery("select `id`,`issue`,`description` from user");
			while(se.next()) {
				PrintWriter out=res.getWriter();
				 v=se.getInt("id");
				String s=se.getString("issue");
				String c=se.getString("description");
				out.println("<html><body><form ><tr><td>"+v+"</td>");
				out.println("<td>"+s+"</td>");
				out.println("<td>"+c+"</td>");
				out.println("<td><input type=\"text\" name=\"sol\" required></td>");
				out.println("<td><button  onclick=val() >Submit</button></td></tr></form></body></html>");
				 g=req.getParameter("sol");
		
			}
			
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Sam@01121997");
			Statement st=con.createStatement();
			int s=st.executeUpdate("update user set sol='"+g+"' where id='"+v+"' ");
				if(s==1) {
					
					pt.println("<script>alert(\"solution updated\")</script>");
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
