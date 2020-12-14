<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.mvc.util.DBConnection"%>
<%@page import="java.sql.Connection"%>
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
  background-color: red;
}

.subnav-content {
  display: none;
  position: absolute;
  left: 0;
  background-color: red;
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
//JOptionPane.showMessageDialog(null, user);
//String location = (String) sessionsa.getAttribute("location");
%>
    <div style="text-align:center"><h1>Welcome To UNIVERSITY WEB PORTAL </h1> </div>
    <br><center>
    <h1>Welcome To USer<h2><%out.println(user); %></h2></h1>
    <div class="navbar">
  <a href="Home.jsp">Home</a>
  <div class="subnav">
    <button class="subnavbtn">Events <i class="fa fa-caret-down"></i></button>
    <div class="subnav-content">
      <a href="user_view_event">View events</a>
      <a href="user_search_event">Search</a>
      <a href="user_event_complaint">Raise Complaint</a>
      <a href="mark_evnt_att">Mark Attendance</a>
      <a href="mark_evnt_intr">Mark Intrested</a>
      
      
    </div>
  </div> 
  <div class="subnav">
    <button class="subnavbtn">Services <i class="fa fa-caret-down"></i></button>
    <div class="subnav-content">
      <a href="#bring">Bring</a>
      <a href="#deliver">Deliver</a>
      <a href="#package">Package</a>
      <a href="#express">Express</a>
    </div>
  </div> 
  <div class="subnav">
    <button class="subnavbtn">Partners <i class="fa fa-caret-down"></i></button>
    <div class="subnav-content">
      <a href="#link1">Link 1</a>
      <a href="#link2">Link 2</a>
      <a href="#link3">Link 3</a>
      <a href="#link4">Link 4</a>
    </div>
  </div>
  <a href="#contact">Contact</a>
</div>

    </center>

<%try{
    Connection con = DBConnection.createConnection(); 
    Statement st = con.createStatement(); 
    ResultSet rs=st.executeQuery("select distinct(year(dateofevent)) from event");
    while(rs.next())
    {%>
    <h2>Monthly Report::::::<%=rs.getString(1)%></h2>
    <table border="1" width="303">
<tr>
<td width="119"><b>ID</b></td>
<td width="168"><b>Message</b></td>
<td width="119"><b>ID</b></td>
<td width="168"><b>Message</b></td>
<td width="119"><b>ID</b></td>
<td width="168"><b>Message</b></td>
<td width="119"><b>ID</b></td>
<td width="168"><b>Message</b></td>

</tr>
        <%
        Statement stt=con.createStatement();
        ResultSet rss=stt.executeQuery("select * from event where year(dateofevent)='"+rs.getString(1)+"'");
        while(rss.next())
        {
            %>
            
            <tr>
            <td width="119"><%=rss.getString(1)%></td>
            <td width="119"><%=rss.getString(2)%></td>
            <td width="119"><%=rss.getString(3)%></td>
            <td width="119"><%=rss.getString(4)%></td>
            <td width="119"><%=rss.getString(5)%></td>
            <td width="119"><%=rss.getString(6)%></td>
            <td width="119"><%=rss.getString(7)%></td>
            <td width="119"><%=rss.getString(8)%></td>
            </tr>


            <%
        }
%>
</table>
<%
    }
	          
%>
</tr>
<%}

catch(Exception e)
{
e.printStackTrace();
}
%>
</table>
</body>
</html>