<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 15-07-2022
  Time: 20:10
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
    <title>editar</title>
</head>
<body>
    <div id="principal" class= "container border border-primary">
        <%--@elvariable id="citaMedica" type="java"--%>
        <form:form action="/citaMedica/actualizarCitaMedica/${citaMedica.id}" method="post" modelAttribute="citaMedica">
            <h1>Ingrese datos de su cita medica.</h1>
            <br>
            <hr>
            <h5>Ingrese hora en formato hh:mm.</h5>
            <br>
            <form:label path="hora" >Hora: </form:label>
            <br>
            <form:input class="form-control" path="hora"/>
            <br>
            <form:label path="areaMedica">Especialidad: </form:label>
            <br>
            <form:input class="form-control" path="areaMedica"/>
            <br>
            <br>
            <div class="d-flex justify-content-evenly">
                <button type="submit" class="btn btn-primary">Editar</button>
            </div>
        </form:form>
    </div>


</body>
</html>
