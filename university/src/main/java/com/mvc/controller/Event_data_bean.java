package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc.bean.EventBean;
import com.mvc.dao.EventDao;
import com.mvc.dao.RegisterDao;

/**
 * Servlet implementation class Event_data_bean
 */
public class Event_data_bean extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Event_data_bean() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();  
		 String event_name=request.getParameter("name");
		 String event_descr=request.getParameter("descr");
		 String dateofevent=request.getParameter("doe");
		 String addrs=request.getParameter("addrs");
		 String phone=request.getParameter("phone");
		 String email=request.getParameter("email");
		 String rules=request.getParameter("rule");
		 EventBean evnt=new EventBean();
		 evnt.setEvent_name(event_name);
		 evnt.setEvent_descr(event_descr);
		 evnt.setDateofevent(dateofevent);
		 evnt.setAddrs(addrs);
		 evnt.setPhone(phone);
		 evnt.setEmail(email);
		 evnt.setRules(rules);
		 EventDao loginDao = new EventDao(); //creating object for LoginDao. This class contains main logic of the application.
		 
	        String userValidate = loginDao.RegisterEvent(evnt); //Calling authenticateUser function
	 
	        if(userValidate.equals("SUCCESS")) //If function returns success string then user will be rooted to Home page
	         {
	        	// HttpSession session=
	           //  request.setAttribute("id", username); //with setAttribute() you can define a "key" and value pair so that you can get it in future using getAttribute("key")
	         //    HttpSession session=request.getSession();  
	           //  session.setAttribute("uname",username);
	        	out.println("<script> alert(\"event Inserted succefully!\");</script>");
	        	out.println("<script> location.replace('AdminHome.jsp', '_blank')</script>"); //            request.getRequestDispatcher("/AdminHome.jsp").forward(request, response);//RequestDispatcher is used to send the control to the invoked page.
	         }
	         else
	         {
	             request.setAttribute("errMessage", userValidate); //If authenticateUser() function returnsother than SUCCESS string it will be sent to Login page again. Here the error message returned from function has been stored in a errMessage key.
	             request.getRequestDispatcher("/AdminHome.jsp").forward(request, response);//forwarding the request
	         }

		}

		 
		
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
