<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
table, tr, th,td{
border: 1px solid Black;
border-collapse:collapse;
}
</style>
</head>
<body>
	<sql:setDataSource user="root" password="root"
		url="jdbc:mysql://localhost:3306/ctspune"
		driver="com.mysql.jdbc.Driver" />

	<%-- <sql:update>
		
		insert into employee values(505,"simran","Goa",33,"PAT",47833)
		
		</sql:update> --%>
		
		
		<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Address</th>
			<th>Designation</th>
			<th>Age</th>
			<th>Salary</th>
			<th>Phone</th>
		</tr>
		<sql:query var="rs" sql="select * from employee">
		</sql:query>
		<c:forEach var="row" items="${rs.rows}">
			<tr>
				<td><c:out value="${row.id }" /></td>
			<td><c:out value="${row.name }" /></td>
			<td><c:out value="${row.adress }" /></td>
			<td><c:out value="${row.age }" /></td>
			<td><c:out value="${row.Designation }" /></td>
			<td><c:out value="${row.Salary }" /></td>
			</tr>
			</c:forEach>
	</table>
		

	<sql:query var="rs" sql="select * from employee">
	</sql:query>




	
		<c:forEach var="row" items="${rs.rows }">

			
			<hr>
			<Br>  


		</c:forEach>
</body>
</html>