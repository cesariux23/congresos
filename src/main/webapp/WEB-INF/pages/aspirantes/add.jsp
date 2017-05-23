

<%@page import="modelos.conexion"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta  charset="UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
    </head>
    <body>
        <h2 class="text-center">Registro de Aspirante</h2>
        <div class="container">
            <form:form method="post" commandName="aspirante">
            
            <div class="panel panel-info">
                <div class="panel-heading"><strong>Congreso</strong></div>
            <div class="panel-body">
                 
                 <div class="col-lg-8">
                 <div class="form-group">
                    <form:label path="id_congreso">Nombre de Congreso*</form:label> 
                   <form:select path="id_congreso" name="id_congreso"cssClass="form-control" tabindex="1">
                        <form:option value="0">Elegir.....</form:option> 
                        <c:forEach items="${dato2}" var="datos2">
                        <form:option value="${datos2.id_congreso}">${datos2.nombre}</form:option>
                        </c:forEach> 
                     </form:select>
                    </div>
                    </div>
                
            </div>
            </div>
           
            <div class="panel panel-info">
                <div class="panel-heading"><strong>Datos Personales</strong></div>
            <div class="panel-body">
              
               <div class="col-lg-4">
                <div class="form-group">   
                    <form:label  path="nombre">Nombre*</form:label> 
                    <form:input path="nombre" name = "nombre" cssClass="form-control" placeholder="Nombre Completo" />
                </div>
                </div> 
                <div class="col-lg-4">
                <div class="form-group">
                    <form:label path="apellido_paterno">Apellido Paterno*</form:label> 
                    <form:input path="apellido_paterno" name = "apellido_paterno"cssClass="form-control" />
                </div> 
                </div>
                
                <div class="col-lg-4">
                <div class="form-group">
                    <form:label path="apellido_materno">Apellido Materno*</form:label> 
                    <form:input path="apellido_materno" name = "apellido_materno"cssClass="form-control" />
                </div>
                </div>
            </div>
            </div>
                
                    
            <div class="panel panel-info">
                <div class="panel-heading"><strong>Dirección</strong></div>
            <div class="panel-body">
            
                
                <div class="col-lg-4">
                <div class="form-group">
                    <form:label path="calle">Calle</form:label> 
                    <form:input path="calle" name = "calle"cssClass="form-control" />
                </div>
                </div>
                
                    
                
                <div class="col-lg-2">
                <div class="form-group">
                    <form:label path="numero">Número</form:label> 
                    <form:input path="numero"name = "numero" cssClass="form-control" />
                </div>
                </div>
                
                   
                
                 <div class="col-lg-4">
                 <div class="form-group">
                    <form:label path="colonia">Colonia</form:label> 
                    <form:input path="colonia" name = "colonia"cssClass="form-control" />
                 </div>
                 </div>
                    
                
                <div class="col-lg-2">
                <div class="form-group">
                    <form:label path="cp">C.P.</form:label> 
                    <form:input path="cp" name = "cp"cssClass="form-control" />
                </div>
                </div>
                <div class="col-lg-4">
                <div class="form-group">
                    <form:label path="id_municipio">Municipio*</form:label> 
                    <form:select path="id_municipio" name="id_municipio"cssClass="form-control">
                         <form:option value="0">Elegir.....</form:option>
                         <c:forEach items="${dato1}" var="datos1">
                         <form:option value="${datos1.id_municipio}">${datos1.nombre}</form:option>  
                         </c:forEach>   
                    </form:select>
                </div>
                </div>
            <div class="col-lg-4">
            <div class="form-group">    
                <form:label path="procedencia">Lugar de procedencia</form:label> 
                <form:input path="procedencia" name = "procedencia" cssClass="form-control" />
            </div>
            </div>
        </div>
        </div>  
            
                    
            <div class="panel panel-info">
                <div class="panel-heading"><strong>Contacto</strong></div>
            <div class="panel-body">
                   
                
                <div class="col-lg-4">
                <div class="form-group"> 
                    <form:label path="telefono">Telefono</form:label> 
                    <form:input path="telefono" name = "telefono"cssClass="form-control" />
                </div>
                </div>
                
                    
                
                <div class="col-lg-4">
                <div class="form-group">
                    <form:label path="celular">Celular</form:label> 
                    <form:input path="celular" name = "celular" cssClass="form-control" />
                </div>
                </div>
                
                
                
                <div class="col-lg-4">
                <div class="form-group">
                    <form:label path="correo">E-mail*</form:label> 
                    <form:input path="correo" name = "correo"cssClass="form-control" />
                </div>
                </div>
            </div>
            </div>
                
                    
            <div class="panel panel-info">
                <div class="panel-heading"><strong>Profesion</strong></div>
            <div class="panel-body">
                
                
                <div class="col-lg-6">
                <div class="form-group">
                    <form:label path="id_categoria">Categoria*</form:label>
                        <form:select path="id_categoria" name="id_categoria"cssClass="form-control">
                            <form:option value="0">Elegir.....</form:option> 
                            <c:forEach items="${dato3}" var="datos3">
                            <form:option value="${datos3.id_categoria}">${datos3.nombre}</form:option>
                             </c:forEach> 
                        </form:select>
                </div>
                </div>
                
            
                 
                <div class="col-lg-6">
                <div class="form-group">
                    <form:label path="id_profesion">Profesión*</form:label> 
                        <form:select path="id_profesion" name="id_profesion"cssClass="form-control">
                            <form:option value="0">Elegir.....</form:option> 
                            <c:forEach items="${dato4}" var="datos4">
                            <form:option value="${datos4.id_profesion}">${datos4.nombre}</form:option>
                            </c:forEach> 
                        </form:select>
                </div> 
                </div>        
                
                
                
                <div class="col-lg-4">
                <div class="form-group">
                    <form:label path="pagar">Costo*</form:label> 
                    <form:input path="pagar" name = "pagar" cssClass="form-control" />
                </div>
                </div>
                
                
                    <div class="col-lg-4">
                    <div class="form-group">
                    </div>
                    </div>
                
                
                <div class="col-lg-4">
                <div class="form-group">
                    <form:label path="otros">Otros</form:label> 
                    <form:select path="otros" name="nombre"cssClass="form-control">
                        <form:option value="0">Elegir.....</form:option> 
                        <form:options items="${tipoLista}" />
                    </form:select>
                </div>
                </div>
            </div>
            </div>
                
            
                
                    <div class="checkbox">
                <label>
                    <input type="checkbox" value="">
                    ¿Ha tomado algun congreso con nosotros?
                </label>
            </div>
            
                
                 <label>
                    Requiere factura
                 </label>
                        <div class="form-check form-check-inline">
                         <label class="">
                            <input class="form-check-input" type="checkbox" name="" value="option1" id="factura_0" onclick="">No
                         </label>
                             <input class="form-check-input" type="checkbox" name="" value="option2" id="factura_1" onclick="vistaFactura.htm">Si
                      
                        </div>
                  
                 <hr />
                <input type="submit" value="Enviar" class="btn btn-primary btn-lg btn-block" />
            </form:form>
        </div>
    </body>
</html>
