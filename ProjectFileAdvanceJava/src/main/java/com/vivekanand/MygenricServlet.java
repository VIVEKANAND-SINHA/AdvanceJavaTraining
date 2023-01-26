package com.vivekanand;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MygenricServlet extends GenericServlet
{
	private static final long serialVersionUID = 1L;

@Override
public void service(ServletRequest request, ServletResponse res) throws ServletException, IOException {
	
PrintWriter out = res.getWriter();
out.println("<h1>This is GenericServlet class implementation!</h1>");

}
}
