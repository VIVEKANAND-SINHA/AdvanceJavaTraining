<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Question No. 25</title>
</head>
<body>
<h2>25.	Write a JSP program count no. of visitors on website</h2>
<br>

<h3>Welcome to My website!!!</h3>
<%! int count = 1; %>

<%
out.println("<h2>Number of Visits : "+count);
count ++;


%>

</body>
</html>