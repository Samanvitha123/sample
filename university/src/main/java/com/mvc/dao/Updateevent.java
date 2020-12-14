/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.dao;

import com.mvc.Model.Event;
import com.mvc.bean.EventBean;
import com.mvc.bean.LoginBean;
import com.mvc.util.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Updateevent {
 public String updateevent(Event evnt)
     {
      //   String userName = loginBean.getUserName(); //Assign user entered values to temporary variables.
        // String password = loginBean.getPassword();
         String id=evnt.getId();
        String event_name=evnt.getEvent_name();
		 String event_descr=evnt.getEvent_descr();
		 String dateofevent=evnt.getDateofevent();
		 String addrs=evnt.getAddrs();
		 String phone=evnt.getPhone();
		 String email=evnt.getEmail();
		 String rules=evnt.getRules();
		 Connection con = null;
	        Statement statement = null;
	        ResultSet resultSet = null;
	        try
	        {
                   // HttpSession session=res.getSession();  
                   // HttpSession sessionsa = request.getSession(false);
//String user = (String) sessionsa.getAttribute("uname");
         //     String id=sessionsa.getAttribute("id").toString(); 
	            con = DBConnection.createConnection(); //Fetch database connection object
	            statement = con.createStatement(); //Statement is used to write queries. Read more about it.
                    String sql="update event set event_name='"+event_name+"',event_descr='"+event_descr+"',dateofevent='"+dateofevent+"',addrs='"+addrs+"',phone='"+phone+"',email='"+email+"',rules='"+rules+"' where id='"+id+"'";
	                //   JOptionPane.showMessageDialog(null, sql);
                    int k = statement.executeUpdate(sql);
	            System.out.println(k);
	            if(k>0) // Until next row is present otherwise it return false
	            {
	           //  userNameDB = resultSet.getString("userName"); //fetch the values present in database
	             //passwordDB = resultSet.getString("password");

	              //if(userName.equals(userNameDB) && password.equals(passwordDB))
	              {
	                 return "SUCCESS"; ////If the user entered values are already present in the database, which means user has already registered so return a SUCCESS message.
	              }
	            }
	        }
	            catch(SQLException e)
	            {
	               e.printStackTrace();
	            }
	            return "FAILED"; // Return appropriate message in case of failure
	        }
	    }