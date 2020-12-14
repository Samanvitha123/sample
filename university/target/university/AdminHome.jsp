<%@page import="javax.swing.JOptionPane"%>
<%@page import="org.springframework.core.env.JOptCommandLinePropertySource"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
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
<script> 
function validate()
{ 
     var username = document.form.username.value; 
     var password = document.form.password.value;
 
     if (username==null || username=="")
     { 
     alert("Username cannot be blank"); 
     return false; 
     }
     else if(password==null || password=="")
     { 
     alert("Password cannot be blank"); 
     return false; 
     } 
}
</script> 
</head>
<body>
<%
HttpSession sessionsa = request.getSession(false);
String user = (String) sessionsa.getAttribute("uname");
//JOptionPane.showMessageDialog(null, user);
//String location = (String) sessionsa.getAttribute("location");
%>
    <div style="text-align:center"><h1>Welcome To UNIVERSITY WEB PORTAL </h1> </div>
    <br><center>
    <h1>Welcome To USer<h2><%out.println(user); %></h2></h1>
    <a href="event_create.jsp">Create Events</a></br>
    <a href="view">Manage Events</a></br>
    <a href="create_club.jsp">Create club</a></br>
    <a href="ClubView">Manage Club</a></br>
    <a href="viewclbmembers">Manage Club Members</a></br>
    <a href="service_create.jsp">Create Service</a></br>
    <a href="service_manage">Manage Service</a></br>
    <a href="service_reports.jsp">Service_reports</a></br>
    <a href="event_report.jsp">Event_reports</a></br>
    <a href="view_queries.jsp">View Queries</a></br>
    <a href="view_complaints.jsp">View Complaints</a></br>
    
    
    
    
    
    </center>
    
</body>
</html>