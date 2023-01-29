package com.ajp;

import java.sql.*;

public class Procedures {
	public static void main(String[] args) {
		Connection con=null;
		try
		{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajp",
		             "root", "root");
			CallableStatement cs=con.prepareCall("{call updateEmpSalary(?,?)}");
			cs.setInt(1,101);
			cs.setDouble(2,0.1);
			cs.executeUpdate();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally {
			try
			{
				con.close();
			}
			catch (SQLException e)
			{
				System.out.println(e);
			}
		}
	}
}