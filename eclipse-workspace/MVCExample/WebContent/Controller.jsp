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
		session.setMaxInactiveInterval(15);
	%>

	<!-- com.cts.bean.LoginBean ref=new LoginBean() -->
	<jsp:useBean id="ref" class="com.cts.bean.LoginBean"
		scope="application">
		<!-- ref.setUserName(request.getParameter("userName")) -->
	</jsp:useBean>
	<%-- <jsp:setProperty property="userName" name="ref" />
	<jsp:setProperty property="password" name="ref" />
	<jsp:getProperty property="userName" name="ref" />
	<jsp:getProperty property="password" name="ref" /> --%>

	<jsp:setProperty property="*" name="ref" />
	<jsp:forward page="view.jsp" />
	<jsp:forward page="view.jsp" />

</body>
</html>