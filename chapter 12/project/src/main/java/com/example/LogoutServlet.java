package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Dmitrii on 28.09.2018.
 */
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();
        PrintWriter writer = resp.getWriter();
        writer.println("<html>" +
                "<head></head>" +
                "<body>" +
                "<h1 align='center'>Your session data is invalidated</h1>" +
                "</html>");
    }
}
