package com.example.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FormProcessingServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> names = Arrays.asList("Fred", "Pradeep", "Philippe");
        request.setAttribute("friends", names);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("hobbyFriends.jsp");
        requestDispatcher.forward(request, response);
    }
}
