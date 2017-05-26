<%@ include file = "../../layout/header.jsp" %>
<section class="container">
    <h1 class="text-center">Detalles Facturas</h1>
    
    <table class="table table-striped table-bordered">
        <thead>
            <tr>
                <th class="text-center">Lista</th>
                <th class="text-center">Registrar</th>
                <th class="text-center">Borrar</th>
            </tr>
        </thead>
        <tbody>
            
                <tr class="text-center">
                    <td><a href="<c:url value = "/facturas/lista"/>" class="btn btn-primary btn-lg"><span class="glyphicon glyphicon glyphicon-th-list"></span></a></td>
                    <td><a href="<c:url value = "/facturas/registro"/>" class="btn btn-primary btn-lg"><span class="glyphicon glyphicon-ok-sign"></span></a></td>
                    <td><a href="<c:url value = "/facturas/borrar"/>" class="btn btn-primary btn-lg"><span class="glyphicon glyphicon-remove-sign"></span></a></td>
                    
                </tr>
           
        </tbody>
    </table>
</section>
<%@ include file = "../../layout/footer.jsp" %>