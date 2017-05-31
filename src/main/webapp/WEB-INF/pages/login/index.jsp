<%@ include file = "../../layout/header.jsp" %>
<section class="container">
    <div class="container">
        <div class="container">
        <div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row"> 
                                                    </div>
                                                        <div class="col-xs-6">
								<h2>Login</h2>
							</div>
                                                        <div class="col-xs-6">
								<a href="#" id="register-form-link">Registrarse</a>
							</div>
					</div>
					<div class="panel-body">
						<div class="row">
                                                    <div class="col-lg-12">
                                                        <form:form action="j_spring_security_check"  method="post" name="f" >
                                                        
                                                                    <div class="form-group">
										<input type="text" name="j_nombre" id="username" tabindex="1" class="form-control" placeholder="Username" value="">
									</div>
									<div class="form-group">
										<input type="password" name="j_descripcion" id="password" tabindex="2" class="form-control" placeholder="Password">
									</div>
									<div class="form-group text-center">
										<input type="checkbox" tabindex="3" class="" name="remember" id="remember">
										<label for="remember"> Remember Me</label>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
                                                                                            <input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login"  value="Log In">
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<div class="text-center">
													<a href="http://phpoll.com/recover" tabindex="5" class="forgot-password">Forgot Password?</a>
												</div>
											</div>
										</div>
									</div>
                
                                                   
            </form:form>
        </div>
    
</html>

</section>
<%@ include file = "../../layout/footer.jsp" %>