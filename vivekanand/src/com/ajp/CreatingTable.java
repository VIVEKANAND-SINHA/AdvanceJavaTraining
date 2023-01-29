package com.ajp;
import java.sql.*;  
class CreatingTable{  
public static void main(String args[]){  
try {
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/ajp","root","root");  
Statement stmt=con.createStatement();  

{		      
    String sql = "CREATE TABLE transaction " +
             "(id INTEGER not NULL, " +
             " type VARCHAR(255), " +
             " PRIMARY KEY ( id ))"; 

   stmt.executeUpdate(sql);
   System.out.println("Created table in given database...");   	  
}
} catch (SQLException e) {
   e.printStackTrace();
} 
}
}
