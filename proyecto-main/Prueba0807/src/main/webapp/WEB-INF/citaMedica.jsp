<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 08-07-2022
  Time: 11:14
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

    <title>citaMédica</title>
</head>
<body>
    <div id="principal" class= "container border border-primary">
        <%--@elvariable id="citaMedica" type="java"--%>
         <form:form action="/citaMedica/guardarCitaMedica" method="post" modelAttribute="citaMedica">
             <h1>Ingrese datos de su cita medica.</h1>
             <br>
             <hr>
             <h5>Ingrese hora en formato hh:mm.</h5>
             <br>
             <form:select class="form-select" path="paciente">
                 <form:option value="0">Selecione paciente.</form:option>
                 <c:forEach var="paciente" items="${pacientesCapturados}" >{
                     <form:option value="${paciente.id}">
                         ${paciente.nombre}; ${paciente.rut}
                     </form:option>
                 </c:forEach >
             </form:select>
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
                 <a class="btn btn-secondary" href="/paciente">Regresar</a>
                 <button type="submit" class="btn btn-primary">Registrar</button>
             </div>
         </form:form>
    </div>
</body>
</html>
