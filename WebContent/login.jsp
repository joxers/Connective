<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<%@ page import="org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter"%>
<%@ page import="org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter"%>
<%@ page import="org.springframework.security.core.AuthenticationException"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="j_spring_security_check" method="POST" >
            <label for="j_username">Username</label>
            <input type="text" name="j_username" id="j_username"/>
            <br/>
            <label for="j_password">Password</label>
            <input type="password" name="j_password" id="j_password" />
            <br/>
            <input type='checkbox' name='_spring_security_remember_me' /> Remember me on this computer.
            <br/>
            <input type="submit" value="Login" />
        </form>
        <hr>
              <%@ include file="menu.jsp" %>

    </body>
</html>