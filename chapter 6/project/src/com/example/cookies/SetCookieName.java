package com.example.cookies;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Dmitrii on 14.09.2018.
 */
public class SetCookieName extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");

        Cookie cookie = new Cookie("username", name);
        cookie.setMaxAge(30*60); // 30 minutes

        response.addCookie(cookie);

        response.sendRedirect("test-cookie");
    }
}
