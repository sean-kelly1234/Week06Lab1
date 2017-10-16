<%-- 
    Document   : Home
    Created on : Oct 2, 2017, 9:18:22 AM
    Author     : 642202
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div>
            <p>Hello ${user.user}</p>
            <a href="login?action=logout">Log Out</a>
        </div>
    </body>
</html>
