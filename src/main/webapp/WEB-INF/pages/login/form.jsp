<%@ include file = "../../layout/header.jsp" %>
<section class="container">
     <div class="container">
             <div class="container">
                <div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
                                            <div class="row"></div> 
                                            <h1>Registro</h1>
        
                                                 <form:form  method="post" >
									<div class="form-group">
										<input type="text" name="usuario" id="usuario" tabindex="1" class="form-control" placeholder="Username" value="">
									</div>
									<div class="form-group">
										<input type="email" name="correo" id="correo" tabindex="1" class="form-control" placeholder="Email Address" value="">
									</div>
									<div class="form-group">
										<input type="password" name="contrasena" id="contrasena" tabindex="2" class="form-control" placeholder="Password">
									</div>
									<div class="form-group">
										<input type="password" name="confirm-contrasena" id="confirm-contrasena" tabindex="2" class="form-control" placeholder="Confirm Password">
									</div>
                                                                        <div class="form-group">
										<form:hidden path="id_tipo" name="id_tipo" value=""/>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Register Now">
											</div>
										</div>
									</div>
	
                               </form:form>
                            </div>
                        </div>
                    </div>
                </div>
             </div>
        </div>
    </body>
</html>

</section>
<%@ include file = "../../layout/footer.jsp" %>