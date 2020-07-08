<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="autor" action="validar-autor" method="POST">
	
            <form:label path="nombre">Nombre:</form:label>
            <form:input path="nombre" type="text"/>
            <form:label path="apellido">Apellido:</form:label>
            <form:input path="apellido" type="text"/>
            
            <input type="submit" value="Buscar">
            
    </form:form>
    <c:if test="${not empty error}">
    	<h4><span>${error}</span></h4>
    </c:if>
</body>
</html>