package com.vivekanand;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SetCookiesServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		out.println("<h1>Creating Cookies");
		String name = req.getParameter("name");
		Cookie c = new Cookie("UserName",name);
		res.addCookie(c);
		out.println("<h1>Cookies Created");
		out.println("<h1> Value of Cookie: "+c.getValue());
		out.close();
		
		
		
}
}
