<%-- 
    Document   : afterlogin
    Created on : Jun 18, 2019, 11:41:46 PM
    Author     : Los_e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
           prefix="springForm"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bootcamp home page</title>
    </head>
    <body>
        <h1>Successfully logged in as ${user.firstName} ${user.lastName}</h1>
    </body>
</html>
