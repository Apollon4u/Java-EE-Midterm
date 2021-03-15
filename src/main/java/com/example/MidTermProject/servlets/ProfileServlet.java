package com.example.MidTermProject.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class ProfileServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        if (session != null) {
            resp.getWriter().print("Hello, " + session.getAttribute("username"));
        } else {
            resp.getWriter().print("Please login first");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }
}
