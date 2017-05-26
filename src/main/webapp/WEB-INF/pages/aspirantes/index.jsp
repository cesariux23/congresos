<%@ include file = "../../layout/header.jsp" %>
<section class="container">
    <h1 class="text-center">DETALLES DE ASPIRANTES</h1>
   
    <table class="table table-striped table-bordered">
        <thead>
            <tr>
                <th class="text-center">Lista General</th>
                <th class="text-center">Agregar</th>
                <th class="text-center">Actualizar</th>
                <th class="text-center">Borrar</th>
                <th class="text-center">Mostrar Asistentes</th>
                <th class="text-center">Pagados</th>
                <th class="text-center">No pagados</th>
          
            </tr>
        </thead>
        <tbody>
            <tr class="text-center" >
                <td><a href="<c:url value = "/aspirantes/lista"/>" class="btn btn-primary btn-lg"><span class="glyphicon glyphicon-list-alt"></span></a></td>
                <td><a href="<c:url value = "/aspirantes/registro"/>" class="btn btn-primary btn-lg" ><span class="glyphicon glyphicon-saved"></span></a></td>
                <td><a href="<c:url value = "/aspirantes/actualizar"/>" class="btn btn-primary btn-lg" ><span class="glyphicon glyphicon-refresh"></span></a></td>
                <td><a href="<c:url value = "/aspirantes/borrar"/>" class="btn btn-primary btn-lg" ><span class="glyphicon glyphicon-remove-circle"></span></a></td>
                <td><a href="<c:url value = "/aspirantes/mostrar"/>" class="btn btn-primary btn-lg" ><span class="glyphicon glyphicon-search"></span></a></td>
                <td><a href="<c:url value = "/aspirantes/pagados"/>" class="btn btn-primary btn-lg" ><span class="glyphicon glyphicon-usd"></span></a></td>
                <td><a href="<c:url value = "/aspirantes/noPagados"/>" class="btn btn-primary btn-lg" ><span class="glyphicon glyphicon-info-sign"></span></a></td>
            </tr>
        </tbody>
    </table>
            
</section>
<%@ include file = "../../layout/footer.jsp" %>