<%--
  Created by IntelliJ IDEA.
  User: Legion
  Date: 14.03.2021
  Time: 23:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="LoginServlet" method="post">
    Username:<input type="text" name="username"><br>
    Password:<input type="password" name="password"><br>
    <input type="submit">
    Don't have an account?<a href="register.jsp"> Click here</a>
</form>

</body>
</html>
