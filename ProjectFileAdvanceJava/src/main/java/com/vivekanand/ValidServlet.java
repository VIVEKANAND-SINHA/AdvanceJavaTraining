package com.vivekanand;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ValidServlet  extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private static final boolean True = false;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		try { 
			response.setContentType("text/html");  
			    PrintWriter out = response.getWriter();  
			      
			    Cookie c[]= request.getCookies();
			    boolean t = false;
			    if (c == null){
			    	out.println("<h1> You are a new user, kindly login. </h1>");
			    	request.getRequestDispatcher("login.html").include(request, response);
			    	
			    }
			    else {
			    	String name1 = request.getParameter("name");
			    	for (Cookie ck : c) {
			    		String tempName = ck.getValue();
			    		out.println(ck.getValue());
               
			    		if (tempName.equals(name1))
			    		{
			    			String name = ck.getValue(); 
			    			t = True;
			    			out.println("<h1>Welcome to your profile, " + name);
			    			out.close();  
			    		}
			    	}
			    	if (t == false) {
			    		out.println("<h1> You are a new user, kindly Register. </h1>");
				    	request.getRequestDispatcher("Question19.html").include(request, response);
			    	}

			    }
		}catch(Exception e){System.out.println(e);}  
			    }  
			      
			  
		}
