<%@ include file = "userhomemenu.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <div class="bg2-img">
    <center>
        <%
        String id=request.getParameter("id");
        %>
        <form method="post" action="event_eomplaint">
            Event ID:<input type="text" name="id" value="<%=id%>"></br>
            Event Complaint<input type="text" name="msg"></br>
            Mark Attendance:</br>
            Present:<input type="radio" name="attnd" value="present"></br>
            Absent:<input type="radio" name="attnd" value="absent"></br>
            
            Mark Like/DisLike:</br>
            Like:<input type="radio" name="lk" value="like"></br>
            DisLike:<input type="radio" name="lk" value="dislike"></br>
            
            Mark Intrested/NOT:</br>
            Intrested:<input type="radio" name="intr" value="intrest"></br>
            Not:<input type="radio" name="intr" value="notintrest"></br>
            
            
            <input type="submit" name="submit"value="submit"></input>
        </form>
    </center>
    </div>
    </body>
</html>
