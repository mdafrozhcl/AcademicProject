<%-- 
    Document   : index
    Created on : Dec 10, 2014, 6:43:43 AM
    Author     : Afroz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body style="alignment-baseline: central">
    <center>
        <h1>Hello Students!</h1>
        <form name="loginform" action="login" method="post">
        <table>
            <tr><td>User:</td><td><input type="text" id="name" name="username"></td></tr>

            <tr><td>Password:</td><td><input type="password" id="pwd" name="password"></td></tr>
            <tr></tr>
            <tr><td></td><td> <input type="button" title="Login" id="login" value="Login"></td></tr>
        </table>
        </form>
    </center>
</body>
</html>
