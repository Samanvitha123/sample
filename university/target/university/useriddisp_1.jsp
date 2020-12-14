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
    <div style="text-align:center"><h1>Welcome To UNIVERSITY WEB PORTAL </h1> </div>
    <br>
        <%
            String q1=null,q2=null,q3=null;
            String[] d=request.getParameter("id").split("-");
            
            
            
            
            %>
    <form name="form" action="ForgetPwdServlet_1" method="post" onsubmit="return validate()">
        <!-- Do not use table to format fields. As a good practice use CSS -->
        <table align="center">
       
         <tr>
         <td>Your Question 1:</td>
         <td><input type="text" name="q1" value="<%=d[0]%>" /></td>
         </tr>
         <tr>
         <td>Your Question Answer:</td>
         <td><input type="text" name="aq1" required="true"/></td>
         </tr>
         
            <tr>
         <td>Your question 2</td>
         <td><input type="text" name="q2" value="<%=d[1]%>"/></td>
         </tr>
         <tr>
         <td>Your Question Answer:</td>
         <td><input type="text" name="aq2" required="true"/></td>
         </tr>
            <tr>
         <td>Your question 3</td>
         <td><input type="text" name="q3" value="<%=d[2]%>"/></td>
         </tr>
         <tr>
         <td>Your Question Answer:</td>
         <td><input type="text" name="aq3" required="true" /></td>
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