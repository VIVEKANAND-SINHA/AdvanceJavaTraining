package com.ajp;
import java.sql.*;

public class output {
	public static void main(String[] args) {

	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/ajp","root","root");    
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from transaction");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  
		}  

