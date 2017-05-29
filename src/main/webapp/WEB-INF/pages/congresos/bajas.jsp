<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file = "../../layout/header.jsp" %>
<section class="container">
    <h1>Bajas de Congreso</h1>
   <form:form method="post" commandName="congreso">
            
        <div class="panel panel-info">
            <div class="panel-heading"></div>
            <div class="panel-body">
                <div class="row">    
                    <div class="col-lg-4">
                        <div class="form-group">
                            <form:label path="idCongreso">ID</form:label> 
                            <form:input path="idCongreso" name = "idCongreso"cssClass="form-control" />
                        </div> 
                    </div>
                </div>
                
                <div class="row">
                    <div class="col-lg-6">
                        <div class="form-group">
                             <form:label  path="nombre">Nombre</form:label> 
                            <form:input path="nombre" name = "nombre" cssClass="form-control" placeholder="Nombre Completo" />
                        </div>
                    </div>
                </div>
            </div>
        </div>                    
            
    </form:form>
</section>
<%@ include file = "../../layout/footer.jsp" %>
