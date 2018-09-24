package com.example.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MapSetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> map = new HashMap<>();
        map.put("Fluffy", "Doberman");

        req.setAttribute("dogs", map);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("SetTest.jsp");
        requestDispatcher.forward(req, resp);

    }
}
