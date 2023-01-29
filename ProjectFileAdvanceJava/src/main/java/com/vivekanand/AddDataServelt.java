package com.vivekanand;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddDataServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String dep = request.getParameter("dep");
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajp","root","root");
			PreparedStatement smtm  = con.prepareStatement("insert into student(id,sname,dep) values(?,?,?)");
			smtm.setInt(1,id);
			smtm.setString(2, name);
			smtm.setString(3, dep);
			smtm.executeUpdate();
			out.println("Inserted Successfully!!");
		} catch (ClassNotFoundException | SQLException e) {
			}
		out.println("<a href ='/ProjectFileAdvanceJava/QuestionNo3.html'>click to Go Fetch data page</a>");
		
}
}
