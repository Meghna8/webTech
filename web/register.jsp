<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ENTER YOUR DETAILS</h1>
        <body>
        <form method="post" action="Registration">
            <center>
            <table border="1" width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">ENTER YOUR DETAILS</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Enter Employee ID</td>
                        <td><input type="text" name="empID" value="" /></td>
                    </tr>
                    <tr>
                        <td>First Name</td>
                        <td><input type="text" name="firstname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><input type="text" name="lastname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="email" value="" /></td>
                    </tr>
                    <tr>
                        <td>User Name</td>
                        <td><input type="text" name="uname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pass" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enter Your Salary</td>
                        <td><input type="text" name="salary" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enter Your Designation</td>
                        <td><input type="text" name="designation" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enter Your Team Name</td>
                        <td><input type="text" name="team" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enter Your Contact Number</td>
                        <td><input type="text" name="contact" value="" /></td>
                    </tr>
                    
                    <tr>
                        <td><input type="submit" value="Submit" /> <a href='welcome.jsp'></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">Already registered!! <a href="login.jsp">Login Here</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>
    </body>
</html>
