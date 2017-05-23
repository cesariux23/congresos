<%@ include file = "../../layout/header.jsp" %>
<section class="container">
    <h1>Detalles del aspirante</h1>
    
    <div class="panel panel-default">
        <div class="panel-heading"><c:out value="${aspirante.claveAspirante}" /></div>
        <div class="panel-body">
          <c:out value="${aspirante.idMunicipio}" />
        </div>
    </div>
</section>
<%@ include file = "../../layout/footer.jsp" %>