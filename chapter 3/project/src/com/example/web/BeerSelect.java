package com.example.web;

import com.example.model.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.List;

public class BeerSelect extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Beer Selection Advice</h1>");
		String c = request.getParameter("color");
		out.println("<h2>Got beer color: " + c + "</h2>");
		BeerExpert beerExpert = new BeerExpert();
		List<String> brands = beerExpert.getBrands(c);
		out.println("<h3>Recommendations: </h2>");
		brands.forEach(b -> out.println("<h4>" + b + "</h4>") );
	}
}