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
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet">

    <title>registroDePacientes</title>
</head>
<body>
<div class="container border border-primary">

    <h3>Datos generales.</h3>
    <br>
    <br>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">id</th>
            <th scope="col">Nombre</th>
            <th scope="col">Rut</th>
            <th scope="col">Hora</th>
            <th scope="col">Área médica</th>
            <th scope="col">Aciciones</th>

        </tr>
        </thead>
        <tbody>
            <c:forEach var="citaMedica" items="${citasMedicasCapturadas}" >
            <tr>
                <th>id</th>
                <th scope="row">${citaMedica.id}</th>
                <td>${citaMedica.paciente.nombre}</td>
                <td>${citaMedica.paciente.rut}</td>
                <td>${citaMedica.hora}</td>
                <td>${citaMedica.areaMedica}</td>
                <td><a href="/mostrar/eliminarCita/${citaMedica.id}" class="btn btn-danger" role="button">Eliminar</a>
                    <a href="/citaMedica/editarCitaMedica/${citaMedica.id}" class="btn btn-danger" role="button">Editar</a>
                </td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
    <br>
    <br>
    <div class="d-flex justify-content-center">
        <a class="btn btn-secondary" href="/citaMedica">Regresar</a>
    </div>
    <br>
    <br>
</div>
</body>
</html>
