package com.example.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Dmitrii on 14.09.2018.
 */
public class GetSessionFalseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        writer.println("<h1>Test get session false</h1>");

        HttpSession session = request.getSession(false);

        if(session == null){
            writer.println("<h2>No session available</h2>");
            writer.println("<p>making one....</p>");
            session = request.getSession();
        } else {
            writer.println("<h2>There was a session</h2>");
        }

        session.setAttribute("value", 10);
        session.setAttribute("falseServlet", "GetSessionFalseServlet has already run once");

    }
}
