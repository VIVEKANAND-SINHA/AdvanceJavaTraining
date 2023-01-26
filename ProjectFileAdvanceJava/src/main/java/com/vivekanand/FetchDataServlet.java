package com.vivekanand;

import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;
import java.sql.Connection;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class FetchDataServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		out.println("this is working");
		
	try {
		Connection con = CreateConnection.initializeDatabase();
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from emp");  
		PrintWriter pw = response.getWriter();
		while(rs.next())  
		pw.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(4));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  

		
	
	}




