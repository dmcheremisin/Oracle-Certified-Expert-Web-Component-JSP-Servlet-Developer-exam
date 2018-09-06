package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FileDownload extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("application/pdf");

		ServletContext ctx = getServletContext();
		InputStream resource = ctx.getResourceAsStream("/sample.pdf");

		int read = 0;
		byte[] bytes = new byte[1024];
		try (ServletOutputStream servletOutputStream = response.getOutputStream();
			 BufferedOutputStream bufferedStream = new BufferedOutputStream(servletOutputStream)) {
			while ((read = resource.read(bytes)) != -1) {
				bufferedStream.write(bytes, 0, read);
			}
			bufferedStream.flush();
		}
	}
}