<%@ include file = "../../layout/header.jsp" %>
<section class="container">
    <h1>Facturas</h1>
    <a href="<c:url value = "/congresos/registro"/>" class="btn btn-primary">Registrar</a>
    <table class="table table-striped table-bordered">
        <thead>
            <tr>
                <th>ID</th>
                <th>Factura</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${facturas}" var="factura">
                <tr>
                    <td><c:out value="${factura.idFactura}" /></td>
                    <td><c:out value="${factura.contribuyente}" /></td>
                    <td><a href = "<c:url value = "/facturas/"/><c:out value="${factura.idFactura}"/>" class="btn btn-default">Detalles</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</section>
<%@ include file = "../../layout/footer.jsp" %>