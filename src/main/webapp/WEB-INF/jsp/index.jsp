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
        <p>${uri}</p>
        <p>Please log in</p>
        
        <c:if test="${wrongpassword}">
            <p>Wrong Password!!!</p>
        </c:if>
            
        <c:if test="${wrongusername}">
            <p>Wrong Username!!!</p>
        </c:if>
        <springForm:form method="post" modelAttribute="logintable" action ="${pageContext.request.contextPath}/login">
            <table>
                <tr>
                    <td>Username</td>
                    <td><springForm:input path="username"/></td> 
                    <!--<td><springForm:errors path="username"/></td>--> 
                </tr>
                <tr>
                    <td>Password</td>
                    <td><springForm:input path="passwordLog"/></td> 
                    <!--<td><springForm:errors path="passwordLog"/></td>--> 
                </tr>
            </table>
            <input type="submit">
        </springForm:form>
    </body>
</html>
