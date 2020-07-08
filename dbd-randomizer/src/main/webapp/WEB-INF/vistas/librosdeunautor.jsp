<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${lista}" var="libro">
	<form>
		<tr>
			<td>${libro.nombre}</td>
			<input type="text" name="nombre" value="${libro.nombre}" id="nombre" hidden />
			<td>${libro.autor.nombre}</td>
			<input type="text" name="autor" value="${libro.autor.nombre}" id="autor" hidden />
		</tr>
</c:forEach>
</body>
</html>