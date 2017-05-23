<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <c:forEach items="${estados}" var="edo">
                <tr>
                    <td><c:out value="${edo.nombre}" /></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
