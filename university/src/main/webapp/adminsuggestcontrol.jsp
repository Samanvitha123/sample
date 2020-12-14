<%-- 
    Document   : suggestcontrol
    Created on : 27 May, 2020, 9:38:33 PM
    Author     : DELL
--%>

<%@page import="java.sql.Statement"%>
<%@page import="com.mvc.util.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        try{
             Connection con = DBConnection.createConnection(); //Fetch database connection object
	     Statement st = con.createStatement(); //Statement is used to write queries. Read more about it.
             int k=st.executeUpdate("update suggestions set adminsuggest='"+request.getParameter("descr")+"',status='In progress' where id='"+request.getParameter("id")+"'");
             if(k>0)
                 response.sendRedirect("Home.jsp");
             else
                 response.sendRedirect("Home.jsp?message=fail");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        %>
    </body>
</html>
