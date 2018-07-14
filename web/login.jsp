<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>


        <form action="Login" method="post">
            Enter Email: <input type="text" name="email">
            Enter Password: <input type="password" name="pass">
            <input type="submit" value="login">
            <tr>
                <td colspan="2">Yet Not Registered!! <a href="register.jsp">Register Here</a></td>
            </tr>
        </form>
    </body>
</html>
