package com.vivekanand;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddCookiesValueServlet  extends HttpServlet{

	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		Cookie c1 = new Cookie("UserName",name);
		Cookie c2 = new Cookie("email",email);
		response.addCookie(c1);
		response.addCookie(c2);
		response.setContentType("text/html");
		out.println("Cookies has been set!");
//		out.println("<h1> <a href='/DisplaySetCookies'>Go to Display Cookies</a></h1>");
		
		 out.println("<form action='DisplaySetCookies' method = 'post'>");
		 out.println("<h1> press the button to show the cookies</h1>");
		 out.println("<input type='submit' value='go to Dispaly Cookies page'>");  
		 out.println("</form>");  
		          
		 out.close();
	}

}
		

