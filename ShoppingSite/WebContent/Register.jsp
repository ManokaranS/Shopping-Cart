<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="/WEB-INF/username.tld" prefix="servion" %>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Responsive Login Form</title>
  
    <link rel='stylesheet prefetch' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css'>

        <link rel="stylesheet" href="<c:url value="/resources/css/style.css"></c:url>">   
        <link href='http://fonts.googleapis.com/css?family=Ubuntu:500' rel='stylesheet' type='text/css'>
   
  </head>

  <body>


<div class="login">
  <div class="login-header">
<h3><servion:getText key="registerform"/></h3>
  </div>
  <div class="login-form">
   <form:form action="register" method="POST"  commandName="userbean">
    <h3><servion:getText key="username"/>:</h3>
    <form:input type="text" path="username" placeholder="Username"/><br>
    <h3><servion:getText key="password"/>:</h3>
    <form:password type="password" path="password" placeholder="Password"/>
    <br>
    <input type="submit" value="<servion:getText key="register"/>" class="login-button">
	</form:form>
    <br>
    <a class="sign-up">login</a>
    <br>
  </div>
</div>

    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>
  
  </body>
</html>
