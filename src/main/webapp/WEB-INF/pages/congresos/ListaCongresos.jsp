
<%@ include file = "../../layout/header.jsp" %>
<section class="container">
    <h1 class="text-center">Congresos</h1>
    
    <table class="table table-striped table-bordered">
        <thead>
            <tr>
                <th>ID</th>
                <th>congreso</th>
                <th>Descripcion</th>
                 <th>Clave</th>
                <th>Número</th>
                <th>Estatus</th>
                <th>Fecha</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${congresos}" var="congreso">
                <tr>
                    <td><c:out value="${congreso.idCongreso}" /></td>
                    <td><c:out value="${congreso.nombre}" /></td>
                    <td><c:out value="${congreso.descripcion}" /></td>
                    <td><c:out value="${congreso.clave}" /></td>
                    <td><c:out value="${congreso.numero}" /></td>
                    <td><c:out value="${congreso.estatus}" /></td>
                    <td><c:out value="${congreso.fecha}" /></td>
                   
                    
                </tr>
            </c:forEach>
        </tbody>
    </table>
</section>
<%@ include file = "../../layout/footer.jsp" %>
