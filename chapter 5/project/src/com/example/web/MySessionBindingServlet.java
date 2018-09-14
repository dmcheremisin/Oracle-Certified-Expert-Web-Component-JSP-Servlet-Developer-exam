package com.example.web;

import com.example.models.Dog;

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
public class MySessionBindingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Session dog test</h1>");

        HttpSession session = request.getSession();
        Object dog = session.getAttribute("dog");
        if(dog instanceof Dog) {
            Dog trueDog = (Dog) dog;
            writer.println("<p>Dog's breed is : " + trueDog.getBreed() + "</p>" );
        }
    }
}
