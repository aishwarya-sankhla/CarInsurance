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
<body>
	<div><%@include file="header.html" %></div>
	<div class="col-md-8">
<form class="form-horizontal"  method="post" action="rest/service/addcust">
  <div class="form-group">
    <label class="control-label col-md-4" for="custName">Customer Name:</label>
    <div class="col-md-10">
      <input type="text" class="form-control" id="custName" placeholder="Enter Customer Name" name="custName" autocomplete="off"/>
    </div>
  </div>
  
  <div class="form-group">
    <label class="control-label col-md-2" for="phone">Phone:</label>
    <div class="col-md-10"> 
      <input type="text" class="form-control" id="phone" placeholder="Enter Phone Number"  name="phone" required="required">
    </div>
  </div>

<div class="form-group">
    <label class="control-label col-md-2" for="regno">Reg No:</label>
    <div class="col-md-10"> 
      <input type="text" class="form-control" id="regno" placeholder="Enter Reg No"  name="regno" required="required" autocomplete="off">
    </div>
  </div>
  
 <div  class="form-group">
    <label class="control-label col-md-2" for="modelName">Model Name:</label>
    <div class="col-md-10"> 
      <input type="text" class="form-control" id="modelName" placeholder="Enter Model Name"  name="modelName" required="required">
    </div>
  </div>
  <div class="form-group"> 
    <div class="col-md-offset-2 col-md-10">
    <input type="submit" value="Login" id= "sbmt" class="btn btn-primary">
    </div>
  </div>
</form>
</div>
<a href="/MarutiServiceCenter/AddCar.jsp">Add Car to existing Customer</a>
</body>
</html>