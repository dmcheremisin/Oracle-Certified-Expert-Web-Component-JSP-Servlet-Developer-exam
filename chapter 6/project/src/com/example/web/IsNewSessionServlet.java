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
public class IsNewSessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        writer.println("<h1>Test session attribute</h1>");

        HttpSession session = request.getSession();

        // session inactive interval -> 20 minutes
        session.setMaxInactiveInterval(20*60);

        if(session.isNew()){
            writer.println("<h2>Session is new</h2>");
        } else {
            writer.println("<h2>Welcome back</h2>");
        }

        session.setAttribute("isNewSession", "IsNewSessionServlet has already run once");
        session.removeAttribute("value");

    }
}
