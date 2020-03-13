<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
response.setIntHeader("Refresh",20);
%>
<h1>from Third.jsp page</h1>
<jsp:useBean id="ref2" class="com.cts.bean.LoginBean" scope="application"/>
	<jsp:getProperty property="userName" name="ref2" />
	<jsp:getProperty property="password" name="ref2" />
</body>
</html>