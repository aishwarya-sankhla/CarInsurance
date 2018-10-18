<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@page import="com.sun.org.glassfish.gmbal.IncludeSubclass"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script type="text/javascript" src="main.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Maruti Service</title>
</head>
<body onload="init()">
	<div><%@include file="header.html" %></div>
	<div class="col-md-8">
<form class="form-horizontal"  method="post" action="rest/service/login">
  <div class="form-group">
    <label class="control-label col-md-4" for="name">Employee ID:</label>
    <div class="col-md-10">
      <input type="text" class="form-control" id="eid" placeholder="Enter Employee ID" name="eid" onkeyup="login()"/>
    </div>
  </div>
  
  <div class="form-group">
    <label class="control-label col-md-2" for="password">Password:</label>
    <div class="col-md-10"> 
      <input type="password" class="form-control" id="password" placeholder="Enter password"  name="password" required="required" onkeyup="login()">
    </div>
  </div>

  <div class="form-group"> 
    <div class="col-md-offset-2 col-md-10">
    <input type="submit" value="Login" id= "sbmt" class="btn btn-primary">
    </div>
  </div>
</form>
</div>

</body>
</html>