<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Values</title>
</head>
<body>
<% 
try {
    String dbDriver = "com.mysql.cj.jdbc.Driver";
    String dbURL = "jdbc:mysql:// localhost:3306/ajp";
    String dbUsername = "root";
    String dbPassword = "root";
    Class.forName(dbDriver);
    Connection con = DriverManager.getConnection(dbURL,dbUsername, dbPassword);
	Statement stmt=con.createStatement();
	
	int id = Integer.parseInt(request.getParameter("id"));
	String name = request.getParameter("name");
	String pass = request.getParameter("pass");
	String email = request.getParameter("email");
	String phone = request.getParameter("phone");
	//out.print(name+pass+email+phone);
	//String sql = "INSERT INTO student VALUES (+id+,+name+,'+cse+')";
	//formating is important
    stmt.executeUpdate("insert into person values('"+id+"','"+name+"','"+pass+"','"+email+"','"+phone+"')");
    out.println("successfully inserted!");
    con.close();  
	}catch(Exception e){ out.print(e);}
	%>
	<br>
	<br>
	<a href = "/ProjectFileAdvanceJava/registraion.jsp"><button>Click to View Table</button></a>
</body>
</html>