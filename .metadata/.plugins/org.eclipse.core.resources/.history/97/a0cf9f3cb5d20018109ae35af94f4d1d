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
	<form class="form-horizontal" action="rest/service/reg" method="post">
	
	
	
  <h4>Employee Register</h4>
  <div class="form-group">
    <label class="control-label col-md-2" for="name" >Name:</label>
    <div class="col-md-10">
      <input type="text" class="form-control" id="name" placeholder="Enter name" name="name" onkeyup="validateReg()" required="required">
    </div>
  </div>
  
  
   <div class="form-group">
    <label class="control-label col-md-4" for="name">Employee ID:</label>
    <div class="col-md-10">
      <input type="text" class="form-control" id="eid" placeholder="Enter Employee ID" name="eid" onkeyup="validateReg()" onkeydown="validateReg()" required="required">
    </div>
  </div>
  
  <div class="form-group">
    <label class="control-label col-md-2" for="password">Password:</label>
    <div class="col-md-10"> 
      <input type="password" class="form-control" id="password" placeholder="Enter password"  name="password" required="required" onkeyup="validateReg()">
    </div>
  </div>

  <div class="form-group"> 
    <div class="col-md-offset-2 col-md-10">
    <input type="submit" value="Submit" id= "sbmt" class="btn btn-primary">
    </div>
  </div>
</form>
</div>
<a href="/MarutiServiceCenter/login.jsp">Click here to Login</a><br>

<% out.print( session.getAttribute("message")); %>
</body>
</html>