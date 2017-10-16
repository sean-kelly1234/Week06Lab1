<%-- 
    Document   : Login
    Created on : Oct 2, 2017, 8:39:12 AM
    Author     : 642202
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="login" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="sait" uri="/WEB-INF/tlds/sait.tld" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <sait:debug>
            Debug message
        </sait:debug>
        <h2>Login Page</h2>
        <login:login message="${message}"/>
    </body>
</html>
