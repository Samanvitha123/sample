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
    <center>
        <%
HttpSession sessionsb = request.getSession(false);
String user1 = (String) sessionsb.getAttribute("uname");
//JOptionPane.showMessageDialog(null, user);
//String location = (String) sessionsa.getAttribute("location");
%>
<div class="bg2-img">
<h1>Welcome To <%out.println(user1); %></h1>
  <table border="1" width="303">
<tr>
<td width="119"><b>User</b></td>
<td width="168"><b>Title</b></td>
<td width="119"><b>Description</b></td>
<td width="168"><b>Date and Time</b></td>
<td width="119"><b>+Ve</b></td>
<td width="168"><b>-Ve</b></td>
<td width="119"><b>postive vote</b></td>
<td width="119"><b>negative vote</b></td>

</tr>
<%Iterator itr;%>
<% List data= (List)request.getAttribute("data");

for (itr=data.iterator(); itr.hasNext(); )
{
    Object element = itr.next();
%>
<tr>
<td width="119"><%=itr.next()%></td>
<td width="119"><%=itr.next()%></td>
<td width="119"><%=itr.next()%></td>
<td width="119"><%=itr.next()%></td>
<td width="119"><%=itr.next()%></td>
<td width="119"><%=itr.next()%></td>
<td width="119"><a href="posvote.jsp?id=<%=element%>">positive vote</a></td>
<td width="119"><a href="negvote.jsp?id=<%=element%>">negative vote</a></td>
<td width="119"><a href="comment.jsp?id=<%=element%>">comment</a></td>


</tr>
<%}%>
</table>
</div>
</body>
</html>