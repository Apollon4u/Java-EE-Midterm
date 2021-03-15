package com.example.MidTermProject.filters;

import javax.servlet.*;
import java.io.IOException;
import java.util.logging.Logger;

public class LoggingFilter implements Filter {
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Logger logger = Logger.getLogger("log");
        logger.info(servletRequest.getParameter("username"));
        logger.info(servletRequest.getParameter("email"));
        logger.info(servletRequest.getParameter("password"));
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
