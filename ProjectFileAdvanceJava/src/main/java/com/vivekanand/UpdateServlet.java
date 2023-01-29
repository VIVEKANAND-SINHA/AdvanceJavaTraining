package com.vivekanand;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 	
	{
	String name = request.getParameter("name");
	int newSalary = Integer.parseInt(request.getParameter("salary"));
	PrintWriter out = response.getWriter();			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajp","root","root");
				Statement stmt = con.createStatement();
				String sql = "UPDATE emp " +
			            "SET salary = '"+newSalary+"' WHERE name = '"+name+"'";
				stmt.executeUpdate(sql);
				out.println("Updated Successfully!!");
		
			} catch (ClassNotFoundException | SQLException e) {
				out.print(e);
	
			}
			}
}
