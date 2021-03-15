package com.example.MidTermProject.servlets;

import com.example.MidTermProject.dao.UserDAO;
import com.example.MidTermProject.models.User;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDAO userDAO = UserDAO.getInstance();

        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirm_password");

        if (userDAO.getUserByUsername(username) == null) {
            if (password.equals(confirmPassword)) {
                userDAO.addUser(new User(username, password, email));
                req.getRequestDispatcher("login.jsp").include(req, resp);
            } else {
                resp.getWriter().println("<font color=red>Incorrect password confirmation</font>");
            }
        } else {
            resp.getWriter().println("<font color=red>Account with this username already exists</font>");
        }
    }
}

