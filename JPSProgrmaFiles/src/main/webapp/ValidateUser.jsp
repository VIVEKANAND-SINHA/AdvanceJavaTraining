<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users</title>
</head>
<body>
<%
 	String name = request.getParameter("username");
	String pass = request.getParameter("pass");
	boolean status = false;
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql:// localhost:3306/ajp","root","root");
	//Statement stmt = con.createStatement();
	PreparedStatement preparedStatement = con.prepareStatement("select * from users where username = ? and password = ? ");
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,pass);
            out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();
            if (status)
            {
            out.println("<h1>Login Successful !!");
            out.println("<h1>welcome "+name);
            }
            else{
            	out.print("<h1>Kindly Register YourSelf !! ");
            	out.println("<h1><a href = '/JPSProgrmaFiles/QuestionNO34.html'><button>Click here to Register!</button></a>");
            }
%>
</body>
</html>