package com.vivekanand;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchITEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try {
			Connection con = CreateConnection.initializeDatabase();
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from emp where dep = 'IT'");  
			PrintWriter pw = response.getWriter();
			while(rs.next())  
			pw.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(4));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  

	
	}
