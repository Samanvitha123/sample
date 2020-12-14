/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.dao;

import com.mvc.Model.Event;
import com.mvc.bean.EventBean;
import com.mvc.util.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class club_event_dao {
 public String RegisterEvent(Event evnt)
	{
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
	            con = DBConnection.createConnection(); //Fetch database connection object
	            statement = con.createStatement(); //Statement is used to write queries. Read more about it.
	            int k = statement.executeUpdate("insert into club_event(id,event_name,event_descr,dateofevent,addrs,phone,email,rules) values('"+id+"','"+event_name+"','"+event_descr+"','"+dateofevent+"','"+addrs+"','"+phone+"','"+email+"','"+rules+"')");//("select userName,password from users"); //the table name is users and userName,password are columns. Fetching all the records and storing in a resultSet.
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