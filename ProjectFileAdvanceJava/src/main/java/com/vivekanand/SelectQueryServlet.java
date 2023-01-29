package com.vivekanand;

import jakarta.servlet.ServletException;
import java.sql.*;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SelectQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public SelectQueryServlet() {
        super();
        }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajp","root","root");
			Statement stmt = con.createStatement();
			PrintWriter out = response.getWriter();
			ResultSet rs = stmt.executeQuery("Select sname from Student");
			while (rs.next()) 
			{
			out.println(rs.getString(1)+"  ");	
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}

}
