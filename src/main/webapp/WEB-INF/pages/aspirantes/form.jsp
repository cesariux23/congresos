<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file = "../../layout/header.jsp" %>
<section class="container">
    <h1 class="text-center">Registro de aspirante</h1>
    <form:form method="post" commandName="aspirante">
            <div class="panel panel-info">
                <div class="panel-heading"><strong>Congreso</strong></div>
            <div class="panel-body">
                <div class="row">
                    <div class="col-lg-8">
                        <div class="form-group">
                            <form:label path="idCongreso">Nombre de Congreso*</form:label> 
                            <form:select path="idCongreso" name="idCongreso"cssClass="form-control">
                                <form:option value="0" label="--- Seleccione ---"/>
                                <form:options items="${congresos}" itemValue="idCongreso" itemLabel="nombre"/>
                            </form:select>
                        </div>
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
                        <form:input path="nombre" name = "nombre" cssClass="form-control" placeholder="Nombre Completo" required="required" />
                    </div>
                </div>
                
                <div class="col-lg-4">
                    <div class="form-group">
                        <form:label path="apellidoPaterno">Apellido Paterno*</form:label> 
                        <form:input path="apellidoPaterno" name = "apellidoPaterno"cssClass="form-control" required="required"/>
                    </div> 
                </div>
                
                <div class="col-lg-4">
                    <div class="form-group">
                        <form:label path="apellidoMaterno">Apellido Materno*</form:label> 
                        <form:input path="apellidoMaterno" name = "apellidoMaterno"cssClass="form-control" required="required" />
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
                        <form:label path="estado">estado*</form:label> 
                        <form:select path="estado" name="estado" cssClass="form-control estado" id="edo1">
                            <form:option value="0" label="--- Seleccione ---"/>
                            <form:options items="${estados}" itemValue="idEstado" itemLabel="nombre"/>
                        </form:select>
                    </div>
                </div>
                
                <div class="col-lg-4">
                    <div class="form-group">
                        <form:label path="idMunicipio">Municipio*</form:label> 
                        <form:select path="idMunicipio" name="idMunicipio" cssClass="form-control" id="municipios_edo1" required="required">
                            <form:option value="0" label="--- Seleccione ---"/>
                            <form:options items="${municipios}" itemValue="idMunicipio" itemLabel="nombre"/>
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
                            <form:input path="correo" name = "correo"cssClass="form-control" required="required"/>
                        </div>
                    </div>
                </div>
            </div>
           
            <div class="panel panel-info">
                <div class="panel-heading"><strong>Profesión</strong></div>
                <div class="panel-body">
                    <div class="col-lg-6">
                        <div class="form-group">
                            <form:label path="idCategoria">Categoria*</form:label>
                            <form:select path="idCategoria" name="idCategoria"cssClass="form-control" required="required">
                                 <form:option value="0" label="--- Seleccione ---"/>
                                 <form:options items="${categoriaInscripcion}" itemValue="idCategoria" itemLabel="nombre"/>
                            </form:select>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="form-group">
                            <form:label path="idProfesion">Profesión*</form:label> 
                            <form:select path="idProfesion" name="idProfesion"cssClass="form-control" required="required">
                                <form:option value="0" label="--- Seleccione ---"/>
                                <form:options items="${profesion}" itemValue="idProfesion" itemLabel="nombre"/>
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
    
</section>
<script>
    // funcion para recuperar los municipios de cada estado
    $('.estado').on('change', function ( event){
        let lista=$( event.target );
        $.get('<c:url value="/" />getmunicipios',{idestado:lista.val()}, function(data) {
                var options = $("#municipios_edo1");
                options.empty();
                options.append($("<option />").val('').text('--- Seleccione ---'));
                $.each(data, function(id, item) {
                    options.append($("<option />").val(item.idMunicipio).text(item.nombre));
                });
            }
        );
    });
</script>
<%@ include file = "../../layout/footer.jsp" %>
