<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
</head>
<body>
	<h1>Send an Omikuji</h1>
	<form action="/form/process" method="post">
		<div>
			<h3>Pick any number from 5 to 25:</h3>
			<input type="number" name="num"/>
			<h3>Enter the name of any city:</h3>
			<input type="text" name="city"/>
			<h3>Enter the name of any real person:</h3>
			<input type="text" name="person"/>
			<h3>Enter professional endeavor or hobby:</h3>
			<input type="text" name="hobby"/>
			<h3>Enter any type of living thing:</h3>
			<input type="text" name="thing"/>
			<h3>Say something nice to someone:</h3>
			<input type="text" name="nice"/>
		</div>
		<h3><i>Send and show a friend</i></h3>
		<button type="submit">Send</button>
		
	</form>
</body>
</html>