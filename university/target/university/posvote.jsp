<%-- 
    Document   : posvote
    Created on : 27 May, 2020, 10:02:49 AM
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
            String id=request.getParameter("id");
             Connection con = DBConnection.createConnection(); 
             Statement st=con.createStatement();
             int k=st.executeUpdate("update idea_db set posvote=posvote+1 where id='"+id+"'");
             if(k>0)
             {
                 out.println("<script> alert(\"Vote Inserted succefully!\");</script>");
	        	out.println("<script> location.replace('Home.jsp', '_blank')</script>");
             }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        %>
    </body>
</html>
