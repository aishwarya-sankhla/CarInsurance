<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="script.js"></script>
<title>Honda Service Center</title>
</head>
<body onload="getAllCustomers()">
	<div><%@include file="header.html" %></div>
	<div id="Link Container">
		<a href="http://localhost:8080/HondaService/newService.jsp">Add New Service</a><br>
		<a href="http://localhost:8080/HondaService/AddCustomer.jsp">Add New Customer</a><br>
		<a href="http://localhost:8080/HondaService/AddCar.jsp">Add New Car to Existing Customer</a><br>
		<a href="http://localhost:8080/HondaService/updateCustomerContact.jsp">Update Existing Customer Info</a><br>
		<a href="http://localhost:8080/HondaService/ServiceRec.jsp">Retrieve Service records Using Regno</a>
	</div>
	
</body>
</html>