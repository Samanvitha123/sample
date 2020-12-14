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
    <br>
    <form name="form" action="RegisterQA" method="post" onsubmit="return validate()">
        <!-- Do not use table to format fields. As a good practice use CSS -->
        <table align="center">
        
          <tr>
         <td>Username:</td>
         <td><input type="text" name="username" readonly=true value="<%=user%>"/></td>
         
         </tr>
         <tr>
         <td>Select question 1:</td>
         <td>
         <select name="qa1">
         <option>What was your childhood nickname?</option>
<option>In what city did you meet your spouse/significant other?</option>
<option>What is the name of your favorite childhood friend?</option>
<option>What street did you live on in third grade?</option>
<option>What is your oldest sibling’s birthday month and year? (e.g., January 1900)</option>
<option>What is the middle name of your youngest child?</option>
<option>What is your oldest sibling's middle name?</option>
<option>What school did you attend for sixth grade?</option>
         </select>
         <td><input type="text" name="ans1" value="answer"></input></td>
         </td>
         </tr>
          <tr>
         <td>Select question 2:</td>
         <td>
         <select name="qa2">
         <option>What was your childhood nickname?</option>
<option>In what city did you meet your spouse/significant other?</option>
<option>What is the name of your favorite childhood friend?</option>
<option>What street did you live on in third grade?</option>
<option>What is your oldest sibling’s birthday month and year? (e.g., January 1900)</option>
<option>What is the middle name of your youngest child?</option>
<option>What is your oldest sibling's middle name?</option>
<option>What school did you attend for sixth grade?</option>
         </select>
         <td><input type="text" name="ans2" value="answer"></input></td>
         </td>
         </tr>
         
          <tr>
         <td>Select question 3:</td>
         <td>
         <select name="qa3">
         <option>What was your childhood nickname?</option>
<option>In what city did you meet your spouse/significant other?</option>
<option>What is the name of your favorite childhood friend?</option>
<option>What street did you live on in third grade?</option>
<option>What is your oldest sibling’s birthday month and year? (e.g., January 1900)</option>
<option>What is the middle name of your youngest child?</option>
<option>What is your oldest sibling's middle name?</option>
<option>What school did you attend for sixth grade?</option>
         </select>
         <td><input type="text" name="ans3" value="answer"></input></td>
         </td>
         </tr>
         <tr> <!-- refer to the video to understand request.getAttribute() -->
         <td><span style="color:red"><%=(request.getAttribute("errMessage") == null) ? ""
         : request.getAttribute("errMessage")%></span></td>
         </tr>
         <tr>
         <td></td>
         <td><input type="submit" value="submit"></input>
         <input type="reset" value="Reset"></input></td>
         </tr>
         
         
         
        </table>
    </form>
</body>
</html>