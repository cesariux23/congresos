<%@ include file = "../../layout/header.jsp" %>
<section class="container">
    <h1>Aspirantes</h1>
    <a href="<c:url value = "/aspirantes/registro"/>" class="btn btn-primary">Registrar</a>
    <table class="table table-striped table-bordered">
        <thead>
            <tr>
                <th>ID</th>
                <th>Clave</th>
                <th>Nombre completo</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${aspirantes}" var="aspirante">
                <tr>
                    <td><c:out value="${aspirante.idAspirante}" /></td>
                    <td><c:out value="${aspirante.claveAspirante}" /></td>
                    <td><c:out value="${aspirante.nombre} ${aspirante.apellidoPaterno} ${aspirante.apellidoMaterno}" /></td>
                    <td><a href = "<c:url value = "/aspirantes/"/><c:out value="${aspirante.claveAspirante}"/>" class="btn btn-default">Detalles</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</section>
<%@ include file = "../../layout/footer.jsp" %>