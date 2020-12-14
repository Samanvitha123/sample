package com.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc.bean.LoginBean;
import com.mvc.dao.LoginDao;
import com.mvc.dao.RegisterDao;
import com.mysql.cj.Session;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String dob=request.getParameter("dob");
		String gen=request.getParameter("gen");
		String ctno=request.getParameter("cntno");
		String email=request.getParameter("email");
		String username=request.getParameter("username");
		String pwd=request.getParameter("password");
		com.mvc.bean.Register regBean = new com.mvc.bean.Register(); //creating object for LoginBean class, which is a normal java class, contains just setters and getters. Bean classes are efficiently used in java to access user information wherever required in the application.
		regBean.setFname(fname);
		regBean.setLname(lname);
		regBean.setDob(dob);
		regBean.setGen(gen);
		regBean.setCtno(ctno);
		regBean.setEmail(email);
		regBean.setUsername(username);
		regBean.setPwd(pwd);
		
        
        RegisterDao loginDao = new RegisterDao(); //creating object for LoginDao. This class contains main logic of the application.
 
        String userValidate = loginDao.RegisterUser(regBean); //Calling authenticateUser function
 
        if(userValidate.equals("SUCCESS")) //If function returns success string then user will be rooted to Home page
         {
        	// HttpSession session=
           //  request.setAttribute("id", username); //with setAttribute() you can define a "key" and value pair so that you can get it in future using getAttribute("key")
             HttpSession session=request.getSession();  
             session.setAttribute("uname",username);
             request.getRequestDispatcher("/reg1.jsp").forward(request, response);//RequestDispatcher is used to send the control to the invoked page.
         }
         else
         {
             request.setAttribute("errMessage", userValidate); //If authenticateUser() function returnsother than SUCCESS string it will be sent to Login page again. Here the error message returned from function has been stored in a errMessage key.
             request.getRequestDispatcher("/reg.jsp").forward(request, response);//forwarding the request
         }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
