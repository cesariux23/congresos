<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        
        <form name="f" action="<c:url value='/j_spring_security_check'/>"method='POST'>
        
         <form action="j_spring_security_check" method="post">
        user:<input type="text" name="j_username"/><br />
        password:<input type="password" name="j_password" />
        <input type="submit" value="Registro" />
    </form>
    </body>
</html>