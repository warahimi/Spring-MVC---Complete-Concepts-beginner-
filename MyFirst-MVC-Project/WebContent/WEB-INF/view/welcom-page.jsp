<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcom Page</title>
</head>
<body>
	<h1 align="center">${myPagesHeader }</h1>
	<!-- instead of hard coding things we can get the values from Contoller that comew with Model object -->
	<hr>

	<!-- Accessing data sent by controller with Model object -->
	My name is: ${myNameValue}
	<!--  myNameValue hold the data of myName varaible from controller class-->
	<hr>
	<form action="processOrder"> <!-- when we press the button it is ganan hit/redirect a link processOrder, we need to handle this url in our controller and return them a page -->
	<div align="center">
		<label for="itemName">Item Name: </label> <input type="text"
			name="foodType" placeholder="Food Type ??" id="itemName"> <input
			type="submit" value="Order Now">
	</div>
	</form>



</body>
</html>