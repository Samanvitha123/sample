<%@page language="java" import="java.util.*" %>
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
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  margin: 0;
}

.navbar {
  overflow: hidden;
  background-color: #333; 
}

.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.subnav {
  float: left;
  overflow: hidden;
}

.subnav .subnavbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .subnav:hover .subnavbtn {
  background-color: grey;
}


.bg2-img {
  /* The image used */
  background-image: url('images/uni5.jpg');
  height: 100%;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}


.subnav-content {
  display: none;
  position: absolute;
  left: 75;
  background-color: grey;
  width: 100%;
  z-index: 1;
}

.subnav-content a {
  float: left;
  color: white;
  text-decoration: none;
}

.subnav-content a:hover {
  background-color: #eee;
  color: black;
}

.subnav:hover .subnav-content {
  display: block;
}
</style>
</head>
<body>
<%
HttpSession sessionsa = request.getSession(false);
String user = (String) sessionsa.getAttribute("uname");
%>
	
    <div style="text-align:center"><h1>Welcome To UNIVERSITY WEB PORTAL </h1> </div>
    <br><center>
    
    <div class="navbar">
  <a href="Home.jsp">Home</a>
  <div class="subnav">
    <button class="subnavbtn">Events <i class="fa fa-caret-down"></i></button>
    <div class="subnav-content">
      <a href="user_view_event">View events</a>
      <a href="user_search_event.jsp">Search</a>
      <a href="user_event_complaint">Raise Complaint</a>
      <a href="user_event_complaint">Mark Attendance</a>
      <a href="user_event_complaint">Mark Intrested</a>
      
      
    </div>
  </div> 
  <div class="subnav">
    <button class="subnavbtn">Idea submission  <i class="fa fa-caret-down"></i></button>
    <div class="subnav-content">
      <a href="post_idea.jsp">Post a new Idea</a>
      <a href="view_ideas">View Ideas</a>
      
    </div>
  </div> 
  <div class="subnav">
    <button class="subnavbtn">Complaints/suggestion <i class="fa fa-caret-down"></i></button>
    <div class="subnav-content">
      <a href="postcomplaint.jsp">Post Complaint</a>
      <a href="usersuggestion">User suggestions</a>
      <a href="viewcomplaintandmark">View Complaint and mark</a>
     
    </div>
  </div>
  <div class="subnav">
    <button class="subnavbtn">Club Data <i class="fa fa-caret-down"></i></button>
    <div class="subnav-content">
      <a href="viewclubs">View Clubs</a>
      <a href="joinedclubs?id=<%=user%>">Joined Clubs</a>
      
     
     
    </div>
  </div>
      <div class="subnav">
    <button class="subnavbtn">Service Data <i class="fa fa-caret-down"></i></button>
    <div class="subnav-content">
      <a href="viewservices">View Service</a>
      <a href="joinedservice?id=<%=user%>">Joined Services</a>
         </div>
  </div>
      <div class="subnav">
    <button class="subnavbtn">Help<i class="fa fa-caret-down"></i></button>
    <div class="subnav-content">
      <a href="help.jsp">Raise Ticket</a>
      <a href="resolve.jsp">Find Solution</a>
         </div>
  </div>
  
   <div>
  <a href="logout.jsp">Logout</a>
  </div>
</div>

    </center>
   
    </body>
</html>