<%@page import="javax.swing.JOptionPane"%>
<%@page import="org.springframework.core.env.JOptCommandLinePropertySource"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ include file = "userhomemenu.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"[]>

<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-US" xml:lang="en">
<head>
    <!--
    Created by Artisteer v3.1.0.48375
    Base template (without user's data) checked by http://validator.w3.org : "This page is valid XHTML 1.0 Transitional"
    -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Home</title>



    <link rel="stylesheet" href="style.css" type="text/css" media="screen" />
    <!--[if IE 6]><link rel="stylesheet" href="style.ie6.css" type="text/css" media="screen" /><![endif]-->
    <!--[if IE 7]><link rel="stylesheet" href="style.ie7.css" type="text/css" media="screen" /><![endif]-->

    <script type="text/javascript" src="jquery.js"></script>
    <script type="text/javascript" src="script.js"></script>

</head>
<body>
<div class="bg2-img">
    <center>
        <%
HttpSession sessionsl = request.getSession(false);
String user6 = (String) sessionsl.getAttribute("uname");
//JOptionPane.showMessageDialog(null, user);
//String location = (String) sessionsa.getAttribute("location");
String id=request.getParameter("id");
%>
<h1>Welcome To USer<h2><%out.println(user6); %></h2></h1>
    <form method="post" action="adminsuggestcontrol.jsp">
        ID:<input type="text" name="id" value="<%=id%>"></input>
      
        User Name:<input type="text" name="uname" value="<%=user6%>"></input>
      
        Enter User Suggestion<input type="text" name="descr" required="true"></br></br>
            <input type="submit" name="submit" value="post"></input>
    </form>
<body>

    </center>
    </div>
</body>
</html>