<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage = "Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="Header.jsp" />
<%
float num1 = Float.parseFloat(request.getParameter("num1"));
float num2 = Float.parseFloat(request.getParameter("num2"));
out.println("Sum is :"+(num1+num2));
%>
<% int i = 9/0;%>

</body>
</html>