<%--
  Created by IntelliJ IDEA.
  User: Legion
  Date: 15.03.2021
  Time: 1:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2><a href="anime_list.jsp">Check full anime list</a></h2>
<form action="AdminServlet" method="POST">
    <label>title: </label>
    <input type="text" name="title">
    <br>
    <label>genre: </label>
    <input type="text" name="genre">
    <br>
    <label>status: </label>
    <input type="text" name="status">
    <br>
    <label>description: </label>
    <input type="text" name="description">
    <br>
    <input type="submit" value="add">
</form>

</body>
</html>
