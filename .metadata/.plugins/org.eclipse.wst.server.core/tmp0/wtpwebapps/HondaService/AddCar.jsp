<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@page import="com.sun.org.glassfish.gmbal.IncludeSubclass"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="script.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Maruti Service</title>
</head>
<body onload="getAllCustomers()">
	

	<div><%@include file="header.html" %></div>
	
	<div class="col-md-8">
<form class="form-horizontal"  method="post" action="rest/service/addcar">
  <div class="form-group">
    <label class="control-label col-md-4" for="custName">Customer Name:</label>
    <div class="col-md-10">
     <select id="customers" name="customers"></select>
    </div>
  </div>
  
  <div class="form-group">
    <label class="control-label col-md-2" for="regno">Reg No:</label>
    <div class="col-md-10"> 
      <input type="text" class="form-control" id="regno" placeholder="Enter Reg no"  name="regno" required="required">
    </div>
  </div>

<div class="form-group">
    <label class="control-label col-md-2" for="modelName">Model Name:</label>
    <div class="col-md-10"> 
      <input type="text" class="form-control" id="modelName" placeholder="Enter Model"  name="modelName" required="required">
    </div>
  </div>
 
  <div class="form-group"> 
    <div class="col-md-offset-2 col-md-10">
    <input type="submit" value="Submit" id= "sbmt" class="btn btn-primary">
    </div>
  </div>
</form>
</div>
</body>
</html>