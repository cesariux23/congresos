<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file = "../../layout/header.jsp" %>
<section class="container">
    <h1 class="text-center" >Alta de congreso</h1>
    
    <form:form method="post" commandName="congreso">
            
        <div class="panel panel-info">
            <div class="panel-heading"></div>
            <div class="panel-body">
                <div class="row">    
                    <div class="col-lg-4">
                        <div class="form-group">
                            <form:label path="clave">Clave</form:label> 
                            <form:input path="clave" name = "clave"cssClass="form-control" />
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
                   
                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <form:label path="descripcion">Descripcion</form:label> 
                            <form:input path="descripcion" name = "descrpcion"cssClass="form-control" />
                        </div> 
                    </div>
                </div>
            </div>
        </div>    
                
        <hr />
                <input type="submit" value="Enviar" class="btn btn-primary btn-lg btn-block" />        
           
    </form:form>
</section>
<%@ include file = "../../layout/footer.jsp" %>