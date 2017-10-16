<%-- 
    Document   : login
    Created on : Oct 16, 2017, 8:12:42 AM
    Author     : 642202
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="message"%>


<%-- any content can be specified here e.g.: --%>
<form action="login" method="POST">
    Username: <input type="text" name="username" value="${cookie.username.value}"><br>
    Password: <input type="password" name="password"><br>
    Remember Me <input type ="checkbox" name="remember" <c:if test="${cookie.username != null}">
                     checked</c:if>><br>
    <input type="submit" value="Login"><br>
</form>
<c:if test="${message != null}">
    <p>${message}</p>
</c:if>