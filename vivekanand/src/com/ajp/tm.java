package com.ajp;
import java.sql.*;
//import java.util.*;
import java.io.*;
import java.io.BufferedReader;

public class tm {

	public static void main (String[] args) {
//		Scanner scan = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/ajp","root","root");
			con.setAutoCommit(false);
			PreparedStatement ps = 
					con.prepareStatement("insert into transaction values (?,?)");
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			
			while (true) {
				System.out.println("Enter Id");
				String id = br.readLine();
				System.out.println("Enter type");
				String type = br.readLine();
				
				ps.setString(1,id);
				ps.setString(2, type);
				ps.executeUpdate();
				
				System.out.println("Commit/rollback");
				String ans = br.readLine();
				if (ans.equals("rollback")) {
					con.rollback();
				}
				System.out.println("Want to add more records y/n");
				String ans2 = br.readLine();
				if (ans2.equals("n")) {
					break;
				}
			}
			con.commit();
			System.out.println("record successfully saved");  
			  
			con.close();//before closing connection commit() is called  
			}catch(Exception e){System.out.println(e);}  
			  
			}
}
