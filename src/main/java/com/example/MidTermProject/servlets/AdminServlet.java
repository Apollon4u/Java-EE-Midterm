package com.example.MidTermProject.servlets;

import com.example.MidTermProject.dao.AnimeDAO;
import com.example.MidTermProject.models.Anime;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class AdminServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("anime_list", AnimeDAO.getInstance().getAnimeList());
        request.getRequestDispatcher("admin.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String genre = request.getParameter("genre");
        String status = request.getParameter("status");
        String description = request.getParameter("description");
        AnimeDAO.getInstance().getAnimeList().add(new Anime(title, genre, status, description));

        response.sendRedirect("anime_list.jsp");
    }
}
