<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false"%>
<html>
<head>
<title>Users</title>
</head>
<body>
	<h1>Csic-training</h1>

	<p>Gestionar usuarios</p>
	<p>Usuarios:</p>
	<table>
    <tr>
    	<th>nombre de usuario</th> 
    	<th>email</th>
    	<th>acción</th>
	</tr>
	<c:if test="${not empty users}">
    	<c:forEach var="user" items="${users}">
    		<tr>
    			<td>${user.userName}</td>
    			<td>${user.email}</td>
    			<td>
    				<form action="/csic-training/spring/spring-mvc-solved/remove-user" method="post">
    					<input type="hidden" name="username" value="${user.userName}">
						<input type="submit" value="eliminar">
					</form>
    			</td>
    		</tr>
		</c:forEach>
	</c:if>
	</table>
	<form action="/csic-training/spring/spring-mvc-solved/new-user" method="get">
		<input type="submit" value="crear">
	</form>
	
</body>
</html>