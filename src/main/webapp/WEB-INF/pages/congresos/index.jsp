<%@ include file = "../../layout/header.jsp" %>
<section class="container">
    <h1>Congresos</h1>
    <a href="<c:url value = "/congresos/registro"/>" class="btn btn-primary">Registrar</a>
    <table class="table table-striped table-bordered">
        <thead>
            <tr>
                <th>ID</th>
                <th>congreso</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${congresos}" var="congreso">
                <tr>
                    <td><c:out value="${congreso.idCongreso}" /></td>
                    <td><c:out value="${congreso.nombre}" /></td>
                    <td><a href = "<c:url value = "/congresos/"/><c:out value="${congreso.idCongreso}"/>" class="btn btn-default">Detalles</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</section>
<%@ include file = "../../layout/footer.jsp" %>