<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/proyecto-limpio-spring-master1/registrarLibro" method = "GET">
Nombre de Autor = <input type="text" name="nombreAu"> <br/>
Apellido de Autor = <input type="text" name="apellido"> <br/>
Nombre de Editorial = <input type= "text" name="nombreEd"> <br/>
Nombre de Libro = <input type= "text" name="nombreLi"> <br/>
<input type = "submit" value ="Registrar Libro">
</form>
</body>
</html>