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


public class help extends HttpServlet {

	

	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		req.getRequestDispatcher("WEB-INF/lib/help.jsp").forward(req,res);
	}
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String uname=req.getParameter("user");
		String upass=req.getParameter("pass");
		
		Connection con;
		try {
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Sam@01121997");
			Statement stat=con.createStatement();
			int Result = stat.executeUpdate("insert into user(issue,description,sol) values('"+uname+"','"+upass+"','pending')");
			if(Result==1) {
				PrintWriter out=res.getWriter();
				Statement st=con.createStatement();
				 ResultSet r = st.executeQuery("select id from user where issue='"+uname+"'");
				while(r.next()) {
					int v=r.getInt("id");
					out.println("Id for the ticket is "+v);
				}
			}
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
}

