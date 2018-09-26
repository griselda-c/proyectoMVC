<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<script type="text/javascript"src="<c:url value="/resources/js/modernizr.js"/>"></script>
<script  src="<c:url value="/resources/js/scripts.js"/>"></script>
<body>

	<form:form method="POST" action="agregarProducto.html" modelAttribute="producto">
		<form:label path="nombreProducto">Nombre del Producto</form:label>
		<form:input path="nombreProducto"/> <!-- el path corresponde a las variables del Producto -->
		<br>
		<form:label path="stockMinimo">Stock Minimo</form:label>
		<form:input path="stockMinimo"/>
	    <br>
	    <form:label path="precio">Precio</form:label>
	    <form:input path="precio.precio"/><br>
	    <form:label path="precio.fechaInicio" >Fecha de inicio</form:label>
	    <form:input type="date" path="precio.fechaInicio" name="precio.fechaInicio"></form:input>
	    
	    <form:label path="precio.fechaHasta" >Fecha hasta</form:label>
	    <form:input type="date"  path="precio.fechaHasta" name="precio.fechaHasta"></form:input>
	     
		
		<br><br>
		<input type="submit" value="Guardar">
	</form:form>

</body>
</html>
