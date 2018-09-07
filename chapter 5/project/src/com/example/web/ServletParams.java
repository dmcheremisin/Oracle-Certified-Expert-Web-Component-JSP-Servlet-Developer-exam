package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Enumeration;

public class ServletParams extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");

		PrintWriter writer = response.getWriter();
		writer.println("<h1>Servlet parameter values</h1>");

		writer.println("<h2>Context parameters</h2>");
		Enumeration<String> contextParams = getServletContext().getInitParameterNames();
		while(contextParams.hasMoreElements()) {
			writer.println("<p>" + contextParams.nextElement() + "</p>");
		}

		writer.println("<h2>Servlet init parameters</h2>");
		String userMail = getInitParameter("userMail");
		writer.println("User mail: " + userMail);
	}
}