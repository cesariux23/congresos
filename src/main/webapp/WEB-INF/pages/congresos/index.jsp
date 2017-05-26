<%@ include file = "../../layout/header.jsp" %>
<section class="container">
    <h1 class="text-center">Congresos</h1>
   
    <table class="table table-striped table-bordered">
        <thead>
            <tr>
                <th class="text-center">LISTA</th>
                <th class="text-center">ALTAS</th>
                <th class="text-center">BAJAS</th>
                <th class="text-center">MODIFICAR</th>
            </tr>
        </thead>
        <tbody>
            
                <tr class="text-center">
                    <td><a href="<c:url value = "/congresos/lista"/>" class="btn btn-primary btn-lg"><span class="glyphicon glyphicon-list"></span></a></td>
                    <td><a href="<c:url value = "/congresos/registro"/>" class="btn btn-primary btn-lg"><span class="glyphicon glyphicon-ok"></span></a></td>
                    <td><a href = "<c:url value = "/congresos/bajas"/>" class="btn btn-primary btn-lg"><span class="glyphicon glyphicon-sort-by-attributes"></span></a></td>
                    <td><a href = "<c:url value = "/congresos/modificar"/>" class="btn btn-primary btn-lg"><span class="glyphicon glyphicon-sort"></span></a></td>
                </tr>
           
        </tbody>
    </table>
</section>
<%@ include file = "../../layout/footer.jsp" %>