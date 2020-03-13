<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- jsp declaratio tag -->
<%!
int requestCount=0;
%>
<!-- script tag -->
<%
requestCount++;
%>

<h1>No.of users visited so far....<%=requestCount %></h1>
</body>
</html>