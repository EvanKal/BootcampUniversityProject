<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
           prefix="springForm"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title>Bootcamp Log in</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <p>Please log in</p>
        <springForm:form method="POST" modelAttribute="trainer" action ="${pageContext.request.contextPath}/trainer/doaddtrainer">
            <table>
                <tr>
                    <td>Username</td>
                    <td><springForm:input path="trainerid" disabled="true"/></td> 
                    <!--<td><springForm:errors path="trainerid"/></td>--> 
                </tr>
                <tr>
                    <td>Password</td>
                    <td><springForm:input path="firstname"/></td> 
                    <!--<td><springForm:errors path="firstname"/></td>--> 
                </tr>
            </table>
            <input type="submit">
        </springForm:form>
    </body>
</html>
