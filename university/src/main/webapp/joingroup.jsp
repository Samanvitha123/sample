<%-- 
    Document   : joingroup
    Created on : 27 May, 2020, 10:01:12 PM
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
            Connection con=DBConnection.createConnection();
            Statement st=con.createStatement();
            String d=request.getParameter("id");
            HttpSession sessionsa = request.getSession(false);
String user = (String) sessionsa.getAttribute("uname");
out.println(d);
            int k=st.executeUpdate("insert into joined_groups(username,groupname,status) values('"+user+"','"+d+"','joined')");
            if(k>0)
            {
                response.sendRedirect("Home.jsp");
            }
            else response.sendRedirect("Home.jsp?message=fail");
                
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        %>
    </body>
</html>
