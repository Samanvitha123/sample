package com.mvc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mvc.bean.LoginBean;
import com.mvc.bean.QAUpdate;
import com.mvc.util.DBConnection;

public class QADao {
	public String updateUser(QAUpdate qaUpdate)
    {
		 String username=qaUpdate.getUsername();
		 String qa1=qaUpdate.getQa1();
		 String ans1=qaUpdate.getAns1();
		 String qa2=qaUpdate.getQa2();
		 String ans2=qaUpdate.getAns2();
		 String qa3=qaUpdate.getQa3();
		 String ans3=qaUpdate.getAns3();
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String userNameDB = "";
        String passwordDB = "";

        try
        {
            con = DBConnection.createConnection(); //Fetch database connection object
            statement = con.createStatement(); //Statement is used to write queries. Read more about it.
            int k = statement.executeUpdate("update users set q1='"+qa1+"',ans1='"+ans1+"',q2='"+qa2+"',ans2='"+ans2+"',q3='"+qa3+"',ans3='"+ans3+"' where username='"+username+"'");

            if(k>0) // Until next row is present otherwise it return false
            {
            // userNameDB = resultSet.getString("userName"); //fetch the values present in database
             //passwordDB = resultSet.getString("password");

            //  if(userName.equals(userNameDB) && password.equals(passwordDB))
              {
                 return "SUCCESS"; ////If the user entered values are already present in the database, which means user has already registered so return a SUCCESS message.
              }
            }
        }
            catch(SQLException e)
            {
               e.printStackTrace();
            }
            return "Invalid user credentials"; // Return appropriate message in case of failure
        }
    }

