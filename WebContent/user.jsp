<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User page</title>
</head>
<body style="background-image:url('sport-fon.png');">
	<h2> Welcome, user! </h2>
	<br />
	<table border="1" align="left" bgcolor="white">
		<tr>
			<th>Equipment type</th>
			<th>Equipment season</th>
			<th>Title</th>
			<th>Choose this equip</th>
		</tr>
		<c:forEach items="${list}" var="i">

			<tr>
			<c:forEach items="${i}" var="j">
			
				<td><c:out value="${j}" /></td>
				
				</c:forEach>
				<td> <form action="MainServlet" method="POST">
					<input type="hidden" value="login" name="action" /> 
					<input type="submit" value="I want this one!" />
					</form> </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>