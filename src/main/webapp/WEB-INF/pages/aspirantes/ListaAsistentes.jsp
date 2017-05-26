<%@ include file = "../../layout/header.jsp" %>

<section class="container">
    <h1 class="text-center">REPORTE DE ASPIRANTES</h1>
    
    <table class="table table-striped table-bordered">
        <thead>
            <tr>
                    <th>ID_</th>
                    <th>CLAVE ASPIRANTE</th>
                    <th>NOMBRE</th>
                    <th>PATERNO</th>
                    <th>MATERNO</th>
                    <th>CALLE</th>
                    <th>NÚMERO</th>
                    <th>COLONIA</th>
                    <th>CP</th>
                     <th>TELEFONO</th>
                    <th>CELULAR</th>
                    <th>CORREO</th>
                    <th>PROCEDENCIA</th>
                    <th>OTROS</th>
                    <th>CONSECUTIVO</th>
                    <th>ACTIVO</th>
                    <th>FACTURA</th>
                     <th>PAGAR</th>
                    <th>FECHA REGISTRO</th>
                    <th>TEMA</th>
                    <th>PROFESION</th>
                    <th>CONGRESO</th>
                    <th>MUNICIPIO</th>
                    <th>CATEGORIA</th>
                    <th>FOLIO</th>
                     <th>ASISTIO</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${aspirantes}" var="aspirante">
                <tr>
                    <td><c:out value="${aspirante.idAspirante}" /></td>
                    <td><c:out value="${aspirante.claveAspirante}" /></td>
                    <td><c:out value="${aspirante.nombre} " /></td>
                    <td><c:out value="${aspirante.apellidoPaterno}" /></td>
                    <td><c:out value="${aspirante.apellidoMaterno}" /></td>
                     <td><c:out value="${aspirante.calle}" /></td>
                    <td><c:out value="${aspirante.numero}" /></td>
                     <td><c:out value="${aspirante.colonia}"/></td>
                     <td><c:out value="${aspirante.cp}"/></td>
                         <td><c:out value="${aspirante.telefono}"/></td>
                        <td><c:out value="${aspirante.celular}"/></td>
                         <td><c:out value="${aspirante.correo}"/></td>
                         <td><c:out value="${aspirante.procedencia}"/></td>
                        <td><c:out value="${aspirante.otros}"/></td>
                         <td><c:out value="${aspirante.consecutivo}"/></td>
                         <td><c:out value="${aspirante.activo}"/></td>
                        <td><c:out value="${aspirante.factura}"/></td>
                         <td><c:out value="${aspirante.pagar}"/></td>
                         <td><c:out value="${aspirante.fechaRegistro}"/></td>
                        <td><c:out value="${aspirante.idTema}"/></td>
                         <td><c:out value="${aspirante.idProfesion}"/></td>
                         <td><c:out value="${aspirante.idCongreso}"/></td>
                        <td><c:out value="${aspirante.idMunicipio}"/></td>
                         <td><c:out value="${aspirante.idCategoria}"/></td>
                         <td><c:out value="${aspirante.folio}"/></td>
                        <td><c:out value="${aspirante.asistio}"/></td>
                         
                </tr>
            </c:forEach>
        </tbody>
    </table>
</section>
<%@ include file = "../../layout/footer.jsp" %>
