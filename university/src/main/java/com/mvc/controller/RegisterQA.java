package com.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc.bean.QAUpdate;
import com.mvc.dao.QADao;
import com.mvc.dao.RegisterDao;

/**
 * Servlet implementation class RegisterQA
 */
public class RegisterQA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterQA() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String username=request.getParameter("username");
		String q1=request.getParameter("qa1");
		String ans1=request.getParameter("ans1");
		String q2=request.getParameter("qa2");
		String ans2=request.getParameter("ans2");
		String q3=request.getParameter("qa3");
		String ans3=request.getParameter("ans3");
		QAUpdate qabean=new QAUpdate();
		qabean.setUsername(username);
		qabean.setQa1(q1);
		qabean.setQa2(q2);
		qabean.setQa3(q3);
		qabean.setAns1(ans1);
		qabean.setAns2(ans2);
		qabean.setAns3(ans3);
		QADao loginDao = new QADao(); //creating object for LoginDao. This class contains main logic of the application.
		 
        String userValidate = loginDao.updateUser(qabean); //Calling authenticateUser function
 
        if(userValidate.equals("SUCCESS")) //If function returns success string then user will be rooted to Home page
         {
        	// HttpSession session=
           //  request.setAttribute("id", username); //with setAttribute() you can define a "key" and value pair so that you can get it in future using getAttribute("key")
             HttpSession session=request.getSession();  
             session.setAttribute("uname",username);
             request.getRequestDispatcher("/reg2.jsp").forward(request, response);//RequestDispatcher is used to send the control to the invoked page.
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
