package com.vivekanand;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
public class HelloServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String name = request.getParameter("name");
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello! " + name + " This is Your First Servlet ");
		out.close();
		
	}
	
}
