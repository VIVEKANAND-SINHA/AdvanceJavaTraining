<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Write a program to include an HTML file in a JSP page using<br>
 RequestDispatcher interface method. <br>
 The included file should display a login form to the user. </h1>
 <%
 RequestDispatcher rd = request.getRequestDispatcher("Login.html");
 rd.forward(request ,response);
 
 %>

</body>
</html>