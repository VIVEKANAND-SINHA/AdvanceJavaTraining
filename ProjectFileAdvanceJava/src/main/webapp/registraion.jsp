<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>This is person table</h2>

<%
try {
    String dbDriver = "com.mysql.cj.jdbc.Driver";
    String dbURL = "jdbc:mysql:// localhost:3306/ajp";
    // Database name to access
    String dbUsername = "root";
    String dbPassword = "root";

    Class.forName(dbDriver);
    Connection con = DriverManager.getConnection(dbURL,dbUsername, dbPassword);
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from person");
	while(rs.next())  
	out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+"<br>");  
	out.println("<br>");
	con.close();  
	}catch(Exception e){ System.out.println(e);}

%>
</body>
</html>