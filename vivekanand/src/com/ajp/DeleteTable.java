package com.ajp;
import java.sql.*;
public class DeleteTable {

	public static void main(String[] args) {
		try {
			 
            // loading driver class
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	 
            // Step 3: Create connection object
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ajp",
                "root", "root");
            Statement stmt = con.createStatement();
            int res = stmt.executeUpdate("delete from transaction where id = 4");
            if (res == 1) {
            	System.out.println("Deleted Successfully!");
            }
            else {
            	System.out.println("Deletion Failed");
            }
            con.close();
            }catch(Exception e){ System.out.println(e);}
            	
            }
		
	}