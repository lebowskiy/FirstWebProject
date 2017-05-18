<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel='stylesheet' href='resources/bootstrap/bootstrap.css' type='text/css' media='all'>
<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
<script src='resources/bootstrap/bootstrap.js'></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
@font-face {
  font-family: 'Glyphicons Halflings';

  src: url('resources/bootstrap/glyphicons-halflings-regular.eot');
  src: url('resources/bootstrap/glyphicons-halflings-regular.eot?#iefix') format('embedded-opentype'), url('resources/bootstrap/glyphicons-halflings-regular.woff2') format('woff2'), url('resources/bootstrap/glyphicons-halflings-regular.woff') format('woff'), url('resources/bootstrap/glyphicons-halflings-regular.ttf') format('truetype'), url('resources/bootstrap/glyphicons-halflings-regular.svg#glyphicons_halflingsregular') format('svg');
}
.container {
      padding: 80px 120px;
  }
  .person {
      border: 10px solid transparent;
      margin-bottom: 25px;
      width: 80%;
      height: 80%;
      opacity: 0.7;
  }
  .person:hover {
      border-color: #f1f1f1;
  }
</style>
<title>User page</title>
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

	<div class="container text-center">
  <h3>THE RENT STATION</h3>
  <p><em>We love sport!</em></p>
  <br>
  <div class="row">
    <div class="col-sm-4">
      <img src="resources/different/bike3.jpg" class="img-circle person" alt="Random Name" width="200" height="200">
      <br>
      <p><strong>Bikes</strong></p>
    </div>
    <div class="col-sm-4">
    <img src="resources/different/longboard3.jpg" class="img-circle person" alt="Random Name" width="200" height="200">
      <br>
      <p><strong>Boards</strong></p>
    </div>
    <div class="col-sm-4">
      <img src="resources/different/rollers3.jpg" class="img-circle person" alt="Random Name" width="200" height="200">
      <br>
      <p><strong>Roller blades</strong></p>
    </div>
  </div>
    <div class="row">
    <div class="col-sm-4">
      <img src="resources/different/glasses.jpg" class="img-circle person" alt="Random Name" width="200" height="200">
      <br>
      <p><strong>Glasses</strong></p>
    </div>
    <div class="col-sm-4">
    <img src="resources/different/gloves.jpg" class="img-circle person" alt="Random Name" width="200" height="200">
      <br>
      <p><strong>Gloves</strong></p>
    </div>
    <div class="col-sm-4">
      <img src="resources/different/helmet4.png" class="img-circle person" alt="Random Name" width="200" height="200">
      <br>
      <p><strong>Helmets</strong></p>
    </div>
  </div>
  <div class="row">
  	<form action="MainServlet" method="get">
	<input type="hidden" name="action" value="make_order"/>
	<div class="col-sm-10 col-sm-offset-1">
	<button type="submit" class="btn btn-default btn-lg btn-block" name="action" value="make_order">
          <span class="glyphicon glyphicon-shopping-cart"></span> Make an order!	
        </button>
	</div>
	</form>
	</div>
</div>

</body>
</html>