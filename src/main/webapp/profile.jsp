<%--
  Created by IntelliJ IDEA.
  User: Legion
  Date: 15.03.2021
  Time: 5:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Profile page</h1><br>

Welcome <%=request.getAttribute("username") %>

<a href="anime_list.jsp">Anime list</a>
<a href="LogoutServlet">Logout</a>

</body>
</html>
