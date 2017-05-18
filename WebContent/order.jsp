<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Make your choice!</title>
<link rel='stylesheet' href='resources/bootstrap/bootstrap.css' type='text/css' media='all'>
<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
<script src='resources/bootstrap/bootstrap.js'></script>
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
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span> 
      </button>
      <a class="navbar-brand" href="index.html">THE RENT STATION</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="index.html">HOME</a></li>
        <li><a href="#places">PLACES</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">CATALOG
            <span class="caret"></span>
          </a>
          <ul class="dropdown-menu">
            <li><a href="#">Bikes</a></li>
            <li><a href="#">Boards</a></li>
            <li><a href="#">Rollers</a></li> 
            <li><a href="#">Accessories</a></li>
          </ul>
        </li>
        <li><a href="#"><span class="glyphicon glyphicon-search"></span></a></li>
      </ul>
    </div>
  </div>
</nav>

<br>
<div class="container text-center">
<h2>Make your choice!</h2>
	<form class="form-horizontal" action="MainServlet" method="get">
	<input type="hidden" name="action" value="create_order"/>
	<div class="form-group">
	<label for="userID">User ID:</label>
	<input type="text" name="user_id" id="userID"/>
	</div>
	<div class="form-group">
	<label for="equipID">Equip ID:</label>
	<input type="text" name="equip_id" id="equipID"/>
	</div>
	<div class="form-group">
	<label for="date_start">Rent date:</label>
	<input type="text" name="date_start" id="date_start"/>
	</div>
	<div class="form-group">
	<label  for="date_start">Return date:</label>
	<input type="text" name="date_end" id="date_end"/>
	</div>
	<div class="form-group">
	<input type="submit" value="Order"/>
	</div>
	</form>
	</div>
</body>
</html>