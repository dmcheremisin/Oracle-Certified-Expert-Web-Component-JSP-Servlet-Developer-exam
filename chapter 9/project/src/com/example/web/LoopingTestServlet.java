package com.example.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class LoopingTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] movieList = {"Amelie", "Return of the King", "Mean girls"};
        request.setAttribute("movieList", movieList);

        String[] newMovies = {"Matrix: Revolution", "Kill Bill", "Skyscraper"};
        List<String[]> allMovies = Arrays.asList(movieList, newMovies);
        request.setAttribute("allMovies", allMovies);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("LoopingTest.jsp");
        requestDispatcher.forward(request, response);
    }
}