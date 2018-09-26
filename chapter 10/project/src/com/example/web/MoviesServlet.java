package com.example.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Dmitrii on 26.09.2018.
 */
public class MoviesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> movies = Arrays.asList("Kill Bill", "Matrix", "Skyscraper");
        req.setAttribute("movies", movies);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("tagsTest/IterateMoviesFromParams.jsp");
        requestDispatcher.forward(req, resp);
    }
}
