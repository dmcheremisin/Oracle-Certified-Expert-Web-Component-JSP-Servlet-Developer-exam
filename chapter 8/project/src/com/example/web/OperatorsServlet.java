package com.example.web;

import com.example.nestedClasses.Dog;
import com.example.nestedClasses.Human;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperatorsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // map
        Map<String, String> map = new HashMap<>();
        map.put("first", "First value");
        map.put("second", "Second value");
        request.setAttribute("map", map);

        // array
        String[] music = {"Zero 7", "Tahiti 80", "BT", "Frou Frou"};
        request.setAttribute("music", music);

        List<String> favoriteFood = new ArrayList<>();
        favoriteFood.add("chai ice cream");
        favoriteFood.add("fajitas");
        favoriteFood.add("thai pizza");
        favoriteFood.add("anything in dark chocolate");
        request.setAttribute("favoriteFood", favoriteFood);

        request.setAttribute("one", "first");
        
        List<String> nums = new ArrayList<>();
        nums.add("1");
        nums.add("2");
        nums.add("3");
        request.setAttribute("numbers", nums);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("OperatorsTest.jsp");
        requestDispatcher.forward(request, response);
    }
}
