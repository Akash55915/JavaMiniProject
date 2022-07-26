<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>USer Home Page</title>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body style="background-image: url(static/original1.jpg); background-repeat: no-repeat; background-size: cover; color: white;  width: 100%;
  height: 100%;">
<!-- Header Nav Bar -->
<header>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Fly</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item ">
        <a class="nav-link" href="UserHomePage.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
     
      <li class="nav-item">
        <a class="nav-link" href="SearchFlight.jsp">Flights</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="logout">Logout</a>
      </li>
      </li>
      <li class="nav-item active">
        <a class="nav-link" >Welcome,<%= session.getAttribute("user_name") %></a>
      </li>
    </ul>
  </div>
</nav>
</header>

<!-- Footer -->
<footer class="page-footer font-small blue navbar-dark bg-dark" style=" position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;">
  <div class="footer-copyright text-center py-3 ">© 2022 Copyright
    
  </div>
</footer>
</body>
</html>