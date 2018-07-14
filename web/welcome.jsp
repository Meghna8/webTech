<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(session.getAttribute("emailID")==null)  //from Login servlet we store email value to emailID
            {
                response.sendRedirect("login.jsp");
          
            }
        %>
        Welcome ${emailID} <!--and that stored emailID is printed here-->
        
        <form action="Logout">        <!--from this we call Logout servlet-->
            <input type="submit" value="Logout">
        </form>
        
    </body>
</html>