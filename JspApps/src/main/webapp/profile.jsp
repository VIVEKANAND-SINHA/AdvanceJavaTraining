<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Page</title>
</head>
<body>
<h1>sample data</h1>
<h2>this is my database</h2>
<%
// Initialize all the information regarding
    // Database Connection
    String dbDriver = "com.mysql.cj.jdbc.Driver";
    String dbURL = "jdbc:mysql:// localhost:3306/ajp";
    // Database name to access
    String dbUsername = "root";
    String dbPassword = "root";

    Class.forName(dbDriver);
    Connection con = DriverManager.getConnection(dbURL,dbUsername, dbPassword);
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from emp");
%>

</body>
</html>