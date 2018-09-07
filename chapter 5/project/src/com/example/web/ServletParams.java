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
		ServletContext ctx = getServletContext();
		Enumeration<String> contextParams = ctx.getInitParameterNames();
		while(contextParams.hasMoreElements()) {
			String name = contextParams.nextElement();
			writer.println("<p>" + name + " : " + ctx.getInitParameter(name) + "</p>");
		}

		writer.println("<h2>Servlet init parameters</h2>");
		String userMail = getInitParameter("userMail");
		writer.println("User mail: " + userMail);
	}
}