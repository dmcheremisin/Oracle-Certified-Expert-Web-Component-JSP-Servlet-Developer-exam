package com.example.cookies;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Dmitrii on 14.09.2018.
 */
public class TestCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        Cookie[] cookies = request.getCookies();
        String username = Stream.of(cookies)
                .filter(c -> c.getName().equalsIgnoreCase("username"))
                .map(Cookie::getValue)
                .findFirst().orElse(null);

        PrintWriter writer = response.getWriter();
        writer.println("<h1>Cookie username</h1>");
        writer.println("<h2>Value: " + username + "</h2>");

    }
}
