package com.example.MidTermProject.servlets;

import com.example.MidTermProject.dao.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("index.jsp");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDAO userDAO = UserDAO.getInstance();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (userDAO.getUserByUsername(username) != null) {
            if (userDAO.getUserByUsername(username).getPassword().equals(password)) {
                HttpSession session = req.getSession();
                session.setAttribute("username", username);
                req.getRequestDispatcher("admin.jsp").forward(req, resp);
            } else if (username.equals("admin") && password.equals("admin")) {
//                HttpSession session = req.getSession();
//                session.setAttribute("username", username);
                req.getRequestDispatcher("admin.jsp").include(req, resp);
            } else {
                req.getRequestDispatcher("login.jsp").include(req, resp);
                resp.getWriter().println("<font color=red>Incorrect password</font>");
            }
        } else {
            req.getRequestDispatcher("login.jsp").include(req, resp);
            resp.getWriter().println("<font color=red>Account with this username doesn't exist</font>");
        }
    }
}
