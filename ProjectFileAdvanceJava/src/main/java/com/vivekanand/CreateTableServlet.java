package com.vivekanand;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
public class CreateTableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CreateTableServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		try {
			String sql = "Create Table demoTable ( name varchar(30),surname varchar(40))";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajp","root","root");
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			out.println("TAble Created SuccessFully!!");
			
			
		} catch (SQLException | ClassNotFoundException e) {
			out.print(e);
		}
	}

}
