package com.vivekanand;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		PrintWriter out = response.getWriter();
		out.println("Redirecting to new Html page ");
		RequestDispatcher rd = request.getRequestDispatcher("Add.jsp");
		response.sendRedirect("/ProjectFileAdvanceJava/redirectedhtml.html"); 
	}

	
}  
