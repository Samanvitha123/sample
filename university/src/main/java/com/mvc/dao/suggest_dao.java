/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.dao;

import com.mvc.Model.Post;
import com.mvc.Model.suggestions;
import com.mvc.util.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class suggest_dao {
  public String RegisterEvent(suggestions evnt)
	{
		 String username =evnt.getUsername();
 String problem=evnt.getProblem();
 String subcat=evnt.getSubcat();
 String problemtitle=evnt.getProblemtitle();
 String problemdescr=evnt.getProblemdescr();
 String postdt=evnt.getPostdt();
 String usersuggestion=evnt.getUsersuggestion();
 String adminsuggest=evnt.getAdminsuggest();
 String status=evnt.getStatus();
		 Connection con = null;
	        Statement statement = null;
	        ResultSet resultSet = null;
	        try
	        {
	            con = DBConnection.createConnection(); //Fetch database connection object
	            statement = con.createStatement(); //Statement is used to write queries. Read more about it.
	            int k = statement.executeUpdate("insert into suggestions(username,problem,subcat,problemtitle,problemdescr,postdt,usersuggestion,adminsuggest,status) values('"+username+"','"+problem+"','"+subcat+"','"+problemtitle+"','"+problemdescr+"','"+postdt+"','"+usersuggestion+"','"+adminsuggest+"','"+status+"')");//("select userName,password from users"); //the table name is users and userName,password are columns. Fetching all the records and storing in a resultSet.
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
//	    }
    
}
