<%@ page import="com.example.MidTermProject.models.Anime" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.MidTermProject.dao.AnimeDAO" %><%--
  Created by IntelliJ IDEA.
  User: Legion
  Date: 15.03.2021
  Time: 1:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
      <div>
          <h1>Anime List</h1>
          <a href="LogoutServlet">Logout</a><br>
      </div>

      <%
          ArrayList<Anime> list = AnimeDAO.getInstance().getAnimeList();
          for(Anime a:list){
            %><tr>
                <td><%=a.getTitle()%></td>
                <td><%=a.getGenre()%></td>
                <td><%=a.getStatus()%></td>
                <td><%=a.getDescription()%></td>
              </tr><%
          }
      %>
  </body>
</html>
