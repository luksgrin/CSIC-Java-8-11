<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nuevo usuario</title>
</head>
<body>
<h3>Crear un nuevo usuario</h3>
<c:choose>
    <c:when test="${createdSuccesfully}">
        Usuario creado correctamente. 
        <br />
        <form action="/csic-training/spring/spring-mvc-solved" method="get">
        	<input type="submit" value="volver">
		</form>
    </c:when>    
    <c:otherwise>
		<form action="/csic-training/spring/spring-mvc-solved" method="post">
			<p>Email</p>
			<input type="text" name="email">
			
			<p>Nombre de usuario</p>
			<input type="text" name="userName">
			
			<p>Contraseña</p>
			<input type="password" name="password">
			
			<input type="submit" value="create">
		</form>
        <br />
    </c:otherwise>
</c:choose>
</body>
</html>	