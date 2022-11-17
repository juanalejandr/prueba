<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 08-07-2022
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <style><%@include file="/WEB-INF/estilo/estilo.css"%></style>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet">

    <title>paciente</title>
</head>
<body>
<div id="principal" class= "container border border-primary">
    <%--@elvariable id="paciente" type="java"--%>
    <form:form action="/paciente/guardarPaciente" method="post" modelAttribute="paciente">
        <h1>Ingrese datos de paciente.</h1>
        <br>
        <hr>
        <h5>Ingrese su Rut sin puntos y con guión.</h5>
        <br>
        <h5>Ingrese su fecha de nacimiento en formato dd-mm-aaaa..</h5>
        <br>
        <form:label path="nombre" >Nombre: </form:label>
        <br>
        <form:input class="form-control" path="nombre"/>
        <br>
        <form:label path="rut">Rut: </form:label>
        <br>
        <form:input class="form-control" path="rut"/>
        <br>
        <form:label path="fechaNacimiento">Fecha de nacimiento: </form:label>
        <br>
        <form:input type="date" class="form-control" path="fechaNacimiento"/>
        <br>
        <br>
        <div class="d-flex justify-content-center">
            <button type="submit" class="btn btn-primary">Registrar</button>
        </div>
    </form:form>
</div>

</body>
</html>
