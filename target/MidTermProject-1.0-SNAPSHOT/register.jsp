<%--
  Created by IntelliJ IDEA.
  User: Legion
  Date: 15.03.2021
  Time: 0:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form name="form" action="RegisterServlet" method="post">
    <table align="center">
        <tr>
            <td>Email</td>
            <td><input type="text" name="email" /></td>
        </tr>
        <tr>
            <td>Username</td>
            <td><input type="text" name="username" /></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password" /></td>
        </tr>
        <tr>
            <td>Confirm Password</td>
            <td><input type="password" name="confirm_password" /></td>
        </tr>
        <tr>
            <td>Submit</td>
            <td>
                <input type="submit"/>
            </td>
        </tr>
        <tr>
            <td>Have an account?</td>
            <td><a href="LoginServlet">Click here</a></td>
        </tr>
    </table>
</form>

</body>
</html>
