package com.vivekanandtest;

import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ValidateServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private static final boolean True = false;

	public void doPost(HttpServletRequest request,HttpServletResponse response) 
	{
		try { 
			response.setContentType("text/html");  
			    PrintWriter out = response.getWriter();  
			      
			    Cookie c[]= request.getCookies();
			    boolean t = false;
			    if (c == null){
			    	out.println("<h1> You are a new user, kindly login. </h1>");
			    	request.getRequestDispatcher("LoginTest.html").include(request, response);
			    	
			    }
			    else {
			    	String name1 = request.getParameter("name");
			    	String pass1 = request.getParameter("pass");
			    	for (int i = 0 ; i< 8; i++) {
			    		if (c[i].getValue().equals(name1) && c[i+1].getValue().equals(pass1))
			    		{
			    			t = True;
			    			out.println("<h1>Welcome to your profile, " + name1);
			    			out.close();  
			    		}
			    	}
			    	if (t == false) {
			    		out.println("<h1> You are a new user, kindly Register. </h1>");
				    	request.getRequestDispatcher("Question2.html").include(request, response);
			    	}
			    }
		}catch(Exception e){System.out.println(e);}  
			    }  
	}
