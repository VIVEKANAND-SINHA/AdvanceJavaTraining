<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Question no 31</title>
</head>
<body>
<%
	String name =(String)request.getParameter("name");
	int pass = Integer.parseInt(request.getParameter("pass"));
	out.println(name);
	out.println(pass);
	int pass1=12345;
	if (name == "vivekanand" &&  pass1==pass)
	{
		out.println("Successsfully Login!!!");
		out.println("Welcome back "+name);
	}
	else{
		out.println("Incorrect Id or Password!");
	}

%>
<br>
<br>
<a href = "/JPSProgrmaFiles/Question31.html"><button>click to Login</button> </a>
</body>
</html>