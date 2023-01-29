package com.ajp;
import java.sql.*;
import java.util.*;
public class updatingtable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        try {
 
            // loading driver class
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	 
            // Step 3: Create connection object
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ajp",
                "root", "root");
 
            // create the table
            String sql1
                = "CREATE TABLE Depart(DEPTID VARCHAR(10) PRIMARY KEY,DEPTNAME VARCHAR(50))";
            PreparedStatement ps
                = con.prepareStatement(sql1);
            ps.execute(sql1);
 
            // inserting records
            String sql
                = "Insert into Depart values(?,?)";
            PreparedStatement ps1
                = con.prepareStatement(sql);
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter Department ID");
                String id = scan.nextLine();
                System.out.println("Enter Department  Name");
                String name = scan.nextLine();
                ps1.setString(1, id);
                ps1.setString(2, name);
                //ps1.setString(3, dept);
                // adding to batch
                ps1.addBatch();
            }
            // executing the batch
            ps1.executeBatch();
           
            // viewing the table
            ResultSet rs
                = ps.executeQuery("Select * from DEpart");
            System.out.println(
                "DEPTID\tName\t");
            System.out.println(
                "-------------------------------------------------------");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t\t"
                                   + rs.getString(2)
                                   + "\t\t"
                                   + rs.getString(3));
            }
           // con.commit();
            con.close();
            scan.close();
        }
 
        catch (Exception e) {
            System.out.println(e);
        }
	}

}