<%@ include file = "../../layout/header.jsp" %>
<section class="container">
    <h1 class="text-center">Reporte de Facturas</h1>
   
    <table class="table table-striped table-bordered">
        <thead>
            <tr>
                    <th>ID</th>
                    <th>NOMBRE O CONTRIBUYENTE</th>
                    <th>RFC</th>
                    <th>DOMICILIO FISCAL</th>
                    <th>COLONIA</th>
                    <th>CP</th>
                    <th>POBLACIÓN</th>
                    <th>LOCALIDAD</th>
                    <th>TELEFONO</th>
                    <th>CORREO</th>
                    <th>NÚMERO FACTURA</th>
                    <th>ESTADO</th>
                    <th>MUNICIPIO</th>
                    <th>FECHA SOLICITUD</th>
                    <th>CLAVE ASPIRANTE</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${facturas}" var="factura">
                <tr>
                    <td><c:out value="${factura.idFactura}" /></td>
                    <td><c:out value="${factura.contribuyente}" /></td>
                    <td><c:out value="${factura.rfc}"/></td>
                    <td><c:out value="${factura.domicilioFiscal}"/></td>
                    <td><c:out value="${factura.colonia}"/></td>
                    <td><c:out value="${factura.cp}"/></td>
                    <td><c:out value="${factura.poblacion}"/></td>
                    <td><c:out value="${factura.localidad}"/></td>
                    <td><c:out value="${factura.telefono}"/></td>
                    <td><c:out value="${factura.correo}"/></td>
                    <td><c:out value="${factura.numeroFactura}"/></td>
                    <td><c:out value="${factura.idEstado}"/></td>
                    <td><c:out value="${factura.idMunicipio}"/></td>
                    <td><c:out value="${factura.fechaSolicitud}"/></td>
                    <td><c:out value="${factura.claveAspirante}"/></td>
                 </tr>
            </c:forEach>
        </tbody>
    </table>
</section>
<%@ include file = "../../layout/footer.jsp" %>
