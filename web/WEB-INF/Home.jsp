<%-- 
    Document   : Home
    Created on : Oct 2, 2017, 9:18:22 AM
    Author     : 642202
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sait" uri="/WEB-INF/tlds/sait.tld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <sait:debug>
            Debug message: ${pageContext.request.remoteHost} <br>
            ${pageContext.session.id}, ${pageContext.session.creationTime} <br>
            ${pageContext.session.getAttribute('user').user}
        </sait:debug>
        <h1>Hello World!</h1>
        <div>
            <p>Hello ${user.user}</p>
            <a href="login?action=logout">Log Out</a>
        </div>
    </body>
</html>
