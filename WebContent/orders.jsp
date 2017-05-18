<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<!DOCTYPE html>
<html>
<head>
<link rel='stylesheet' href='resources/bootstrap/bootstrap.css' type='text/css' media='all'>
<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
<script src='resources/bootstrap/bootstrap.js'></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Orders</title>
<style>
.container {
      padding: 80px 120px;
  }
@font-face {
  font-family: 'Glyphicons Halflings';

  src: url('resources/bootstrap/glyphicons-halflings-regular.eot');
  src: url('resources/bootstrap/glyphicons-halflings-regular.eot?#iefix') format('embedded-opentype'), url('resources/bootstrap/glyphicons-halflings-regular.woff2') format('woff2'), url('resources/bootstrap/glyphicons-halflings-regular.woff') format('woff'), url('resources/bootstrap/glyphicons-halflings-regular.ttf') format('truetype'), url('resources/bootstrap/glyphicons-halflings-regular.svg#glyphicons_halflingsregular') format('svg');
}
</style>
</head>
<body>

<table class="table table-hover table-condensed">
<thead>
<tr>
			<th>Order ID</th>
            <th>User ID</th>
            <th>Equip ID</th>
            <th>Rent date</th>
            <th>Return date</th>
         </tr>
         </thead>
         <tbody>
         
         <c:forEach items = "${list_report}" var="i">
         
          <tr>
          
   <td><c:out value = "${i.orderID}"/></td>
   <td><c:out value = "${i.userID}"/></td>
   <td><c:out value = "${i.equipID}"/></td>
   <td><c:out value = "${i.dateStart}"/></td>
   <td><c:out value = "${i.dateEnd}"/></td>
  		</tr>
        </c:forEach>
           
         
		</tbody>
</table>
 
</body>
</html>