<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
	<h1>Nuevo Usuario</h1>
	<form:form action="/create" method="post" modelAttribute="usuario">
		<div class="form-group">
			<form:label path="first_name">Nombre</form:label>
			<form:input path="first_name" cssClass="form-control"/>
			<form:errors path="first_name"/>
			
		</div>
		<div class="form-group">
			<form:label path="email">Email</form:label>
			<form:input path="email" type="email" cssClass="form-control"/>
			<form:errors path="email"/>
			
		</div>
		<div class="form-group">
			<form:label path="password">Password</form:label>
			<form:password path="password" class="form-control"/>
			<form:errors path="password"/>
			
		</div>
		<div class="form-group">
			<form:label path="submit">Email</form:label>
			<form:input path="email" type="submit" cssClass="form-control"/>
			<form:errors path="email"/>
			
		</div>
		<input type="submit" name="Registrar">
	</form:form>
	<div>
		<c:out value="${error_registro}"></c:out>	
	</div>
</body>
</html>