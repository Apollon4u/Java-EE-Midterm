package com.example.MidTermProject.servlets;

import com.example.MidTermProject.dao.AnimeDAO;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class AnimeListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        req.setAttribute("anime_list", AnimeDAO.getInstance().getAnimeList());
        req.getRequestDispatcher("anime_list.jsp").forward(req, response);
    }

}
