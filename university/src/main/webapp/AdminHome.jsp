<%@page import="javax.swing.JOptionPane"%>
<%@page import="org.springframework.core.env.JOptCommandLinePropertySource"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"[]>

<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-US" xml:lang="en">
<head>
   
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Home</title>
    <link rel="stylesheet" href="style.css" type="text/css" media="screen" />
    
    <script type="text/javascript" src="jquery.js"></script>
    <script type="text/javascript" src="script.js"></script>
    

</head>

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
%> 
	<div class="bg1-img">
    <div style="text-align:center"><h1>Welcome To UNIVERSITY WEB PORTAL </h1> </div>
    <br><center>
    <h1>Welcome To <%out.println(user); %></h1></br>
    <form method="link" action="event_create.jsp">
    <input type="submit" value="Create Events"/>
	</form></br>
	<form method="link" action="view">
    <input type="submit" value="Manage Events"/>
	</form></br>
    <form method="link" action="create_club.jsp">
    <input type="submit" value="Create Club"/>
    </form></br>
    <form method="link" action="ClubView">
    <input type="submit" value="Manage Club"/>
    </form></br>
    
    <form method="link" action="service_create.jsp">
    <input type="submit" value="Create Service"/>
	</form></br>
    <form method="link" action="service_manage">
    <input type="submit" value="Manage Service"/>
	</form></br>
    <form method="link" action="service_reports.jsp">
    <input type="submit" value="Service Reports"/>
	</form></br>
    <form method="link" action="event_report.jsp">
    <input type="submit" value="Event Reports"/>
	</form></br>
    <form method="link" action="view_complaints">
    <input type="submit" value="View Complaints"/>
	</form></br>
	<form method="link" action="AdminHelp">
    <input type="submit" value="Help"/>
	</form></br>
    <form method="link" action="logout.jsp">
    <input type="submit" value="Logout"/>
	</form>
    
    </center>
  </div>
</body>
</html>